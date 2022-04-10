//Error are irreverseable. It oocurs at runtime. It is unchecked type.
//Similarity between Exception and error is both occur at runtime. Both have unchecked type.


public class ErrorException {
    public static void name(int i) {
        while(i!=0){
            i = i+1;
            name(i);
        }
    }

    public static void main(String args[]) {
        name(5);
    }
}
