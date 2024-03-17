import java.util.ArrayList;
import java.util.Random;

public abstract class Person{

    protected static Random rnd;
    static {
        rnd = new Random();
    }

    private final int curX;
    private final int curY;

    protected String name;

    public int priority;
    protected int health;
    protected int maxHealth;
    protected int power;
    protected int age;
    protected int armor;
    protected int endurance; // Выносливость
    protected String weapon;
    protected int gold;
    protected Point2D position;



    public Person(String name, int health, int power, int age, int armor, int endurance, String weapon, int gold, int x, int y) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.age = age;
        this.armor = armor;
        this.endurance = endurance; // Выносливость
        this.weapon = weapon;
        this.gold = gold;

        position = new Point2D(x,y);
        this.curX = x;
        this.curY = y;

    }

    protected int getRound(int origin, int percent)
    {
        if (percent > origin)
            return origin;
        int n = (origin * percent) / 100;
        return origin + (rnd.nextInt(0, n * 2+1)- n);
    }




    public void setPosition(int x, int y) {
        position.setX(x);
        position.setY(y);
    }

    public Point2D getPosition()
    {
        return position;
    }


    public void healed(int health)
    {
        this.health = Math.min(this.health +health, this.maxHealth);
    }

    public Person findNearestPerson(ArrayList<Person> persons)
    {
        Person target = null;
        float minDistance = Float.MAX_VALUE;

        for (Person p : persons)
        {
            if (p.health > 0)
            {
                float dist = position.distanceTo(p.position);
                if (dist < minDistance)
                {
                    minDistance = dist;
                    target = p;
                }
            }
        }
        return target;
    }

    //public abstract void step(ArrayList<Person> enemies);

    @Override
    public String toString(){
        return name;
    }

}
