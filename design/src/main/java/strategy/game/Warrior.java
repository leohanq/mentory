package strategy.game;

public class Warrior implements AttackStrategy {
    @Override
    public void attack(Player player) {
        System.out.println("Player health before attack : " + player.getHealth());
        player.setHealth(player.getHealth() - 10);
        System.out.println("warrior attacking");
        System.out.println("Player health after attack : " + player.getHealth());
    }
}
