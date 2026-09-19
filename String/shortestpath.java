package String;

public class shortestpath {
    public static void shortpath(String str) {
        double x=0;
        double  y=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='E'){
                x +=1;
            }
            else if(str.charAt(i)=='W'){
                x -=1;
            }
            else if(str.charAt(i)=='N'){
                y +=1;
            }
            else{
                y -=1;
            }
        }

       double res=(x*x)+(y*y); 
   res = Math.pow(res, 0.5);
System.out.println(res);

    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        shortpath(str);
    }
}
