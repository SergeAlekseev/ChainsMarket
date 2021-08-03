package MarketSpring.controller;


import MarketSpring.entity.MarketEntity;
import MarketSpring.entity.ProvisionerEntity;
import MarketSpring.entity.StorageMarketEntity;
import MarketSpring.model.MarketModel;
import MarketSpring.model.ProvisionerModel;
import MarketSpring.model.StorageModel;
import MarketSpring.service.MarketService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/market")
public class MarketController {

    private final MarketService marketService;

    public MarketController(MarketService marketService) {
        this.marketService = marketService;
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public MarketEntity deleteMarket(@PathVariable Long id) throws Exception {
        return marketService.deleteMarket(id);
    }

    @PatchMapping("/{id}")
    @ResponseBody
    public MarketEntity updateMarket(@PathVariable Long id, @RequestBody MarketModel marketModel) throws Exception {
        return marketService.updateMarket(id, marketModel);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public MarketEntity getMarket(@PathVariable Long id) throws Exception {
        return marketService.getMarket(id);
    }

    @PutMapping("/{id}/newstorage")
    @ResponseBody
    public StorageMarketEntity addNewStorage(@PathVariable Long id, @RequestBody StorageModel storageModel) throws Exception {
        return marketService.addNewStorage(id, storageModel);
    }

    @DeleteMapping("/{idMarket}/deleteStorage/{idStorage}")
    @ResponseBody
    public StorageMarketEntity deleteStorageFromMarket(@PathVariable Long idMarket, @PathVariable Long idStorage) throws Exception {
        return marketService.deleteStorageFromMarket(idMarket, idStorage);
    }

    @GetMapping("/{id}/storages")
    @ResponseBody
    public Set<StorageMarketEntity> getStorages(@PathVariable Long id) throws Exception {
        return marketService.getStorages(id);
    }

    @PutMapping("/{id}/newprovisioner")
    @ResponseBody
    public ProvisionerEntity addNewProvisioner(@PathVariable Long id, @RequestBody ProvisionerModel provisionerModel) throws Exception {
        return marketService.addNewProvisioner(id, provisionerModel);
    }

    @DeleteMapping("/{idMarket}/deleteProvisioner/{idProvisioner}")
    @ResponseBody
    public ProvisionerEntity deleteProvisionerFromMarket(@PathVariable Long idMarket, @PathVariable Long idProvisioner) throws Exception {
        return marketService.deleteProvisionerFromMarket(idMarket, idProvisioner);
    }

    @GetMapping("/{id}/provisioners")
    @ResponseBody
    public Set<ProvisionerEntity> getProvisioners(@PathVariable Long id) throws Exception {
        return marketService.getProvisioners(id);
    }



}
