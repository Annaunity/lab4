package aboba;
public class Znaika extends Human implements ZnaikasAct {

    public Znaika(String name, int age) {
        super(name, age);
    }

    @Override
    public String search(Human znaika) {
        return znaika.getName() + " начал подыскивать удобное место для посадки. ";
    }

    @Override
    public String landing(Human znaika) {
        return znaika.getName() + " начал приземление. ";
    }

    @Override
    public String sleep(Human znaika) {
        return ", как и " + znaika.getName() + ", оказался спящим на полу. ";
    }

    @Override
    public String wrapped(Human znaika) {
        return "Закутавшись в одеяло, ";
    }

    @Override
    public String wake(Human znaika) {
        return znaika.getName() + " моментально выскочил во двор и увидел";
    }

    //anon
    public class Home {
        public void found_home() {
            System.out.println("На полянке Знайка увидел домик и решил, что теперь будет жить там");
        }
    }

}
