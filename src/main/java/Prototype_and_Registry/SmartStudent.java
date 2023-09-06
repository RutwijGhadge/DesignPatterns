package Prototype_and_Registry;

public class SmartStudent extends Student{
    private int iq;

    public SmartStudent(int id, String name, int psp, String batchname, String module, int streak, int joinyear, String track, String instructorname, int completionyear, String paymentpartner, int batchpsp, int iq) {
        super(id, name, psp, batchname, module, streak, joinyear, track, instructorname, completionyear, paymentpartner, batchpsp);
        this.iq = iq;       //ONLY iq attribute is taken
    }


    @Override
    public SmartStudent clone() {
        return null;
    }
}
