package MarketSpring.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "client_type")
public class TypeClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name="id")
    private Long id;

    @Column( name="name_type_storage")
    private String name;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "type", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ClientEntity> clients;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setClients(Set<ClientEntity> clients) {
        this.clients = clients;
    }

    public Set<ClientEntity> getClients() {
        return clients;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
