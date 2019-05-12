package com.danyjavierb.callcenter.unit;

import com.danyjavierb.callcenter.model.Call;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.annotation.Repeat;

public class CallTest {


    @Test
    @Repeat(10)
    public void testRamdomDuration(){
        Call testCall = new Call("testcall");
        int maxDuration = 10000;
        int minDuration = 5000;
        Assert.assertTrue(testCall.getDuration()<=maxDuration);
        Assert.assertTrue(testCall.getDuration()>=minDuration);
    }

}
