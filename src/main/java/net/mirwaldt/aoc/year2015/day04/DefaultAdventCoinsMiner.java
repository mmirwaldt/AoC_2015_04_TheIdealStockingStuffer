package net.mirwaldt.aoc.year2015.day04;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.function.Predicate;

public class DefaultAdventCoinsMiner implements AdventCoinsMiner {

    public static Predicate<byte[]> fiveLeadingZeros() {
        return bytesOfDigest -> bytesOfDigest[0] == 0
                && bytesOfDigest[1] == 0
                && 0 <= bytesOfDigest[2] && bytesOfDigest[2] < 0x10;
    }


    public static Predicate<byte[]> sixLeadingZeros() {
        return bytesOfDigest -> bytesOfDigest[0] == 0
                && bytesOfDigest[1] == 0
                && bytesOfDigest[2] == 0;
    }

    @Override
    public long mine(String key, Predicate<byte[]> digestPredicate) throws NoSuchAlgorithmException {
        final MessageDigest md = MessageDigest.getInstance("MD5");
        final StringBuilder keyAndIntString = new StringBuilder(key);
        for (long i = 1; i < Integer.MAX_VALUE; i++) {
            md.reset();
            keyAndIntString.append(i);
            final byte[] bytesOfMessage = keyAndIntString.toString().getBytes(StandardCharsets.ISO_8859_1);
            md.update(bytesOfMessage);
            final byte[] bytesOfDigest = md.digest();
            if (digestPredicate.test(bytesOfDigest)) {
                return i;
            }
            keyAndIntString.delete(key.length(), keyAndIntString.length());
        }
        return -1;
    }
}
