package com.step.day5;

public class Main {
    public static void main(String[] args) {
        Jewellery necklace = new Jewellery("necklace");
        JewelleryBox smallBox = new JewelleryBox(necklace);
        JewelleryBox bigBox = new JewelleryBox(smallBox,necklace);
        System.out.println(bigBox.getJewelleryCount());
    }
}
