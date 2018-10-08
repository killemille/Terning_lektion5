
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DiceTest {
    /**
     * @Aurthor SaschaTJ
     * Tester om terningen kan give andre værdier end 1-6
     */

    @org.junit.jupiter.api.Test
    void roll() {
        //Slår med terningen og importeret testobjekt
        Dice Testroll = new Dice();

        //Oprette x som falsk
        Boolean x = false;

        //Resultat af terningen er en int, hvis resultat er mellem 1 og 6 vil x blive sand
        int rollterning = Testroll.roll();
        if(rollterning >=1 && rollterning <=6)
            x = true;

        //Test
        assertEquals(true, x);

    }

    /**
     * @Aurthor Killemille
     * Tester om alle 6 værdier forkommer lige hyppigt
     */

    @org.junit.jupiter.api.Test

    void rollMultiple() {
        Dice Testroll = new Dice();

        int Et = 0;
        int To = 0;
        int Tre = 0;
        int Fire = 0;
        int Fem = 0;
        int Seks = 0;

        //Terning kastes 60000 gange.
        for (int i = 0; i < 60000; i++)
        {
            //Der tælles hvilket tal/øjne der landes på.
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

        //Der testes at terningen er en ægte terning.
        assertEquals(10000, Et, 400);
        assertEquals(10000, To, 400);
        assertEquals(10000, Tre, 400);
        assertEquals(10000, Fire, 400);
        assertEquals(10000, Fem, 400);
        assertEquals(10000, Seks, 400);
    }
}

//Begge test er inspiret af: https://github.com/trolund/terning/blob/master/DiceTest.java

