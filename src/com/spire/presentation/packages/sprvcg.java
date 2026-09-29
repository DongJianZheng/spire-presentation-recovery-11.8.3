/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgzf;
import com.spire.presentation.packages.sprqdg;
import com.spire.presentation.packages.spruag;
import com.spire.presentation.packages.sprxag;

public class sprvcg
implements sprgf {
    private final sprgzf cfr_renamed_112;
    private volatile sprgf cfr_renamed_119;
    private spruag[] cfr_renamed_91;
    private final sprxag cfr_renamed_0;
    private final sprqdg cfr_renamed_1;
    private final byte[][] cfr_renamed_2;
    private final Object cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_119.cfr_renamed_1221(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprvcg(sprqdg sprqdg2, Object object, sprgf sprgf2) {
        void arg2;
        void arg1;
        void arg0;
        sprvcg sprvcg2 = this;
        sprvcg sprvcg3 = this;
        sprvcg sprvcg4 = this;
        this.cfr_renamed_1 = arg0;
        sprvcg4.cfr_renamed_3 = arg1;
        sprvcg4.cfr_renamed_119 = arg2;
        sprvcg3.cfr_renamed_4 = null;
        sprvcg3.cfr_renamed_0 = null;
        sprvcg2.cfr_renamed_112 = null;
        sprvcg2.cfr_renamed_2 = null;
    }

    public byte[] cfr_renamed_3369() {
        return this.cfr_renamed_4;
    }

    public sprxag cfr_renamed_1369() {
        return this.cfr_renamed_0;
    }

    public byte[][] cfr_renamed_6493() {
        return this.cfr_renamed_2;
    }

    public sprvcg cfr_renamed_6494(spruag[] arg0) {
        this.cfr_renamed_91 = arg0;
        return this;
    }

    public sprqdg cfr_renamed_1157() {
        return this.cfr_renamed_1;
    }

    public Object cfr_renamed_79() {
        return this.cfr_renamed_3;
    }

    @Override
    public String cfr_renamed_1315() {
        return this.cfr_renamed_119.cfr_renamed_1315();
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_119.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public int cfr_renamed_1218() {
        return this.cfr_renamed_119.cfr_renamed_1218();
    }

    public sprgzf cfr_renamed_5646() {
        return this.cfr_renamed_112;
    }

    /*
     * WARNING - void declaration
     */
    public sprvcg(sprxag sprxag2, sprgzf sprgzf2, sprgf sprgf2, byte[] byArray, byte[][] byArray2) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprvcg sprvcg2 = this;
        sprvcg sprvcg3 = this;
        sprvcg sprvcg4 = this;
        this.cfr_renamed_0 = arg0;
        sprvcg4.cfr_renamed_112 = arg1;
        sprvcg4.cfr_renamed_119 = arg2;
        sprvcg3.cfr_renamed_4 = arg3;
        sprvcg3.cfr_renamed_2 = arg4;
        sprvcg2.cfr_renamed_1 = null;
        sprvcg2.cfr_renamed_3 = null;
    }

    public byte[] cfr_renamed_1604() {
        byte[] byArray = new byte[34];
        this.cfr_renamed_119.cfr_renamed_1219(byArray, 0);
        this.cfr_renamed_119 = null;
        return byArray;
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_119.cfr_renamed_41();
    }

    public spruag[] cfr_renamed_6495() {
        return this.cfr_renamed_91;
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        return this.cfr_renamed_119.cfr_renamed_1219(arg0, arg1);
    }
}

