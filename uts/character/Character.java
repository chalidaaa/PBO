package character;

public class Character {
    protected String name;
    protected int hp;
    protected int attack;
    protected int defense;
    protected int potions = 3; // maksimal 3 ramuan

    public Character(String name, int hp, int attack, int defense) {
        //inisialisasi 
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    // Setter
    public void setNama(String nama) {
        this.name = name;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    // klo ada return itu getter
    public String getName() {
        return this.name;
    }
    public int getHp() {
        return this.hp;
    }

    public int getDefense() {
        return this.defense;
    }
    public int getAttack() {
        return this.attack;
    }
    public int getPotions() {
        return this.potions;
    }

    public void attack(int attack) {
        this.hp += attack; // menambah HP sesuai attack
        System.out.println("Character menyerang Enemy! Damage: 20");
    }

    public void defend(int defense) {
        this.hp -= defense; // mengurangi HP sesuai defense
        System.out.println("Character bertahan! HP berkurang " + defense);
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

    public boolean isAlive() {
        return hp > 0;
    }

    public void status() {
        System.out.println("HP Character: " + hp);
    }
}
