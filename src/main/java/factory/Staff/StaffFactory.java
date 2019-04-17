package factory.Staff;

import domain.Staff.Staff;

public class StaffFactory {
    public static Staff getStaff(String name, String email) {
        return new Staff.Builder().name(name)
                .email(email)
                .build();
    }
}
