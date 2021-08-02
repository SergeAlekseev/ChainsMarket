package MarketSpring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "storage")
public class StorageMarketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name="id")
    private Long id;

    @Column( name="name_storage")
    private String name;

    @Column( name="capacity")
    private double capacity;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="storage_market",
    joinColumns = @JoinColumn(name = "id_storage"),
    inverseJoinColumns = @JoinColumn(name = "id_market"))
    private Set<MarketEntity> markets;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_type")
    private TypeStorageEntity type;

    public void setType(TypeStorageEntity type) {
        this.type = type;
    }

    public TypeStorageEntity getType() {
        return type;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

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
