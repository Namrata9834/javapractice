package oops.constructor;
//parametrised constructor

public class ConstructorEx{
    int studId;
    String studName;

    ConstructorEx(int studId,String studName){
        this.studId=studId;
        this.studName=studName;
    }
    void display(){
        System.out.println(studId+" "+studName);
    }

    public static void main(String[] args) {
        ConstructorEx constructorEx = new ConstructorEx(1,"Namrata");
        constructorEx.display();



    }

}