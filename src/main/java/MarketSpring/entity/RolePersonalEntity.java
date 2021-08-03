package MarketSpring.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role_personal")
public class RolePersonalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name="id")
    private Long id;

    @Column( name="name_role")
    private String name;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "role", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<PersonalEntity> personals;

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

    public Set<PersonalEntity> getPersonals() {
        return personals;
    }

    public void setPersonals(Set<PersonalEntity> personals) {
        this.personals = personals;
    }
}
