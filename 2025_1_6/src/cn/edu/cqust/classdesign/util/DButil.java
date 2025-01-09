package cn.edu.cqust.classdesign.util;

import cn.edu.cqust.classdesign.Main;
import cn.edu.cqust.classdesign.data.User;
import cn.edu.cqust.classdesign.data.product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DButil {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_data", "root", "Wcjkgshdh1128");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static boolean login(String username, String password, boolean choose) throws SQLException {
        Connection conn = getConnection();
        Statement stmt = conn.createStatement();
        String sql;
        if (choose) {
            sql = "select * from user WHERE level = 1";
        } else {
            sql = "select * from user WHERE level = 0";
        }
        ResultSet rs = stmt.executeQuery(sql);
        boolean flag = false;

        while (rs.next()) {
            if (rs.getString("password").equals(password)
                    && rs.getString("uname").equals(username)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static boolean register(User user) throws SQLException {
        Connection conn = getConnection();
        PreparedStatement pstmt = conn.prepareStatement("insert into user(uname, password, tel, level) values(?,?,?,?)");
        pstmt.setString(1, user.getUname());
        pstmt.setString(2, user.getPassword());
        pstmt.setString(3, user.getTel());
        pstmt.setBoolean(4, user.getLevel());
        int row = pstmt.executeUpdate();
        return row > 0;
    }

    public static void add(product p) {
        Connection conn = getConnection();
        try {
            PreparedStatement pstmt = conn.prepareStatement("insert into product(耗材名称, 品牌, 型号, 数量, 价格, 供应商公司名, 地址, 联系电话, 联系人) values(?,?,?,?,?,?,?,?,?)");
            pstmt.setString(1, p.getName());
            pstmt.setString(2, p.getBrand());
            pstmt.setString(3, p.getModel());
            pstmt.setString(4, p.getNumber());
            pstmt.setString(5, p.getPrice());
            pstmt.setString(6, p.getCompany_name());
            pstmt.setString(7, p.getLocation());
            pstmt.setString(8, p.getTel_number());
            pstmt.setString(9, p.getContact_people());
            int i = pstmt.executeUpdate();
            if (i > 0) {
                Main.changeview("view/productsuccess.fxml");
            } else {
                System.out.println("用户添加失败！");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean is_in(String model) {
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            String sql = "select 型号 from product";
            ResultSet rs = stmt.executeQuery(sql);
            boolean flag = false;
            while (rs.next()) {
                if (rs.getString("型号").equals(model)) {
                    flag = true;
                    break;
                }
            }
            return flag;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void del_Product(String model) {
        try {
            Connection conn = getConnection();
            String sql = "DELETE FROM product WHERE 型号 = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, model);
            int i = pstmt.executeUpdate();
            if (i > 0) {
                Main.changeview("view/ProductSuccess.fxml");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void update_product(product p, String model) {
        Connection conn = getConnection();
        try {
            PreparedStatement pstmt = conn.prepareStatement("""
            UPDATE product
            SET 耗材名称 = ?, 品牌 = ?, 型号 = ?, 价格 = ?, 供应商公司名 = ?, 地址 = ?, 供应商公司名 = ?, 联系电话 = ?, 联系人 = ?
            WHERE 型号 = ?
        """);
            pstmt.setString(1, p.getName());
            pstmt.setString(2, p.getBrand());
            pstmt.setString(3, p.getModel());
            pstmt.setString(4, p.getNumber());
            pstmt.setString(5, p.getPrice());
            pstmt.setString(6, p.getCompany_name());
            pstmt.setString(7, p.getLocation());
            pstmt.setString(8, p.getTel_number());
            pstmt.setString(9, p.getContact_people());
            pstmt.setString(10, model);
            int i = pstmt.executeUpdate();
            if (i > 0) {
                Main.changeview("view/ProductSuccess.fxml");
            } else {
                Main.changeview("view/main.fxml");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<product> readData() {
        List<product> result = new ArrayList<>();
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from product");
            while (rs.next()) {
                product product = new product();
                product.setName(rs.getString("耗材名称"));
                product.setBrand(rs.getString("品牌"));
                product.setModel(rs.getString("型号"));
                product.setNumber(rs.getString("数量"));
                product.setPrice(rs.getString("价格"));
                product.setCompany_name(rs.getString("供应商公司名"));
                product.setLocation(rs.getString("地址"));
                product.setTel_number(rs.getString("联系电话"));
                product.setContact_people(rs.getString("联系人"));
                result.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    /////////////////////////////////////

    public static List<User> readUser() {
        List<User> result = new ArrayList<>();
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from user WHERE level = 0");
            while (rs.next()) {
                User user = new User();
                user.setUname(rs.getString("uname"));
                user.setPassword(rs.getString("password"));
                user.setTel(rs.getString("tel"));
                result.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void update_user(User user, String username) {
        try {
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement("""
                UPDATE user
                SET password=?, tel=?
                WHERE uname = ?
                """);
            pstmt.setString(1, user.getPassword());
            pstmt.setString(2, user.getTel());
            pstmt.setString(3, username);
            int i = pstmt.executeUpdate();
            if (i > 0) {
                Main.changeview("view/usersuccess.fxml");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void del_user(String username) {
        try {
            Connection conn = getConnection();
            PreparedStatement pstmt;
            String sql = "delete from user where uname = ? and level = 0";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            if (pstmt.executeUpdate() > 0) {
                Main.changeview("view/usersuccess.fxml");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static boolean user_isin(String username) {
        boolean flag = false;
        try {
            Connection conn = getConnection();
            String sql = "select uname from user WHERE level = 0";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                if (rs.getString("uname").equals(username)) {
                    flag = true;
                    break;
                }
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;
    }
}
