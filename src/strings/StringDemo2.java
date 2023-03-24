package strings;

public class StringDemo2 {
    public static void main(String[] args) {
        String str = "Namrata";
        String str1=new String("Namrata");
        String str2="Tati";
        String str3=new String("Tati");
        System.out.println(str3==str2);
        System.out.println(str.equals(str2));
        System.out.println(str3.equals(str2));
        System.out.println("_________________________");

        System.out.println(str.length());
        System.out.println(str1.toUpperCase());
        System.out.println(str3.trim());
        System.out.println(str.concat(" "+str2));
        System.out.println(str.compareTo(str1));

    }
}
