package education01;

public class Square {

    public double l;

    public Square(double l) { // Конструктор
        this.l=l; // Первый - атрибут, второй - значение
    }
    public double area() {
        return this.l * this.l;
    }
}
