package day1.week3.entity;

import day1.week3.AddressService;
import day1.week3.repositories.AddressRepository;
import day1.week3.repositories.CitizenRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeveloperData implements ApplicationRunner {

    private final AddressRepository addressRepository;
    private AddressService addressService;

    public DeveloperData(AddressRepository addressRepository, AddressService addressService) {
        this.addressRepository = addressRepository;
        this.addressService = addressService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Town town = new Town();
        Address a1 = new Address("Lyngbyvej 1", "Lyngby", "2800");
        Citizen citizen1 = new Citizen("Kurt", "Wonnegut", "a@b.dk","123");
        Citizen citizen2 = new Citizen("Hanne", "Wonnegut", "h@b.dk", "234");
        a1.addCitizen(citizen1);
        a1.addCitizen(citizen2);
        citizen1.setTown(town);
        citizen2.setTown(town);
        addressRepository.save(a1);//Save the address


        System.out.println("----------- Select statements here--------------");

      //  Address address_1 = addressRepository.findAllById(a1.getId()).get();
      //  System.out.println(address_1.getStreet());
      //  System.out.println("Press Enter to continue");
        System.in.read();
      //  System.out.println("Citizens: "+address_1.getCitizens().size());
       // addressService.printFullAddressInfo(1,false);

    }
}
