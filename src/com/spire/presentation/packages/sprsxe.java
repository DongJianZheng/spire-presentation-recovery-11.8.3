/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spral;
import com.spire.presentation.packages.sprhgf;
import com.spire.presentation.packages.sprmdf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprsgf;
import com.spire.presentation.packages.spruuc;
import com.spire.presentation.packages.sprzbf;
import com.spire.presentation.packages.sprzofa;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprsxe
implements spral {
    private int[] cfr_renamed_1;
    private static final int cfr_renamed_2 = 11;
    private int cfr_renamed_3;
    private int[] cfr_renamed_4;

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
        sprsxe sprsxe2 = (sprsxe)arg0;
        if (this.cfr_renamed_3 != sprsxe2.cfr_renamed_3) {
            return false;
        }
        if (!sproze.cfr_renamed_549(this.cfr_renamed_1, sprsxe2.cfr_renamed_1)) {
            return false;
        }
        return sproze.cfr_renamed_549(this.cfr_renamed_4, sprsxe2.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprsxe(int n, int[] nArray, int[] nArray2) {
        void arg1;
        void arg0;
        sprsxe sprsxe2 = this;
        this.cfr_renamed_3 = arg0;
        sprsxe2.cfr_renamed_4 = arg1;
        sprsxe2.cfr_renamed_1 = nArray2;
    }

    public static sprsxe cfr_renamed_727(InputStream arg0, int arg1, int arg2, int arg3) throws IOException {
        int n = 2048;
        int n2 = 32 - Integer.numberOfLeadingZeros(n - 1);
        int n3 = (arg2 * n2 + 7) / 8;
        InputStream inputStream = arg0;
        int[] nArray = sprzbf.cfr_renamed_719(sprmdf.cfr_renamed_704(inputStream, n3), arg2, n);
        int[] nArray2 = sprzbf.cfr_renamed_719(sprmdf.cfr_renamed_704(inputStream, (arg3 * n2 + 7) / 8), arg3, n);
        return new sprsxe(arg1, nArray, nArray2);
    }

    public byte[] cfr_renamed_726() {
        int n = 2048;
        sprsxe sprsxe2 = this;
        byte[] byArray = sprzbf.cfr_renamed_718(sprsxe2.cfr_renamed_4, n);
        byte[] byArray2 = sprzbf.cfr_renamed_718(sprsxe2.cfr_renamed_1, n);
        byte[] byArray3 = sproze.cfr_renamed_523(byArray, byArray.length + byArray2.length);
        System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
        return byArray3;
    }

    @Override
    public sprsgf cfr_renamed_5443(sprsgf arg0) {
        int n;
        int n2;
        int n3;
        int n4;
        BigInteger[] bigIntegerArray = arg0.cfr_renamed_3;
        if (arg0.cfr_renamed_3.length != this.cfr_renamed_3) {
            throw new IllegalArgumentException(spruuc.cfr_renamed_9("'\u0004\u0004\u0013\f\u0003I\u001e\u000fQ\n\u001e\f\u0017\u000f\u0018\n\u0018\f\u001f\u001d\u0002I\u001c\u001c\u0002\u001dQ\u000b\u0014I\u0005\u0001\u0014I\u0002\b\u001c\f"));
        }
        BigInteger[] bigIntegerArray2 = new BigInteger[this.cfr_renamed_3];
        int n5 = n4 = 0;
        while (n5 < this.cfr_renamed_3) {
            bigIntegerArray2[n4++] = BigInteger.ZERO;
            n5 = n4;
        }
        int n6 = n4 = 0;
        while (n6 != this.cfr_renamed_4.length) {
            sprsxe sprsxe2 = this;
            n3 = sprsxe2.cfr_renamed_4[n4];
            n2 = sprsxe2.cfr_renamed_3 - 1 - n3;
            int n7 = sprsxe2.cfr_renamed_3 - 1;
            while (n7 >= 0) {
                BigInteger bigInteger = bigIntegerArray2[n] = bigIntegerArray2[n].add(bigIntegerArray[n2]);
                if (--n2 < 0) {
                    n2 = this.cfr_renamed_3 - 1;
                }
                n7 = --n;
            }
            n6 = ++n4;
        }
        int n8 = n4 = 0;
        while (n8 != this.cfr_renamed_1.length) {
            sprsxe sprsxe3 = this;
            n3 = sprsxe3.cfr_renamed_1[n4];
            n2 = sprsxe3.cfr_renamed_3 - 1 - n3;
            int n9 = sprsxe3.cfr_renamed_3 - 1;
            while (n9 >= 0) {
                BigInteger bigInteger = bigIntegerArray2[n] = bigIntegerArray2[n].subtract(bigIntegerArray[n2]);
                if (--n2 < 0) {
                    n2 = this.cfr_renamed_3 - 1;
                }
                n9 = --n;
            }
            n8 = ++n4;
        }
        return new sprsgf(bigIntegerArray2);
    }

    @Override
    public int cfr_renamed_84() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprhgf cfr_renamed_5442(sprhgf arg0) {
        int n;
        int n2;
        int n3;
        int n4;
        int[] nArray = arg0.cfr_renamed_3;
        if (arg0.cfr_renamed_3.length != this.cfr_renamed_3) {
            throw new IllegalArgumentException(sprzofa.cfr_renamed_9("_\u0007|\u0010t\u00001\u001dwRr\u001dt\u0014w\u001br\u001bt\u001ce\u00011\u001fd\u0001eRs\u00171\u0006y\u00171\u0001p\u001ft"));
        }
        int[] nArray2 = new int[this.cfr_renamed_3];
        int n5 = n4 = 0;
        while (n5 != this.cfr_renamed_4.length) {
            sprsxe sprsxe2 = this;
            n3 = sprsxe2.cfr_renamed_4[n4];
            n2 = sprsxe2.cfr_renamed_3 - 1 - n3;
            int n6 = sprsxe2.cfr_renamed_3 - 1;
            while (n6 >= 0) {
                int n7 = n;
                int n8 = nArray2[n7] = nArray2[n7] + nArray[n2];
                if (--n2 < 0) {
                    n2 = this.cfr_renamed_3 - 1;
                }
                n6 = --n;
            }
            n5 = ++n4;
        }
        int n9 = n4 = 0;
        while (n9 != this.cfr_renamed_1.length) {
            sprsxe sprsxe3 = this;
            n3 = sprsxe3.cfr_renamed_1[n4];
            n2 = sprsxe3.cfr_renamed_3 - 1 - n3;
            int n10 = sprsxe3.cfr_renamed_3 - 1;
            while (n10 >= 0) {
                int n11 = n;
                int n12 = nArray2[n11] = nArray2[n11] - nArray[n2];
                if (--n2 < 0) {
                    n2 = this.cfr_renamed_3 - 1;
                }
                n10 = --n;
            }
            n9 = ++n4;
        }
        return new sprhgf(nArray2);
    }

    public sprsxe(sprhgf arg0) {
        this(arg0.cfr_renamed_3);
    }

    @Override
    public sprhgf cfr_renamed_3238(sprhgf arg0, int arg1) {
        sprhgf sprhgf2 = this.cfr_renamed_5442(arg0);
        sprhgf2.cfr_renamed_729(arg1);
        return sprhgf2;
    }

    public int hashCode() {
        int n = 1;
        n = 31 * n + this.cfr_renamed_3;
        n = 31 * n + sproze.cfr_renamed_552(this.cfr_renamed_1);
        n = 31 * n + sproze.cfr_renamed_552(this.cfr_renamed_4);
        return n;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public sprsxe(int[] nArray) {
        int n;
        this.cfr_renamed_3 = nArray.length;
        sprsxe sprsxe2 = this;
        sprsxe2.cfr_renamed_4 = new int[sprsxe2.cfr_renamed_3];
        sprsxe2.cfr_renamed_1 = new int[sprsxe2.cfr_renamed_3];
        int n2 = 0;
        int n3 = 0;
        int n4 = n = 0;
        while (true) {
            void arg0;
            if (n4 >= this.cfr_renamed_3) {
                sprsxe sprsxe3 = this;
                sprsxe3.cfr_renamed_4 = sproze.cfr_renamed_541(sprsxe3.cfr_renamed_4, n2);
                sprsxe3.cfr_renamed_1 = sproze.cfr_renamed_541(sprsxe3.cfr_renamed_1, n3);
                return;
            }
            void var5_5 = arg0[n];
            switch (var5_5) {
                case 1: {
                    this.cfr_renamed_4[n2++] = n;
                    break;
                }
                case -1: {
                    this.cfr_renamed_1[n3++] = n;
                    break;
                }
                case 0: {
                    break;
                }
                default: {
                    throw new IllegalArgumentException(new StringBuilder().insert(0, spruuc.cfr_renamed_9(" \u001d\u0005\u0014\u000e\u0010\u0005Q\u001f\u0010\u0005\u0004\fKI")).append((int)var5_5).append(sprzofa.cfr_renamed_9("=R|\u0007b\u00061\u0010tR~\u001ctR~\u00141\t<C=R!^1Cl")).toString());
                }
            }
            n4 = ++n;
        }
    }

    public static sprsxe cfr_renamed_708(int arg0, int arg1, int arg2, SecureRandom arg3) {
        int[] nArray = sprmdf.cfr_renamed_706(arg0, arg1, arg2, arg3);
        return new sprsxe(nArray);
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
        while (n3 < this.cfr_renamed_1.length) {
            this.cfr_renamed_1[n++] = 0;
            n3 = n;
        }
    }

    @Override
    public int[] cfr_renamed_185() {
        return this.cfr_renamed_1;
    }

    @Override
    public int[] cfr_renamed_724() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprhgf cfr_renamed_131() {
        int n;
        int n2;
        int[] nArray = new int[this.cfr_renamed_3];
        int n3 = n2 = 0;
        while (n3 != this.cfr_renamed_4.length) {
            n = this.cfr_renamed_4[n2];
            nArray[n] = 1;
            n3 = ++n2;
        }
        int n4 = n2 = 0;
        while (n4 != this.cfr_renamed_1.length) {
            n = this.cfr_renamed_1[n2];
            nArray[n] = -1;
            n4 = ++n2;
        }
        return new sprhgf(nArray);
    }
}

