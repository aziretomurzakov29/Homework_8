package kg.geektech.game.players;

public class  Witcher extends kg.geektech.game.players.Hero {


    public Witcher(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.GIVE_HEALTH);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (this.getHealth() == 0) {
                break;
            } else {

                if (heroes[i].getHealth() == 0 && this.getHealth()
                        > 0 && this != heroes[i]
                        && boss.getDefence() != SuperAbility.GIVE_HEALTH) {
                    heroes[i].setHealth(heroes[i].getHealth()
                            + this.getHealth());
                    System.out.println("Natasha give his health to: "
                            + heroes[i].getName());
                    this.setHealth(0);
                    break;


                }
            }

        }


    }
}
