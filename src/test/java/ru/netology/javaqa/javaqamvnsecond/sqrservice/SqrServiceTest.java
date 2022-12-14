package ru.netology.javaqa.javaqamvnsecond.sqrservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SqrServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")

    public void shouldCalqExact(int expected, int x, int y) {
        SqrService service = new SqrService();

        int actual = service.calqSqrt(x, y);

        Assertions.assertEquals(expected, actual);
    }
}
