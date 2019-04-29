package repository.Impl.Login;

import domain.LogIn.Register;
import repository.Login.RegisterRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RegisterRepositoryImpl implements RegisterRepository {

    private static RegisterRepositoryImpl repository = null;
    private Map<String, Register> registerTable;

    private RegisterRepositoryImpl(){
        this.registerTable = new HashMap<String, Register>();
    }

    public static RegisterRepositoryImpl getRepository()
    {
        if (repository == null) repository = new RegisterRepositoryImpl();
        return repository;
    }

    @Override
    public Register create(Register register) {
        registerTable.put(register.getName(),register);
        registerTable.put(register.getAddress(),register);
        registerTable.put(register.getEmail(),register);
        registerTable.put(register.getUsername(),register);
        registerTable.put(register.getPassword(),register);
        Register savedRegister = registerTable.get(toString());
        return savedRegister;
    }

    @Override
    public Register read(String r) {
        Register register = registerTable.get(toString());
        return register;
    }

    @Override
    public Register update(Register register) {
        registerTable.put(register.toString(),register);
        Register savedRegister = registerTable.get(toString());
        return savedRegister;
    }

    @Override
    public void delete(String r) {
        registerTable.remove(toString());
    }

    @Override
    public Set<Register> getAll() {
        return (Set<Register>) registerTable;
    }
}
