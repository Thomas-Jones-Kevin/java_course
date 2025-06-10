import java.util.Scanner;
import java.util.InputMismatchException;
//Arithmetic exception error
// public class Excep_handle{
//     public static void main(String args[])
//     {
//         Scanner scan = new Scanner(System.in);
//         int val = scan.nextInt();
//         try{
//             int ans = val/0;
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//         System.out.println("code ends");
//     }
// }

//InputMismatch exception
// public class Excep_handle{
//     public static void main(String args[])
//     {
//         Scanner scan = new Scanner(System.in);
//         try{
//             boolean val = scan.nextBoolean();
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//         System.out.println("code ends");
//     }
// }
// public class Excep_handle{
//     public static void main(String args[])
//     {
//         Scanner scan = new Scanner(System.in);
//         try{
//             int val = scan.nextInt();
//             int ans = 2/0;
//             System.out.println("worked");
//         }
//         catch(ArithmeticException e){
//             System.out.println("ohohohohjjj");
//         }
//         System.out.println("code ends");
//     }
// }

// public class Excep_handle{
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         int a,b,c;
//         int err = 0;
//         try{
//             System.out.print("ENter a :");
//             a = scan.nextInt();
//             System.out.print("Enter b:");
//             b = scan.nextInt();
//             c = a/b;
//         }
//         // catch(Exception e){
//         //     System.out.println(e);
//         // }
//         catch(InputMismatchException e){
//             System.out.println("Enter the right input value");
//             err = 1;
//         }
//         catch(ArithmeticException e){
//             System.out.println("Cannot divide by 0");
//             err=1;
//         }
//         finally{
//             if(err==1){
//                 System.out.println("idgaf");
//             }
//             else{
//                 System.out.println("no eror pa");
//             }
//         }
//     }
// }

//Throw keyword
// public class Excep_handle{
//     public static void main(String args[])
//     {
//         Scanner scan = new Scanner(System.in);
//         try{
//             int age = scan.nextInt();
//             if(age<=0){
//                 throw new ArithmeticException("age should be 1 or more");
//             }
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }

//Custom error handling
// class NonValidException extends Exception{
//     public NonValidException(String something){
//         super(something);
//     }
// }
// public class Excep_handle{
//     public static void main(String args[])
//     {
//         Scanner scan = new Scanner(System.in);
//         try{
//             int age = scan.nextInt();
//             if(age<=0){
//                 throw new NonValidException("age should be more");
//             }
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }

//Coding challenge -> 1
// class DivisionExample{
//     void divide(int num,int den){
//         int res = 0;
//         try{
//             res = num/den;
//             System.out.println(res);
//         }
//         catch(ArithmeticException e){
//             System.out.print(e+":"+"Cannot divide by zero");
//         }
//     }
// }

// public class Excep_handle{
//     public static void main(String args[])
//     {
//         DivisionExample d1 = new DivisionExample();
//         d1.divide(0,3);
//     }
// }

//Coding challenge -> 2
// class InvalidAgeException extends Exception{
//     public InvalidAgeException(String txt){
//         super(txt);
//     }
// }

// public class Excep_handle{
//     void checkAge(int age){
//         try{
//             if(age<=0 || age>150){
//                 throw new InvalidAgeException("age is invalid");
//             }
//             else{
//                 System.out.println(age+"is valid");
//             }
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
//     public static void main(String args[])
//     {
//         Excep_handle e1 = new Excep_handle();
//         Scanner scan = new Scanner(System.in);
//         System.out.print("ENter age :");
//         int age = scan.nextInt();
//         e1.checkAge(age);

//     }
// }

//Throws
// class Calc{
//     void divide(int a,int b) throws Exception{
//         int res = a/b;
//         System.out.println(res);
//     }
// }

// public class Excep_handle{
//     public static void main(String args[])
//     {
//         Calc c1 = new Calc();
//         try{
//             c1.divide(4,0);
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }

// }

