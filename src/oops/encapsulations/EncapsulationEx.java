package oops.encapsulations;

import java.awt.font.TextAttribute;

class Encapsulation {
    private  int empId;
    private String empName;

    public void setEmpId(int empId1){
       empId=empId1;
    }
    public int getEmpId(){
        return empId;
    }

    public void setEmpName(String empName1){
        empName=empName1;
    }
    public String getEmpName(){
        return empName;
    }


}
class EncapsulationEx{
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setEmpId(10);
        encapsulation.setEmpName("Mitesh");
        System.out.println( encapsulation.getEmpId());
        System.out.println( encapsulation.getEmpName());



    }
}
