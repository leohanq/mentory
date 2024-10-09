package strategy.game;

public class TestStrategy {

    public static void main(String[] args) {
        Player player = new Player("leo");
        AttackStrategy trollStrategy = new Troll();
        Enemy enemy = new Enemy(trollStrategy);
        enemy.attack(player);
        System.out.println("______________________________");
        AttackStrategy magicianStrategy = new Magician();
        enemy.setAttackStrategy(magicianStrategy);
        enemy.attack(player);
        System.out.println("______________________________");
        AttackStrategy warriorStrategy = new Warrior();
        enemy.setAttackStrategy(warriorStrategy);
        enemy.attack(player);
    }
}
