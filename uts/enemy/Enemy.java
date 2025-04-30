package enemy;
import character.Character;

public class Enemy extends Character {
    // Konstruktor
    public Enemy(String name, int hp, int attack, int defense) {
        super(name, hp, attack, defense);
    }
    
    public void minum() {
        hp += 20;
    }

    @Override
    public void defend(int defense) {
        this.hp -= defense; // mengurangi HP enemy sesuai defense
        System.out.println("Enemy bertahan! HP berkurang " + defense);
    }
    public void attack(int attack) {
        this.hp += attack; // menambah HP sesuai attack
        System.out.println("Enemy menyerang Hero! Damage: 20");
    }



}
