import java.util.Scanner;
public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tutionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1001;

    //constractor: prompt user to entr students name
        public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.print("1 -Freshman\n2- Sophomore\n3 -Junior\n4 -Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();
        System.out.println(firstName + " "+ lastName + " "+ gradeYear);
        }
        //Generate an id
        private void setStudentID(){
        //grade level + id
        id++;
        this.studentID = gradeYear + "" + id;
         }
        //enroll in courses
        public void enroll(){
        //Get inside a loop hits 0
        do{
            System.out.print("Enter course to enroll(Q to quit):");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")){
                courses = courses + "\n" + course;
                tutionBalance = tutionBalance + costOfCourse;
            }
                else{
                     break;
                 } 

        }while(1 != 0);
        }
        //view balance
        public void viewBalance(){
        System.out.println("Your balance is: $" + tutionBalance);
        } 
        //pay tution
       public void payTution(){
       viewBalance();
       System.out.print("Enter your payment: $");
       Scanner in = new Scanner(System.in);
       int payment = in.nextInt();
       tutionBalance = tutionBalance - payment;
       System.out.println("Thank you for your payment of $"+ payment);
       viewBalance();
        }
        //show status
        public String toString(){
        return "Name: " + firstName + " " + lastName + "\nGrade level: " + gradeYear + "\nCourses Enrolled:" + courses
        + "\nBalance: $" + tutionBalance;
        }
   }
