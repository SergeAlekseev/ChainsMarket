package MarketSpring.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "street")
public class StreetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name="id")
    private Long id;

    @Column( name="name_street")
    private String name;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "street", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<MapLocationEntity> locations;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnore
    @JoinColumn(name = "id_sity")
    private SityEntity sity;

    public void setSity(SityEntity sity) {
        this.sity = sity;
    }

    public SityEntity getSity() {
        return sity;
    }

    public void setLocations(Set<MapLocationEntity> locations) {
        this.locations = locations;
    }

    public Set<MapLocationEntity> getLocations() {
        return locations;
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
