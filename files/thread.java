// class A extends Thread{
//     public void run(){
//         for(int i=1;i<=10;i++){
//             System.out.println("A");
//         }
//     }
// }

// class B extends Thread{
//     public void run(){
//         for(int i=0;i<=10;i++){
//             System.out.println("B");
//         }
//     }
// }

// public class thread{
//     public static void main(String args[])
//     {
//         A a1 = new A();
//         B b1 = new B();
//         a1.start();
//         b1.start();
//     }
// }

// class A extends Thread {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println("A");
//             try {
//                 Thread.sleep(10);  // Delay to allow other thread to run
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

// class B extends Thread {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println("B");
//             try {
//                 Thread.sleep(10);  // Delay to allow other thread to run
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

// public class thread {
//     public static void main(String[] args) {
//         A a1 = new A();
//         B b1 = new B();
//         a1.start();
//         b1.start();
//     }
// }

// class A extends Thread {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println("Thread A");
//         }
//     }
// }

// class B extends Thread {
//     public void run() {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println("Thread B");
//         }
//     }
// }

// public class thread {
//     public static void main(String[] args) {
//         A a1 = new A();
//         B b1 = new B();

//         // Set priorities (1 to 10)
//         a1.setPriority(Thread.MIN_PRIORITY);  // Priority 1
//         b1.setPriority(Thread.MAX_PRIORITY);  // Priority 10

//         // Print priorities to check
//         System.out.println("A's Priority: " + a1.getPriority());
//         System.out.println("B's Priority: " + b1.getPriority());

//         a1.start();
//         b1.start();
//     }
// }

//join()
// class A extends Thread{
//     int val = 50;
//     public void run(){
//         val = 32;
//     }
// }

// public class thread{
//     public static void main(String args[])
//     {
//         A a1 = new A();
//         a1.start();
//         try{
//             a1.join();
//         }
//         catch(InterruptedException e){
//             e.printStackTrace();
//         }
//         System.out.println(a1.val);
//     }
// }
//Runnable
class A implements Runnable{
    public void run(){
        System.out.println("A");
    }
}

public class thread{
    public static void main(String args[])
    {
        A a1 = new A();
        Thread t1 = new Thread(a1);
        t1.start();
    }
}