package repository.Staff;

import domain.Staff.Staff;
import repository.IRepository;

import java.util.Set;

public interface StaffRepository extends IRepository<Staff, String> {
    Set<Staff> getAll();
}
