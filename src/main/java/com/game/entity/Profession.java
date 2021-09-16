package com.game.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;

//@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Profession {
    WARRIOR,
    ROGUE,
    SORCERER,
    CLERIC,
    PALADIN,
    NAZGUL,
    WARLOCK,
    DRUID;

//    private String name;
//
//    Profession(String name) {
//        this.name = name;
//    }
//
//    @JsonValue
//    public String getName() {
//        return name;
//    }
}
