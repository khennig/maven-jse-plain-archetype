package de.erik.java;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WhateverTest {

    @Test
    void addition() {
        // setup
        Whatever target = new Whatever();
        // test
        int result = target.addition(4, 5);
        // assert
        assertThat(result).isEqualTo(9);
    }
}