import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
        System.out.print("Enter the number of subject: ");
        int subjectNo = scanner.nextInt();

        if(subjectNo>0){
        int marks[] = new int[subjectNo];
        
        for(int i=0; i<subjectNo; i++){
            System.out.print("Enter the subject " + (i+1) + " marks: ");
            marks[i] = scanner.nextInt();
        }

        int totalMarks = 0;
        for(int mark : marks){
            if(mark<0 || mark>100){
                System.out.println("Please enter marks in range between 1 and 100: ");
                break;
            }
            totalMarks += mark;
        }

        double averagePercentage = (double)totalMarks/(subjectNo*100)*100;

        String grade = "";

        if(averagePercentage>=95){
            grade = "A+";
        }else if(averagePercentage<95 && averagePercentage>=80){
            grade = "A";
        }else if(averagePercentage<80 && averagePercentage>=70){
            grade = "B+";
        }else if(averagePercentage<70 && averagePercentage>60){
            grade = "B";
        }else if(averagePercentage<60 && averagePercentage>50){
            grade = "C";
        }else if(averagePercentage<50 && averagePercentage>40){
            grade = "D";
        }else if(averagePercentage<40 && averagePercentage>=35){
            grade = "E";
        }else if(averagePercentage<35){
            grade = "F";
        }

        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);
        }else{
            System.out.println("There should be atleast one subject to able to calculate grade.");
        }
        scanner.close();
        }catch(NegativeArraySizeException e){
            System.out.println("Ivalid input! Please enter subject number greater than 0.");
        }catch(Exception e){
            System.out.println("Please enter marks in integer only.");
        }
    }
    
}