package com.thandiswa.factory;

import com.thandiswa.domain.Member;

import java.util.Map;

public class MemberFactory {
    public static Member getMember(Map<String, String> values,String address) {
        return new Member.Builder()
                .name(values.get(""))
                .address(address)
                .id(values.size())
                .phoneNumber(values.get(""))
                .build();
    }
}
