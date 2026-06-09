package day2;

public class Operators {
    static void main(String[] args) {

        int x = 10;
        int y = 20;

        System.out.println(x == y);
        System.out.println(x = y);
        System.out.println("x = " + x);

        System.out.println(x == y); //false, now = true

        double a = 15.0;
        int b = 15;
        System.out.println(a == b);
        System.out.println(a != b);


        int c = 25;
        System.out.println("The value of c = " + c); //25
        int d = 25;
        System.out.println("The sum of c and d = " + c + b);
        c = c + 5;
        c += 5;
        System.out.println(c);
        c = c - 5;
        c -= 5;
        System.out.println("The sub of c - 5 = " + c);
        c = c * 5;
        c *= 5;
        System.out.println("The multi of c * 5 = " + c);
        c = c / 5;
        c /= 5;
        System.out.println("The div of c / 5 = " + c);

        int e = 21;
        int r = 2;
        System.out.println(e % r) ;

        int n = 7;
        int m = 5;
        int a1 = 7;
        int b1 = 7;


        System.out.println(n > m);

        System.out.println(n < m);

        System.out.println(n == m);

        System.out.println(n >= m);

        System.out.println(n <= m);

        // Logical Operators •> Unary and Binary

        boolean v1 = true;
        boolean v2 = false;
        System.out.println(v1 && v2); // AND
        System.out.println(v2 || v2); // or

        System.out.println(a> b && b < c);
        System.out.println(a > b && b > c);
        System.out.println(a > b || d > a);
        System.out.println(a <= b || d >= a);


        int abdi = 20;
        int almi = 15;
        boolean tamioz = true;

        if(abdi >= almi && tamioz)
        {
            System.out.println("ادخل علمي ");
        }
        else
        {
            System.out.println("ادخل ادبي");
        }

        int num = 10;
        System.out .println(num++);
        System.out.println(num);

        System.out.println(++num);
        int number = 5;
        System.out.println(number++);
        System.out.println(number);
        System.out.println(++number);
        int j = 18, k = 10, l;
        l =(j > k)? j : k ;
        System.out.println( "The Largest value is :" + l);
        if(j > k)
            l =j;
        else
            l = k;

    }

}


