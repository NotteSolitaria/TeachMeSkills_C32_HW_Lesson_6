package task_0;

/**
 * Create a class to describe a student in our group.
 * Class fields: first name, last name, passport number, group name (you can add your own fields if desired - for example, age).
 * Create objects of this class for each student in our group.
 * Place all these objects into an array.
 * Loop through the array with a for loop and print the information to the console.
 */

public class Student {
    public static void main(String[] args) {

        StudentInformation student_1 = new StudentInformation("Igor", "Kiesel", "4676470");
        StudentInformation student_2 = new StudentInformation("Daniil", "Salvatore", "7847398");
        StudentInformation student_3 = new StudentInformation("Katya", "Lesli", "8843990");

        StudentInformation[] studentArray = {student_1, student_2, student_3};

        StudentInformation.OutputOfStudents(studentArray);

    }
}
