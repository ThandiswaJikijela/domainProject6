package com.thandiswa.factory.LogIn;

import com.thandiswa.domain.LogIn.LogIn;
import com.thandiswa.util.IDs;



public class LogInFactory {
    public static LogIn getLogIn(String password, String username) {
        return new LogIn.Builder().staffID(IDs.generateId())
                .username(username)
                .password(password)
                .build();
    }

}
