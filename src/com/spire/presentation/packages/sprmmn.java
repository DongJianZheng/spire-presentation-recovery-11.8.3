/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Pointer
 *  com.sun.jna.Structure
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;

@sprtea
public class sprmmn
extends Structure {
    public int x_offset;
    public int x_advance;
    public int y_offset;
    public int var;
    public int y_advance;

    public List<String> getFieldOrder() {
        String[] stringArray = new String[5];
        stringArray[0] = "x_advance";
        stringArray[1] = "y_advance";
        stringArray[2] = "x_offset";
        stringArray[3] = "y_offset";
        stringArray[4] = "var";
        return Arrays.asList(stringArray);
    }

    public int getXOffset() {
        return this.x_offset;
    }

    public sprmmn(Pointer arg0) {
        sprmmn sprmmn2 = this;
        super(arg0);
        sprmmn2.read();
    }

    public int getYAdvance() {
        return this.y_advance;
    }

    public int getXAdvance() {
        return this.x_advance;
    }

    public void setXAdvance(int arg0) {
        this.x_advance = arg0;
    }

    public void setYOffset(int arg0) {
        this.y_offset = arg0;
    }

    public int getYOffset() {
        return this.y_offset;
    }

    public void setXOffset(int arg0) {
        this.x_offset = arg0;
    }

    public void setYAdvance(int arg0) {
        this.y_advance = arg0;
    }
}

