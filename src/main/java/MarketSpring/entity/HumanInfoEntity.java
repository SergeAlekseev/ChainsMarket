package MarketSpring.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "human_info")
public class HumanInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name="id")
    private Long id;

    @Column( name="name")
    private String name;

    @Column( name="surname")
    private String surname;

    @Column( name="age")
    private Integer age;

    @Column( name="birthday")
    private Date birthday;

    @Column( name="phone")
    private String phone;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_location")
    private MapLocationEntity location;

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
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
