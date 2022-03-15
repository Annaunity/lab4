package aboba;
public class Shorties extends Human implements ShortiesAct {
    public Shorties(String name, int age) {
        super(name, age);
    }

    @Override
    public String run(Human shorties){
        return "К месту проишествия уже подбежали " + shorties.getAge() + " " + shorties.getName() + ".";
    }

}

