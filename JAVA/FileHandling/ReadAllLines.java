import java.io.FileInputStream;

class ReadAllLines{
    public static void main(String...k) {
        
        int i;
        try {
            FileInputStream fin = new FileInputStream("Input1.txt");
            while( (i=fin.read()) != -1  )
                System.out.print((char)i);
            System.out.println("");
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}