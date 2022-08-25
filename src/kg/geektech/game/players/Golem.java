package kg.geektech.game.players;

public class Golem extends kg.geektech.game.players.Hero {
    public Golem(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.PROTECT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (this.getHealth() > 0 && boss.getDefence() != SuperAbility.PROTECT) {
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getHealth() > 0) {
                    heroes[i].setHealth(heroes[i].getHealth() + (boss.getDamage() / 5));
                }

            }
            System.out.println("Golems ability is working");
        }
        {

        }


    }
}

