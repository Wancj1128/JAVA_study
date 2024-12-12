
public class one {
    public static void main(String[] args) {
        double BMI = 0;

        
        if (BMI < 18.5)
            System.out.println("此人的体重偏轻");
        else if (BMI > 18.5 && BMI < 25.0)
            System.out.println("此人的体重正常");
        else if (BMI > 25.0 && BMI < 30)
            System.out.println("此人偏重");
        else
            System.out.println("此人超重");
    }
}

