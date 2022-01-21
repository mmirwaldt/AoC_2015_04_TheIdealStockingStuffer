package net.mirwaldt.aoc.year2015.day04;

import java.security.NoSuchAlgorithmException;
import java.util.function.Predicate;

public interface AdventCoinsMiner {
    long mine(String key, Predicate<byte[]> digestPredicate) throws NoSuchAlgorithmException;
}
