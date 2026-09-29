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
public class spraln
extends Structure {
    public int reserved4;
    public int reserved5;
    public int reserved8;
    public int reserved1;
    public int reserved6;
    public int reserved7;
    public int reserved2;
    public int reserved9;
    public int descender;
    public int line_gap;
    public int reserved3;
    public int ascender;

    public spraln() {
    }

    public int getDescender() {
        return this.descender;
    }

    public void setLineGap(int arg0) {
        this.line_gap = arg0;
    }

    public void setAscender(int arg0) {
        this.ascender = arg0;
    }

    public int getAscender() {
        return this.ascender;
    }

    public List<String> getFieldOrder() {
        String[] stringArray = new String[12];
        stringArray[0] = "ascender";
        stringArray[1] = "descender";
        stringArray[2] = "line_gap";
        stringArray[3] = "reserved9";
        stringArray[4] = "reserved8";
        stringArray[5] = "reserved7";
        stringArray[6] = "reserved6";
        stringArray[7] = "reserved5";
        stringArray[8] = "reserved4";
        stringArray[9] = "reserved3";
        stringArray[10] = "reserved2";
        stringArray[11] = "reserved1";
        return Arrays.asList(stringArray);
    }

    public spraln(Pointer arg0) {
        spraln spraln2 = this;
        super(arg0);
        spraln2.read();
    }

    public void setDescender(int arg0) {
        this.descender = arg0;
    }

    public int getLineGap() {
        return this.line_gap;
    }
}

