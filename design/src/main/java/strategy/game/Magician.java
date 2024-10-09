package strategy.game;

public class Magician implements AttackStrategy {
    @Override
    public void attack(Player player) {
        System.out.println("Player health before attack : " + player.getHealth());
        player.setHealth(player.getHealth() - 30);
        System.out.println("magician attacking");
        System.out.println("Player health after attack : " + player.getHealth());
    }
}
