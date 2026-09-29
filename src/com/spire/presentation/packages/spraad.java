/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprphaa;
import com.spire.presentation.packages.sprssp;
import com.spire.presentation.packages.sprzsc;

public class spraad {
    private int[] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spraad(int[] nArray, byte[] byArray) {
        spraad spraad2;
        byte[] arg1;
        void arg0;
        if (nArray == null || ((void)arg0).length < 1 || ((void)arg0).length >= 32768) {
            throw new IllegalArgumentException(sprssp.cfr_renamed_9("Py\u0005f\u0003l\u0014}\u001ef\u0019Y\u0005f\u0011`\u001bl\u0004.Wd\u0002z\u0003)\u001fh\u0001lWe\u0012g\u0010}\u001f)\u0011{\u0018dW8W}\u0018)_;)8B)Z)F "));
        }
        if (arg1 == null) {
            arg1 = sprzsc.cfr_renamed_1;
            spraad2 = this;
        } else {
            if (arg1.length > 255) {
                throw new IllegalArgumentException(sprphaa.cfr_renamed_9("t\u00038\u0007tN0\u000f=\u0000<\u001as\f6N?\u0001=\t6\u001cs\u001a;\u000f=Na[fN1\u0017'\u000b "));
            }
            spraad2 = this;
        }
        spraad2.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = arg1;
    }

    public byte[] cfr_renamed_2621() {
        return this.cfr_renamed_4;
    }

    public int[] cfr_renamed_2622() {
        return this.cfr_renamed_3;
    }
}

