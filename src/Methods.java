import java.util.Scanner;


public class Methods
{
    static int add(int x, int y)
    {
       int z = x + y;
       return z;
    }

    static int sub(int x, int y)
    {
        int z = x - y;
        return z;
    }
    static int mul(int x, int y)
    {
        int z = x * y;
        return z;
    }
    static int div(int x, int y)
    {
        int z = x / y;
        return z;
    }
    static int mod(int x, int y)
    {
        int z = x % y;
        return z;
    }

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter x value");
        int x = obj.nextInt();
        System.out.println("Enter y value");
        int y = obj.nextInt();

        int z = add(x, y);
        System.out.println("Addition of two number is " + z);
        z = sub(x, y);
        System.out.println("Subtraction of two number is " + z);
        z = mul(x, y);
        System.out.println("multiplication of two number is " + z);
        z = div(x, y);
        System.out.println("Divition of two number is " + z);
        z = mod(x, y);
        System.out.println("Modulo of two number is " + z);

    }
}

