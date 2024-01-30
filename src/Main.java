import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the name of Player 1 and Player 2");
     String A = sc.next();
     String B = sc.next();
     int PositionofplayerA=0;
     int PositionofplayerB=0;
     int count=0;
     int x;

        while(PositionofplayerA!=100&&PositionofplayerB!=100){
            System.out.println();
            x=1+(int)(Math.random()*(6-1+1));
            if((PositionofplayerA+x)<=100 )
                PositionofplayerA=x+PositionofplayerA;
            System.out.println(A+" Throws "+ x);
            System.out.println(A+" Reaches to cell "+ PositionofplayerA);



        switch(PositionofplayerA)
        {    //for ladders
            case 8:
                System.out.println(A+" reaches to the base of a ladder "); PositionofplayerA=22;
                System.out.println(A+" reached position "+PositionofplayerA);
                break;



            case 19:
                System.out.println(A+" reaches to the base of a ladder "); PositionofplayerA=27;
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



            case 76:
                System.out.println(A+"Player 1 reaches to the base of a snake "); PositionofplayerA=9;
                System.out.println(A+" reached position "+PositionofplayerA);
                break;


            default:break;
        }
            if(PositionofplayerA == 8 || PositionofplayerA == 19 || PositionofplayerA == 38 || PositionofplayerA == 65 || PositionofplayerA == 71 ) {
                x = 1 + (int) (Math.random() * (6 - 1 + 1));
                if ((PositionofplayerA + x) <= 100)
                    PositionofplayerA = x + PositionofplayerA;
                System.out.println(A + " Throws " + x);
                System.out.println(A + " Reaches to cell " + PositionofplayerA);

                switch (PositionofplayerA) {    //for ladders
                    case 8:
                        System.out.println(A + " reaches to the base of a ladder ");
                        PositionofplayerA = 22;
                        System.out.println(A + " reached position " + PositionofplayerA);
                        break;


                    case 19:
                        System.out.println(A + " reaches to the base of a ladder ");
                        PositionofplayerA = 27;
                        System.out.println(A + " reached position " + PositionofplayerA);
                        break;


                    case 38:
                        System.out.println(A + " reaches to the base of a ladder ");
                        PositionofplayerA = 54;
                        System.out.println(A + " reached position " + PositionofplayerA);
                        break;

                    case 65:
                        System.out.println(A + " reaches to the base of a ladder ");
                        PositionofplayerA = 96;
                        System.out.println(A + " reached position " + PositionofplayerA);
                        break;

                    case 71:
                        System.out.println(A + " reaches to the base of a ladder ");
                        PositionofplayerA = 92;
                        System.out.println(A + " reached position " + PositionofplayerA);
                        break;

                    default:
                        break;
                }
            }
            System.out.println();
            x=1+(int)(Math.random()*(6-1+1));
            if((PositionofplayerB+x)<=100 )
                PositionofplayerB=x+PositionofplayerB;
            System.out.println(B+" Throws "+ x);
            System.out.println(B+" Reaches to cell "+ PositionofplayerB);


            switch(PositionofplayerB)
            {    //for ladders
                case 8:
                    System.out.println(B+" reaches to the base of a ladder "); PositionofplayerB=22;
                    System.out.println(B+" reached position "+PositionofplayerB);
                    break;



                case 19:
                    System.out.println(B+" reaches to the base of a ladder "); PositionofplayerB=27;
                    System.out.println(B+" reached position "+PositionofplayerB);
                    break;


                case 38:
                    System.out.println(B+" reaches to the base of a ladder "); PositionofplayerB= 54;
                    System.out.println(B+" reached position "+PositionofplayerB);
                    break;

                case 65:
                    System.out.println(B+" reaches to the base of a ladder "); PositionofplayerB=96;
                    System.out.println(B+" reached position "+PositionofplayerB);
                    break;

                case 71:
                    System.out.println(B+" reaches to the base of a ladder "); PositionofplayerB=92;
                    System.out.println(B+" reached position "+PositionofplayerB);
                    break;
                // for snakes

                case 14:
                    System.out.println(B+" reaches to the base of a snake "); PositionofplayerB=4;
                    System.out.println(B+" reached position "+PositionofplayerB);
                    break;

                case 21:
                    System.out.println(B+" reaches to the base of a snake "); PositionofplayerB=13;
                    System.out.println(B+" reached position "+PositionofplayerB);
                    break;

                case 42:
                    System.out.println(B+" reaches to the base of a snake "); PositionofplayerB=17;
                    System.out.println(B+" reached position "+PositionofplayerB);
                    break;



                case 76:
                    System.out.println(B+"Player 1 reaches to the base of a snake "); PositionofplayerB=9;
                    System.out.println(B+" reached position "+PositionofplayerB);
                    break;


                default:break;
            }
            if(PositionofplayerB == 8 || PositionofplayerB == 19 || PositionofplayerB == 38 || PositionofplayerB == 65 || PositionofplayerB == 71 ){
                x=1+(int)(Math.random()*(6-1+1));
                if((PositionofplayerB+x)<=100 )
                    PositionofplayerB=x+PositionofplayerB;
                System.out.println(B+" Throws "+ x);
                System.out.println(B+" Reaches to cell "+ PositionofplayerB);

                switch(PositionofplayerB) {    //for ladders
                    case 8:
                        System.out.println(B + " reaches to the base of a ladder ");
                        PositionofplayerB = 22;
                        System.out.println(B + " reached position " + PositionofplayerB);
                        break;


                    case 19:
                        System.out.println(B + " reaches to the base of a ladder ");
                        PositionofplayerB = 27;
                        System.out.println(B + " reached position " + PositionofplayerB);
                        break;


                    case 38:
                        System.out.println(B + " reaches to the base of a ladder ");
                        PositionofplayerB = 54;
                        System.out.println(B + " reached position " + PositionofplayerB);
                        break;

                    case 65:
                        System.out.println(B + " reaches to the base of a ladder ");
                        PositionofplayerB = 96;
                        System.out.println(B + " reached position " + PositionofplayerB);
                        break;

                    case 71:
                        System.out.println(B + " reaches to the base of a ladder ");
                        PositionofplayerB = 92;
                        System.out.println(B + " reached position " + PositionofplayerB);
                        break;

                    default:break;
                }
            }


        count++;

        }
        System.out.println("Total no of dice thrown by player 1 and player 2:"+count);
        if(PositionofplayerA>=100 && PositionofplayerB>=100){
            System.out.println("It's a tie game");
        }
        if(PositionofplayerA>=100){
            System.out.println(A+" is the winner ...");
            System.out.println(A+" Reached 100");
            System.out.println(A+ " has played "+count + "times");
        }
        if(PositionofplayerB>=100){
            System.out.println(A+" is the winner ...");
            System.out.println(A+" Reached 100");
            System.out.println(A+ " has played "+count + "times");
        }
    }
}