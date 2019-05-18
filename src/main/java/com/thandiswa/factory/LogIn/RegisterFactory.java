package com.thandiswa.factory.LogIn;

import com.thandiswa.domain.LogIn.Register;
import com.thandiswa.util.IDs;

import java.util.Map;

public class RegisterFactory {
    public static Register getRegister(String name, String email)
    { return new Register.Builder().regID(IDs.generateId())
                .name(name)
                .email(email)
                .build();
    }
}
