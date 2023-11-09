package task2;
import java.util.Scanner;

public class SGC {
    public static void main(String[]args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the student's name: ");
            String name = scanner.nextLine();
            System.out.println("Enter the student's grade in English: ");
            int englishGrade = scanner.nextInt();
            System.out.println("Enter the students grade in math: ");
            int mathGrade = scanner.nextInt();
            System.out.println("Enter the students grade in science: ");
            int scienceGrade = scanner.nextInt();
            int totalGrade = englishGrade + mathGrade + scienceGrade;
            double averageGrade = (double) totalGrade / 3;

            System.out.println("The student's name is " + name + ".");
            System.out.println("The student's average grade is " + averageGrade + ".");
        }
    }
}
