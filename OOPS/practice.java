package OOPS;

class bike {

    String name;
    int model[];

    // public bike() {
    // }
// shallow constructor

    // public bike(bike b1) {
    //     this.name = b1.name;
    //     this.model = b1.model;
    // }
    // deep constructor
    public bike(bike b1){
this.name = b1.name;
model=new int[3];
model[0]=1;
model[1]=2;
model[2]=3;
for(int i =0; i<model.length;i++){
this.model[i]=b1.model[i];
}
    }
}

public class practice {
    public static void main(String[] args) {
        bike b1 = new bike();
        b1.name = "hero";
        b1.model[0] = 2012;
        bike b2 = new bike(b1);
        System.out.println(b2.name);
        for(int i= i<3; i++){
            System.out.print(b2.model[i]);
        }
    }

}
