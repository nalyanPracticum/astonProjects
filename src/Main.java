
public class Main {
    public static void main(String[] args) {

        MutableClass data = new MutableClass(10);

        ImmutableClass immutable = new ImmutableClass(data);

        System.out.println("Изначальное значение: " + immutable.getData().getValue());

        //проверка на неизменяемость
        data.setValue(20);
        System.out.println("Значение после попытки изменения: " + immutable.getData().getValue());
    }
}