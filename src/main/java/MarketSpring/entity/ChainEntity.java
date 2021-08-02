package MarketSpring.entity;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "chain")
public class ChainEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "chain", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<MarketEntity> markets;

    public void setMarkets(Set<MarketEntity> markets) {
        this.markets = markets;
    }

    public Set<MarketEntity> getMarkets() {
        return markets;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
