public class GradeBookClass
{
    
    final public static double MAX_SCORE = 100.0;
    final public static double MIN_SCORE = 0.0;
    
    final public static int MAX_STUDENTS = 10;
    final public static int MIN_STUDENTS = 1;
    
    final public static int MAX_QUIZZES = 5;
    final public static int MIN_QUIZZES = 1;
    
    private int pfvStudents;
    private int pfvQuizzes;
    private double scores[][];
    
    public GradeBook2()
    {
      pfvStudents = ++pfvStudents;
    }
    public GradeBook2(int students, int quizzes)
    {
        pfvStudents = students;
        pfvQuizzes = quizzes;
    }
    
         
    

    
    public void setStudents(int students)
    {
        if (students <= 0)
        {
            System.err.println("Value must be above zero");
            return;
        }
       pfvStudents = students;
    }
   
    public void setQuizzes(int quizzes)
    {
        if (quizzes <= 0)
        {
            System.out.println("Value must be above zero");
            return;
        }
        pfvQuizzes = quizzes;
    }
    
    public int getStudents()
    {
        return pfvStudents;
    }
    
    public int getQuizzes()
    {
        return pfvQuizzes;
    }
    
    
    public void inputGrade(int studentNum, int quizNum, double score)
    {
      
    }
   
        
    
    public double calcAvgScore()
    {
        double answer = 0.0;
        answer = scores / getQuizzes();
        
        return answer;
        
       
    }
    
}
