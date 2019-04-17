package factory.LogIn;

import domain.LogIn.Register;

public class RegisterFactory {
    public static Register getRegister(String name, String address, String email, String username, String password)
    {
        return new Register.Builder().name(name)
                .address(address)
                .email(email)
                .username(username)
                .password(password)
                .build();
    }
}
