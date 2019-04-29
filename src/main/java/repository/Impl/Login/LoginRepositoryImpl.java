package repository.Impl.Login;

import domain.LogIn.LogIn;
import repository.Login.LoginRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LoginRepositoryImpl implements LoginRepository {
    private static LoginRepositoryImpl repository = null;
    private Map<String, LogIn> loginTable;

    private LoginRepositoryImpl(){
        this.loginTable = new HashMap<String, LogIn>();
    }

    public static LoginRepositoryImpl getRepository()
    {
        if (repository == null) repository = new LoginRepositoryImpl();
        return repository;
    }

    @Override
    public LogIn create(LogIn logIn) {
        loginTable.put(logIn.getUsername(),logIn);
        loginTable.put(logIn.getPassword(),logIn);
        LogIn savedLogin = loginTable.get(toString());
        return savedLogin;
    }

    @Override
    public LogIn read(String l) {
        LogIn logIn = loginTable.get(toString());
        return logIn;
    }

    @Override
    public LogIn update(LogIn logIn) {
        loginTable.put(logIn.toString(),logIn);
        LogIn saveLogin = loginTable.get(toString());
        return saveLogin;
    }

    @Override
    public void delete(String l) {
        loginTable.remove(toString());
    }

    @Override
    public Set<LogIn> getAll() {
        return (Set<LogIn>) loginTable;
    }
}
