package vlaship.bank.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Account sourceAccount;
    @OneToOne
    private Account destinationAccount;
    private int amount;
}
