package lk.lochana.spring.Repository;


import lk.lochana.spring.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRpository extends JpaRepository<Customer, String> {
}
