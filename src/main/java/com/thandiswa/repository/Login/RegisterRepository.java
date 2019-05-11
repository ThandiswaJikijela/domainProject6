package com.thandiswa.repository.Login;

import com.thandiswa.domain.LogIn.Register;
import com.thandiswa.repository.IRepository;

import java.util.Set;

public interface RegisterRepository extends IRepository<Register, String> {
    Set<Register> getAll();
}
