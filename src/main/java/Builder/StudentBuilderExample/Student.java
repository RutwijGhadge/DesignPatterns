package Builder.StudentBuilderExample;

public class Student {
    private final int id;
    private final String name;
    private final double psp;
    private final String mentor_name;
    private final int attendance;
    private final String university;
    private final String phoneNumber;

    public Student(int id, String name, double psp, String mentor_name, int attendance, String university, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.psp = psp;
        this.mentor_name = mentor_name;
        this.attendance = attendance;
        this.university = university;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", psp=" + psp +
                ", mentor_name='" + mentor_name + '\'' +
                ", attendance=" + attendance +
                ", university='" + university + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
