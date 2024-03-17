import java.util.ArrayList;

public class Monk extends Person {
    private int mana;
    private int healVal;
    int healPrice;
    public Monk(String name, int x, int y) {
        super(name, 80, 30, rnd.nextInt(1, 100), 30, 50, "pike", 20, x, y);
    }

    public void heal(Person person){
        person.health += this.healVal;
        this.mana -= price("heal");
    }

    public void heal(){
        super.health +=this.healVal;
        this.mana -= price("heal");
    }

    private int price(String action){
        if (action == "heal") return healPrice;
        return 0;
    }


    @Override
    public String toString() { return String.format("[Монах] %s", name);}
}
