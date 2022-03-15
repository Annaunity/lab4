package aboba;
public class Wood extends Location implements WoodCondition {
    public Wood(String name) {
        super(name);
    }

    @Override
    public String seeing(Location wood) {
        return "увидели груду " + wood.getName() + ". ";
    }
}