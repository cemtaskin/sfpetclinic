package tr.edu.trakya.cemtaskin.sfpetclinic.services.map;

import tr.edu.trakya.cemtaskin.sfpetclinic.model.Owner;
import tr.edu.trakya.cemtaskin.sfpetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(),owner);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}
