import java.util.Scanner;
import java.util.Random;

public class DonationRandom {
    public static void main(String[] args){

        randomDon();
        
    }

    public static void randomDon() {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int generatedNumber = r.nextInt(15);
        System.out.println("Guess the donation!");
        do {
            int number = s.nextInt();
            if(number == generatedNumber){
                break;
            }
            System.out.println("Try again!");
        }while(true);
        System.out.println("Congrats! You have guessed the donation!");
    }
}