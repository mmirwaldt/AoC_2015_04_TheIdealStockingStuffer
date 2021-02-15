package net.mirwaldt.day04;

import java.security.NoSuchAlgorithmException;

import static net.mirwaldt.day04.DefaultAdventCoinsMiner.sixLeadingZeros;

public class PartTwoAdventCoinsMinerMain {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        final AdventCoinsMiner miner = new DefaultAdventCoinsMiner();
        System.out.println(miner.mine("yzbqklnj", sixLeadingZeros()));
    }
}
