package vlaship.bank.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @OneToOne
    private User holder;
    private int amount;
    @OneToMany
    private List<Transaction> transactions;
}
