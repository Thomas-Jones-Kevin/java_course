// public class Hotel{
//     int coffee = 15;
//     int tea = 10;
//     public static void main(String args[])
//     {
//         Hotel h1 = new Hotel();
//         System.out.println(h1.coffee);
//         System.out.println(h1.tea);
//     }
// }

// class Phone{

//     String brand = "fdkn";
//     String model = "";
//     int price = 0;
//     String fun(){
//         return "fucntion 1 ";
//     }
//     String secf(){
//         String f1 = fun();
//         System.out.println(f1);
//         return "hello";
//     }
//     static void some(){
//         System.out.println("\ni love you");
//     }
//     static String check(){
//         return "gouthann";
//     }
//     public static void main(String args[])
//     {
//         Phone p1 = new Phone();
//         p1.brand = "Redmi";
//         p1.model = "Note-9";
//         p1.price = 17000;
//         System.out.println(p1.brand+" "+p1.model+" "+p1.price);

//         Phone p2 = new Phone();
//         p2.brand = "Iphone";
//         p2.model = "16 Pro max";
//         p2.price = 150000;
//         System.out.println(p2.brand+" "+p2.model+" "+p2.price);
//         //p2.fun();
//         String out = p2.secf();
//         System.out.print(out);
//         some();
//         System.out.println(check());
//     }    

// }

// class Hotel{
//     String name = "saravana bhavana";
// }

//Coding challenge -> 1
// class Person{
//     public String name;
//     protected int age;
//     private int ssn;
//     String address;
    
//     Person(String name,int age,int ssn,String address){
//         this.name = name;
//         this.age = age;
//         this.ssn = ssn;
//         this.address = address;
//     }

//     int getSsn(){
//         return this.ssn;
//     }
// }

// class Employee extends Person{
//     String extra;
//     Employee(String name,int age,int ssn,String address,String extra){
//         super(name,age,ssn,address);
//         this.extra = extra;
//     }

// }

// public class Hotel{
//     public static void main(String args[])
//     {
//         Employee e1 = new Employee("thomas",123,14144,"ambattur","hello da ngotha");
//         System.out.println(e1.name);
//         System.out.println(e1.age);
//         //System.out.println(e1.ssn);
//         System.out.println(e1.address);
//         int val = e1.getSsn(); //do this to get the private var value
//         System.out.println(val);
//     }
// }

// Coding challenge -> 2
// class Counter {
//     static int count;
//     int instance_no;
//     Counter(){
//         count++;
//         instance_no++;
//         System.out.println("Count :"+count+"   "+"Instance-No :"+instance_no);
//     }
// }

// public class Hotel{
//     public static void main(String args[])
//     {
//         Counter c1 = new Counter();
//         Counter c2 = new Counter();
//         Counter c3 = new Counter();

//     }
// }

//Coding challenge -> 3
// final class and final variable cannot be inherited and modified respectively
// final class ConstantValues{
//     final double pi = 3.14;
// }

// class ConsOVer extends ConstantValues{
    
// }

// public class Hotel{
//     public static void main(String args[])
//     {
//         ConsOVer c1 = new ConsOVer();
//         //c1.pi = 34;
//         System.out.println(c1.pi);
//     }
// }

//Coding challenge -> 4
// abstract class Animal{
//     String name;
//     int age;
//     Animal(String name,int age){
//         this.name = name;
//         this.age = age;
//     }
//     abstract void makeSound();
// }

// class Dog extends Animal{
//     String breed;
//     Dog(String name,int age,String breed){
//         super(name,age);
//         this.breed = breed;
//     }
//     @Override
//     public String toString(){
//         return "ithu oru naiyuu athathu"+name;
//     }
//     void makeSound(){
//         System.out.println("Dog class");
//     }
// }

// class Cat extends Animal{
//     String eyes;
//     Cat(String name,int age,String eyes){
//         super(name,age);
//         this.eyes = eyes;
//     }
//     void makeSound(){
//         System.out.println("Cat class");
//     }
// }

// public class Hotel{
//     public static void main(String args[])
//     {
//         Dog d1 = new Dog("tom",12,"labo");
//         System.out.println(d1);
//         d1.makeSound();
//         Cat c1 = new Cat("subra",14,"blue");
//         c1.makeSound();
//     }
// }

//Coding challenge -> 5
// Abstract base class
// abstract class Vehicle {
//     String mode;

//     Vehicle(String mode) {
//         this.mode = mode;
//     }

//     final void startEngine() {
//         System.out.println("Engine started");
//     }

//     // Instance method – returns the vehicle's mode/type
//     String getVehicleType() {
//         return this.mode;
//     }

//     // Abstract method
//     abstract void drive();
// }

// // Car class extending Vehicle
// class Car extends Vehicle {
//     Car(String mode) {
//         super(mode);
//     }

//     @Override
//     void drive() {
//         System.out.println("Car drives on " + getVehicleType());
//     }
// }

// // Bus class extending Vehicle
// class Bus extends Vehicle {
//     Bus(String mode) {
//         super(mode);
//     }

//     @Override
//     void drive() {
//         System.out.println("Bus rolls on " + getVehicleType());
//     }
// }

// // Driver class with main()
// public class Hotel {
//     public static void main(String[] args) {
//         Car c1 = new Car("land");
//         c1.startEngine();
//         c1.drive();
//         System.out.println("Vehicle type: " + c1.getVehicleType());

//         System.out.println();

//         Bus b1 = new Bus("terrestrial");
//         b1.startEngine();
//         b1.drive();
//         System.out.println("Vehicle type: " + b1.getVehicleType());
//     }
// }

//Interfaces
// interface Animal{
//     String name = "hello"; // public static final String name;
//     void makeSound(); // it is taken as abstract method

//     default void display(){
//         System.out.println(name);
//     }
// }

// class Dog implements Animal{
//     @Override
//     public void makeSound(){
//         System.out.println("bowww");
//     }
// }

// public class Hotel{
//     public static void main(String args[])
//     {
//         Dog d1 = new Dog();
//         d1.makeSound();
//         System.out.println(d1.name);
//         d1.display();

//     }
// }

// Interface coding challenge -> 1
// interface Playable{
//     void play();
// }

// class Guitar implements Playable{
//     @Override
//     public void play(){
//         System.out.println("Playing Guitar");
//     }
// }

// class Piano implements Playable{
//     @Override
//     public void play(){
//         System.out.println("Playing piano");
//     }
// }

// public class Hotel{
//     public static void main(String args[])
//     {
//         Guitar g1 = new Guitar();
//         g1.play();
//         Piano p1 = new Piano();
//         p1.play();

//     }
// }

// interface Readable{
//     void read();
// }

// interface Writable{
//     void write();
// }

// interface Storable{
//     void store();
// }

// class File implements Readable,Writable,Storable{
//     @Override
//     public void read(){
//         System.out.println("read");
//     }
    
//     @Override
//     public void write(){
//         System.out.println("write");
//     }

//     @Override
//     public void store(){
//         System.out.println("store");
//     }
// }

// public class Hotel{
//     public static void main(String args[])
//     {
//         File f1 = new File();
//         f1.read();
//         f1.write();
//         f1.store();
//     }
// }


// // Interface 1: Controllable
// interface Controllable {
//     void turnOn();
//     void turnOff();
// }

// // Interface 2: Monitorable
// interface Monitorable {
//     void showStatus();
// }

// // Interface 3: Configurable
// interface Configurable {
//     void setBrightness(int level);
//     void setColor(String color);
// }

// // Class implementing all interfaces
// public class Hotel implements Controllable, Monitorable, Configurable {
//     private String name;
//     private boolean isOn;
//     private int brightness; // 0 to 100
//     private String color;

//     // Constructor
//     public Hotel(String name) {
//         this.name = name;
//         this.isOn = false;
//         this.brightness = 50; // default
//         this.color = "White"; // default
//     }

//     // Implementation of Controllable
//     @Override
//     public void turnOn() {
//         isOn = true;
//         System.out.println(this.name + " is turned ON.");
//     }

//     @Override
//     public void turnOff() {
//         isOn = false;
//         System.out.println(name + " is turned OFF.");
//     }

//     // Implementation of Monitorable
//     @Override
//     public void showStatus() {
//         System.out.println("Status of " + name + ":");
//         System.out.println("  Power: " + (isOn ? "ON" : "OFF"));
//         System.out.println("  Brightness: " + brightness + "%");
//         System.out.println("  Color: " + color);
//     }

//     // Implementation of Configurable
//     @Override
//     public void setBrightness(int level) {
//         if (level >= 0 && level <= 100) {
//             brightness = level;
//             System.out.println(name + " brightness set to " + level + "%.");
//         } else {
//             System.out.println("Invalid brightness value.");
//         }
//     }

//     @Override
//     public void setColor(String color) {
//         this.color = color;
//         System.out.println(name + " color set to " + color + ".");
//     }
//     public static void main(String args[]){
//         Hotel h1 = new Hotel("thomad");
//         h1.turnOn();
//         h1.setColor("grey");
//     }
// }


// interface Engine {
//     int power = 12;
//     // by default: public static final
//     void startEngine();
// }

// interface MusicSystem {
//     String brand = "ehe" ;
//     void playMusic();
// }

// class Car implements Engine, MusicSystem {
//     String model;
//     Car(String model) {
//         this.model = model;
//     }

//     public void startEngine() {
//         System.out.println(this.model + " engine started with power: " + Engine.power + " HP");
//     }

//     public void playMusic() {
//         System.out.println("Playing music using " + MusicSystem.brand + " system");
//     }

//     void showDetails() {
//         System.out.println("Model: " + this.model);
//     }
// }

// public class Hotel {
//     public static void main(String[] args) {
//         Car myCar = new Car("zxr");
//         myCar.showDetails();
//         myCar.startEngine();
//         myCar.playMusic();
//     }
// }

// class Hotel{
//     int age = 12;
//     //System.out.println(age);
//     public static void main(String args[])
//     {
//         Hotel h1 = new Hotel();
//         System.out.println(h1.age);
//     }
// }

// interface A{
//     void disp();
// }
// public class Hotel{
//     public static void main(String args[])
//     {
//         A a1 = new A(){
//             public void disp(){
//                 System.out.print("adango");
//             }
//         };
//         // A a1 = ()->{System.out.println("hello da");};
//         a1.disp();
//     }
// }


import java.util.Scanner;
interface A{
    int age = 12;
    void disname(String name);
}

public class Hotel{
    public static void main(String args[]){
        // Scanner scan = new Scanner(System.in);
        // String name = scan.nextLine();
        // A a1 = (String name)->System.out.println("kaavala ulla "+name);
        A a1 = new A(){
            public void disname(String name){
                System.out.println("check da otha "+name+"van age:"+A.age);
            }
        };
        a1.disname("jones");
    }
}

