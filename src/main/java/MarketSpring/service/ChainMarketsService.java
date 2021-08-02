package MarketSpring.service;

import MarketSpring.entity.ChainEntity;
import MarketSpring.entity.MarketEntity;
import MarketSpring.model.ChainModel;
import MarketSpring.model.MarketModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChainMarketsService {


    public List<ChainEntity> getAllChain() throws Exception {
        throw new Exception("No realization");
    }

    public ChainEntity getChain(Long id) throws Exception {
        throw new Exception("No realization");
    }

    public ChainEntity createChain(ChainModel newChainModel) throws Exception {
        throw new Exception("No realization");
    }

    public ChainEntity deleteChain(Long id) throws Exception {
        throw new Exception("No realization");
    }

    public MarketEntity putMarket(MarketModel newMarketModel, Long idChain) throws Exception {
        throw new Exception("No realization");
    }

    public MarketEntity updateChain(ChainModel chainModel, Long idChain) throws Exception {
        throw new Exception("No realization");
    }
}
