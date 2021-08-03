package MarketSpring.entity;



import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "discount_card")
public class DiscountCardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name="id")
    private Long id;

    @Column( name="discount")
    private int discount;

    @OneToOne(mappedBy = "discountCard")
    private ClientEntity client;


    public void setClient(ClientEntity client) {
        this.client = client;
    }

    public ClientEntity getClient() {
        return client;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
