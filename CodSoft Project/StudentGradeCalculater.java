package practice;
import java.util.Scanner;
public class StudentGradeCalculater {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number of subjects");
	int numOfSub = scan.nextInt();
	
	//Taking marks obtained (out of 100) in each subject
	int[] marks = new int[numOfSub];
	for(int i=0; i<numOfSub; i++) {
		System.out.println("Marks obtained out of 100 in subject "+(i+1));
		marks[i]=scan.nextInt();
		
		while(marks[i] < 0 || marks[i] > 100) {
			System.out.println("Invalid marks. Enter marks out of 100 for subject "+(i+1));
			marks[i] = scan.nextInt();
		}
	}
	
	//Sum up the marks obtained in all subjects
	double sum = 0;
	for(int i=0; i<numOfSub; i++) {
		sum += marks[i];
	}
	
	double AvgPercent = sum/numOfSub; 	// Average percentage calculation
	System.out.println("Your Results:\n");
	System.out.println("Total Marks: "+sum);
	System.out.println("Average Percentage: "+AvgPercent);
	
	//Assigning grades based on the average percentage achieved
	if (AvgPercent > 90)
		System.out.println("Grade: O");
	else if (AvgPercent > 80)
		System.out.println("Grade: A");
	else if (AvgPercent > 70)
		System.out.println("Grade: B");
	else if (AvgPercent > 60)
		System.out.println("Grade: C");
	else if (AvgPercent > 50)
		System.out.println("Grade: D");
	else if (AvgPercent <= 50)
		System.out.println("Grade: E");
		
scan.close();
}
}

