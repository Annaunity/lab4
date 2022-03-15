package aboba;
public class PersonAmount extends RuntimeException {
    int amount = 2;
    public PersonAmount(){
    }
    public void personas() throws PersonAmountException {
        if(amount == 2) {
            System.out.println("Жители дома: Знайка, Профессор Звездочкин");
        } else {
            throw new PersonAmountException("В этом доме не живет такое количество людей");
        }
    }
}