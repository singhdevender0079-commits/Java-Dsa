package Recursion_Practice;

public class Slength {
    public static int stringlength(String name,int i) {
      
        if(i==name.length()){
            return 0;
        }
        return 1+stringlength(name,i+1);
    }
    public static void main(String[] args) {
        String name="Devender singh";
        int i=0;
        System.out.println(stringlength(name, i));
    }
}
