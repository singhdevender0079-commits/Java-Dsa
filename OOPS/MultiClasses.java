package OOPS;
import java.util.*;
class student {
    String name;
    int standard;
    int roll_no;
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Standard : "+standard);
        System.out.println("Roll no. : "+roll_no);
    }
}
public class MultiClasses {
    public static void main(String[] args) {
                Scanner sc =new Scanner(System.in);
        System.out.println("Enter how many students do you want to add ");
        int a=sc.nextInt();
        student[] students=new student[a];
        for (int i = 0; i < students.length; i++) {
            students[i]=new student();
        }
        for(int i=0;i<students.length;i++){  
            
            System.out.println("-------- Details of Student "+i+" --------");
            System.out.println("Enter the name of student ");

            students[i].name=sc.nextLine();
            sc.nextLine();

            System.out.println("Enter the standard ");
            students[i].standard=sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the roll no.");
            students[i].roll_no=sc.nextInt();

            sc.nextLine(); 
        }
for (int i = 0; i <students.length; i++) {
System.out.println("------- Student " + i +" --------");
students[i].display();
}
        }
}
