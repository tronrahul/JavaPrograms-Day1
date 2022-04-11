import java.io.FileInputStream;
public class ArrayIntoByte {
    public static void main(String args[]){
        byte b[] = new byte[100];
        try{
            FileInputStream file = new FileInputStream("E:\\Documents\\passport.pdf");
            for(int i=0;i<b.length;i++){
                b[i] = (byte)file.read();
                System.out.print(b[i]+ " ");
            }

            for(int i=0;i<b.length;i++){
                char c = (char)b[i];
                System.out.print(c+ " ");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
