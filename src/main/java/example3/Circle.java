package example3;
//для круга реализуем интерфейс ICircle и переопределяем только один метод drawCircle
public class Circle implements ICircle{
    @Override
    public void drawCircle() {
        System.out.println("Рисование круга");
    }
}
