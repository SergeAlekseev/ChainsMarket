package MarketSpring.model;

import MarketSpring.model.HumanInfoModel;

public class ClientModel extends HumanInfoModel {
    private Long idType;

    public void setIdType(Long idType) {
        this.idType = idType;
    }

    public Long getIdType() {
        return idType;
    }
}
