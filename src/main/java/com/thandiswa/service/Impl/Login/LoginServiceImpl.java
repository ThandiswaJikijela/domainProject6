package com.thandiswa.service.Impl.Login;

import com.thandiswa.domain.LogIn.LogIn;
import com.thandiswa.repository.Impl.Login.LoginRepositoryImpl;
import com.thandiswa.repository.Login.LoginRepository;
import com.thandiswa.service.Login.LoginService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class LoginServiceImpl implements LoginService {
    private static LoginServiceImpl service = null;
    private LoginRepository repository;

    private LoginServiceImpl() {
        this.repository = LoginRepositoryImpl.getRepository();
    }

    public static LoginServiceImpl getService(){
        if (service == null) service = new LoginServiceImpl();
        return service;
    }

    @Override
    public LogIn create(LogIn logIn) {

        return this.repository.create(logIn);
    }

    @Override
    public LogIn update(LogIn logIn) {

        return this.repository.update(logIn);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public LogIn read(String s) {

        return this.repository.read(s);
    }

    @Override
    public Set<LogIn> getAll() {

        return this.repository.getAll();
    }
}
