public class Main
{
    public static void main(String[] args)
    {
        int num1 = 6;
        int num2 = 5;

        if(num1 == num2)
        {
            System.out.println(num1 + " and " + num2 +  " are equal");
        }
        else if (num2 > num1)
        {
            System.out.println(num1 + " is less than " + num2);
        } else if (num1 > num2)
        {
            System.out.println(num2 + " is less than " + num1);
        }
        else
        {
            System.out.println(num1 + num2 + " are not proper numbers please terminate and try again");
        }
    }
}