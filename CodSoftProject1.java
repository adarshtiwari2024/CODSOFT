import java.util.Scanner;
import java.util.Random;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses(){
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
   }
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);

    }

    void takeUserInput(){
        System.out.print("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber == number){
            System.out.printf("Congratulation! You choose the Right Number, It was %d\n You guessed it in in %d attempts ", number, noOfGuesses);
            return true;
            
        }
        else if (inputNumber < number){
            System.out.println("The number you have entered is low ! ");
        }
        else if (inputNumber > number) {
            System.out.println("The number you have entered is high !");
        }
        return false;
    }
}
public class CodSoftProject1 {
    public static void main(String[] args) {
           boolean b = false;
           Game g = new Game();
           while(!b){
           g.takeUserInput();
           b = g.isCorrectNumber();
           }
    }
    }
  

