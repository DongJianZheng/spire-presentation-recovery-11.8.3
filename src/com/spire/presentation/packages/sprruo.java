/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprfgja;
import com.spire.presentation.packages.sproup;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprruo {
    private sprfgja cfr_renamed_4;

    public void cfr_renamed_15098(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_4.cfr_renamed_15098(arg0, arg1, arg2);
    }

    public void cfr_renamed_17446(int arg0) {
        byte by = (byte)((arg0 & 0xFF0000) >> 16);
        byte by2 = (byte)((arg0 & 0xFF00) >> 8);
        byte by3 = (byte)(arg0 & 0xFF);
        sprruo sprruo2 = this;
        sprruo2.cfr_renamed_4.cfr_renamed_11594(by);
        sprruo2.cfr_renamed_4.cfr_renamed_11594(by2);
        sprruo2.cfr_renamed_4.cfr_renamed_11594(by3);
    }

    public spreen cfr_renamed_14060() {
        return this.cfr_renamed_4.cfr_renamed_14060();
    }

    public void cfr_renamed_2947() {
        this.cfr_renamed_4.cfr_renamed_2947();
    }

    public void cfr_renamed_12761(int arg0) {
        this.cfr_renamed_4.cfr_renamed_12761(sproup.cfr_renamed_17447(arg0));
    }

    public void cfr_renamed_17448(long arg0) {
        this.cfr_renamed_4.cfr_renamed_17448(sproup.cfr_renamed_17449(arg0));
    }

    public void cfr_renamed_15085(int arg0) {
        this.cfr_renamed_4.cfr_renamed_15085(sproup.cfr_renamed_17450(arg0));
    }

    public void cfr_renamed_14639(int arg0) {
        this.cfr_renamed_4.cfr_renamed_12762(sproup.cfr_renamed_17451((short)arg0));
    }

    /*
     * WARNING - void declaration
     */
    public sprruo(spreen spreen2) {
        void arg0;
        sprruo sprruo2 = this;
        sprruo2.cfr_renamed_4 = new sprfgja((spreen)arg0);
    }

    public void cfr_renamed_15097(long arg0) {
        this.cfr_renamed_4.cfr_renamed_12761((int)(sproup.cfr_renamed_17452(arg0) & 0xFFFFFFFFL));
    }

    public void cfr_renamed_11594(byte arg0) {
        this.cfr_renamed_4.cfr_renamed_11594(arg0);
    }

    public void cfr_renamed_9854(byte[] arg0) {
        this.cfr_renamed_4.cfr_renamed_15098(arg0, 0, arg0.length);
    }
}

