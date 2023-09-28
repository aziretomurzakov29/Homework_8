package kg.geektech.game.players;
public class  Magic extends kg.geektech.game.players.Hero {
    private double increase;
    public Magic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
    increase=1.1;
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage((int) (heroes[i].getDamage()*increase));
            }
        System.out.println("Magic activated his ability");


    }
}