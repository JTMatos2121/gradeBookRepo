public class Gradebook
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
//        After collecting my thoughts I used the getters and setters
//        used methods for int student and quizzes with input validation 
        System.out.println("Welcome to Simple Gradebook v2.0");
        GradeBook2 studentNum = new GradeBook2();
        studentNum.setStudents(promptForInteger("Enter the number of students: ",GradeBook2.MIN_STUDENTS, GradeBook2.MAX_STUDENTS));
        GradeBook2 quizNum = new GradeBook2();
        quizNum.setQuizzes(promptForInteger("Enter the number of quizzes: ",GradeBook2.MIN_QUIZZES, GradeBook2.MAX_QUIZZES));
        System.out.println();
        System.out.println("Input the Grades:");
        GradeBook2 scoreNum = new GradeBook2();
        
        double [][] scores =new double[studentNum.getStudents()][quizNum.getQuizzes()];
//        created a for loop for the score input and score input validation 
        for (int student=0; student<studentNum.getStudents(); student++)
        {
            for (int quiz=0; quiz<quizNum.getQuizzes(); quiz++)
            {
                GradeBook2 r = new GradeBook2();
                System.out.printf("Enter the score for Student#%d and Quiz#%d: ",student,quiz);
                double score = promptForDouble("",GradeBook2.MIN_SCORE,GradeBook2.MAX_SCORE)+1;
                r.inputGrade(student, quiz, score);
            }
            
        }
//        Used a the getters to complete printf line with corresponding numbers
        GradeBook2 average = new GradeBook2();
        System.out.printf("The average score for %d students and %d quizzes is %f",studentNum.getStudents(),quizNum.getQuizzes(),average.calcAvgScore());
        
        
        
        
        
        
        
    }
//    loops used for the input validation message
    public static int promptForInteger(String message, int minValue, int maxValue)
        {
            int students=0;
            boolean done = false;
            Scanner keyboard = new Scanner(System.in);
            
            do
            {
                System.out.print(message);
                students = Integer.parseInt(keyboard.nextLine());
                
                if (students < minValue || students > maxValue)
            {
                System.err.printf("Invalid Value.   The acceptable range is between %d and %d.  Please try again\n", minValue, maxValue);
            }
            else
            {
                done = true;
            }
            
        } while (!done);
        
        return students;
       
            
        }
    public static double promptForDouble(String message, double minValue, double maxValue)
    {
        {
            double score=0;
            boolean done = false;
            Scanner keyboard = new Scanner(System.in);
            
            do
            {
                System.out.print(message);
                score = Double.parseDouble(keyboard.nextLine());
                
                if (score < minValue || score > maxValue)
            {
                System.err.printf("Invalid Value.   The acceptable range is between %f and %f.  Please try again\n", minValue, maxValue);
            }
            else
            {
                done = true;
            }
            
        } while (!done);
        
        return score;
       
            
        }  
    }
    }
