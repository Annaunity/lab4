package aboba;
public class Place {
    private final String name;
    protected Outskirts outskirts;

    public Place(String name, Outskirts outskirts) {
        this.name = name;
        this.outskirts = outskirts;
    }
    public String getName() {
        return name;
    }
}
