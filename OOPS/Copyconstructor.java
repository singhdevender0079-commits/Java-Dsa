package OOPS;


 class studentes{
    String name;
    int roll;
    public studentes() {
    }
    // copy constructor
    studentes( studentes s1){
      this.name=s1.name;
    this.roll=  s1.roll;
}
 }
 public class Copyconstructor{
    public static void main(String arg[]){
studentes s1=new studentes();
s1.name="gabber singh";
s1.roll=123;
studentes s2=new studentes(s1);
System.out.println(s2.name);
System.out.println(s2.roll);
    }
}