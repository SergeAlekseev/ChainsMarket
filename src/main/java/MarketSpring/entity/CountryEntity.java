package MarketSpring.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "country")
public class CountryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name="id")
    private Long id;

    @Column( name="name_country")
    private String name;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "country", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SityEntity> sities;

    public Set<SityEntity> getSities() {
        return sities;
    }

    public void setSities(Set<SityEntity> sities) {
        this.sities = sities;
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
