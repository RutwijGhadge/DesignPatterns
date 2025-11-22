package Builder.StudentBuilderExample;

public class main {
    public static void main(String[] args) {
        StudentBuilder studentBuilder=new StudentBuilder();
       Student student=new StudentBuilder()
               .setId(1)
               .setAttendance(98)
               .setMentor_name("Pradnya")
               .setPhoneNumber("8308123645")
               .setDivision(2)
               .setUniversity("PUNE University")
               .getStudent();
       System.out.println(student.toString());
    }
}
