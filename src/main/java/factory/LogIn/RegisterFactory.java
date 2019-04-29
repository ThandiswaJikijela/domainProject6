package factory.LogIn;

import domain.LogIn.Register;

import java.util.Map;

public class RegisterFactory {
    public static Register getRegister(Map<String, String> values, String name)
    {
        return new Register.Builder().name(name)
                .address(values.get("address"))
                .email(values.get("email"))
                .username(values.get("username"))
                .password(values.get("password"))
                .build();
    }
}
