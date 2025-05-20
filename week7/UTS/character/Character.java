package character;

public class Character {
    protected int hp;          // Tetap protected
    protected int attack;      // Tetap protected
    protected int defense;     // Tetap protected

    // Konstruktor
    public Character(int hp, int attack, int defense) {
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    // Getter untuk defense
    public int getDefense() {
        return defense;
    }

    // Metode untuk menerima damage
    public void takeDamage(int damage) {
        hp -= damage;
    }

    // Metode untuk defend
    public void defend() {
        System.out.println("Karakter bertahan!");
    }

    // Metode untuk drink potion
    public void drinkPotion() {
        System.out.println("Karakter minum potion.");
    }

    // Getter untuk HP
    public int getHp() {
        return hp;
    }
}
