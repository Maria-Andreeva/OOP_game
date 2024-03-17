import java.util.ArrayList;

//Разбойник
public class Robber extends Person {
    public Robber (String name, int x, int y) {
        super (name, 100, 10, rnd.nextInt(1, 100), 20, 40,  "knife", 50, x, y);
    }

    public void attack (Person person) {
        person.health -= this.power;
    }
    public void stealGold(int val) {
        super.gold += val;
    }


    @Override
    public String toString() { return String.format("[Вор] %s", name);}
}
