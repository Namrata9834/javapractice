package pattern_printing;

public class Pattern1 {
    public static void main(String[] args) {
       patternOne(4);
    }
    static void patternOne(int no){
        for(int row=1;row<=no;row++){
      for (int col=1;col<=row;col++){
          System.out.print("* ");
         }
            System.out.println();  }
    }
}
/*
         *
         * *
         * * *
         * * * *
 */