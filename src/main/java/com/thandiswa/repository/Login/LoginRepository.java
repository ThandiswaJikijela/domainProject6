package com.thandiswa.repository.Login;

import com.thandiswa.domain.LogIn.LogIn;
import com.thandiswa.repository.IRepository;

import java.util.Set;

public interface LoginRepository extends IRepository<LogIn, String> {
    Set<LogIn> getAll();
}
