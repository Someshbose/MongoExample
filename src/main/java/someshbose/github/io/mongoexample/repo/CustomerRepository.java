package someshbose.github.io.mongoexample.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import someshbose.github.io.mongoexample.model.Customer;

import java.util.List;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}
