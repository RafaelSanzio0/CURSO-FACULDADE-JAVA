package Abstract;

public enum Color {
    BLACK(1),
    RED(2),
    BLUE(3);

    public int value;

    Color(int value){ this.value = value; }
    public int getValor() { return value; }
}
