package example2;
//
public class Main {
    public static void main(String[] args) {
        // создаем модель формы и передаем ей значения
        ModelForm f = new ModelForm(1, 35, "Ivanov");
        WebFramework w = new WebFramework();
        // передаем форму для сохранения
        w.save(f);
    }
}
