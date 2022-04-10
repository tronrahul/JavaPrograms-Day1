import java.io.File;
import java.sql.Date;

public class LastModified {
    public static void main(String args[]) {
        File f = new File("E:\\Documents\\passport.pdf");
        Date d = new Date(f.lastModified());
        System.out.println("Last modified date is: " +d);
    }
}
