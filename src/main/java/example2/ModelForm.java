package example2;
// создаем класс ModelForm(класс для модели), унаследованный от IForm
// указываем атрибуты и конструктор
public class ModelForm implements IForm{
    int id;
    int old;
    String fio;

    public ModelForm(int id, int old, String fio) {
        this.id = id;
        this.old = old;
        this.fio = fio;
    }
}
