package UTS;

public class Enemy extends Character {

    public Enemy(int hp, int attack, int defense) {
        super(hp, attack, defense);
    }

    public void attack(Character character) {
        int damage = this.attack - (character.defense / 2); // misal, defense mengurangi damage
        if (damage < 0) damage = 0;
        System.out.println("Enemy menyerang balik! Damage: " + damage);
        character.takeDamage(damage);
    }

    @Override
    public void defend() {
        System.out.println("Enemy bertahan, defense meningkat!");
    }
}
