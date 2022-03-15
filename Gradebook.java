public class Gradebook {
    public static void main(String[] args)
    {

        //Sets the max score and min allowed for input validation
        final int MAX_SCORE = 100;
        final int MIN_SCORE = -1;

        System.out.println("Welcome to simple Grade Book");

        //Set variables need it for calculation of average and counter 
        int numStudents = 0;
        int sum = 0;
        int score = 0;
        
        //do loop conducs user input, promptforInt and calculation of average
        do 
        {
            score =promptForInt("Enter the score for the student#0(or -1 to quit):",MIN_SCORE,MAX_SCORE);

            if (score!=-1)
            {
                sum+=score;
                numStudents++;
            }
            else
            {
                double avgScore=(double)sum/numStudents;
            }

        }while(score!=-1);

        return score;
    }

}