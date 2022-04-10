import java.io.File;

public class FileReadWrite {
    public static void main(String[] args) {
        File file = new File("E:\\Documents\\passport.pdf");
         if (file.canWrite()) 
           {
            System.out.println(file.getAbsolutePath() + "can write");
           } 
         else
          {
            System.out.println(file.getAbsolutePath() + "cannot write");
          }
         if (file.canRead()) 
           {
            System.out.println(file.getAbsolutePath() + "can read");
           } 
         else
          {
            System.out.println(file.getAbsolutePath() + "   cannot read");
          }  
      }
}
