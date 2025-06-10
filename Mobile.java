// public class Mobile{
//     void iphone(){
//         System.out.println("Iphone costly");
//     }
//     void oppo(){
//         System.out.println("oppo da ngoppo");
//     }
//     void realme(){
//         System.out.println("realme da naaye");
//     }
//     void samsung(){
//         System.out.println("Samsung taan inga ppole");
//     }
//     public static void main(String args[]){
//         Mobile m1 = new Mobile();
//         m1.samsung();
//         m1.oppo();
//     }
// }
import java.util.Scanner;
// class Addition{
//     int a = 10;
//     int b = 4;
//     int sum(int c,int d){
//         return c+d;
//     }
//     public static void main(String args[])
//     {
//         Scanner scan = new Scanner(System.in);
//         Addition add1 = new Addition();
//         System.out.println("ENter first val :");
//         int a1 = scan.nextInt();
//         System.out.println("Enter sec");
//         int b1 = scan.nextInt();
//         int val = add1.sum(a1,b1);
//         System.out.println("The sum :"+val);
//         scan.close();
//     }
// }
// class Garden{
//     int apple_price = 20;
//     int apple_count = 5;
//     int total(){
//         // System.out.print("The total cost :"+apple_count*apple_price);
//         return apple_count*apple_price;

//     }
//     public static void main(String args[]){
//         Garden g1 = new Garden();
//         int total = g1.total();
//         System.out.print("Total cost :"+total);
//     }
// }

// class Details{
//     String getname(String name){
//         return name;
//     }
//     int getno(int num){
//         return num;
//     }
//     public static void main(String args[])
//     {
//         Scanner scan = new Scanner(System.in);
//         Details d1 = new Details();
//         System.out.print("Name:");
//         String n = scan.nextLine();
//         System.out.println("phone no :");
//         int p = scan.nextInt();
//         String name = d1.getname(n);
//         int phno = d1.getno(p);
//         System.out.print("Name : "+name+" "+"Phone num : "+phno);
//     }
// }

// class Find{
//     String even_or_odd(int num){
//         if(num%2==0){
//             return "even";
//         }
//         else{
//             return "odd";
//         }
//     }
//     public static void main(String args[])
//     {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter num :");
//         int n = scan.nextInt();
//         Find f1 = new Find();
//         String ans = f1.even_or_odd(n);
//         System.out.print("The number is :"+ans);
//     }
// }

// class School{
//     String check(int num){
//         if(num>=35){
//             return "pass";
//         }
//         else{
//             return "Fail";
//         }
//     }
//     public static void main(String args[])
//     {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter num :");
//         int n = scan.nextInt();
//         School s1 = new School();
//         String ans = s1.check(n);
//         System.out.print("The sttud is "+ans);
//     }
// }

// class Student{
//     int marks;
//     String name;
//     Student(int m,String a){
//         marks = m;
//         name = a;
//     }
//     public static void main(String args[])
//     {
//         Student s1 = new Student(12,"thmara");
//         System.out.print(s1.name);
//         Student s2 = new Student(14,"thandam");
//         System.out.print(s2.marks);
//     }
// }


// class Student {
//     private int marks;
//     private String name;

//     public Student(int marks, String name) {
//         this.marks = marks;
//         this.name = name;
//     }

//     public int getMarks() {
//         return marks;
//     }

//     public String getName() {
//         return name;
//     }

//     @Override
//     public String toString() {
//         return "Name: " + name + ", Marks: " + marks;
//     }
//     public static void main(String args[]) {
//         Student s1 = new Student(12, "Thamara");
//         Student s2 = new Student(14, "Thandam");
//         int mark = s1.getMarks();
//         System.out.print(mark);
//         System.out.println(s1);
//         System.out.println(s2);
//     }
// }


// class House{
//     String name;
//     int price;

//     House(String name,int price){
//         this.name = name;
//         this.price = price;
//     }
    
//     public static void main(String args[])
//     {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("name : ");
//         String a = scan.nextLine();
//         System.out.print("price :");
//         int b = scan.nextInt();
//         House h1 = new House(a,b);
//         System.out.println(h1.price);

//     }
// }
// class Teacher {
//     String name = "preethu";
//     int exp = 10;
// }

// class Student extends Teacher {
//     String name = "Yjnigga";
// }

// class MainOne {  
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         System.out.print(s1.name);
//         System.out.print(s1.exp);
//     }
// }
//Single Inheritance
// class Animal{
//     void eat(){
//         System.out.print("The animal can eat");
//     }
// }

// class Dog extends Animal{
//     void bark(){
//         System.out.print("bark");
//     }
// }

// class Mobile {
//     public static void main(String args[])
//     {
//         Dog d1 = new Dog();
//         d1.eat();
//         d1.bark();
//     }
// }
// // Multi-level inheritance
// class Animal{
//     void eat(){
//         System.out.println("The animal can eat");
//     }
// }

// class Dog extends Animal{
//     void bark(){
//         System.out.println("bark");
//     }
// }

// class Pomerian extends Dog{
//     void cute(){
//         System.out.println("Loooks so cute");
//     }
// }

// class Mobile {
//     public static void main(String args[])
//     {
//         Pomerian p1 = new Pomerian();
//         p1.eat();
//         p1.bark();
//         p1.cute();
//     }
// }
//Multiple inheritence solution
// interface A {
//     default void show() {
//         System.out.println("A");
//     }
// }

// interface B {
//     default void show() {
//         System.out.println("B");
//     }
// }

// class C implements A, B {
//     public void show() {
//         // Resolve conflict between A and B's show() methods
//         A.super.show(); // explicitly call A's show()
//         B.super.show(); // explicitly call B's show()
//         System.out.println("C");
//     }
// }

// public class Mobile {  
//     public static void main(String[] args) {
//         C obj = new C();
//         obj.show();
//     }
// }
// class Animal{
//     String name;
//     int age;
//     void makeSound(){
//         System.out.println("Animals make sound");
//     }
// }

// class Dog extends Animal{
//     String breed;
//     @Override
//     void makeSound(){
//         System.out.println("Dog barks");
//     }
//     void fetch(){
//         System.out.println("Dog is fetching");
//     }
// }
// class Cat extends Animal{
//     String color;

//     @Override
//     void makeSound(){
//         System.out.println("Cat meows");
//     }
//     void climb(){
//         System.out.println("Cat is climbing");
//     }
// }
// public class Mobile{
//     public static void main(String args[])
//     {
//         Dog d1 = new Dog();
//         d1.name ="subra";
//         d1.age = 9;
//         d1.breed = "pomo";
//         System.out.println(d1.name+" "+d1.age+" "+d1.breed);
//         d1.makeSound();
//         d1.fetch();
//         Cat c1 = new Cat();
//         c1.name = "sundar";
//         c1.age = 14;
//         c1.color = "green";
//         c1.makeSound();
//         c1.climb();
//     }
// }

// class Vehicle{
//     String brand;
//     int year;
//     void StartEngine(){
//         System.out.println("Vehicle engine starts");
//     }
// }

// class Car extends Vehicle{
//     String fueltype;
//     @Override
//     void StartEngine(){
//         System.out.println("Car engine starts");
//     }
//     void drive(){
//         System.out.println("Car drives");
//     }
// }

// class Truck extends Vehicle{
//     int loadCap;
//     @Override
//     void StartEngine(){
//         System.out.println("Truck engine starts");
//     }
//     void haul(){
//         System.out.println("Truck is hauling");
//     }
// }

// public class Mobile{
//     public static void main(String args[])
//     {
//         Truck t1 = new Truck();
//         t1.brand = "Ashok Lyelnd";
//         t1.year = 2018;
//         t1.loadCap = 500;
//         t1.StartEngine();
//         t1.haul();
//         Car c1 = new Car();
//         c1.StartEngine();
//         c1.brand = "Wolks";
//         c1.year = 2013;
//         c1.fueltype = "petrol";
//         c1.drive();
//         System.out.println(c1.fueltype);
//     }
// }

// class Animal{
//     String name = "kumar";
//     Animal(){
//         System.out.println("hello hello ");
//     }
//     void makeSound(){
//         System.out.println("Makesound cls");
//     }
// }

// class Dog extends Animal{
//     Dog(){
//         super();
//         System.out.println(super.name);
//         super.makeSound();
//         System.out.println("Dog oda bow");
//     }
// }

// public class Mobile {
//     public static void main(String args[])
//     {
//         Dog d1 = new Dog(); 
//     }
// }

// class Person{
//     String name;
//     Person(String name){
//         this.name = name;
//     }
// }

// class Employee extends Person{
//     int empid;
//     Employee(String name,int empid){
//         super(name);
//         this.empid = empid;
//     }
//     void display(){
//         System.out.println(this.name+" "+this.empid);
//     }
// }

// public class Mobile{
//     public static void main(String args[])
//     {
//         Employee emp = new Employee("tharun",12301);
//         emp.display();
//     }
// }
// Abstract class
// abstract class Vehicle{
//     String brand;
//     int year;
//     abstract void StartEngine();
        
// }

// class Car extends Vehicle{
//     String fueltype;

//     void StartEngine(){
//         System.out.println("car starts");
//     }
    
//     void drive(){
//         System.out.println("Car drives");
//     }
// }

// class Truck extends Vehicle{
//     int loadCap;
    
//     void StartEngine(){
//         System.out.println("truck starts");
//     }

//     void haul(){
//         System.out.println("Truck is hauling");
//     }
// }

// public class Mobile{
//     public static void main(String args[])
//     {
//         Truck t1 = new Truck();
//         t1.brand = "Ashok Lyelnd";
//         t1.year = 2018;
//         t1.loadCap = 500;
//         t1.StartEngine();
//         t1.haul();
//         Car c1 = new Car();
//         c1.StartEngine();
//         c1.brand = "Wolks";
//         c1.year = 2013;
//         c1.fueltype = "petrol";
//         c1.drive();
//         System.out.println(c1.fueltype);
//     }
// }
// class Student{
//     private int exp = 12;
//     int display(){
//         return exp;
//     }
// }

// public class Mobile{
//     public static void main(String args[])
//     {
//         Student s1 = new Student();
//         int val = s1.display();
//         System.out.print(val);
//     }
// }

// public class Mobile{
//     public static void main(String args[])
//     {
//         Hotel h1 = new Hotel();
//         System.out.print(h1.name);
//     }
// }

// static
// class Dhoni{
//     static String name;
//     static void role(){
//         System.out.println("Bowler");
//     }
// }
// public class Mobile{
//     static{
//         System.out.println("static");
//     }
//     public static void main(String args[])
//     {
//         // Dhoni d1 = new Dhoni();
//         // Dhoni d2 = new Dhoni();
//         // d2.name = "Irfan Pathan";
//         // System.out.println(d1.name+" "+d2.name);
//         // Dhoni.role();
//         Mobile m1 = new Mobile();
//         System.out.println("first");
//         Mobile m2 = new Mobile();
//         System.out.println("sec");
//     }
// }
//Final
// class one{
//     final void func(){
//         System.out.println("one");
//     }
// }
// class two extends one{
//     // @Override
//     // void func(){
//     //     System.out.println("rwo");
//     // }
// }
// public class Mobile{
//     public static void main(String args[])
//     {
//         two t1 = new two();
//         t1.func();

//     }
// }