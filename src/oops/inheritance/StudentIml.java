package oops.inheritance;

  class Student{
     String name= "xyz";
     int rno=1;
     String div="B";
 }
 class PhysicsMarks extends  Student{
      double marks=78;
 }
 class ChemistryMarks extends Student{
      double marks=85;
 }
  class MathsMarks extends Student{
      double marks=90;
  }
public class StudentIml {
    public static void main(String[] args) {
        PhysicsMarks physicsMarks= new PhysicsMarks();
        ChemistryMarks chemistryMarks = new ChemistryMarks();
        MathsMarks mathsMarks= new MathsMarks();

        double total= physicsMarks.marks+chemistryMarks.marks+mathsMarks.marks;
        double percentage= (total/300)*100;

        System.out.println("Student Details : ");
        System.out.println("Roll no :"+mathsMarks.rno);
        System.out.println("name: "+mathsMarks.name);
        System.out.println(physicsMarks.div);
        System.out.println("MathsMarks= "+mathsMarks.marks);
        System.out.println("Chemistry Marks:"+chemistryMarks.marks);
        System.out.println("Physics Marks :"+physicsMarks.marks);
        System.out.println("Percentage:"+percentage);
    }
}
