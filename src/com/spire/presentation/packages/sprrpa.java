/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqvk;
import com.spire.presentation.packages.sprxqo;
import com.spire.presentation.packages.sprzra;
import java.security.spec.AlgorithmParameterSpec;

public class sprrpa
implements AlgorithmParameterSpec {
    private int[] cfr_renamed_3;
    private static final int[] cfr_renamed_4;

    public int cfr_renamed_1140() {
        return this.cfr_renamed_3.length - 1;
    }

    public int cfr_renamed_1141() {
        sprrpa sprrpa2 = this;
        return sprrpa2.cfr_renamed_3[sprrpa2.cfr_renamed_3.length - 1] - this.cfr_renamed_3[0];
    }

    public int[] cfr_renamed_1139() {
        return sprzra.cfr_renamed_535(this.cfr_renamed_3);
    }

    public sprrpa() {
        this.cfr_renamed_3 = cfr_renamed_4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprrpa(int[] nArray) {
        this.cfr_renamed_3 = nArray;
        try {
            this.cfr_renamed_1142();
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    private /* synthetic */ void cfr_renamed_1142() throws Exception {
        if (this.cfr_renamed_3 == null) {
            throw new IllegalArgumentException(sprxqo.cfr_renamed_9("\t(G+\u0006>\u00025\u0014g\u0003\"\u0001.\t\"\u0003i"));
        }
        if (this.cfr_renamed_3.length > 1) {
            int n;
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_3.length - 1) {
                if (this.cfr_renamed_3[n] >= this.cfr_renamed_3[n + 1]) {
                    throw new IllegalArgumentException(sprqvk.cfr_renamed_9("7u(saF ]aZ.\u000e#Ka],O-B$\\aZ)O/\u000e7u(\u0005ps"));
                }
                n2 = ++n;
            }
        } else {
            throw new IllegalArgumentException(sprxqo.cfr_renamed_9("5&\u000e)\u0005(\u0010g\t\"\u0002#\u0014g\u00063G+\u0002&\u00143GvG+\u0006>\u00025Kg\u00142\u0004/G3\u000f&\u0013g\u0011vG{G1Ui"));
        }
    }

    static {
        int[] nArray = new int[5];
        nArray[0] = 6;
        nArray[1] = 12;
        nArray[2] = 17;
        nArray[3] = 22;
        nArray[4] = 33;
        cfr_renamed_4 = nArray;
    }
}

