package OOPS;

class fac{
String name;
int model[];
public fac(){

}
// copy constructor
public fac( fac s1){
model=new int[3];
this.name=s1.name;
for (int i = 0; i < model.length; i++) {
    this.model[i]=s1.model[i];
}
}
}


public class DeepCons {
    public static void main(String[] args) {
     fac s1=new fac();
fac s2= new fac(s1);
for (int i = 0; i < 3; i++) {
    s1[i]
}

    }
}
