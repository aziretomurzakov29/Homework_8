package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Berserk extends Hero {
    private int savedDamage;

    public Berserk(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean moment= RPG_Game.random.nextBoolean();

        if (moment==false){
       setSavedDamage(savedDamage+= boss.getDamage()/5);
        System.out.println("Drax save Damage: "+savedDamage);}
       else if(moment==true){
           if(boss.getDefence()==SuperAbility.SAVE_DAMAGE_AND_REVERT){
               savedDamage=0;
               System.out.println("Drax ability blocked");

           }else{
           boss.setHealth(boss.getHealth()-savedDamage);
               System.out.println("Drax ability: "+savedDamage);
           savedDamage=0;}
       }


    }

    public int getSavedDamage() {
        return savedDamage;
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }
}
