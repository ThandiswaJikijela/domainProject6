package com.thandiswa.factory;

import com.thandiswa.domain.Member;
import com.thandiswa.util.IDs;

import java.util.Map;

public class MemberFactory {
    public static Member getMember(String address, String name, String phoneNumber) {
        return new Member.Builder()
                .name(name)
                .address(address)
                .id(IDs.generateId())
                .phoneNumber(phoneNumber)
                .build();
    }
}
