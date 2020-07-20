package lk.lochana.pos.Service.Impl;

import lk.lochana.pos.Entity.Customer;
import lk.lochana.pos.Service.CustomerService;
import lk.lochana.pos.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository repository;

    @Override
    public void saveCustomer(Customer customer) {
        Customer save = repository.save(customer);
    }
}
