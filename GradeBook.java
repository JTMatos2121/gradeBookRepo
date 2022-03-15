    public static void main(String[] args)
    {
//      Initially the program was made to propmtforInteger and asigning them to a variable
////    Then i realized that I was not using the getters and setters 
//      for that reason i have completly changed the program approach 
//      I will continue to work on the program but i dont want to lose more points per date been late
        int numQuizzes = -0;
        int numStudents = 0;
        double scores = 0;
        
        System.out.println("Welcome to Simple Gradebook v2.0");
//      The goal is to use the setters and getters but I fail to visualize the process 
        GradeBook r = new GradeBook();
        
        
        
        
        
        r.getStudents();promptForInteger("Enter the number of students: ",GradeBook.MIN_STUDENTS,GradeBook.MAX_STUDENTS);
        
//        r.setStudents(numStudents);promptForInteger("Enter the number of students: ",GradeBook.MIN_STUDENTS,GradeBook.MAX_STUDENTS);
//        r.setQuizzes(numQuizzes);promptForInteger("Enter the number of quizzes: ",GradeBook.MIN_QUIZZES, GradeBook.MAX_QUIZZES);
  
        System.out.println();
        System.out.println("Input the grades: ");
//        final int NUM_STUDENTS = numStudents;
//        final int NUM_QUIZZES =numQuizzes;
        
        System.out.println("The numbers are "+ numStudent.getStudents());
        
       
        
       
        
        
        
//        for (int numStudent=0; numStudent<NUM_STUDENTS; numStudent++)
//        {
//            for ( numQuizzes=0; numQuizzes<NUM_QUIZZES; numQuizzes++)
//            {
//               GradeBook score1 = new GradeBook();
//               score1.inputGrade(numStudent, numQuizzes, scores);promptForDouble("Enter the score for Student#",GradeBook.MIN_SCORE, GradeBook.MAX_SCORE);
//               
//                
//            }
//            
//            
//           
//        }
        
        
  
        
   
    }
    
//    method to prompt for integer and input validation 
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
//    method to prompt for double and imput validation 
    public static double promptForDouble(String message, double minValue, double maxValue)
    {
        double scores = 0;
        boolean done = false;
        Scanner keyboard = new Scanner(System.in);
        
        do
        {
            System.out.print(message);
            scores = Double.parseDouble(keyboard.nextLine());
            if (scores < minValue || scores > maxValue)
            {
                System.err.printf("Invalid Value.   The acceptable range is between %f and %f.  Please try again\n", minValue, maxValue);
            }
            else
            {
                done = true;
            }
            
        } while (!done);
        
        return scores;
       
    }

    
    
}







