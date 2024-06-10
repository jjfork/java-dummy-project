package org.example.maths;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.mockito.Mockito;
import org.mockito.Mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class DigitalRootTests {

    @Test
    void testDigitalRoot() {
        assertThat(DigitalRoot.digitalRoot(12345)).isEqualTo(6);
        assertThat(DigitalRoot.digitalRoot(987654321)).isEqualTo(9);
        assertThat(DigitalRoot.digitalRoot(555555)).isEqualTo(3);
    }

    @Test
    void testSingle() {
        assertThat(DigitalRoot.single(12345)).isEqualTo(15);
        assertThat(DigitalRoot.single(987654321)).isEqualTo(45);
        assertThat(DigitalRoot.single(555555)).isEqualTo(30);
    }

}