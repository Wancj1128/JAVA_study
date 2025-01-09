package cn.edu.cqust.classdesign.data;

public class product {

    private String pname;
    private String pbrand;
    private String pmodel;
    private String pnumber;
    private String pprice;
    private String pcompany_name;
    private String plocation;
    private String ptel_number;
    private String pContact_people;

    public product() {
    }

    public product(String pname, String pbrand, String pmodel, String pnumber, String pprice, String pcompany_name, String plocation, String ptel_number, String pcontact_people) {
        this.pname = pname;
        this.pbrand = pbrand;
        this.pmodel = pmodel;
        this.pnumber = pnumber;
        this.pprice = pprice;
        this.pcompany_name = pcompany_name;
        this.plocation = plocation;
        this.ptel_number = ptel_number;
        this.pContact_people = pcontact_people;
    }

    public String getName() {
        return pname;
    }

    public void setName(String pname) {
        this.pname = pname;
    }

    public String getBrand() {
        return pbrand;
    }

    public void setBrand(String pbrand) {
        this.pbrand = pbrand;
    }

    public String getModel() {
        return pmodel;
    }

    public void setModel(String pmodel) {
        this.pmodel = pmodel;
    }

    public String getNumber() {
        return pnumber;
    }

    public void setNumber(String pnumber) {
        this.pnumber = pnumber;
    }

    public String getPrice() {
        return pprice;
    }

    public void setPrice(String pprice) {
        this.pprice = pprice;
    }

    public String getCompany_name() {
        return pcompany_name;
    }

    public void setCompany_name(String pcompany_name) {
        this.pcompany_name = pcompany_name;
    }

    public String getLocation() {
        return plocation;
    }

    public void setLocation(String plocation) {
        this.plocation = plocation;
    }

    public String getTel_number() {
        return ptel_number;
    }

    public void setTel_number(String ptel_number) {
        this.ptel_number = ptel_number;
    }

    public String getContact_people() {
        return pContact_people;
    }

    public void setContact_people(String pcontact_people) {
        pContact_people = pcontact_people;
    }

    public String toString() {
        return pname + " " + pbrand + " " + pmodel + " " + pnumber + " " + pprice + " " + pcompany_name + " " + plocation + " " + ptel_number + " " + pContact_people;
    }
}
