import java.io.File;

public class FileSize {
    public static void main(String[] args) 
    {
        File file = new File("E:\\Documents\\passport.pdf");
        if(file.exists())
        {
        System.out.println(bytes(file));
        System.out.println(kilobytes(file));
        System.out.println(megaBytes(file));
        }
        else 
        System.out.println("File doesn't exist"); 
    }

    private static String megaBytes(File file) {
        return (double) file.length()/(1024*1024)+" mb";
    }

    private static String kilobytes(File file) {
        return (double) file.length()/1024+" kb";
    }

    private static String bytes(File file) {
        return (double) file.length()+" bytes";
    }
}
