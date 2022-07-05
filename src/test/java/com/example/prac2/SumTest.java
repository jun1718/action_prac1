package com.example.prac2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTest {
    @Test
    void name() {
        Sum sum = new Sum();
        assertThat(sum.calc(1))
            .isEqualTo(2);
    }
}