import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double calculateAvg = -1;
        System.out.println("Welcome to Batting Average Calculator! ");
        System.out.println();
        boolean y = true;


        while (y) { //while loop for continuation

            int i = 0;
            Scanner scnr = new Scanner(System.in); //ask user for number of bats
            System.out.println("Enter number of times at bat: ");
            int atBat = scnr.nextInt(); //get user input for number of bats
            int[] batterResults = new int[atBat];

            for (i = 0; i < atBat; i++) {
                System.out.println("Enter the result for base" + i); //ask user for number of bases earned
                batterResults[i] = scnr.nextInt(); //get user input - # of bases earned
            }

            calculateAvg = calcBattingAvg(batterResults);
            System.out.println(calculateAvg);

            double sluggingAvg = calcSluggingAvg(batterResults);
            System.out.println(sluggingAvg);

            scnr.nextLine(); //garbage scanner for while

            System.out.println("Calculate for another batter? "); //part of while loop
            String userPrompt = scnr.nextLine(); //getting user input for continuation

            if (userPrompt.equalsIgnoreCase("n")) { //part of while
                System.out.println("Goodbye"); //part of while
                y = false; //part of while
            }


        }


    }

    public static double calcBattingAvg(int[] batterResults) { //creating a calc avg method to calc at bat avg

        //creating for i to loop thru array/.length to calc length of array

        double battingAvg = 0;

        for (int i = 0; i < batterResults.length; i++) {

            if (batterResults[i] != 0) {

                battingAvg = battingAvg + 1;


            }

        }
        return battingAvg / batterResults.length;
    }

    public static double calcSluggingAvg(int[] sluggingResults) { //creating a calc avg method to calc at bat avg

        //creating for i to loop thru array/.length to calc lenhth of array

        double sluggingAvg = 0;

        for (int i = 0; i < sluggingResults.length; i++) {

            if (sluggingResults[i] != 0) {

                sluggingAvg = sluggingAvg + sluggingResults[i];


            }

        }
        return sluggingAvg / sluggingResults.length;


    }

}









