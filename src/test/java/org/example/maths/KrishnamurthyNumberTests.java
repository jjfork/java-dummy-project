package org.example.maths;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class KrishnamurthyNumberTests {

    @Test
    public void testIsKMurthyWithKrishnamurthyNumber() {
        assertTrue(KrishnamurthyNumber.isKMurthy(145));
    }

    @Test
    public void testIsKMurthyWithNonKrishnamurthyNumber() {
        assertFalse(KrishnamurthyNumber.isKMurthy(123));
    }

    @Test
    public void testIsKMurthyWithZero() {
        assertFalse(KrishnamurthyNumber.isKMurthy(0));
    }

    @Test
    public void testIsKMurthyWithNegativeNumber() {
        assertFalse(KrishnamurthyNumber.isKMurthy(-123));
    }
}
