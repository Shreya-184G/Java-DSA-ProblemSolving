
//[1] To print solid rectangle
/*
public class Patterns {
    public static void main(String[] args) {
        int n = 7;//no. of rows
        int m = 9;//no. of columns

        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=m ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

//[2] To print hollow rectangle
/* 
public class Patterns{
    public static void main(String[] args){
        int m = 6;
        int n = 5;

        for(int i = 1;i<=m;i++){
            for(int j = 1; j<=n; j++){
                if(i==1||j==1 ||i==m ||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
*/

//[3] Half Pyramid Pattern
/* 
public class Patterns{
    public static void main(String[] args) {
        int n = 6;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

//[4] Inverted Half Pyramid
/* 
public class Patterns{
    public static void main(String[] args) {
        int n = 4;
        for(int i = n; i>=1; i--){
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

//[5] Inverted Half Pyramid(rotated by 180 degree)
/* 
public class Patterns{
    public static void main(String[] args) {
        int n = 8;
        for(int i = 1; i<=n ; i++){
            //inner loop -> print space
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");

            }
            //inner loop -> print stars
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

//[6] Half Pyramid with Numbers
/* 
import java.util.*;

public class Patterns{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
*/

//[7] Inverted Half Pyramid with numbers
/* 
public class Patterns{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
*/

//[8] Floyd's Triangle
/* 
public class Patterns{
    public static void main(String[] args){
       int n = 5;
       int number = 1;

       for(int i = 1; i<= n ;i++){
        for(int j = 1; j<=i ; j++){
            System.out.print(number);
            
        }
       }
    }
}
*/

//[9] 0-1 Triangle
/* 
public class Patterns{
    public static void main(String[] args){
        int n = 5;

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i ; j++){
                int sum = i+j;
                if(sum % 2 ==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
*/

//Advanced Pattern Problems

//[1] Butterfly Pattern
/* 
import java.util.*;

public class Patterns{
    public static void main(String[] args){
        int n = 8;//number of rows

        for(int i = 1; i<=n; i++){
            //Upper half 
            for(int j = 1; j<=i;j++){
                //1st part stars
                System.out.print("*");
            }
            //spaces
            int spaces = 2*(n-i);
            for(int j = 1; j<=spaces ;j++){
                //spaces
                System.out.print(" ");
            }
            //lower half
            for(int j = 1; j<=i;j++){
                //2nd part stars
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i>=1; i--){
            //Lower half stars
            for(int j = 1; j<=i;j++){
                //1st part stars
                System.out.print("*");
            }
            //spaces
            int spaces = 2*(n-i);
            for(int j = 1; j<=spaces ;j++){
                //spaces
                System.out.print(" ");
            }
            //lower half
            for(int j = 1; j<=i;j++){
                //2nd part stars
                System.out.print("*");
            }
            System.out.println();
        }  
    }
}
*/
//[2] Solid Rhombus
/* 
public class Patterns{
    public static void main(String[] args){
        int n = 5;
        for(int i = 1; i<=n ; i++){
            //spaces
            for(int j = 1 ; j <=n-i ;j++ ){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j<=5 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
//[3] Number Pyramid
/* 
public class Patterns{
    public static void main(String[] args){
        int n = 5;

        for(int i = 1; i <=n ; i++){
            //spaces
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }

            //Print row no.;row no. times
            for(int j = 1 ; j<=i ; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
*/

//[4] Palindromic Pattern
/* 
import java.util.*;

public class Patterns{
    public static void main(String[] args){
        int n = 5;

        for(int i = 1 ; i <=n ; i++){
            //spaces
            for(int j = 1; j<=n-i ; j++){
                System.out.print(" ");
            }
            //back loop 
            for(int j = i; j>=1 ; j--){
                System.out.print(j);
            }
            //forward loop
            for(int j = 2 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
*/

//[5] Diamond Pattern

public class Patterns{
    public static void main(String[] args){
        int n = 4;
        for(int i =1; i<=n;i++){
            //spaces
            for(int j = 1; j <=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1;j <=2*i-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =n; i>=1;i--){
            //spaces
            for(int j = 1; j <=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1;j <= 2*i-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}