/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprewi;
import com.spire.presentation.packages.sprfuc;
import com.spire.presentation.packages.sprgg;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprlfo;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.sprzsc;

public class sprfzc
implements sprgg {
    public sprlc cfr_renamed_2;
    public sprsc cfr_renamed_3;
    public sprlc cfr_renamed_4;

    @Override
    public void cfr_renamed_2691(short arg0) {
        throw new IllegalStateException(sprlfo.cfr_renamed_9("Q:\u007f7{;w1Z4a=2:|9kua b%}'f&26s9q ~4f<|22!z029w2s6kuB\u0007Tut:`uz4|1a=s>wuz4a="));
    }

    @Override
    public sprgg cfr_renamed_2957() {
        return this;
    }

    @Override
    public void cfr_renamed_2797(sprsc arg0) {
        this.cfr_renamed_3 = arg0;
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        sprfzc sprfzc2 = this;
        sprfzc2.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
        sprfzc2.cfr_renamed_2.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public int cfr_renamed_1218() {
        return this.cfr_renamed_4.cfr_renamed_1218() + this.cfr_renamed_2.cfr_renamed_1218();
    }

    public void cfr_renamed_3207(sprlc arg0, byte[] arg1, byte[] arg2, int arg3) {
        byte[] byArray = this.cfr_renamed_3.cfr_renamed_2666().cfr_renamed_152;
        arg0.cfr_renamed_1197(byArray, 0, byArray.length);
        sprlc sprlc2 = arg0;
        sprlc2.cfr_renamed_1197(arg1, 0, arg3);
        byte[] byArray2 = new byte[sprlc2.cfr_renamed_1218()];
        sprlc2.cfr_renamed_1219(byArray2, 0);
        sprlc2.cfr_renamed_1197(byArray, 0, byArray.length);
        sprlc sprlc3 = arg0;
        sprlc3.cfr_renamed_1197(arg2, 0, arg3);
        sprlc3.cfr_renamed_1197(byArray2, 0, byArray2.length);
    }

    /*
     * WARNING - void declaration
     */
    public sprfzc(sprfzc sprfzc2) {
        void arg0;
        sprfzc sprfzc3 = this;
        this.cfr_renamed_3 = arg0.cfr_renamed_3;
        sprfzc3.cfr_renamed_4 = sprzsc.cfr_renamed_2673((short)1, arg0.cfr_renamed_4);
        sprfzc3.cfr_renamed_2 = sprzsc.cfr_renamed_2673((short)2, arg0.cfr_renamed_2);
    }

    @Override
    public sprgg cfr_renamed_2958() {
        return new sprfzc(this);
    }

    @Override
    public void cfr_renamed_2883() {
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        if (this.cfr_renamed_3 != null && sprzsc.cfr_renamed_2665(this.cfr_renamed_3)) {
            sprfzc sprfzc2 = this;
            sprfzc2.cfr_renamed_3207(sprfzc2.cfr_renamed_4, sprfuc.cfr_renamed_2, sprfuc.cfr_renamed_4, 48);
            sprfzc2.cfr_renamed_3207(sprfzc2.cfr_renamed_2, sprfuc.cfr_renamed_2, sprfuc.cfr_renamed_4, 40);
        }
        sprfzc sprfzc3 = this;
        int n = sprfzc3.cfr_renamed_4.cfr_renamed_1219(arg0, arg1);
        int n2 = sprfzc3.cfr_renamed_2.cfr_renamed_1219(arg0, arg1 + n);
        return n + n2;
    }

    @Override
    public byte[] cfr_renamed_2821(short arg0) {
        throw new IllegalStateException(sprewi.cfr_renamed_9("Y2w?s3\u007f9R<i5:9u8i3=):.o-j2h):0o1n4j1\u007f}r<i5\u007f."));
    }

    public sprfzc() {
        sprfzc sprfzc2 = this;
        sprfzc2.cfr_renamed_4 = sprzsc.cfr_renamed_2640((short)1);
        sprfzc2.cfr_renamed_2 = sprzsc.cfr_renamed_2640((short)2);
    }

    @Override
    public void cfr_renamed_41() {
        sprfzc sprfzc2 = this;
        sprfzc2.cfr_renamed_4.cfr_renamed_41();
        sprfzc2.cfr_renamed_2.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        sprfzc sprfzc2 = this;
        sprfzc2.cfr_renamed_4.cfr_renamed_1221(arg0);
        sprfzc2.cfr_renamed_2.cfr_renamed_1221(arg0);
    }

    @Override
    public sprlc cfr_renamed_2942() {
        return new sprfzc(this);
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_4.cfr_renamed_1315()).append(sprlfo.cfr_renamed_9("us;vu")).append(this.cfr_renamed_2.cfr_renamed_1315()).toString();
    }
}

