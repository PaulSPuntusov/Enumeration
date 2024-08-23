public class Spice {
    String degree;
    public static final Spice MAXIMUM = new Spice("очень острый");
    public static final Spice MEDIUM = new Spice("острый");
    public static final Spice MINIMUM = new Spice("не острый");

    private Spice(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return " ' " + degree + " ' ";
    }
}
