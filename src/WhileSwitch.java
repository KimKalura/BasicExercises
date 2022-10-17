import java.util.Scanner;

public class WhileSwitch {

public static void main(String[] args) {

//1. Write a program that receives a number (between 1 and 5) from the keyboard and prints the corresponding day of the week.

        /*Scanner console = new Scanner(System.in);
        int day;
        System.out.println("Enter day number: ");
        day = console.nextInt();

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else {
            System.out.println("Weekend");
        }*/

//2. Write a program that prints the factorial of a number read from the keyboard.
// Example: int n = 4; the console will display the value 24 (1 * 2 * 3 * 4)

        /*Scanner console = new Scanner(System.in);
        int n;
        System.out.println("Enter a number to find the factorial:");
        n = console.nextInt();
        long fact = 1;
        int i = 1;

        while (i <= n) {
            fact = fact * i;
            i++;
        }
        System.out.println("The factorial of the number " + n + " is: " + fact);*/

//3. Write a program to calculate the sum of the digits of a number read from the keyboard.
//Example: int n = 123; the console will display the value 6 (1 + 2 + 3)

       /* Scanner console = new Scanner(System.in);
        int n;
        System.out.println("Enter a number to find out its sum");
        n = console.nextInt();
        int i;
        int sum = 0;

        while (0 < n) {
            i = n % 10;
            sum = sum + i;
            n = n / 10;
        }
        System.out.println("The sum of the number is " + sum);*/

//4. Write a program that calculates the sum of numbers divisible by 3 and the sum of numbers divisible by 7 in the interval [1, n], n being entered by the user from the keyboard.
//Example: int n = 21; two values will be printed in the console: 84 (3 + 6 + 9 + 12 + 15 + 18 + 21) and 42 (7 + 14 + 21)

        /*Scanner console = new Scanner(System.in);
        int n;
        System.out.println("Find the sum of numbers divisible by 3 and the sum of numbers divisible by 7:");
        n = console.nextInt();
        int i = 0;
        int sum1 = 0;
        int sum2 = 0;

        while (i <= n) {
            if (i % 3 == 0) {
                sum1 = sum1 + i;
            }

            if (i % 7 == 0) {
                sum2 = sum2 + i;
            }
            i++;
        }
        System.out.println(sum1);
        System.out.println(sum2);*/

//5.It implements a "guessing game", which asks the user to enter a number from the keyboard until he guesses the correct one, i.e. the answer.
//The answer will be generated randomly and can be a number between 1 and 10.
//--If the number entered by the user is greater than the answer, "The number entered is too large" will be displayed in the console.
//--If the entered number is smaller than the answer, the console "The entered number is too small" will be displayed.
//--The procedure is repeated (the user must keep entering numbers), until the entered number is the same as the answer, at which point it is printed in the console
//"You guessed, it took you x attempts", where x is the number of attempts on which the user did until he guessed the answer.
//**To generate a random number between 1 and 10 and store it in the answer variable, write the following lines of code:
//  Random random = new Random();
//  int answer = random.nextInt(10) + 1;

        /*Random random = new Random();
        int answer = random.nextInt(10) + 1;
        System.out.println("Enter a number between 1 to 10");

        int n = 0;
        int sum = 1;
        while (answer != n) {
            Scanner console = new Scanner(System.in);
            n = console.nextInt();

            if (answer < n) {
                System.out.println("The number entered is too large");
            } else if (answer > n) {
                System.out.println("The number entered is too small");
            } else {
                System.out.println("you guessed it, it took you " + sum + " tries.");
            }
            sum = sum + 1;
        }*/

//6.Write a program to print the first n numbers in the Fibonacci sequence.
// Eample: int n = 7; the numbers 0 1 1 2 3 5 8 will be displayed in the console

        /*int n = 7;
        int num1 = 0;
        int num2 = 1;

        System.out.print("The first " + n + " numbers in the Fibonacci sequence are: ");
        int i = 1;
        while (i <= n) {
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            i++;
        }*/

//7.Write a program in which the user enters numbers from the keyboard one by one, until he enters
// the value 0, at which point the average of all entered numbers will be displayed on the console

        /*Scanner console = new Scanner(System.in);
        int n = 1;
        System.out.print("Enter a number: ");
        int sum = 0;
        while (n > 0) {
            n = console.nextInt();
            System.out.println("the entered number is " + n);
            sum = sum + n;
        }
        System.out.println("The sum of the entered numbers is " + sum);*/

//8. Write a program that prints in the console a rectangle consisting of the "#" symbol, depending on the length and width given by the user

       /* public static void printRectangle ( int height, int width){
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }
        }*/

        /*int height = 3;
        int width = 4;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("#");
            }
            System.out.println();
        }*/
    }
}
