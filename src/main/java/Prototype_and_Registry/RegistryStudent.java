package Prototype_and_Registry;

import java.util.HashMap;

public class RegistryStudent {
    //
    private HashMap<String,Student>studentRegistry;
    //Storing the Objects in the HashMap with key And value as Object

    public RegistryStudent() {
        this.studentRegistry = new HashMap<>();
    }

    public Student addregistery(String key,Student student) throws Exception {
        if(studentRegistry.containsKey(key)) {
            throw new Exception("Key Already Present");
        }
        else{
            studentRegistry.put(key,student);
        }
        return student;
    }
    public Student getfromregistry(String key) throws Exception {
        if(!studentRegistry.containsKey(key)){
            throw new Exception("Student for the key does not exists");
        }
        else{
            return studentRegistry.get(key);
        }
    }
}
