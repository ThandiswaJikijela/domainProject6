package repository;

import domain.Cancelation;

import java.util.Set;

public interface CancelationRepository extends IRepository<Cancelation, String>{
    Set<Cancelation> getAll();
}
