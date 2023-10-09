package example1;
// узкоспециализированный класс, сохраняющий компьютер в файл, реализуюет интерфейс ICanSave
public class SaveToFile implements ICanSave {
    // переоределяемый метод save принимает следующие параметры: путь к файлу и сам оъект компьютер
    // после чего выводит соответствуещее сообщение
    public void save(String filePath, Computer cmp) {
        System.out.println("Сохранение в Файл " + filePath + ", " + cmp);
    }
}