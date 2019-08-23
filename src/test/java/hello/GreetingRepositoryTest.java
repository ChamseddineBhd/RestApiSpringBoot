package hello;

import entities.GreetingEntity;
import org.cassandraunit.spring.CassandraDataSet;
import org.cassandraunit.spring.CassandraUnitDependencyInjectionTestExecutionListener;
import org.cassandraunit.spring.CassandraUnitTestExecutionListener;
import org.cassandraunit.spring.EmbeddedCassandra;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import repositories.GreetingRepository;

import static org.springframework.test.context.TestExecutionListeners.MergeMode.MERGE_WITH_DEFAULTS;

/**
 * @author Chamseddine Benhamed <chamseddine.benhamed at ensi-uma.tn>
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = {Application.class, CassandraConfig.class})
@TestExecutionListeners(listeners = {CassandraUnitDependencyInjectionTestExecutionListener.class,
        CassandraUnitTestExecutionListener.class},
        mergeMode = MERGE_WITH_DEFAULTS)
@CassandraDataSet(value = "testKeySpace.cql", keyspace = "testKeySpace")
@EmbeddedCassandra
public class GreetingRepositoryTest {

    @Autowired
    private GreetingRepository greetingRepository;

    @Test
    public void test() {
        GreetingEntity greetingEntity = new GreetingEntity(
                124, "Content");
        greetingRepository.save(greetingEntity);
    }
}
