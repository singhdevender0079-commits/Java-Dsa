package OOPS;
interface Chessplayer{
    void moves();
}
class   Queen implements Chessplayer{
 public void moves(){
System.out.println("up,down,left,right, diagonal ,(in four directions)");
}
}

class Rook implements Chessplayer{
    public void moves(){
 System.out.println("up,down,left,right, (four directions)");
    }
   
}

//! As a multiple inheritence; 

 interface Herbivorce{
void eat();
 }
interface Carnivorce{
void eat();
}
class bear implements Herbivorce, Carnivorce{

}

public class Interfaces {
    public static void main(String arg[]){
Queen q= new Queen();
q.moves();
    }
}
