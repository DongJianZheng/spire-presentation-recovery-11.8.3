/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhfd;
import com.spire.presentation.packages.sprjcg;
import com.spire.presentation.packages.sprweg;

public class sprexf {
    private final sprjcg[] cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    private final sprweg[] cfr_renamed_4;

    public byte[] cfr_renamed_3353() {
        return this.cfr_renamed_3;
    }

    public sprexf(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        int n;
        byte[][] byArrayArray;
        byte[] byArray;
        int n2;
        this.cfr_renamed_3 = new byte[arg0];
        System.arraycopy(arg6, 0, this.cfr_renamed_3, 0, arg0);
        this.cfr_renamed_4 = new sprweg[arg1];
        int n3 = arg0;
        int n4 = n2 = 0;
        while (n4 != arg1) {
            byArray = new byte[arg0];
            int n5 = n3;
            System.arraycopy(arg6, n5, byArray, 0, arg0);
            n3 = n5 + arg0;
            byArrayArray = new byte[arg2][];
            int n6 = n = 0;
            while (n6 != arg2) {
                int n7 = n3;
                byArrayArray[n] = new byte[arg0];
                System.arraycopy(arg6, n7, byArrayArray[n], 0, arg0);
                n3 = n7 + arg0;
                n6 = ++n;
            }
            this.cfr_renamed_4[n2++] = new sprweg(byArray, byArrayArray);
            n4 = n2;
        }
        this.cfr_renamed_2 = new sprjcg[arg3];
        int n8 = n2 = 0;
        while (n8 != arg3) {
            byArray = new byte[arg5 * arg0];
            System.arraycopy(arg6, n3, byArray, 0, byArray.length);
            n3 += byArray.length;
            byArrayArray = new byte[arg4][];
            int n9 = n = 0;
            while (n9 != arg4) {
                int n10 = n3;
                byArrayArray[n] = new byte[arg0];
                System.arraycopy(arg6, n10, byArrayArray[n], 0, arg0);
                n3 = n10 + arg0;
                n9 = ++n;
            }
            this.cfr_renamed_2[n2++] = new sprjcg(byArray, byArrayArray);
            n8 = n2;
        }
        if (n3 != arg6.length) {
            throw new IllegalArgumentException(sprhfd.cfr_renamed_9("_\u0001K\u0006M\u001cY\u001aIH[\u001aC\u0006KH@\rB\u000fX\u0000"));
        }
    }

    public sprjcg[] cfr_renamed_5997() {
        return this.cfr_renamed_2;
    }

    public sprweg[] cfr_renamed_5996() {
        return this.cfr_renamed_4;
    }
}

