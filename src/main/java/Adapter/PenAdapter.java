package Adapter;

public class PenAdapter implements Pen{

    PilotPen pp=new PilotPen();//object of 3rd party so that we can call methods of 3rd partyss
    @Override
    public void write(String str) {
        pp.writebyPen(str);
    }
}
