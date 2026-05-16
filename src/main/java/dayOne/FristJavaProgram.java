package dayOne;

public class FristJavaProgram {
    public static void main (String[] args)
    {
        System.out.println("hello world ");

//        System.out.println("hello world ");

        String FirstName = "Shaimaa";
        String x = "2 + 2";
        System.out.println(x);


        String X = "10";
        String Y = "15";
        System.out.println(X+ Y);


        int s = 1;
        int c = 2;
        System.out.println(s+c);
        System.out.println( "Sum of s and c is : "+ (s + c));


        float f = 12.33f;
        System.out.println(f);

        double d = 55;
        double l = 55.05;
        System.out.println(d);
        System.out.println(l);


        String firstname ="Shaimaa ";
        String lastname = "Nabih";

        String fullname = firstname + lastname;
        int age = 22;
        String dateOfBirth ="20/7/2003";
        String job = "Test Engineer";
        double income =10.5 ;
        double tax = income * 0.15 ;
        double netSalary = income - tax ;

//      print
        System.out.println("hello my name is :" + fullname +
                "\nmy age is : " +age+
                "\nmy jop is : " +job+
                "\nmy income is : " +netSalary );


        System.out.println("_______________________");
        System.out.printf("hello my name is : %s%n"
        +"my age is : %d%n"
        + "my job is : %s%n"
        +"my income is : %f%n" ,
              fullname, age , job , netSalary  );

    }

}
