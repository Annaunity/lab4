package aboba;
public class Police extends Human {
    public Police(String name, int age) {
        super(name, age);
    }
//non-static
    private class Work {
        public void working() {
            System.out.println("Полиция была поднята на ноги как только корабль Знайки поднялся над Фантомасом");
        }
    }

    void working_police() {
        Work worker = new Work();
        worker.working();
    }
}