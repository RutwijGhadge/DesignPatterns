package Builder;

public class PhoneBuilder {
    private String name;
    private String OS;
    private int memory;
    private int battery;
    private int ram;
    private int version;
    private String processor;

    public PhoneBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PhoneBuilder setOS(String OS) {
        this.OS = OS;
        return this;
    }

    public PhoneBuilder setMemory(int memory) {
        this.memory = memory;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setVersion(int version) {
        this.version = version;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public Phone getPhone(){
        return new Phone(name,OS,memory,battery,ram,version,processor);
    }

}
