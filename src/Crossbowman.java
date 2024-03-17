import java.util.ArrayList;

public class Crossbowman extends Person{

    public Crossbowman(String name, int x, int y) {

        super(name, 60, 40, rnd.nextInt(1, 100), 20,40, "gun", 40, x, y);
    }
    public void attack(Person person) {
        person.health -= this.power;
    }


    @Override
    public String toString() { return String.format("[Копейщик] %s", name);}
}



