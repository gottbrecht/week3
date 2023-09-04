package day1.week3.repositories;

import day1.week3.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface AddressRepository extends CrudRepository<Address, Integer> {
}
