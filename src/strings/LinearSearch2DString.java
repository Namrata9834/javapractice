package strings;

public class LinearSearch2DString {
    public static void main(String[] args) {
        char ch[][]= {
                {'a','b','c','d'},
                {'e','f','g'},
                {'h','i'},
                {'k'}
        };
        int str='g';
        for (int i=0;i< ch.length;i++){
            for (int j=0;j<ch[i].length;j++){
                if(ch[i][j]==str){
                    System.out.println("string element is found at row "+i+" and at column "+j);
                }
            }
        }
    }
}
