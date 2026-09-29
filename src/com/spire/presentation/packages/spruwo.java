/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxpo;

@sprtea
public class spruwo
extends sprxpo {
    private int cfr_renamed_2;
    private int[][] cfr_renamed_4;

    @Override
    public void cfr_renamed_18025(int arg0, byte[] arg1, int arg2) {
        int n;
        int[] nArray = this.cfr_renamed_4[0];
        int n2 = 1;
        int n3 = 0;
        int n4 = nArray.length;
        int n5 = n3;
        while (n5 < n4 && this.cfr_renamed_91 + n2 < this.cfr_renamed_3) {
            n = (arg1[arg2 + n2] & 0xFF) + arg0 * nArray[n3] / this.cfr_renamed_2;
            n = n < 0 ? 0 : (n > 255 ? 255 : n);
            int n6 = arg2 + n2;
            ++n2;
            arg1[n6] = (byte)n;
            n5 = ++n3;
        }
        n2 = 1;
        n3 = this.cfr_renamed_4.length;
        int n7 = n2;
        while (n7 < n3) {
            if (this.cfr_renamed_1 + n2 >= this.cfr_renamed_119) {
                return;
            }
            arg2 += this.cfr_renamed_4;
            nArray = this.cfr_renamed_4[n2];
            n4 = 0;
            int n8 = nArray.length;
            int n9 = -(n8 >> 1);
            int n10 = n4;
            while (n10 < n8 && this.cfr_renamed_91 + n9 < this.cfr_renamed_3) {
                if (this.cfr_renamed_91 + n9 >= 0) {
                    n = (arg1[arg2 + n9] & 0xFF) + arg0 * nArray[n4] / this.cfr_renamed_2;
                    n = n < 0 ? 0 : (n > 255 ? 255 : n);
                    arg1[arg2 + n9] = (byte)n;
                }
                ++n9;
                n10 = ++n4;
            }
            n7 = ++n2;
        }
    }

    private /* synthetic */ void cfr_renamed_18030() {
        this.cfr_renamed_2 = 0;
        int n = 0;
        int n2 = this.cfr_renamed_4.length;
        int n3 = n;
        while (n3 < n2) {
            int[] nArray = this.cfr_renamed_4[n];
            int n4 = 0;
            int n5 = nArray.length;
            int n6 = n4;
            while (n6 < n5) {
                this.cfr_renamed_2 += nArray[n4++];
                n6 = n4;
            }
            n3 = ++n;
        }
    }

    public spruwo(int[][] nArray) {
        spruwo spruwo2 = this;
        spruwo2.cfr_renamed_4 = nArray;
        spruwo2.cfr_renamed_18030();
    }
}

