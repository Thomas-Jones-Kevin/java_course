import java.util.Scanner;
class test {
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        // String a = "apple";
        // String b = new String("apple");
        // boolean tom = scan.nextBoolean();
        // int age = scan.nextInt();
        // if (age>=18){
        //     System.out.print("true");
        // }
        // else {
        //     System.out.print("false");
        // }
        // String rcb = scan.nextLine();
        // if(rcb.equals("win")){
        //     System.out.print("maja pa ");
        // }
        // else{
        //     System.out.print("oombungada");
        // }
        int eng = scan.nextInt();
        int tam = scan.nextInt();
        int maths = scan.nextInt();
        int sci = scan.nextInt();
        int soc = scan.nextInt();
        int total;
        double avg;
        total = eng+tam+maths+sci+soc;
        avg = total/5;
        if(avg<35){
            System.out.print("Additional cls required");
        }
        else{
            System.out.print("good to go");
        }
        // System.out.print("Enter the color : ");
        // String color = scan.nextLine();
        // if(color.equals("red")||color.equals("RED")){
        //     System.out.print("Stop");
        // }
        // else if(color.equals("yellow")||color.equals("YELLOW")){
        //     System.out.print("wait");
        // }
        // else if(color.equals("green")||color.equals("GREEN")) {
        //     System.out.print("Go");
        // }
        // int age = scan.nextInt();
        // String val;
        // val = age>=18? "vote":"no-vote";
        // System.out.print(val);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        String res = num1<num2? "num2 greater" : "num1 greater";
        System.out.print(res);
        // int salary = scan.nextInt();
        // if(salary>=20000||age<=25){
        //     System.out.print("Eligible for loan");
        //     System.out.print("Enter the loan amt :");
        //     int loan_amt = scan.nextInt();
        //     if(loan_amt<=50000){
        //         System.out.print("loan given");
        //     }
        //     else{
        //         System.out.print("Maximum loan amt is 50000");
        //     }
        // }
        // else{
        //     System.out.print("Not eligible for loan");
        // }
        

        // if(mark>70){
        //     System.out.print(mark+ " is a great mark");
        // }
        // else if(mark>=50 &&mark<=70){
        //     System.out.print(mark+ " is quite a good mark");
        // }
        // else {
        //     System.out.print(mark+" is a fail mark");
        // }
        // int num = scan.nextInt();
        // if(num%2==0){
        //     System.out.print(num+" is even");
        // }
        // else {
        //     System.out.print(num+" is odd");
        // }
        // if (num%3==0 || num%5==0){
        //     System.out.print("yes");
        // }
        // else {
        //     System.out.print("no");
        // }
        // int num = scan.nextInt();
        // if(num>0){
        //     System.out.print("Positive num");
        // }
        // else if(num<0){
        //     System.out.print("Negative num");
        // }
        // else{
        //     System.out.print("zero");
        // }
    }
}

public class conditionals{
    public static void main(String[] args)
    {
        int var = 2;
        switch(var){
            case 1:
                System.out.print("one");
                break;
            case 2:
                System.out.print("two");
                break;
            default:
                System.out.print("def");
        }
    }
}