package Builder.StudentExample;

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

/*
Once upon a time, there was a developer who thought code was too complex.
She wanted a way to create objects without the hassle of defining their properties every time.
Then, she discovered the 𝐁𝐮𝐢𝐥𝐝𝐞𝐫 𝐃𝐞𝐬𝐢𝐠𝐧 𝐏𝐚𝐭𝐭𝐞𝐫𝐧 🚀
The Builder design pattern is a classic pattern in software engineering that helps build complex objects
using simple steps.
Here's how it works:
Suppose you need to create a complex object with many optional attributes.
Instead of having multiple constructors with different parameters, you can use the builder design pattern.
First, create a builder class that matches the complex object’s structure.
Each attribute has a method that can set its value.
Next, create a director class that will use the builder class to create objects.
It has a set of methods that define the order in which the builder's methods will be called.
Finally, call the director's method to build the object instance.

Here's an example:

public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private boolean isElectric;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    // Getters and setters omitted for conciseness
    public static class Builder {
        private String make;
        private String model;
        private int year;
        private String color;
        private boolean isElectric;

        public Builder(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public Builder withColor(String color) {
            this.color = color;
            return this;
        }

        public Builder withElectric(boolean electric) {
            isElectric = electric;
            return this;
        }

        public Car build() {
            Car car = new Car(make, model, year);
            car.setColor(color);
            car.setElectric(isElectric);
            return car;
        }
    }

    public static void main(String[] args) {
        Car car = new Car.Builder("Tesla", "Model S", 2023)
                .withColor("Red")
                .withElectric(true)
                .build();
    }
}
 */