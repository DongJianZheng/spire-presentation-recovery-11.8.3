/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhxm;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprph;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprxxm;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Vector;

public class sprsrg
extends OutputStream
implements sprph {
    public static final int cfr_renamed_722 = 20;
    private OutputStream cfr_renamed_955;
    private int cfr_renamed_1228;
    public static final int cfr_renamed_1260 = 15;
    private short[] cfr_renamed_499;
    private int[] cfr_renamed_135;
    public static final int cfr_renamed_956 = -2097153;
    private static final int[] cfr_renamed_952;
    private int cfr_renamed_728;
    private final sprxxm cfr_renamed_128;
    private int cfr_renamed_957;
    private int cfr_renamed_314;
    private int cfr_renamed_951;
    private int cfr_renamed_84;
    public static final int cfr_renamed_723 = 0;
    private int[] cfr_renamed_1226;
    private boolean[] cfr_renamed_287;
    private int cfr_renamed_724;
    public boolean cfr_renamed_953;
    public static final int cfr_renamed_133 = 0x200000;
    private boolean cfr_renamed_185;
    public boolean spr\ufe34;
    private int[] cfr_renamed_82;
    private int cfr_renamed_126;
    public static final int cfr_renamed_88 = 10;
    private int[] cfr_renamed_31;
    private boolean cfr_renamed_272;
    public int cfr_renamed_145;
    private byte[] cfr_renamed_114;
    public static final short[] cfr_renamed_96;
    private final int cfr_renamed_105;
    public int cfr_renamed_137;
    public int cfr_renamed_79;
    private byte[] cfr_renamed_107;
    private final int cfr_renamed_132;
    public int cfr_renamed_102;
    private final Vector cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_4958() {
        int n;
        int n2;
        this.cfr_renamed_126 = 0;
        byte[] byArray = new byte[256];
        int n3 = n2 = 0;
        while (n3 < 256) {
            if (this.cfr_renamed_287[n2]) {
                byArray[this.cfr_renamed_126++] = (byte)n2;
            }
            n3 = ++n2;
        }
        int n4 = this.cfr_renamed_126 + 1;
        int n5 = n2 = 0;
        while (n5 <= n4) {
            this.cfr_renamed_1226[n2++] = 0;
            n5 = n2;
        }
        int n6 = 0;
        int n7 = 0;
        int n8 = n2 = 0;
        while (n8 < this.cfr_renamed_102) {
            sprsrg sprsrg2 = this;
            n = sprsrg2.cfr_renamed_114[sprsrg2.cfr_renamed_31[n2]];
            int n9 = byArray[0];
            if (n == n9) {
                ++n7;
            } else {
                int n10;
                int n11 = 1;
                do {
                    n10 = n9;
                    n9 = byArray[n11];
                    byArray[n11++] = n10;
                } while (n != n9);
                int n12 = n7;
                byArray[0] = n9;
                while (n12 > 0) {
                    n10 = --n7 & 1;
                    sprsrg sprsrg3 = this;
                    sprsrg3.cfr_renamed_82[n6++] = n10;
                    int n13 = n10;
                    sprsrg3.cfr_renamed_1226[n13] = sprsrg3.cfr_renamed_1226[n13] + 1;
                    n12 = n7 = n7 >>> 1;
                }
                sprsrg sprsrg4 = this;
                sprsrg4.cfr_renamed_82[n6++] = n11;
                int n14 = n11;
                sprsrg4.cfr_renamed_1226[n14] = sprsrg4.cfr_renamed_1226[n14] + 1;
            }
            n8 = ++n2;
        }
        int n15 = n7;
        while (n15 > 0) {
            n = --n7 & 1;
            sprsrg sprsrg5 = this;
            sprsrg5.cfr_renamed_82[n6++] = n;
            int n16 = n;
            sprsrg5.cfr_renamed_1226[n16] = sprsrg5.cfr_renamed_1226[n16] + 1;
            n15 = n7 = n7 >>> 1;
        }
        sprsrg sprsrg6 = this;
        sprsrg6.cfr_renamed_82[n6++] = n4;
        int n17 = n4;
        sprsrg6.cfr_renamed_1226[n17] = sprsrg6.cfr_renamed_1226[n17] + 1;
        sprsrg6.cfr_renamed_84 = n6;
    }

    private /* synthetic */ void cfr_renamed_4952() {
        int n;
        int n2;
        int n3 = n2 = 0;
        while (n3 < 256) {
            this.cfr_renamed_287[n2++] = false;
            n3 = n2;
        }
        n2 = 0;
        int n4 = 0;
        int n5 = n = 1;
        while (n5 <= this.cfr_renamed_102) {
            if (n2 == 0) {
                n2 = cfr_renamed_96[n4];
                ++n4;
                n4 &= 0x1FF;
            }
            int n6 = n;
            this.cfr_renamed_114[n6] = (byte)(this.cfr_renamed_114[n6] ^ (--n2 == 1 ? (byte)1 : 0));
            sprsrg sprsrg2 = this;
            int n7 = sprsrg2.cfr_renamed_114[n] & 0xFF;
            sprsrg2.cfr_renamed_287[n7] = true;
            n5 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_11524(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4) {
        int n;
        int n2 = 0;
        int n3 = n = arg2;
        while (n3 <= arg3) {
            int n4;
            int n5 = n4 = 0;
            while (n5 < arg4) {
                if ((arg1[n4] & 0xFF) == n) {
                    arg0[n4] = n2++;
                }
                n5 = ++n4;
            }
            n2 <<= 1;
            n3 = ++n;
        }
    }

    public void finalize() throws Throwable {
        sprsrg sprsrg2 = this;
        sprsrg2.close();
        super.finalize();
    }

    private /* synthetic */ void cfr_renamed_4961() throws IOException {
        int n;
        int n2;
        int n3;
        Object[] objectArray;
        byte[] byArray;
        int n4;
        int n5;
        Object[] objectArray2;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        sprsrg sprsrg2 = this;
        int n11 = sprsrg2.cfr_renamed_126 + 2;
        if (sprsrg2.cfr_renamed_84 <= 0) {
            throw new IllegalStateException();
        }
        byte[][] byArray2 = new byte[this.cfr_renamed_84 < 200 ? (n10 = 2) : (this.cfr_renamed_84 < 600 ? (n10 = 3) : (this.cfr_renamed_84 < 1200 ? (n10 = 4) : (this.cfr_renamed_84 < 2400 ? (n10 = 5) : (n10 = 6))))][n11];
        int n12 = n9 = 0;
        while (n12 < n10) {
            sproze.cfr_renamed_492(byArray2[n9++], (byte)15);
            n12 = n9;
        }
        int n13 = n10;
        int n14 = this.cfr_renamed_84;
        int n15 = -1;
        int n16 = n13;
        while (n16 > 0) {
            n8 = n15 + 1;
            n7 = 0;
            n6 = n14 / n13;
            int n17 = n7;
            while (n17 < n6 && n15 < n11 - 1) {
                n17 = n7 + this.cfr_renamed_1226[++n15];
            }
            if (n15 > n8 && n13 != n10 && n13 != 1 && (n10 - n13) % 2 == 1) {
                n7 -= this.cfr_renamed_1226[n15--];
            }
            objectArray2 = byArray2[n13 - 1];
            int n18 = n5 = 0;
            while (n18 < n11) {
                objectArray2[n5] = n5 >= n8 && n5 <= n15 ? 0 : 15;
                n18 = ++n5;
            }
            n14 -= n7;
            n16 = --n13;
        }
        int[][] nArray = new int[6][258];
        int[] nArray2 = new int[6];
        short[] sArray = new short[6];
        n8 = 0;
        int n19 = n4 = 0;
        while (n19 < 4) {
            int n20 = n9 = 0;
            while (n20 < n10) {
                int n21 = n9;
                nArray2[n21] = 0;
                int[] nArray3 = nArray[n21];
                int n22 = n5 = 0;
                while (n22 < n11) {
                    nArray3[n5++] = 0;
                    n22 = n5;
                }
                n20 = ++n9;
            }
            n8 = 0;
            int n23 = n7 = 0;
            while (n23 < this.cfr_renamed_84) {
                short[] sArray2;
                n6 = Math.min(n7 + 50 - 1, this.cfr_renamed_84 - 1);
                if (n10 == 6) {
                    objectArray2 = byArray2[0];
                    byArray = byArray2[1];
                    byte[] byArray3 = byArray2[2];
                    byte[] byArray4 = byArray2[3];
                    objectArray = byArray2[4];
                    byte[] byArray5 = byArray2[5];
                    int n24 = 0;
                    short s = 0;
                    short s2 = 0;
                    short s3 = 0;
                    short s4 = 0;
                    short s5 = 0;
                    int n25 = n3 = n7;
                    while (n25 <= n6) {
                        int n26 = this.cfr_renamed_82[n3];
                        n24 = (short)(n24 + (objectArray2[n26] & 0xFF));
                        s = (short)(s + (byArray[n26] & 0xFF));
                        s2 = (short)(s2 + (byArray3[n26] & 0xFF));
                        s3 = (short)(s3 + (byArray4[n26] & 0xFF));
                        s4 = (short)(s4 + (objectArray[n26] & 0xFF));
                        s5 = (short)(s5 + (byArray5[n26] & 0xFF));
                        n25 = ++n3;
                    }
                    sArray2 = sArray;
                    sArray[0] = n24;
                    sArray[1] = s;
                    sArray[2] = s2;
                    sArray[3] = s3;
                    sArray[4] = s4;
                    sArray[5] = s5;
                } else {
                    int n27 = n9 = 0;
                    while (n27 < n10) {
                        sArray[n9++] = 0;
                        n27 = n9;
                    }
                    int n28 = n3 = n7;
                    while (n28 <= n6) {
                        int n29 = this.cfr_renamed_82[n3];
                        int n30 = n9 = 0;
                        while (n30 < n10) {
                            int n31 = n9;
                            short s = (short)(sArray[n31] + (byArray2[n9][n29] & 0xFF));
                            sArray[n31] = s;
                            n30 = ++n9;
                        }
                        n28 = ++n3;
                    }
                    sArray2 = sArray;
                }
                short s = sArray2[0];
                int n32 = 0;
                int n33 = n9 = 1;
                while (n33 < n10) {
                    short s6 = sArray[n9];
                    if (s6 < s) {
                        s = s6;
                        n32 = n9;
                    }
                    n33 = ++n9;
                }
                int n34 = n32;
                nArray2[n34] = nArray2[n34] + 1;
                this.cfr_renamed_107[n8++] = (byte)n32;
                objectArray2 = nArray[n32];
                int n35 = n3 = n7;
                while (n35 <= n6) {
                    int n36 = this.cfr_renamed_82[n3];
                    objectArray2[n36] = objectArray2[n36] + 1;
                    n35 = ++n3;
                }
                n23 = n6 + 1;
            }
            int n37 = n9 = 0;
            while (n37 < n10) {
                byte[] byArray6 = byArray2[n9];
                int[] nArray4 = nArray[n9];
                sprsrg.cfr_renamed_11525(byArray6, nArray4, n11, 17);
                n37 = ++n9;
            }
            n19 = ++n4;
        }
        if (n10 >= 8 || n10 > 6) {
            throw new IllegalStateException();
        }
        if (n8 >= 32768 || n8 > 18002) {
            throw new IllegalStateException();
        }
        int[][] nArray5 = new int[n10][n11];
        int n38 = n9 = 0;
        while (n38 < n10) {
            int n39;
            boolean bl;
            n6 = 0;
            int n40 = 32;
            byArray = byArray2[n9];
            int n41 = n3 = 0;
            while (n41 < n11) {
                int n42 = byArray[n3] & 0xFF;
                n6 = Math.max(n6, n42);
                n40 = Math.min(n40, n42);
                n41 = ++n3;
            }
            if (n40 < 1) {
                bl = true;
                n39 = n6;
            } else {
                bl = false;
                n39 = n6;
            }
            if (bl | n39 > 17) {
                throw new IllegalStateException();
            }
            int[] nArray6 = nArray5[n9];
            this.cfr_renamed_11524(nArray6, byArray, n40, n6, n11);
            n38 = ++n9;
        }
        boolean[] blArray = new boolean[16];
        int n43 = n3 = 0;
        while (n43 < 16) {
            int n44 = n3;
            blArray[n44] = false;
            int n45 = n44 * 16;
            int n46 = n2 = 0;
            while (n46 < 16) {
                if (this.cfr_renamed_287[n45 + n2]) {
                    blArray[n3] = true;
                    break;
                }
                n46 = ++n2;
            }
            n43 = ++n3;
        }
        int n47 = n3 = 0;
        while (n47 < 16) {
            this.cfr_renamed_11526(blArray[n3] ? 1 : 0);
            n47 = ++n3;
        }
        int n48 = n3 = 0;
        while (n48 < 16) {
            if (blArray[n3]) {
                int n49 = n3 * 16;
                int n50 = n2 = 0;
                while (n50 < 16) {
                    sprsrg sprsrg3 = this;
                    sprsrg3.cfr_renamed_11526(sprsrg3.cfr_renamed_287[n49 + n2] ? 1 : 0);
                    n50 = ++n2;
                }
            }
            n48 = ++n3;
        }
        this.cfr_renamed_11527(3, n10);
        this.cfr_renamed_11528(15, n8);
        int n51 = 6636321;
        int n52 = n3 = 0;
        while (n52 < n8) {
            int n53 = this.cfr_renamed_107[n3] & 0xFF;
            int n54 = n53 << 2;
            int n55 = n51 >>> n54 & 0xF;
            if (n55 != 1) {
                int n56 = 0x888888 - n51 + 0x111111 * n55 & 0x888888;
                n51 = n51 - (n55 << n54) + (n56 >>> 3);
            }
            int n57 = n55;
            this.cfr_renamed_11527(n57, (1 << n57) - 2);
            n52 = ++n3;
        }
        int n58 = n9 = 0;
        while (n58 < n10) {
            byte[] byArray7 = byArray2[n9];
            int n59 = byArray7[0] & 0xFF;
            this.cfr_renamed_11527(6, n59 << 1);
            int n60 = n3 = 1;
            while (n60 < n11) {
                int n61 = byArray7[n3] & 0xFF;
                int n62 = n59;
                while (n62 < n61) {
                    this.cfr_renamed_11527(2, 2);
                    n62 = ++n59;
                }
                int n63 = n59;
                while (n63 > n61) {
                    this.cfr_renamed_11527(2, 3);
                    n63 = --n59;
                }
                this.cfr_renamed_11526(0);
                n60 = ++n3;
            }
            n58 = ++n9;
        }
        int n64 = 0;
        int n65 = n = 0;
        while (n65 < this.cfr_renamed_84) {
            int n66 = Math.min(n + 50 - 1, this.cfr_renamed_84 - 1);
            int n67 = this.cfr_renamed_107[n64] & 0xFF;
            byte[] byArray8 = byArray2[n67];
            objectArray = nArray5[n67];
            int n68 = n;
            while (n68 <= n66) {
                sprsrg sprsrg4 = this;
                int n69 = sprsrg4.cfr_renamed_82[n3];
                sprsrg4.cfr_renamed_11528(byArray8[n69] & 0xFF, objectArray[n69]);
                n68 = ++n3;
            }
            ++n64;
            n65 = n = n66 + 1;
        }
        if (n64 != n8) {
            throw new IllegalStateException();
        }
    }

    @Override
    public void write(int arg0) throws IOException {
        int n = arg0 & 0xFF;
        if (this.cfr_renamed_957 == n) {
            if (++this.cfr_renamed_951 > 254) {
                sprsrg sprsrg2 = this;
                this.cfr_renamed_4970();
                sprsrg2.cfr_renamed_957 = -1;
                sprsrg2.cfr_renamed_951 = 0;
            }
            return;
        }
        if (this.cfr_renamed_957 >= 0) {
            this.cfr_renamed_4970();
        }
        this.cfr_renamed_957 = n;
        this.cfr_renamed_951 = 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_4967(int arg0, int arg1, int arg2) {
        Vector vector = this.cfr_renamed_4;
        int n = 0;
        int n2 = arg0;
        int n3 = arg1;
        int n4 = arg2;
        int n5 = n3;
        while (true) {
            int n6;
            int n7;
            int n8;
            int n9;
            int n10;
            int n11;
            block18: {
                block19: {
                    block21: {
                        block20: {
                            if (n5 - n2 >= 20 && n4 <= 10) break block19;
                            this.cfr_renamed_4968(n2, n3, n4);
                            if (n < true) break block20;
                            sprsrg sprsrg2 = this;
                            if (sprsrg2.cfr_renamed_1228 <= sprsrg2.cfr_renamed_728 || !this.cfr_renamed_185) break block21;
                        }
                        return;
                    }
                    sprhxm sprhxm2 = (sprhxm)vector.elementAt(--n);
                    n2 = sprhxm2.cfr_renamed_2;
                    n3 = sprhxm2.cfr_renamed_4;
                    n4 = sprhxm2.cfr_renamed_3;
                    n5 = n3;
                    continue;
                }
                n11 = n4 + 1;
                sprsrg sprsrg3 = this;
                sprsrg sprsrg4 = this;
                sprsrg sprsrg5 = this;
                int n12 = sprsrg4.cfr_renamed_11529(sprsrg3.cfr_renamed_114[sprsrg3.cfr_renamed_31[n2] + n11] & 0xFF, this.cfr_renamed_114[sprsrg4.cfr_renamed_31[n3] + n11] & 0xFF, sprsrg5.cfr_renamed_114[sprsrg5.cfr_renamed_31[n2 + n3 >>> 1] + n11] & 0xFF);
                n9 = n10 = n2;
                n7 = n8 = n3;
                int n13 = n9;
                while (true) {
                    int n14;
                    int n15;
                    block17: {
                        int n16;
                        block16: {
                            if (n13 <= n7) {
                                sprsrg sprsrg6 = this;
                                n15 = sprsrg6.cfr_renamed_31[n9];
                                n6 = (sprsrg6.cfr_renamed_114[n15 + n11] & 0xFF) - n12;
                                if (n6 > 0) {
                                    n16 = n9;
                                    break block16;
                                } else {
                                    if (n6 == 0) {
                                        sprsrg sprsrg7 = this;
                                        this.cfr_renamed_31[n9] = sprsrg7.cfr_renamed_31[n10];
                                        sprsrg7.cfr_renamed_31[n10++] = n15;
                                    }
                                    n13 = ++n9;
                                    continue;
                                }
                            }
                            n16 = n9;
                        }
                        while (n16 <= n7) {
                            sprsrg sprsrg8 = this;
                            n15 = sprsrg8.cfr_renamed_31[n7];
                            n6 = (sprsrg8.cfr_renamed_114[n15 + n11] & 0xFF) - n12;
                            if (n6 < 0) {
                                n14 = n9;
                                break block17;
                            }
                            if (n6 == 0) {
                                sprsrg sprsrg9 = this;
                                this.cfr_renamed_31[n7] = sprsrg9.cfr_renamed_31[n8];
                                sprsrg9.cfr_renamed_31[n8--] = n15;
                            }
                            --n7;
                            n16 = n9;
                        }
                        n14 = n9;
                    }
                    if (n14 > n7) {
                        if (n8 < n10) {
                            break;
                        }
                        break block18;
                    }
                    sprsrg sprsrg10 = this;
                    n15 = sprsrg10.cfr_renamed_31[n9];
                    sprsrg10.cfr_renamed_31[n9++] = this.cfr_renamed_31[n7];
                    sprsrg10.cfr_renamed_31[n7--] = n15;
                    n13 = n9;
                }
                n4 = n11;
                n5 = n3;
                continue;
            }
            n6 = Math.min(n10 - n2, n9 - n10);
            sprsrg sprsrg11 = this;
            sprsrg11.cfr_renamed_4969(n2, n9 - n6, n6);
            int n17 = Math.min(n3 - n8, n8 - n7);
            sprsrg11.cfr_renamed_4969(n9, n3 - n17 + 1, n17);
            n6 = n2 + (n9 - n10);
            n17 = n3 - (n8 - n7);
            sprsrg.cfr_renamed_11530(vector, n++, n2, n6 - 1, n4);
            sprsrg.cfr_renamed_11530(vector, n++, n6, n17, n11);
            n2 = n17 + 1;
            n5 = n3;
        }
    }

    @Override
    public void close() throws IOException {
        if (this.spr\ufe34) {
            return;
        }
        sprsrg sprsrg2 = this;
        sprsrg2.cfr_renamed_3120();
        this.spr\ufe34 = true;
        super.close();
        this.cfr_renamed_955.close();
    }

    private /* synthetic */ void cfr_renamed_11527(int arg0, int arg1) throws IOException {
        sprsrg sprsrg2 = this;
        sprsrg2.cfr_renamed_145 -= arg0;
        sprsrg2.cfr_renamed_79 |= arg1 << this.cfr_renamed_145;
        if (sprsrg2.cfr_renamed_145 <= 24) {
            sprsrg sprsrg3 = this;
            sprsrg sprsrg4 = this;
            sprsrg3.cfr_renamed_955.write(sprsrg4.cfr_renamed_79 >>> 24);
            sprsrg3.cfr_renamed_79 <<= 8;
            sprsrg4.cfr_renamed_145 += 8;
        }
    }

    public void cfr_renamed_3120() throws IOException {
        if (this.cfr_renamed_272) {
            return;
        }
        if (this.cfr_renamed_951 > 0) {
            this.cfr_renamed_4970();
        }
        this.cfr_renamed_957 = -1;
        if (this.cfr_renamed_102 > 0) {
            this.cfr_renamed_4971();
        }
        this.cfr_renamed_4974();
        this.cfr_renamed_272 = true;
        this.flush();
    }

    private static /* synthetic */ void cfr_renamed_11530(Vector arg0, int arg1, int arg2, int arg3, int arg4) {
        sprhxm sprhxm2;
        sprhxm sprhxm3;
        if (arg1 < arg0.size()) {
            sprhxm2 = sprhxm3 = (sprhxm)arg0.elementAt(arg1);
        } else {
            sprhxm sprhxm4 = sprhxm3 = new sprhxm(null);
            sprhxm2 = sprhxm4;
            arg0.addElement(sprhxm4);
        }
        sprhxm2.cfr_renamed_2 = arg2;
        sprhxm sprhxm5 = sprhxm3;
        sprhxm5.cfr_renamed_4 = arg3;
        sprhxm5.cfr_renamed_3 = arg4;
    }

    @Override
    public void flush() throws IOException {
        sprsrg sprsrg2 = this;
        super.flush();
        sprsrg2.cfr_renamed_955.flush();
    }

    private /* synthetic */ void cfr_renamed_11528(int arg0, int arg1) throws IOException {
        sprsrg sprsrg2 = this;
        sprsrg sprsrg3 = sprsrg2;
        sprsrg2.cfr_renamed_145 -= arg0;
        sprsrg2.cfr_renamed_79 |= arg1 << this.cfr_renamed_145;
        while (sprsrg3.cfr_renamed_145 <= 24) {
            sprsrg sprsrg4 = this;
            sprsrg3 = sprsrg4;
            sprsrg sprsrg5 = this;
            sprsrg4.cfr_renamed_955.write(sprsrg5.cfr_renamed_79 >>> 24);
            sprsrg4.cfr_renamed_79 <<= 8;
            sprsrg5.cfr_renamed_145 += 8;
        }
    }

    private /* synthetic */ void cfr_renamed_4968(int arg0, int arg1, int arg2) {
        int n = arg1 - arg0 + 1;
        if (n < 2) {
            return;
        }
        int n2 = 0;
        while (cfr_renamed_952[n2] < n) {
            ++n2;
        }
        int n3 = --n2;
        while (n3 >= 0) {
            int n4 = cfr_renamed_952[n2];
            for (int i = arg0 + n4; i <= arg1; ++i) {
                int n5;
                block12: {
                    sprsrg sprsrg2;
                    block9: {
                        int n6;
                        int n7;
                        block11: {
                            sprsrg sprsrg3;
                            block8: {
                                int n8;
                                block10: {
                                    sprsrg sprsrg4;
                                    block7: {
                                        int n9;
                                        n5 = this.cfr_renamed_31[i];
                                        n7 = i;
                                        do {
                                            sprsrg sprsrg5 = this;
                                            if (!sprsrg5.cfr_renamed_4966(sprsrg5.cfr_renamed_31[n7 - n4] + arg2, n5 + arg2)) break block7;
                                            n9 = n7;
                                            this.cfr_renamed_31[n9] = this.cfr_renamed_31[n7 - n4];
                                        } while ((n7 = n9 - n4) > arg0 + n4 - 1);
                                        sprsrg4 = this;
                                        break block10;
                                    }
                                    sprsrg4 = this;
                                }
                                sprsrg4.cfr_renamed_31[n7] = n5;
                                if (++i > arg1) break;
                                n5 = this.cfr_renamed_31[i];
                                n7 = i;
                                do {
                                    sprsrg sprsrg6 = this;
                                    if (!sprsrg6.cfr_renamed_4966(sprsrg6.cfr_renamed_31[n7 - n4] + arg2, n5 + arg2)) break block8;
                                    n8 = n7;
                                    this.cfr_renamed_31[n8] = this.cfr_renamed_31[n7 - n4];
                                } while ((n7 = n8 - n4) > arg0 + n4 - 1);
                                sprsrg3 = this;
                                break block11;
                            }
                            sprsrg3 = this;
                        }
                        sprsrg3.cfr_renamed_31[n7] = n5;
                        if (++i > arg1) break;
                        n5 = this.cfr_renamed_31[i];
                        n7 = i;
                        do {
                            sprsrg sprsrg7 = this;
                            if (!sprsrg7.cfr_renamed_4966(sprsrg7.cfr_renamed_31[n7 - n4] + arg2, n5 + arg2)) break block9;
                            n6 = n7;
                            this.cfr_renamed_31[n6] = this.cfr_renamed_31[n7 - n4];
                        } while ((n7 = n6 - n4) > arg0 + n4 - 1);
                        sprsrg2 = this;
                        break block12;
                    }
                    sprsrg2 = this;
                }
                sprsrg2.cfr_renamed_31[n7] = n5;
                sprsrg sprsrg8 = this;
                if (sprsrg8.cfr_renamed_1228 <= sprsrg8.cfr_renamed_728 || !this.cfr_renamed_185) continue;
                return;
            }
            n3 = --n2;
        }
    }

    private /* synthetic */ boolean cfr_renamed_4966(int arg0, int arg1) {
        int n;
        int n2;
        sprsrg sprsrg2 = this;
        if ((n2 = sprsrg2.cfr_renamed_114[++arg0] & 0xFF) != (n = sprsrg2.cfr_renamed_114[++arg1] & 0xFF)) {
            return n2 > n;
        }
        sprsrg sprsrg3 = this;
        if ((n2 = sprsrg3.cfr_renamed_114[++arg0] & 0xFF) != (n = sprsrg3.cfr_renamed_114[++arg1] & 0xFF)) {
            return n2 > n;
        }
        sprsrg sprsrg4 = this;
        if ((n2 = sprsrg4.cfr_renamed_114[++arg0] & 0xFF) != (n = sprsrg4.cfr_renamed_114[++arg1] & 0xFF)) {
            return n2 > n;
        }
        sprsrg sprsrg5 = this;
        if ((n2 = sprsrg5.cfr_renamed_114[++arg0] & 0xFF) != (n = sprsrg5.cfr_renamed_114[++arg1] & 0xFF)) {
            return n2 > n;
        }
        sprsrg sprsrg6 = this;
        if ((n2 = sprsrg6.cfr_renamed_114[++arg0] & 0xFF) != (n = sprsrg6.cfr_renamed_114[++arg1] & 0xFF)) {
            return n2 > n;
        }
        sprsrg sprsrg7 = this;
        if ((n2 = sprsrg7.cfr_renamed_114[++arg0] & 0xFF) != (n = sprsrg7.cfr_renamed_114[++arg1] & 0xFF)) {
            return n2 > n;
        }
        int n3 = this.cfr_renamed_102;
        do {
            sprsrg sprsrg8 = this;
            if ((n2 = sprsrg8.cfr_renamed_114[++arg0] & 0xFF) != (n = sprsrg8.cfr_renamed_114[++arg1] & 0xFF)) {
                return n2 > n;
            }
            sprsrg sprsrg9 = this;
            int n4 = sprsrg9.cfr_renamed_499[arg0] & 0xFFFF;
            int n5 = sprsrg9.cfr_renamed_499[arg1] & 0xFFFF;
            if (n4 != n5) {
                return n4 > n5;
            }
            sprsrg sprsrg10 = this;
            if ((n2 = sprsrg10.cfr_renamed_114[++arg0] & 0xFF) != (n = sprsrg10.cfr_renamed_114[++arg1] & 0xFF)) {
                return n2 > n;
            }
            sprsrg sprsrg11 = this;
            n4 = sprsrg11.cfr_renamed_499[arg0] & 0xFFFF;
            n5 = sprsrg11.cfr_renamed_499[arg1] & 0xFFFF;
            if (n4 != n5) {
                return n4 > n5;
            }
            sprsrg sprsrg12 = this;
            if ((n2 = sprsrg12.cfr_renamed_114[++arg0] & 0xFF) != (n = sprsrg12.cfr_renamed_114[++arg1] & 0xFF)) {
                return n2 > n;
            }
            sprsrg sprsrg13 = this;
            n4 = sprsrg13.cfr_renamed_499[arg0] & 0xFFFF;
            n5 = sprsrg13.cfr_renamed_499[arg1] & 0xFFFF;
            if (n4 != n5) {
                return n4 > n5;
            }
            sprsrg sprsrg14 = this;
            if ((n2 = sprsrg14.cfr_renamed_114[++arg0] & 0xFF) != (n = sprsrg14.cfr_renamed_114[++arg1] & 0xFF)) {
                return n2 > n;
            }
            sprsrg sprsrg15 = this;
            n4 = sprsrg15.cfr_renamed_499[arg0] & 0xFFFF;
            n5 = sprsrg15.cfr_renamed_499[arg1] & 0xFFFF;
            if (n4 != n5) {
                return n4 > n5;
            }
            if (arg0 >= this.cfr_renamed_102) {
                arg0 -= this.cfr_renamed_102;
            }
            if (arg1 >= this.cfr_renamed_102) {
                arg1 -= this.cfr_renamed_102;
            }
            ++this.cfr_renamed_1228;
        } while ((n3 -= 4) >= 0);
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_11531(int n) throws IOException {
        void arg0;
        sprsrg sprsrg2 = this;
        sprsrg2.cfr_renamed_11528(16, (int)(arg0 >>> 16));
        sprsrg2.cfr_renamed_11528(16, (int)(arg0 & 0xFFFF));
    }

    private /* synthetic */ int cfr_renamed_11529(int arg0, int arg1, int arg2) {
        if (arg0 > arg1) {
            if (arg2 < arg1) {
                return arg1;
            }
            if (arg2 > arg0) {
                return arg0;
            }
            return arg2;
        }
        if (arg2 < arg0) {
            return arg0;
        }
        if (arg2 > arg1) {
            return arg1;
        }
        return arg2;
    }

    private /* synthetic */ void cfr_renamed_4950() {
        sprsrg sprsrg2;
        block4: {
            int n;
            this.cfr_renamed_728 = this.cfr_renamed_724 * (this.cfr_renamed_102 - 1);
            this.cfr_renamed_1228 = 0;
            this.cfr_renamed_953 = 0;
            this.cfr_renamed_185 = true;
            this.cfr_renamed_4951();
            if (this.cfr_renamed_1228 > this.cfr_renamed_728 && this.cfr_renamed_185) {
                this.cfr_renamed_4952();
                this.cfr_renamed_1228 = 0;
                this.cfr_renamed_728 = 0;
                this.cfr_renamed_953 = true;
                this.cfr_renamed_185 = false;
                this.cfr_renamed_4951();
            }
            this.cfr_renamed_137 = -1;
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_102) {
                if (this.cfr_renamed_31[n] == 0) {
                    sprsrg2 = this;
                    this.cfr_renamed_137 = n;
                    break block4;
                }
                n2 = ++n;
            }
            sprsrg2 = this;
        }
        if (sprsrg2.cfr_renamed_137 == -1) {
            throw new IllegalStateException();
        }
    }

    private /* synthetic */ void cfr_renamed_4951() {
        int n;
        int n2;
        int n3;
        int n4;
        int[] nArray = new int[256];
        int[] nArray2 = new int[256];
        boolean[] blArray = new boolean[256];
        int n5 = n4 = 0;
        while (n5 < 20) {
            sprsrg sprsrg2 = this;
            int n6 = sprsrg2.cfr_renamed_102 + n4 + 1;
            byte by = this.cfr_renamed_114[n4 % this.cfr_renamed_102 + 1];
            sprsrg2.cfr_renamed_114[n6] = by;
            n5 = ++n4;
        }
        int n7 = n4 = 0;
        while (n7 <= this.cfr_renamed_102 + 20) {
            this.cfr_renamed_499[n4++] = 0;
            n7 = n4;
        }
        sprsrg sprsrg3 = this;
        sprsrg sprsrg4 = this;
        sprsrg3.cfr_renamed_114[0] = sprsrg4.cfr_renamed_114[sprsrg4.cfr_renamed_102];
        if (sprsrg3.cfr_renamed_102 <= 4000) {
            int n8 = n4 = 0;
            while (n8 < this.cfr_renamed_102) {
                int n9 = n4++;
                this.cfr_renamed_31[n9] = n9;
                n8 = n4;
            }
            sprsrg sprsrg5 = this;
            sprsrg5.cfr_renamed_185 = false;
            sprsrg5.cfr_renamed_728 = 0;
            this.cfr_renamed_1228 = 0;
            sprsrg sprsrg6 = this;
            sprsrg6.cfr_renamed_4968(0, sprsrg6.cfr_renamed_102 - 1, 0);
            return;
        }
        int n10 = n4 = 0;
        while (n10 <= 255) {
            blArray[n4++] = false;
            n10 = n4;
        }
        int n11 = n4 = 0;
        while (n11 <= 65536) {
            this.cfr_renamed_135[n4++] = 0;
            n11 = n4;
        }
        int n12 = this.cfr_renamed_114[0] & 0xFF;
        int n13 = n4 = 0;
        while (n13 < this.cfr_renamed_102) {
            sprsrg sprsrg7 = this;
            n3 = sprsrg7.cfr_renamed_114[n4 + 1] & 0xFF;
            int n14 = (n12 << 8) + n3;
            sprsrg7.cfr_renamed_135[n14] = sprsrg7.cfr_renamed_135[n14] + 1;
            n12 = n3;
            n13 = ++n4;
        }
        int n15 = n4 = 1;
        while (n15 <= 65536) {
            int n16 = n4;
            int n17 = this.cfr_renamed_135[n16] + this.cfr_renamed_135[n4 - 1];
            this.cfr_renamed_135[n16] = n17;
            n15 = ++n4;
        }
        n12 = this.cfr_renamed_114[1] & 0xFF;
        int n18 = n4 = 0;
        while (n18 < this.cfr_renamed_102 - 1) {
            sprsrg sprsrg8 = this;
            n3 = sprsrg8.cfr_renamed_114[n4 + 2] & 0xFF;
            n2 = (n12 << 8) + n3;
            n12 = n3;
            int n19 = n2;
            sprsrg8.cfr_renamed_135[n19] = sprsrg8.cfr_renamed_135[n19] - 1;
            sprsrg8.cfr_renamed_31[this.cfr_renamed_135[n2]] = n4++;
            n18 = n4;
        }
        sprsrg sprsrg9 = this;
        sprsrg sprsrg10 = this;
        int n20 = n2 = ((sprsrg9.cfr_renamed_114[sprsrg9.cfr_renamed_102] & 0xFF) << 8) + (sprsrg10.cfr_renamed_114[1] & 0xFF);
        sprsrg10.cfr_renamed_135[n20] = sprsrg10.cfr_renamed_135[n20] - 1;
        sprsrg9.cfr_renamed_31[this.cfr_renamed_135[n2]] = this.cfr_renamed_102 - 1;
        int n21 = n4 = 0;
        while (n21 <= 255) {
            int n22 = n4++;
            nArray[n22] = n22;
            n21 = n4;
        }
        int n23 = 1;
        while ((n23 = 3 * n23 + 1) <= 256) {
        }
        do {
            int n24 = n4 = (n23 /= 3);
            while (n24 <= 255) {
                block28: {
                    int[] nArray3;
                    n = nArray[n4];
                    n2 = n4;
                    while (this.cfr_renamed_135[nArray[n2 - n23] + 1 << 8] - this.cfr_renamed_135[nArray[n2 - n23] << 8] > this.cfr_renamed_135[n + 1 << 8] - this.cfr_renamed_135[n << 8]) {
                        int n25 = n2;
                        nArray[n25] = nArray[n2 - n23];
                        n2 = n25 - n23;
                        if (n2 > n23 - 1) continue;
                        nArray3 = nArray;
                        break block28;
                    }
                    nArray3 = nArray;
                }
                nArray3[n2] = n;
                n24 = ++n4;
            }
        } while (n23 != 1);
        int n26 = n4 = 0;
        while (n26 <= 255) {
            int n27 = nArray[n4];
            int n28 = n2 = 0;
            while (n28 <= 255) {
                int n29 = (n27 << 8) + n2;
                if ((this.cfr_renamed_135[n29] & 0x200000) != 0x200000) {
                    sprsrg sprsrg11 = this;
                    n23 = (sprsrg11.cfr_renamed_135[n29 + 1] & 0xFFDFFFFF) - 1;
                    n = sprsrg11.cfr_renamed_135[n29] & 0xFFDFFFFF;
                    if (n23 > n) {
                        sprsrg sprsrg12 = this;
                        sprsrg12.cfr_renamed_4967(n, n23, 2);
                        if (sprsrg12.cfr_renamed_1228 > this.cfr_renamed_728 && this.cfr_renamed_185) {
                            return;
                        }
                    }
                    int n30 = n29;
                    this.cfr_renamed_135[n30] = this.cfr_renamed_135[n30] | 0x200000;
                }
                n28 = ++n2;
            }
            blArray[n27] = true;
            if (n4 < 255) {
                sprsrg sprsrg13 = this;
                n = sprsrg13.cfr_renamed_135[n27 << 8] & 0xFFDFFFFF;
                n23 = (sprsrg13.cfr_renamed_135[n27 + 1 << 8] & 0xFFDFFFFF) - n;
                int n31 = 0;
                int n32 = n23;
                while (n32 >> n31 > 65534) {
                    n32 = n23;
                    ++n31;
                }
                int n33 = n2 = 0;
                while (n33 < n23) {
                    short s;
                    sprsrg sprsrg14 = this;
                    int n34 = sprsrg14.cfr_renamed_31[n + n2] + 1;
                    sprsrg14.cfr_renamed_499[n34] = s = (short)(n2 >> n31);
                    if (n34 <= 20) {
                        this.cfr_renamed_499[n34 + this.cfr_renamed_102] = s;
                    }
                    n33 = ++n2;
                }
                if (n23 - 1 >> n31 > 65535) {
                    throw new IllegalStateException();
                }
            }
            int n35 = n2 = 0;
            while (n35 <= 255) {
                int n36 = n2++;
                nArray2[n36] = this.cfr_renamed_135[(n36 << 8) + n27] & 0xFFDFFFFF;
                n35 = n2;
            }
            int n37 = n2 = this.cfr_renamed_135[n27 << 8] & 0xFFDFFFFF;
            while (n37 < (this.cfr_renamed_135[n27 + 1 << 8] & 0xFFDFFFFF)) {
                sprsrg sprsrg15 = this;
                n12 = sprsrg15.cfr_renamed_114[sprsrg15.cfr_renamed_31[n2]] & 0xFF;
                if (!blArray[n12]) {
                    sprsrg sprsrg16 = this;
                    this.cfr_renamed_31[nArray2[n12]] = (this.cfr_renamed_31[n2] == 0 ? sprsrg16.cfr_renamed_102 : sprsrg16.cfr_renamed_31[n2]) - 1;
                    int n38 = n12;
                    nArray2[n38] = nArray2[n38] + 1;
                }
                n37 = ++n2;
            }
            int n39 = n2 = 0;
            while (n39 <= 255) {
                int n40 = (n2 << 8) + n27;
                this.cfr_renamed_135[n40] = this.cfr_renamed_135[n40] | 0x200000;
                n39 = ++n2;
            }
            n26 = ++n4;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_4970() throws IOException {
        sprsrg sprsrg2 = this;
        if (sprsrg2.cfr_renamed_102 > sprsrg2.cfr_renamed_132) {
            sprsrg sprsrg3 = this;
            sprsrg3.cfr_renamed_4971();
            sprsrg3.cfr_renamed_4954();
        }
        sprsrg sprsrg4 = this;
        sprsrg4.cfr_renamed_287[sprsrg4.cfr_renamed_957] = true;
        switch (sprsrg4.cfr_renamed_951) {
            case 1: {
                this.cfr_renamed_114[++this.cfr_renamed_102] = (byte)this.cfr_renamed_957;
                sprsrg sprsrg5 = this;
                sprsrg5.cfr_renamed_128.cfr_renamed_11084(sprsrg5.cfr_renamed_957);
                return;
            }
            case 2: {
                this.cfr_renamed_114[++this.cfr_renamed_102] = (byte)this.cfr_renamed_957;
                this.cfr_renamed_114[++this.cfr_renamed_102] = (byte)this.cfr_renamed_957;
                sprsrg sprsrg6 = this;
                this.cfr_renamed_128.cfr_renamed_11084(sprsrg6.cfr_renamed_957);
                sprsrg6.cfr_renamed_128.cfr_renamed_11084(this.cfr_renamed_957);
                return;
            }
            case 3: {
                this.cfr_renamed_114[++this.cfr_renamed_102] = (byte)this.cfr_renamed_957;
                this.cfr_renamed_114[++this.cfr_renamed_102] = (byte)this.cfr_renamed_957;
                this.cfr_renamed_114[++this.cfr_renamed_102] = (byte)this.cfr_renamed_957;
                sprsrg sprsrg7 = this;
                sprsrg sprsrg8 = this;
                sprsrg7.cfr_renamed_128.cfr_renamed_11084(sprsrg8.cfr_renamed_957);
                sprsrg7.cfr_renamed_128.cfr_renamed_11084(this.cfr_renamed_957);
                sprsrg8.cfr_renamed_128.cfr_renamed_11084(this.cfr_renamed_957);
                return;
            }
        }
        this.cfr_renamed_114[++this.cfr_renamed_102] = (byte)this.cfr_renamed_957;
        this.cfr_renamed_114[++this.cfr_renamed_102] = (byte)this.cfr_renamed_957;
        this.cfr_renamed_114[++this.cfr_renamed_102] = (byte)this.cfr_renamed_957;
        this.cfr_renamed_114[++this.cfr_renamed_102] = (byte)this.cfr_renamed_957;
        this.cfr_renamed_114[++this.cfr_renamed_102] = (byte)(this.cfr_renamed_951 - 4);
        sprsrg sprsrg9 = this;
        this.cfr_renamed_287[sprsrg9.cfr_renamed_951 - 4] = true;
        sprsrg sprsrg10 = this;
        sprsrg9.cfr_renamed_128.cfr_renamed_11523(sprsrg10.cfr_renamed_957, sprsrg10.cfr_renamed_951);
    }

    static {
        short[] sArray = new short[512];
        sArray[0] = 619;
        sArray[1] = 720;
        sArray[2] = 127;
        sArray[3] = 481;
        sArray[4] = 931;
        sArray[5] = 816;
        sArray[6] = 813;
        sArray[7] = 233;
        sArray[8] = 566;
        sArray[9] = 247;
        sArray[10] = 985;
        sArray[11] = 724;
        sArray[12] = 205;
        sArray[13] = 454;
        sArray[14] = 863;
        sArray[15] = 491;
        sArray[16] = 741;
        sArray[17] = 242;
        sArray[18] = 949;
        sArray[19] = 214;
        sArray[20] = 733;
        sArray[21] = 859;
        sArray[22] = 335;
        sArray[23] = 708;
        sArray[24] = 621;
        sArray[25] = 574;
        sArray[26] = 73;
        sArray[27] = 654;
        sArray[28] = 730;
        sArray[29] = 472;
        sArray[30] = 419;
        sArray[31] = 436;
        sArray[32] = 278;
        sArray[33] = 496;
        sArray[34] = 867;
        sArray[35] = 210;
        sArray[36] = 399;
        sArray[37] = 680;
        sArray[38] = 480;
        sArray[39] = 51;
        sArray[40] = 878;
        sArray[41] = 465;
        sArray[42] = 811;
        sArray[43] = 169;
        sArray[44] = 869;
        sArray[45] = 675;
        sArray[46] = 611;
        sArray[47] = 697;
        sArray[48] = 867;
        sArray[49] = 561;
        sArray[50] = 862;
        sArray[51] = 687;
        sArray[52] = 507;
        sArray[53] = 283;
        sArray[54] = 482;
        sArray[55] = 129;
        sArray[56] = 807;
        sArray[57] = 591;
        sArray[58] = 733;
        sArray[59] = 623;
        sArray[60] = 150;
        sArray[61] = 238;
        sArray[62] = 59;
        sArray[63] = 379;
        sArray[64] = 684;
        sArray[65] = 877;
        sArray[66] = 625;
        sArray[67] = 169;
        sArray[68] = 643;
        sArray[69] = 105;
        sArray[70] = 170;
        sArray[71] = 607;
        sArray[72] = 520;
        sArray[73] = 932;
        sArray[74] = 727;
        sArray[75] = 476;
        sArray[76] = 693;
        sArray[77] = 425;
        sArray[78] = 174;
        sArray[79] = 647;
        sArray[80] = 73;
        sArray[81] = 122;
        sArray[82] = 335;
        sArray[83] = 530;
        sArray[84] = 442;
        sArray[85] = 853;
        sArray[86] = 695;
        sArray[87] = 249;
        sArray[88] = 445;
        sArray[89] = 515;
        sArray[90] = 909;
        sArray[91] = 545;
        sArray[92] = 703;
        sArray[93] = 919;
        sArray[94] = 874;
        sArray[95] = 474;
        sArray[96] = 882;
        sArray[97] = 500;
        sArray[98] = 594;
        sArray[99] = 612;
        sArray[100] = 641;
        sArray[101] = 801;
        sArray[102] = 220;
        sArray[103] = 162;
        sArray[104] = 819;
        sArray[105] = 984;
        sArray[106] = 589;
        sArray[107] = 513;
        sArray[108] = 495;
        sArray[109] = 799;
        sArray[110] = 161;
        sArray[111] = 604;
        sArray[112] = 958;
        sArray[113] = 533;
        sArray[114] = 221;
        sArray[115] = 400;
        sArray[116] = 386;
        sArray[117] = 867;
        sArray[118] = 600;
        sArray[119] = 782;
        sArray[120] = 382;
        sArray[121] = 596;
        sArray[122] = 414;
        sArray[123] = 171;
        sArray[124] = 516;
        sArray[125] = 375;
        sArray[126] = 682;
        sArray[127] = 485;
        sArray[128] = 911;
        sArray[129] = 276;
        sArray[130] = 98;
        sArray[131] = 553;
        sArray[132] = 163;
        sArray[133] = 354;
        sArray[134] = 666;
        sArray[135] = 933;
        sArray[136] = 424;
        sArray[137] = 341;
        sArray[138] = 533;
        sArray[139] = 870;
        sArray[140] = 227;
        sArray[141] = 730;
        sArray[142] = 475;
        sArray[143] = 186;
        sArray[144] = 263;
        sArray[145] = 647;
        sArray[146] = 537;
        sArray[147] = 686;
        sArray[148] = 600;
        sArray[149] = 224;
        sArray[150] = 469;
        sArray[151] = 68;
        sArray[152] = 770;
        sArray[153] = 919;
        sArray[154] = 190;
        sArray[155] = 373;
        sArray[156] = 294;
        sArray[157] = 822;
        sArray[158] = 808;
        sArray[159] = 206;
        sArray[160] = 184;
        sArray[161] = 943;
        sArray[162] = 795;
        sArray[163] = 384;
        sArray[164] = 383;
        sArray[165] = 461;
        sArray[166] = 404;
        sArray[167] = 758;
        sArray[168] = 839;
        sArray[169] = 887;
        sArray[170] = 715;
        sArray[171] = 67;
        sArray[172] = 618;
        sArray[173] = 276;
        sArray[174] = 204;
        sArray[175] = 918;
        sArray[176] = 873;
        sArray[177] = 777;
        sArray[178] = 604;
        sArray[179] = 560;
        sArray[180] = 951;
        sArray[181] = 160;
        sArray[182] = 578;
        sArray[183] = 722;
        sArray[184] = 79;
        sArray[185] = 804;
        sArray[186] = 96;
        sArray[187] = 409;
        sArray[188] = 713;
        sArray[189] = 940;
        sArray[190] = 652;
        sArray[191] = 934;
        sArray[192] = 970;
        sArray[193] = 447;
        sArray[194] = 318;
        sArray[195] = 353;
        sArray[196] = 859;
        sArray[197] = 672;
        sArray[198] = 112;
        sArray[199] = 785;
        sArray[200] = 645;
        sArray[201] = 863;
        sArray[202] = 803;
        sArray[203] = 350;
        sArray[204] = 139;
        sArray[205] = 93;
        sArray[206] = 354;
        sArray[207] = 99;
        sArray[208] = 820;
        sArray[209] = 908;
        sArray[210] = 609;
        sArray[211] = 772;
        sArray[212] = 154;
        sArray[213] = 274;
        sArray[214] = 580;
        sArray[215] = 184;
        sArray[216] = 79;
        sArray[217] = 626;
        sArray[218] = 630;
        sArray[219] = 742;
        sArray[220] = 653;
        sArray[221] = 282;
        sArray[222] = 762;
        sArray[223] = 623;
        sArray[224] = 680;
        sArray[225] = 81;
        sArray[226] = 927;
        sArray[227] = 626;
        sArray[228] = 789;
        sArray[229] = 125;
        sArray[230] = 411;
        sArray[231] = 521;
        sArray[232] = 938;
        sArray[233] = 300;
        sArray[234] = 821;
        sArray[235] = 78;
        sArray[236] = 343;
        sArray[237] = 175;
        sArray[238] = 128;
        sArray[239] = 250;
        sArray[240] = 170;
        sArray[241] = 774;
        sArray[242] = 972;
        sArray[243] = 275;
        sArray[244] = 999;
        sArray[245] = 639;
        sArray[246] = 495;
        sArray[247] = 78;
        sArray[248] = 352;
        sArray[249] = 126;
        sArray[250] = 857;
        sArray[251] = 956;
        sArray[252] = 358;
        sArray[253] = 619;
        sArray[254] = 580;
        sArray[255] = 124;
        sArray[256] = 737;
        sArray[257] = 594;
        sArray[258] = 701;
        sArray[259] = 612;
        sArray[260] = 669;
        sArray[261] = 112;
        sArray[262] = 134;
        sArray[263] = 694;
        sArray[264] = 363;
        sArray[265] = 992;
        sArray[266] = 809;
        sArray[267] = 743;
        sArray[268] = 168;
        sArray[269] = 974;
        sArray[270] = 944;
        sArray[271] = 375;
        sArray[272] = 748;
        sArray[273] = 52;
        sArray[274] = 600;
        sArray[275] = 747;
        sArray[276] = 642;
        sArray[277] = 182;
        sArray[278] = 862;
        sArray[279] = 81;
        sArray[280] = 344;
        sArray[281] = 805;
        sArray[282] = 988;
        sArray[283] = 739;
        sArray[284] = 511;
        sArray[285] = 655;
        sArray[286] = 814;
        sArray[287] = 334;
        sArray[288] = 249;
        sArray[289] = 515;
        sArray[290] = 897;
        sArray[291] = 955;
        sArray[292] = 664;
        sArray[293] = 981;
        sArray[294] = 649;
        sArray[295] = 113;
        sArray[296] = 974;
        sArray[297] = 459;
        sArray[298] = 893;
        sArray[299] = 228;
        sArray[300] = 433;
        sArray[301] = 837;
        sArray[302] = 553;
        sArray[303] = 268;
        sArray[304] = 926;
        sArray[305] = 240;
        sArray[306] = 102;
        sArray[307] = 654;
        sArray[308] = 459;
        sArray[309] = 51;
        sArray[310] = 686;
        sArray[311] = 754;
        sArray[312] = 806;
        sArray[313] = 760;
        sArray[314] = 493;
        sArray[315] = 403;
        sArray[316] = 415;
        sArray[317] = 394;
        sArray[318] = 687;
        sArray[319] = 700;
        sArray[320] = 946;
        sArray[321] = 670;
        sArray[322] = 656;
        sArray[323] = 610;
        sArray[324] = 738;
        sArray[325] = 392;
        sArray[326] = 760;
        sArray[327] = 799;
        sArray[328] = 887;
        sArray[329] = 653;
        sArray[330] = 978;
        sArray[331] = 321;
        sArray[332] = 576;
        sArray[333] = 617;
        sArray[334] = 626;
        sArray[335] = 502;
        sArray[336] = 894;
        sArray[337] = 679;
        sArray[338] = 243;
        sArray[339] = 440;
        sArray[340] = 680;
        sArray[341] = 879;
        sArray[342] = 194;
        sArray[343] = 572;
        sArray[344] = 640;
        sArray[345] = 724;
        sArray[346] = 926;
        sArray[347] = 56;
        sArray[348] = 204;
        sArray[349] = 700;
        sArray[350] = 707;
        sArray[351] = 151;
        sArray[352] = 457;
        sArray[353] = 449;
        sArray[354] = 797;
        sArray[355] = 195;
        sArray[356] = 791;
        sArray[357] = 558;
        sArray[358] = 945;
        sArray[359] = 679;
        sArray[360] = 297;
        sArray[361] = 59;
        sArray[362] = 87;
        sArray[363] = 824;
        sArray[364] = 713;
        sArray[365] = 663;
        sArray[366] = 412;
        sArray[367] = 693;
        sArray[368] = 342;
        sArray[369] = 606;
        sArray[370] = 134;
        sArray[371] = 108;
        sArray[372] = 571;
        sArray[373] = 364;
        sArray[374] = 631;
        sArray[375] = 212;
        sArray[376] = 174;
        sArray[377] = 643;
        sArray[378] = 304;
        sArray[379] = 329;
        sArray[380] = 343;
        sArray[381] = 97;
        sArray[382] = 430;
        sArray[383] = 751;
        sArray[384] = 497;
        sArray[385] = 314;
        sArray[386] = 983;
        sArray[387] = 374;
        sArray[388] = 822;
        sArray[389] = 928;
        sArray[390] = 140;
        sArray[391] = 206;
        sArray[392] = 73;
        sArray[393] = 263;
        sArray[394] = 980;
        sArray[395] = 736;
        sArray[396] = 876;
        sArray[397] = 478;
        sArray[398] = 430;
        sArray[399] = 305;
        sArray[400] = 170;
        sArray[401] = 514;
        sArray[402] = 364;
        sArray[403] = 692;
        sArray[404] = 829;
        sArray[405] = 82;
        sArray[406] = 855;
        sArray[407] = 953;
        sArray[408] = 676;
        sArray[409] = 246;
        sArray[410] = 369;
        sArray[411] = 970;
        sArray[412] = 294;
        sArray[413] = 750;
        sArray[414] = 807;
        sArray[415] = 827;
        sArray[416] = 150;
        sArray[417] = 790;
        sArray[418] = 288;
        sArray[419] = 923;
        sArray[420] = 804;
        sArray[421] = 378;
        sArray[422] = 215;
        sArray[423] = 828;
        sArray[424] = 592;
        sArray[425] = 281;
        sArray[426] = 565;
        sArray[427] = 555;
        sArray[428] = 710;
        sArray[429] = 82;
        sArray[430] = 896;
        sArray[431] = 831;
        sArray[432] = 547;
        sArray[433] = 261;
        sArray[434] = 524;
        sArray[435] = 462;
        sArray[436] = 293;
        sArray[437] = 465;
        sArray[438] = 502;
        sArray[439] = 56;
        sArray[440] = 661;
        sArray[441] = 821;
        sArray[442] = 976;
        sArray[443] = 991;
        sArray[444] = 658;
        sArray[445] = 869;
        sArray[446] = 905;
        sArray[447] = 758;
        sArray[448] = 745;
        sArray[449] = 193;
        sArray[450] = 768;
        sArray[451] = 550;
        sArray[452] = 608;
        sArray[453] = 933;
        sArray[454] = 378;
        sArray[455] = 286;
        sArray[456] = 215;
        sArray[457] = 979;
        sArray[458] = 792;
        sArray[459] = 961;
        sArray[460] = 61;
        sArray[461] = 688;
        sArray[462] = 793;
        sArray[463] = 644;
        sArray[464] = 986;
        sArray[465] = 403;
        sArray[466] = 106;
        sArray[467] = 366;
        sArray[468] = 905;
        sArray[469] = 644;
        sArray[470] = 372;
        sArray[471] = 567;
        sArray[472] = 466;
        sArray[473] = 434;
        sArray[474] = 645;
        sArray[475] = 210;
        sArray[476] = 389;
        sArray[477] = 550;
        sArray[478] = 919;
        sArray[479] = 135;
        sArray[480] = 780;
        sArray[481] = 773;
        sArray[482] = 635;
        sArray[483] = 389;
        sArray[484] = 707;
        sArray[485] = 100;
        sArray[486] = 626;
        sArray[487] = 958;
        sArray[488] = 165;
        sArray[489] = 504;
        sArray[490] = 920;
        sArray[491] = 176;
        sArray[492] = 193;
        sArray[493] = 713;
        sArray[494] = 857;
        sArray[495] = 265;
        sArray[496] = 203;
        sArray[497] = 50;
        sArray[498] = 668;
        sArray[499] = 108;
        sArray[500] = 645;
        sArray[501] = 990;
        sArray[502] = 626;
        sArray[503] = 197;
        sArray[504] = 510;
        sArray[505] = 357;
        sArray[506] = 358;
        sArray[507] = 850;
        sArray[508] = 858;
        sArray[509] = 364;
        sArray[510] = 936;
        sArray[511] = 638;
        cfr_renamed_96 = sArray;
        int[] nArray = new int[14];
        nArray[0] = 1;
        nArray[1] = 4;
        nArray[2] = 13;
        nArray[3] = 40;
        nArray[4] = 121;
        nArray[5] = 364;
        nArray[6] = 1093;
        nArray[7] = 3280;
        nArray[8] = 9841;
        nArray[9] = 29524;
        nArray[10] = 88573;
        nArray[11] = 265720;
        nArray[12] = 797161;
        nArray[13] = 2391484;
        cfr_renamed_952 = nArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprsrg(OutputStream outputStream, int n) throws IOException {
        sprsrg sprsrg2;
        int arg1;
        void arg0;
        sprsrg sprsrg3 = this;
        sprsrg sprsrg4 = this;
        sprsrg sprsrg5 = this;
        sprsrg sprsrg6 = this;
        sprsrg sprsrg7 = this;
        sprsrg sprsrg8 = this;
        sprsrg sprsrg9 = this;
        sprsrg sprsrg10 = this;
        this.cfr_renamed_4 = new Vector();
        sprsrg10.cfr_renamed_128 = new sprxxm();
        sprsrg9.cfr_renamed_287 = new boolean[256];
        sprsrg9.cfr_renamed_107 = new byte[18002];
        sprsrg8.cfr_renamed_1226 = new int[258];
        sprsrg8.cfr_renamed_957 = -1;
        sprsrg7.cfr_renamed_951 = 0;
        sprsrg7.spr\ufe34 = false;
        sprsrg6.cfr_renamed_114 = null;
        sprsrg6.cfr_renamed_499 = null;
        sprsrg5.cfr_renamed_31 = null;
        sprsrg5.cfr_renamed_135 = null;
        void v8 = arg0;
        v8.write(66);
        arg0.write(90);
        sprsrg4.cfr_renamed_955 = v8;
        sprsrg4.cfr_renamed_79 = 0;
        sprsrg3.cfr_renamed_145 = 32;
        sprsrg3.cfr_renamed_724 = 50;
        if (n > 9) {
            arg1 = 9;
            sprsrg2 = this;
        } else {
            if (arg1 < 1) {
                arg1 = 1;
            }
            sprsrg2 = this;
        }
        sprsrg2.cfr_renamed_105 = arg1;
        sprsrg sprsrg11 = this;
        sprsrg11.cfr_renamed_132 = 100000 * this.cfr_renamed_105 - 20;
        int n2 = 100000 * this.cfr_renamed_105;
        this.cfr_renamed_114 = new byte[n2 + 1 + 20];
        sprsrg11.cfr_renamed_499 = new short[n2 + 1 + 20];
        this.cfr_renamed_31 = new int[n2];
        this.cfr_renamed_135 = new int[65537];
        this.cfr_renamed_82 = this.cfr_renamed_31;
        arg0.write(104);
        arg0.write(48 + this.cfr_renamed_105);
        this.cfr_renamed_314 = 0;
        this.cfr_renamed_4954();
    }

    private /* synthetic */ void cfr_renamed_4971() throws IOException {
        sprsrg sprsrg2 = this;
        int n = sprsrg2.cfr_renamed_128.cfr_renamed_11522();
        sprsrg2.cfr_renamed_314 = spruaf.cfr_renamed_494(sprsrg2.cfr_renamed_314, 1) ^ n;
        sprsrg2.cfr_renamed_4950();
        sprsrg2.cfr_renamed_11532(54156738319193L);
        sprsrg2.cfr_renamed_11531(n);
        sprsrg2.cfr_renamed_11526(sprsrg2.cfr_renamed_953 ? 1 : 0);
        this.cfr_renamed_4959();
    }

    private /* synthetic */ void cfr_renamed_4965() throws IOException {
        if (this.cfr_renamed_145 < 32) {
            sprsrg sprsrg2 = this;
            sprsrg sprsrg3 = this;
            sprsrg3.cfr_renamed_955.write(sprsrg3.cfr_renamed_79 >>> 24);
            sprsrg2.cfr_renamed_79 = 0;
            sprsrg2.cfr_renamed_145 = 32;
        }
    }

    private /* synthetic */ void cfr_renamed_4959() throws IOException {
        sprsrg sprsrg2 = this;
        sprsrg sprsrg3 = this;
        sprsrg2.cfr_renamed_11528(24, sprsrg3.cfr_renamed_137);
        sprsrg3.cfr_renamed_4958();
        sprsrg2.cfr_renamed_4961();
    }

    private /* synthetic */ void cfr_renamed_4974() throws IOException {
        sprsrg sprsrg2 = this;
        sprsrg2.cfr_renamed_11532(25779555029136L);
        sprsrg2.cfr_renamed_11531(sprsrg2.cfr_renamed_314);
        sprsrg2.cfr_renamed_4965();
    }

    private /* synthetic */ void cfr_renamed_11526(int arg0) throws IOException {
        sprsrg sprsrg2 = this;
        --sprsrg2.cfr_renamed_145;
        sprsrg2.cfr_renamed_79 |= arg0 << this.cfr_renamed_145;
        if (sprsrg2.cfr_renamed_145 <= 24) {
            sprsrg sprsrg3 = this;
            sprsrg sprsrg4 = this;
            sprsrg3.cfr_renamed_955.write(sprsrg4.cfr_renamed_79 >>> 24);
            sprsrg3.cfr_renamed_79 <<= 8;
            sprsrg4.cfr_renamed_145 += 8;
        }
    }

    private /* synthetic */ void cfr_renamed_4954() {
        int n;
        this.cfr_renamed_128.cfr_renamed_11521();
        this.cfr_renamed_102 = 0;
        int n2 = n = 0;
        while (n2 < 256) {
            this.cfr_renamed_287[n++] = false;
            n2 = n;
        }
    }

    public static void cfr_renamed_11525(byte[] arg0, int[] arg1, int arg2, int arg3) {
        int n;
        int[] nArray = new int[260];
        int[] nArray2 = new int[516];
        int[] nArray3 = new int[516];
        int n2 = n = 0;
        while (n2 < arg2) {
            nArray2[n + 1] = (arg1[n] == 0 ? 1 : arg1[n]) << 8;
            n2 = ++n;
        }
        block1: while (true) {
            int n3;
            int n4;
            int n5;
            int n6 = arg2;
            int n7 = 0;
            nArray[0] = 0;
            nArray2[0] = 0;
            nArray3[0] = -2;
            int n8 = n = 1;
            while (n8 <= arg2) {
                int[] nArray4 = nArray2;
                nArray3[n] = -1;
                nArray[++n7] = n;
                n5 = n7;
                n4 = nArray[n5];
                while (nArray4[n4] < nArray2[nArray[n5 >> 1]]) {
                    nArray4 = nArray2;
                    int n9 = n5;
                    nArray[n9] = nArray[n5 >> 1];
                    n5 = n9 >> 1;
                }
                nArray[n5] = n4;
                n8 = ++n;
            }
            if (n7 >= 260) {
                throw new IllegalStateException();
            }
            int n10 = n7;
            while (n10 > 1) {
                int n11 = nArray[1];
                int n12 = nArray[n7];
                --n7;
                nArray[1] = n12;
                n5 = 0;
                n4 = 0;
                int n13 = 0;
                n5 = 1;
                n13 = nArray[1];
                int n14 = n5;
                while (true) {
                    int[] nArray5;
                    if ((n4 = n14 << 1) > n7) {
                        nArray5 = nArray;
                        break;
                    }
                    if (n4 < n7 && nArray2[nArray[n4 + 1]] < nArray2[nArray[n4]]) {
                        ++n4;
                    }
                    if (nArray2[n13] < nArray2[nArray[n4]]) {
                        nArray5 = nArray;
                        break;
                    }
                    nArray[n5] = nArray[n4];
                    n14 = n4;
                }
                nArray5[n5] = n13;
                int n15 = nArray[1];
                int n16 = nArray[n7];
                --n7;
                nArray[1] = n16;
                n5 = 0;
                n4 = 0;
                n13 = 0;
                n5 = 1;
                n13 = nArray[1];
                int n17 = n5;
                while (true) {
                    int[] nArray6;
                    if ((n4 = n17 << 1) > n7) {
                        nArray6 = nArray;
                        break;
                    }
                    if (n4 < n7 && nArray2[nArray[n4 + 1]] < nArray2[nArray[n4]]) {
                        ++n4;
                    }
                    if (nArray2[n13] < nArray2[nArray[n4]]) {
                        nArray6 = nArray;
                        break;
                    }
                    nArray[n5] = nArray[n4];
                    n17 = n4;
                }
                nArray6[n5] = n13;
                nArray3[n11] = nArray3[n15] = ++n6;
                nArray2[n6] = (nArray2[n11] & 0xFFFFFF00) + (nArray2[n15] & 0xFFFFFF00) | 1 + ((nArray2[n11] & 0xFF) > (nArray2[n15] & 0xFF) ? nArray2[n11] & 0xFF : nArray2[n15] & 0xFF);
                int[] nArray7 = nArray2;
                nArray3[n6] = -1;
                nArray[++n7] = n6;
                n5 = 0;
                n4 = 0;
                n5 = n7;
                n4 = nArray[n5];
                while (nArray7[n4] < nArray2[nArray[n5 >> 1]]) {
                    nArray7 = nArray2;
                    int n18 = n5;
                    nArray[n18] = nArray[n5 >> 1];
                    n5 = n18 >> 1;
                }
                nArray[n5] = n4;
                n10 = n7;
            }
            if (n6 >= 516) {
                throw new IllegalStateException();
            }
            n5 = 0;
            int n19 = n = 1;
            while (n19 <= arg2) {
                n3 = 0;
                int n20 = n;
                int[] nArray8 = nArray3;
                while (nArray8[n20] >= 0) {
                    nArray8 = nArray3;
                    ++n3;
                    n20 = nArray3[n20];
                }
                arg0[n - 1] = (byte)n3;
                n5 |= arg3 - n3;
                n19 = ++n;
            }
            if (n5 >= 0) {
                return;
            }
            int n21 = n = 1;
            while (true) {
                if (n21 > arg2) continue block1;
                n3 = nArray2[n] >> 8;
                n3 = 1 + n3 / 2;
                nArray2[n++] = n3 << 8;
                n21 = n;
            }
            break;
        }
    }

    private /* synthetic */ void cfr_renamed_4969(int arg0, int arg1, int arg2) {
        while (--arg2 >= 0) {
            sprsrg sprsrg2 = this;
            int n = sprsrg2.cfr_renamed_31[arg0];
            int n2 = sprsrg2.cfr_renamed_31[arg1];
            sprsrg2.cfr_renamed_31[arg0++] = n2;
            sprsrg2.cfr_renamed_31[arg1++] = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_11532(long l) throws IOException {
        void arg0;
        sprsrg sprsrg2 = this;
        sprsrg2.cfr_renamed_11528(24, (int)(arg0 >>> 24) & 0xFFFFFF);
        sprsrg2.cfr_renamed_11528(24, (int)arg0 & 0xFFFFFF);
    }

    public sprsrg(OutputStream arg0) throws IOException {
        this(arg0, 9);
    }
}

