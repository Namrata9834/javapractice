package strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("Namrata");
        System.out.println(stringBuilder.append("Tati"));
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.append(8));
        System.out.println(stringBuilder.indexOf("r"));
    }
}
