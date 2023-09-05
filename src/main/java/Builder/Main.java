package Builder;

public class Main {
    public static void main(String[] args) throws InvalidAgeException, InvalidPspException {
        Student student=Student.builder()
                .setId(1)
                .setAge(25)
                .setBatch("LLD")
                .setEmail("arun@tcs.com")
                .setPsp(73)
                .setphonenumber(1234567)
                .build();   //validate method will be called here
        System.out.println(student.toString());


        //if validation gets successful then the student object gets created
        //else it will throw the exceptions
        //also follows OCP as you dont need to modify the code as in when if
        // some of the attributes are not present in the object

        /*
        Builder Design Pattern:
        1. Validate the Attributes before the obj gets created
        2. makes the Data & code Readable and Intuitive
        3. make things/class immutable
         */
    }
}
