import java.io.File;
import java.io.FilenameFilter;

public class SameExtension {
    public static void main(String a[]){
        File file = new File("E:\\Documents");
           String[] list = file.list(new FilenameFilter() {
            public boolean accept(File dir, String name) {
             if(name.toLowerCase().endsWith(".txt")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        for(String f:list){
            System.out.println(f);
        }
    }
}
