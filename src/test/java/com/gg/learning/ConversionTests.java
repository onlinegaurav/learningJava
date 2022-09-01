package com.gg.learning;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
class ConversionTests {

    @Test
    void canConvertStringToInt() {
        assertThat(123).isEqualTo( Integer.parseInt("123"));
    }

    @Test
    void canConvertIntToString() {
        assertThat("123").isEqualTo( Integer.toString(123));
    }

    @Test
    void canConvertStringToFloat() {
        assertThat(23.6f).isEqualTo( Float.parseFloat("23.6"));
    }

    @Test
    void canConvertFlotToString() {
        assertThat("23.6").isEqualTo( Float.toString(23.6f));
    }

    @Test
    void canConvertDoubleToString() {
        assertThat(23.6).isEqualTo( Double.parseDouble("23.6"));
    }

    @Test
    void canConvertStringToDouble() {
        assertThat("23.6").isEqualTo( Double.toString(23.6));
    }

    @Test
    void canConvertBooleanToString() {
        assertThat(true).isEqualTo( Boolean.parseBoolean("true"));
    }

    @Test
    void canConvertStringToBoolean() {
        assertThat("true").isEqualTo( Boolean.toString(true));
    }

    @Test
    void canConvertDateToString()
    {
        LocalDate date = LocalDate.of(2000,1,1);
        assertThat(date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))).isEqualTo( "2000-01-01");
    }

    @Test
    void canConvertStringToDate()
    {
        String date = "2000-01-01";
        assertThat(LocalDate.parse(date ,DateTimeFormatter.ofPattern("yyyy-MM-dd"))).isEqualTo( LocalDate.of(2000,1,1));
    }
}
