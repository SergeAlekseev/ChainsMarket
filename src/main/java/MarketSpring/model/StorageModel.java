package MarketSpring.model;

import MarketSpring.entity.MapLocationEntity;

public class StorageModel {

    private String name;
    private MapLocationModel location;
    private Long idType;
    private double capacity;

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setIdType(Long idType) {
        this.idType = idType;
    }

    public Long getIdType() {
        return idType;
    }

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
