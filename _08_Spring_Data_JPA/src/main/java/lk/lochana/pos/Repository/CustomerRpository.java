package lk.lochana.pos.Repository;

import lk.lochana.pos.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRpository extends JpaRepository<Customer, String> {
}
