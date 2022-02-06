import java.util.Scanner;

public class Main {
  Scanner sc = new Scanner(System.in);

  // function to checkPalindrome
  public void checkPalindrome() {
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    int temp = number;
    int palindrome = 0;
    while (temp > 0) {
      palindrome = palindrome * 10 + temp % 10;
      temp /= 10;
    }
    if (palindrome == number) {
      System.out.println("The given number is palindromic.\n\n");
    } else {
      System.out.println("The given number is not a palindromic.\n\n");
    }
  }

  // function to printPattern
  public void printPattern() {
    System.out.print("Enter the height of the reverse triangle in number: ");
    int number = sc.nextInt();
    for (int i = number; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  // function to check no is prime or not
  public void checkPrimeNumber() {
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    boolean isPrime = true;
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        isPrime = false;
        break;
      }
    }

    if (isPrime && number != 1) {
      System.out.println("Given number is a prime number.\n");
    } else {
      System.out.println("Given number is not a prime number.\n");
    }
  }

  // function to print Fibonacci Series
  public void printFibonacciSeries() {
    // initialize the first and second value as 0,1 respectively.
    int first = 0, second = 1;
    System.out.print("Enter the length of Fibonacci Series: ");
    int length = sc.nextInt();
    System.out.print("Fibonacci Series: " + first + " " + second);
    for (int i = 3; i <= length; i++) {
      int next = first + second;
      System.out.print(" " + next);
      first = second;
      second = next;
    }
    System.out.println("\n");
  }

  // main method which contains switch and do while loop
  public static void main(String[] args) {
    Main obj = new Main();
    int choice;
    // Scanner sc = new Scanner(System.in);
    do {
      System.out.println("Enter your choice from below list.\n"
          + "1. Find palindrome of number.\n"
          + "2. Print Pattern for a given no.\n"
          + "3. Check whether the no is a  prime number.\n"
          + "4. Print Fibonacci series.\n"
          + "--> Enter 0 to Exit.\n");

      System.out.println();
      choice = obj.sc.nextInt();

      switch (choice) {
        case 0:
          break;
        case 1:
          obj.checkPalindrome();
          break;
        case 2:
          obj.printPattern();
          break;
        case 3:
          obj.checkPrimeNumber();
          break;
        case 4:
          obj.printFibonacciSeries();
          break;
        default:
          System.out.println("Invalid choice. Enter a valid no.\n");
      }
    } while (choice != 0);

    System.out.println("Exited Successfully!!!");
    obj.sc.close();
  }
}