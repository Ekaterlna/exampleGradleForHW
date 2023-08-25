package ru.netology.ru.netology.unit;

import org.junit.jupiter.api.Test;
import ru.netology.unit.BonusService;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldReturn10IfAmount2000() {
        //подготовка данных, выполнение целевого действия, сравнение ожидаемого и фактического результатов
        BonusService service = new BonusService();
        int amount = 2000;
        int actual = service.calculateBonus(amount);
        int expected = 10;
        assertEquals(expected, actual);
    }
}