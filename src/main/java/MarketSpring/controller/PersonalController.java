package MarketSpring.controller;

import MarketSpring.entity.PersonalEntity;
import MarketSpring.entity.RolePersonalEntity;
import MarketSpring.model.PersonalModel;
import MarketSpring.model.TypeModel;
import MarketSpring.service.PersonalService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/personal")
public class PersonalController {

    private final PersonalService personalService;

    public PersonalController(PersonalService personalService) {
        this.personalService = personalService;
    }


    @GetMapping("/{id}")
    @ResponseBody
    public PersonalEntity getPersonal(@PathVariable Long id) throws Exception {
        return personalService.getPersonal(id);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public PersonalEntity deletePersonal(@PathVariable Long id) throws Exception {
        return personalService.deletePersonal(id);
    }

    @PutMapping()
    @ResponseBody
    public PersonalEntity addPersonal(@RequestBody PersonalModel personalModel) throws Exception {
        return personalService.addPersonal(personalModel);
    }

    @PutMapping("/role")
    @ResponseBody
    public RolePersonalEntity addPersonalRole(@RequestBody TypeModel RolePersonalModel) throws Exception {
        return personalService.addPersonalRole(RolePersonalModel);
    }

}
