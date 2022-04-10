//It's checked at runtime. It inherit RuntimeException. ex ArithematicException, ArrayIndexOutOfBound.

public class UncheckedException {
    public static void main(String args[]) {
        try{
            int a = 11/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Continue code after try");
    }
}
