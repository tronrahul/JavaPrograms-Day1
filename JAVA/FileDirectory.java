import java.io.File;

public class FileDirectory {
    public static void main(String args[]) {
        File f = new File("E:\\Documents\\passport.pdf");
        if(f.isDirectory()){
            System.out.println(f.getAbsolutePath() + " is Directory");
        }
        else{
            System.out.println(f.getAbsolutePath() + " is Not a directory");
        }
        if(f.isFile()){
            System.out.println(f.getAbsolutePath() + " is file");
        }
        else{
            System.out.println(f.getAbsolutePath() + " is Not a file");
        }
    }
}
