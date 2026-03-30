package _38Generics.BoundedTypeParameters;

public class box<N extends Number> { // Number -> Super Class (integer, double, float, long all extends Number Class)
    private N value;

    public N getValue() {
        return value;
    }

    public void setValue(N value) {
        this.value = value;
    }
}
