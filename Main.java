public class Main {

  public static void main(String[] args) {
    double totalMarks = 500.0; // Total marks possible
    double obtainedMarks = 385.0; // Marks obtained by the student
    double percentage = (obtainedMarks / totalMarks) * 100; // Calculate percentage
    System.out.printf("The percentage is: %.2f%%\n", percentage); // Print the percentage with two decimal places
  }

}