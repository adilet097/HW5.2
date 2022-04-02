package com.company;

public class Main {


    public static void main(String[] args) {
    Boss boss = new Boss();
       boss.setBossHealth(1000);
       boss.setBossDamage(70);
        boss.setBossDefence("Magical");
        System.out.println("BossHealth:"+ " "  +  boss.getBossHealth()+" " + "BossDamage" + boss.getBossDamage()+ " " +
                "BossTypeDefence"+ " " + boss.getBossDefence());
    }
}

