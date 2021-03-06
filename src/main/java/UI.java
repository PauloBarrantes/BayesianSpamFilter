import java.util.List;
import java.util.Scanner;
/**
 * @author Paulo Barrantes & Berta Sánchez
 */
public class UI {

    private Scanner scanner = new Scanner(System.in);

    public UI(){


    }

    /**
     *
     *
     * @return answerS
     */
    public String answerS(){
        String answerS = scanner.nextLine();
        return answerS;
    }

    /**
     *
     * @param menu
     */
    public void showMenu(int menu){
        if(menu == 1){
            System.out.println("Welcome to the Bayesian Spam Filter ");
            System.out.println(" ( 1 ) Authenticate ");
            System.out.println(" ( 0 ) Exit ");
        }else{
            if(menu == 2){
                System.out.println("Choose an Option: ");
                System.out.println(" ( 1 ) Settings");
                System.out.println(" ( 2 ) Train");
                System.out.println(" ( 3 ) Show Data");
                System.out.println(" ( 4 ) Get New Mail ");
                System.out.println(" ( 5 ) Log Out ");
                System.out.println(" ( 0 ) Exit ");
            }
        }
    }

    /**
     *
     *
     * @param words
     */
    public void showWords(List<Word> words) {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%10s %30s %20s %30s %30s", "Word", "FrecuencyS","FrecuencyN", "ProbabilityS", "ProbabilityN");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        for (Word w : words){
            System.out.format("%10s %30s %20s %30s %30s",
                   w.getWord(), w.getFrecuencyS(), w.getFrecuencyN(),w.getProbabilityS(),w.getProbabilityN());
            System.out.println();
        }
    }

    /**
     *
     *
     * @param SpamThreshold
     * @param SpamProbability
     * @param SizeSet
     */
    public void settingsMenu(double SpamThreshold,double SpamProbability, int SizeSet){
        System.out.println("Settings:");
        System.out.println("-------------------------------------------");
        System.out.println("SpamThreshold:  " + SpamThreshold);
        System.out.println("SpamProbability:  "+ SpamProbability);
        System.out.println("SizeSet:  " + SizeSet);

        System.out.println("-------------------------------------------");

        System.out.println("Choose an Option:");
        System.out.println(" ( 1 ) SpamThreshold ");
        System.out.println(" ( 2 ) SpamProbability");
        System.out.println(" ( 3 ) SizeSet");
        System.out.println(" ( 0 ) Exit");

    }

    /**
     *
     *
     * @param snippet
     */
    public void showSnippet(String snippet){
        System.out.println(snippet);
    }
}
