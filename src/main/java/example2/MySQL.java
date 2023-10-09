package example2;
// реализовываем класс, через который мы будем работать с базой данных, от интерфейса ISQL

public class MySQL implements ISQL{
    //в методе save прописываем IForm, в результате чего класс становится универсальным
    public void save(IForm frm) {
        System.out.println("Запись формы в базу данных");
    }
}
