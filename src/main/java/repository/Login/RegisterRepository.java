package repository.Login;

import domain.LogIn.Register;
import repository.IRepository;

import java.util.Set;

public interface RegisterRepository extends IRepository<Register, String> {
    Set<Register> getAll();
}
