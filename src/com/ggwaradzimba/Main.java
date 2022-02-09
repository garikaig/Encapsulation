package com.ggwaradzimba;

public class Main {

    public static void main(String[] args) {

        Player player = new Player();

        player.name = "Garikai";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;

        player.loseHealth(damage);
        System.out.println("Remaining Health = " + player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining Health = " + player.healthRemaining());

        EnhancedPlayer player2 = new EnhancedPlayer("Nyasha", 200, "Sword");
        System.out.println("Initial health is " + player2.getHealth());
    }
}
