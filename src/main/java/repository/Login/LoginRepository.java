package repository.Login;

import domain.LogIn.LogIn;
import repository.IRepository;

import java.util.Set;

public interface LoginRepository extends IRepository<LogIn, String> {
    Set<LogIn> getAll();
}
