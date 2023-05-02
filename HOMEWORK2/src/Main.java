import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Q1
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("fizz" + " ");}
            if (i % 5 == 0) {
                System.out.println("BUZZ" + " ");
            } else if (i % 15 == 0) {
                System.out.println("BUZZFizz" + " ");}
            else {
                System.out.println(i + "");
            }
        }
        //q2
        Scanner obj = new Scanner(System.in);
        System.out.println("input a string:");
        char[] cArray = obj.nextLine().toCharArray();
        System.out.println("Reverse string:");
        for (int i = cArray.length - 1; i >= 0; i--) {

            System.out.print(cArray[i]);
        }
        System.out.print("\n");
        //
        ///
        //Q3
        Scanner number = new Scanner(System.in);
        System.out.println("input a number?");
        int num = number.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + (num * i) + "\n");
        }

        //
        //
        //Q4
        Scanner innum = new Scanner(System.in);
        System.out.print("Enter any positive integer: ");
        int inmun = 1, numb;
        num = innum.nextInt();
        for (int i = 1; i <= num; i++) {
            inmun *= i;
            System.out.println("answr" + inmun);
        }


        ///
        ///
        ///Q5
        Scanner in = new Scanner(System.in);
        System.out.println("entar a number1");
        int num1= in.nextInt();
        System.out.println("entar a number2");
        int num2= in.nextInt();
        for(int g=1;g<=num2;g++);
        num1*=num1;
        System.out.println(num1);

        //
        ///
        ///Q6
        Scanner console = new Scanner(System.in);
        int number3;
        char choice;
        int even = 0;
        int odd = 0;
        do
        {System.out.print("Enter any number ");
            number3 = in.nextInt();
            if( number3 % 2 == 0)
            {
                even+=number3;
            }
            else {
                odd+= number3;}
            System.out.print("Do you want to continue y/n? ");
            choice=in.next().charAt(0);
        }while(choice=='y' || choice == 'Y');
        System.out.println("even number:"+even);
        System.out.println("oDD number:"+odd);

        //
        ///
        ///Q7
        int first;
        boolean isPrime = true;
        Scanner real = new Scanner(System.in);
        System.out.println("any number:");
        int num12 = real.nextInt();
        real.close();
        for (int i = 2; i <= num1 / 2; i++) {
            first = num1 % i;
            if (first == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(num1 + " is a Prime Number");
        else
            System.out.println(num1 + " is not a Prime Number");

        ///
        //
        //Q8
        Scanner POSNEG = new Scanner(System.in);
        int number2, countPositive = 0, countNegative = 0, countZero = 0;
        char ch;
        do {
            System.out.print("Enter the number ");
            number2 = POSNEG.nextInt();
            if (number2 > 0) {
                countPositive++;
            } else if (number2 < 0) {
                countNegative++;
            } else {
                countZero++;
            }
            System.out.print("Do you want to continue?");
            ch=POSNEG.next().charAt(0);
        } while (ch=='Y'||ch=='0');
        System.out.println("Positive numbers:"+countPositive);
        System.out.println("Negative numbers:"+countNegative);
        System.out.println("Zero numbers:"+countZero);
        ///
        ///
        ///
        ///9
        for (int i = 1; i <= 4; i++) {
            System.out.println("weak " + i);
            for (int j = 1; j <= 7; j++)
                System.out.println("day " + j);
        }
        ///
        //
        ///Q10
        String obj2,reverse = "";
        Scanner on=new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        obj2=in.nextLine();
        int length=obj2.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse=reverse + obj2.charAt(i);
        if (obj2.equals(reverse))
            System.out.println("Entered string or number is a palindrome.");
        else
            System.out.println("Entered string or number is not a palindrome.");
    }
}