package MarketSpring.model;

import MarketSpring.entity.MapLocationEntity;

public class MarketModel {
    private String name;
    private MapLocationEntity location;

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(MapLocationEntity location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public MapLocationEntity getLocation() {
        return location;
    }
}

