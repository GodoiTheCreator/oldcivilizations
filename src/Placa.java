public class Placa {
    int a, b;

    Placa(int a, int b) {
        this.a = a;
        this.b = b;
    }

    Placa inverter() {
        return new Placa(b, a);
    }

    @Override
    public String toString() {
        return "[" + a + ", " + b + "]";
    }
}
