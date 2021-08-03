package MarketSpring.controller;

import MarketSpring.entity.ClientEntity;
import MarketSpring.entity.StorageMarketEntity;
import MarketSpring.entity.TypeClientEntity;
import MarketSpring.entity.TypeStorageEntity;
import MarketSpring.model.StorageModel;
import MarketSpring.model.TypeModel;
import MarketSpring.service.StorageService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/storage")
public class StorageController {

    private final StorageService storageService;


    public StorageController(StorageService storageService) {
        this.storageService = storageService;
    }


    @GetMapping("/{id}")
    @ResponseBody
    public StorageMarketEntity getStorage(@PathVariable Long id) throws Exception {
        return storageService.getStorage(id);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public StorageMarketEntity deleteStorage(@PathVariable Long id) throws Exception {
        return storageService.deleteStorage(id);
    }

    @PutMapping()
    @ResponseBody
    public StorageMarketEntity addStorage(@RequestBody StorageModel storageModel) throws Exception {
        return storageService.addStorage(storageModel);
    }

    @PutMapping("/type")
    @ResponseBody
    public TypeStorageEntity addStorageType(@RequestBody TypeModel typeStorageModel) throws Exception {
        return storageService.addStorageType(typeStorageModel);
    }

}
