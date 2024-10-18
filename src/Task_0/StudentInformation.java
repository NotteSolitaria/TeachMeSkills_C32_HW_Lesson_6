package Task_0;

public class StudentInformation {

    String name;
    String surname;
    String passportNum;
    String groupName = "C32-onl";

    StudentInformation(String name, String surname, String passportNum) {
        this.name = name;
        this.surname = surname;
        this.passportNum = passportNum;
    }

    static void OutputOfStudents(StudentInformation[] outputArray) {
        for (StudentInformation outputOfInfo : outputArray) {
            System.out.println(outputOfInfo.name + " " + outputOfInfo.surname + " " + outputOfInfo.passportNum + " " + outputOfInfo.groupName);
        }
    }

}
