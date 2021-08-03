package MarketSpring.service;

import MarketSpring.entity.ClientEntity;
import MarketSpring.model.ClientModel;
import MarketSpring.entity.DiscountCardEntity;
import MarketSpring.entity.TypeClientEntity;
import MarketSpring.model.DiscountCardModel;
import MarketSpring.model.HumanInfoModel;
import MarketSpring.model.TypeModel;
import org.springframework.stereotype.Service;

@Service
public class ClientService {


    public ClientEntity getClient(Long id) throws Exception {
        throw new Exception("No realization");
    }

    public ClientEntity deleteClient(Long id) throws Exception {
        throw new Exception("No realization");
    }

    public ClientEntity editInfoClient(Long id, HumanInfoModel humanInfoModel) throws Exception {
        throw new Exception("No realization");
    }

    public ClientEntity addClient(ClientModel clientModel) throws Exception {
        throw new Exception("No realization");
    }

    public DiscountCardEntity addCard(Long id) throws Exception {
        throw new Exception("No realization");
    }

    public TypeClientEntity addClientType(TypeModel typeClientModel) throws Exception {
        throw new Exception("No realization");
    }

    public DiscountCardEntity editCard(Long id, DiscountCardModel discountCardModel) throws Exception {
        throw new Exception("No realization");
    }
}
