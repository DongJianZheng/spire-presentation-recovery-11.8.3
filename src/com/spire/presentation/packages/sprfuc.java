/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprrfz;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spruc;
import com.spire.presentation.packages.sprzra;

public class sprfuc
implements spruc {
    private sprlc cfr_renamed_119;
    private static final byte cfr_renamed_91 = 92;
    private static final byte cfr_renamed_0 = 54;
    private byte[] cfr_renamed_1;
    public static final byte[] cfr_renamed_2 = sprfuc.cfr_renamed_3068((byte)54, 48);
    private int cfr_renamed_3;
    public static final byte[] cfr_renamed_4 = sprfuc.cfr_renamed_3068((byte)92, 48);

    private static /* synthetic */ byte[] cfr_renamed_3068(byte arg0, int arg1) {
        byte[] byArray = new byte[arg1];
        sprzra.cfr_renamed_492(byArray, arg0);
        return byArray;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_119.cfr_renamed_1221(arg0);
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        sprfuc sprfuc2 = this;
        byte[] byArray = new byte[sprfuc2.cfr_renamed_119.cfr_renamed_1218()];
        sprfuc2.cfr_renamed_119.cfr_renamed_1219(byArray, 0);
        sprfuc2.cfr_renamed_119.cfr_renamed_1197(this.cfr_renamed_1, 0, this.cfr_renamed_1.length);
        sprfuc sprfuc3 = this;
        sprfuc3.cfr_renamed_119.cfr_renamed_1197(cfr_renamed_4, 0, this.cfr_renamed_3);
        sprfuc3.cfr_renamed_119.cfr_renamed_1197(byArray, 0, byArray.length);
        sprfuc sprfuc4 = this;
        int n = sprfuc4.cfr_renamed_119.cfr_renamed_1219(arg0, arg1);
        sprfuc4.cfr_renamed_41();
        return n;
    }

    public sprlc cfr_renamed_3069() {
        return this.cfr_renamed_119;
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_119.cfr_renamed_1315()).append(sprrfz.cfr_renamed_9("\u00171k.\u000b/y!")).toString();
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_119.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public int cfr_renamed_2404() {
        return this.cfr_renamed_119.cfr_renamed_1218();
    }

    public sprfuc(sprlc arg0) {
        this.cfr_renamed_119 = arg0;
        if (this.cfr_renamed_119.cfr_renamed_1218() == 20) {
            this.cfr_renamed_3 = 40;
            return;
        }
        this.cfr_renamed_3 = 48;
    }

    @Override
    public void cfr_renamed_1524(sprt arg0) {
        this.cfr_renamed_1 = sprzra.cfr_renamed_158(((sprnld)arg0).cfr_renamed_1521());
        this.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_41() {
        sprfuc sprfuc2 = this;
        sprfuc2.cfr_renamed_119.cfr_renamed_41();
        sprfuc2.cfr_renamed_119.cfr_renamed_1197(this.cfr_renamed_1, 0, this.cfr_renamed_1.length);
        this.cfr_renamed_119.cfr_renamed_1197(cfr_renamed_2, 0, this.cfr_renamed_3);
    }
}

