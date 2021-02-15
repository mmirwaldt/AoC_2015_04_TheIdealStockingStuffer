package net.mirwaldt.day04;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.security.NoSuchAlgorithmException;
import java.util.stream.Stream;

import static net.mirwaldt.day04.DefaultAdventCoinsMiner.fiveLeadingZeros;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdventCoinsMinerTest {
    private final static AdventCoinsMiner adventCoinsMiner = new DefaultAdventCoinsMiner();

    private static Stream<Arguments> adventCoinsMiner() {
        return Stream.of(Arguments.of(adventCoinsMiner));
    }

    @ParameterizedTest
    @MethodSource("adventCoinsMiner")
    void test_groundFloor(AdventCoinsMiner adventCoinsMiner) throws NoSuchAlgorithmException {
        assertEquals(609043L, adventCoinsMiner.mine("abcdef", fiveLeadingZeros()));
        assertEquals(1048970L, adventCoinsMiner.mine("pqrstuv", fiveLeadingZeros()));
    }
}
