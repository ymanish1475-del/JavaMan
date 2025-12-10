import java.security.spec.PKCS8EncodedKeySpec;

/*class Pen{
    String color;
    String type ;//ballpoint ;gel
    public void write(){
            System.out.println("write something");



    }
    public void printcolor(){
        System.out.println(this.color);
    }
    
}*/
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
     
}
/*public class OOPS{
     public static void main(String args[]){
        Pen pen1=new Pen();
        pen1.color="blue";
        pen1.type ="gel";
        Pen pen2 =new Pen();
        pen2.color ="black";
        pen2.type="ballpoin";
        pen1.write();
        pen1.printcolor();
        pen2.printcolor();
     }
}*/
public class OOPS{
    public static void main(String args[]){
        Student s1= new Student();
        s1.name="manish";
        s1.age=19;

        s1.printInfo();
    }
}