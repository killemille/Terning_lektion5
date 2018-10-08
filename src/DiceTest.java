import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    void roll() {
        Dice Testroll = new Dice();

        Boolean x = false;
        int terning = Testroll.roll();
        if ((terning >= 1) && (terning <= 6)) {
            x = true;
        }
        assertEquals(true, x);
    }

    @Test
    void rollMultiple() {
    }
}