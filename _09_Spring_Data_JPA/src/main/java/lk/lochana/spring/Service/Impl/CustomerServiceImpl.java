package lk.lochana.spring.Service.Impl;


import lk.lochana.spring.Entity.Customer;
import lk.lochana.spring.Repository.CustomerRpository;
import lk.lochana.spring.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRpository cusRepo;


    @Override
    public void saveCustomer(Customer customer){
        cusRepo.save(customer);
    }

}
