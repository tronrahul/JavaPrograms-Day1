import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//It is checked at compile time. It inherit throwable class except runtime and error. ex IOexception, SQLException.


public class CheckedException {
    public static void main(String args[]) throws IOException{
        FileReader file = new FileReader("E:\\Documents\\passport.pdf");
        BufferedReader fileInp = new BufferedReader(file);
        System.out.println(fileInp.readLine());
        fileInp.close();
    }
}
