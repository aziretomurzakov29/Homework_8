package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class  Deku extends kg.geektech.game.players.Hero {
    public Deku(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.AMPLIFIER);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean power = RPG_Game.random.nextBoolean();
        int choose = RPG_Game.random.nextInt(3) + 1;
        if (power == true && boss.getDefence() != SuperAbility.AMPLIFIER) {
            if (choose == 1) {
                boss.setHealth(boss.getHealth() - (this.getDamage() / 5));
                System.out.println("Asta activated ability to 20%");
            } else if (choose == 2) {
                System.out.println("Asta activated ability to 50%");
            } else if (choose == 3) {
                System.out.println("Asta activated ability to 100%");

            }

        }


    }
}
