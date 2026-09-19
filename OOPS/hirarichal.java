package OOPS;

class sweets{
    void name(){
System.out.println("it is barfi");
    }
    void belongs(){
        System.out.println("belong to sri ganganagar");
    }
}
class rasogula extends sweets{
void price(){
    System.out.println("50");
}
}
class rasmalai extends sweets{
    void make(){
System.out.println("make wiith milk");
    }
}
public class hirarichal {
    public static void main(String[] args) {
        rasogula s1=new rasogula();
        s1.belongs();
        rasmalai s2=new  rasmalai();
        s2.belongs();
    }
}
