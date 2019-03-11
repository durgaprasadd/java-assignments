package com.step.day5;

public class JewelleryBox {
    private JewelleryBox smallBox;
    private Jewellery ornament;
    private int count;

    public JewelleryBox(){}
    public JewelleryBox(JewelleryBox smallBox) {
        this.smallBox = smallBox;
        this.count+=smallBox.getJewelleryCount();
    }

    public JewelleryBox(Jewellery ornament) {
        this.ornament = ornament;
        this.count +=1;
    }

    public JewelleryBox(JewelleryBox smallBox, Jewellery ornament) {
        this.smallBox = smallBox;
        this.ornament = ornament;
        this.count +=1;
        this.count += smallBox.getJewelleryCount();
    }

    public JewelleryBox getSmallBox() {
        return smallBox;
    }

    public boolean hasJewellery(){
        return this.ornament != null;
    }
    public boolean hasJewelleryBox(){
        return this.smallBox != null;
    }
    public Jewellery getOrnament() {
        return ornament;
    }

    public int getJewelleryCount() {
        return count;
    }
}
