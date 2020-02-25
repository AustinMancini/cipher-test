import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CaesarCipherTest {

    private CaesarCipher caesarCipher = new CaesarCipher();

    @Test
    public void testCipheredMessageWithOffsetOf12() {
        assertEquals("tai mdq kag pauzs fapmke", caesarCipher.cipher("how are you doing today?", 12));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", caesarCipher.cipher("", 12));
    }

    @Test
    void testCipheredMessageWithOffsetOf11() {
        assertEquals("tai mdq kag pauzs fapmke", caesarCipher.cipher("how are you doing today", 11));
    }
}