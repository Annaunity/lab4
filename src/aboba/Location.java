package aboba;
public abstract class Location {
    private final String name;
    public Location(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Локация: " + name;
    }

    public String getName() {
        return name;
    }
}
