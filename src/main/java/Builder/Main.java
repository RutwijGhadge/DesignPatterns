package Builder;

public class Main {
    public static void main(String[] args) throws InvalidAgeException, InvalidPspException {
       /* Student student=Student.builder()
                .setId(1)
                .setAge(25)
                .setBatch("LLD")
                .setEmail("arun@tcs.com")
                .setPsp(73)
                .setphonenumber(1234567)
                .build();   //validate method will be called here
        System.out.println(student.toString());*/

        Phone p=new PhoneBuilder()
                .setOS("Windows")
                .setBattery(4500)
                .setMemory(8)
                .setName("Micro max")
                .getPhone();

        System.out.println(p);
        //getphone method in the PhoneBuilder class  will give the PHONE type Object


        /*problem Solved by Builder pattern:
        Imagine a complex object that requires laborious, step-by-step initialization of many fields and
        nested objects. Such initialization code is usually buried inside a monstrous constructor with lots
        of parameters. Or even worse: scattered all over the client code.


        if validation gets successful then the student object gets created
        else it will throw the exceptions
        also follows OCP as you dont need to modify the code as in when if
        some of the attributes are not present in the object


        Builder Design Pattern:
        1. Validate the Attributes before the obj gets created
        2. makes the Data & code Readable and Intuitive
        3. make things/class immutable
         */
    }
}
