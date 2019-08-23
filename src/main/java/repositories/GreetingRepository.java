package repositories;

import entities.GreetingEntity;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends CassandraRepository<GreetingEntity, Integer> {
}
