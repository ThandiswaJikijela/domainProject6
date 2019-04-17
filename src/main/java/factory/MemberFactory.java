package factory;

import domain.Member;

public class MemberFactory {
    public static Member getMember(String address) {
        return new Member.Builder()
                //.name(name)
                .address(address)
                //.id(id)
                //.phoneNumber(phoneNumber)
                .build();
    }
}
