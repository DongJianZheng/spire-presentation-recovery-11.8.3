/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprawm;
import com.spire.presentation.packages.sprlcn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprzkaa;

@sprtea
public class sproan {
    private static int cfr_renamed_1 = 15;
    private static sproan cfr_renamed_2;
    private static sproan cfr_renamed_3;
    private short[] cfr_renamed_4;

    public int cfr_renamed_12197(sprlcn arg0) {
        int n = arg0.cfr_renamed_12198(9);
        if (n >= 0) {
            short s = this.cfr_renamed_4[n];
            if (s >= 0) {
                short s2 = s;
                arg0.cfr_renamed_12199(s2 & 0xF);
                return s2 >> 4;
            }
            int n2 = -(s >> 4);
            int n3 = s & 0xF;
            n = arg0.cfr_renamed_12198(n3);
            if (n >= 0) {
                s = this.cfr_renamed_4[n2 | n >> 9];
                arg0.cfr_renamed_12199(s & 0xF);
                return s >> 4;
            }
            sprlcn sprlcn2 = arg0;
            int n4 = sprlcn2.cfr_renamed_12200();
            n = sprlcn2.cfr_renamed_12198(n4);
            s = this.cfr_renamed_4[n2 | n >> 9];
            if ((s & 0xF) <= n4) {
                short s3 = s;
                arg0.cfr_renamed_12199(s3 & 0xF);
                return s3 >> 4;
            }
            return -1;
        }
        sprlcn sprlcn3 = arg0;
        int n5 = sprlcn3.cfr_renamed_12200();
        n = sprlcn3.cfr_renamed_12198(n5);
        short s = this.cfr_renamed_4[n];
        if (s >= 0 && (s & 0xF) <= n5) {
            short s4 = s;
            arg0.cfr_renamed_12199(s4 & 0xF);
            return s4 >> 4;
        }
        return -1;
    }

    public sproan(byte[] byArray) {
        sproan sproan2 = this;
        sproan2.cfr_renamed_12201(byArray);
    }

    public static sproan cfr_renamed_12202() {
        return cfr_renamed_2;
    }

    private /* synthetic */ int cfr_renamed_12203(int[] arg0, int[] arg1, byte[] arg2, int[] arg3) {
        int n;
        int n2;
        int n3 = 0;
        arg3[0] = 512;
        int n4 = n2 = 0;
        while (n4 < arg2.length) {
            n = arg2[n2] & 0xFF;
            if (n > 0) {
                int n5 = n;
                arg0[n5] = arg0[n5] + 1;
            }
            n4 = ++n2;
        }
        int n6 = n2 = 1;
        while (n6 <= cfr_renamed_1) {
            arg1[n2] = n3;
            n3 = arg1[n2] + (arg0[n2] << 16 - n2);
            if (n2 >= 10) {
                n = arg1[n2] & 0x1FF80;
                int n7 = n3 & 0x1FF80;
                arg3[0] = arg3[0] + (n7 - n >> 16 - n2);
            }
            n6 = ++n2;
        }
        return n3;
    }

    private /* synthetic */ short[] cfr_renamed_12204(int[] arg0, int[] arg1, byte[] arg2, int arg3, int arg4) {
        int n;
        int n2;
        int n3;
        int n4;
        short[] sArray = new short[arg4];
        int n5 = 512;
        int n6 = 128;
        int n7 = n4 = cfr_renamed_1;
        while (n7 >= 10) {
            n3 = arg3 & 0x1FF80;
            int n8 = n2 = (n = (arg3 -= arg0[n4] << 16 - n4) & 0x1FF80);
            while (n8 < n3) {
                int n9 = n5;
                sArray[sprawm.cfr_renamed_12177((int)n2)] = (short)(-n9 << 4 | n4);
                n5 = n9 + (1 << n4 - 9);
                n8 = n2 + n6;
            }
            n7 = --n4;
        }
        int n10 = n4 = 0;
        while (n10 < arg2.length) {
            n3 = arg2[n4] & 0xFF;
            if (n3 != 0) {
                int[] nArray;
                arg3 = arg1[n3];
                n = sprawm.cfr_renamed_12177(arg3);
                if (n3 <= 9) {
                    do {
                        sArray[n] = (short)(n4 << 4 | n3);
                    } while ((n += 1 << n3) < 512);
                    nArray = arg1;
                } else {
                    n2 = sArray[n & 0x1FF];
                    int n11 = 1 << (n2 & 0xF);
                    n2 = -(n2 >> 4);
                    do {
                        sArray[n2 | n >> 9] = (short)(n4 << 4 | n3);
                    } while ((n += 1 << n3) < n11);
                    nArray = arg1;
                }
                nArray[n3] = arg3 + (1 << 16 - n3);
            }
            n10 = ++n4;
        }
        return sArray;
    }

    public sproan() throws Exception {
        try {
            int n;
            byte[] byArray = new byte[288];
            int n2 = n = 0;
            while (n2 < 144) {
                byArray[n++] = 8;
                n2 = n;
            }
            int n3 = n;
            while (n3 < 256) {
                byArray[n++] = 9;
                n3 = n;
            }
            int n4 = n;
            while (n4 < 280) {
                byArray[n++] = 7;
                n4 = n;
            }
            int n5 = n;
            while (n5 < 288) {
                byArray[n++] = 8;
                n5 = n;
            }
            cfr_renamed_3 = new sproan(byArray);
            byArray = new byte[32];
            int n6 = n = 0;
            while (n6 < 32) {
                byArray[n++] = 5;
                n6 = n;
            }
            cfr_renamed_2 = new sproan(byArray);
            return;
        }
        catch (Exception exception) {
            throw new Exception(sprzkaa.cfr_renamed_9("L%k/e0z%{3g2@5n&e!f\u0014z%mz(&a8m$(4z%m3('m.m2i4a/f`n!a,m$"), exception);
        }
    }

    private /* synthetic */ void cfr_renamed_12201(byte[] arg0) {
        int[] nArray = new int[cfr_renamed_1 + 1];
        int[] nArray2 = new int[cfr_renamed_1 + 1];
        int n = 0;
        int[] nArray3 = new int[1];
        nArray3[0] = n;
        int[] nArray4 = nArray3;
        sproan sproan2 = this;
        int n2 = sproan2.cfr_renamed_12203(nArray, nArray2, arg0, nArray4);
        n = nArray4[0];
        sproan2.cfr_renamed_4 = sproan2.cfr_renamed_12204(nArray, nArray2, arg0, n2, n);
    }

    public static sproan cfr_renamed_12205() {
        return cfr_renamed_3;
    }
}

