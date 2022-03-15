package aboba;
public class Spritz extends Human implements Decisions {
    public Spritz(String name, int age) {
        super(name, age);
    }

    @Override
    public String know(Human human) {
        return human.getAge() + "-ти летний " + human.getName() + " узнал, что космический корабль прилунился. ";
    }
//static
    public static class Commander {
        public static void command() {
            System.out.println("Спрутс отдал приказ полиции.");
        }
    }
}

