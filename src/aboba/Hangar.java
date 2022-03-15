package aboba;
public class Hangar extends Location implements Localization {
    public Hangar(String name) {
        super(name);
    }

    @Override
    public String standing(Location hangar){
        return "где раньше стоял " + hangar.getName() + ", ";
    }
}
