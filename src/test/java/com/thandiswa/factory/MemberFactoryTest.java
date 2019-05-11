package com.thandiswa.factory;

import com.thandiswa.domain.Member;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MemberFactoryTest {
    private Map<String, String> values;

    @Test
    public void getMember() {
        values = new HashMap<String,String>();
        values.put("name","King");
        values.put("id","875756582657");
        values.put("phoneNumber","087564264");

        String address = "Woodstock";
        Member m = MemberFactory.getMember(values,address);
        System.out.print(m);
        Assert.assertNotNull(m.getAddress());
    }
}