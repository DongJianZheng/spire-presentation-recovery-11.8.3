/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprlhca;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprurca;
import com.spire.presentation.packages.sprwvd;

@sprtea
public class sprven {
    private static final int cfr_renamed_1 = 8192;
    private long cfr_renamed_2 = 0xFFFFFFFFL;
    private static long[] cfr_renamed_3;
    private long cfr_renamed_4;

    public int cfr_renamed_11952(spreen arg0) {
        return this.cfr_renamed_12083(arg0, null);
    }

    public int cfr_renamed_12083(spreen arg0, spreen arg1) {
        if (arg0 == null) {
            throw new sprurca(sprwvd.cfr_renamed_9("z\tKAG\u000f^\u0014ZA]\u0015\\\u0004O\f\u000e\f[\u0012ZA@\u000eZAL\u0004\u000e\u000f[\rBO"));
        }
        byte[] byArray = new byte[8192];
        int n = 8192;
        this.cfr_renamed_4 = 0L;
        int n2 = arg0.cfr_renamed_11556(byArray, 0, n);
        if (arg1 != null) {
            arg1.cfr_renamed_4924(byArray, 0, n2);
        }
        this.cfr_renamed_4 += (long)n2;
        int n3 = n2;
        while (n3 > 0) {
            this.cfr_renamed_11596(byArray, 0, n2);
            n2 = arg0.cfr_renamed_11556(byArray, 0, n);
            if (arg1 != null) {
                arg1.cfr_renamed_4924(byArray, 0, n2);
            }
            this.cfr_renamed_4 += (long)n2;
            n3 = n2;
        }
        return (int)(this.cfr_renamed_2 & 0xFFFFFFFFL ^ 0xFFFFFFFFFFFFFFFFL);
    }

    public int cfr_renamed_11600() {
        return (int)(this.cfr_renamed_2 & 0xFFFFFFFFL ^ 0xFFFFFFFFFFFFFFFFL);
    }

    static {
        long l;
        long l2 = 3988292384L;
        cfr_renamed_3 = new long[256];
        long l3 = l = 0L;
        while ((l3 & 0xFFFFFFFFL) < 256L) {
            long l4;
            long l5 = l;
            long l6 = l4 = 8L;
            while ((l6 & 0xFFFFFFFFL) > 0L) {
                long l7;
                if ((l5 & 0xFFFFFFFFL & 1L) == 1L) {
                    l5 = (l5 & 0xFFFFFFFFL) >> 1 ^ l2 & 0xFFFFFFFFL;
                    l7 = l4;
                } else {
                    l5 = (l5 & 0xFFFFFFFFL) >> 1;
                    l7 = l4;
                }
                l6 = l7 - 1L;
            }
            sprven.cfr_renamed_3[(int)l] = l5;
            l3 = l + 1L;
        }
    }

    @sprtea
    public int cfr_renamed_12084(long arg0, byte arg1) {
        return (int)(cfr_renamed_3[(int)(arg0 & 0xFFFFFFFFL ^ (long)(arg1 & 0xFF)) & 0xFF] & 0xFFFFFFFFL ^ (arg0 & 0xFFFFFFFFL) >> 8);
    }

    public long cfr_renamed_11603() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_11596(byte[] arg0, int arg1, int arg2) {
        int n;
        if (arg0 == null) {
            throw new sprurca(sprlhca.cfr_renamed_9("\u000b\n:B;\u0003+\u0003\u007f\u0000*\u00049\u0007-B2\u0017,\u0016\u007f\f0\u0016\u007f\u0000:B1\u00173\u000eq"));
        }
        int n2 = n = 0;
        while (n2 < arg2) {
            int n3 = arg1 + n;
            this.cfr_renamed_2 = (this.cfr_renamed_2 & 0xFFFFFFFFL) >> 8 ^ cfr_renamed_3[(int)((long)(arg0[n3] & 0xFF) ^ this.cfr_renamed_2 & 0xFFFFFFFFL & 0xFFL)] & 0xFFFFFFFFL;
            n2 = ++n;
        }
        this.cfr_renamed_4 += (long)arg2;
    }

    public int cfr_renamed_11983(int arg0, byte arg1) {
        return this.cfr_renamed_12084(arg0, arg1);
    }
}

