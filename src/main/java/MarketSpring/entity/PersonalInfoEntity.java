package MarketSpring.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "personal_info")
public class PersonalInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="date_start_working")
    private Date dateStartWorking;

    @Column(name="salary")
    private Integer salary;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateStartWorking() {
        return dateStartWorking;
    }

    public void setDateStartWorking(Date dateStartWorking) {
        this.dateStartWorking = dateStartWorking;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
