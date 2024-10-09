package strategy.game;

public class Troll implements AttackStrategy {
    @Override
    public void attack(Player player) {
        System.out.println("Player health before attack : " + player.getHealth());
        player.setHealth(player.getHealth() - 20);
        System.out.println("troll attacking");
        System.out.println("Player health after attack : " + player.getHealth());
    }
}
