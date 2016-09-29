package sample.struts2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import sample.biz.domain.Pet;
import sample.biz.service.PetShopService;

public class SpringSampleAction {

    @Autowired
    private PetShopService petShopService;
    
    private List<Pet> petList;
    
    public List<Pet> getPetList() {
        return petList;
    }

    public void setPetList(List<Pet> petList) {
        this.petList = petList;
    }

    public String execute() {
        petList = petShopService.getAllPet();
        return "success";
    }
}