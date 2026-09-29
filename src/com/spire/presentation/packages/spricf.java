/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcxp;
import com.spire.presentation.packages.sprdtq;
import com.spire.presentation.packages.sprexe;
import com.spire.presentation.packages.sprfhf;
import com.spire.presentation.packages.sprnhf;
import com.spire.presentation.packages.sprydf;
import java.security.SecureRandom;

public class spricf {
    public static final char cfr_renamed_1 = 'I';
    private int cfr_renamed_2;
    private sprnhf cfr_renamed_3;
    private int[] cfr_renamed_4;

    public int hashCode() {
        int n;
        int n2 = this.cfr_renamed_3.hashCode();
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_4.length) {
            n2 = n2 * 31 + this.cfr_renamed_4[n++];
            n3 = n;
        }
        return n2;
    }

    public spricf[] cfr_renamed_5472(spricf arg0) {
        spricf spricf2 = arg0;
        int n = spricf2.cfr_renamed_2 >> 1;
        int[] nArray = spricf.cfr_renamed_841(spricf2.cfr_renamed_4);
        spricf spricf3 = this;
        int[] nArray2 = spricf3.cfr_renamed_848(spricf3.cfr_renamed_4, arg0.cfr_renamed_4);
        int[] nArray3 = new int[1];
        nArray3[0] = 0;
        int[] nArray4 = nArray3;
        int[] nArray5 = new int[1];
        nArray5[0] = 1;
        int[] nArray6 = nArray5;
        int[] nArray7 = nArray2;
        while (spricf.cfr_renamed_834(nArray7) > n) {
            int[][] nArray8 = this.cfr_renamed_843(nArray, nArray2);
            nArray = nArray2;
            nArray2 = nArray8[1];
            spricf spricf4 = this;
            int[] nArray9 = spricf4.cfr_renamed_832(nArray4, spricf4.cfr_renamed_849(nArray8[0], nArray6, arg0.cfr_renamed_4));
            nArray4 = nArray6;
            nArray6 = nArray9;
            nArray7 = nArray2;
        }
        spricf[] spricfArray = new spricf[2];
        spricfArray[0] = new spricf(this.cfr_renamed_3, nArray2);
        spricfArray[1] = new spricf(this.cfr_renamed_3, nArray6);
        return spricfArray;
    }

    /*
     * WARNING - void declaration
     */
    private static /* synthetic */ boolean cfr_renamed_850(int[] nArray, int[] nArray2) {
        int n;
        int n2;
        int[] arg0;
        int n3 = spricf.cfr_renamed_834(arg0);
        if (n3 != (n2 = spricf.cfr_renamed_834(nArray2))) {
            return false;
        }
        int n4 = n = 0;
        while (n4 <= n3) {
            void arg1;
            if (arg0[n] != arg1[n]) {
                return false;
            }
            n4 = ++n;
        }
        return true;
    }

    private /* synthetic */ int[] cfr_renamed_836(int[] arg0, int[] arg1) {
        int[] nArray = arg0;
        int[] nArray2 = arg1;
        if (spricf.cfr_renamed_834(nArray) == -1) {
            return nArray2;
        }
        int[] nArray3 = nArray2;
        while (spricf.cfr_renamed_834(nArray3) != -1) {
            int[] nArray4 = this.cfr_renamed_848(nArray, nArray2);
            nArray = new int[nArray2.length];
            System.arraycopy(nArray2, 0, nArray, 0, nArray.length);
            nArray2 = new int[nArray4.length];
            System.arraycopy(nArray4, 0, nArray2, 0, nArray2.length);
            nArray3 = nArray2;
        }
        spricf spricf2 = this;
        int n = spricf2.cfr_renamed_3.cfr_renamed_817(spricf.cfr_renamed_833(nArray));
        return spricf2.cfr_renamed_840(nArray, n);
    }

    public String toString() {
        int n;
        String string = new StringBuilder().insert(0, sprcxp.cfr_renamed_9("'mhQ~ShPn\\k\u001dhKbO'")).append(this.cfr_renamed_3.toString()).append(sprdtq.cfr_renamed_9("\u000bo;")).toString();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.length) {
            spricf spricf2 = this;
            StringBuilder stringBuilder = new StringBuilder().insert(0, string).append(spricf2.cfr_renamed_3.cfr_renamed_867(spricf2.cfr_renamed_4[n])).append(sprcxp.cfr_renamed_9("dY")).append(n);
            string = stringBuilder.append("+").toString();
            n2 = ++n;
        }
        string = new StringBuilder().insert(0, string).append(sprdtq.cfr_renamed_9("\n")).toString();
        return string;
    }

    private /* synthetic */ boolean cfr_renamed_852(int[] arg0) {
        int n;
        if (arg0[0] == 0) {
            return false;
        }
        int n2 = spricf.cfr_renamed_834(arg0) >> 1;
        int[] nArray = new int[2];
        nArray[0] = 0;
        nArray[1] = 1;
        int[] nArray2 = nArray;
        int[] nArray3 = new int[2];
        nArray3[0] = 0;
        nArray3[1] = 1;
        int[] nArray4 = nArray3;
        int n3 = this.cfr_renamed_3.cfr_renamed_813();
        int n4 = n = 0;
        while (n4 < n2) {
            int n5 = n3 - 1;
            while (n5 >= 0) {
                int n6;
                nArray2 = this.cfr_renamed_849(nArray2, nArray2, arg0);
                n5 = --n6;
            }
            nArray2 = spricf.cfr_renamed_841(nArray2);
            spricf spricf2 = this;
            int[] nArray5 = spricf2.cfr_renamed_836(spricf2.cfr_renamed_832(nArray2, nArray4), arg0);
            if (spricf.cfr_renamed_834(nArray5) != 0) {
                return false;
            }
            n4 = ++n;
        }
        return true;
    }

    private /* synthetic */ int[] cfr_renamed_849(int[] arg0, int[] arg1, int[] arg2) {
        spricf spricf2 = this;
        return spricf2.cfr_renamed_848(spricf2.cfr_renamed_855(arg0, arg1), arg2);
    }

    public spricf cfr_renamed_831(int arg0) {
        int[] nArray = new int[arg0 + 1];
        spricf spricf2 = this;
        nArray[arg0] = 1;
        int[] nArray2 = spricf2.cfr_renamed_832(spricf2.cfr_renamed_4, nArray);
        return new spricf(this.cfr_renamed_3, nArray2);
    }

    private static /* synthetic */ int cfr_renamed_834(int[] arg0) {
        int n;
        int n2 = n = arg0.length - 1;
        while (n2 >= 0 && arg0[n] == 0) {
            n2 = --n;
        }
        return n;
    }

    private static /* synthetic */ int cfr_renamed_833(int[] arg0) {
        int n = spricf.cfr_renamed_834(arg0);
        if (n == -1) {
            return 0;
        }
        return arg0[n];
    }

    private static /* synthetic */ int[] cfr_renamed_841(int[] arg0) {
        int n = spricf.cfr_renamed_834(arg0);
        if (n == -1) {
            return new int[1];
        }
        if (arg0.length == n + 1) {
            return sprydf.cfr_renamed_535(arg0);
        }
        int[] nArray = new int[n + 1];
        System.arraycopy(arg0, 0, nArray, 0, n + 1);
        return nArray;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int[][] cfr_renamed_843(int[] nArray, int[] nArray2) {
        void arg0;
        void arg1;
        int n = spricf.cfr_renamed_834((int[])arg1);
        int n2 = spricf.cfr_renamed_834(nArray) + 1;
        if (n == -1) {
            throw new ArithmeticException(sprcxp.cfr_renamed_9("CTqTtThS'_~\u001d}XuR)"));
        }
        int[][] nArrayArray = new int[2][];
        nArrayArray[0] = new int[1];
        nArrayArray[1] = new int[n2];
        int n3 = spricf.cfr_renamed_833((int[])arg1);
        n3 = this.cfr_renamed_3.cfr_renamed_817(n3);
        nArrayArray[0][0] = 0;
        System.arraycopy(arg0, 0, nArrayArray[1], 0, nArrayArray[1].length);
        int n4 = n;
        while (n4 <= spricf.cfr_renamed_834(nArrayArray[1])) {
            int[] nArray3 = new int[]{this.cfr_renamed_3.cfr_renamed_838(spricf.cfr_renamed_833(nArrayArray[1]), n3)};
            int[] nArray4 = this.cfr_renamed_840((int[])arg1, nArray3[0]);
            int n5 = spricf.cfr_renamed_834(nArrayArray[1]) - n;
            nArray4 = spricf.cfr_renamed_844(nArray4, n5);
            nArray3 = spricf.cfr_renamed_844(nArray3, n5);
            n4 = n;
            nArrayArray[0] = this.cfr_renamed_832(nArray3, nArrayArray[0]);
            nArrayArray[1] = this.cfr_renamed_832(nArray4, nArrayArray[1]);
        }
        return nArrayArray;
    }

    /*
     * WARNING - void declaration
     */
    public spricf(sprnhf sprnhf2, int n) {
        void arg1;
        void arg0;
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_2 = arg1;
        this.cfr_renamed_4 = new int[n + 1];
        this.cfr_renamed_4[arg1] = 1;
    }

    public spricf(sprexe arg0) {
        this(arg0.cfr_renamed_845(), arg0.cfr_renamed_846());
    }

    private /* synthetic */ int[] cfr_renamed_832(int[] arg0, int[] arg1) {
        int n;
        int[] nArray;
        int[] nArray2;
        int[] nArray3;
        if (arg0.length < arg1.length) {
            nArray3 = new int[arg1.length];
            System.arraycopy(arg1, 0, nArray3, 0, arg1.length);
            nArray = nArray2 = arg0;
        } else {
            nArray3 = new int[arg0.length];
            System.arraycopy(arg0, 0, nArray3, 0, arg0.length);
            nArray = nArray2 = arg1;
        }
        int n2 = n = nArray.length - 1;
        while (n2 >= 0) {
            nArray3[--n] = this.cfr_renamed_3.cfr_renamed_825(nArray3[n], nArray2[n]);
            n2 = n;
        }
        return nArray3;
    }

    private /* synthetic */ int[] cfr_renamed_848(int[] arg0, int[] arg1) {
        int n = spricf.cfr_renamed_834(arg1);
        if (n == -1) {
            throw new ArithmeticException(sprdtq.cfr_renamed_9("\u000bX9X<X _oS6\u00115T=^"));
        }
        int[] nArray = new int[arg0.length];
        int n2 = spricf.cfr_renamed_833(arg1);
        n2 = this.cfr_renamed_3.cfr_renamed_817(n2);
        System.arraycopy(arg0, 0, nArray, 0, nArray.length);
        int n3 = n;
        while (n3 <= spricf.cfr_renamed_834(nArray)) {
            spricf spricf2 = this;
            int n4 = spricf2.cfr_renamed_3.cfr_renamed_838(spricf.cfr_renamed_833(nArray), n2);
            int[] nArray2 = spricf.cfr_renamed_844(arg1, spricf.cfr_renamed_834(nArray) - n);
            nArray2 = spricf2.cfr_renamed_840(nArray2, n4);
            nArray = spricf2.cfr_renamed_832(nArray2, nArray);
            n3 = n;
        }
        return nArray;
    }

    public spricf cfr_renamed_5473(spricf arg0) {
        spricf spricf2 = this;
        int[] nArray = spricf2.cfr_renamed_855(spricf2.cfr_renamed_4, arg0.cfr_renamed_4);
        return new spricf(this.cfr_renamed_3, nArray);
    }

    public spricf cfr_renamed_819(int arg0) {
        if (!this.cfr_renamed_3.cfr_renamed_839(arg0)) {
            throw new ArithmeticException(sprcxp.cfr_renamed_9("IRs\u001dfS'XkXjXiI'Ra\u001dsUb\u001daTiTsX'[nXkY'IoTt\u001dwRkDiRjTfQ'Tt\u001dcXaTiXc\u001dhKbO)"));
        }
        spricf spricf2 = this;
        int[] nArray = spricf2.cfr_renamed_840(spricf2.cfr_renamed_4, arg0);
        return new spricf(this.cfr_renamed_3, nArray);
    }

    public spricf[] cfr_renamed_5474(spricf arg0) {
        spricf spricf2 = this;
        int[][] nArray = spricf2.cfr_renamed_843(spricf2.cfr_renamed_4, arg0.cfr_renamed_4);
        spricf[] spricfArray = new spricf[2];
        spricfArray[0] = new spricf(this.cfr_renamed_3, nArray[0]);
        spricfArray[1] = new spricf(this.cfr_renamed_3, nArray[1]);
        return spricfArray;
    }

    public byte[] cfr_renamed_91() {
        int n;
        int n2 = 8;
        int n3 = 1;
        spricf spricf2 = this;
        while (spricf2.cfr_renamed_3.cfr_renamed_813() > n2) {
            n2 += 8;
            spricf2 = this;
            ++n3;
        }
        byte[] byArray = new byte[this.cfr_renamed_4.length * n3];
        n3 = 0;
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_4.length) {
            int n5;
            int n6 = n5 = 0;
            while (n6 < n2) {
                int n7 = n3++;
                byte by = (byte)(this.cfr_renamed_4[n] >>> n5);
                byArray[n7] = by;
                n6 = n5 += 8;
            }
            n4 = ++n;
        }
        return byArray;
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !(arg0 instanceof spricf)) {
            return false;
        }
        spricf spricf2 = (spricf)arg0;
        return this.cfr_renamed_3.equals(spricf2.cfr_renamed_3) && this.cfr_renamed_2 == spricf2.cfr_renamed_2 && spricf.cfr_renamed_850(this.cfr_renamed_4, spricf2.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public spricf(sprnhf sprnhf2, byte[] byArray) {
        int n;
        void arg1;
        void arg0;
        void v0 = arg0;
        void v1 = v0;
        this.cfr_renamed_3 = v0;
        int n2 = 8;
        int n3 = 1;
        while (v1.cfr_renamed_813() > n2) {
            n2 += 8;
            v1 = arg0;
            ++n3;
        }
        if (((void)arg1).length % n3 != 0) {
            throw new IllegalArgumentException(sprdtq.cfr_renamed_9("\u0011\nC=^=\u000boS6E*\u0011.C=P6\u0011&Bo_ EoT!R U*UoA ]6_ \\&P#\u0011 G*CoV&G*_oW&_&E*\u0011)X*]+\u0011\bw}\\"));
        }
        this.cfr_renamed_4 = new int[((void)arg1).length / n3];
        n3 = 0;
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_4.length) {
            int n5;
            int n6 = n5 = 0;
            while (n6 < n2) {
                int n7 = n;
                int n8 = arg1[n3] & 0xFF;
                ++n3;
                int n9 = this.cfr_renamed_4[n7] ^ n8 << n5;
                this.cfr_renamed_4[n7] = n9;
                n6 = n5 += 8;
            }
            spricf spricf2 = this;
            if (!spricf2.cfr_renamed_3.cfr_renamed_839(spricf2.cfr_renamed_4[n])) {
                throw new IllegalArgumentException(sprcxp.cfr_renamed_9("'xuOhO=\u001deDsX'\\uOfD'Tt\u001diRs\u001dbSdRcXc\u001dwRkDiRjTfQ'RqXu\u001d`TqXi\u001daTiTsX'[nXkY'zA\u000fj"));
            }
            n4 = ++n;
        }
        if (this.cfr_renamed_4.length != 1) {
            spricf spricf3 = this;
            if (spricf3.cfr_renamed_4[spricf3.cfr_renamed_4.length - 1] == 0) {
                throw new IllegalArgumentException(sprdtq.cfr_renamed_9("\u0011\nC=^=\u000boS6E*\u0011.C=P6\u0011&Bo_ EoT!R U*UoA ]6_ \\&P#\u0011 G*CoV&G*_oW&_&E*\u0011)X*]+\u0011\bw}\\"));
            }
        }
        this.cfr_renamed_842();
    }

    public spricf cfr_renamed_5475(spricf arg0) {
        spricf spricf2 = this;
        int[] nArray = spricf2.cfr_renamed_832(spricf2.cfr_renamed_4, arg0.cfr_renamed_4);
        return new spricf(this.cfr_renamed_3, nArray);
    }

    /*
     * WARNING - void declaration
     */
    public spricf(sprnhf sprnhf2, int[] nArray) {
        void arg0;
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = spricf.cfr_renamed_841(nArray);
        this.cfr_renamed_842();
    }

    private /* synthetic */ int[] cfr_renamed_847(int[] arg0, int[] arg1, int[] arg2) {
        int[] nArray = spricf.cfr_renamed_841(arg2);
        spricf spricf2 = this;
        int[] nArray2 = spricf2.cfr_renamed_848(arg1, arg2);
        int[] nArray3 = new int[1];
        nArray3[0] = 0;
        int[] nArray4 = nArray3;
        int[] nArray5 = spricf2.cfr_renamed_848(arg0, arg2);
        int[] nArray6 = nArray2;
        while (spricf.cfr_renamed_834(nArray6) != -1) {
            int[][] nArray7 = this.cfr_renamed_843(nArray, nArray2);
            nArray = spricf.cfr_renamed_841(nArray2);
            nArray2 = spricf.cfr_renamed_841(nArray7[1]);
            spricf spricf3 = this;
            int[] nArray8 = spricf3.cfr_renamed_832(nArray4, spricf3.cfr_renamed_849(nArray7[0], nArray5, arg2));
            nArray4 = spricf.cfr_renamed_841(nArray5);
            nArray5 = spricf.cfr_renamed_841(nArray8);
            nArray6 = nArray2;
        }
        int n = spricf.cfr_renamed_833(nArray);
        spricf spricf4 = this;
        nArray4 = spricf4.cfr_renamed_840(nArray4, spricf4.cfr_renamed_3.cfr_renamed_817(n));
        return nArray4;
    }

    public spricf cfr_renamed_860(int arg0) {
        int[] nArray = spricf.cfr_renamed_844(this.cfr_renamed_4, arg0);
        return new spricf(this.cfr_renamed_3, nArray);
    }

    public int cfr_renamed_813() {
        int n = this.cfr_renamed_4.length - 1;
        if (this.cfr_renamed_4[n] == 0) {
            return -1;
        }
        return n;
    }

    public void cfr_renamed_5470(spricf arg0) {
        spricf spricf2 = this;
        spricf2.cfr_renamed_4 = spricf2.cfr_renamed_832(spricf2.cfr_renamed_4, arg0.cfr_renamed_4);
        spricf2.cfr_renamed_842();
    }

    private /* synthetic */ int[] cfr_renamed_858(int arg0, SecureRandom arg1) {
        int n;
        int[] nArray = new int[arg0 + 1];
        nArray[arg0] = 1;
        nArray[0] = this.cfr_renamed_3.cfr_renamed_862(arg1);
        int n2 = n = 1;
        while (n2 < arg0) {
            nArray[n++] = this.cfr_renamed_3.cfr_renamed_863(arg1);
            n2 = n;
        }
        while (!this.cfr_renamed_852(nArray)) {
            n = sprfhf.cfr_renamed_808(arg1, arg0);
            if (n == 0) {
                nArray[0] = this.cfr_renamed_3.cfr_renamed_862(arg1);
                continue;
            }
            nArray[n] = this.cfr_renamed_3.cfr_renamed_863(arg1);
        }
        return nArray;
    }

    private static /* synthetic */ int[] cfr_renamed_844(int[] arg0, int arg1) {
        int n = spricf.cfr_renamed_834(arg0);
        if (n == -1) {
            return new int[1];
        }
        int[] nArray = new int[n + arg1 + 1];
        System.arraycopy(arg0, 0, nArray, arg1, n + 1);
        return nArray;
    }

    public int cfr_renamed_816(int arg0) {
        if (arg0 < 0 || arg0 > this.cfr_renamed_2) {
            return 0;
        }
        return this.cfr_renamed_4[arg0];
    }

    private /* synthetic */ int[] cfr_renamed_855(int[] arg0, int[] arg1) {
        int[] nArray;
        int[] nArray2;
        int[] nArray3;
        if (spricf.cfr_renamed_834(arg0) < spricf.cfr_renamed_834(arg1)) {
            nArray3 = arg1;
            nArray2 = arg0;
            nArray = nArray3;
        } else {
            nArray3 = arg0;
            nArray2 = arg1;
            nArray = nArray3;
        }
        nArray3 = spricf.cfr_renamed_841(nArray);
        nArray2 = spricf.cfr_renamed_841(nArray2);
        if (nArray2.length == 1) {
            return this.cfr_renamed_840(nArray3, nArray2[0]);
        }
        int n = nArray3.length;
        int n2 = nArray2.length;
        int[] nArray4 = new int[n + n2 - 1];
        if (n2 != n) {
            int[] nArray5 = new int[n2];
            int[] nArray6 = new int[n - n2];
            System.arraycopy(nArray3, 0, nArray5, 0, nArray5.length);
            System.arraycopy(nArray3, n2, nArray6, 0, nArray6.length);
            spricf spricf2 = this;
            nArray5 = spricf2.cfr_renamed_855(nArray5, nArray2);
            nArray6 = spricf2.cfr_renamed_855(nArray6, nArray2);
            nArray6 = spricf.cfr_renamed_844(nArray6, n2);
            nArray4 = spricf2.cfr_renamed_832(nArray5, nArray6);
            return nArray4;
        }
        n2 = n + 1 >>> 1;
        int n3 = n - n2;
        int[] nArray7 = new int[n2];
        int[] nArray8 = new int[n2];
        int[] nArray9 = new int[n3];
        int[] nArray10 = new int[n3];
        System.arraycopy(nArray3, 0, nArray7, 0, nArray7.length);
        System.arraycopy(nArray3, n2, nArray9, 0, nArray9.length);
        System.arraycopy(nArray2, 0, nArray8, 0, nArray8.length);
        System.arraycopy(nArray2, n2, nArray10, 0, nArray10.length);
        spricf spricf3 = this;
        int[] nArray11 = spricf3.cfr_renamed_832(nArray7, nArray9);
        int[] nArray12 = spricf3.cfr_renamed_832(nArray8, nArray10);
        int[] nArray13 = spricf3.cfr_renamed_855(nArray7, nArray8);
        int[] nArray14 = spricf3.cfr_renamed_855(nArray11, nArray12);
        int[] nArray15 = spricf3.cfr_renamed_855(nArray9, nArray10);
        nArray14 = spricf3.cfr_renamed_832(nArray14, nArray13);
        nArray14 = spricf3.cfr_renamed_832(nArray14, nArray15);
        nArray15 = spricf.cfr_renamed_844(nArray15, n2);
        nArray4 = spricf3.cfr_renamed_832(nArray14, nArray15);
        nArray4 = spricf.cfr_renamed_844(nArray4, n2);
        nArray4 = spricf3.cfr_renamed_832(nArray4, nArray13);
        return nArray4;
    }

    /*
     * WARNING - void declaration
     */
    public spricf(sprnhf sprnhf2, int n, char c, SecureRandom secureRandom) {
        spricf spricf2;
        void arg0;
        this.cfr_renamed_3 = arg0;
        switch (c) {
            case 'I': {
                void arg3;
                void arg1;
                spricf2 = this;
                while (false) {
                }
                spricf2.cfr_renamed_4 = spricf2.cfr_renamed_858((int)arg1, (SecureRandom)arg3);
                break;
            }
            default: {
                void arg2;
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprcxp.cfr_renamed_9("'xuOhO=\u001dsDwX'")).append((char)arg2).append(sprdtq.cfr_renamed_9("\u0011&Bo_ EoU*W&_*UoW Cov\t\u0003<\\.]#\\\u001f^#H!^\"X.]")).toString());
            }
        }
        spricf2.cfr_renamed_842();
    }

    /*
     * WARNING - void declaration
     */
    public spricf(sprnhf sprnhf2) {
        void arg0;
        spricf spricf2 = this;
        this.cfr_renamed_3 = arg0;
        spricf2.cfr_renamed_2 = -1;
        spricf2.cfr_renamed_4 = new int[1];
    }

    public spricf cfr_renamed_5471(spricf arg0) {
        spricf spricf2 = this;
        int[] nArray = spricf2.cfr_renamed_848(spricf2.cfr_renamed_4, arg0.cfr_renamed_4);
        return new spricf(this.cfr_renamed_3, nArray);
    }

    private /* synthetic */ void cfr_renamed_842() {
        this.cfr_renamed_2 = this.cfr_renamed_4.length - 1;
        spricf spricf2 = this;
        while (spricf2.cfr_renamed_2 >= 0) {
            spricf spricf3 = this;
            if (spricf3.cfr_renamed_4[spricf3.cfr_renamed_2] != 0) break;
            spricf spricf4 = this;
            spricf2 = spricf4;
            --spricf4.cfr_renamed_2;
        }
    }

    public spricf cfr_renamed_5476(spricf arg0) {
        int[] nArray = new int[1];
        nArray[0] = 1;
        spricf spricf2 = this;
        int[] nArray2 = spricf2.cfr_renamed_847(nArray, spricf2.cfr_renamed_4, arg0.cfr_renamed_4);
        return new spricf(this.cfr_renamed_3, nArray2);
    }

    public spricf cfr_renamed_5477(spricf arg0) {
        int[] nArray;
        spricf spricf2 = this;
        int[] nArray2 = sprydf.cfr_renamed_535(spricf2.cfr_renamed_4);
        int[] nArray3 = nArray = spricf2.cfr_renamed_849(nArray2, nArray2, arg0.cfr_renamed_4);
        while (!spricf.cfr_renamed_850(nArray3, this.cfr_renamed_4)) {
            nArray2 = spricf.cfr_renamed_841(nArray);
            nArray3 = this.cfr_renamed_849(nArray2, nArray2, arg0.cfr_renamed_4);
        }
        return new spricf(this.cfr_renamed_3, nArray2);
    }

    public int cfr_renamed_853() {
        if (this.cfr_renamed_2 == -1) {
            return 0;
        }
        spricf spricf2 = this;
        return spricf2.cfr_renamed_4[spricf2.cfr_renamed_2];
    }

    public spricf cfr_renamed_5478(spricf arg0, spricf arg1) {
        spricf spricf2 = this;
        int[] nArray = spricf2.cfr_renamed_847(spricf2.cfr_renamed_4, arg0.cfr_renamed_4, arg1.cfr_renamed_4);
        return new spricf(this.cfr_renamed_3, nArray);
    }

    public void cfr_renamed_818(int arg0) {
        if (!this.cfr_renamed_3.cfr_renamed_839(arg0)) {
            throw new ArithmeticException(sprcxp.cfr_renamed_9("IRs\u001dfS'XkXjXiI'Ra\u001dsUb\u001daTiTsX'[nXkY'IoTt\u001dwRkDiRjTfQ'Tt\u001dcXaTiXc\u001dhKbO)"));
        }
        spricf spricf2 = this;
        spricf2.cfr_renamed_4 = spricf2.cfr_renamed_840(spricf2.cfr_renamed_4, arg0);
        spricf2.cfr_renamed_842();
    }

    public spricf cfr_renamed_5479(spricf[] arg0) {
        int n;
        int n2 = arg0.length;
        int[] nArray = new int[n2];
        int[] nArray2 = new int[n2];
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_4.length) {
            spricf spricf2 = this;
            int n4 = n;
            int n5 = spricf2.cfr_renamed_3.cfr_renamed_838(spricf2.cfr_renamed_4[n4], this.cfr_renamed_4[n]);
            nArray2[n4] = n5;
            n3 = ++n;
        }
        int n6 = n = 0;
        while (n6 < n2) {
            int n7;
            int n8 = n7 = 0;
            while (n8 < n2) {
                if (n < arg0[n7].cfr_renamed_4.length) {
                    int n9 = this.cfr_renamed_3.cfr_renamed_838(arg0[n7].cfr_renamed_4[n], nArray2[n7]);
                    nArray[n] = this.cfr_renamed_3.cfr_renamed_825(nArray[n], n9);
                }
                n8 = ++n7;
            }
            n6 = ++n;
        }
        return new spricf(this.cfr_renamed_3, nArray);
    }

    private /* synthetic */ int[] cfr_renamed_840(int[] arg0, int arg1) {
        int n;
        int n2 = spricf.cfr_renamed_834(arg0);
        if (n2 == -1 || arg1 == 0) {
            return new int[1];
        }
        if (arg1 == 1) {
            return sprydf.cfr_renamed_535(arg0);
        }
        int[] nArray = new int[n2 + 1];
        int n3 = n = n2;
        while (n3 >= 0) {
            int n4 = n--;
            nArray[n4] = this.cfr_renamed_3.cfr_renamed_838(arg0[n4], arg1);
            n3 = n;
        }
        return nArray;
    }

    public spricf cfr_renamed_5480(spricf arg0) {
        spricf spricf2 = this;
        int[] nArray = spricf2.cfr_renamed_836(spricf2.cfr_renamed_4, arg0.cfr_renamed_4);
        return new spricf(this.cfr_renamed_3, nArray);
    }

    public spricf cfr_renamed_5481(spricf arg0, spricf arg1) {
        spricf spricf2 = this;
        int[] nArray = spricf2.cfr_renamed_849(spricf2.cfr_renamed_4, arg0.cfr_renamed_4, arg1.cfr_renamed_4);
        return new spricf(this.cfr_renamed_3, nArray);
    }

    /*
     * WARNING - void declaration
     */
    public spricf(spricf spricf2) {
        void arg0;
        spricf spricf3 = this;
        void v1 = arg0;
        this.cfr_renamed_3 = v1.cfr_renamed_3;
        spricf3.cfr_renamed_2 = v1.cfr_renamed_2;
        spricf3.cfr_renamed_4 = sprydf.cfr_renamed_535(spricf2.cfr_renamed_4);
    }

    public spricf cfr_renamed_5482(spricf[] arg0) {
        int n;
        int n2 = arg0.length;
        int[] nArray = new int[n2];
        int n3 = n = 0;
        while (n3 < n2) {
            int n4;
            int n5 = n4 = 0;
            while (n5 < n2) {
                if (n < arg0[n4].cfr_renamed_4.length && n4 < this.cfr_renamed_4.length) {
                    int n6 = this.cfr_renamed_3.cfr_renamed_838(arg0[n4].cfr_renamed_4[n], this.cfr_renamed_4[n4]);
                    nArray[n] = this.cfr_renamed_3.cfr_renamed_825(nArray[n], n6);
                }
                n5 = ++n4;
            }
            n3 = ++n;
        }
        int n7 = n = 0;
        while (n7 < n2) {
            nArray[++n] = this.cfr_renamed_3.cfr_renamed_865(nArray[n]);
            n7 = n;
        }
        return new spricf(this.cfr_renamed_3, nArray);
    }

    /*
     * WARNING - void declaration
     */
    public int cfr_renamed_837(int n) {
        int n2;
        spricf spricf2 = this;
        int n3 = this.cfr_renamed_4[spricf2.cfr_renamed_2];
        int n4 = n2 = spricf2.cfr_renamed_2 - 1;
        while (n4 >= 0) {
            void arg0;
            n3 = this.cfr_renamed_3.cfr_renamed_838(n3, (int)arg0) ^ this.cfr_renamed_4[n2--];
            n4 = n2;
        }
        return n3;
    }
}

