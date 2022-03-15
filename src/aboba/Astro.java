package aboba;
public class Astro extends CosmoObjects implements AstroAct {
    public Astro(String name, int count) {
        super(name, count);
    }

    @Override
    public String notSurprised(CosmoObjects astro, CosmoObjects rocket, CosmoObjects city) {
        return astro.getName() + " не были удивлены появлению " + rocket.getName() + " над городом " + city.getName() + ". ";
    }

    @Override
    public String spot(CosmoObjects astro, CosmoObjects rocket) {
        return "В свое время " + astro.getName() + " засекли куда прилунилась " + rocket.getName() + ". ";
    }

    @Override
    public String looking(CosmoObjects telescopes, CosmoObjects rocket) {
        return telescopes.getCount() + " " + telescopes.getName() + " наблюдали за " + rocket.getName() + ". ";
    }
    @Override
    public String land(CosmoObjects rocket) {
        return rocket.getName() + " оперлась хвостом о почву и остановилась в вертикальном положении. ";
    }
}
