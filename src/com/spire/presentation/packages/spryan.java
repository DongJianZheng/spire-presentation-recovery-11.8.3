/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbkn;
import com.spire.presentation.packages.sprfica;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprph;
import com.spire.presentation.packages.sprsrg;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprxxm;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class spryan
extends InputStream
implements sprph {
    private final sprxxm cfr_renamed_1228;
    private static final int cfr_renamed_1260 = 4;
    private int cfr_renamed_499;
    private int[] cfr_renamed_135;
    public int cfr_renamed_956;
    public int cfr_renamed_952;
    private int[][] cfr_renamed_728;
    public int cfr_renamed_128;
    private int cfr_renamed_957;
    private int cfr_renamed_314;
    private int[] cfr_renamed_951;
    private int cfr_renamed_84;
    public int cfr_renamed_723;
    private byte[] cfr_renamed_1226;
    private int cfr_renamed_287;
    public int cfr_renamed_724;
    public int cfr_renamed_953;
    public int cfr_renamed_133;
    private static final int cfr_renamed_185 = 1;
    private int[][] spr\ufe34;
    private InputStream cfr_renamed_82;
    private byte[] cfr_renamed_126;
    private int cfr_renamed_88;
    private boolean cfr_renamed_31;
    private static final int cfr_renamed_272 = 3;
    public int cfr_renamed_145;
    public int cfr_renamed_114;
    private int cfr_renamed_96;
    private int cfr_renamed_105;
    private int cfr_renamed_137;
    private static final int cfr_renamed_79 = 2;
    private int cfr_renamed_107;
    public int cfr_renamed_132;
    private int cfr_renamed_102;
    private int[] cfr_renamed_2;
    private int[][] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    private /* synthetic */ int cfr_renamed_11533(int arg0) throws IOException {
        if (this.cfr_renamed_957 < arg0) {
            spryan spryan2 = this;
            this.cfr_renamed_137 = this.cfr_renamed_137 << 8 | spryan2.cfr_renamed_11534();
            spryan2.cfr_renamed_957 += 8;
        }
        spryan spryan3 = this;
        spryan3.cfr_renamed_957 -= arg0;
        return spryan3.cfr_renamed_137 >>> this.cfr_renamed_957 & (1 << arg0) - 1;
    }

    private /* synthetic */ void cfr_renamed_11535() throws IOException {
        long l = this.cfr_renamed_11536();
        if (l != 54156738319193L) {
            if (l != 25779555029136L) {
                throw new IOException(sprfica.cfr_renamed_9("m\u001f@\u0010DSG\u0016N\u0017J\u0001\u000f\u0016]\u0001@\u0001"));
            }
            spryan spryan2 = this;
            spryan2.cfr_renamed_88 = spryan2.cfr_renamed_4987();
            if (spryan2.cfr_renamed_88 != this.cfr_renamed_105) {
                throw new IOException(sprbkn.cfr_renamed_9("y\u0017X\u0006K\u000e\n x \n\u0006X\u0011E\u0011"));
            }
            this.cfr_renamed_4965();
            this.cfr_renamed_31 = true;
            return;
        }
        spryan spryan3 = this;
        spryan3.cfr_renamed_102 = spryan3.cfr_renamed_4987();
        boolean bl = spryan3.cfr_renamed_11537() == 1;
        spryan spryan4 = this;
        spryan spryan5 = spryan4;
        this.cfr_renamed_4988();
        spryan4.cfr_renamed_1228.cfr_renamed_11521();
        int[] nArray = new int[257];
        int[] nArray2 = nArray;
        nArray[0] = 0;
        int n = 0;
        spryan4.cfr_renamed_132 = 0;
        while (spryan5.cfr_renamed_132 < 256) {
            spryan spryan6 = this;
            spryan spryan7 = this;
            spryan5 = spryan7;
            nArray2[spryan7.cfr_renamed_132 + 1] = n += spryan6.cfr_renamed_2[spryan6.cfr_renamed_132];
            ++spryan7.cfr_renamed_132;
        }
        if (n != this.cfr_renamed_499 + 1) {
            throw new IllegalStateException();
        }
        spryan spryan8 = this;
        this.cfr_renamed_132 = 0;
        while (spryan8.cfr_renamed_132 <= this.cfr_renamed_499) {
            spryan spryan9 = this;
            int n2 = n = this.cfr_renamed_1226[spryan9.cfr_renamed_132] & 0xFF;
            int n3 = nArray2[n2];
            nArray2[n2] = n3 + 1;
            spryan9.cfr_renamed_951[n3] = this.cfr_renamed_132;
            spryan spryan10 = this;
            spryan8 = spryan10;
            ++spryan10.cfr_renamed_132;
        }
        spryan spryan11 = this;
        this.cfr_renamed_953 = this.cfr_renamed_951[this.cfr_renamed_287];
        spryan11.cfr_renamed_128 = 0;
        spryan11.cfr_renamed_952 = 0;
        this.cfr_renamed_724 = 256;
        if (bl) {
            this.cfr_renamed_956 = 0;
            this.cfr_renamed_114 = 0;
            this.cfr_renamed_4976();
            return;
        }
        this.cfr_renamed_4981();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_11538(int[] nArray, int[] nArray2, int[] nArray3, byte[] byArray, int n, int n2, int n3) {
        void arg5;
        void arg4;
        void var10_10;
        void arg1;
        sproze.cfr_renamed_556((int[])arg1, 0);
        sproze.cfr_renamed_556(nArray, 0);
        int n4 = 0;
        int n5 = 0;
        void v0 = var10_10 = arg4;
        while (v0 <= arg5) {
            void arg6;
            int n6;
            int n7 = n6 = 0;
            while (n7 < arg6) {
                void arg3;
                if ((arg3[n6] & 0xFF) == var10_10) {
                    arg2[n4++] = n6;
                }
                n7 = ++n6;
            }
            arg1[var10_10] = n5;
            int n8 = n5;
            arg0[var10_10] = n8 + n4;
            n5 = n8 + (n5 + n4);
            v0 = ++var10_10;
        }
    }

    private /* synthetic */ void cfr_renamed_4981() throws IOException {
        spryan spryan2 = this;
        if (spryan2.cfr_renamed_952 <= spryan2.cfr_renamed_499) {
            spryan spryan3 = this;
            spryan3.cfr_renamed_145 = spryan3.cfr_renamed_724;
            spryan3.cfr_renamed_724 = spryan3.cfr_renamed_1226[this.cfr_renamed_953] & 0xFF;
            spryan3.cfr_renamed_953 = spryan3.cfr_renamed_951[this.cfr_renamed_953];
            ++spryan3.cfr_renamed_952;
            this.cfr_renamed_84 = spryan3.cfr_renamed_724;
            this.cfr_renamed_107 = 3;
            this.cfr_renamed_1228.cfr_renamed_11084(this.cfr_renamed_724);
            return;
        }
        spryan spryan4 = this;
        spryan4.cfr_renamed_4971();
        spryan4.cfr_renamed_11535();
    }

    private /* synthetic */ void cfr_renamed_4991() throws IOException {
        spryan spryan2 = this;
        if (spryan2.cfr_renamed_723 < spryan2.cfr_renamed_133) {
            spryan spryan3 = this;
            spryan3.cfr_renamed_84 = spryan3.cfr_renamed_724;
            spryan3.cfr_renamed_1228.cfr_renamed_11084(this.cfr_renamed_724);
            ++spryan3.cfr_renamed_723;
            return;
        }
        ++this.cfr_renamed_952;
        this.cfr_renamed_128 = 0;
        this.cfr_renamed_4981();
    }

    private /* synthetic */ void cfr_renamed_4975() throws IOException {
        spryan spryan2 = this;
        if (spryan2.cfr_renamed_723 < spryan2.cfr_renamed_133) {
            spryan spryan3 = this;
            spryan3.cfr_renamed_84 = spryan3.cfr_renamed_724;
            spryan3.cfr_renamed_1228.cfr_renamed_11084(this.cfr_renamed_724);
            ++spryan3.cfr_renamed_723;
            return;
        }
        ++this.cfr_renamed_952;
        this.cfr_renamed_128 = 0;
        this.cfr_renamed_4976();
    }

    private /* synthetic */ void cfr_renamed_4989() throws IOException {
        spryan spryan2 = this;
        if (spryan2.cfr_renamed_724 != spryan2.cfr_renamed_145) {
            this.cfr_renamed_128 = 1;
            this.cfr_renamed_4976();
            return;
        }
        if (++this.cfr_renamed_128 < 4) {
            this.cfr_renamed_4976();
            return;
        }
        spryan spryan3 = this;
        spryan spryan4 = this;
        spryan3.cfr_renamed_133 = spryan3.cfr_renamed_1226[spryan4.cfr_renamed_953] & 0xFF;
        spryan3.cfr_renamed_953 = spryan4.cfr_renamed_951[this.cfr_renamed_953];
        if (spryan3.cfr_renamed_956 == 0) {
            this.cfr_renamed_956 = sprsrg.cfr_renamed_96[this.cfr_renamed_114++];
            this.cfr_renamed_114 &= 0x1FF;
        }
        spryan spryan5 = this;
        --spryan5.cfr_renamed_956;
        spryan5.cfr_renamed_133 = spryan5.cfr_renamed_133 ^ (this.cfr_renamed_956 == 1 ? 1 : 0);
        this.cfr_renamed_723 = 0;
        this.cfr_renamed_107 = 2;
        this.cfr_renamed_4975();
    }

    private /* synthetic */ long cfr_renamed_11536() throws IOException {
        return (long)this.cfr_renamed_11539(24) << 24 | (long)this.cfr_renamed_11539(24);
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_4988() throws IOException {
        int n;
        int n2;
        int n3 = 100000 * this.cfr_renamed_96;
        spryan spryan2 = this;
        spryan2.cfr_renamed_287 = spryan2.cfr_renamed_11539(24);
        if (spryan2.cfr_renamed_287 > 10 + n3) {
            throw new IllegalStateException();
        }
        spryan spryan3 = this;
        int n4 = spryan3.cfr_renamed_4983();
        int n5 = spryan3.cfr_renamed_314 + 2;
        int n6 = spryan3.cfr_renamed_314 + 1;
        int n7 = n2 = 0;
        while (n7 <= 255) {
            this.cfr_renamed_2[n2++] = 0;
            n7 = n2;
        }
        byte[] byArray = new byte[this.cfr_renamed_314];
        int n8 = n2 = 0;
        while (n8 < this.cfr_renamed_314) {
            int n9 = n2++;
            byArray[n9] = this.cfr_renamed_4[n9];
            n8 = n2;
        }
        spryan spryan4 = this;
        this.cfr_renamed_499 = -1;
        int n10 = 0;
        int n11 = 49;
        int n12 = spryan4.cfr_renamed_126[n10] & 0xFF;
        int n13 = this.cfr_renamed_135[n12];
        int[] nArray = spryan4.spr\ufe34[n12];
        int[] nArray2 = spryan4.cfr_renamed_3[n12];
        int[] nArray3 = spryan4.cfr_renamed_728[n12];
        int n14 = n13;
        int n15 = n = spryan4.cfr_renamed_11539(n13);
        while (n15 >= nArray[n14]) {
            if (++n14 > 20) {
                throw new IllegalStateException();
            }
            n15 = n << 1 | this.cfr_renamed_11537();
        }
        int n16 = n - nArray3[n14];
        if (n16 >= n5) {
            throw new IllegalStateException();
        }
        int n17 = nArray2[n16];
        block3: while (true) {
            int n18 = n17;
            while (true) {
                int n19;
                int n20;
                block30: {
                    int n21;
                    block29: {
                        block28: {
                            if (n18 == n6) break block28;
                            if (n17 <= 1) break block29;
                            if (++this.cfr_renamed_499 >= n3) {
                                throw new IllegalStateException(sprbkn.cfr_renamed_9("!F\fI\b\n\f\\\u0006X\u0011_\r"));
                            }
                            n14 = byArray[n17 - 1];
                            spryan spryan5 = this;
                            int n22 = n14 & 0xFF;
                            spryan5.cfr_renamed_2[n22] = spryan5.cfr_renamed_2[n22] + 1;
                            spryan5.cfr_renamed_1226[this.cfr_renamed_499] = n14;
                            if (n17 <= 16) {
                                int n23 = n17 - 1;
                                while (n23 > 0) {
                                    int n24;
                                    byArray[--n24] = byArray[n24 - 1];
                                    n23 = n24;
                                }
                            } else {
                                System.arraycopy(byArray, 0, byArray, 1, n17 - 1);
                            }
                            byArray[0] = n14;
                            if (n11 == 0) {
                                if (++n10 >= n4) {
                                    throw new IllegalStateException();
                                }
                                n11 = 50;
                                spryan spryan6 = this;
                                n12 = spryan6.cfr_renamed_126[n10] & 0xFF;
                                n13 = spryan6.cfr_renamed_135[n12];
                                nArray = spryan6.spr\ufe34[n12];
                                nArray2 = spryan6.cfr_renamed_3[n12];
                                nArray3 = spryan6.cfr_renamed_728[n12];
                            }
                            --n11;
                            n = n13;
                            n20 = this.cfr_renamed_11539(n13);
                            break block30;
                        }
                        spryan spryan7 = this;
                        if (spryan7.cfr_renamed_287 > spryan7.cfr_renamed_499) {
                            throw new IllegalStateException();
                        }
                        n14 = this.cfr_renamed_499 + 1;
                        n = 0;
                        int n25 = n2 = 0;
                        while (n25 <= 255) {
                            n16 = this.cfr_renamed_2[n2];
                            n |= n16;
                            n |= n14 - n16;
                            n25 = ++n2;
                        }
                        if (n < 0) {
                            throw new IllegalStateException();
                        }
                        return;
                    }
                    n14 = 1;
                    n = 0;
                    do {
                        if (n14 > 0x100000) {
                            throw new IllegalStateException();
                        }
                        n += n14 << n17;
                        n14 <<= 1;
                        if (n11 == 0) {
                            if (++n10 >= n4) {
                                throw new IllegalStateException();
                            }
                            n11 = 50;
                            spryan spryan8 = this;
                            n12 = spryan8.cfr_renamed_126[n10] & 0xFF;
                            n13 = spryan8.cfr_renamed_135[n12];
                            nArray = spryan8.spr\ufe34[n12];
                            nArray2 = spryan8.cfr_renamed_3[n12];
                            nArray3 = spryan8.cfr_renamed_728[n12];
                        }
                        --n11;
                        n16 = n13;
                        int n26 = this.cfr_renamed_11539(n13);
                        while (n26 >= nArray[n16]) {
                            if (++n16 > 20) {
                                throw new IllegalStateException();
                            }
                            n26 = n19 << 1 | this.cfr_renamed_11537();
                        }
                        n21 = n19 - nArray3[n16];
                        if (n21 < n5) continue;
                        throw new IllegalStateException();
                    } while ((n17 = nArray2[n21]) <= 1);
                    n16 = byArray[0];
                    int n27 = n16 & 0xFF;
                    this.cfr_renamed_2[n27] = this.cfr_renamed_2[n27] + n;
                    if (this.cfr_renamed_499 >= n3 - n) {
                        throw new IllegalStateException(sprfica.cfr_renamed_9("1C\u001cL\u0018\u000f\u001cY\u0016]\u0001Z\u001d"));
                    }
                    while (true) {
                        if (--n < 0) continue block3;
                        this.cfr_renamed_1226[++this.cfr_renamed_499] = n16;
                    }
                }
                while (n20 >= nArray[n]) {
                    if (++n > 20) {
                        throw new IllegalStateException();
                    }
                    n20 = n16 << 1 | this.cfr_renamed_11537();
                }
                n19 = n16 - nArray3[n];
                if (n19 >= n5) {
                    throw new IllegalStateException();
                }
                n18 = nArray2[n19];
            }
            break;
        }
    }

    private /* synthetic */ int cfr_renamed_4987() throws IOException {
        return this.cfr_renamed_11539(16) << 16 | this.cfr_renamed_11539(16);
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ int cfr_renamed_4983() throws IOException {
        int n;
        int n2;
        int n3;
        int n4;
        this.cfr_renamed_314 = 0;
        int n5 = this.cfr_renamed_11539(16);
        int n6 = n4 = 0;
        while (n6 < 16) {
            if ((n5 & 32768 >>> n4) != 0) {
                int n7;
                n3 = this.cfr_renamed_11539(16);
                n2 = n4 * 16;
                int n8 = n7 = 0;
                while (n8 < 16) {
                    if ((n3 & 32768 >>> n7) != 0) {
                        this.cfr_renamed_4[this.cfr_renamed_314++] = (byte)(n2 + n7);
                    }
                    n8 = ++n7;
                }
            }
            n6 = ++n4;
        }
        if (this.cfr_renamed_314 < 1) {
            throw new IllegalStateException();
        }
        spryan spryan2 = this;
        n3 = spryan2.cfr_renamed_314 + 2;
        n2 = spryan2.cfr_renamed_11533(3);
        if (n2 < 2 || n2 > 6) {
            throw new IllegalStateException();
        }
        int n9 = this.cfr_renamed_11539(15);
        if (n9 < 1) {
            throw new IllegalStateException();
        }
        int n10 = 5517840;
        int n11 = n4 = 0;
        while (n11 < n9) {
            block29: {
                block30: {
                    spryan spryan3;
                    int n12 = 0;
                    while (this.cfr_renamed_11537() == 1) {
                        if (++n12 < n2) continue;
                        throw new IllegalStateException();
                    }
                    if (n4 >= 18002) break block29;
                    switch (n12) {
                        case 0: {
                            break;
                        }
                        case 1: {
                            n10 = n10 >>> 4 & 0xF | n10 << 4 & 0xF0 | n10 & 0xFFFF00;
                            spryan3 = this;
                            break block30;
                        }
                        case 2: {
                            n10 = n10 >>> 8 & 0xF | n10 << 4 & 0xFF0 | n10 & 0xFFF000;
                            spryan3 = this;
                            break block30;
                        }
                        case 3: {
                            n10 = n10 >>> 12 & 0xF | n10 << 4 & 0xFFF0 | n10 & 0xFF0000;
                            spryan3 = this;
                            break block30;
                        }
                        case 4: {
                            n10 = n10 >>> 16 & 0xF | n10 << 4 & 0xFFFF0 | n10 & 0xF00000;
                            spryan3 = this;
                            break block30;
                        }
                        case 5: {
                            n10 = n10 >>> 20 & 0xF | n10 << 4 & 0xFFFFF0;
                            spryan3 = this;
                            break block30;
                        }
                        default: {
                            throw new IllegalStateException();
                        }
                    }
                    spryan3 = this;
                }
                spryan3.cfr_renamed_126[n4] = (byte)(n10 & 0xF);
            }
            n11 = ++n4;
        }
        byte[] byArray = new byte[n3];
        int n13 = n = 0;
        block12: while (n13 < n2) {
            int n14;
            boolean bl;
            int n15 = 0;
            int n16 = 32;
            int n17 = this.cfr_renamed_11533(5);
            if (n17 < 1) {
                bl = true;
                n14 = n17;
            } else {
                bl = false;
                n14 = n17;
            }
            if (bl | n14 > 20) {
                throw new IllegalStateException();
            }
            int n18 = n4 = 0;
            while (true) {
                int n19;
                if (n18 < n3) {
                    n19 = this.cfr_renamed_11537();
                } else {
                    spryan spryan4 = this;
                    spryan spryan5 = this;
                    spryan5.cfr_renamed_11538(spryan4.spr\ufe34[n], this.cfr_renamed_728[n], spryan5.cfr_renamed_3[n], byArray, n16, n15, n3);
                    spryan4.cfr_renamed_135[n++] = n16;
                    n13 = n;
                    continue block12;
                }
                while (n19 != 0) {
                    int n20;
                    boolean bl2;
                    int n21 = this.cfr_renamed_11533(2);
                    if ((n17 += 1 - (n21 & 2)) < 1) {
                        bl2 = true;
                        n20 = n17;
                    } else {
                        bl2 = false;
                        n20 = n17;
                    }
                    if (bl2 | n20 > 20) {
                        throw new IllegalStateException();
                    }
                    n19 = n21 & 1;
                }
                byArray[n4] = (byte)n17;
                n15 = Math.max(n15, n17);
                n16 = Math.min(n16, n17);
                n18 = ++n4;
            }
            break;
        }
        return n9;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public int read() throws IOException {
        if (this.cfr_renamed_31) {
            return -1;
        }
        spryan spryan2 = this;
        int n = spryan2.cfr_renamed_84;
        switch (spryan2.cfr_renamed_107) {
            case 1: {
                this.cfr_renamed_4989();
                return n;
            }
            case 2: {
                this.cfr_renamed_4975();
                return n;
            }
            case 3: {
                this.cfr_renamed_4990();
                return n;
            }
            case 4: {
                this.cfr_renamed_4991();
                return n;
            }
        }
        throw new IllegalStateException();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_4965() {
        try {
            if (this.cfr_renamed_82 == null) return;
            if (this.cfr_renamed_82 == System.in) return;
            this.cfr_renamed_82.close();
            this.cfr_renamed_82 = null;
            return;
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    /*
     * WARNING - void declaration
     */
    public spryan(InputStream inputStream) throws IOException {
        int n;
        boolean bl;
        void arg0;
        spryan spryan2 = this;
        spryan spryan3 = this;
        spryan spryan4 = this;
        spryan4.cfr_renamed_1228 = new sprxxm();
        spryan3.cfr_renamed_4 = new byte[256];
        spryan3.cfr_renamed_126 = new byte[18002];
        spryan2.cfr_renamed_2 = new int[256];
        spryan2.spr\ufe34 = new int[6][21];
        this.cfr_renamed_728 = new int[6][21];
        this.cfr_renamed_3 = new int[6][258];
        spryan spryan5 = this;
        spryan spryan6 = this;
        spryan spryan7 = this;
        spryan spryan8 = this;
        spryan spryan9 = this;
        this.cfr_renamed_135 = new int[6];
        spryan9.cfr_renamed_31 = false;
        spryan9.cfr_renamed_84 = -1;
        spryan8.cfr_renamed_107 = 0;
        spryan8.cfr_renamed_956 = 0;
        spryan7.cfr_renamed_114 = 0;
        spryan7.cfr_renamed_1226 = null;
        spryan6.cfr_renamed_951 = null;
        spryan6.cfr_renamed_82 = arg0;
        this.cfr_renamed_957 = 0;
        spryan5.cfr_renamed_137 = 0;
        int n2 = this.cfr_renamed_82.read();
        int n3 = spryan5.cfr_renamed_82.read();
        int n4 = spryan5.cfr_renamed_82.read();
        int n5 = spryan5.cfr_renamed_82.read();
        if (n5 < 0) {
            throw new EOFException();
        }
        if (n2 != 66) {
            bl = true;
            n = n3;
        } else {
            bl = false;
            n = n3;
        }
        if (bl | n != 90 | n4 != 104 | n5 < 49 | n5 > 57) {
            throw new IOException(sprfica.cfr_renamed_9(":A\u0005N\u001fF\u0017\u000f\u0000[\u0001J\u0012BSG\u0016N\u0017J\u0001"));
        }
        spryan spryan10 = this;
        spryan10.cfr_renamed_96 = n5 - 48;
        int n6 = 100000 * this.cfr_renamed_96;
        this.cfr_renamed_1226 = new byte[n6];
        spryan10.cfr_renamed_951 = new int[n6];
        this.cfr_renamed_105 = 0;
        this.cfr_renamed_11535();
    }

    private /* synthetic */ int cfr_renamed_11534() throws IOException {
        int n = this.cfr_renamed_82.read();
        if (n < 0) {
            throw new EOFException();
        }
        return n & 0xFF;
    }

    private /* synthetic */ void cfr_renamed_4990() throws IOException {
        spryan spryan2 = this;
        if (spryan2.cfr_renamed_724 != spryan2.cfr_renamed_145) {
            this.cfr_renamed_128 = 1;
            this.cfr_renamed_4981();
            return;
        }
        if (++this.cfr_renamed_128 < 4) {
            this.cfr_renamed_4981();
            return;
        }
        spryan spryan3 = this;
        spryan spryan4 = this;
        this.cfr_renamed_133 = this.cfr_renamed_1226[spryan4.cfr_renamed_953] & 0xFF;
        this.cfr_renamed_953 = spryan4.cfr_renamed_951[this.cfr_renamed_953];
        spryan3.cfr_renamed_107 = 4;
        spryan3.cfr_renamed_723 = 0;
        this.cfr_renamed_4991();
    }

    private /* synthetic */ int cfr_renamed_11537() throws IOException {
        if (this.cfr_renamed_957 == 0) {
            this.cfr_renamed_137 = this.cfr_renamed_11534();
            this.cfr_renamed_957 = 7;
            return this.cfr_renamed_137 >>> 7;
        }
        spryan spryan2 = this;
        --spryan2.cfr_renamed_957;
        return spryan2.cfr_renamed_137 >>> this.cfr_renamed_957 & 1;
    }

    private /* synthetic */ void cfr_renamed_4976() throws IOException {
        spryan spryan2 = this;
        if (spryan2.cfr_renamed_952 <= spryan2.cfr_renamed_499) {
            spryan spryan3 = this;
            spryan3.cfr_renamed_145 = spryan3.cfr_renamed_724;
            spryan3.cfr_renamed_724 = spryan3.cfr_renamed_1226[this.cfr_renamed_953] & 0xFF;
            spryan3.cfr_renamed_953 = spryan3.cfr_renamed_951[this.cfr_renamed_953];
            if (spryan3.cfr_renamed_956 == 0) {
                this.cfr_renamed_956 = sprsrg.cfr_renamed_96[this.cfr_renamed_114++];
                this.cfr_renamed_114 &= 0x1FF;
            }
            spryan spryan4 = this;
            --spryan4.cfr_renamed_956;
            spryan4.cfr_renamed_724 = spryan4.cfr_renamed_724 ^ (this.cfr_renamed_956 == 1 ? 1 : 0);
            spryan spryan5 = this;
            ++spryan5.cfr_renamed_952;
            this.cfr_renamed_84 = spryan5.cfr_renamed_724;
            this.cfr_renamed_107 = 1;
            this.cfr_renamed_1228.cfr_renamed_11084(this.cfr_renamed_724);
            return;
        }
        spryan spryan6 = this;
        spryan6.cfr_renamed_4971();
        spryan6.cfr_renamed_11535();
    }

    private /* synthetic */ void cfr_renamed_4971() throws IOException {
        spryan spryan2 = this;
        int n = spryan2.cfr_renamed_1228.cfr_renamed_11522();
        if (spryan2.cfr_renamed_102 != n) {
            throw new IOException(sprbkn.cfr_renamed_9("!F\fI\b\n x \n\u0006X\u0011E\u0011"));
        }
        this.cfr_renamed_105 = spruaf.cfr_renamed_494(this.cfr_renamed_105, 1) ^ n;
    }

    private /* synthetic */ int cfr_renamed_11539(int arg0) throws IOException {
        spryan spryan2 = this;
        while (spryan2.cfr_renamed_957 < arg0) {
            spryan spryan3 = this;
            spryan2 = spryan3;
            spryan spryan4 = this;
            spryan3.cfr_renamed_137 = spryan3.cfr_renamed_137 << 8 | spryan4.cfr_renamed_11534();
            spryan4.cfr_renamed_957 += 8;
        }
        spryan spryan5 = this;
        spryan5.cfr_renamed_957 -= arg0;
        return spryan5.cfr_renamed_137 >>> this.cfr_renamed_957 & (1 << arg0) - 1;
    }
}

