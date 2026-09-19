package Rcursion;
class stringlength{
    public static int stl(String name,int i ) {
        if(i==name.length()){
            return 0;
        }
        return 1+stl(name, i+1);
    }
    public static void main(String[] args) {
       System.out.println( stl("devender singh", 0));
    }
}