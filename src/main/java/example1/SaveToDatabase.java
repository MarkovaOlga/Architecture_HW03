package example1;
// узкоспециализированный класс, сохраняющий компьютер в базу данных, реализуюет интерфейс ICanSave
public class SaveToDatabase implements ICanSave{
    // переопределяемый метод save принимает следующие параметры: путь к файлу и сам оъект компьютер
    // после чего выводит соответствуещее сообщение
    public void save(String filePath, Computer cmp) {
        System.out.println("Сохранение в Базу данных " + filePath + ", " + cmp);
    }
}
