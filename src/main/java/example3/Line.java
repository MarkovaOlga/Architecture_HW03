package example3;
//для линии реализуем интерфейс ILine и переопределяем только один метод drawLine
public class Line implements ILine{
    @Override
    public void drawLine() {
        System.out.println("Рисование линии");
    }
}
