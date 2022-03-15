package aboba;
public class Roc extends Place implements RocMovements {
    public Roc(String name, Outskirts outskirts) {
        super(name, outskirts);
    }
    @Override
    public String firstFly(Place forest) {
        return "Ракета пролетела мимо " + forest.getName() + " " + forest.outskirts.getOutskirts() + ". ";
    }
    @Override
    public String secondFly(Place fields) {
        return "Ракета пролетела мимо " + fields.getName() + " " + fields.outskirts.getOutskirts() + ". ";
    }
    @Override
    public String thirdFly(Place glade) {
        return "Ракета нашла " + glade.getName() + " " + glade.outskirts.getOutskirts() + " удобную для посадки. ";
    }
}