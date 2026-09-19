 package conditonalStatement;
 import java.util.*;
 class incomeTaxCalc{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Sallary");
        int a = sc.nextInt();
  if(a>150000){
    System.out.println("you have to pay tax 500000");
  }
else if(a>100000 &&a<1400099){
System.out.println("you have to pay 300000");
}
else if (a>500000 && a<100000) {
    System.out.println("you have to pay 0 tax");
}else{
    System.out.println("Please enter your sallary");
}
            }
 } 