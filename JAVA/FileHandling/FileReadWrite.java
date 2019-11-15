import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class FileReadWrite{

    public static void main(String args[]){    
        try{    
            FileOutputStream fout=new FileOutputStream("Output.txt");         
            FileInputStream fin = new FileInputStream("Input.txt");    
            int i=0;
            String s="";
            while((i=fin.read())  != -1)
                s += (char)i ;
            fin.close();
            System.out.println("Read from File Sucessfull");
            byte b[]=s.getBytes();
            fout.write(b);
            System.out.println("Sucessfully write in a file Output.txt ");
            fout.close();
         } catch (Exception e) {
             System.out.println(e);
         }
   }    
}

