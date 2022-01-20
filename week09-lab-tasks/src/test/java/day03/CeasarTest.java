package day03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeasarTest {

    @Test
    void encryptsTest() {

        Ceasar ceasar=new Ceasar(3);

        String result = ceasar.encrypts("almafa");
        assertEquals("DOPDID", result);

        String result2 = ceasar.encrypts("almxyz");
        assertEquals("DOPABC", result2);
    }
}