import java.io.File;

public class SameName {
    public static void main(String[] args) {
        File my_file_dir = new File("E:\\Documents\\passport.pdf");
         if (my_file_dir.exists()) 
           {
            System.out.println("The directory or file exists");
           } 
         else
          {
            System.out.println("The directory or file does not exist");
          }
       }
}
