import java.util.Scanner; 
import java.util.Random;
public class Number_guessing{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String play = "yes"; 
        int round = 0, TotalScore = 0, TotalTreis = 0;
        System.out.println();
        System.out.println("A number is chosen betn 1 to 100. Guess the number within 5 tries.");
        while(play.equals("yes")){
            ++round; 
            int guess, i, k=5, tries = 0, score = 5; 
            Random rand = new Random(); 
            int number = rand.nextInt(100);
            for(i=0; i<k; i++){
                System.out.println();
                System.out.println("Guess the number : ");
                guess = sc.nextInt();
                if(number == guess){
                    tries++; 
                    System.out.println("Congratulations!! You guess the number.");
                    System.out.println();
                    TotalTreis += tries; 
                    TotalScore += score; 
                    System.out.println();
                    System.out.println("would you like to play again ? yes or no");
                    play = sc.next().toLowerCase(); 
                    break; 
                }else if(number > guess && i != k-1){
                    System.out.println("The number is greater than "+ guess);
                    tries++; 
                    score--; 
                }else{
                    System.out.println("The number is less than "+guess);
                    tries++; 
                    score--; 
                }
            }

            if(i == k){
                System.out.println("You have exhausted 5 tries. ");
                System.out.println("The number was" + number);
                TotalTreis += tries; 
                TotalScore += score;
                System.out.println();
                System.out.println("------------------------------");
                System.out.println("|     tries    |     score   |");
                System.out.println("------------------------------");
                System.out.println(  "|       " + tries + "       |       " +score+"      |");
                System.out.println("------------------------------");
                System.out.println();
                System.out.println("would you like to play again ? yes or no");
                play = sc.next().toLowerCase(); 

            }
        }

        System.out.println();
        System.out.println("                   SCORE CARD                    ");
        System.out.println("-------------------------------------------------");
        System.out.println("|   rounds   |   total_tries   |   total_score   ");
        System.out.println("-------------------------------------------------");
        System.out.println("|      "+round+"      |        "+TotalTreis+"         |         "+TotalScore+"        |");
        System.out.println("-------------------------------------------------");
    }
}