package MarketSpring.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "type_storage")
public class TypeStorageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name="id")
    private Long id;

    @Column( name="name_type_storage")
    private String name;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "type", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<StorageMarketEntity> storages;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStorages(Set<StorageMarketEntity> storages) {
        this.storages = storages;
    }

    public Set<StorageMarketEntity> getStorages() {
        return storages;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
