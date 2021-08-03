package MarketSpring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "market")
public class MarketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "id_chain")
    private ChainEntity chain;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_location")
    private MapLocationEntity location;

    @ManyToMany(mappedBy = "markets", fetch = FetchType.EAGER)
    private Set<StorageMarketEntity> storages;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "market", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<GroupPersonalEntity> groupsPersonal;

    @ManyToMany(mappedBy = "markets", fetch = FetchType.EAGER)
    private Set<ProvisionerEntity> provisioners;

    public void setLocation(MapLocationEntity location) {
        this.location = location;
    }

    public MapLocationEntity getLocation() {
        return location;
    }

    public void setChain(ChainEntity chain) {
        this.chain = chain;
    }

    public ChainEntity getChain() {
        return chain;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Set<GroupPersonalEntity> getGroupsPersonal() {
        return groupsPersonal;
    }

    public void setGroupsPersonal(Set<GroupPersonalEntity> groupsPersonal) {
        this.groupsPersonal = groupsPersonal;
    }

    public Set<StorageMarketEntity> getStorages() {
        return storages;
    }

    public void setStorages(Set<StorageMarketEntity> storages) {
        this.storages = storages;
    }

    public Set<ProvisionerEntity> getProvisioners() {
        return provisioners;
    }

    public void setProvisioners(Set<ProvisionerEntity> provisioners) {
        this.provisioners = provisioners;
    }
}
