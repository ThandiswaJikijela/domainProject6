package repository;

import domain.Spa;

import java.util.Set;

public interface SpaRepository extends IRepository<Spa, String>{
    Set<Spa> getAll();
}
