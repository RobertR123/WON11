import java.util.Scanner;
import java.util.Random;

public class DonationRandomMax {
    public static void main(String[] args){

        randomDonMax();
        
    }

    public static void randomDonMax() {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int generatedNumber = r.nextInt(15);
        int maxdon = s.nextInt();
        int count = 1;
        System.out.println("Guess the donation!");
        do {
            int number = s.nextInt();
            if(number == generatedNumber){
                break;
            } 
            if(maxdon == count) {
                System.out.println("You have reached max input!");
                break;
            } else {
                count++;
            }
            System.out.println("Try again!");
        }while(true);
        if(count < maxdon){
        System.out.println("Congrats! You have guessed the donation!");
    }
    }
}