package strings;

public class StringBufferDemo {
    public static void main(String[] args) {
       String str="Namrata";
        System.out.println(str.concat("tati"));

        StringBuffer str2 =new StringBuffer("Namrata");
        System.out.println(str2.append("tati"));


    }
}
