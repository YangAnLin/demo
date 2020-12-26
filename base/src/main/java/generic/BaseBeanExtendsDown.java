package generic;

public class BaseBeanExtendsDown<T extends String> {

    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
