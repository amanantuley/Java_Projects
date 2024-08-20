
// Student Grade Calculator 

import java.util.Scanner;




public class student_grade_calculator {
    public static void main(String[] args) {

        // Creating the scanner class 
     Scanner sc = new Scanner(System.in);

        // Entering the number of the subjects to take the input from the user
        System.out.println("Enter the Number of the Subjects ::");
        int sub = sc.nextInt();


        int total = 0;
        int [] marks = new int [sub];

            // Taking marks from the user
        for(int i=0;i<sub;i++)
        {
            System.out.println("Enter Marks of Subject" + (i+1) + "::" );
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        // Calculating the Percentage 
         double percentage = total / sub;

         String g;
        // Assigning the grades to the Percentage
         if(percentage>=75)
         {
            System.out.println("Your class : Distinction");
            g = "A";
         }
         else
         {
            if(percentage>=60)
            {
                System.out.println(" Your class : First class");
                g="B";
            }
            else
            {
                if(percentage>=50)
                {
                    System.out.println("Your Class : Second Class");
                    g="C";
                }
                else
                {
                    if(percentage>=35)
                    {
                        System.out.println(" Your Class : Pass class");
                        g="D";
                    }
                    else
                    {
                        System.out.println("Your class : Sorry you Failed!");
                        g ="F";
                    }
                }
            }
         }
        //  Printing out the Total Marks , Percentage , Grade of the student 
         System.out.println("Total Marks :"  +total);
         System.out.println("Average Percentage :" +percentage );
         System.out.println("Grade :" +g);

         sc.close();


    }
}
