import java.util.Scanner;

public class Methods_Functions {

    public static void main(String[] args) {
        //ex 1
        System.out.println("The sum of the two numbers is: " + calculateSum(66, 28));

        //ex 2
        System.out.println("The smallest number in the sequence is: " + findSmallest(784, 394, 985));

        //ex 3
        System.out.println(findOddEven());

        //ex 4
        System.out.println(getMonth());
    }

//1.Write a method to return the sum of two numbers. Then call it and prints the value returned by the function
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

//2.Write a method to return the smallest number of any 3 numbers.
    public static int findSmallest(int a, int b, int c) {
        int smallest;
        if (a < b && a < c) {
            smallest = a;
        } else if (b < c) {
            smallest = b;
        } else {
            smallest = c;
        }
        return smallest;
    }

//3.Write a method that returns whether a number is even or not.
    public static boolean findOddEven() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = console.nextInt();

        boolean isEven;
        if (n % 2 == 0) {
            isEven = true;
            System.out.println("The number is even");
        } else {
            isEven = false;
            System.out.println("The number is not even");
        }
        return isEven;
    }

//4.Write a method to convert from a number (from 1 to 12) to its corresponding month.
    public static String getMonth() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number to find the month:");
        int n = console.nextInt();

        switch (n) {
            case 1:
                return "January";
            case 2:
                return "February ";
            case 3:
                return "March ";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June ";
            case 7:
                return "July ";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "invalid number";
        }
    }

}
