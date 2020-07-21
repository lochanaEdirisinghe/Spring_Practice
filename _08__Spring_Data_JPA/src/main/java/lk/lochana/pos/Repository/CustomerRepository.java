package lk.lochana.pos.Repository;

import lk.lochana.pos.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
