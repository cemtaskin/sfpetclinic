package tr.edu.trakya.cemtaskin.sfpetclinic.services.map;

import org.springframework.stereotype.Service;
import tr.edu.trakya.cemtaskin.sfpetclinic.model.Vet;
import tr.edu.trakya.cemtaskin.sfpetclinic.services.CrudService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements CrudService<Vet,Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
