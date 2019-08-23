package entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

/**
 * @author Chamseddine Benhamed <chamseddine.benhamed at ensi-uma.tn>
 */

@Table(value = "greetings")
@Data
@AllArgsConstructor
@ToString
@Builder
public class GreetingEntity {

    @PrimaryKey
    private final int id;
    private String content;
}
