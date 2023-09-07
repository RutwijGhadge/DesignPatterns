package Prototype_and_Registry;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        RegistryStudent registryStudent=new RegistryStudent();
        Student s = new Student();
       // s.clone();
        List<Student> studentList=new ArrayList<Student>();
        for(int i=0;i<100;i++){
            studentList.add(s.clone());
        }

        Student oct23=new Student(1,"Rutwij",98,"Oct22","DSA",35,2012,"Python","YASH",2023,"xyz",90);
        Student aug23=new Student(1,"Rutwij",98,"Aug22","LLD",35,2012,"java","sandeep",2023,"xyz",90);

        registryStudent.addregistery(oct23.getBatchname(),oct23);//key value pair
        registryStudent.addregistery(aug23.getBatchname(),aug23);

        Student sandyAug22=registryStudent.getfromregistry("Aug22").clone();

        //if the sandy is the student of batch Aug22 then I can simply do the clone of aug22 batch student and change
        //only change the specific attributes

        sandyAug22.setId(5);
        sandyAug22.setStreak(55);
        sandyAug22.setName("Sandy");

        System.out.println(sandyAug22);
        //Student{id=5, name='Sandy', psp=0, batchname='Aug22', Module='LLD', streak=55, joinyear=2012,
        // track='java', instructorname='sandeep',
        // completionyear=2023, paymentpartner='xyz', batchpsp=90}
    }

}
