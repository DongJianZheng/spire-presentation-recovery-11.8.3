/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprama;
import com.spire.presentation.packages.sprd;
import com.spire.presentation.packages.sprhpa;
import com.spire.presentation.packages.sprona;
import com.spire.presentation.packages.sprpgaa;
import com.spire.presentation.packages.sprseca;
import com.spire.presentation.packages.sprwna;
import com.spire.presentation.packages.sprzra;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sproqa
implements sprd {
    private int cfr_renamed_1;
    private int[] cfr_renamed_2;
    private static final int cfr_renamed_3 = 11;
    private int[] cfr_renamed_4;

    @Override
    public sprama cfr_renamed_723(sprama arg0) {
        int n;
        int n2;
        int n3;
        int n4;
        int[] nArray = arg0.cfr_renamed_1;
        if (arg0.cfr_renamed_1.length != this.cfr_renamed_1) {
            throw new IllegalArgumentException(sprseca.cfr_renamed_9("8a\u001bv\u0013fV{\u00104\u0015{\u0013r\u0010}\u0015}\u0013z\u0002gVy\u0003g\u00024\u0014qV`\u001eqVg\u0017y\u0013"));
        }
        int[] nArray2 = new int[this.cfr_renamed_1];
        int n5 = n4 = 0;
        while (n5 != this.cfr_renamed_4.length) {
            sproqa sproqa2 = this;
            n3 = sproqa2.cfr_renamed_4[n4];
            n2 = sproqa2.cfr_renamed_1 - 1 - n3;
            int n6 = sproqa2.cfr_renamed_1 - 1;
            while (n6 >= 0) {
                int n7 = n;
                int n8 = nArray2[n7] = nArray2[n7] + nArray[n2];
                if (--n2 < 0) {
                    n2 = this.cfr_renamed_1 - 1;
                }
                n6 = --n;
            }
            n5 = ++n4;
        }
        int n9 = n4 = 0;
        while (n9 != this.cfr_renamed_2.length) {
            sproqa sproqa3 = this;
            n3 = sproqa3.cfr_renamed_2[n4];
            n2 = sproqa3.cfr_renamed_1 - 1 - n3;
            int n10 = sproqa3.cfr_renamed_1 - 1;
            while (n10 >= 0) {
                int n11 = n;
                int n12 = nArray2[n11] = nArray2[n11] - nArray[n2];
                if (--n2 < 0) {
                    n2 = this.cfr_renamed_1 - 1;
                }
                n10 = --n;
            }
            n9 = ++n4;
        }
        return new sprama(nArray2);
    }

    @Override
    public void cfr_renamed_722() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.length) {
            this.cfr_renamed_4[n++] = 0;
            n2 = n;
        }
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_2.length) {
            this.cfr_renamed_2[n++] = 0;
            n3 = n;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public sproqa(int[] nArray) {
        int n;
        this.cfr_renamed_1 = nArray.length;
        sproqa sproqa2 = this;
        sproqa2.cfr_renamed_4 = new int[sproqa2.cfr_renamed_1];
        sproqa2.cfr_renamed_2 = new int[sproqa2.cfr_renamed_1];
        int n2 = 0;
        int n3 = 0;
        int n4 = n = 0;
        while (true) {
            void arg0;
            if (n4 >= this.cfr_renamed_1) {
                sproqa sproqa3 = this;
                sproqa3.cfr_renamed_4 = sprzra.cfr_renamed_541(sproqa3.cfr_renamed_4, n2);
                sproqa3.cfr_renamed_2 = sprzra.cfr_renamed_541(sproqa3.cfr_renamed_2, n3);
                return;
            }
            void var5_5 = arg0[n];
            switch (var5_5) {
                case 1: {
                    this.cfr_renamed_4[n2++] = n;
                    break;
                }
                case -1: {
                    this.cfr_renamed_2[n3++] = n;
                    break;
                }
                case 0: {
                    break;
                }
                default: {
                    throw new IllegalArgumentException(new StringBuilder().insert(0, sprpgaa.cfr_renamed_9("H\tm\u0000f\u0004mEw\u0004m\u0010d_!")).append((int)var5_5).append(sprseca.cfr_renamed_9("Z4\u001ba\u0005`Vv\u00134\u0019z\u00134\u0019rVo[%Z4F8V%\u000b")).toString());
                }
            }
            n4 = ++n;
        }
    }

    @Override
    public int[] cfr_renamed_185() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sproqa(int n, int[] nArray, int[] nArray2) {
        void arg1;
        void arg0;
        sproqa sproqa2 = this;
        this.cfr_renamed_1 = arg0;
        sproqa2.cfr_renamed_4 = arg1;
        sproqa2.cfr_renamed_2 = nArray2;
    }

    @Override
    public sprwna cfr_renamed_725(sprwna arg0) {
        int n;
        int n2;
        int n3;
        int n4;
        BigInteger[] bigIntegerArray = arg0.cfr_renamed_3;
        if (arg0.cfr_renamed_3.length != this.cfr_renamed_1) {
            throw new IllegalArgumentException(sprpgaa.cfr_renamed_9("O\u0010l\u0007d\u0017!\ngEb\nd\u0003g\fb\fd\u000bu\u0016!\bt\u0016uEc\u0000!\u0011i\u0000!\u0016`\bd"));
        }
        BigInteger[] bigIntegerArray2 = new BigInteger[this.cfr_renamed_1];
        int n5 = n4 = 0;
        while (n5 < this.cfr_renamed_1) {
            bigIntegerArray2[n4++] = BigInteger.ZERO;
            n5 = n4;
        }
        int n6 = n4 = 0;
        while (n6 != this.cfr_renamed_4.length) {
            sproqa sproqa2 = this;
            n3 = sproqa2.cfr_renamed_4[n4];
            n2 = sproqa2.cfr_renamed_1 - 1 - n3;
            int n7 = sproqa2.cfr_renamed_1 - 1;
            while (n7 >= 0) {
                BigInteger bigInteger = bigIntegerArray2[n] = bigIntegerArray2[n].add(bigIntegerArray[n2]);
                if (--n2 < 0) {
                    n2 = this.cfr_renamed_1 - 1;
                }
                n7 = --n;
            }
            n6 = ++n4;
        }
        int n8 = n4 = 0;
        while (n8 != this.cfr_renamed_2.length) {
            sproqa sproqa3 = this;
            n3 = sproqa3.cfr_renamed_2[n4];
            n2 = sproqa3.cfr_renamed_1 - 1 - n3;
            int n9 = sproqa3.cfr_renamed_1 - 1;
            while (n9 >= 0) {
                BigInteger bigInteger = bigIntegerArray2[n] = bigIntegerArray2[n].subtract(bigIntegerArray[n2]);
                if (--n2 < 0) {
                    n2 = this.cfr_renamed_1 - 1;
                }
                n9 = --n;
            }
            n8 = ++n4;
        }
        return new sprwna(bigIntegerArray2);
    }

    public byte[] cfr_renamed_726() {
        int n = 2048;
        sproqa sproqa2 = this;
        byte[] byArray = sprona.cfr_renamed_718(sproqa2.cfr_renamed_4, n);
        byte[] byArray2 = sprona.cfr_renamed_718(sproqa2.cfr_renamed_2, n);
        byte[] byArray3 = sprzra.cfr_renamed_523(byArray, byArray.length + byArray2.length);
        System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
        return byArray3;
    }

    @Override
    public int cfr_renamed_84() {
        return this.cfr_renamed_1;
    }

    public int hashCode() {
        int n = 1;
        n = 31 * n + this.cfr_renamed_1;
        n = 31 * n + sprzra.cfr_renamed_552(this.cfr_renamed_2);
        n = 31 * n + sprzra.cfr_renamed_552(this.cfr_renamed_4);
        return n;
    }

    public static sproqa cfr_renamed_727(InputStream arg0, int arg1, int arg2, int arg3) throws IOException {
        int n = 2048;
        int n2 = 32 - Integer.numberOfLeadingZeros(n - 1);
        int n3 = (arg2 * n2 + 7) / 8;
        InputStream inputStream = arg0;
        int[] nArray = sprona.cfr_renamed_719(sprhpa.cfr_renamed_704(inputStream, n3), arg2, n);
        int[] nArray2 = sprona.cfr_renamed_719(sprhpa.cfr_renamed_704(inputStream, (arg3 * n2 + 7) / 8), arg3, n);
        return new sproqa(arg1, nArray, nArray2);
    }

    @Override
    public sprama cfr_renamed_131() {
        int n;
        int n2;
        int[] nArray = new int[this.cfr_renamed_1];
        int n3 = n2 = 0;
        while (n3 != this.cfr_renamed_4.length) {
            n = this.cfr_renamed_4[n2];
            nArray[n] = 1;
            n3 = ++n2;
        }
        int n4 = n2 = 0;
        while (n4 != this.cfr_renamed_2.length) {
            n = this.cfr_renamed_2[n2];
            nArray[n] = -1;
            n4 = ++n2;
        }
        return new sprama(nArray);
    }

    public sproqa(sprama arg0) {
        this(arg0.cfr_renamed_1);
    }

    public static sproqa cfr_renamed_708(int arg0, int arg1, int arg2, SecureRandom arg3) {
        int[] nArray = sprhpa.cfr_renamed_706(arg0, arg1, arg2, arg3);
        return new sproqa(nArray);
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (arg0 == null) {
            return false;
        }
        if (this.getClass() != arg0.getClass()) {
            return false;
        }
        sproqa sproqa2 = (sproqa)arg0;
        if (this.cfr_renamed_1 != sproqa2.cfr_renamed_1) {
            return false;
        }
        if (!sprzra.cfr_renamed_549(this.cfr_renamed_2, sproqa2.cfr_renamed_2)) {
            return false;
        }
        return sprzra.cfr_renamed_549(this.cfr_renamed_4, sproqa2.cfr_renamed_4);
    }

    @Override
    public sprama cfr_renamed_728(sprama arg0, int arg1) {
        sprama sprama2 = this.cfr_renamed_723(arg0);
        sprama2.cfr_renamed_729(arg1);
        return sprama2;
    }

    @Override
    public int[] cfr_renamed_724() {
        return this.cfr_renamed_4;
    }
}

