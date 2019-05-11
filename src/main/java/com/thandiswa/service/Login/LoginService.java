package com.thandiswa.service.Login;

import com.thandiswa.domain.LogIn.LogIn;
import com.thandiswa.service.IService;

import java.util.Set;

public interface LoginService extends IService<LogIn, String> {
    Set<LogIn> getAll();
}
