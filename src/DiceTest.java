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
        Dice Testroll = new Dice();

        int Et = 0;
        int To = 0;
        int Tre = 0;
        int Fire = 0;
        int Fem = 0;
        int Seks = 0;

        for (int i = 0; i < 60000; i++)
        {
            switch(Testroll.roll())
            {
                case 1:
                    Et++;
                    break;
                case 2:
                    To++;
                    break;
                case 3:
                    Tre++;
                    break;
                case 4:
                    Fire++;
                    break;
                case 5:
                    Fem++;
                    break;
                case 6:
                    Seks++;
                    break;
            }
        }

        assertEquals(10000, Et, 400);
        assertEquals(10000, To, 400);
        assertEquals(10000, Tre, 400);
        assertEquals(10000, Fire, 400);
        assertEquals(10000, Fem, 400);
        assertEquals(10000, Seks, 400);
    }
}

//Begge test er inspiret af: https://github.com/trolund/terning/blob/master/DiceTest.java