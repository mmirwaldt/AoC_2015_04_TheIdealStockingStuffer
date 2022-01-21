package net.mirwaldt.aoc.year2015.day04;

import java.security.NoSuchAlgorithmException;

import static net.mirwaldt.aoc.year2015.day04.DefaultAdventCoinsMiner.fiveLeadingZeros;

public class PartOneAdventCoinsMinerMain {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        final AdventCoinsMiner miner = new DefaultAdventCoinsMiner();
        System.out.println(miner.mine("yzbqklnj", fiveLeadingZeros())); // result : 282749
    }
}
