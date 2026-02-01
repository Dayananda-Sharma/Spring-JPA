import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "laptop_db")
@Data
public class LenovoEntity {
    @Id
    private int id;
    private String name;
    private int price;
}
