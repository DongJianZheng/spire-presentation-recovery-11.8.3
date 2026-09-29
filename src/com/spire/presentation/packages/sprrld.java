/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbfd;
import com.spire.presentation.packages.spreid;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprygn;
import com.spire.presentation.packages.spryxha;

public class sprrld
extends sprbfd {
    private int[] cfr_renamed_3682;
    private boolean cfr_renamed_2;
    public static final int cfr_renamed_3683 = 8;
    private int[] cfr_renamed_3;
    private int[] cfr_renamed_4;

    @Override
    public int cfr_renamed_1195() {
        return 8;
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        if (this.cfr_renamed_4 == null) {
            throw new IllegalStateException(sprygn.cfr_renamed_9("3\u000f$/\u0013/W/\u0019-\u001e$\u0012j\u0019%\u0003j\u001e$\u001e>\u001e+\u001b#\u0004/\u0013"));
        }
        if (arg1 + 8 > arg0.length) {
            throw new sprjkd(spryxha.cfr_renamed_9("#R:I>\u001c(I,Z/NjH%SjO\"S8H"));
        }
        if (arg3 + 8 > arg2.length) {
            throw new spreid(sprygn.cfr_renamed_9("\u0018?\u0003:\u0002>W(\u0002,\u0011/\u0005j\u0003%\u0018j\u0004\"\u00188\u0003"));
        }
        byte[] byArray = new byte[8];
        if (this.cfr_renamed_2) {
            sprrld sprrld2 = this;
            sprrld2.cfr_renamed_3681(sprrld2.cfr_renamed_4, arg0, arg1, byArray, 0);
            sprrld2.cfr_renamed_3681(sprrld2.cfr_renamed_3682, byArray, 0, byArray, 0);
            sprrld2.cfr_renamed_3681(sprrld2.cfr_renamed_3, byArray, 0, arg2, arg3);
        } else {
            sprrld sprrld3 = this;
            sprrld3.cfr_renamed_3681(sprrld3.cfr_renamed_3, arg0, arg1, byArray, 0);
            sprrld3.cfr_renamed_3681(sprrld3.cfr_renamed_3682, byArray, 0, byArray, 0);
            sprrld3.cfr_renamed_3681(sprrld3.cfr_renamed_4, byArray, 0, arg2, arg3);
        }
        return 8;
    }

    @Override
    public String cfr_renamed_1315() {
        return spryxha.cfr_renamed_9("\u000ey\u0019Y.Y");
    }

    public sprrld() {
        sprrld sprrld2 = this;
        this.cfr_renamed_4 = null;
        sprrld2.cfr_renamed_3682 = null;
        sprrld2.cfr_renamed_3 = null;
    }

    @Override
    public void cfr_renamed_41() {
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        byte[] byArray;
        boolean bl;
        if (!(arg1 instanceof sprnld)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprygn.cfr_renamed_9("#\u0019<\u0016&\u001e.W:\u00168\u0016'\u0012>\u00128W:\u00169\u0004/\u0013j\u0003%W\u000e2\u0019\u0012.\u0012j\u001e$\u001e>WgW")).append(arg1.getClass().getName()).toString());
        }
        byte[] byArray2 = ((sprnld)arg1).cfr_renamed_1521();
        if (byArray2.length != 24 && byArray2.length != 16) {
            throw new IllegalArgumentException(spryxha.cfr_renamed_9("!Y3\u001c9U0YjQ?O>\u001c(Yj\r|\u001c%Nj\u000e~\u001c(E>Y9\u0012"));
        }
        this.cfr_renamed_2 = arg0;
        byte[] byArray3 = new byte[8];
        System.arraycopy(byArray2, 0, byArray3, 0, byArray3.length);
        this.cfr_renamed_4 = this.cfr_renamed_3661(arg0, byArray3);
        byte[] byArray4 = new byte[8];
        System.arraycopy(byArray2, 8, byArray4, 0, byArray4.length);
        if (!arg0) {
            bl = true;
            byArray = byArray4;
        } else {
            bl = false;
            byArray = byArray4;
        }
        this.cfr_renamed_3682 = this.cfr_renamed_3661(bl, byArray);
        if (byArray2.length == 24) {
            byte[] byArray5 = new byte[8];
            System.arraycopy(byArray2, 16, byArray5, 0, byArray5.length);
            this.cfr_renamed_3 = this.cfr_renamed_3661(arg0, byArray5);
            return;
        }
        this.cfr_renamed_3 = this.cfr_renamed_4;
    }
}

