package example1;
// класс Computer содержит только переменные и конструктор с соответстующими параметрами
public class Computer {
    String name;
    String processor;
    int memorySize;
    String operationalSystem;

    public Computer(String name, String processor, int memorySize, String operationalSystem) {
        this.name = name;
        this.processor = processor;
        this.memorySize = memorySize;
        this.operationalSystem = operationalSystem;
    }
}
