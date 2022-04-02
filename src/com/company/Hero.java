package com.company;

public class Hero {
    private int heroHealth;
    private int heroDamage;
    private String superHit;

    public Hero(int heroHealth, int heroDamage,String superHit) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.superHit = superHit;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public String getsuperHit() {
        return superHit;
    }


    }
