public class GuessingGame {
    public static void main(String[] args){
        GuessGame game = new GuessGame();
        game.run();
    }
}
class GuessGame {
    public void run(){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        int guessing_num = (int) (Math.random() * 10);
        System.out.println("Guess this number: " + guessing_num);

        while(true){
            p1.guess();
            p2.guess();
            p3.guess();

            int guessp1 = p1.number;
            int guessp2 = p2.number;
            int guessp3 = p3.number;

            boolean p1_isTrue = false;
            boolean p2_isTrue = false;
            boolean p3_isTrue = false;
            
            if (guessp1 == guessing_num){p1_isTrue = true;}
            if (guessp2 == guessing_num){p2_isTrue = true;}
            if (guessp3 == guessing_num){p3_isTrue = true;}

            if (p1_isTrue || p2_isTrue || p3_isTrue){
                System.out.println("Does Player 1 got it right?: " + p1_isTrue);
                System.out.println("Does Player 2 got it right?: " + p2_isTrue);
                System.out.println("Does Player 3 got it right?: " + p3_isTrue);
                break;
            }

            System.out.println("Try guess again!");
        }
    }
}

class Player {
    int number = 0;

    public void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("I am guessing " +  number);
    }
}
