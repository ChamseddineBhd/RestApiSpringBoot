package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

/**
 * @author Chamseddine Benhamed <chamseddine.benhamed at ensi-uma.tn>
 */

@Table("greetings")
@Data
@AllArgsConstructor
@ToString
public class GreetingEntity {

    @PrimaryKeyColumn(ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private long id;
    private String content;
}
