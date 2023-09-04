package day1.week3;

import day1.week3.entity.Address;
import day1.week3.repositories.AddressRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;

    @Transactional
    public void printFullAddressInfo(int id, boolean includeCitizens) {
        Address address_1 = addressRepository.findAllById(id).get();
        System.out.println(address_1.getStreet());
    }
}
