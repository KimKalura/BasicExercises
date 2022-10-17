import java.util.Scanner;

public class For {

    public static void main(String[] args) {

//1.Write a program that print the average of consecutive numbers from x to y, where x and y are entered from the keyboard.
// Input: x=3, y=5 => Result: 4.

        /*Scanner console = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int x = console.nextInt();
        int y = console.nextInt();
        int sum = 0;

        for (int i = x; i <= y; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of the numbers is: " + sum);

        int averageSum = 0;
        averageSum = sum / 3;
        System.out.println("The average of the numbers is: " + averageSum);*/

//2.Write a program that prints all the numbers from x to y that are divisible by both 3 and 7 at the same time, where x and y are entered from the keyboard.
// Input: x=1, y=22 => Result: 21

        /*Scanner console = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int x = console.nextInt();
        int y = console.nextInt();
        System.out.println("The numbers are: ");
        for (int i = x; i <= y; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }*/

//3.Write a program that checks if a number entered from the keyboard is a prime number.
// Input: x=7 => Result: "7 is a prime number". Input data: x=12 => Result: "12 is not a prime number".

        /*Scanner console = new Scanner(System.in);
        int n;
        System.out.println("Enter a number: ");
        n = console.nextInt();
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }

        if (count == 0) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }*/

//4.Write a program that calculates x to the power of y, where x and y are entered from the keyboard.
//Input: x=2, y=3 => Result: 8.

        /*Scanner console = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int x = console.nextInt();
        int y = console.nextInt();
        int pow = 1;

        for (int i = 0; i < y; i++) {
            pow = pow * x;
        }
        System.out.println(pow);*/

//5.You are a programmer and you develop an online store. You need to calculate the total price of the products in the shopping cart, to print it to the user.
// Write a program to print the sum of prices from a price list.
// Input: int[] prices = {1, 7, 3, 10, 9}=> Result: 30

        /*int[] prices = {1, 7, 3, 10, 9};
        int sum = 0;
        System.out.println("The total price of the products is: ");

        for (int i = 0; i < prices.length; i++) {
            sum = sum + prices[i];
        }
        System.out.println(sum);*/

//6.You are a programmer and you develop an online store. You need to calculate the highest and lowest price from a list of prices to print them to the user.
// Write a program to determine the largest and smallest number in a list.
// Input: int[] prices = {1, 7, 3, 10, 9}, => Result: "The lowest price is 1, and the highest price is 10".

       /* int[] prices = {1, 7, 3, 10, 9};
        int min = prices[0];
        int max = prices[0];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (prices[i] > max) {
                max = prices[i];
            }
        }
        System.out.println("The lowest price is: " + min);
        System.out.println("The highest price is: " + max);*/

//7.Write a program that prints how many even numbers and how many odd numbers are in an array:
//Input: int[] prices = {1, 7, 3, 10, 9} => Result: "4 odd numbers and 1 even number".

        /*int[] prices = {1, 7, 3, 10, 9};
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < prices.length; i++) {
            if ((prices[i] % 2) == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println(countEven + " even number");
        System.out.println(countOdd + " odd numbers");*/


//8.You are a programmer and you develop an online store. You want to give the user the possibility to see the list of products from up to down/ .
// Write a program to invert the elements of an array and print them in the console.
// Input: int[] prices = {1, 7, 3, 10, 9} => Result: 9, 10, 3, 7, 1

        /*int[] prices = {1, 7, 3, 10, 9};
        for (int i = prices.length - 1; i >= 0; i--) {
            System.out.print(prices[i] + " ");
        }*/

//9.You are a programmer and you develop an online store. You want to show the user which is the closest price (from a price list) to the user's budget.
// Write a program that prints the closest element in the array to a number entered from the keyboard, n. If there are several equally close numbers, any of them is displayed.
// Input: int[] prices = {1, 7, 3, 10, 9, 18, 0}; int n=12 => Result: 10
// Input: int[] prices = {1, 7, 3, 10, 9, 18, 0}; int n=5 => Result: 7 or 3

        /*Scanner console = new Scanner(System.in);
        System.out.println("Enter a price: ");

        int n = console.nextInt();
        int[] prices = {1, 7, 3, 10, 9, 18, 0};
        int min = Integer.MAX_VALUE;
        int positionOfMin = 0;
        for (int i = 0; i < prices.length; i++) {
            if (Math.abs(n - prices[i]) < min) {
                min = Math.abs(n - prices[i]);
                positionOfMin = i;
            }
        }
        System.out.println("The closest price is: " + prices[positionOfMin]);*/

//10.You are a programmer and you are developing a quiz application. The questions of a quiz have only one answer option, which is a letter.
// Your task is to check how many correct answers the user gave, having at your disposal both the list of correct answers and the list of answers given by the user.
// Input:  char[] correctAnswers = {‘C’, ‘A’, ‘B’, ‘A’, ‘B’};
//           char[] usersAnswers = {‘C’, ‘B’, ‘B’, ‘C’, ‘B’}. Result: 3

        /*char[] correctAnswers = {'C', 'A', 'B', 'A', 'B'};
        char[] usersAnswers = {'C', 'B', 'B', 'B', 'B'};

        int points = 0;
        for (int i = 0; i < usersAnswers.length; i++) {
            if(usersAnswers[i] == correctAnswers[i]) {
                points = points + 1;
            }
        }
        System.out.println("There are " + points + " correct answers.");*/

//11. Write a program that prints the product of 2 consecutive numbers from the array. If the number of elements is odd, the last product will be the number itself.
// Input: int[] prices = {1, 7, 3, 10, 9} => Result: 7, 30, 9. Explanation: (7 = 1*7, 30 = 3*10, 9 = 1*9 )

        /*int[] prices = {1, 7, 3, 10, 9};
        int prod;
        int lastNo = prices[prices.length - 1];

        for (int i = 0; i < prices.length - 1; i += 2) {
            prod = prices[i] * prices[i + 1];
            if (prices.length % 2 == 1 && i == prices.length - 3) {
                System.out.print(" " + prod + " " + lastNo + " ");
            } else {
                System.out.print(prod);
            }
        }*/
    }
}
