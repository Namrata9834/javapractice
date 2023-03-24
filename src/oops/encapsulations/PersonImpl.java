package oops.encapsulations;
 class Person{
    private int pid;
    private String firstName;
    private String lastName;
    private String fullName;

    public int getPid() {
        return pid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        fullName=firstName+" "+lastName;
        return fullName;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
public class PersonImpl {
    public static void main(String[] args) {
        Person person = new Person();
        person.setPid(101);
        person.setFirstName("xyz");
        person.setLastName("pqr");
        person.setLastName("wyz");

        System.out.println("pid"+person.getPid());
        System.out.println("full name :"+person.getFullName());
    }
}
