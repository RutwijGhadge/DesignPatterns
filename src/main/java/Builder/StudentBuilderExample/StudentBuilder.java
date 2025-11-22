package Builder.StudentBuilderExample;

public class StudentBuilder {
    private int id;
    private String name;
    private double psp;
    private String mentor_name;
    private int attendance;
    private String university;
    private String phoneNumber;
    private long PRNNumber;
    private int division;

    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setPsp(double psp) {
        this.psp = psp;
        return this;
    }

    public StudentBuilder setMentor_name(String mentor_name) {
        this.mentor_name = mentor_name;
        return this;
    }

    public StudentBuilder setAttendance(int attendance) {
        this.attendance = attendance;
        return this;
    }

    public StudentBuilder setUniversity(String university) {
        this.university = university;
        return this;
    }

    public StudentBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public StudentBuilder setPRNNumber(long PRNNumber) {
        this.PRNNumber = PRNNumber;
        return this;
    }

    public StudentBuilder setDivision(int division) {
        this.division = division;
        return this;
    }

    public Student getStudent(){
        return new Student(id,name,psp,mentor_name,attendance,university,phoneNumber);
    }

    @Override
    public String toString() {
        return "StudentBuilder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", psp=" + psp +
                ", mentor_name='" + mentor_name + '\'' +
                ", attendance=" + attendance +
                ", university='" + university + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", PRNNumber=" + PRNNumber +
                ", division=" + division +
                '}';
    }
}
