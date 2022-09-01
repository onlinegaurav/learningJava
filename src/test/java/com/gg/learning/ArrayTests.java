package com.gg.learning;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
class ArrayTests {

    @Test
    void canGetArrayLength() {
        int array[] = {1,2,3,4,5};
        assertThat(array.length).isEqualTo(5);
    }
}
