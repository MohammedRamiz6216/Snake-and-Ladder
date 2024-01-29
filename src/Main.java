import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the Player 1 ");
     String A = sc.next();
     int PositionofplayerA=0;
     int count=0;
     int x;

        while(PositionofplayerA!=100){
            System.out.println();
            x=1+(int)(Math.random()*(6-1+1));
            if((PositionofplayerA+x)<=100)
                PositionofplayerA=x+PositionofplayerA;
            System.out.println(A+" Throws "+ x);
            System.out.println(A+" Reaches to cell "+ PositionofplayerA);


        switch(PositionofplayerA)
        {    //for ladders
            case 8:
                System.out.println(A+" reaches to the base of a ladder "); PositionofplayerA=22;
                System.out.println(A+" reached position "+PositionofplayerA);
                break;


            case 15:
                System.out.println(A+" reaches to the base of a ladder "); PositionofplayerA=20;
                System.out.println(A+" reached position "+PositionofplayerA);
                break;

            case 19:
                System.out.println(A+" reaches to the base of a ladder "); PositionofplayerA=27;
                System.out.println(A+" reached position "+PositionofplayerA);
                break;

            case 29:
                System.out.println(A+" reaches to the base of a ladder "); PositionofplayerA=36;
                System.out.println(A+" reached position "+PositionofplayerA);
                break;

            case 38:
                System.out.println(A+" reaches to the base of a ladder "); PositionofplayerA= 54;
                System.out.println(A+" reached position "+PositionofplayerA);
                break;

            case 65:
                System.out.println(A+" reaches to the base of a ladder "); PositionofplayerA=96;
                System.out.println(A+" reached position "+PositionofplayerA);
                break;

            case 71:
                System.out.println(A+" reaches to the base of a ladder "); PositionofplayerA=92;
                System.out.println(A+" reached position "+PositionofplayerA);
                break;
            // for snakes

            case 14:
                System.out.println(A+" reaches to the base of a snake "); PositionofplayerA=4;
                System.out.println(A+" reached position "+PositionofplayerA);
                break;

            case 21:
                System.out.println(A+" reaches to the base of a snake "); PositionofplayerA=13;
                System.out.println(A+" reached position "+PositionofplayerA);
                break;

            case 42:
                System.out.println(A+" reaches to the base of a snake "); PositionofplayerA=17;
                System.out.println(A+" reached position "+PositionofplayerA);
                break;

            case 59:
                System.out.println(A+" reaches to the base of a snake "); PositionofplayerA=32;
                System.out.println(A+" reached position "+PositionofplayerA);
                break;

            case 76:
                System.out.println(A+"Player 1 reaches to the base of a snake "); PositionofplayerA=9;
                System.out.println(A+" reached position "+PositionofplayerA);
                break;

            case 92:
                System.out.println(A+"Player 1 reaches to the base of a snake "); PositionofplayerA=83;
                System.out.println(A+" reached position "+PositionofplayerA);
                break;
            default:break;
        }
        count++;

        }
        System.out.println("Total no of dice thrown by player 1:"+count);
        if(PositionofplayerA>=100){
            System.out.println(A+" is the winner ...");
            System.out.println(A+" Reached 100");
            System.out.println(A+ " has played "+count + "times");
        }
    }
}