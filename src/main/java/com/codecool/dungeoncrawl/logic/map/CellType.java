package com.codecool.dungeoncrawl.logic.map;

public enum CellType {
    EMPTY("empty"),
    FLOOR("floor"),
    CLOSE("closeDoor"),
    STAIRSDOWN("stairsDown"),
    STAIRSUP("stairsDown"),
    OPEN("openDoor"),
    BELFRY("belfry"),
    WALL("wall");

    private final String tileName;

    CellType(String tileName) {
        this.tileName = tileName;
    }

    public String getTileName() {
        return tileName;
    }
}
