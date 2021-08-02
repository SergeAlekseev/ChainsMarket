package MarketSpring.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "provisioner")
public class ProvisionerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name="id")
    private Long id;

    @Column( name="name_storage")
    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="provisioner_market",
            joinColumns = @JoinColumn(name = "id_provisioner"),
            inverseJoinColumns = @JoinColumn(name = "id_market"))
    private Set<MarketEntity> markets;

    public void setMarkets(Set<MarketEntity> markets) {
        this.markets = markets;
    }

    public Set<MarketEntity> getMarkets() {
        return markets;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
