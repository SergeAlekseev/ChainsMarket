package MarketSpring.model;

import MarketSpring.entity.MapLocationEntity;

public class MarketModel {
    private String name;
    private MapLocationModel location;

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(MapLocationModel location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public MapLocationModel getLocation() {
        return location;
    }
}

