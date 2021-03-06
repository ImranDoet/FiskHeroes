package com.fiskmods.heroes.client.sound;

import java.util.Locale;

import com.fiskmods.heroes.FiskHeroes;

public enum SHSounds
{
    ABILITY_CRYOKINESIS_CHARGE,
    ABILITY_EQUIPMENT_SWITCH,
    ABILITY_PYROKINESIS_FIREBALL,
    ABILITY_REPULSOR_BLAST,
    ABILITY_REPULSOR_CHARGE,
    ABILITY_REPULSOR_POWERDOWN,
    ABILITY_SIZEMANIPULATION_GROW,
    ABILITY_SIZEMANIPULATION_SHRINK,

    AMBIENT_FLIGHT,

    BATFISH_CLICK,
    BATFISH_COIN,
    BATFISH_DEATH,
    BATFISH_EXPLODE,
    BATFISH_POP,
    BATFISH_SCREAM,
    BATFISH_TITLE,
    BATFISH_WHISTLE,
    BATFISH_WOODBREAK,
    BATFISH_WORLD,

    BLOCK_NEXUSSOIL_IGNITE,

    ENTITY_ARROW_GRAPPLE_DISCONNECT,
    ENTITY_ARROW_PUFFERFISH_FLOP,
    ENTITY_ARROW_PUFFERFISH_PRIMED,
    ENTITY_ARROW_VINE_SNAP,
    ENTITY_FIREBALL_EXPLODE,
    ENTITY_FREEZEGRENADE_FREEZE,
    ENTITY_ICICLE_IMPACT,

    ITEM_BATTERY_ABSORB,
    ITEM_BATTERY_ATTACH,
    ITEM_BATTERY_DETACH,
    ITEM_BATTERY_ON,
    ITEM_BOW_SHOOT,
    ITEM_CHRONOSRIFLE_SHOOT,
    ITEM_RIPSGUN_SHOOT,
    ITEM_SHIELD_HIT,
    ITEM_SHIELD_THROW,

    MOB_CACTUS_STEP,
    MOB_IRONMAN_BLAST,
    MOB_IRONMAN_CHARGE,
    MOB_IRONMAN_HURT,
    MOB_IRONMAN_POWERDOWN,

    RANDOM_BATFISH,
    RANDOM_BATFISH_SARCASTIC,
    RANDOM_FIRE_OFF,
    RANDOM_FIRE_ON,
    RANDOM_SPIDER;

    private final String name;

    private SHSounds()
    {
        name = FiskHeroes.MODID + ":" + name().toLowerCase(Locale.ROOT).replace('_', '.');
    }

    @Override
    public String toString()
    {
        return name;
    }
}
