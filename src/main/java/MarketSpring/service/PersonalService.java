package MarketSpring.service;

import MarketSpring.entity.PersonalEntity;
import MarketSpring.entity.RolePersonalEntity;
import MarketSpring.model.PersonalModel;
import MarketSpring.model.TypeModel;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonalService {


    public PersonalEntity getPersonal(Long id) throws Exception {
        throw new Exception("No realization");
    }

    public PersonalEntity deletePersonal(Long id) throws Exception {
        throw new Exception("No realization");
    }

    public PersonalEntity addPersonal(PersonalModel personalModel) throws Exception {
        throw new Exception("No realization");
    }

    public RolePersonalEntity addPersonalRole(TypeModel rolePersonalModel) throws Exception {
        throw new Exception("No realization");
    }
}
