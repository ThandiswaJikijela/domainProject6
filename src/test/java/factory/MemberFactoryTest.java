package factory;

import domain.Member;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberFactoryTest {

    @Test
    public void getMember() {

        String address = "Woodstock";
        Member m = MemberFactory.getMember(address);
        System.out.print(m);
        Assert.assertNotNull(m.getAddress());
    }
}