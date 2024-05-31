package org.example.maths;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterEach;

import org.mockito.Mock;
import org.mockito.Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class AutomorphicNumberTests {

    @Test
    public void testIsAutomorphic() {
        assertTrue(AutomorphicNumber.isAutomorphic(5));
    }

    @Test
    public void testIsAutomorphic2() {
        assertTrue(AutomorphicNumber.isAutomorphic2(25));
    }

    @Test
    public void testIsAutomorphic3() {
        assertTrue(AutomorphicNumber.isAutomorphic3("76"));
    }
}
