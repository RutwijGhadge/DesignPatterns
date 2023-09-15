package Builder;

public class Phone {
    private String name;
    private String OS;
    private int memory;
    private int battery;
    private int ram;
    private int version;
    private String processor;

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", OS='" + OS + '\'' +
                ", memory=" + memory +
                ", battery=" + battery +
                ", ram=" + ram +
                ", version=" + version +
                ", processor='" + processor + '\'' +
                '}';
    }

    public Phone(String name, String OS, int memory, int battery, int ram, int version, String processor) {
        this.name = name;
        this.OS = OS;
        this.memory = memory;
        this.battery = battery;
        this.ram = ram;
        this.version = version;
        this.processor = processor;
    }
}
