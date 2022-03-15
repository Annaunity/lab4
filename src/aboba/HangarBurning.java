package aboba;
public class HangarBurning {
    public static void main(String[] args) {
        ProfessorZvezdochkin professorZvezdochkin = new ProfessorZvezdochkin("Профессор Звездочкин", 75);
        Znaika znaika = new Znaika("Знайка", 27);
        Fire fire = new Fire(Things.FLAME);
        Smoke smoke = new Smoke(Things.SMOKE);
        Wood wood = new Wood("дымящихся развалин");
        Hangar hangar = new Hangar("Ангар");
        Shorties shorties = new Shorties("коротышек", 30);

        PersonAmount personAmount = new PersonAmount();

        Spritz spritz = new Spritz("Спрутс", 45);
        Police police = new Police("Полиция", 35);
        City city = new City("Фантомас", 1);
        Rocket rocket = new Rocket("Ракета", 1);
        Astro astro = new Astro("Лунные астронавты", 150);
        Telescopes telescopes = new Telescopes("Гравитонных телескопов", 30);
        Roc roc = new Roc("Локации", Outskirts.FOREST);
        Place place = new Place("Локации", Outskirts.FIELDS);
        Spritz.Commander commander = new Spritz.Commander();
        Znaika.Home homeless = znaika.new Home();

        RocketLand rocketLand = new RocketLand("Ракета");

        System.out.print(astro.notSurprised(astro, rocket, city));
        System.out.print(astro.spot(astro, rocket));
        System.out.println(astro.looking(telescopes, rocket));
        System.out.print(spritz.know(spritz));
        commander.command();
        police.working_police();
        System.out.print(znaika.search(znaika));
        System.out.print(roc.firstFly(place));
        System.out.print(roc.secondFly(roc));
        //local
        class Glade {
            public void SuitableGlade() {
                System.out.println("Ракета нашла удобную полянку для посадки.");
            }
        }
        Glade glade = new Glade();
        glade.SuitableGlade();
        System.out.println(znaika.landing(znaika));
        rocketLand.leanedOn();
        rocketLand.stoppedVertically();
            try {
                rocketLand.landing();
            } catch (RocketLandingException e) {
                System.out.println(e.getMessage());
            }
            homeless.found_home();

            personAmount.personas();
            System.out.print(professorZvezdochkin.sleep(professorZvezdochkin));
            System.out.print(znaika.sleep(znaika));
            System.out.print(znaika.wrapped(znaika));
            System.out.println(znaika.wake(znaika));
            System.out.print(fire.firstRising(fire));
            System.out.print(fire.secondRising(smoke));
            System.out.print(professorZvezdochkin.rushed(professorZvezdochkin));
            System.out.print(professorZvezdochkin.notPayingAttention(professorZvezdochkin));
            System.out.print(professorZvezdochkin.run(professorZvezdochkin));
            System.out.println(hangar.standing(hangar));
            System.out.print(wood.seeing(wood));
            System.out.println(shorties.run(shorties));

        }


    }

