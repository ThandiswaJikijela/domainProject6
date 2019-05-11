package com.thandiswa.service.Impl.Login;

import com.thandiswa.domain.LogIn.Register;
import com.thandiswa.repository.Impl.Login.RegisterRepositoryImpl;
import com.thandiswa.repository.Login.RegisterRepository;
import com.thandiswa.service.Login.RegisterService;

import java.util.Set;

public class RegisterServiceImpl implements RegisterService {
    private static RegisterServiceImpl service = null;
    private RegisterRepository repository;

    private RegisterServiceImpl() {
        this.repository = RegisterRepositoryImpl.getRepository();
    }

    public static RegisterServiceImpl getService(){
        if (service == null) service = new RegisterServiceImpl();
        return service;
    }

    @Override
    public Register create(Register register) {

        return this.repository.create(register);
    }

    @Override
    public Register update(Register register)
    {
        return this.repository.update(register);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public Register read(String s) {

        return this.repository.read(s);
    }

    @Override
    public Set<Register> getAll() {

        return this.repository.getAll();
    }
}
