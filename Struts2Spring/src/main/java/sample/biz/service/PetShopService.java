package sample.biz.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import sample.biz.domain.Pet;

@Service
public class PetShopService {
    
    public List<Pet> getAllPet() {
        ArrayList<Pet> list = new ArrayList<Pet>();
        for(int i=0; i<5; i++) {
            Pet p = new Pet();
            p.setPetName("blue"+i);
            p.setOwnerName("owner"+i);
            p.setPrice(1000 * i);
            p.setBirthDate(new Date());
            list.add(p);
        }
        return list;
    }

}
