package MarketSpring.model;

import MarketSpring.entity.MapLocationEntity;

public class ProvisionerModel {

    private String name;
    private MapLocationEntity location;
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
