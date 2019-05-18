package com.thandiswa.repository.Impl.Login;

import com.thandiswa.domain.LogIn.Register;
import com.thandiswa.repository.Login.RegisterRepository;

import java.util.*;

public class RegisterRepositoryImpl implements RegisterRepository {

    private static RegisterRepositoryImpl repository = null;
    private Map<String, Register> registerTable;

    private RegisterRepositoryImpl(){
        this.registerTable = new HashMap<>();
    }

    public static RegisterRepositoryImpl getRepository()
    {
        if (repository == null) repository = new RegisterRepositoryImpl();
        return repository;
    }

    @Override
    public Register create(Register register) {
       this.registerTable.put(register.toString(),register);
       return register;
    }

    @Override
    public Register read(String r) {
        Register register = registerTable.get(toString());
        return register;
    }

    @Override
    public Register update(Register register) {
        this.registerTable.replace(register.toString(),register);
        return this.registerTable.get(register.toString());
    }

    @Override
    public void delete(String r) {
        registerTable.remove(toString());
    }

    @Override
    public Set<Register> getAll() {
        Collection<Register> registers = this.registerTable.values();
        Set<Register> set = new HashSet<>();
        set.addAll(registers);
        return set;
    }
}
