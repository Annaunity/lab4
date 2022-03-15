package aboba;
public class RocketLand {
    String name;
    boolean wasLeanedOn;
    boolean wasStoppedVertically;

    public RocketLand(String name) {
        this.name = name;
    }

    public void leanedOn() {
        System.out.println("Ракета оперлась хвостом о почву");
        this.wasLeanedOn = true;
    }

    public void stoppedVertically() {
        System.out.println("Остановилась в вертикальном положении");
        this.wasStoppedVertically = true;
    }

    public void landing() throws RocketLandingException {
        if (wasStoppedVertically & wasLeanedOn) {
            System.out.println("Ракета совершила посадку");
        }
        else {
            throw new RocketLandingException("Ракета не совершила посадку");
        }
    }
}
