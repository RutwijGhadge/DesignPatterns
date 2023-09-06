package Prototype_and_Registry;

public class Student implements Prototype<Student>{
    private int id;
    private String name;
    private int psp;
    private String batchname;
    private String Module;
    private int streak;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public void setBatchname(String batchname) {
        this.batchname = batchname;
    }

    public void setModule(String module) {
        this.Module = module;
    }

    public void setStreak(int streak) {
        this.streak = streak;
    }

    public void setJoinyear(int joinyear) {
        this.joinyear = joinyear;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public void setInstructorname(String instructorname) {
        this.instructorname = instructorname;
    }

    public void setCompletionyear(int completionyear) {
        this.completionyear = completionyear;
    }

    public void setPaymentpartner(String paymentpartner) {
        this.paymentpartner = paymentpartner;
    }

    public Student() {
    }

    public Student(int id, String name, int psp, String batchname, String module, int streak,
                   int joinyear, String track, String instructorname, int completionyear,
                   String paymentpartner, int batchpsp) {
        this.id = id;
        this.name = name;
        this.psp = psp;
        this.batchname = batchname;
        Module = module;
        this.streak = streak;
        this.joinyear = joinyear;
        this.track = track;
        this.instructorname = instructorname;
        this.completionyear = completionyear;
        this.paymentpartner = paymentpartner;
        this.batchpsp = batchpsp;
    }

    public void setBatchpsp(int batchpsp) {
        this.batchpsp = batchpsp;
    }

    private int joinyear;
    private String track;
    private String instructorname;
    private int completionyear;
    private String paymentpartner;
    private int batchpsp;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPsp() {
        return psp;
    }

    public String getBatchname() {
        return batchname;
    }

    public String getModule() {
        return Module;
    }

    public int getStreak() {
        return streak;
    }

    public int getJoinyear() {
        return joinyear;
    }

    public String getTrack() {
        return track;
    }

    public String getInstructorname() {
        return instructorname;
    }

    public int getCompletionyear() {
        return completionyear;
    }

    public String getPaymentpartner() {
        return paymentpartner;
    }

    public int getBatchpsp() {
        return batchpsp;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", psp=" + psp +
                ", batchname='" + batchname + '\'' +
                ", Module='" + Module + '\'' +
                ", streak=" + streak +
                ", joinyear=" + joinyear +
                ", track='" + track + '\'' +
                ", instructorname='" + instructorname + '\'' +
                ", completionyear=" + completionyear +
                ", paymentpartner='" + paymentpartner + '\'' +
                ", batchpsp=" + batchpsp +
                '}';
    }

    @Override
    public Student clone(){
        Student s=new Student();
        s.setId(this.id);
        s.setBatchname(this.batchname);
        s.setBatchpsp(this.batchpsp);
        s.setCompletionyear(this.completionyear);
        s.setInstructorname(this.instructorname);
        s.setModule(this.Module);
        s.setJoinyear(this.joinyear);
        s.setName(this.name);
        s.setPaymentpartner(this.paymentpartner);
        s.setStreak(this.streak);
        s.setTrack(this.track);
        return s;
    }

}
