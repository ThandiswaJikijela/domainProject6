package factory.LogIn;

import domain.LogIn.LogIn;

public class LogInFactory {
    public static LogIn getLogIn(String username/*, String password*/) {
        return new LogIn.Builder().username(username)
                //.password(password)
                .build();
    }

}
