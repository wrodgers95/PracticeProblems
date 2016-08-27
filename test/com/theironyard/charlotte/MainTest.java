package com.theironyard.charlotte;

import org.junit.Test;

import static org.junit.Assert.*;


public class MainTest {
    @Test
    public void main() throws Exception {

    }

    @Test
    public void notString() throws Exception {

        assertEquals("nothing", Main.notString("nothing"));
        assertEquals("not thing", Main.notString("thing"));
        assertEquals("not blow", Main.notString("blow"));

    }

    @Test
    public void monkeyTrouble() throws Exception {
        assertEquals(true, Main.monkeyTrouble(true, true));
        assertEquals(false, Main.monkeyTrouble(true, false));
        assertEquals(true, Main.monkeyTrouble(false, false));
        assertEquals(false, Main.monkeyTrouble(false, true));
    }

    @Test
    public void sumDouble() throws Exception {
        assertEquals(Main.sumDouble(1,2), 3);
        assertEquals(Main.sumDouble(2,2), 8);
        assertEquals(Main.sumDouble(45,5), 50);
        assertEquals(Main.sumDouble(5,5), 20);
    }

    @Test
    public void diff21() throws Exception {
        assertEquals(Main.diff21(32), 22);
        assertEquals(Main.diff21(11), 10);
        assertEquals(Main.diff21(5), 16);
    }

    @Test
    public void parrotTrouble() throws Exception {

        assertEquals(true, Main.parrotTrouble(true, 14));
        assertEquals(true, Main.parrotTrouble(false, 2));
        assertEquals(false, Main.parrotTrouble(false, 17));

    }

    @Test
    public void makes10() throws Exception {

        assertEquals(true, Main.makes10(10,10));
        assertEquals(false, Main.makes10(2,3));
        assertEquals(true, Main.makes10(5,5));
        assertEquals(true, Main.makes10(10,7));


    }

    @Test
    public void nearHundred() throws Exception {
        assertEquals(true, Main.nearHundred(99));
        assertEquals(false, Main.nearHundred(67));
        assertEquals(true, Main.nearHundred(109));
        assertEquals(false, Main.nearHundred(89));
    }

    @Test
    public void posNeg() throws Exception {
    }

    @Test
    public void startHi() throws Exception {

    }

    @Test
    public void icyHot() throws Exception {

    }

    @Test
    public void close10() throws Exception {

    }

    @Test
    public void intMax() throws Exception {

    }

}