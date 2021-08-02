package MarketSpring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "sity")
public class SityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name="id")
    private Long id;

    @Column( name="name_sity")
    private String name;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "sity", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<StreetEntity> streets;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "id_country")
    private CountryEntity country;

    public void setCountry(CountryEntity country) {
        this.country = country;
    }

    public CountryEntity getCountry() {
        return country;
    }

    public Set<StreetEntity> getStreets() {
        return streets;
    }

    public void setStreets(Set<StreetEntity> streets) {
        this.streets = streets;
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
