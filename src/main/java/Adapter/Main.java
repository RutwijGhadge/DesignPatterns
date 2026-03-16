package Adapter;

import Adapter.PenExample.AssignmentWork;
import Adapter.PenExample.Pen;
import Adapter.PenExample.PenAdapter;

public class Main {
    public static void main(String[] args) {

        AssignmentWork asw=new AssignmentWork();
        Pen pa=new PenAdapter();//implements a pen
        asw.setP(pa);
        asw.WriteAssignment("Bit tired to write an Assignment");

    }
}
