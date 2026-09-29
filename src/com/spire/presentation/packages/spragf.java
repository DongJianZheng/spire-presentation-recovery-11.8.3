/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprefs;
import com.spire.presentation.packages.sprghb;
import com.spire.presentation.packages.sproef;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprydf;
import java.math.BigInteger;
import java.util.Random;

public class spragf {
    private static final int[] cfr_renamed_112;
    private static final int[] cfr_renamed_119;
    private static final short[] cfr_renamed_91;
    private static final boolean[] cfr_renamed_0;
    private int[] cfr_renamed_1;
    private int cfr_renamed_2;
    private static Random cfr_renamed_3;
    private int cfr_renamed_4;

    public void cfr_renamed_1011() {
        int n;
        spragf spragf2 = this;
        --spragf2.cfr_renamed_4;
        spragf2.cfr_renamed_2 = (spragf2.cfr_renamed_4 - 1 >>> 5) + 1;
        int n2 = n = 0;
        while (n2 <= this.cfr_renamed_2 - 2) {
            spragf spragf3 = this;
            int n3 = n;
            spragf3.cfr_renamed_1[n3] = spragf3.cfr_renamed_1[n3] >>> 1;
            int n4 = n;
            int n5 = spragf3.cfr_renamed_1[n4] | this.cfr_renamed_1[n + 1] << 31;
            spragf3.cfr_renamed_1[n4] = n5;
            n2 = ++n;
        }
        spragf spragf4 = this;
        int[] nArray = spragf4.cfr_renamed_1;
        int n6 = spragf4.cfr_renamed_2 - 1;
        nArray[n6] = nArray[n6] >>> 1;
        if ((spragf4.cfr_renamed_4 & 0x1F) == 0) {
            spragf spragf5 = this;
            int[] nArray2 = spragf5.cfr_renamed_1;
            int n7 = spragf5.cfr_renamed_2 - 1;
            spragf spragf6 = this;
            nArray2[n7] = nArray2[n7] | spragf6.cfr_renamed_1[spragf6.cfr_renamed_2] << 31;
        }
    }

    public void cfr_renamed_5496(Random arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            this.cfr_renamed_1[n++] = arg0.nextInt();
            n2 = n;
        }
        this.cfr_renamed_975();
    }

    public boolean cfr_renamed_1000() {
        int n;
        if (this.cfr_renamed_805()) {
            return false;
        }
        spragf spragf2 = new spragf(this);
        spragf2.cfr_renamed_978();
        int n2 = spragf2.cfr_renamed_4 - 1;
        spragf spragf3 = new spragf(spragf2.cfr_renamed_4, "X");
        int n3 = n = 1;
        while (n3 <= n2 >> 1) {
            spragf spragf4 = spragf3;
            spragf4.cfr_renamed_999();
            spragf3 = spragf4.cfr_renamed_5497(spragf2);
            spragf spragf5 = spragf3.cfr_renamed_5498(new spragf(32, "X"));
            if (!spragf5.cfr_renamed_805()) {
                if (!spragf2.cfr_renamed_5499(spragf5).cfr_renamed_287()) {
                    return false;
                }
            } else {
                return false;
            }
            n3 = ++n;
        }
        return true;
    }

    public void cfr_renamed_5500(spragf arg0, int arg1) {
        int n;
        if (arg1 == 0) {
            this.cfr_renamed_5501(arg0);
            return;
        }
        this.cfr_renamed_973(arg0.cfr_renamed_4 + arg1);
        int n2 = arg1 >>> 5;
        int n3 = n = arg0.cfr_renamed_2 - 1;
        while (n3 >= 0) {
            if (n + n2 + 1 < this.cfr_renamed_2 && (arg1 & 0x1F) != 0) {
                int n4 = n + n2 + 1;
                this.cfr_renamed_1[n4] = this.cfr_renamed_1[n4] ^ arg0.cfr_renamed_1[n] >>> 32 - (arg1 & 0x1F);
            }
            int n5 = n + n2;
            int n6 = this.cfr_renamed_1[n5] ^ arg0.cfr_renamed_1[n] << (arg1 & 0x1F);
            this.cfr_renamed_1[n5] = n6;
            n3 = --n;
        }
    }

    private /* synthetic */ void cfr_renamed_966(int arg0) {
        spragf spragf2 = this;
        if (spragf2.cfr_renamed_2 <= spragf2.cfr_renamed_1.length) {
            int n;
            int n2 = n = this.cfr_renamed_2 - 1;
            while (n2 >= arg0) {
                spragf spragf3 = this;
                int n3 = n--;
                spragf3.cfr_renamed_1[n3] = spragf3.cfr_renamed_1[n3 - arg0];
                n2 = n;
            }
            int n4 = n = 0;
            while (n4 < arg0) {
                this.cfr_renamed_1[n++] = 0;
                n4 = n;
            }
        } else {
            spragf spragf4 = this;
            int[] nArray = new int[spragf4.cfr_renamed_2];
            int n = arg0;
            System.arraycopy(spragf4.cfr_renamed_1, 0, nArray, n, this.cfr_renamed_2 - n);
            spragf4.cfr_renamed_1 = null;
            spragf4.cfr_renamed_1 = nArray;
        }
    }

    /*
     * WARNING - void declaration
     */
    public spragf cfr_renamed_5502(spragf spragf2) {
        void arg0;
        spragf spragf3 = this;
        int n = Math.max(spragf3.cfr_renamed_4, arg0.cfr_renamed_4);
        spragf3.cfr_renamed_973(n);
        arg0.cfr_renamed_973(n);
        return spragf3.cfr_renamed_5503(spragf2);
    }

    public spragf cfr_renamed_5504(spragf arg0) {
        int n;
        spragf spragf2 = new spragf(Math.max(this.cfr_renamed_4, arg0.cfr_renamed_4) << 1);
        spragf[] spragfArray = new spragf[32];
        spragfArray[0] = new spragf(this);
        int n2 = n = 1;
        while (n2 <= 31) {
            spragfArray[++n] = spragfArray[n - 1].cfr_renamed_1007();
            n2 = n;
        }
        int n3 = n = 0;
        while (n3 < arg0.cfr_renamed_2) {
            int n4;
            int n5 = n4 = 0;
            while (n5 <= 31) {
                if ((arg0.cfr_renamed_1[n] & cfr_renamed_119[n4]) != 0) {
                    spragf2.cfr_renamed_5505(spragfArray[n4]);
                }
                n5 = ++n4;
            }
            int n6 = n4 = 0;
            while (n6 <= 31) {
                spragfArray[n4++].cfr_renamed_1008();
                n6 = n4;
            }
            n3 = ++n;
        }
        return spragf2;
    }

    public boolean equals(Object arg0) {
        int n;
        if (arg0 == null || !(arg0 instanceof spragf)) {
            return false;
        }
        spragf spragf2 = (spragf)arg0;
        if (this.cfr_renamed_4 != spragf2.cfr_renamed_4) {
            return false;
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            if (this.cfr_renamed_1[n] != spragf2.cfr_renamed_1[n]) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public spragf(int n, String string) {
        void arg1;
        int n2 = n;
        if (n2 < 1) {
            n2 = 1;
        }
        this.cfr_renamed_2 = (n2 - 1 >> 5) + 1;
        this.cfr_renamed_1 = new int[this.cfr_renamed_2];
        this.cfr_renamed_4 = n2;
        if (arg1.equalsIgnoreCase(sprefs.cfr_renamed_9("\u0000K\bA"))) {
            this.cfr_renamed_986();
            return;
        }
        if (arg1.equalsIgnoreCase(sprghb.cfr_renamed_9("L=F"))) {
            this.cfr_renamed_987();
            return;
        }
        if (arg1.equalsIgnoreCase(sprefs.cfr_renamed_9("\bO\u0014J\u0015C"))) {
            this.cfr_renamed_988();
            return;
        }
        if (arg1.equalsIgnoreCase("X")) {
            this.cfr_renamed_989();
            return;
        }
        if (arg1.equalsIgnoreCase(sprghb.cfr_renamed_9("B?O"))) {
            this.cfr_renamed_974();
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprefs.cfr_renamed_9("\u001f|(a(4zI\u001c<\na6w4a7g;bzy;}zm;b6k>./}3`=.")).append((String)arg1).append(sprghb.cfr_renamed_9("Sb\u0000#\u0005b\u001fv\u0016\"")).toString());
    }

    public void cfr_renamed_5505(spragf arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < Math.min(this.cfr_renamed_2, arg0.cfr_renamed_2)) {
            int n3 = n;
            int n4 = this.cfr_renamed_1[n3] ^ arg0.cfr_renamed_1[n];
            this.cfr_renamed_1[n3] = n4;
            n2 = ++n;
        }
        this.cfr_renamed_975();
    }

    /*
     * WARNING - void declaration
     */
    public spragf(int n, BigInteger bigInteger) {
        int n2;
        void arg1;
        int n3 = n;
        if (n3 < 1) {
            n3 = 1;
        }
        this.cfr_renamed_2 = (n3 - 1 >> 5) + 1;
        this.cfr_renamed_1 = new int[this.cfr_renamed_2];
        this.cfr_renamed_4 = n3;
        byte[] byArray = arg1.toByteArray();
        if (byArray[0] == 0) {
            byte[] byArray2 = new byte[byArray.length - 1];
            System.arraycopy(byArray, 1, byArray2, 0, byArray2.length);
            byArray = byArray2;
        }
        int n4 = byArray.length & 3;
        int n5 = (byArray.length - 1 >> 2) + 1;
        int n6 = n2 = 0;
        while (n6 < n4) {
            int n7 = n5 - 1;
            int n8 = this.cfr_renamed_1[n7] | (byArray[n2] & 0xFF) << (n4 - 1 - n2 << 3);
            this.cfr_renamed_1[n7] = n8;
            n6 = ++n2;
        }
        int n9 = 0;
        int n10 = n2 = 0;
        while (n10 <= byArray.length - 4 >> 2) {
            n9 = byArray.length - 1 - (n2 << 2);
            spragf spragf2 = this;
            spragf2.cfr_renamed_1[n2] = byArray[n9] & 0xFF;
            int n11 = n2;
            spragf2.cfr_renamed_1[n11] = spragf2.cfr_renamed_1[n11] | byArray[n9 - 1] << 8 & 0xFF00;
            int n12 = n2;
            spragf2.cfr_renamed_1[n12] = spragf2.cfr_renamed_1[n12] | byArray[n9 - 2] << 16 & 0xFF0000;
            int n13 = n2++;
            spragf2.cfr_renamed_1[n13] = spragf2.cfr_renamed_1[n13] | byArray[n9 - 3] << 24 & 0xFF000000;
            n10 = n2;
        }
        if ((this.cfr_renamed_4 & 0x1F) != 0) {
            spragf spragf3 = this;
            int[] nArray = spragf3.cfr_renamed_1;
            int n14 = spragf3.cfr_renamed_2 - 1;
            nArray[n14] = nArray[n14] & cfr_renamed_112[this.cfr_renamed_4 & 0x1F];
        }
        this.cfr_renamed_978();
    }

    public boolean cfr_renamed_5506(spragf arg0) throws RuntimeException {
        int n;
        boolean bl = false;
        if (this.cfr_renamed_4 != arg0.cfr_renamed_4) {
            throw new RuntimeException();
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            int n3 = this.cfr_renamed_1[n] & arg0.cfr_renamed_1[n];
            bl ^= cfr_renamed_0[n3 & 0xFF];
            bl ^= cfr_renamed_0[n3 >>> 8 & 0xFF];
            bl ^= cfr_renamed_0[n3 >>> 16 & 0xFF];
            bl ^= cfr_renamed_0[n3 >>> 24 & 0xFF];
            n2 = ++n;
        }
        return bl;
    }

    private /* synthetic */ void cfr_renamed_975() {
        if ((this.cfr_renamed_4 & 0x1F) != 0) {
            spragf spragf2 = this;
            int[] nArray = spragf2.cfr_renamed_1;
            int n = spragf2.cfr_renamed_2 - 1;
            nArray[n] = nArray[n] & cfr_renamed_112[this.cfr_renamed_4 & 0x1F];
        }
    }

    public void cfr_renamed_974() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            this.cfr_renamed_1[n++] = -1;
            n2 = n;
        }
        this.cfr_renamed_975();
    }

    public boolean cfr_renamed_1012(int arg0) {
        if (arg0 < 0) {
            throw new RuntimeException();
        }
        if (arg0 > this.cfr_renamed_4 - 1) {
            return false;
        }
        return (this.cfr_renamed_1[arg0 >>> 5] & cfr_renamed_119[arg0 & 0x1F]) != 0;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spragf cfr_renamed_976(int n) {
        void arg0;
        void v0 = arg0;
        int n2 = Math.min((int)v0, this.cfr_renamed_2 - v0);
        spragf spragf2 = new spragf(n2 << 5);
        if (this.cfr_renamed_2 >= arg0) {
            System.arraycopy(this.cfr_renamed_1, (int)arg0, spragf2.cfr_renamed_1, 0, n2);
        }
        return spragf2;
    }

    public spragf cfr_renamed_979(int arg0) {
        int n;
        spragf spragf2 = new spragf(this.cfr_renamed_4 + arg0, this.cfr_renamed_1);
        if (arg0 >= 32) {
            spragf2.cfr_renamed_966(arg0 >>> 5);
        }
        if ((n = arg0 & 0x1F) != 0) {
            int n2;
            int n3 = n2 = spragf2.cfr_renamed_2 - 1;
            while (n3 >= 1) {
                spragf spragf3 = spragf2;
                int n4 = n2;
                spragf3.cfr_renamed_1[n4] = spragf3.cfr_renamed_1[n4] << n;
                int n5 = n2;
                int n6 = spragf3.cfr_renamed_1[n5] | spragf2.cfr_renamed_1[n2 - 1] >>> 32 - n;
                spragf3.cfr_renamed_1[n5] = n6;
                n3 = --n2;
            }
            spragf2.cfr_renamed_1[0] = spragf2.cfr_renamed_1[0] << n;
        }
        return spragf2;
    }

    public spragf cfr_renamed_5497(spragf arg0) throws RuntimeException {
        int n;
        spragf spragf2 = new spragf(this);
        spragf spragf3 = new spragf(arg0);
        if (spragf3.cfr_renamed_805()) {
            throw new RuntimeException();
        }
        spragf2.cfr_renamed_978();
        spragf3.cfr_renamed_978();
        if (spragf2.cfr_renamed_4 < spragf3.cfr_renamed_4) {
            return spragf2;
        }
        int n2 = n = spragf2.cfr_renamed_4 - spragf3.cfr_renamed_4;
        while (n2 >= 0) {
            spragf spragf4 = spragf3.cfr_renamed_979(n);
            spragf spragf5 = spragf2;
            spragf5.cfr_renamed_5507(spragf4);
            spragf5.cfr_renamed_978();
            n2 = spragf5.cfr_renamed_4 - spragf3.cfr_renamed_4;
        }
        return spragf2;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_5507(spragf spragf2) {
        void arg0;
        spragf spragf3 = this;
        spragf3.cfr_renamed_973(arg0.cfr_renamed_4);
        spragf3.cfr_renamed_5505(spragf2);
    }

    public int cfr_renamed_960(int arg0) {
        if (arg0 < 0) {
            throw new RuntimeException();
        }
        if (arg0 > this.cfr_renamed_4 - 1) {
            return 0;
        }
        if ((this.cfr_renamed_1[arg0 >>> 5] & cfr_renamed_119[arg0 & 0x1F]) != 0) {
            return 1;
        }
        return 0;
    }

    private static /* synthetic */ int[] cfr_renamed_969(int arg0, int arg1) {
        int n;
        int[] nArray = new int[2];
        if (arg0 == 0 || arg1 == 0) {
            return nArray;
        }
        long l = arg1;
        l &= 0xFFFFFFFFL;
        long l2 = 0L;
        int n2 = n = 1;
        while (n2 <= 32) {
            if ((arg0 & cfr_renamed_119[n - 1]) != 0) {
                l2 ^= l;
            }
            l <<= 1;
            n2 = ++n;
        }
        nArray[1] = (int)(l2 >>> 32);
        nArray[0] = (int)(l2 & 0xFFFFFFFFL);
        return nArray;
    }

    public void cfr_renamed_1010() {
        int n;
        if (this.cfr_renamed_805()) {
            return;
        }
        spragf spragf2 = this;
        int[] nArray = new int[spragf2.cfr_renamed_2 << 1];
        int n2 = n = spragf2.cfr_renamed_2 - 1;
        while (n2 >= 0) {
            int n3;
            int n4 = this.cfr_renamed_1[n];
            int n5 = 1;
            int n6 = n3 = 0;
            while (n6 < 16) {
                if ((n4 & 1) != 0) {
                    int n7 = n << 1;
                    nArray[n7] = nArray[n7] | n5;
                }
                if ((n4 & 0x10000) != 0) {
                    int n8 = (n << 1) + 1;
                    nArray[n8] = nArray[n8] | n5;
                }
                n5 <<= 2;
                n4 >>>= 1;
                n6 = ++n3;
            }
            n2 = --n;
        }
        spragf spragf3 = this;
        this.cfr_renamed_1 = null;
        spragf3.cfr_renamed_1 = nArray;
        spragf3.cfr_renamed_2 = nArray.length;
        this.cfr_renamed_4 = (this.cfr_renamed_4 << 1) - 1;
    }

    public void cfr_renamed_988() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            this.cfr_renamed_1[n++] = cfr_renamed_3.nextInt();
            n2 = n;
        }
        this.cfr_renamed_975();
    }

    public void cfr_renamed_949(int arg0) throws RuntimeException {
        if (arg0 < 0 || arg0 > this.cfr_renamed_4 - 1) {
            throw new RuntimeException();
        }
        int n = arg0 >>> 5;
        this.cfr_renamed_1[n] = this.cfr_renamed_1[n] | cfr_renamed_119[arg0 & 0x1F];
    }

    /*
     * WARNING - void declaration
     */
    public spragf(int n, byte[] byArray) {
        int n2;
        int n3;
        void arg1;
        int n4 = n;
        if (n4 < 1) {
            n4 = 1;
        }
        this.cfr_renamed_2 = (n4 - 1 >> 5) + 1;
        this.cfr_renamed_1 = new int[this.cfr_renamed_2];
        this.cfr_renamed_4 = n4;
        int n5 = Math.min((((void)arg1).length - 1 >> 2) + 1, this.cfr_renamed_2);
        int n6 = n3 = 0;
        while (n6 < n5 - 1) {
            n2 = ((void)arg1).length - (n3 << 2) - 1;
            spragf spragf2 = this;
            spragf2.cfr_renamed_1[n3] = arg1[n2] & 0xFF;
            int n7 = n3;
            spragf2.cfr_renamed_1[n7] = spragf2.cfr_renamed_1[n7] | arg1[n2 - 1] << 8 & 0xFF00;
            int n8 = n3;
            spragf2.cfr_renamed_1[n8] = spragf2.cfr_renamed_1[n8] | arg1[n2 - 2] << 16 & 0xFF0000;
            int n9 = n3++;
            spragf2.cfr_renamed_1[n9] = spragf2.cfr_renamed_1[n9] | arg1[n2 - 3] << 24 & 0xFF000000;
            n6 = n3;
        }
        n3 = n5 - 1;
        n2 = ((void)arg1).length - (n3 << 2) - 1;
        this.cfr_renamed_1[n3] = arg1[n2] & 0xFF;
        if (n2 > 0) {
            int n10 = n3;
            this.cfr_renamed_1[n10] = this.cfr_renamed_1[n10] | arg1[n2 - 1] << 8 & 0xFF00;
        }
        if (n2 > 1) {
            int n11 = n3;
            this.cfr_renamed_1[n11] = this.cfr_renamed_1[n11] | arg1[n2 - 2] << 16 & 0xFF0000;
        }
        if (n2 > 2) {
            int n12 = n3;
            this.cfr_renamed_1[n12] = this.cfr_renamed_1[n12] | arg1[n2 - 3] << 24 & 0xFF000000;
        }
        spragf spragf3 = this;
        spragf3.cfr_renamed_975();
        spragf3.cfr_renamed_978();
    }

    public spragf cfr_renamed_5508(spragf arg0) {
        spragf spragf2;
        spragf spragf3 = this;
        int n = Math.min(spragf3.cfr_renamed_2, arg0.cfr_renamed_2);
        if (spragf3.cfr_renamed_4 >= arg0.cfr_renamed_4) {
            int n2;
            spragf2 = new spragf(this);
            int n3 = n2 = 0;
            while (n3 < n) {
                int n4 = n2;
                int n5 = spragf2.cfr_renamed_1[n4] ^ arg0.cfr_renamed_1[n2];
                spragf2.cfr_renamed_1[n4] = n5;
                n3 = ++n2;
            }
        } else {
            int n6;
            spragf2 = new spragf(arg0);
            int n7 = n6 = 0;
            while (n7 < n) {
                int n8 = n6;
                int n9 = spragf2.cfr_renamed_1[n8] ^ this.cfr_renamed_1[n6];
                spragf2.cfr_renamed_1[n8] = n9;
                n7 = ++n6;
            }
        }
        spragf spragf4 = spragf2;
        spragf4.cfr_renamed_975();
        return spragf4;
    }

    public void cfr_renamed_984() {
        this.cfr_renamed_967(0);
    }

    private static /* synthetic */ int[] cfr_renamed_971(int[] arg0, int[] arg1) {
        int[] nArray;
        int[] nArray2;
        int[] nArray3;
        int[] nArray4;
        int[] nArray5;
        int[] nArray6;
        int[] nArray7;
        int[] nArray8;
        block7: {
            block6: {
                block5: {
                    nArray8 = new int[8];
                    nArray7 = new int[2];
                    System.arraycopy(arg0, 0, nArray7, 0, Math.min(2, arg0.length));
                    nArray6 = new int[2];
                    if (arg0.length > 2) {
                        System.arraycopy(arg0, 2, nArray6, 0, Math.min(2, arg0.length - 2));
                    }
                    nArray5 = new int[2];
                    System.arraycopy(arg1, 0, nArray5, 0, Math.min(2, arg1.length));
                    nArray4 = new int[2];
                    if (arg1.length > 2) {
                        System.arraycopy(arg1, 2, nArray4, 0, Math.min(2, arg1.length - 2));
                    }
                    if (nArray6[1] != 0 || nArray4[1] != 0) break block5;
                    if (nArray6[0] == 0 && nArray4[0] == 0) break block6;
                    nArray3 = nArray6;
                    nArray2 = spragf.cfr_renamed_969(nArray6[0], nArray4[0]);
                    int[] nArray9 = nArray8;
                    int[] nArray10 = nArray8;
                    int[] nArray11 = nArray8;
                    int[] nArray12 = nArray8;
                    nArray11[5] = nArray11[5] ^ nArray2[1];
                    nArray12[4] = nArray12[4] ^ nArray2[0];
                    nArray9[3] = nArray9[3] ^ nArray2[1];
                    nArray10[2] = nArray10[2] ^ nArray2[0];
                    break block7;
                }
                nArray2 = spragf.cfr_renamed_970(nArray6, nArray4);
                int[] nArray13 = nArray8;
                int[] nArray14 = nArray8;
                int[] nArray15 = nArray8;
                int[] nArray16 = nArray8;
                int[] nArray17 = nArray8;
                int[] nArray18 = nArray8;
                nArray17[7] = nArray17[7] ^ nArray2[3];
                nArray18[6] = nArray18[6] ^ nArray2[2];
                nArray15[5] = nArray15[5] ^ (nArray2[1] ^ nArray2[3]);
                nArray16[4] = nArray16[4] ^ (nArray2[0] ^ nArray2[2]);
                nArray13[3] = nArray13[3] ^ nArray2[1];
                nArray14[2] = nArray14[2] ^ nArray2[0];
            }
            nArray3 = nArray6;
        }
        nArray3[0] = nArray3[0] ^ nArray7[0];
        int[] nArray19 = nArray4;
        nArray6[1] = nArray6[1] ^ nArray7[1];
        nArray19[0] = nArray19[0] ^ nArray5[0];
        int[] nArray20 = nArray4;
        nArray20[1] = nArray20[1] ^ nArray5[1];
        if (nArray6[1] == 0 && nArray4[1] == 0) {
            nArray2 = spragf.cfr_renamed_969(nArray6[0], nArray4[0]);
            nArray = nArray7;
            int[] nArray21 = nArray8;
            int[] nArray22 = nArray8;
            nArray21[3] = nArray21[3] ^ nArray2[1];
            nArray22[2] = nArray22[2] ^ nArray2[0];
        } else {
            nArray2 = spragf.cfr_renamed_970(nArray6, nArray4);
            nArray = nArray7;
            int[] nArray23 = nArray8;
            int[] nArray24 = nArray8;
            int[] nArray25 = nArray8;
            int[] nArray26 = nArray8;
            nArray25[5] = nArray25[5] ^ nArray2[3];
            nArray26[4] = nArray26[4] ^ nArray2[2];
            nArray23[3] = nArray23[3] ^ nArray2[1];
            nArray24[2] = nArray24[2] ^ nArray2[0];
        }
        if (nArray[1] == 0 && nArray5[1] == 0) {
            nArray2 = spragf.cfr_renamed_969(nArray7[0], nArray5[0]);
            int[] nArray27 = nArray8;
            int[] nArray28 = nArray8;
            int[] nArray29 = nArray8;
            int[] nArray30 = nArray8;
            nArray29[3] = nArray29[3] ^ nArray2[1];
            nArray30[2] = nArray30[2] ^ nArray2[0];
            nArray27[1] = nArray27[1] ^ nArray2[1];
            nArray28[0] = nArray28[0] ^ nArray2[0];
            return nArray27;
        }
        nArray2 = spragf.cfr_renamed_970(nArray7, nArray5);
        int[] nArray31 = nArray8;
        int[] nArray32 = nArray8;
        int[] nArray33 = nArray8;
        int[] nArray34 = nArray8;
        int[] nArray35 = nArray8;
        int[] nArray36 = nArray8;
        nArray35[5] = nArray35[5] ^ nArray2[3];
        nArray36[4] = nArray36[4] ^ nArray2[2];
        nArray33[3] = nArray33[3] ^ (nArray2[1] ^ nArray2[3]);
        nArray34[2] = nArray34[2] ^ (nArray2[0] ^ nArray2[2]);
        nArray31[1] = nArray31[1] ^ nArray2[1];
        nArray32[0] = nArray32[0] ^ nArray2[0];
        return nArray31;
    }

    public spragf cfr_renamed_5498(spragf arg0) {
        return this.cfr_renamed_5508(arg0);
    }

    public void cfr_renamed_967(int arg0) throws RuntimeException {
        if (arg0 < 0 || arg0 > this.cfr_renamed_4 - 1) {
            throw new RuntimeException();
        }
        int n = arg0 >>> 5;
        this.cfr_renamed_1[n] = this.cfr_renamed_1[n] ^ cfr_renamed_119[arg0 & 0x1F];
    }

    public void cfr_renamed_1008() {
        spragf spragf2 = this;
        ++spragf2.cfr_renamed_2;
        spragf2.cfr_renamed_4 += 32;
        if (spragf2.cfr_renamed_2 <= this.cfr_renamed_1.length) {
            int n;
            int n2 = n = this.cfr_renamed_2 - 1;
            while (n2 >= 1) {
                spragf spragf3 = this;
                int n3 = n--;
                spragf3.cfr_renamed_1[n3] = spragf3.cfr_renamed_1[n3 - 1];
                n2 = n;
            }
            this.cfr_renamed_1[0] = 0;
            return;
        }
        spragf spragf4 = this;
        int[] nArray = new int[spragf4.cfr_renamed_2];
        System.arraycopy(spragf4.cfr_renamed_1, 0, nArray, 1, this.cfr_renamed_2 - 1);
        spragf4.cfr_renamed_1 = null;
        spragf4.cfr_renamed_1 = nArray;
    }

    public spragf cfr_renamed_5499(spragf arg0) throws RuntimeException {
        spragf spragf2;
        if (this.cfr_renamed_805() && arg0.cfr_renamed_805()) {
            throw new ArithmeticException(sprefs.cfr_renamed_9("\u0018a.fza*k(o4j).5hzi9jzk+{;bzt?|5 "));
        }
        if (this.cfr_renamed_805()) {
            return new spragf(arg0);
        }
        if (arg0.cfr_renamed_805()) {
            return new spragf(this);
        }
        spragf spragf3 = new spragf(this);
        spragf spragf4 = spragf2 = new spragf(arg0);
        while (!spragf4.cfr_renamed_805()) {
            spragf spragf5 = spragf3.cfr_renamed_5497(spragf2);
            spragf3 = spragf2;
            spragf4 = spragf5;
        }
        return spragf3;
    }

    private /* synthetic */ spragf cfr_renamed_991(int arg0) {
        spragf spragf2;
        spragf spragf3 = spragf2 = new spragf(arg0 << 5);
        System.arraycopy(this.cfr_renamed_1, 0, spragf3.cfr_renamed_1, 0, Math.min(arg0, this.cfr_renamed_2));
        return spragf3;
    }

    private static /* synthetic */ int[] cfr_renamed_968(int[] arg0, int[] arg1) {
        int[] nArray;
        int[] nArray2;
        int[] nArray3;
        int[] nArray4;
        int[] nArray5;
        int[] nArray6;
        int[] nArray7;
        block5: {
            block4: {
                block2: {
                    block3: {
                        nArray7 = new int[16];
                        nArray6 = new int[4];
                        System.arraycopy(arg0, 0, nArray6, 0, Math.min(4, arg0.length));
                        nArray5 = new int[4];
                        if (arg0.length > 4) {
                            System.arraycopy(arg0, 4, nArray5, 0, Math.min(4, arg0.length - 4));
                        }
                        nArray4 = new int[4];
                        System.arraycopy(arg1, 0, nArray4, 0, Math.min(4, arg1.length));
                        nArray3 = new int[4];
                        if (arg1.length > 4) {
                            System.arraycopy(arg1, 4, nArray3, 0, Math.min(4, arg1.length - 4));
                        }
                        if (nArray5[3] != 0 || nArray5[2] != 0 || nArray3[3] != 0 || nArray3[2] != 0) break block2;
                        if (nArray5[1] != 0 || nArray3[1] != 0) break block3;
                        if (nArray5[0] == 0 && nArray3[0] == 0) break block4;
                        nArray2 = nArray5;
                        nArray = spragf.cfr_renamed_969(nArray5[0], nArray3[0]);
                        int[] nArray8 = nArray7;
                        int[] nArray9 = nArray7;
                        int[] nArray10 = nArray7;
                        int[] nArray11 = nArray7;
                        nArray10[9] = nArray10[9] ^ nArray[1];
                        nArray11[8] = nArray11[8] ^ nArray[0];
                        nArray8[5] = nArray8[5] ^ nArray[1];
                        nArray9[4] = nArray9[4] ^ nArray[0];
                        break block5;
                    }
                    nArray2 = nArray5;
                    nArray = spragf.cfr_renamed_970(nArray5, nArray3);
                    int[] nArray12 = nArray7;
                    int[] nArray13 = nArray7;
                    int[] nArray14 = nArray7;
                    int[] nArray15 = nArray7;
                    int[] nArray16 = nArray7;
                    int[] nArray17 = nArray7;
                    int[] nArray18 = nArray7;
                    int[] nArray19 = nArray7;
                    nArray18[11] = nArray18[11] ^ nArray[3];
                    nArray19[10] = nArray19[10] ^ nArray[2];
                    nArray16[9] = nArray16[9] ^ nArray[1];
                    nArray17[8] = nArray17[8] ^ nArray[0];
                    nArray14[7] = nArray14[7] ^ nArray[3];
                    nArray15[6] = nArray15[6] ^ nArray[2];
                    nArray12[5] = nArray12[5] ^ nArray[1];
                    nArray13[4] = nArray13[4] ^ nArray[0];
                    break block5;
                }
                nArray = spragf.cfr_renamed_971(nArray5, nArray3);
                int[] nArray20 = nArray7;
                int[] nArray21 = nArray7;
                int[] nArray22 = nArray7;
                int[] nArray23 = nArray7;
                int[] nArray24 = nArray7;
                int[] nArray25 = nArray7;
                int[] nArray26 = nArray7;
                int[] nArray27 = nArray7;
                int[] nArray28 = nArray7;
                int[] nArray29 = nArray7;
                int[] nArray30 = nArray7;
                int[] nArray31 = nArray7;
                nArray30[15] = nArray30[15] ^ nArray[7];
                nArray31[14] = nArray31[14] ^ nArray[6];
                nArray28[13] = nArray28[13] ^ nArray[5];
                nArray29[12] = nArray29[12] ^ nArray[4];
                nArray26[11] = nArray26[11] ^ (nArray[3] ^ nArray[7]);
                nArray27[10] = nArray27[10] ^ (nArray[2] ^ nArray[6]);
                nArray24[9] = nArray24[9] ^ (nArray[1] ^ nArray[5]);
                nArray25[8] = nArray25[8] ^ (nArray[0] ^ nArray[4]);
                nArray22[7] = nArray22[7] ^ nArray[3];
                nArray23[6] = nArray23[6] ^ nArray[2];
                nArray20[5] = nArray20[5] ^ nArray[1];
                nArray21[4] = nArray21[4] ^ nArray[0];
            }
            nArray2 = nArray5;
        }
        nArray2[0] = nArray2[0] ^ nArray6[0];
        int[] nArray32 = nArray5;
        int[] nArray33 = nArray3;
        int[] nArray34 = nArray5;
        int[] nArray35 = nArray5;
        nArray34[1] = nArray34[1] ^ nArray6[1];
        nArray35[2] = nArray35[2] ^ nArray6[2];
        nArray32[3] = nArray32[3] ^ nArray6[3];
        int[] nArray36 = nArray3;
        int[] nArray37 = nArray3;
        nArray3[0] = nArray3[0] ^ nArray4[0];
        nArray36[1] = nArray36[1] ^ nArray4[1];
        nArray37[2] = nArray37[2] ^ nArray4[2];
        nArray33[3] = nArray33[3] ^ nArray4[3];
        nArray = spragf.cfr_renamed_971(nArray5, nArray3);
        int[] nArray38 = nArray7;
        int[] nArray39 = nArray7;
        int[] nArray40 = nArray7;
        int[] nArray41 = nArray7;
        int[] nArray42 = nArray7;
        int[] nArray43 = nArray7;
        int[] nArray44 = nArray7;
        int[] nArray45 = nArray7;
        int[] nArray46 = nArray7;
        int[] nArray47 = nArray7;
        nArray7[11] = nArray7[11] ^ nArray[7];
        nArray46[10] = nArray46[10] ^ nArray[6];
        nArray47[9] = nArray47[9] ^ nArray[5];
        nArray44[8] = nArray44[8] ^ nArray[4];
        nArray45[7] = nArray45[7] ^ nArray[3];
        nArray42[6] = nArray42[6] ^ nArray[2];
        nArray43[5] = nArray43[5] ^ nArray[1];
        nArray40[4] = nArray40[4] ^ nArray[0];
        int[] nArray48 = spragf.cfr_renamed_971(nArray6, nArray4);
        nArray41[11] = nArray41[11] ^ nArray48[7];
        nArray38[10] = nArray38[10] ^ nArray48[6];
        nArray39[9] = nArray39[9] ^ nArray48[5];
        nArray38[8] = nArray38[8] ^ nArray48[4];
        nArray39[7] = nArray39[7] ^ (nArray48[3] ^ nArray48[7]);
        nArray38[6] = nArray38[6] ^ (nArray48[2] ^ nArray48[6]);
        nArray39[5] = nArray39[5] ^ (nArray48[1] ^ nArray48[5]);
        nArray38[4] = nArray38[4] ^ (nArray48[0] ^ nArray48[4]);
        nArray39[3] = nArray39[3] ^ nArray48[3];
        nArray38[2] = nArray38[2] ^ nArray48[2];
        nArray39[1] = nArray39[1] ^ nArray48[1];
        nArray38[0] = nArray38[0] ^ nArray48[0];
        return nArray39;
    }

    public BigInteger cfr_renamed_953() {
        if (this.cfr_renamed_4 == 0 || this.cfr_renamed_805()) {
            return new BigInteger(0, new byte[0]);
        }
        return new BigInteger(1, this.cfr_renamed_954());
    }

    public int hashCode() {
        spragf spragf2 = this;
        return spragf2.cfr_renamed_4 + sproze.cfr_renamed_552(spragf2.cfr_renamed_1);
    }

    public spragf cfr_renamed_5509(spragf arg0) {
        return this.cfr_renamed_5508(arg0);
    }

    public boolean cfr_renamed_287() {
        int n;
        int n2 = n = 1;
        while (n2 < this.cfr_renamed_2) {
            if (this.cfr_renamed_1[n] != 0) {
                return false;
            }
            n2 = ++n;
        }
        return this.cfr_renamed_1[0] == 1;
    }

    public spragf[] cfr_renamed_5510(spragf arg0) throws RuntimeException {
        int n;
        spragf[] spragfArray = new spragf[2];
        spragf spragf2 = new spragf(this.cfr_renamed_4);
        spragf spragf3 = new spragf(this);
        spragf spragf4 = new spragf(arg0);
        if (spragf4.cfr_renamed_805()) {
            throw new RuntimeException();
        }
        spragf3.cfr_renamed_978();
        spragf4.cfr_renamed_978();
        if (spragf3.cfr_renamed_4 < spragf4.cfr_renamed_4) {
            spragf[] spragfArray2 = spragfArray;
            spragfArray2[0] = new spragf(0);
            spragfArray[1] = spragf3;
            return spragfArray2;
        }
        int n2 = n = spragf3.cfr_renamed_4 - spragf4.cfr_renamed_4;
        int n3 = n2;
        spragf2.cfr_renamed_973(n2 + 1);
        while (n3 >= 0) {
            spragf spragf5 = spragf4.cfr_renamed_979(n);
            spragf spragf6 = spragf3;
            spragf3.cfr_renamed_5507(spragf5);
            spragf6.cfr_renamed_978();
            spragf2.cfr_renamed_967(n);
            n3 = spragf6.cfr_renamed_4 - spragf4.cfr_renamed_4;
        }
        spragfArray[0] = spragf2;
        spragfArray[1] = spragf3;
        return spragfArray;
    }

    public int cfr_renamed_806() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_989() {
        int n;
        int n2 = n = 1;
        while (n2 < this.cfr_renamed_2) {
            this.cfr_renamed_1[n++] = 0;
            n2 = n;
        }
        this.cfr_renamed_1[0] = 2;
    }

    public void cfr_renamed_1005(int arg0, int[] arg1) {
        long l;
        int n;
        int n2 = arg0 >>> 5;
        int n3 = 32 - (arg0 & 0x1F);
        int n4 = arg0 - arg1[0] >>> 5;
        int n5 = 32 - (arg0 - arg1[0] & 0x1F);
        int n6 = arg0 - arg1[1] >>> 5;
        int n7 = 32 - (arg0 - arg1[1] & 0x1F);
        int n8 = arg0 - arg1[2] >>> 5;
        int n9 = 32 - (arg0 - arg1[2] & 0x1F);
        int n10 = (arg0 << 1) - 2 >>> 5;
        int n11 = n2;
        int n12 = n = n10;
        while (n12 > n11) {
            spragf spragf2 = this;
            l = (long)spragf2.cfr_renamed_1[n] & 0xFFFFFFFFL;
            int n13 = n - n2 - 1;
            spragf2.cfr_renamed_1[n13] = spragf2.cfr_renamed_1[n13] ^ (int)(l << n3);
            int n14 = n - n2;
            spragf2.cfr_renamed_1[n14] = (int)((long)spragf2.cfr_renamed_1[n14] ^ l >>> 32 - n3);
            int n15 = n - n4 - 1;
            spragf2.cfr_renamed_1[n15] = spragf2.cfr_renamed_1[n15] ^ (int)(l << n5);
            int n16 = n - n4;
            spragf2.cfr_renamed_1[n16] = (int)((long)spragf2.cfr_renamed_1[n16] ^ l >>> 32 - n5);
            int n17 = n - n6 - 1;
            spragf2.cfr_renamed_1[n17] = spragf2.cfr_renamed_1[n17] ^ (int)(l << n7);
            int n18 = n - n6;
            spragf2.cfr_renamed_1[n18] = (int)((long)spragf2.cfr_renamed_1[n18] ^ l >>> 32 - n7);
            int n19 = n - n8 - 1;
            spragf2.cfr_renamed_1[n19] = spragf2.cfr_renamed_1[n19] ^ (int)(l << n9);
            int n20 = n - n8;
            spragf2.cfr_renamed_1[n20] = (int)((long)spragf2.cfr_renamed_1[n20] ^ l >>> 32 - n9);
            spragf2.cfr_renamed_1[n--] = 0;
            n12 = n;
        }
        spragf spragf3 = this;
        l = (long)spragf3.cfr_renamed_1[n11] & 0xFFFFFFFFL & 0xFFFFFFFFL << (arg0 & 0x1F);
        spragf3.cfr_renamed_1[0] = (int)((long)spragf3.cfr_renamed_1[0] ^ l >>> 32 - n3);
        if (n11 - n4 - 1 >= 0) {
            int n21 = n11 - n4 - 1;
            this.cfr_renamed_1[n21] = this.cfr_renamed_1[n21] ^ (int)(l << n5);
        }
        int n22 = n11 - n4;
        this.cfr_renamed_1[n22] = (int)((long)this.cfr_renamed_1[n22] ^ l >>> 32 - n5);
        if (n11 - n6 - 1 >= 0) {
            int n23 = n11 - n6 - 1;
            this.cfr_renamed_1[n23] = this.cfr_renamed_1[n23] ^ (int)(l << n7);
        }
        int n24 = n11 - n6;
        this.cfr_renamed_1[n24] = (int)((long)this.cfr_renamed_1[n24] ^ l >>> 32 - n7);
        if (n11 - n8 - 1 >= 0) {
            int n25 = n11 - n8 - 1;
            this.cfr_renamed_1[n25] = this.cfr_renamed_1[n25] ^ (int)(l << n9);
        }
        spragf spragf4 = this;
        int n26 = arg0;
        spragf spragf5 = this;
        int n27 = n11 - n8;
        spragf5.cfr_renamed_1[n27] = (int)((long)spragf5.cfr_renamed_1[n27] ^ l >>> 32 - n9);
        int n28 = n11;
        spragf5.cfr_renamed_1[n28] = spragf5.cfr_renamed_1[n28] & cfr_renamed_112[arg0 & 0x1F];
        spragf4.cfr_renamed_2 = (n26 - 1 >>> 5) + 1;
        spragf4.cfr_renamed_4 = n26;
    }

    public void cfr_renamed_987() {
        int n;
        int n2 = n = 1;
        while (n2 < this.cfr_renamed_2) {
            this.cfr_renamed_1[n++] = 0;
            n2 = n;
        }
        this.cfr_renamed_1[0] = 1;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_5501(spragf spragf2) {
        void arg0;
        spragf spragf3 = this;
        spragf3.cfr_renamed_973(arg0.cfr_renamed_4);
        spragf3.cfr_renamed_5505(spragf2);
    }

    public spragf cfr_renamed_5511(spragf arg0) throws RuntimeException {
        int n;
        spragf spragf2 = new spragf(this.cfr_renamed_4);
        spragf spragf3 = new spragf(this);
        spragf spragf4 = new spragf(arg0);
        if (spragf4.cfr_renamed_805()) {
            throw new RuntimeException();
        }
        spragf3.cfr_renamed_978();
        spragf4.cfr_renamed_978();
        if (spragf3.cfr_renamed_4 < spragf4.cfr_renamed_4) {
            return new spragf(0);
        }
        int n2 = n = spragf3.cfr_renamed_4 - spragf4.cfr_renamed_4;
        int n3 = n2;
        spragf2.cfr_renamed_973(n2 + 1);
        while (n3 >= 0) {
            spragf spragf5 = spragf4.cfr_renamed_979(n);
            spragf spragf6 = spragf3;
            spragf3.cfr_renamed_5507(spragf5);
            spragf6.cfr_renamed_978();
            spragf2.cfr_renamed_967(n);
            n3 = spragf6.cfr_renamed_4 - spragf4.cfr_renamed_4;
        }
        return spragf2;
    }

    /*
     * WARNING - void declaration
     */
    public spragf(int n, Random random) {
        void arg1;
        int n2 = n;
        if (n2 < 1) {
            n2 = 1;
        }
        this.cfr_renamed_2 = (n2 - 1 >> 5) + 1;
        this.cfr_renamed_1 = new int[this.cfr_renamed_2];
        this.cfr_renamed_4 = n2;
        this.cfr_renamed_5496((Random)arg1);
    }

    public boolean cfr_renamed_805() {
        int n;
        if (this.cfr_renamed_4 == 0) {
            return true;
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            if (this.cfr_renamed_1[n] != 0) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public spragf cfr_renamed_997() {
        int n;
        spragf spragf2 = new spragf(this.cfr_renamed_4 - 1);
        System.arraycopy(this.cfr_renamed_1, 0, spragf2.cfr_renamed_1, 0, spragf2.cfr_renamed_2);
        int n2 = n = 0;
        while (n2 <= spragf2.cfr_renamed_2 - 2) {
            spragf spragf3 = spragf2;
            int n3 = n;
            spragf3.cfr_renamed_1[n3] = spragf3.cfr_renamed_1[n3] >>> 1;
            int n4 = n;
            int n5 = spragf3.cfr_renamed_1[n4] | spragf2.cfr_renamed_1[n + 1] << 31;
            spragf3.cfr_renamed_1[n4] = n5;
            n2 = ++n;
        }
        spragf spragf4 = spragf2;
        int[] nArray = spragf4.cfr_renamed_1;
        int n6 = spragf4.cfr_renamed_2 - 1;
        nArray[n6] = nArray[n6] >>> 1;
        if (spragf4.cfr_renamed_2 < this.cfr_renamed_2) {
            spragf spragf5 = spragf2;
            int[] nArray2 = spragf5.cfr_renamed_1;
            int n7 = spragf5.cfr_renamed_2 - 1;
            nArray2[n7] = nArray2[n7] | this.cfr_renamed_1[spragf2.cfr_renamed_2] << 31;
        }
        return spragf2;
    }

    private static /* synthetic */ int[] cfr_renamed_970(int[] arg0, int[] arg1) {
        int[] nArray;
        int[] nArray2 = new int[4];
        int n = arg0[0];
        int n2 = 0;
        if (arg0.length > 1) {
            n2 = arg0[1];
        }
        int n3 = arg1[0];
        int n4 = 0;
        if (arg1.length > 1) {
            n4 = arg1[1];
        }
        if (n2 != 0 || n4 != 0) {
            nArray = spragf.cfr_renamed_969(n2, n4);
            int[] nArray3 = nArray2;
            int[] nArray4 = nArray2;
            nArray2[3] = nArray2[3] ^ nArray[1];
            nArray3[2] = nArray3[2] ^ (nArray[0] ^ nArray[1]);
            nArray4[1] = nArray4[1] ^ nArray[0];
        }
        nArray = spragf.cfr_renamed_969(n ^ n2, n3 ^ n4);
        int[] nArray5 = nArray2;
        int[] nArray6 = nArray2;
        int[] nArray7 = nArray2;
        int[] nArray8 = nArray2;
        nArray2[2] = nArray2[2] ^ nArray[1];
        nArray7[1] = nArray7[1] ^ nArray[0];
        int[] nArray9 = spragf.cfr_renamed_969(n, n3);
        nArray5[2] = nArray5[2] ^ nArray9[1];
        nArray8[1] = nArray8[1] ^ (nArray9[0] ^ nArray9[1]);
        nArray6[0] = nArray6[0] ^ nArray9[0];
        return nArray5;
    }

    public String cfr_renamed_957(int arg0) {
        char[] cArray = new char[16];
        cArray[0] = 48;
        cArray[1] = 49;
        cArray[2] = 50;
        cArray[3] = 51;
        cArray[4] = 52;
        cArray[5] = 53;
        cArray[6] = 54;
        cArray[7] = 55;
        cArray[8] = 56;
        cArray[9] = 57;
        cArray[10] = 97;
        cArray[11] = 98;
        cArray[12] = 99;
        cArray[13] = 100;
        cArray[14] = 101;
        cArray[15] = 102;
        char[] cArray2 = cArray;
        String[] stringArray = new String[16];
        stringArray[0] = sprghb.cfr_renamed_9("C3C3");
        stringArray[1] = sprefs.cfr_renamed_9("j>j?");
        stringArray[2] = sprghb.cfr_renamed_9("C3B3");
        stringArray[3] = sprefs.cfr_renamed_9("j>k?");
        stringArray[4] = sprghb.cfr_renamed_9("C2C3");
        stringArray[5] = sprefs.cfr_renamed_9("j?j?");
        stringArray[6] = sprghb.cfr_renamed_9("C2B3");
        stringArray[7] = sprefs.cfr_renamed_9("j?k?");
        stringArray[8] = "1000";
        stringArray[9] = sprghb.cfr_renamed_9("B3C2");
        stringArray[10] = sprefs.cfr_renamed_9("k>k>");
        stringArray[11] = sprghb.cfr_renamed_9("B3B2");
        stringArray[12] = sprefs.cfr_renamed_9("k?j>");
        stringArray[13] = sprghb.cfr_renamed_9("B2C2");
        stringArray[14] = sprefs.cfr_renamed_9("k?k>");
        stringArray[15] = sprghb.cfr_renamed_9("B2B2");
        String[] stringArray2 = stringArray;
        String string = new String();
        if (arg0 == 16) {
            int n;
            int n2 = n = this.cfr_renamed_2 - 1;
            while (n2 >= 0) {
                string = new StringBuilder().insert(0, string).append(cArray2[this.cfr_renamed_1[n] >>> 28 & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(cArray2[this.cfr_renamed_1[n] >>> 24 & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(cArray2[this.cfr_renamed_1[n] >>> 20 & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(cArray2[this.cfr_renamed_1[n] >>> 16 & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(cArray2[this.cfr_renamed_1[n] >>> 12 & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(cArray2[this.cfr_renamed_1[n] >>> 8 & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(cArray2[this.cfr_renamed_1[n] >>> 4 & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(cArray2[this.cfr_renamed_1[n] & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(" ").toString();
                n2 = --n;
            }
        } else {
            int n;
            int n3 = n = this.cfr_renamed_2 - 1;
            while (n3 >= 0) {
                string = new StringBuilder().insert(0, string).append(stringArray2[this.cfr_renamed_1[n] >>> 28 & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(stringArray2[this.cfr_renamed_1[n] >>> 24 & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(stringArray2[this.cfr_renamed_1[n] >>> 20 & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(stringArray2[this.cfr_renamed_1[n] >>> 16 & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(stringArray2[this.cfr_renamed_1[n] >>> 12 & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(stringArray2[this.cfr_renamed_1[n] >>> 8 & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(stringArray2[this.cfr_renamed_1[n] >>> 4 & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(stringArray2[this.cfr_renamed_1[n] & 0xF]).toString();
                string = new StringBuilder().insert(0, string).append(" ").toString();
                n3 = --n;
            }
        }
        return string;
    }

    public byte[] cfr_renamed_954() {
        int n;
        int n2;
        int n3 = (this.cfr_renamed_4 - 1 >> 3) + 1;
        int n4 = n3 & 3;
        byte[] byArray = new byte[n3];
        int n5 = n2 = 0;
        while (n5 < n3 >> 2) {
            int n6 = n = n3 - (n2 << 2) - 1;
            byArray[n] = (byte)(this.cfr_renamed_1[n2] & 0xFF);
            byArray[n6 - 1] = (byte)((this.cfr_renamed_1[n2] & 0xFF00) >>> 8);
            byArray[n6 - 2] = (byte)((this.cfr_renamed_1[n2] & 0xFF0000) >>> 16);
            byte by = (byte)((this.cfr_renamed_1[n2] & 0xFF000000) >>> 24);
            byArray[n - 3] = by;
            n5 = ++n2;
        }
        int n7 = n2 = 0;
        while (n7 < n4) {
            n = n4 - n2 - 1 << 3;
            spragf spragf2 = this;
            byArray[n2++] = (byte)((spragf2.cfr_renamed_1[spragf2.cfr_renamed_2 - 1] & 255 << n) >>> n);
            n7 = n2;
        }
        return byArray;
    }

    public void cfr_renamed_981() {
        if ((this.cfr_renamed_4 & 0x1F) == 0) {
            int n;
            spragf spragf2 = this;
            ++spragf2.cfr_renamed_4;
            ++spragf2.cfr_renamed_2;
            if (spragf2.cfr_renamed_2 > this.cfr_renamed_1.length) {
                spragf spragf3 = this;
                int[] nArray = new int[spragf3.cfr_renamed_2];
                System.arraycopy(spragf3.cfr_renamed_1, 0, nArray, 0, this.cfr_renamed_1.length);
                spragf spragf4 = this;
                spragf4.cfr_renamed_1 = null;
                spragf4.cfr_renamed_1 = nArray;
            }
            int n2 = n = this.cfr_renamed_2 - 1;
            while (n2 >= 1) {
                spragf spragf5 = this;
                int n3 = n;
                spragf5.cfr_renamed_1[n3] = spragf5.cfr_renamed_1[n3] | this.cfr_renamed_1[n - 1] >>> 31;
                int n4 = --n;
                spragf5.cfr_renamed_1[n4] = spragf5.cfr_renamed_1[n4] << 1;
                n2 = n;
            }
        } else {
            int n;
            spragf spragf6 = this;
            ++spragf6.cfr_renamed_4;
            int n5 = n = spragf6.cfr_renamed_2 - 1;
            while (n5 >= 1) {
                spragf spragf7 = this;
                int n6 = n;
                spragf7.cfr_renamed_1[n6] = spragf7.cfr_renamed_1[n6] << 1;
                int n7 = n;
                int n8 = spragf7.cfr_renamed_1[n7] | this.cfr_renamed_1[n - 1] >>> 31;
                spragf7.cfr_renamed_1[n7] = n8;
                n5 = --n;
            }
            this.cfr_renamed_1[0] = this.cfr_renamed_1[0] << 1;
        }
    }

    public spragf cfr_renamed_1003() {
        spragf spragf2 = new spragf(this);
        spragf2.cfr_renamed_984();
        return spragf2;
    }

    public void cfr_renamed_973(int arg0) {
        if (this.cfr_renamed_4 >= arg0) {
            return;
        }
        this.cfr_renamed_4 = arg0;
        int n = (this.cfr_renamed_4 - 1 >>> 5) + 1;
        if (this.cfr_renamed_2 >= n) {
            return;
        }
        if (this.cfr_renamed_1.length >= n) {
            int n2;
            int n3 = n2 = this.cfr_renamed_2;
            while (n3 < n) {
                this.cfr_renamed_1[n2++] = 0;
                n3 = n2;
            }
            this.cfr_renamed_2 = n;
            return;
        }
        int[] nArray = new int[n];
        spragf spragf2 = this;
        System.arraycopy(this.cfr_renamed_1, 0, nArray, 0, this.cfr_renamed_2);
        this.cfr_renamed_2 = n;
        spragf2.cfr_renamed_1 = null;
        spragf2.cfr_renamed_1 = nArray;
    }

    public void cfr_renamed_965(int arg0) throws RuntimeException {
        if (arg0 < 0) {
            throw new RuntimeException();
        }
        if (arg0 > this.cfr_renamed_4 - 1) {
            return;
        }
        int n = arg0 >>> 5;
        this.cfr_renamed_1[n] = this.cfr_renamed_1[n] & ~cfr_renamed_119[arg0 & 0x1F];
    }

    static {
        cfr_renamed_3 = new Random();
        boolean[] blArray = new boolean[256];
        blArray[0] = 0;
        blArray[1] = 1;
        blArray[2] = true;
        blArray[3] = false;
        blArray[4] = true;
        blArray[5] = false;
        blArray[6] = false;
        blArray[7] = true;
        blArray[8] = true;
        blArray[9] = false;
        blArray[10] = false;
        blArray[11] = true;
        blArray[12] = false;
        blArray[13] = true;
        blArray[14] = true;
        blArray[15] = false;
        blArray[16] = true;
        blArray[17] = false;
        blArray[18] = false;
        blArray[19] = true;
        blArray[20] = false;
        blArray[21] = true;
        blArray[22] = true;
        blArray[23] = false;
        blArray[24] = false;
        blArray[25] = true;
        blArray[26] = true;
        blArray[27] = false;
        blArray[28] = true;
        blArray[29] = false;
        blArray[30] = false;
        blArray[31] = true;
        blArray[32] = true;
        blArray[33] = false;
        blArray[34] = false;
        blArray[35] = true;
        blArray[36] = false;
        blArray[37] = true;
        blArray[38] = true;
        blArray[39] = false;
        blArray[40] = false;
        blArray[41] = true;
        blArray[42] = true;
        blArray[43] = false;
        blArray[44] = true;
        blArray[45] = false;
        blArray[46] = false;
        blArray[47] = true;
        blArray[48] = false;
        blArray[49] = true;
        blArray[50] = true;
        blArray[51] = false;
        blArray[52] = true;
        blArray[53] = false;
        blArray[54] = false;
        blArray[55] = true;
        blArray[56] = true;
        blArray[57] = false;
        blArray[58] = false;
        blArray[59] = true;
        blArray[60] = false;
        blArray[61] = true;
        blArray[62] = true;
        blArray[63] = false;
        blArray[64] = true;
        blArray[65] = false;
        blArray[66] = false;
        blArray[67] = true;
        blArray[68] = false;
        blArray[69] = true;
        blArray[70] = true;
        blArray[71] = false;
        blArray[72] = false;
        blArray[73] = true;
        blArray[74] = true;
        blArray[75] = false;
        blArray[76] = true;
        blArray[77] = false;
        blArray[78] = false;
        blArray[79] = true;
        blArray[80] = false;
        blArray[81] = true;
        blArray[82] = true;
        blArray[83] = false;
        blArray[84] = true;
        blArray[85] = false;
        blArray[86] = false;
        blArray[87] = true;
        blArray[88] = true;
        blArray[89] = false;
        blArray[90] = false;
        blArray[91] = true;
        blArray[92] = false;
        blArray[93] = true;
        blArray[94] = true;
        blArray[95] = false;
        blArray[96] = false;
        blArray[97] = true;
        blArray[98] = true;
        blArray[99] = false;
        blArray[100] = true;
        blArray[101] = false;
        blArray[102] = false;
        blArray[103] = true;
        blArray[104] = true;
        blArray[105] = false;
        blArray[106] = false;
        blArray[107] = true;
        blArray[108] = false;
        blArray[109] = true;
        blArray[110] = true;
        blArray[111] = false;
        blArray[112] = true;
        blArray[113] = false;
        blArray[114] = false;
        blArray[115] = true;
        blArray[116] = false;
        blArray[117] = true;
        blArray[118] = true;
        blArray[119] = false;
        blArray[120] = false;
        blArray[121] = true;
        blArray[122] = true;
        blArray[123] = false;
        blArray[124] = true;
        blArray[125] = false;
        blArray[126] = false;
        blArray[127] = true;
        blArray[128] = true;
        blArray[129] = false;
        blArray[130] = false;
        blArray[131] = true;
        blArray[132] = false;
        blArray[133] = true;
        blArray[134] = true;
        blArray[135] = false;
        blArray[136] = false;
        blArray[137] = true;
        blArray[138] = true;
        blArray[139] = false;
        blArray[140] = true;
        blArray[141] = false;
        blArray[142] = false;
        blArray[143] = true;
        blArray[144] = false;
        blArray[145] = true;
        blArray[146] = true;
        blArray[147] = false;
        blArray[148] = true;
        blArray[149] = false;
        blArray[150] = false;
        blArray[151] = true;
        blArray[152] = true;
        blArray[153] = false;
        blArray[154] = false;
        blArray[155] = true;
        blArray[156] = false;
        blArray[157] = true;
        blArray[158] = true;
        blArray[159] = false;
        blArray[160] = false;
        blArray[161] = true;
        blArray[162] = true;
        blArray[163] = false;
        blArray[164] = true;
        blArray[165] = false;
        blArray[166] = false;
        blArray[167] = true;
        blArray[168] = true;
        blArray[169] = false;
        blArray[170] = false;
        blArray[171] = true;
        blArray[172] = false;
        blArray[173] = true;
        blArray[174] = true;
        blArray[175] = false;
        blArray[176] = true;
        blArray[177] = false;
        blArray[178] = false;
        blArray[179] = true;
        blArray[180] = false;
        blArray[181] = true;
        blArray[182] = true;
        blArray[183] = false;
        blArray[184] = false;
        blArray[185] = true;
        blArray[186] = true;
        blArray[187] = false;
        blArray[188] = true;
        blArray[189] = false;
        blArray[190] = false;
        blArray[191] = true;
        blArray[192] = false;
        blArray[193] = true;
        blArray[194] = true;
        blArray[195] = false;
        blArray[196] = true;
        blArray[197] = false;
        blArray[198] = false;
        blArray[199] = true;
        blArray[200] = true;
        blArray[201] = false;
        blArray[202] = false;
        blArray[203] = true;
        blArray[204] = false;
        blArray[205] = true;
        blArray[206] = true;
        blArray[207] = false;
        blArray[208] = true;
        blArray[209] = false;
        blArray[210] = false;
        blArray[211] = true;
        blArray[212] = false;
        blArray[213] = true;
        blArray[214] = true;
        blArray[215] = false;
        blArray[216] = false;
        blArray[217] = true;
        blArray[218] = true;
        blArray[219] = false;
        blArray[220] = true;
        blArray[221] = false;
        blArray[222] = false;
        blArray[223] = true;
        blArray[224] = true;
        blArray[225] = false;
        blArray[226] = false;
        blArray[227] = true;
        blArray[228] = false;
        blArray[229] = true;
        blArray[230] = true;
        blArray[231] = false;
        blArray[232] = false;
        blArray[233] = true;
        blArray[234] = true;
        blArray[235] = false;
        blArray[236] = true;
        blArray[237] = false;
        blArray[238] = false;
        blArray[239] = true;
        blArray[240] = false;
        blArray[241] = true;
        blArray[242] = true;
        blArray[243] = false;
        blArray[244] = true;
        blArray[245] = false;
        blArray[246] = false;
        blArray[247] = true;
        blArray[248] = true;
        blArray[249] = false;
        blArray[250] = false;
        blArray[251] = true;
        blArray[252] = false;
        blArray[253] = true;
        blArray[254] = true;
        blArray[255] = false;
        cfr_renamed_0 = blArray;
        short[] sArray = new short[256];
        sArray[0] = 0;
        sArray[1] = 1;
        sArray[2] = 4;
        sArray[3] = 5;
        sArray[4] = 16;
        sArray[5] = 17;
        sArray[6] = 20;
        sArray[7] = 21;
        sArray[8] = 64;
        sArray[9] = 65;
        sArray[10] = 68;
        sArray[11] = 69;
        sArray[12] = 80;
        sArray[13] = 81;
        sArray[14] = 84;
        sArray[15] = 85;
        sArray[16] = 256;
        sArray[17] = 257;
        sArray[18] = 260;
        sArray[19] = 261;
        sArray[20] = 272;
        sArray[21] = 273;
        sArray[22] = 276;
        sArray[23] = 277;
        sArray[24] = 320;
        sArray[25] = 321;
        sArray[26] = 324;
        sArray[27] = 325;
        sArray[28] = 336;
        sArray[29] = 337;
        sArray[30] = 340;
        sArray[31] = 341;
        sArray[32] = 1024;
        sArray[33] = 1025;
        sArray[34] = 1028;
        sArray[35] = 1029;
        sArray[36] = 1040;
        sArray[37] = 1041;
        sArray[38] = 1044;
        sArray[39] = 1045;
        sArray[40] = 1088;
        sArray[41] = 1089;
        sArray[42] = 1092;
        sArray[43] = 1093;
        sArray[44] = 1104;
        sArray[45] = 1105;
        sArray[46] = 1108;
        sArray[47] = 1109;
        sArray[48] = 1280;
        sArray[49] = 1281;
        sArray[50] = 1284;
        sArray[51] = 1285;
        sArray[52] = 1296;
        sArray[53] = 1297;
        sArray[54] = 1300;
        sArray[55] = 1301;
        sArray[56] = 1344;
        sArray[57] = 1345;
        sArray[58] = 1348;
        sArray[59] = 1349;
        sArray[60] = 1360;
        sArray[61] = 1361;
        sArray[62] = 1364;
        sArray[63] = 1365;
        sArray[64] = 4096;
        sArray[65] = 4097;
        sArray[66] = 4100;
        sArray[67] = 4101;
        sArray[68] = 4112;
        sArray[69] = 4113;
        sArray[70] = 4116;
        sArray[71] = 4117;
        sArray[72] = 4160;
        sArray[73] = 4161;
        sArray[74] = 4164;
        sArray[75] = 4165;
        sArray[76] = 4176;
        sArray[77] = 4177;
        sArray[78] = 4180;
        sArray[79] = 4181;
        sArray[80] = 4352;
        sArray[81] = 4353;
        sArray[82] = 4356;
        sArray[83] = 4357;
        sArray[84] = 4368;
        sArray[85] = 4369;
        sArray[86] = 4372;
        sArray[87] = 4373;
        sArray[88] = 4416;
        sArray[89] = 4417;
        sArray[90] = 4420;
        sArray[91] = 4421;
        sArray[92] = 4432;
        sArray[93] = 4433;
        sArray[94] = 4436;
        sArray[95] = 4437;
        sArray[96] = 5120;
        sArray[97] = 5121;
        sArray[98] = 5124;
        sArray[99] = 5125;
        sArray[100] = 5136;
        sArray[101] = 5137;
        sArray[102] = 5140;
        sArray[103] = 5141;
        sArray[104] = 5184;
        sArray[105] = 5185;
        sArray[106] = 5188;
        sArray[107] = 5189;
        sArray[108] = 5200;
        sArray[109] = 5201;
        sArray[110] = 5204;
        sArray[111] = 5205;
        sArray[112] = 5376;
        sArray[113] = 5377;
        sArray[114] = 5380;
        sArray[115] = 5381;
        sArray[116] = 5392;
        sArray[117] = 5393;
        sArray[118] = 5396;
        sArray[119] = 5397;
        sArray[120] = 5440;
        sArray[121] = 5441;
        sArray[122] = 5444;
        sArray[123] = 5445;
        sArray[124] = 5456;
        sArray[125] = 5457;
        sArray[126] = 5460;
        sArray[127] = 5461;
        sArray[128] = 16384;
        sArray[129] = 16385;
        sArray[130] = 16388;
        sArray[131] = 16389;
        sArray[132] = 16400;
        sArray[133] = 16401;
        sArray[134] = 16404;
        sArray[135] = 16405;
        sArray[136] = 16448;
        sArray[137] = 16449;
        sArray[138] = 16452;
        sArray[139] = 16453;
        sArray[140] = 16464;
        sArray[141] = 16465;
        sArray[142] = 16468;
        sArray[143] = 16469;
        sArray[144] = 16640;
        sArray[145] = 16641;
        sArray[146] = 16644;
        sArray[147] = 16645;
        sArray[148] = 16656;
        sArray[149] = 16657;
        sArray[150] = 16660;
        sArray[151] = 16661;
        sArray[152] = 16704;
        sArray[153] = 16705;
        sArray[154] = 16708;
        sArray[155] = 16709;
        sArray[156] = 16720;
        sArray[157] = 16721;
        sArray[158] = 16724;
        sArray[159] = 16725;
        sArray[160] = 17408;
        sArray[161] = 17409;
        sArray[162] = 17412;
        sArray[163] = 17413;
        sArray[164] = 17424;
        sArray[165] = 17425;
        sArray[166] = 17428;
        sArray[167] = 17429;
        sArray[168] = 17472;
        sArray[169] = 17473;
        sArray[170] = 17476;
        sArray[171] = 17477;
        sArray[172] = 17488;
        sArray[173] = 17489;
        sArray[174] = 17492;
        sArray[175] = 17493;
        sArray[176] = 17664;
        sArray[177] = 17665;
        sArray[178] = 17668;
        sArray[179] = 17669;
        sArray[180] = 17680;
        sArray[181] = 17681;
        sArray[182] = 17684;
        sArray[183] = 17685;
        sArray[184] = 17728;
        sArray[185] = 17729;
        sArray[186] = 17732;
        sArray[187] = 17733;
        sArray[188] = 17744;
        sArray[189] = 17745;
        sArray[190] = 17748;
        sArray[191] = 17749;
        sArray[192] = 20480;
        sArray[193] = 20481;
        sArray[194] = 20484;
        sArray[195] = 20485;
        sArray[196] = 20496;
        sArray[197] = 20497;
        sArray[198] = 20500;
        sArray[199] = 20501;
        sArray[200] = 20544;
        sArray[201] = 20545;
        sArray[202] = 20548;
        sArray[203] = 20549;
        sArray[204] = 20560;
        sArray[205] = 20561;
        sArray[206] = 20564;
        sArray[207] = 20565;
        sArray[208] = 20736;
        sArray[209] = 20737;
        sArray[210] = 20740;
        sArray[211] = 20741;
        sArray[212] = 20752;
        sArray[213] = 20753;
        sArray[214] = 20756;
        sArray[215] = 20757;
        sArray[216] = 20800;
        sArray[217] = 20801;
        sArray[218] = 20804;
        sArray[219] = 20805;
        sArray[220] = 20816;
        sArray[221] = 20817;
        sArray[222] = 20820;
        sArray[223] = 20821;
        sArray[224] = 21504;
        sArray[225] = 21505;
        sArray[226] = 21508;
        sArray[227] = 21509;
        sArray[228] = 21520;
        sArray[229] = 21521;
        sArray[230] = 21524;
        sArray[231] = 21525;
        sArray[232] = 21568;
        sArray[233] = 21569;
        sArray[234] = 21572;
        sArray[235] = 21573;
        sArray[236] = 21584;
        sArray[237] = 21585;
        sArray[238] = 21588;
        sArray[239] = 21589;
        sArray[240] = 21760;
        sArray[241] = 21761;
        sArray[242] = 21764;
        sArray[243] = 21765;
        sArray[244] = 21776;
        sArray[245] = 21777;
        sArray[246] = 21780;
        sArray[247] = 21781;
        sArray[248] = 21824;
        sArray[249] = 21825;
        sArray[250] = 21828;
        sArray[251] = 21829;
        sArray[252] = 21840;
        sArray[253] = 21841;
        sArray[254] = 21844;
        sArray[255] = 21845;
        cfr_renamed_91 = sArray;
        int[] nArray = new int[33];
        nArray[0] = 1;
        nArray[1] = 2;
        nArray[2] = 4;
        nArray[3] = 8;
        nArray[4] = 16;
        nArray[5] = 32;
        nArray[6] = 64;
        nArray[7] = 128;
        nArray[8] = 256;
        nArray[9] = 512;
        nArray[10] = 1024;
        nArray[11] = 2048;
        nArray[12] = 4096;
        nArray[13] = 8192;
        nArray[14] = 16384;
        nArray[15] = 32768;
        nArray[16] = 65536;
        nArray[17] = 131072;
        nArray[18] = 262144;
        nArray[19] = 524288;
        nArray[20] = 0x100000;
        nArray[21] = 0x200000;
        nArray[22] = 0x400000;
        nArray[23] = 0x800000;
        nArray[24] = 0x1000000;
        nArray[25] = 0x2000000;
        nArray[26] = 0x4000000;
        nArray[27] = 0x8000000;
        nArray[28] = 0x10000000;
        nArray[29] = 0x20000000;
        nArray[30] = 0x40000000;
        nArray[31] = Integer.MIN_VALUE;
        nArray[32] = 0;
        cfr_renamed_119 = nArray;
        int[] nArray2 = new int[33];
        nArray2[0] = 0;
        nArray2[1] = 1;
        nArray2[2] = 3;
        nArray2[3] = 7;
        nArray2[4] = 15;
        nArray2[5] = 31;
        nArray2[6] = 63;
        nArray2[7] = 127;
        nArray2[8] = 255;
        nArray2[9] = 511;
        nArray2[10] = 1023;
        nArray2[11] = 2047;
        nArray2[12] = 4095;
        nArray2[13] = 8191;
        nArray2[14] = 16383;
        nArray2[15] = Short.MAX_VALUE;
        nArray2[16] = 65535;
        nArray2[17] = 131071;
        nArray2[18] = 262143;
        nArray2[19] = 524287;
        nArray2[20] = 1048575;
        nArray2[21] = 0x1FFFFF;
        nArray2[22] = 0x3FFFFF;
        nArray2[23] = 0x7FFFFF;
        nArray2[24] = 0xFFFFFF;
        nArray2[25] = 0x1FFFFFF;
        nArray2[26] = 0x3FFFFFF;
        nArray2[27] = 0x7FFFFFF;
        nArray2[28] = 0xFFFFFFF;
        nArray2[29] = 0x1FFFFFFF;
        nArray2[30] = 0x3FFFFFFF;
        nArray2[31] = Integer.MAX_VALUE;
        nArray2[32] = -1;
        cfr_renamed_112 = nArray2;
    }

    /*
     * WARNING - void declaration
     */
    public spragf(spragf spragf2) {
        void arg0;
        spragf spragf3 = this;
        void v1 = arg0;
        this.cfr_renamed_4 = v1.cfr_renamed_4;
        spragf3.cfr_renamed_2 = v1.cfr_renamed_2;
        spragf3.cfr_renamed_1 = sprydf.cfr_renamed_535(spragf2.cfr_renamed_1);
    }

    public spragf cfr_renamed_1007() {
        int n;
        spragf spragf2 = new spragf(this.cfr_renamed_4 + 1, this.cfr_renamed_1);
        int n2 = n = spragf2.cfr_renamed_2 - 1;
        while (n2 >= 1) {
            spragf spragf3 = spragf2;
            int n3 = n;
            spragf3.cfr_renamed_1[n3] = spragf3.cfr_renamed_1[n3] << 1;
            int n4 = n;
            int n5 = spragf3.cfr_renamed_1[n4] | spragf2.cfr_renamed_1[n - 1] >>> 31;
            spragf3.cfr_renamed_1[n4] = n5;
            n2 = --n;
        }
        spragf spragf4 = spragf2;
        spragf4.cfr_renamed_1[0] = spragf4.cfr_renamed_1[0] << 1;
        return spragf4;
    }

    public void cfr_renamed_978() {
        int n;
        spragf spragf2 = this;
        for (n = (v756105).cfr_renamed_2 - 1; spragf2.cfr_renamed_1[n] == 0 && n > 0; --n) {
            spragf2 = this;
        }
        int n2 = this.cfr_renamed_1[n];
        int n3 = 0;
        int n4 = n2;
        while (n4 != 0) {
            ++n3;
            n4 = n2 >>>= 1;
        }
        spragf spragf3 = this;
        int n5 = n;
        spragf3.cfr_renamed_4 = (n5 << 5) + n3;
        spragf3.cfr_renamed_2 = n5 + 1;
    }

    public int[] cfr_renamed_1009() {
        spragf spragf2 = this;
        int[] nArray = new int[spragf2.cfr_renamed_2];
        System.arraycopy(spragf2.cfr_renamed_1, 0, nArray, 0, this.cfr_renamed_2);
        return nArray;
    }

    private static /* synthetic */ int[] cfr_renamed_985(int[] arg0, int[] arg1) {
        int[] nArray = new int[32];
        int[] nArray2 = new int[8];
        System.arraycopy(arg0, 0, nArray2, 0, Math.min(8, arg0.length));
        int[] nArray3 = new int[8];
        if (arg0.length > 8) {
            System.arraycopy(arg0, 8, nArray3, 0, Math.min(8, arg0.length - 8));
        }
        int[] nArray4 = new int[8];
        System.arraycopy(arg1, 0, nArray4, 0, Math.min(8, arg1.length));
        int[] nArray5 = new int[8];
        if (arg1.length > 8) {
            System.arraycopy(arg1, 8, nArray5, 0, Math.min(8, arg1.length - 8));
        }
        int[] nArray6 = nArray3;
        int[] nArray7 = nArray3;
        int[] nArray8 = spragf.cfr_renamed_968(nArray6, nArray5);
        int[] nArray9 = nArray;
        int[] nArray10 = nArray;
        int[] nArray11 = nArray;
        int[] nArray12 = nArray;
        int[] nArray13 = nArray;
        int[] nArray14 = nArray;
        int[] nArray15 = nArray;
        int[] nArray16 = nArray;
        int[] nArray17 = nArray;
        int[] nArray18 = nArray;
        int[] nArray19 = nArray;
        int[] nArray20 = nArray;
        int[] nArray21 = nArray;
        int[] nArray22 = nArray;
        int[] nArray23 = nArray;
        int[] nArray24 = nArray;
        int[] nArray25 = nArray;
        int[] nArray26 = nArray;
        int[] nArray27 = nArray;
        int[] nArray28 = nArray;
        int[] nArray29 = nArray;
        int[] nArray30 = nArray;
        int[] nArray31 = nArray;
        int[] nArray32 = nArray;
        nArray31[31] = nArray31[31] ^ nArray8[15];
        nArray32[30] = nArray32[30] ^ nArray8[14];
        nArray29[29] = nArray29[29] ^ nArray8[13];
        nArray30[28] = nArray30[28] ^ nArray8[12];
        nArray27[27] = nArray27[27] ^ nArray8[11];
        nArray28[26] = nArray28[26] ^ nArray8[10];
        nArray25[25] = nArray25[25] ^ nArray8[9];
        nArray26[24] = nArray26[24] ^ nArray8[8];
        nArray23[23] = nArray23[23] ^ (nArray8[7] ^ nArray8[15]);
        nArray24[22] = nArray24[22] ^ (nArray8[6] ^ nArray8[14]);
        nArray21[21] = nArray21[21] ^ (nArray8[5] ^ nArray8[13]);
        nArray22[20] = nArray22[20] ^ (nArray8[4] ^ nArray8[12]);
        nArray19[19] = nArray19[19] ^ (nArray8[3] ^ nArray8[11]);
        nArray20[18] = nArray20[18] ^ (nArray8[2] ^ nArray8[10]);
        nArray17[17] = nArray17[17] ^ (nArray8[1] ^ nArray8[9]);
        nArray18[16] = nArray18[16] ^ (nArray8[0] ^ nArray8[8]);
        nArray15[15] = nArray15[15] ^ nArray8[7];
        nArray16[14] = nArray16[14] ^ nArray8[6];
        nArray13[13] = nArray13[13] ^ nArray8[5];
        nArray14[12] = nArray14[12] ^ nArray8[4];
        nArray11[11] = nArray11[11] ^ nArray8[3];
        nArray12[10] = nArray12[10] ^ nArray8[2];
        nArray9[9] = nArray9[9] ^ nArray8[1];
        nArray10[8] = nArray10[8] ^ nArray8[0];
        nArray7[0] = nArray7[0] ^ nArray2[0];
        nArray6[1] = nArray6[1] ^ nArray2[1];
        nArray7[2] = nArray7[2] ^ nArray2[2];
        nArray6[3] = nArray6[3] ^ nArray2[3];
        nArray7[4] = nArray7[4] ^ nArray2[4];
        nArray6[5] = nArray6[5] ^ nArray2[5];
        nArray7[6] = nArray7[6] ^ nArray2[6];
        nArray6[7] = nArray6[7] ^ nArray2[7];
        int[] nArray33 = nArray5;
        int[] nArray34 = nArray5;
        int[] nArray35 = nArray5;
        int[] nArray36 = nArray5;
        int[] nArray37 = nArray5;
        int[] nArray38 = nArray5;
        int[] nArray39 = nArray5;
        int[] nArray40 = nArray5;
        nArray39[0] = nArray39[0] ^ nArray4[0];
        nArray40[1] = nArray40[1] ^ nArray4[1];
        nArray37[2] = nArray37[2] ^ nArray4[2];
        nArray38[3] = nArray38[3] ^ nArray4[3];
        nArray35[4] = nArray35[4] ^ nArray4[4];
        nArray36[5] = nArray36[5] ^ nArray4[5];
        nArray33[6] = nArray33[6] ^ nArray4[6];
        nArray34[7] = nArray34[7] ^ nArray4[7];
        int[] nArray41 = spragf.cfr_renamed_968(nArray7, nArray33);
        int[] nArray42 = nArray;
        int[] nArray43 = nArray;
        int[] nArray44 = nArray;
        int[] nArray45 = nArray;
        int[] nArray46 = nArray;
        int[] nArray47 = nArray;
        int[] nArray48 = nArray;
        int[] nArray49 = nArray;
        int[] nArray50 = nArray;
        int[] nArray51 = nArray;
        int[] nArray52 = nArray;
        int[] nArray53 = nArray;
        int[] nArray54 = nArray;
        int[] nArray55 = nArray;
        int[] nArray56 = nArray;
        int[] nArray57 = nArray;
        int[] nArray58 = nArray;
        int[] nArray59 = nArray;
        nArray[23] = nArray[23] ^ nArray41[15];
        nArray58[22] = nArray58[22] ^ nArray41[14];
        nArray59[21] = nArray59[21] ^ nArray41[13];
        nArray56[20] = nArray56[20] ^ nArray41[12];
        nArray57[19] = nArray57[19] ^ nArray41[11];
        nArray54[18] = nArray54[18] ^ nArray41[10];
        nArray55[17] = nArray55[17] ^ nArray41[9];
        nArray52[16] = nArray52[16] ^ nArray41[8];
        nArray53[15] = nArray53[15] ^ nArray41[7];
        nArray50[14] = nArray50[14] ^ nArray41[6];
        nArray51[13] = nArray51[13] ^ nArray41[5];
        nArray48[12] = nArray48[12] ^ nArray41[4];
        nArray49[11] = nArray49[11] ^ nArray41[3];
        nArray46[10] = nArray46[10] ^ nArray41[2];
        nArray47[9] = nArray47[9] ^ nArray41[1];
        nArray44[8] = nArray44[8] ^ nArray41[0];
        int[] nArray60 = spragf.cfr_renamed_968(nArray2, nArray4);
        nArray45[23] = nArray45[23] ^ nArray60[15];
        nArray42[22] = nArray42[22] ^ nArray60[14];
        nArray43[21] = nArray43[21] ^ nArray60[13];
        nArray42[20] = nArray42[20] ^ nArray60[12];
        nArray43[19] = nArray43[19] ^ nArray60[11];
        nArray42[18] = nArray42[18] ^ nArray60[10];
        nArray43[17] = nArray43[17] ^ nArray60[9];
        nArray42[16] = nArray42[16] ^ nArray60[8];
        nArray43[15] = nArray43[15] ^ (nArray60[7] ^ nArray60[15]);
        nArray42[14] = nArray42[14] ^ (nArray60[6] ^ nArray60[14]);
        nArray43[13] = nArray43[13] ^ (nArray60[5] ^ nArray60[13]);
        nArray42[12] = nArray42[12] ^ (nArray60[4] ^ nArray60[12]);
        nArray43[11] = nArray43[11] ^ (nArray60[3] ^ nArray60[11]);
        nArray42[10] = nArray42[10] ^ (nArray60[2] ^ nArray60[10]);
        nArray43[9] = nArray43[9] ^ (nArray60[1] ^ nArray60[9]);
        nArray42[8] = nArray42[8] ^ (nArray60[0] ^ nArray60[8]);
        nArray43[7] = nArray43[7] ^ nArray60[7];
        nArray42[6] = nArray42[6] ^ nArray60[6];
        nArray43[5] = nArray43[5] ^ nArray60[5];
        nArray42[4] = nArray42[4] ^ nArray60[4];
        nArray43[3] = nArray43[3] ^ nArray60[3];
        nArray42[2] = nArray42[2] ^ nArray60[2];
        nArray43[1] = nArray43[1] ^ nArray60[1];
        nArray42[0] = nArray42[0] ^ nArray60[0];
        return nArray43;
    }

    public spragf(int n) {
        int n2 = n;
        if (n2 < 1) {
            n2 = 1;
        }
        this.cfr_renamed_2 = (n2 - 1 >> 5) + 1;
        this.cfr_renamed_1 = new int[this.cfr_renamed_2];
        this.cfr_renamed_4 = n2;
    }

    public void cfr_renamed_986() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            this.cfr_renamed_1[n++] = 0;
            n2 = n;
        }
    }

    private /* synthetic */ spragf cfr_renamed_5503(spragf arg0) {
        spragf spragf2 = new spragf(this.cfr_renamed_4 << 1);
        if (this.cfr_renamed_4 <= 32) {
            spragf2.cfr_renamed_1 = spragf.cfr_renamed_969(this.cfr_renamed_1[0], arg0.cfr_renamed_1[0]);
            return spragf2;
        }
        if (this.cfr_renamed_4 <= 64) {
            spragf2.cfr_renamed_1 = spragf.cfr_renamed_970(this.cfr_renamed_1, arg0.cfr_renamed_1);
            return spragf2;
        }
        if (this.cfr_renamed_4 <= 128) {
            spragf2.cfr_renamed_1 = spragf.cfr_renamed_971(this.cfr_renamed_1, arg0.cfr_renamed_1);
            return spragf2;
        }
        if (this.cfr_renamed_4 <= 256) {
            spragf2.cfr_renamed_1 = spragf.cfr_renamed_968(this.cfr_renamed_1, arg0.cfr_renamed_1);
            return spragf2;
        }
        if (this.cfr_renamed_4 <= 512) {
            spragf2.cfr_renamed_1 = spragf.cfr_renamed_985(this.cfr_renamed_1, arg0.cfr_renamed_1);
            return spragf2;
        }
        spragf spragf3 = this;
        int n = sproef.cfr_renamed_921(spragf3.cfr_renamed_4 - 1);
        n = cfr_renamed_119[n];
        spragf spragf4 = spragf3.cfr_renamed_991((n - 1 >> 5) + 1);
        spragf spragf5 = spragf3.cfr_renamed_976((n - 1 >> 5) + 1);
        spragf spragf6 = arg0;
        spragf spragf7 = spragf6.cfr_renamed_991((n - 1 >> 5) + 1);
        spragf spragf8 = spragf6.cfr_renamed_976((n - 1 >> 5) + 1);
        spragf spragf9 = spragf5.cfr_renamed_5503(spragf8);
        spragf spragf10 = spragf4;
        spragf spragf11 = spragf10.cfr_renamed_5503(spragf7);
        spragf10.cfr_renamed_5501(spragf5);
        spragf spragf12 = spragf7;
        spragf12.cfr_renamed_5501(spragf8);
        spragf spragf13 = spragf10.cfr_renamed_5503(spragf12);
        spragf spragf14 = spragf2;
        int n2 = n;
        spragf spragf15 = spragf2;
        spragf15.cfr_renamed_5500(spragf9, n << 1);
        spragf15.cfr_renamed_5500(spragf9, n);
        spragf2.cfr_renamed_5500(spragf13, n2);
        spragf14.cfr_renamed_5500(spragf11, n2);
        spragf14.cfr_renamed_5501(spragf11);
        return spragf14;
    }

    public void cfr_renamed_999() {
        int n;
        if (this.cfr_renamed_805()) {
            return;
        }
        if (this.cfr_renamed_1.length >= this.cfr_renamed_2 << 1) {
            int n2;
            int n3 = n2 = this.cfr_renamed_2 - 1;
            while (n3 >= 0) {
                spragf spragf2 = this;
                spragf2.cfr_renamed_1[(n2 << 1) + 1] = cfr_renamed_91[(this.cfr_renamed_1[n2] & 0xFF0000) >>> 16] | cfr_renamed_91[(this.cfr_renamed_1[n2] & 0xFF000000) >>> 24] << 16;
                int n4 = n2 << 1;
                int n5 = cfr_renamed_91[this.cfr_renamed_1[n2] & 0xFF] | cfr_renamed_91[(this.cfr_renamed_1[n2] & 0xFF00) >>> 8] << 16;
                spragf2.cfr_renamed_1[n4] = n5;
                n3 = --n2;
            }
            spragf spragf3 = this;
            spragf3.cfr_renamed_2 <<= 1;
            spragf3.cfr_renamed_4 = (spragf3.cfr_renamed_4 << 1) - 1;
            return;
        }
        int[] nArray = new int[this.cfr_renamed_2 << 1];
        int n6 = n = 0;
        while (n6 < this.cfr_renamed_2) {
            nArray[n << 1] = cfr_renamed_91[this.cfr_renamed_1[n] & 0xFF] | cfr_renamed_91[(this.cfr_renamed_1[n] & 0xFF00) >>> 8] << 16;
            int n7 = (n << 1) + 1;
            int n8 = cfr_renamed_91[(this.cfr_renamed_1[n] & 0xFF0000) >>> 16] | cfr_renamed_91[(this.cfr_renamed_1[n] & 0xFF000000) >>> 24] << 16;
            nArray[n7] = n8;
            n6 = ++n;
        }
        this.cfr_renamed_1 = null;
        this.cfr_renamed_1 = nArray;
        this.cfr_renamed_2 <<= 1;
        this.cfr_renamed_4 = (this.cfr_renamed_4 << 1) - 1;
    }

    /*
     * WARNING - void declaration
     */
    public spragf(int n, int[] nArray) {
        void arg1;
        int n2 = n;
        if (n2 < 1) {
            n2 = 1;
        }
        this.cfr_renamed_2 = (n2 - 1 >> 5) + 1;
        this.cfr_renamed_1 = new int[this.cfr_renamed_2];
        this.cfr_renamed_4 = n2;
        int n3 = Math.min(this.cfr_renamed_2, ((void)arg1).length);
        spragf spragf2 = this;
        System.arraycopy(arg1, 0, spragf2.cfr_renamed_1, 0, n3);
        spragf2.cfr_renamed_975();
    }

    public void cfr_renamed_1004(int arg0, int arg1) {
        long l;
        int n;
        int n2 = arg0 >>> 5;
        int n3 = 32 - (arg0 & 0x1F);
        int n4 = arg0 - arg1 >>> 5;
        int n5 = 32 - (arg0 - arg1 & 0x1F);
        int n6 = (arg0 << 1) - 2 >>> 5;
        int n7 = n2;
        int n8 = n = n6;
        while (n8 > n7) {
            spragf spragf2 = this;
            l = (long)spragf2.cfr_renamed_1[n] & 0xFFFFFFFFL;
            int n9 = n - n2 - 1;
            spragf2.cfr_renamed_1[n9] = spragf2.cfr_renamed_1[n9] ^ (int)(l << n3);
            int n10 = n - n2;
            spragf2.cfr_renamed_1[n10] = (int)((long)spragf2.cfr_renamed_1[n10] ^ l >>> 32 - n3);
            int n11 = n - n4 - 1;
            spragf2.cfr_renamed_1[n11] = spragf2.cfr_renamed_1[n11] ^ (int)(l << n5);
            int n12 = n - n4;
            spragf2.cfr_renamed_1[n12] = (int)((long)spragf2.cfr_renamed_1[n12] ^ l >>> 32 - n5);
            spragf2.cfr_renamed_1[n--] = 0;
            n8 = n;
        }
        spragf spragf3 = this;
        l = (long)spragf3.cfr_renamed_1[n7] & 0xFFFFFFFFL & 0xFFFFFFFFL << (arg0 & 0x1F);
        spragf3.cfr_renamed_1[0] = (int)((long)spragf3.cfr_renamed_1[0] ^ l >>> 32 - n3);
        if (n7 - n4 - 1 >= 0) {
            int n13 = n7 - n4 - 1;
            this.cfr_renamed_1[n13] = this.cfr_renamed_1[n13] ^ (int)(l << n5);
        }
        spragf spragf4 = this;
        int n14 = arg0;
        spragf spragf5 = this;
        int n15 = n7 - n4;
        spragf5.cfr_renamed_1[n15] = (int)((long)spragf5.cfr_renamed_1[n15] ^ l >>> 32 - n5);
        int n16 = n7;
        spragf5.cfr_renamed_1[n16] = spragf5.cfr_renamed_1[n16] & cfr_renamed_112[arg0 & 0x1F];
        spragf4.cfr_renamed_2 = (n14 - 1 >>> 5) + 1;
        spragf4.cfr_renamed_4 = n14;
    }

    public Object clone() {
        return new spragf(this);
    }
}

