package com.thandiswa.service.Login;

import com.thandiswa.domain.LogIn.Register;
import com.thandiswa.service.IService;

import java.util.Set;

public interface RegisterService extends IService<Register, String> {
    Set<Register> getAll();
}
