import java.util.ArrayList;

public class Pikeman extends Person{

    protected int ammo;

    private int arrowsNum;
    boolean inGame = true;

    public Pikeman(String name, int x, int y) {
        super(name, 80, 30, rnd.nextInt(1, 100), 30, 50, "pike", 20, x, y);
    }

    public void attack(Person person) {
        person.health -= this.power;
    }

    public void giveArrows(int val) {
        this.arrowsNum -= val;
        if(!isInGame()){
            inGame = false;
        }
    }

    public boolean isInGame(){
        return this.arrowsNum == 0 ? false : true;
    }


    @Override
    public String toString() { return String.format("[Арбалетчик] %s", name);}
}
