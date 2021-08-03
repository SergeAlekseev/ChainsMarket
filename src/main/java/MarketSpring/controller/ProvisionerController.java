package MarketSpring.controller;

import MarketSpring.entity.ClientEntity;
import MarketSpring.entity.TypeClientEntity;
import MarketSpring.model.ProvisionerModel;
import MarketSpring.model.StorageModel;
import MarketSpring.model.TypeModel;
import MarketSpring.service.ProvisionerService;
import MarketSpring.service.StorageService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/provisioner")
public class ProvisionerController {

    private final ProvisionerService provisionerService;

    public ProvisionerController(ProvisionerService provisionerService) {
        this.provisionerService = provisionerService;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ClientEntity getProvisioner(@PathVariable Long id) throws Exception {
        return provisionerService.getProvisioner(id);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public ClientEntity deleteProvisioner(@PathVariable Long id) throws Exception {
        return provisionerService.deleteProvisioner(id);
    }

    @PutMapping()
    @ResponseBody
    public ClientEntity addProvisioner(@RequestBody ProvisionerModel provisionerModel) throws Exception {
        return provisionerService.addProvisioner(provisionerModel);
    }

    @PutMapping("/type")
    @ResponseBody
    public TypeClientEntity addProvisionerType(@RequestBody TypeModel typeProvisionerModel) throws Exception {
        return provisionerService.addProvisionerType(typeProvisionerModel);
    }

}
