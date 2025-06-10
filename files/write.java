import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
//usual write
// public class write{
//     public static void main(String args[])
//     {
//         try{
//             FileWriter fw = new FileWriter("test.txt",true);
//             fw.append("\nagain append panrenda");
//             fw.close();
//             System.out.println("file written");
//         }
//         catch(Exception e){
//             System.out.println("not wkrinf");
//         }
//     }
// }

//Buffered write
// public class write{
//     public static void main(String args[])
//     {
//         try{
//             FileWriter fw = new FileWriter("test2.txt",true);
//             BufferedWriter bw = new BufferedWriter(fw);
//             //bw.write("first line");
//             //bw.newLine();
//             bw.append("appended something to the file");
//             bw.close();
//         }
//         catch(Exception e){
//             System.out.print("some issue");
//         }
//     }
// }

//usual read
// public class write{
//     public static void main(String args[])
//     {
//         try{
//             FileReader fr = new FileReader("test.txt");
//             int c = fr.read();
//             while(c!=-1){
//                 System.out.println((char)c);
//                 c = fr.read();
//             }
//             fr.close();
//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
        
//     }
// }

//bufferedread
public class write{
    public static void main(String args[])
    {
        try{
            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr);
            String c = br.readLine();
            while(c!=null){
                System.out.println(c);
                c = br.readLine();
            }
            br.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}
