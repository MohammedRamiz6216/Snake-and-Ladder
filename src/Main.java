import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String A = sc.next();
     int PositionofplayerA=0;
     int count=0;
     int x;
        System.out.println("Enter the Player 1 ");
        while(PositionofplayerA!=100){
            System.out.println();
            x=1+(int)(Math.random()*(6-1+1));
            System.out.println(A+" Throws "+ x);
            System.out.println(A+" Reaches to cell "+ PositionofplayerA);
        }
    }
}