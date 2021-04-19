package tr.edu.trakya.cemtaskin.sfpetclinic.services.map;

import org.springframework.stereotype.Service;
import tr.edu.trakya.cemtaskin.sfpetclinic.model.Pet;
import tr.edu.trakya.cemtaskin.sfpetclinic.services.CrudService;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet,Long> implements CrudService<Pet,Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(),pet);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
