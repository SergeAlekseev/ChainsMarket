package MarketSpring.entity;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_type")
    private TypeClientEntity type;

    @OneToOne
    @JoinColumn(name = "id_card")
    private DiscountCardEntity discountCard;

    @OneToOne
    @JoinColumn(name = "id_human_info")
    private HumanInfoEntity humanInfo;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public TypeClientEntity getType() {
        return type;
    }

    public void setType(TypeClientEntity type) {
        this.type = type;
    }

    public DiscountCardEntity getDiscountCard() {
        return discountCard;
    }

    public void setDiscountCard(DiscountCardEntity discountCard) {
        this.discountCard = discountCard;
    }

    public HumanInfoEntity getHumanInfo() {
        return humanInfo;
    }

    public void setHumanInfo(HumanInfoEntity humanInfo) {
        this.humanInfo = humanInfo;
    }
}
