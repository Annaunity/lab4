package aboba;
public class ProfessorZvezdochkin extends Human implements ProfessorAct {
    public ProfessorZvezdochkin(String name, int age) {
        super(name, age);
    }

    @Override
    public String sleep(Human professorZvezdochkin) {
        return professorZvezdochkin.getName() + ", который спал в той же комнате";
    }

    @Override
    public String notPayingAttention(Human professorZvezdochkin) {
        return " не обращая внимания на падавшие сверху обломки дерева";
    }

    @Override
    public String rushed(Human professorZvezdochkin) {
        return ". Они бросились вперед,";
    }

    @Override
    public String run(Human professorZvezdochkin) {
        return ", и, подбежав к месту, ";
    }
}

