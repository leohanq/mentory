package strategy.game;

public class Enemy {

    private AttackStrategy attack;



    public Enemy(AttackStrategy attack) {
        this.attack = attack;
    }

    public void setAttackStrategy(AttackStrategy attack) {
        this.attack = attack;
    }

    void attack(Player player) {
        attack.attack(player);
    }
}
