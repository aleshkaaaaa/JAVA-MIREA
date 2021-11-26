public class Shirt {


    enum Color {
        Black,
        White,
        Green,
        Orange,
        Blue,
        Maroon,
        Tan
    }

    enum Size {
        S,
        M,
        L,
        XL
    }

    private String id;
    private String name;
    private Color color;
    private Size size;

    public Shirt(String id, String name, Color color, Size size) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public static Shirt parse(String shirt) {
        String[] split = shirt.split(",");
        return new Shirt(split[0], split[1], Color.valueOf(split[2]), Size.valueOf(split[3]));
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", color=" + color +
                ", size=" + size +
                '}';
    }
}