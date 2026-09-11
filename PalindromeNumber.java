//Ex.1]
/* public class Practice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Name :");
        String name = s.next();
        System.out.println("Enter the Age :");
        int age = s.nextInt();
        System.out.println("Enter your Address :");
        s.nextLine();
        String loc = s.nextLine();
        System.out.println("Enter your Gender :");
        String gen = s.next();
        System.out.println("Enter your Mobile number :");
        long phno = s.nextLong();
        System.out.println(name);
        System.out.println(age);
        System.out.println(loc);
        System.out.println(gen);
        System.out.println(phno);
    }
}
 */
//Ex.2] Check if a number is Prime

/* import java.util.Scanner;

public class PrimeCheck{
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i = 2; i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(isPrime(num)){
            System.out.println(num+" is a prime number");
        }else{
            System.out.println(num+" is not a prime number");
        }
        sc.close();
    }
}
 */
//Ex.3] Print Prime Numbers from 1 to N

/* import java.util.Scanner;

public class PrimeCheck{
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2 ; i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Print prime numbers from 1 to "+num);
        for(int i =1; i<=num;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
 */
//Ex.4] Print prime numbers within specific/ given range from (number1)to(number2):
//prime numbers from 50 to N
/* import java.util.Scanner;

public class PrimeCheck{
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2 ; i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Print prime numbers from 50 to "+num);
        for(int i =50; i<=num;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
} */
//Ex.5] Generate Fibonacci Series upto 'n' terms : Using iterative approach

/* import java.util.Scanner;

public class FibonacciExample{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms :");
        int n = sc.nextInt();
        System.out.println("Fibonacci series upto "+n+" terms is :");

        long firstTerm = 0;
        long secondTerm = 1;

        for(int i =1;i<=n;++i ){
            //Current term
            System.out.print(firstTerm+" ");

            //Calculate the nextTerm by adding the previous two
            long nextTerm = firstTerm + secondTerm ;
            //Shift the variables for the next iteration
            firstTerm = secondTerm ;
            secondTerm = nextTerm ;
        }
        sc.close();
    }  
} */
//Ex.6] Check if a number is Palindrome number or not: Reversing an integer and checking if it matches the original input.

import java.util.Scanner;

public class PalindromeNumber{
    public static boolean isPalindrome(int num){
        if(num<0){
            return false;
        }
        long originalNumber = num;
        long reversedNumber = 0;

        while(num != 0){
            int lastDigit = num % 10;

            reversedNumber = (reversedNumber *10)+lastDigit;

            num = num/10;
        }
        return originalNumber == reversedNumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // num = 121;
        if(isPalindrome(num)){
            System.out.println(num+ " is a Palindrome number");
        }else{
            System.out.println(num+ " is not a Palindrome number");
        }
        sc.close() ;
    }
}


