package repository.Staff;

import domain.Staff.SpaAdmin;
import repository.IRepository;

import java.util.Set;

public interface SpaAdminRepository extends IRepository<SpaAdmin, String> {
    Set<SpaAdmin> getAll();
}
