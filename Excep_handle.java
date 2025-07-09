import java.util.Scanner;
import java.util.InputMismatchException;
// Arithmetic exception error
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
//             //int val = scan.nextInt();
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
//             System.out.println("valid age");
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
//         d1.divide(3,0);
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
//             System.out.print(e);
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
import java.util.Scanner;
import java.util.*;
public class Excep_handle{
    int[] arr = new int[15];
    int second(int[] arr){
        int num = arr[0];
        int num1 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>num){
                num1 = num;
                num = arr[i];
            }
            else if(num1<arr[i] && arr[i]<num){
                num1 = arr[i];
            }
            else{
                continue;
            }
        }
        if(num1!=0){
            return num1;
        }
        else{
            return -1;
        }
    }

    List<String> count(int[] arr){
        List<String> list = new ArrayList<>();
        boolean[] visited = new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(visited[i]) continue;
            int count = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j] = true;
                }
            }
            String ans = String.format("count of %d is %d",arr[i],count);
            list.add(ans);
        }
        return list;
    }

    int missing(int arr[]){
        int res = arr.length;
        for(int i=0;i<arr.length;i++){
            res+=i-arr[i];
        }
        return res;
    }

    int missing_xor(int[] arr){
        int res = arr.length;
        for(int i:arr){
            res^=i;
        }
        return res;
    }

    int this_miss(int[] arr){
        int len = arr.length+1;
        int actual = 0;
        int sum = 0;
        for(int i=1;i<=len;i++){
            actual+=i;
        }
        for(int i:arr){
            sum+=i;
        }
        return actual-sum;
    }

    public static void main(String args[]){
        Excep_handle e1 = new Excep_handle();
        Scanner scan = new Scanner(System.in);
        // System.out.print("Enter length :");
        // int n = scan.nextInt();
        // int[] arr = new int[n];
        // for(int i=0;i<arr.length;i++){
        //     int val = scan.nextInt();
        //     arr[i] = val;
        // }
        //int ans = e1.second(arr);
        //System.out.println("The second largest : "+ans);

        // int[] arr1 = {1,1,2,4,2,1,5};
        // List<String> ans = e1.count(arr1);
        // System.out.println(ans);

        // int[] arr = {0,1,2,4};
        // int miss = e1.missing_xor(arr);
        // System.out.println(miss);

        int[] arr = {7, 5, 6, 1, 4, 2};
        int ans = e1.this_miss(arr);
        System.out.println(ans);
    }
}
