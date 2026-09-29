/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcgo;
import com.spire.presentation.packages.sprnql;
import com.spire.presentation.packages.sprt;

public class sprkgb
implements sprt {
    private int[] cfr_renamed_3;
    private final int[] cfr_renamed_4;

    public int cfr_renamed_1140() {
        return this.cfr_renamed_3.length - 1;
    }

    public sprkgb() {
        sprkgb sprkgb2 = this;
        sprkgb sprkgb3 = this;
        int[] nArray = new int[5];
        nArray[0] = 6;
        nArray[1] = 12;
        nArray[2] = 17;
        nArray[3] = 22;
        nArray[4] = 33;
        sprkgb2.cfr_renamed_4 = nArray;
        sprkgb2.cfr_renamed_3 = sprkgb3.cfr_renamed_4;
    }

    public int cfr_renamed_1130() {
        sprkgb sprkgb2 = this;
        return sprkgb2.cfr_renamed_3[sprkgb2.cfr_renamed_3.length - 1] - this.cfr_renamed_3[0];
    }

    private /* synthetic */ void cfr_renamed_1142() throws Exception {
        if (this.cfr_renamed_3 == null) {
            throw new Exception(sprnql.cfr_renamed_9("(mfn'{#p5\"\"g k(g\","));
        }
        if (this.cfr_renamed_3.length > 1) {
            int n;
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_3.length - 1) {
                if (this.cfr_renamed_3[n] >= this.cfr_renamed_3[n + 1]) {
                    throw new Exception(sprcgo.cfr_renamed_9("zAeG,rmi,nc:n\u007f,ia{`vih,nd{b:zAe1=G"));
                }
                n2 = ++n;
            }
        } else {
            throw new Exception(sprnql.cfr_renamed_9("\u0014c/l$m1\"(g#f5\"'vfn#c5vf3fn'{#pj\"5w%jfv.c2\"03f>ftt,"));
        }
    }

    public int[] cfr_renamed_1139() {
        return this.cfr_renamed_3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprkgb(int[] nArray) {
        sprkgb sprkgb2 = this;
        int[] nArray2 = new int[5];
        nArray2[0] = 6;
        nArray2[1] = 12;
        nArray2[2] = 17;
        nArray2[3] = 22;
        nArray2[4] = 33;
        sprkgb2.cfr_renamed_4 = nArray2;
        sprkgb2.cfr_renamed_3 = nArray;
        try {
            this.cfr_renamed_1142();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }
}

