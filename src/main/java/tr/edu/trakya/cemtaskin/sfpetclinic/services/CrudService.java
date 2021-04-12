package tr.edu.trakya.cemtaskin.sfpetclinic.services;

import tr.edu.trakya.cemtaskin.sfpetclinic.model.Owner;

import java.util.Set;

public interface CrudService <T,ID>{
    Set<T> findAll();
    T findById(ID id);
    T save(T t);
    void delete(T object);
    void deleteById(ID id);
}
