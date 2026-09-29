/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraro;
import com.spire.presentation.packages.sprfgja;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprrto
extends spraro {
    private int cfr_renamed_105;
    private long cfr_renamed_137;
    private int cfr_renamed_79;
    private long cfr_renamed_107;
    private int cfr_renamed_132;
    private int cfr_renamed_102;
    private int cfr_renamed_93;
    private int cfr_renamed_86;
    private int cfr_renamed_152;
    private long cfr_renamed_4;

    public void cfr_renamed_17974(int arg0) {
        this.cfr_renamed_105 = arg0;
    }

    public void cfr_renamed_1941(int arg0) {
        this.cfr_renamed_79 = arg0;
    }

    public void cfr_renamed_17972(long arg0) {
        this.cfr_renamed_137 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_17916(sprfgja sprfgja2) {
        void arg0;
        void v0 = arg0;
        sprrto sprrto2 = this;
        void v2 = arg0;
        sprrto sprrto3 = this;
        void v4 = arg0;
        sprrto sprrto4 = this;
        void v6 = arg0;
        v6.cfr_renamed_12761(this.cfr_renamed_2773());
        v6.cfr_renamed_12761(this.cfr_renamed_79);
        arg0.cfr_renamed_12761(sprrto4.cfr_renamed_86);
        v4.cfr_renamed_12762((short)(sprrto4.cfr_renamed_93 & 0xFFFF));
        v4.cfr_renamed_12762((short)(this.cfr_renamed_102 & 0xFFFF));
        arg0.cfr_renamed_12761(sprrto3.cfr_renamed_152);
        v2.cfr_renamed_12761((int)(sprrto3.cfr_renamed_137 & 0xFFFFFFFFL));
        v2.cfr_renamed_12761(this.cfr_renamed_105);
        arg0.cfr_renamed_12761(sprrto2.cfr_renamed_132);
        v0.cfr_renamed_12761((int)(sprrto2.cfr_renamed_107 & 0xFFFFFFFFL));
        v0.cfr_renamed_12761((int)(this.cfr_renamed_4 & 0xFFFFFFFFL));
    }

    public void cfr_renamed_17981(int arg0) {
        this.cfr_renamed_152 = arg0;
    }

    public int cfr_renamed_17936() {
        return this.cfr_renamed_105;
    }

    public int cfr_renamed_16218() {
        return this.cfr_renamed_102;
    }

    public int cfr_renamed_2860() {
        return this.cfr_renamed_152;
    }

    public void cfr_renamed_17976(long arg0) {
        this.cfr_renamed_107 = arg0;
    }

    public int cfr_renamed_17538() {
        return this.cfr_renamed_132;
    }

    public void cfr_renamed_12668(int arg0) {
        this.cfr_renamed_86 = arg0;
    }

    public int cfr_renamed_17971() {
        return this.cfr_renamed_93;
    }

    public void cfr_renamed_17980(int arg0) {
        this.cfr_renamed_102 = arg0;
    }

    public void cfr_renamed_17970(int arg0) {
        this.cfr_renamed_93 = arg0;
    }

    @Override
    public int cfr_renamed_2773() {
        return 40;
    }

    @Override
    public int cfr_renamed_16219() {
        if (((this.cfr_renamed_102 & 0xFFFF) == 32 || (this.cfr_renamed_102 & 0xFFFF) == 16) && this.cfr_renamed_152 == 3) {
            return 12;
        }
        if ((this.cfr_renamed_102 & 0xFFFF) > 8) {
            return 0;
        }
        int n = (this.cfr_renamed_107 & 0xFFFFFFFFL) != 0L ? (int)(this.cfr_renamed_107 & 0xFFFFFFFFL) : 1 << (this.cfr_renamed_102 & 0xFFFF);
        int n2 = 4;
        return n * n2;
    }

    public long cfr_renamed_17977() {
        return this.cfr_renamed_107;
    }

    public void cfr_renamed_17975(int arg0) {
        this.cfr_renamed_132 = arg0;
    }

    public int cfr_renamed_1942() {
        return this.cfr_renamed_79;
    }

    public long cfr_renamed_17979() {
        return this.cfr_renamed_4;
    }

    public int cfr_renamed_1452() {
        return this.cfr_renamed_86;
    }

    public void cfr_renamed_17978(long arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public long cfr_renamed_17973() {
        return this.cfr_renamed_137;
    }
}

