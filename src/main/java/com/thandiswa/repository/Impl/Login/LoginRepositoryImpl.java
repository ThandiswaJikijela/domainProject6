package com.thandiswa.repository.Impl.Login;

import com.thandiswa.domain.LogIn.LogIn;
import com.thandiswa.repository.Login.LoginRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class LoginRepositoryImpl implements LoginRepository {
    private static LoginRepositoryImpl repository = null;
    private Map<String, LogIn> loginTable;

    private LoginRepositoryImpl(){
        this.loginTable = new HashMap<>();
    }

    public static LoginRepositoryImpl getRepository()
    {
        if (repository == null) repository = new LoginRepositoryImpl();
        return repository;
    }

    @Override
    public LogIn create(LogIn logIn) {
        this.loginTable.put(logIn.toString(),logIn);
        return logIn;
    }

    @Override
    public LogIn read(String l) {
        LogIn logIn = loginTable.get(toString());
        return logIn;
    }

    @Override
    public LogIn update(LogIn logIn) {
        this.loginTable.replace(logIn.toString(),logIn);
        return this.loginTable.get(logIn.toString());
    }

    @Override
    public void delete(String l) {

        loginTable.remove(toString());
    }

    @Override
    public Set<LogIn> getAll() {
        Collection<LogIn> logIns = this.loginTable.values();
        Set<LogIn> set = new HashSet<>();
        set.addAll(logIns);
        return set;
    }
}
