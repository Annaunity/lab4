package aboba;
public class Fire extends Material implements Movements {
    public Fire(Things things) {
        super(things);
    }

    @Override
    public String firstRising(Material flame) {
        return "поднимающийся кверху столб " + flame.things.getThings();
    }

    @Override
    public String secondRising(Material smoke) {
        return " и " + smoke.things.getThings();
    }
}
