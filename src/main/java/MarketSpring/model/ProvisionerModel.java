package MarketSpring.model;

import MarketSpring.entity.MapLocationEntity;

public class ProvisionerModel {

    private String name;
    private MapLocationModel location;
    private Long idType;

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
