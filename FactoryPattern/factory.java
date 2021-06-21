import java.util.Random;
import java.util.Scanner;

interface Enemy {

    void attack();

    void getKilled();
}

class Assassin implements Enemy {
    String name = "";

    void Assassin(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("an assassin is attacking you");
    }

    @Override
    public void getKilled() {
        System.out.println("an assassin has been killed");
    }
}

class Pirate implements Enemy {
    String name = "";

    void Pirate(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("an Pirate is attacking you");
    }

    @Override
    public void getKilled() {
        System.out.println("an Pirate has been killed");
    }
}

class SerialKiller implements Enemy {
    String name = "";

    void SerialKiller(String name) {
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("an Serial Killer is attacking you");
    }

    @Override
    public void getKilled() {
        System.out.println("an Serial Killer has been killed");
    }
}

class EnemyFactory {

    Enemy createEnemy(int enemyNumber) {
        if (enemyNumber == 0)
            return new Pirate();
        else if (enemyNumber == 1)
            return new Assassin();
        else
            return new SerialKiller();
    }
}

class MainFactory {
    public static void main(String[] args) {

        EnemyFactory enemyFactory = new EnemyFactory();
        System.out.println("randomly creating an enemy");
        Random rand = new Random();
        int enemyNumber = rand.nextInt(3);
        Enemy enemy = enemyFactory.createEnemy(enemyNumber);
        enemy.attack();
        enemy.getKilled();
    }
}