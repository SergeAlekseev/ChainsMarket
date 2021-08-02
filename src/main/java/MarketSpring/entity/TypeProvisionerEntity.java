package MarketSpring.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "type_provisioner")
public class TypeProvisionerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name="id")
    private Long id;

    @Column( name="name_type_storage")
    private String name;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "type", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<StorageMarketEntity> provisioners;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProvisioners(Set<StorageMarketEntity> provisioners) {
        this.provisioners = provisioners;
    }

    public Set<StorageMarketEntity> getProvisioners() {
        return provisioners;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
