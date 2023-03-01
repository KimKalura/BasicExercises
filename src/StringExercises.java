import java.util.Scanner;

public class StringExercises {

    public static void main(String[] args) {
        //ex 1
        isPalindrom();

        //ex 2
        count("Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");

        //ex 4
        isPasswordValid();

        //ex 5
        checkPassword();
    }

// 1. Write a program to check whether a word is a palindrome or not.(Example: ana - palindrome, mama - it is not palindrom
    public static void isPalindrom() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a word to check if it is a palindrome or not: ");
        String word = console.nextLine();
        boolean isPalindrom = false;
        String reversedString = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedString = reversedString + word.charAt(i);
        }
        if (word.equals(reversedString)) {
            isPalindrom = true;
            System.out.println("The word entered is a palindrome.");
        } else {
            System.out.println("The word entered is not a palindrome.");
        }
    }

//2.Write a program to count letters, spaces, numbers, and other characters in a String.
//(Example: pentru “Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33” => 23 letters, 9 spaces, 8 numbers, 6 other characters
    public static void count(String phrase) {
        char[] ch = phrase.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;

        for (int i = 0; i < phrase.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                num++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else {
                other++;
            }
        }
        System.out.println(letter + " letters");
        System.out.println(space + " spaces");
        System.out.println(num + " numbers");
        System.out.println(other + " other characters");
    }

//4.You are developing the part of creating a new account in an online store and you must validate that the password chosen by the user is written
// correctly. Write a program to check if a password is correct. The rules for a password to be correct are:
//     //a) the password must have at least 10 characters
//     //b) the password must have only letters or numbers
//     //c) the password must contain at least two digits
// If the entered password is not valid, it prints a suggestive message and allows the user to enter another password, until he enters a valid password (follow the rules).
    public static boolean isPasswordValid() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the password: ");
        String password = console.nextLine();
        int countDigits = 0;

        if (password.length() < 10) {
            System.out.println("The password is too short");
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            if (!(Character.isLetter(password.charAt(i)) || Character.isDigit(password.charAt(i)))) {
                System.out.println("The password must have only letters or numbers");
                return false;
            }
            if (Character.isDigit(password.charAt(i))) {
                countDigits++;
            }
        }
        if (countDigits < 2) {
            System.out.println("The password must contains at least 2 digits");
            return false;
        }
        System.out.println("Your password is accepted");
        return true;
    }

//5.Write a program to read the user's password from the keyboard, a maximum of 3 times. The entered password is verified with an existing password
//(declare a string variable that holds the existing, correct password) and prints a corresponding message:
//"Account blocked", if you enter the wrong password 3 times
//"You have logged in", if you enter the password correctly in a maximum of 3 attempts
    public static void checkPassword() {
        String existingPassword = "ABC";
        boolean isCorrectPassword = false;
        int i = 1;
        while ((i <= 3) && (!isCorrectPassword)) {
            Scanner console = new Scanner(System.in);
            System.out.println("Enter the password: ");
            String providedPassword = console.nextLine();
            if (existingPassword.equals(providedPassword)) {
                System.out.println("You have logged in");
                isCorrectPassword = true;
            }
            i++;
        }
        if (isCorrectPassword == false) {
            System.out.println("Incorect password.Account blocked");
        }
    }

}
