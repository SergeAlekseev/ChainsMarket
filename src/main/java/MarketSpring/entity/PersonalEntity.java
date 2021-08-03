package MarketSpring.entity;


import javax.persistence.*;

@Entity
@Table(name = "personal")
public class PersonalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_role")
    private RolePersonalEntity role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_group")
    private GroupPersonalEntity group;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_human_info")
    private HumanInfoEntity humanInfo;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_personal_info")
    private PersonalInfoEntity personalInfo;



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public RolePersonalEntity getRole() {
        return role;
    }

    public void setRole(RolePersonalEntity role) {
        this.role = role;
    }

    public GroupPersonalEntity getGroup() {
        return group;
    }

    public void setGroup(GroupPersonalEntity group) {
        this.group = group;
    }

    public HumanInfoEntity getHumanInfo() {
        return humanInfo;
    }

    public void setHumanInfo(HumanInfoEntity humanInfo) {
        this.humanInfo = humanInfo;
    }

    public PersonalInfoEntity getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfoEntity personalInfo) {
        this.personalInfo = personalInfo;
    }
}
