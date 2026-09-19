package OOPS;
class calulator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        calulator s=new calulator();
      System.out.println( s.sum((float)1.5, (float)0.2)); 
      System.out.println(s.sum(5, 7));  
       System.out.println(s.sum(7,8,6)); 
    }
}
