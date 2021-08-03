package MarketSpring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "group_personal")
public class GroupPersonalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name="id")
    private Long id;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "group", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PersonalEntity> personals;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "id_market")
    private MarketEntity market;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Set<PersonalEntity> getPersonals() {
        return personals;
    }

    public void setPersonals(Set<PersonalEntity> personals) {
        this.personals = personals;
    }

    public MarketEntity getMarket() {
        return market;
    }

    public void setMarket(MarketEntity market) {
        this.market = market;
    }
}


