import java.util.ArrayList;

//Крестьянин
public class Peasant extends Person {

    private int arrowsNum;

    boolean inGame = true;
    public Peasant(String name, int x, int y) {
        super(name, 20, 1, rnd.nextInt(1, 100), 0, 20, "nothing", 20, x, y);
    }

    public void giveArrows(int val) {
        this.arrowsNum -= val;
        if(!isInGame()){
            inGame = false;
        }
    }

    public void attack (Person person) {
        person.health -= this.power;
    }

    public boolean isInGame(){
        return this.arrowsNum == 0 ? false : true;
    }


    @Override
    public String toString() { return String.format("[Крестьянин] %s", name);}


}