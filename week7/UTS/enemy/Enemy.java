package enemy;

import character.Character;

public class Enemy extends Character {
    private boolean sudahMinum = false;

    // Konstruktor
    public Enemy(int hp, int attack, int defense) {
        super(hp, attack, defense);
    }

    @Override
    public void defend() {
        System.out.println("Musuh bertahan dengan gaya unik!");
    }

    @Override
    public void drinkPotion() {
        if (this.hp < 30 && !sudahMinum) {
            hp += 20;
            sudahMinum = true;
            System.out.println("Enemy minum potion! HP bertambah 20.");
        } else {
            System.out.println("Enemy tidak bisa minum potion lagi.");
        }
    }

    public void attack(Character character) {
        int damage = this.attack - (character.getDefense() / 2); // Menggunakan getter untuk defense
        character.takeDamage(damage);
    }
}
