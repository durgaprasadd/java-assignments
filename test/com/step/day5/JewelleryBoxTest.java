package com.step.day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JewelleryBoxTest {
    @Test
    void name() {
        JewelleryBox _5thLevelBox = new JewelleryBox();

        JewelleryBox _4thLevelBox = new JewelleryBox(_5thLevelBox);

        Jewellery nacklace = new Jewellery("necklace");
        JewelleryBox _3rdLevelBox = new JewelleryBox(_4thLevelBox, nacklace);

        Jewellery ring = new Jewellery("ring");
        JewelleryBox _2ndLevelBox = new JewelleryBox(_3rdLevelBox, ring);

        JewelleryBox _1stLevelBox = new JewelleryBox(_2ndLevelBox);

        assertEquals(2, _1stLevelBox.getJewelleryCount());
    }
}