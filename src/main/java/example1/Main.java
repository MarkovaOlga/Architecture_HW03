package example1;

public class Main {
    public static void main(String[] args) {
        // создаем экземпляр класса Computer
        Computer computer = new Computer("Dell XPS", "Intel", 8000, "Windows");
        // используем интерфейс и создадим экземпляр того класса, куда будем сохранять объект
        ICanSave saver = new SaveToDatabase();
        // вызываем нужный метод, передаем путь файла и оъект, который хотим сохранить
        saver.save("out.dat", computer);
    }
}
