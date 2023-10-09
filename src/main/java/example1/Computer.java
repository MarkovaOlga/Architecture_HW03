package example1;
// класс Computer содержит только переменные и конструктор с соответстующими параметрами
public class Computer {
    String name;
    String processor;
    int memory_size;
    String operational_system;

    public Computer(String name, String processor, int memory_size, String operational_system) {
        this.name = name;
        this.processor = processor;
        this.memory_size = memory_size;
        this.operational_system = operational_system;
    }
}
