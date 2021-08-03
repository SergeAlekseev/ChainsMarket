package MarketSpring.controller;

import MarketSpring.entity.ClientEntity;
import MarketSpring.model.ClientModel;
import MarketSpring.entity.DiscountCardEntity;
import MarketSpring.entity.TypeClientEntity;
import MarketSpring.model.DiscountCardModel;
import MarketSpring.model.HumanInfoModel;
import MarketSpring.model.TypeModel;
import MarketSpring.service.ClientService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ClientEntity getClient(@PathVariable Long id) throws Exception {
        return clientService.getClient(id);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public ClientEntity deleteClient(@PathVariable Long id) throws Exception {
        return clientService.deleteClient(id);
    }

    @PatchMapping("/{id}")
    @ResponseBody
    public ClientEntity editInfoClient(@PathVariable Long id,@RequestBody HumanInfoModel humanInfoModel) throws Exception {
        return clientService.editInfoClient(id,humanInfoModel);
    }

    @PutMapping("/{id}/card")
    @ResponseBody
    public DiscountCardEntity addCard(@PathVariable Long id) throws Exception {
        return clientService.addCard(id);
    }

    @PatchMapping("/{id}/card")
    @ResponseBody
    public DiscountCardEntity editCard(@PathVariable Long id, @RequestBody DiscountCardModel discountCardModel) throws Exception {
        return clientService.editCard(id,discountCardModel);
    }

    @PutMapping()
    @ResponseBody
    public ClientEntity addClient(@RequestBody ClientModel clientModel) throws Exception {
        return clientService.addClient(clientModel);
    }

    @PutMapping("/type")
    @ResponseBody
    public TypeClientEntity addClientType(@RequestBody TypeModel typeClientModel) throws Exception {
        return clientService.addClientType(typeClientModel);
    }


}
