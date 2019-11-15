import java.io.File;

class FileAttribute{
    public static void main(String...k) {
        try {
            File f = new File("Input.txt");
            System.out.println("File path : "+f.getAbsolutePath());
            System.out.println("File Name : "+f.getName());
            System.out.println(f.lastModified());
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}