package com.thandiswa.factory.LogIn;

import com.thandiswa.domain.LogIn.LogIn;

import java.util.Map;

public class LogInFactory {
    public static LogIn getLogIn(Map<String, String> values,String username) {
        return new LogIn.Builder().username(username)
                .password(values.get("password"))
                .build();
    }

}
