import java.util.*;

public class Grade_calculator {

    static String courseList[];
    static double scoreList[];
    static String grade[];
//  static ArrayList display = new ArrayList<>();

    static Scanner scan = new Scanner(System.in);

    public static void main(String []args){

        System.out.println("Please insert your name");
        String studentName = scan.next();

        addCourse(studentName);
    }

    private static void gradeCalculator(int studentreq, double scorelist[]) {

            grade = new String[scoreList.length];


        for (int i = 0; i < scoreList.length; i++) {

            if (scorelist[i] >= 90)
                grade[i] = "A";

            else if (scorelist[i] >= 80 && scorelist[i] < 90)
                grade[i] = "B";

            else if (scorelist[i] >= 70 && scorelist[i] < 80)
                grade[i] = "C";

            else if (scorelist[i] >= 60 && scorelist[i] < 70)
                grade[i] = "D";

            else if (scorelist[i] < 60)
                grade[i] = "F";
        }

        System.out.println(Arrays.asList(courseList[studentreq-1], grade[studentreq-1]));
        //System.out.println(courseList[studentreq-1] + ", " + grade[studentreq-1]);
            }

    private static void viewCourseRequest(double score[]) {

        System.out.println("Please select a course you want to be displayed with the mark");

        for (int i = 0; i < courseList.length; i++) {
            System.out.println((i+1) + ". " + courseList[i] + "\n");
        }
        int studentRequest = scan.nextInt();

        gradeCalculator(studentRequest, scoreList);

}
    private static void gradeScore() {

        scoreList = new double[courseList.length];

        for (int i = 0; i < courseList.length; i++) {
            System.out.println("Please Insert the Grade score for " + courseList[i] + " course");
            scoreList[i] = scan.nextDouble();

        }
        viewCourseRequest(scoreList);
    }

    private static void addCourse(String studentName) {
        System.out.println(studentName + " Please insert the number of courses you take");
    int number = scan.nextInt();
        courseList = new String [number];

        for (int i = 0; i < number; i++) {

            System.out.println("Please insert a course Name");
            String courseName = scan.next();
            courseList[i] = courseName;
        }

        gradeScore();

    }
}
