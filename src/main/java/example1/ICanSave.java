package example1;

public interface ICanSave {
    // метод, который будем переопреденять в дочерних классах
    // в него передаем путь, куда сохраняем данные, и сам объект
    void save(String filePath, Computer cmp);
}
