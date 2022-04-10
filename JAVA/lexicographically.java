public class lexicographically {
    public static void main(String args[]) {
        String s1 = "Play together";
        String s2 = "Play towith";
        String s3 = "Play towether";

        int var1 = s1.compareTo(s2);
        System.out.println("S1 compare to S2:- " + var1);
        int var2 = s2.compareTo(s3);
        System.out.println("S2 compare to S3:- " + var2);
    }
}
