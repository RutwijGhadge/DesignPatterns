package Builder;

public class Student {
    private int id;
    private String name;
    private String email;
    private int age;
    private String batch;
    private int phonenumber;
    private String university;
    private int psp;

    public Student(int id, String name, String email, int age, String batch, int phonenumber, String university, int psp) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.batch = batch;
        this.phonenumber = phonenumber;
        this.university = university;
        this.psp = psp;
    }
    public static Builder builder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", batch='" + batch + '\'' +
                ", phonenumber=" + phonenumber +
                ", university='" + university + '\'' +
                ", psp=" + psp +
                '}';
    }

    public static class Builder{
        private int id;
        private String name;
        private String email;
        private int age;
        private String batch;
        private int phonenumber;
        private String university;
        private int psp;


        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Builder setphonenumber(int phonenumber) {
            this.phonenumber = phonenumber;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setPsp(int psp) {
            this.psp = psp;
            return this;
        }

        public void validate() throws InvalidAgeException, InvalidPspException {//validation class
            if(age<18){
                throw new InvalidAgeException();
            }
            if(psp<70){
                throw new InvalidPspException();
            }
        }
        public Student build() throws InvalidAgeException, InvalidPspException {
            validate();//validation will be done before the object of the student is created
            return new Student(this.id,this.name,this.email,this.age,this.batch,this.phonenumber,this.university,this.psp);
        }
    }
}
