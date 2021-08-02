package MarketSpring.controller;

import MarketSpring.entity.ChainEntity;
import MarketSpring.entity.MarketEntity;
import MarketSpring.model.ChainModel;
import MarketSpring.model.MarketModel;
import MarketSpring.service.ChainMarketsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/chain")
public class ChainMarketsController {

    private final ChainMarketsService chainMarketsService;

    public ChainMarketsController(ChainMarketsService chainMarketsService) {
        this.chainMarketsService = chainMarketsService;
    }

    @GetMapping("/all")
    @ResponseBody
    public List<ChainEntity> getAllChain() throws Exception {
        return chainMarketsService.getAllChain();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ChainEntity getChain(@PathVariable Long id) throws Exception {
        return chainMarketsService.getChain(id);
    }

    @GetMapping("/{id}/markets")
    @ResponseBody
    public Set<MarketEntity> getChainMarkets(@PathVariable Long id) throws Exception {
        return chainMarketsService.getChain(id).getMarkets();
    }

    @PutMapping()
    @ResponseBody
    public ChainEntity createChain(@RequestBody ChainModel newChainModel) throws Exception {
        return chainMarketsService.createChain(newChainModel);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public ChainEntity deleteChain(@PathVariable Long id) throws Exception {
        return chainMarketsService.deleteChain(id);
    }

    @PutMapping("/{idChain}")
    @ResponseBody
    public MarketEntity putMarket(@PathVariable Long idChain, @RequestBody MarketModel newMarketModel) throws Exception {
        return chainMarketsService.putMarket(newMarketModel, idChain);
    }

    @PatchMapping("/{idChain}")
    @ResponseBody
    public MarketEntity updateChain(@PathVariable Long idChain, @RequestBody ChainModel chainModel) throws Exception {
        return chainMarketsService.updateChain(chainModel, idChain);
    }


}
