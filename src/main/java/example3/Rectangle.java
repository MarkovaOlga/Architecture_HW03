package example3;
//для прямоугольника реализуем интерфейс IRect и переопределяем только один метод drawRect
public class Rectangle implements IRect{
    @Override
    public void drawRect() {
        System.out.println("Рисование прямоугольника");
    }
}
