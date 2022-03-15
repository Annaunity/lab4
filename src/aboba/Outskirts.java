package aboba;
public enum Outskirts {
    FIELDS("Поля"),
    FOREST("Леса");

    private final String outskirts;

    Outskirts(String outskirts) {
        this.outskirts = outskirts;
    }
    public String getOutskirts() {
        return outskirts;
    }
}