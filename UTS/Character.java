package UTS;

public class Character {
    protected int hp;
    protected int attack;
    protected int defense;
    protected int potions = 3; // maksimal 3 ramuan

    public Character(int hp, int attack, int defense) {
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    public void attack(Enemy enemy) {
        int damage = this.attack;
        System.out.println("Character menyerang Enemy! Damage: " + damage);
        enemy.takeDamage(damage);
    }

    public void defend() {
        System.out.println("Character bertahan! Defense meningkat untuk serangan berikutnya.");
    }

    public void drinkPotion() {
        if (potions > 0) {
            hp += 20;
            potions--;
            System.out.println("Character minum ramuan! HP bertambah 20. Sisa ramuan: " + potions);
        } else {
            System.out.println("Tidak ada ramuan tersisa!");
        }
    }

    public void takeDamage(int damage) {
        hp -= damage;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void status() {
        System.out.println("HP Character: " + hp);
    }
}
