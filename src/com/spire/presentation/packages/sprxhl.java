/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprkjl;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.spruua;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprxxda;
import com.spire.presentation.packages.sprybl;

public class sprxhl
extends sprkjl
implements sprmr {
    private boolean cfr_renamed_1;
    private int[] cfr_renamed_2;
    private int[] cfr_renamed_3;
    private int[] cfr_renamed_4;
    public static final int cfr_renamed_119 = 8;

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        if (this.cfr_renamed_2 == null) {
            throw new IllegalStateException(spruua.cfr_renamed_9("W\f@,w,3,}.z'vi}&giz'z=z(\u007f `,w"));
        }
        if (arg1 + 8 > arg0.length) {
            throw new sprddl(sprxxda.cfr_renamed_9("\b:\u0011!\u0015t\u0003!\u00072\u0004&A \u000e;A'\t;\u0013 "));
        }
        if (arg3 + 8 > arg2.length) {
            throw new sprwjl(spruua.cfr_renamed_9("|<g9f=3+f/u,aig&|i`!|;g"));
        }
        byte[] byArray = new byte[8];
        if (this.cfr_renamed_1) {
            sprxhl sprxhl2 = this;
            sprxhl2.cfr_renamed_3681(sprxhl2.cfr_renamed_2, arg0, arg1, byArray, 0);
            sprxhl2.cfr_renamed_3681(sprxhl2.cfr_renamed_3, byArray, 0, byArray, 0);
            sprxhl2.cfr_renamed_3681(sprxhl2.cfr_renamed_4, byArray, 0, arg2, arg3);
        } else {
            sprxhl sprxhl3 = this;
            sprxhl3.cfr_renamed_3681(sprxhl3.cfr_renamed_4, arg0, arg1, byArray, 0);
            sprxhl3.cfr_renamed_3681(sprxhl3.cfr_renamed_3, byArray, 0, byArray, 0);
            sprxhl3.cfr_renamed_3681(sprxhl3.cfr_renamed_2, byArray, 0, arg2, arg3);
        }
        return 8;
    }

    private /* synthetic */ int cfr_renamed_10429() {
        if (this.cfr_renamed_2 != null) {
            sprxhl sprxhl2 = this;
            if (sprxhl2.cfr_renamed_2 == sprxhl2.cfr_renamed_4) {
                return 80;
            }
        }
        return 112;
    }

    @Override
    public int cfr_renamed_1195() {
        return 8;
    }

    public sprxhl() {
        sprxhl sprxhl2 = this;
        this.cfr_renamed_2 = null;
        sprxhl2.cfr_renamed_3 = null;
        sprxhl2.cfr_renamed_4 = null;
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), this.cfr_renamed_10429()));
    }

    @Override
    public String cfr_renamed_1315() {
        return sprxxda.cfr_renamed_9("%\u001121\u00051");
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        byte[] byArray;
        boolean bl;
        if (!(arg1 instanceof sprtpk)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, spruua.cfr_renamed_9(" }?r%z-39r;r$v=v;39r:`,wig&3\rV\u001av-viz'z=3d3")).append(arg1.getClass().getName()).toString());
        }
        byte[] byArray2 = ((sprtpk)arg1).cfr_renamed_1521();
        if (byArray2.length != 24 && byArray2.length != 16) {
            throw new IllegalArgumentException(sprxxda.cfr_renamed_9("\n1\u0018t\u0012=\u001b1A9\u0014'\u0015t\u00031AeWt\u000e&AfUt\u0003-\u00151\u0012z"));
        }
        this.cfr_renamed_1 = arg0;
        byte[] byArray3 = new byte[8];
        System.arraycopy(byArray2, 0, byArray3, 0, byArray3.length);
        this.cfr_renamed_2 = this.cfr_renamed_3661(arg0, byArray3);
        byte[] byArray4 = new byte[8];
        System.arraycopy(byArray2, 8, byArray4, 0, byArray4.length);
        if (!arg0) {
            bl = true;
            byArray = byArray4;
        } else {
            bl = false;
            byArray = byArray4;
        }
        this.cfr_renamed_3 = this.cfr_renamed_3661(bl, byArray);
        if (byArray2.length == 24) {
            byte[] byArray5 = new byte[8];
            System.arraycopy(byArray2, 16, byArray5, 0, byArray5.length);
            this.cfr_renamed_4 = this.cfr_renamed_3661(arg0, byArray5);
        } else {
            this.cfr_renamed_4 = this.cfr_renamed_2;
        }
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), this.cfr_renamed_10429(), arg1, sprlrk.cfr_renamed_9915(this.cfr_renamed_1)));
    }

    @Override
    public void cfr_renamed_41() {
    }
}

