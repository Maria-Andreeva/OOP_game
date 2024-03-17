import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    static ArrayList<Person> red = new ArrayList<>();
    static ArrayList<Person> blue = new ArrayList<>();
    static ArrayList<Person> all = new ArrayList<>();

//    private static String getName(){
//        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
//    }
//
//    private static String getName(){
//        return Magic.values(Names.values()[new Random().nextInt(Names.values().length)].toString());
//    }


    public static void main(String[] args) {
        createTeam(red, 10, 0, true);
        createTeam(blue, 10, 3, false );

        all.addAll(red);
        all.addAll(blue);
        all.sort((o1, o2) -> Integer.compare(o2.priority, o1.priority));

        for (Person p : all) {

            if (red.contains(p)) {
                System.out.print(p + " добавлен в синюю команду.");
                //p.step(blue);


            } else {
                System.out.print(p + " добавлен в красную команду.");
                //p.step(red);
            }
            System.out.println();
        }


        for (Person p : red) {

            System.out.print(p + " находится в позиции " + p.getPosition());
            System.out.println();
        }

        for (Person p : blue) {

            System.out.print(p + " находится в позиции " + p.getPosition());
            System.out.println();

            p.findNearestPerson(red);
        }

        for (Person p : blue) {

            System.out.print(p + " находится в позиции " + p.getPosition());
            System.out.println();

            p.findNearestPerson(blue);
        }

    }


    public static void createTeam(ArrayList<Person> team, int num, int start, boolean isLeftTeam) {
        Random rnd = new Random();
        while (--num >= 0) {
            int n = start + rnd.nextInt(4);
            switch (n) {
                case 0:
                    team.add(new Crossbowman(Names.getRandomName(), team.size() + 1, isLeftTeam ? 0 : 9));
                    break;
                case 1:
                    team.add(new Pikeman(Names.getRandomName(), team.size() + 1, isLeftTeam ? 0 : 9));
                    break;
                case 2:
                    team.add(new Wizard(Names.getRandomName(), team.size() + 1, isLeftTeam ? 0 : 9));
                    break;
                case 3:
                    team.add(new Peasant(Names.getRandomName(), team.size() + 1, isLeftTeam ? 0 : 9));
                    break;
                case 4:
                    team.add(new Sniper(Names.getRandomName(), team.size() + 1, isLeftTeam ? 0 : 9));
                    break;
                case 5:
                    team.add(new Monk(Names.getRandomName(), team.size() + 1, isLeftTeam ? 0 : 9));
                    break;
                case 6:
                    team.add(new Robber(Names.getRandomName(), team.size() + 1, isLeftTeam ? 0 : 9));
                    break;
                default:
                    System.out.println("ERROR!");
            }
        }
    }

}
