package MarketSpring.service;

import MarketSpring.entity.MarketEntity;
import MarketSpring.entity.ProvisionerEntity;
import MarketSpring.entity.StorageMarketEntity;
import MarketSpring.model.MarketModel;
import MarketSpring.model.ProvisionerModel;
import MarketSpring.model.StorageModel;
import org.springframework.stereotype.Service;

@Service
public class MarketService {


    public MarketEntity deleteMarket(Long id) throws Exception {
        throw new Exception("No realization");
    }

    public MarketEntity updateMarket(Long id, MarketModel marketModel) throws Exception {
        throw new Exception("No realization");
    }

    public MarketEntity getMarket(Long id) throws Exception {
        throw new Exception("No realization");
    }

    public StorageMarketEntity addNewStorage(Long id, StorageModel storageModel) throws Exception {
        throw new Exception("No realization");
    }

    public StorageMarketEntity deleteStorageFromMarket(Long idMarket, Long idStorage) throws Exception {
        throw new Exception("No realization");
    }

    public MarketEntity getStorages(Long id) throws Exception {
        throw new Exception("No realization");
    }

    public ProvisionerEntity addNewProvisioner(Long id, ProvisionerModel provisionerModel) throws Exception {
        throw new Exception("No realization");
    }
}
