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


        switch(PositionofplayerA)
        {    //for ladders
            case 8:
                System.out.println(A+"Player 1 reaches to the base of a ladder "); PositionofplayerA=22;
                System.out.println(A+"Now player reached position 22");
                break;


            case 15:
                System.out.println(A+"Player 1 reaches to the base of a ladder "); PositionofplayerA=20;
                System.out.println(A+"Now player reached position 20");
                break;

            case 19:
                System.out.println(A+"Player 1 reaches to the base of a ladder "); PositionofplayerA=27;
                System.out.println(A+"Now player reached position 27");
                break;

            case 29:
                System.out.println(A+"Player 1 reaches to the base of a ladder "); PositionofplayerA=36;
                System.out.println(A+"Now player reached position 36");
                break;

            case 38:
                System.out.println(A+"Player 1 reaches to the base of a ladder "); PositionofplayerA= 54;
                System.out.println(A+"Now player reached position 54");
                break;

            case 65:
                System.out.println(A+"Player 1 reaches to the base of a ladder "); PositionofplayerA=96;
                System.out.println(A+"Now player reached position 96");
                break;

            case 71:
                System.out.println(A+"Player 1 reaches to the base of a ladder "); PositionofplayerA=92;
                System.out.println(A+"Now player reached position 92");
                break;
            // for snakes

            case 14:
                System.out.println(A+"Player 1 reaches to the base of a ladder "); PositionofplayerA=4;
                System.out.println(A+"Now player reached position 4");
                break;

            case 21:
                System.out.println(A+"Player 1 reaches to the base of a ladder "); PositionofplayerA=13;
                System.out.println(A+"Now player reached position 13");
                break;

            case 38:
                System.out.println(A+"Player 1 reaches to the base of a ladder "); PositionofplayerA=17;
                System.out.println(A+"Now player reached position 17");
                break;

            case 59:
                System.out.println(A+"Player 1 reaches to the base of a ladder "); PositionofplayerA=32;
                System.out.println(A+"Now player reached position 32");
                break;

            case 76:
                System.out.println(A+"Player 1 reaches to the base of a ladder "); PositionofplayerA=9;
                System.out.println(A+"Now player reached position 9");
                break;

            case 92:
                System.out.println(A+"Player 1 reaches to the base of a ladder "); PositionofplayerA=83;
                System.out.println(A+"Now player reached position 83");
                break;
            default:break;
        }
        count++;

        }
        System.out.println("Total no of dice thrown by player 1:"+count);
    }
}