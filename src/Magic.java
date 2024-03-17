public enum Magic {
    fireBall(5, 5), heal(2, -2), iceStorm(12, 10);

    private final int mana, damage;

    Magic(int mana, int damage) {
        this.mana = mana;
        this.damage = damage;
    }

    public int getMana(){return mana;}

    public int getDamage(){return damage;}

    @Override
    public String toString() {return "Mana cost = "+mana+" damage = "+damage;}
}
