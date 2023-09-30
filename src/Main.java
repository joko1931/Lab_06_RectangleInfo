import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double length = 0;
        double width = 0;
        String trash = "";
        boolean lengthDone = false;
        boolean widthDone = false;

        do
        {
            System.out.println("Enter length: ");
            if (in.hasNextInt())
            {
                length = in.nextInt();
                lengthDone = true;
                do
                {
                    System.out.println("Enter width: ");
                    if(in.hasNextInt())
                    {
                        width = in.nextInt();
                        widthDone = true;
                        double area = length * width;
                        double perimeter =  length + length + width + width;
                        double pythagoreanTheorem = (length * length) + (width * width);
                        System.out.println("The area of the rectangle is " + area);
                        System.out.println("The perimeter of the rectangle is " + perimeter);
                        System.out.println("The diagonal of the rectangle is " + Math.sqrt(pythagoreanTheorem));
                    }
                }while(!widthDone);
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Please enter valid value, not " + trash);
            }
        }while(!lengthDone);

    }
}