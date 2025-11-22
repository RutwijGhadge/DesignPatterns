package Builder;

public class Phone {
    private final String name;
    private final String OS;
    private final int memory;
    private final int battery;
    private final int ram;
    private final int version;
    private final String processor;

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
