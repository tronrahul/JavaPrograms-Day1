import java.io.File;

public class FileListDirec{
    public static void main(String a[])
    {
        File file = new File("E:\\Documents");
        String[] fileList = file.list();
        for(String name:fileList){
           System.out.println(name);
        }
    }
}
