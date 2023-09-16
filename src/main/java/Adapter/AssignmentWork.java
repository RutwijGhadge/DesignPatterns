package Adapter;

public class AssignmentWork {
    private Pen p;//Interface Object

    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {
        this.p = p;
    }

    public void WriteAssignment(String str){
        p.write(str);
    }
}
