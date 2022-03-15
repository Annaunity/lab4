package aboba;
public enum Things {
    FLAME("пламя"),
    SMOKE("дыма");

    private final String things;

    Things(String things) {
        this.things = things;
    }
    public String getThings() {
        return things;
    }
}