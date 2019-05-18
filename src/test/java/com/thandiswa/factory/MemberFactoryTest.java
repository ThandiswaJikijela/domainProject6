package com.thandiswa.factory;

import com.thandiswa.domain.Member;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MemberFactoryTest {

    @Test
    public void getMember() {
        String name = "King";
        String phoneNumber = "087564264";
        String address = "Woodstock";
        Member m = MemberFactory.getMember(address,name,phoneNumber);
        System.out.print(m);
        Assert.assertNotNull(m.toString());
    }
}