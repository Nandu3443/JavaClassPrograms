import java.util.Scanner;

class Gusser {
    int gNum;
    int gusserNumber(){
        System.out.println("Hey! Gusser, Guess the number:");
        Scanner sc = new Scanner(System.in);
        gNum = sc.nextInt();
        return gNum;
    }
}

class Player{
    int pNum;
    int playerGuessNumber(){
        System.out.println("Hey! Player, Guess the number:");
        Scanner sc = new Scanner(System.in);
        pNum = sc.nextInt();
        return pNum;
    }
}


class Umpire {
    int numFromGusser;
    int numFromP1;
    int numFromP2;
    int numFromP3;
    int numFromP4;

    void collectNumFromGusser(){
        Gusser sai= new Gusser();
        numFromGusser = sai.gusserNumber();
    }
    void collectNumFromPlayers(){
        Player venkat = new Player();
        Player arvind = new Player();
        Player thota = new Player();
        Player vishu = new Player();
        numFromP1 = venkat.playerGuessNumber();
        numFromP2 = arvind.playerGuessNumber();
        numFromP3 = thota.playerGuessNumber();
        numFromP4 = vishu.playerGuessNumber();
    }

    void compare(){
        if(numFromGusser == numFromP1){
            System.out.println("Venkat is the winner");
        }else if(numFromGusser == numFromP2){
            System.out.println("Arvind is the winner");
        }else if(numFromGusser == numFromP3){
            System.out.println("Thota is the winner");
        }else if(numFromGusser == numFromP4){
            System.out.println("Vishu is the winner");
        }else{
            System.out.println("No one wins!,play Again...");
        }
}
}

public class GusserGame {
    public static void main(String[] args) {
        Umpire computer = new Umpire();
        computer.collectNumFromGusser();
        computer.collectNumFromPlayers();
        computer.compare();
    }
}
