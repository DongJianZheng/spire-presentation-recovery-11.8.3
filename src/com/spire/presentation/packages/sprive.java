/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfl;
import com.spire.presentation.packages.sprnyq;
import com.spire.presentation.packages.sprtte;
import com.spire.presentation.packages.spruue;
import java.io.IOException;
import java.io.OutputStream;

public class sprive
extends OutputStream
implements sprfl {
    private int cfr_renamed_805;
    public int cfr_renamed_131;
    public int cfr_renamed_722;
    private int cfr_renamed_955;
    public static final int cfr_renamed_1228 = 15;
    public static final int cfr_renamed_1260 = 0;
    private char[] cfr_renamed_499;
    public static final int cfr_renamed_135 = 10;
    private int[] cfr_renamed_956;
    private boolean[] cfr_renamed_952;
    private int cfr_renamed_728;
    private boolean cfr_renamed_128;
    private int cfr_renamed_957;
    private short[] cfr_renamed_314;
    public int cfr_renamed_951;
    private char[] cfr_renamed_84;
    private char[] cfr_renamed_723;
    public boolean cfr_renamed_1226;
    public int cfr_renamed_287;
    private char[] cfr_renamed_724;
    public static final int cfr_renamed_953 = -2097153;
    private int[] cfr_renamed_133;
    private int cfr_renamed_185;
    public static final int spr\ufe34 = 0x200000;
    public sprtte cfr_renamed_82;
    public static final int cfr_renamed_126 = 20;
    private int cfr_renamed_88;
    private int[] cfr_renamed_31;
    public boolean cfr_renamed_272;
    private int cfr_renamed_145;
    public static final int cfr_renamed_114 = 1000;
    private char[] cfr_renamed_96;
    public int cfr_renamed_105;
    private int cfr_renamed_137;
    public int cfr_renamed_79;
    private boolean cfr_renamed_107;
    private int cfr_renamed_132;
    private int cfr_renamed_102;
    private int[] cfr_renamed_91;
    private int[] cfr_renamed_0;
    private OutputStream cfr_renamed_1;
    private int cfr_renamed_2;

    @Override
    public void flush() throws IOException {
        sprive sprive2 = this;
        super.flush();
        sprive2.cfr_renamed_1.flush();
    }

    private /* synthetic */ void cfr_renamed_4950() {
        sprive sprive2;
        block4: {
            int n;
            this.cfr_renamed_805 = this.cfr_renamed_102 * this.cfr_renamed_287;
            this.cfr_renamed_185 = 0;
            this.cfr_renamed_1226 = 0;
            this.cfr_renamed_128 = true;
            this.cfr_renamed_4951();
            if (this.cfr_renamed_185 > this.cfr_renamed_805 && this.cfr_renamed_128) {
                this.cfr_renamed_4952();
                this.cfr_renamed_185 = 0;
                this.cfr_renamed_805 = 0;
                this.cfr_renamed_1226 = true;
                this.cfr_renamed_128 = false;
                this.cfr_renamed_4951();
            }
            this.cfr_renamed_722 = -1;
            int n2 = n = 0;
            while (n2 <= this.cfr_renamed_287) {
                if (this.cfr_renamed_31[n] == 0) {
                    sprive2 = this;
                    this.cfr_renamed_722 = n;
                    break block4;
                }
                n2 = ++n;
            }
            sprive2 = this;
        }
        if (sprive2.cfr_renamed_722 == -1) {
            System.out.println(sprnyq.cfr_renamed_9("\t^\u0017V\u001a"));
        }
    }

    private /* synthetic */ char cfr_renamed_4953(char arg0, char arg1, char arg2) {
        if (arg0 > arg1) {
            char c = arg0;
            arg0 = arg1;
            arg1 = c;
        }
        if (arg1 > arg2) {
            char c = arg1;
            arg1 = arg2;
            arg2 = c;
        }
        if (arg0 > arg1) {
            arg1 = arg0;
        }
        return arg1;
    }

    private /* synthetic */ void cfr_renamed_4954() {
        int n;
        this.cfr_renamed_82.cfr_renamed_4945();
        this.cfr_renamed_287 = -1;
        int n2 = n = 0;
        while (n2 < 256) {
            this.cfr_renamed_952[n++] = false;
            n2 = n;
        }
        this.cfr_renamed_728 = 100000 * this.cfr_renamed_951 - 20;
    }

    private /* synthetic */ void cfr_renamed_4955() {
        int n;
        this.cfr_renamed_957 = 0;
        int n2 = n = 0;
        while (n2 < 256) {
            if (this.cfr_renamed_952[n]) {
                sprive sprive2 = this;
                sprive sprive3 = this;
                sprive2.cfr_renamed_84[sprive3.cfr_renamed_957] = (char)n;
                sprive2.cfr_renamed_723[n] = (char)this.cfr_renamed_957;
                ++sprive3.cfr_renamed_957;
            }
            n2 = ++n;
        }
    }

    public void finalize() throws Throwable {
        sprive sprive2 = this;
        sprive2.close();
        super.finalize();
    }

    private /* synthetic */ void cfr_renamed_4956(int arg0) throws IOException {
        this.cfr_renamed_4957(8, arg0);
    }

    private /* synthetic */ void cfr_renamed_4958() {
        int n;
        int n2;
        block21: {
            sprive sprive2;
            int n3;
            char[] cArray = new char[256];
            sprive sprive3 = this;
            sprive3.cfr_renamed_4955();
            n2 = sprive3.cfr_renamed_957 + 1;
            int n4 = n3 = 0;
            while (n4 <= n2) {
                this.cfr_renamed_91[n3++] = 0;
                n4 = n3;
            }
            n = 0;
            int n5 = 0;
            int n6 = n3 = 0;
            while (n6 < this.cfr_renamed_957) {
                int n7 = n3++;
                cArray[n7] = (char)n7;
                n6 = n3;
            }
            int n8 = n3 = 0;
            while (n8 <= this.cfr_renamed_287) {
                sprive sprive4 = this;
                char c = sprive4.cfr_renamed_723[sprive4.cfr_renamed_499[this.cfr_renamed_31[n3]]];
                int n9 = 0;
                char c2 = cArray[0];
                char c3 = c;
                while (c3 != c2) {
                    char c4 = c2;
                    c2 = cArray[++n9];
                    cArray[n9] = c4;
                    c3 = c;
                }
                cArray[0] = c2;
                if (n9 == 0) {
                    ++n5;
                } else {
                    if (n5 > 0) {
                        int n10 = --n5;
                        while (true) {
                            int n11;
                            switch (n10 % 2) {
                                case 0: {
                                    sprive sprive5 = this;
                                    while (false) {
                                    }
                                    sprive5.cfr_renamed_314[n++] = 0;
                                    sprive5.cfr_renamed_91[0] = sprive5.cfr_renamed_91[0] + 1;
                                    n11 = n5;
                                    break;
                                }
                                case 1: {
                                    sprive sprive6 = this;
                                    sprive6.cfr_renamed_314[n++] = 1;
                                    sprive6.cfr_renamed_91[1] = sprive6.cfr_renamed_91[1] + 1;
                                }
                                default: {
                                    n11 = n5;
                                }
                            }
                            if (n11 < 2) break;
                            n10 = (n5 - 2) / 2;
                        }
                        n5 = 0;
                    }
                    sprive sprive7 = this;
                    sprive7.cfr_renamed_314[n++] = (short)(n9 + 1);
                    int n12 = n9 + 1;
                    sprive7.cfr_renamed_91[n12] = sprive7.cfr_renamed_91[n12] + 1;
                }
                n8 = ++n3;
            }
            if (n5 > 0) {
                int n13 = --n5;
                while (true) {
                    int n14;
                    switch (n13 % 2) {
                        case 0: {
                            sprive sprive8 = this;
                            while (false) {
                            }
                            sprive8.cfr_renamed_314[n++] = 0;
                            sprive8.cfr_renamed_91[0] = sprive8.cfr_renamed_91[0] + 1;
                            n14 = n5;
                            break;
                        }
                        case 1: {
                            sprive sprive9 = this;
                            sprive9.cfr_renamed_314[n++] = 1;
                            sprive9.cfr_renamed_91[1] = sprive9.cfr_renamed_91[1] + 1;
                        }
                        default: {
                            n14 = n5;
                        }
                    }
                    if (n14 < 2) {
                        sprive2 = this;
                        break block21;
                    }
                    n13 = (n5 - 2) / 2;
                }
            }
            sprive2 = this;
        }
        sprive2.cfr_renamed_314[n++] = (short)n2;
        sprive sprive10 = this;
        int n15 = n2;
        sprive10.cfr_renamed_91[n15] = sprive10.cfr_renamed_91[n15] + 1;
        sprive10.cfr_renamed_132 = n;
    }

    private /* synthetic */ void cfr_renamed_1391() throws IOException {
        this.cfr_renamed_131 = 0;
        this.cfr_renamed_88 = 0;
        this.cfr_renamed_4956(104);
        this.cfr_renamed_4956(48 + this.cfr_renamed_951);
        this.cfr_renamed_145 = 0;
    }

    private /* synthetic */ void cfr_renamed_4959() throws IOException {
        sprive sprive2 = this;
        sprive sprive3 = this;
        sprive2.cfr_renamed_4960(24, sprive3.cfr_renamed_722);
        sprive3.cfr_renamed_4958();
        sprive2.cfr_renamed_4961();
    }

    public static void cfr_renamed_4962(char[] arg0, int[] arg1, int arg2, int arg3) {
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
                System.out.println(sprnyq.cfr_renamed_9("\t^\u0017V\u001a"));
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
                System.out.println(sprnyq.cfr_renamed_9("\t^\u0017V\u001a"));
            }
            boolean bl = false;
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
                arg0[n - 1] = (char)n3;
                if (n3 > arg3) {
                    bl = true;
                }
                n19 = ++n;
            }
            if (!bl) {
                return;
            }
            int n21 = n = 1;
            while (true) {
                if (n21 >= arg2) continue block1;
                n3 = nArray2[n] >> 8;
                n3 = 1 + n3 / 2;
                nArray2[n++] = n3 << 8;
                n21 = n;
            }
            break;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_4963(int n) throws IOException {
        void arg0;
        sprive sprive2 = this;
        sprive sprive3 = this;
        sprive3.cfr_renamed_4957(8, (int)(arg0 >> 24 & 0xFF));
        sprive3.cfr_renamed_4957(8, (int)(arg0 >> 16 & 0xFF));
        sprive2.cfr_renamed_4957(8, (int)(arg0 >> 8 & 0xFF));
        sprive2.cfr_renamed_4957(8, (int)(arg0 & 0xFF));
    }

    private /* synthetic */ void cfr_renamed_4964() {
        int n;
        int n2 = n = 100000 * this.cfr_renamed_951;
        this.cfr_renamed_499 = new char[n + 1 + 20];
        this.cfr_renamed_0 = new int[n2 + 20];
        this.cfr_renamed_31 = new int[n2];
        this.cfr_renamed_133 = new int[65537];
        if (this.cfr_renamed_499 == null || this.cfr_renamed_0 == null || this.cfr_renamed_31 == null || this.cfr_renamed_133 == null) {
            // empty if block
        }
        this.cfr_renamed_314 = new short[2 * n];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_4965() throws IOException {
        sprive sprive2 = this;
        while (sprive2.cfr_renamed_105 > 0) {
            int n = this.cfr_renamed_79 >> 24;
            this.cfr_renamed_1.write(n);
            this.cfr_renamed_79 <<= 8;
            sprive sprive3 = this;
            sprive2 = sprive3;
            sprive3.cfr_renamed_105 -= 8;
            ++sprive3.cfr_renamed_131;
        }
        return;
    }

    private /* synthetic */ boolean cfr_renamed_4966(int arg0, int arg1) {
        sprive sprive2 = this;
        char c = sprive2.cfr_renamed_499[arg0 + 1];
        char c2 = sprive2.cfr_renamed_499[arg1 + 1];
        if (c != c2) {
            return c > c2;
        }
        sprive sprive3 = this;
        if ((c = sprive3.cfr_renamed_499[++arg0 + 1]) != (c2 = sprive3.cfr_renamed_499[++arg1 + 1])) {
            return c > c2;
        }
        sprive sprive4 = this;
        if ((c = sprive4.cfr_renamed_499[++arg0 + 1]) != (c2 = sprive4.cfr_renamed_499[++arg1 + 1])) {
            return c > c2;
        }
        sprive sprive5 = this;
        if ((c = sprive5.cfr_renamed_499[++arg0 + 1]) != (c2 = sprive5.cfr_renamed_499[++arg1 + 1])) {
            return c > c2;
        }
        sprive sprive6 = this;
        if ((c = sprive6.cfr_renamed_499[++arg0 + 1]) != (c2 = sprive6.cfr_renamed_499[++arg1 + 1])) {
            return c > c2;
        }
        sprive sprive7 = this;
        if ((c = sprive7.cfr_renamed_499[++arg0 + 1]) != (c2 = sprive7.cfr_renamed_499[++arg1 + 1])) {
            return c > c2;
        }
        ++arg0;
        ++arg1;
        int n = this.cfr_renamed_287 + 1;
        do {
            sprive sprive8 = this;
            c = sprive8.cfr_renamed_499[arg0 + 1];
            c2 = sprive8.cfr_renamed_499[arg1 + 1];
            if (c != c2) {
                return c > c2;
            }
            sprive sprive9 = this;
            int n2 = sprive9.cfr_renamed_0[arg0];
            int n3 = sprive9.cfr_renamed_0[arg1];
            if (n2 != n3) {
                return n2 > n3;
            }
            sprive sprive10 = this;
            if ((c = sprive10.cfr_renamed_499[++arg0 + 1]) != (c2 = sprive10.cfr_renamed_499[++arg1 + 1])) {
                return c > c2;
            }
            sprive sprive11 = this;
            n2 = sprive11.cfr_renamed_0[arg0];
            n3 = sprive11.cfr_renamed_0[arg1];
            if (n2 != n3) {
                return n2 > n3;
            }
            sprive sprive12 = this;
            if ((c = sprive12.cfr_renamed_499[++arg0 + 1]) != (c2 = sprive12.cfr_renamed_499[++arg1 + 1])) {
                return c > c2;
            }
            sprive sprive13 = this;
            n2 = sprive13.cfr_renamed_0[arg0];
            n3 = sprive13.cfr_renamed_0[arg1];
            if (n2 != n3) {
                return n2 > n3;
            }
            sprive sprive14 = this;
            if ((c = sprive14.cfr_renamed_499[++arg0 + 1]) != (c2 = sprive14.cfr_renamed_499[++arg1 + 1])) {
                return c > c2;
            }
            sprive sprive15 = this;
            n2 = sprive15.cfr_renamed_0[arg0];
            n3 = sprive15.cfr_renamed_0[arg1];
            if (n2 != n3) {
                return n2 > n3;
            }
            ++arg1;
            if (++arg0 > this.cfr_renamed_287) {
                arg0 -= this.cfr_renamed_287;
                --arg0;
            }
            if (arg1 > this.cfr_renamed_287) {
                arg1 -= this.cfr_renamed_287;
                --arg1;
            }
            ++this.cfr_renamed_185;
        } while ((n -= 4) >= 0);
        return false;
    }

    private /* synthetic */ void cfr_renamed_4967(int arg0, int arg1, int arg2) {
        int n;
        spruue[] spruueArray = new spruue[1000];
        int n2 = n = 0;
        while (n2 < 1000) {
            spruueArray[n++] = new spruue(null);
            n2 = n;
        }
        int n3 = 0;
        int n4 = n3++;
        spruueArray[n4].cfr_renamed_3 = arg0;
        spruueArray[n4].cfr_renamed_4 = arg1;
        spruueArray[0].cfr_renamed_2 = arg2;
        block1: while (true) {
            int n5 = n3;
            while (n5 > 0) {
                int n6;
                int n7;
                int n8;
                if (n3 >= 1000) {
                    System.out.println(sprnyq.cfr_renamed_9("\t^\u0017V\u001a"));
                }
                int n9 = spruueArray[--n3].cfr_renamed_3;
                int n10 = spruueArray[n3].cfr_renamed_4;
                int n11 = spruueArray[n3].cfr_renamed_2;
                if (n10 - n9 < 20 || n11 > 10) {
                    sprive sprive2 = this;
                    sprive2.cfr_renamed_4968(n9, n10, n11);
                    if (sprive2.cfr_renamed_185 <= this.cfr_renamed_805 || !this.cfr_renamed_128) continue block1;
                    return;
                }
                sprive sprive3 = this;
                sprive sprive4 = this;
                sprive sprive5 = this;
                char c = sprive3.cfr_renamed_4953(sprive3.cfr_renamed_499[sprive3.cfr_renamed_31[n9] + n11 + 1], sprive4.cfr_renamed_499[sprive4.cfr_renamed_31[n10] + n11 + 1], sprive5.cfr_renamed_499[sprive5.cfr_renamed_31[n9 + n10 >> 1] + n11 + 1]);
                int n12 = n8 = n9;
                int n13 = n7 = n10;
                int n14 = n12;
                while (true) {
                    int n15;
                    int n16;
                    if (n14 > n13) {
                        n16 = n12;
                    } else {
                        sprive sprive6 = this;
                        n6 = sprive6.cfr_renamed_499[sprive6.cfr_renamed_31[n12] + n11 + 1] - c;
                        if (n6 == 0) {
                            n = 0;
                            sprive sprive7 = this;
                            n = sprive7.cfr_renamed_31[n12];
                            sprive sprive8 = this;
                            sprive7.cfr_renamed_31[n12] = sprive8.cfr_renamed_31[n8];
                            sprive8.cfr_renamed_31[n8++] = n;
                            n14 = ++n12;
                            continue;
                        }
                        if (n6 > 0) {
                            n16 = n12;
                        } else {
                            n14 = ++n12;
                            continue;
                        }
                    }
                    while (true) {
                        if (n16 > n13) {
                            n15 = n12;
                            break;
                        }
                        sprive sprive9 = this;
                        n6 = sprive9.cfr_renamed_499[sprive9.cfr_renamed_31[n13] + n11 + 1] - c;
                        if (n6 == 0) {
                            n = 0;
                            sprive sprive10 = this;
                            n = sprive10.cfr_renamed_31[n13];
                            sprive sprive11 = this;
                            sprive10.cfr_renamed_31[n13] = sprive11.cfr_renamed_31[n7];
                            sprive11.cfr_renamed_31[n7--] = n;
                            --n13;
                            n16 = n12;
                            continue;
                        }
                        if (n6 < 0) {
                            n15 = n12;
                            break;
                        }
                        --n13;
                        n16 = n12;
                    }
                    if (n15 > n13) break;
                    n = 0;
                    sprive sprive12 = this;
                    n = sprive12.cfr_renamed_31[n12];
                    sprive sprive13 = this;
                    sprive12.cfr_renamed_31[n12] = sprive13.cfr_renamed_31[n13];
                    sprive13.cfr_renamed_31[n13] = n;
                    --n13;
                    n14 = ++n12;
                }
                if (n7 < n8) {
                    int n17 = n3;
                    spruueArray[n17].cfr_renamed_3 = n9;
                    spruueArray[n17].cfr_renamed_4 = n10;
                    spruue spruue2 = spruueArray[n3];
                    spruue2.cfr_renamed_2 = n11 + 1;
                    n5 = ++n3;
                    continue;
                }
                n6 = n8 - n9 < n12 - n8 ? n8 - n9 : n12 - n8;
                this.cfr_renamed_4969(n9, n12 - n6, n6);
                int n18 = n10 - n7 < n7 - n13 ? n10 - n7 : n7 - n13;
                this.cfr_renamed_4969(n12, n10 - n18 + 1, n18);
                n6 = n9 + n12 - n8 - 1;
                n18 = n10 - (n7 - n13) + 1;
                int n19 = n3++;
                spruueArray[n19].cfr_renamed_3 = n9;
                spruueArray[n19].cfr_renamed_4 = n6;
                spruueArray[n3].cfr_renamed_2 = n11;
                spruueArray[n3].cfr_renamed_3 = n6 + 1;
                spruueArray[n3].cfr_renamed_4 = n18 - 1;
                spruue spruue3 = spruueArray[n3];
                spruue3.cfr_renamed_2 = n11 + 1;
                spruueArray[++n3].cfr_renamed_3 = n18;
                spruueArray[n3].cfr_renamed_4 = n10;
                spruueArray[n3++].cfr_renamed_2 = n11;
                n5 = n3;
            }
            break;
        }
    }

    private /* synthetic */ void cfr_renamed_4970() throws IOException {
        sprive sprive2 = this;
        if (sprive2.cfr_renamed_287 < sprive2.cfr_renamed_728) {
            int n;
            sprive sprive3 = this;
            sprive3.cfr_renamed_952[sprive3.cfr_renamed_955] = true;
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_137) {
                sprive sprive4 = this;
                sprive4.cfr_renamed_82.cfr_renamed_4946((char)sprive4.cfr_renamed_955);
                n2 = ++n;
            }
            switch (this.cfr_renamed_137) {
                case 1: {
                    sprive sprive5 = this;
                    while (false) {
                    }
                    ++sprive5.cfr_renamed_287;
                    sprive5.cfr_renamed_499[this.cfr_renamed_287 + 1] = (char)this.cfr_renamed_955;
                    return;
                }
                case 2: {
                    sprive sprive6 = this;
                    ++sprive6.cfr_renamed_287;
                    sprive sprive7 = this;
                    sprive6.cfr_renamed_499[this.cfr_renamed_287 + 1] = (char)sprive7.cfr_renamed_955;
                    ++sprive7.cfr_renamed_287;
                    sprive6.cfr_renamed_499[this.cfr_renamed_287 + 1] = (char)this.cfr_renamed_955;
                    return;
                }
                case 3: {
                    sprive sprive8 = this;
                    ++sprive8.cfr_renamed_287;
                    sprive sprive9 = this;
                    sprive8.cfr_renamed_499[this.cfr_renamed_287 + 1] = (char)sprive9.cfr_renamed_955;
                    ++sprive9.cfr_renamed_287;
                    sprive8.cfr_renamed_499[this.cfr_renamed_287 + 1] = (char)this.cfr_renamed_955;
                    ++sprive8.cfr_renamed_287;
                    sprive8.cfr_renamed_499[this.cfr_renamed_287 + 1] = (char)this.cfr_renamed_955;
                    return;
                }
            }
            sprive sprive10 = this;
            sprive sprive11 = this;
            sprive10.cfr_renamed_952[sprive11.cfr_renamed_137 - 4] = true;
            ++sprive10.cfr_renamed_287;
            sprive11.cfr_renamed_499[this.cfr_renamed_287 + 1] = (char)this.cfr_renamed_955;
            ++sprive10.cfr_renamed_287;
            sprive10.cfr_renamed_499[this.cfr_renamed_287 + 1] = (char)this.cfr_renamed_955;
            ++sprive10.cfr_renamed_287;
            sprive10.cfr_renamed_499[this.cfr_renamed_287 + 1] = (char)this.cfr_renamed_955;
            ++sprive10.cfr_renamed_287;
            sprive10.cfr_renamed_499[this.cfr_renamed_287 + 1] = (char)this.cfr_renamed_955;
            ++sprive10.cfr_renamed_287;
            sprive10.cfr_renamed_499[this.cfr_renamed_287 + 1] = (char)(this.cfr_renamed_137 - 4);
            return;
        }
        sprive sprive12 = this;
        sprive12.cfr_renamed_4971();
        sprive12.cfr_renamed_4954();
        sprive12.cfr_renamed_4970();
    }

    private /* synthetic */ void cfr_renamed_4961() throws IOException {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        char[][] cArray = new char[6][258];
        int n12 = 0;
        int n13 = this.cfr_renamed_957 + 2;
        int n14 = n11 = 0;
        while (n14 < 6) {
            int n15 = n10 = 0;
            while (n15 < n13) {
                cArray[n11][n10++] = 15;
                n15 = n10;
            }
            n14 = ++n11;
        }
        if (this.cfr_renamed_132 <= 0) {
            System.out.println(sprnyq.cfr_renamed_9("\t^\u0017V\u001a"));
        }
        int n16 = this.cfr_renamed_132 < 200 ? (n9 = 2) : (this.cfr_renamed_132 < 600 ? (n9 = 3) : (this.cfr_renamed_132 < 1200 ? (n9 = 4) : (this.cfr_renamed_132 < 2400 ? (n9 = 5) : (n9 = 6))));
        int n17 = this.cfr_renamed_132;
        int n18 = 0;
        int n19 = n16;
        while (n19 > 0) {
            int n20 = n17 / n16;
            n8 = n18 - 1;
            int n21 = n7 = 0;
            while (n21 < n20 && n8 < n13 - 1) {
                n21 = n7 + this.cfr_renamed_91[++n8];
            }
            if (n8 > n18 && n16 != n9 && n16 != 1 && (n9 - n16) % 2 == 1) {
                n7 -= this.cfr_renamed_91[n8--];
            }
            int n22 = n10 = 0;
            while (n22 < n13) {
                cArray[n16 - 1][n10] = n10 >= n18 && n10 <= n8 ? 0 : 15;
                n22 = ++n10;
            }
            n18 = n8 + 1;
            n17 -= n7;
            n19 = --n16;
        }
        int[][] nArray = new int[6][258];
        int[] nArray2 = new int[6];
        short[] sArray = new short[6];
        int n23 = n6 = 0;
        while (n23 < 4) {
            int n24 = n11 = 0;
            while (n24 < n9) {
                nArray2[n11++] = 0;
                n24 = n11;
            }
            int n25 = n11 = 0;
            while (n25 < n9) {
                int n26 = n10 = 0;
                while (n26 < n13) {
                    nArray[n11][n10++] = 0;
                    n26 = n10;
                }
                n25 = ++n11;
            }
            n12 = 0;
            int n27 = 0;
            int n28 = n18 = 0;
            while (n28 < this.cfr_renamed_132) {
                n8 = n18 + 50 - 1;
                if (n8 >= this.cfr_renamed_132) {
                    n8 = this.cfr_renamed_132 - 1;
                }
                int n29 = n11 = 0;
                while (n29 < n9) {
                    sArray[n11++] = 0;
                    n29 = n11;
                }
                if (n9 == 6) {
                    int n30 = 0;
                    int n31 = 0;
                    n5 = 0;
                    n4 = 0;
                    n3 = 0;
                    n7 = 0;
                    int n32 = n2 = n18;
                    while (n32 <= n8) {
                        short s = this.cfr_renamed_314[n2];
                        n7 = (short)(n7 + cArray[0][s]);
                        n3 = (short)(n3 + cArray[1][s]);
                        n4 = (short)(n4 + cArray[2][s]);
                        n5 = (short)(n5 + cArray[3][s]);
                        n31 = (short)(n31 + cArray[4][s]);
                        n30 = (short)(n30 + cArray[5][s]);
                        n32 = ++n2;
                    }
                    sArray[0] = n7;
                    sArray[1] = n3;
                    sArray[2] = n4;
                    sArray[3] = n5;
                    sArray[4] = n31;
                    sArray[5] = n30;
                } else {
                    int n33 = n2 = n18;
                    while (n33 <= n8) {
                        n7 = this.cfr_renamed_314[n2];
                        int n34 = n11 = 0;
                        while (n34 < n9) {
                            int n35 = n11;
                            short s = (short)(sArray[n35] + cArray[n11][n7]);
                            sArray[n35] = s;
                            n34 = ++n11;
                        }
                        n33 = ++n2;
                    }
                }
                short s = 999999999;
                int n36 = -1;
                int n37 = n11 = 0;
                while (n37 < n9) {
                    if (sArray[n11] < s) {
                        s = sArray[n11];
                        n36 = n11;
                    }
                    n37 = ++n11;
                }
                n27 += s;
                int n38 = n36;
                nArray2[n38] = nArray2[n38] + 1;
                this.cfr_renamed_724[n12++] = (char)n36;
                int n39 = n2 = n18;
                while (n39 <= n8) {
                    int[] nArray3 = nArray[n36];
                    short s2 = this.cfr_renamed_314[n2];
                    nArray3[s2] = nArray3[s2] + 1;
                    n39 = ++n2;
                }
                n28 = n8 + 1;
            }
            int n40 = n11 = 0;
            while (n40 < n9) {
                char[] cArray2 = cArray[n11];
                int[] nArray4 = nArray[n11];
                sprive.cfr_renamed_4962(cArray2, nArray4, n13, 20);
                n40 = ++n11;
            }
            n23 = ++n6;
        }
        nArray = null;
        nArray2 = null;
        sArray = null;
        if (n9 >= 8) {
            System.out.println(sprnyq.cfr_renamed_9("\t^\u0017V\u001a"));
        }
        if (n12 >= 32768 || n12 > 18002) {
            System.out.println(sprnyq.cfr_renamed_9("\t^\u0017V\u001a"));
        }
        Object object = new char[6];
        int n41 = n2 = 0;
        while (n41 < n9) {
            int n42 = n2++;
            object[n42] = (char)n42;
            n41 = n2;
        }
        int n43 = n2 = 0;
        while (n43 < n12) {
            n3 = this.cfr_renamed_724[n2];
            n = 0;
            n5 = object[0];
            int n44 = n3;
            while (n44 != n5) {
                n4 = n5;
                n5 = object[++n];
                object[n] = n4;
                n44 = n3;
            }
            object[0] = n5;
            this.cfr_renamed_96[n2++] = (char)n;
            n43 = n2;
        }
        object = new int[6][258];
        int n45 = n11 = 0;
        while (n45 < n9) {
            char c = ' ';
            char c2 = '\u0000';
            int n46 = n2 = 0;
            while (n46 < n13) {
                if (cArray[n11][n2] > c2) {
                    c2 = cArray[n11][n2];
                }
                if (cArray[n11][n2] < c) {
                    c = cArray[n11][n2];
                }
                n46 = ++n2;
            }
            if (c2 > '\u0014') {
                System.out.println(sprnyq.cfr_renamed_9("\t^\u0017V\u001a"));
            }
            if (c < '\u0001') {
                System.out.println(sprnyq.cfr_renamed_9("\t^\u0017V\u001a"));
            }
            char c3 = object[n11];
            char[] cArray3 = cArray[n11];
            this.cfr_renamed_4972((int[])c3, cArray3, c, c2, n13);
            n45 = ++n11;
        }
        boolean[] blArray = new boolean[16];
        int n47 = n2 = 0;
        while (n47 < 16) {
            blArray[n2] = 0;
            int n48 = n = 0;
            while (n48 < 16) {
                if (this.cfr_renamed_952[n2 * 16 + n]) {
                    blArray[n2] = true;
                }
                n48 = ++n;
            }
            n47 = ++n2;
        }
        int n49 = n2 = 0;
        while (n49 < 16) {
            sprive sprive2 = this;
            if (blArray[n2]) {
                sprive2.cfr_renamed_4957(1, 1);
            } else {
                sprive2.cfr_renamed_4957(1, 0);
            }
            n49 = ++n2;
        }
        int n50 = n2 = 0;
        while (n50 < 16) {
            if (blArray[n2]) {
                int n51 = n = 0;
                while (n51 < 16) {
                    sprive sprive3 = this;
                    if (this.cfr_renamed_952[n2 * 16 + n]) {
                        sprive3.cfr_renamed_4957(1, 1);
                    } else {
                        sprive3.cfr_renamed_4957(1, 0);
                    }
                    n51 = ++n;
                }
            }
            n50 = ++n2;
        }
        this.cfr_renamed_4957(3, n9);
        this.cfr_renamed_4957(15, n12);
        int n52 = n2 = 0;
        while (n52 < n12) {
            int n53 = n = 0;
            while (n53 < this.cfr_renamed_96[n2]) {
                this.cfr_renamed_4957(1, 1);
                n53 = ++n;
            }
            this.cfr_renamed_4957(1, 0);
            n52 = ++n2;
        }
        int n54 = n11 = 0;
        while (n54 < n9) {
            int n55 = cArray[n11][0];
            this.cfr_renamed_4957(5, n55);
            int n56 = n2 = 0;
            while (n56 < n13) {
                int n57 = n55;
                while (n57 < cArray[n11][n2]) {
                    this.cfr_renamed_4957(2, 2);
                    n57 = ++n55;
                }
                int n58 = n55;
                while (n58 > cArray[n11][n2]) {
                    this.cfr_renamed_4957(2, 3);
                    n58 = --n55;
                }
                this.cfr_renamed_4957(1, 0);
                n56 = ++n2;
            }
            n54 = ++n11;
        }
        int n59 = 0;
        int n60 = n18 = 0;
        while (n60 < this.cfr_renamed_132) {
            n8 = n18 + 50 - 1;
            if (n8 >= this.cfr_renamed_132) {
                n8 = this.cfr_renamed_132 - 1;
            }
            int n61 = n18;
            while (n61 <= n8) {
                sprive sprive4 = this;
                sprive4.cfr_renamed_4957(cArray[this.cfr_renamed_724[n59]][this.cfr_renamed_314[++n2]], (int)object[sprive4.cfr_renamed_724[n59]][this.cfr_renamed_314[n2]]);
                n61 = n2;
            }
            ++n59;
            n60 = n18 = n8 + 1;
        }
        if (n59 != n12) {
            System.out.println(sprnyq.cfr_renamed_9("\t^\u0017V\u001a"));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void write(int arg0) throws IOException {
        int n = (256 + arg0) % 256;
        if (this.cfr_renamed_955 != -1) {
            if (this.cfr_renamed_955 == n) {
                sprive sprive2 = this;
                ++sprive2.cfr_renamed_137;
                if (sprive2.cfr_renamed_137 <= 254) return;
                sprive sprive3 = this;
                this.cfr_renamed_4970();
                sprive3.cfr_renamed_955 = -1;
                sprive3.cfr_renamed_137 = 0;
                return;
            }
            this.cfr_renamed_4970();
            this.cfr_renamed_137 = 1;
            this.cfr_renamed_955 = n;
            return;
        }
        this.cfr_renamed_955 = n;
        ++this.cfr_renamed_137;
    }

    public sprive(OutputStream arg0) throws IOException {
        this(arg0, 9);
    }

    private /* synthetic */ void cfr_renamed_4952() {
        int n;
        int n2 = 0;
        int n3 = 0;
        int n4 = n = 0;
        while (n4 < 256) {
            this.cfr_renamed_952[n++] = false;
            n4 = n;
        }
        int n5 = n = 0;
        while (n5 <= this.cfr_renamed_287) {
            if (n2 == 0) {
                n2 = (char)cfr_renamed_2[n3++];
                if (n3 == 512) {
                    n3 = 0;
                }
            }
            int n6 = n + 1;
            this.cfr_renamed_499[n6] = (char)(this.cfr_renamed_499[n6] ^ (--n2 == 1 ? (char)'\u0001' : '\u0000'));
            sprive sprive2 = this;
            int n7 = n + 1;
            sprive2.cfr_renamed_499[n7] = (char)(sprive2.cfr_renamed_499[n7] & 0xFF);
            char c = this.cfr_renamed_499[n + 1];
            sprive2.cfr_renamed_952[c] = true;
            n5 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_4969(int arg0, int arg1, int arg2) {
        int n = 0;
        int n2 = arg2;
        while (n2 > 0) {
            sprive sprive2 = this;
            n = sprive2.cfr_renamed_31[arg0];
            sprive sprive3 = this;
            sprive2.cfr_renamed_31[arg0] = sprive3.cfr_renamed_31[arg1];
            ++arg0;
            sprive3.cfr_renamed_31[arg1] = n;
            ++arg1;
            n2 = --arg2;
        }
    }

    private /* synthetic */ void cfr_renamed_4972(int[] arg0, char[] arg1, int arg2, int arg3, int arg4) {
        int n;
        int n2 = 0;
        int n3 = n = arg2;
        while (n3 <= arg3) {
            int n4;
            int n5 = n4 = 0;
            while (n5 < arg4) {
                if (arg1[n4] == n) {
                    arg0[n4] = n2++;
                }
                n5 = ++n4;
            }
            n2 <<= 1;
            n3 = ++n;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_4957(int arg0, int arg1) throws IOException {
        sprive sprive2 = this;
        while (true) {
            if (sprive2.cfr_renamed_105 < 8) {
                sprive sprive3 = this;
                sprive3.cfr_renamed_79 |= arg1 << 32 - this.cfr_renamed_105 - arg0;
                sprive3.cfr_renamed_105 += arg0;
                return;
            }
            int n = this.cfr_renamed_79 >> 24;
            this.cfr_renamed_1.write(n);
            this.cfr_renamed_79 <<= 8;
            sprive sprive4 = this;
            sprive2 = sprive4;
            sprive4.cfr_renamed_105 -= 8;
            ++sprive4.cfr_renamed_131;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_4973(OutputStream outputStream) {
        void arg0;
        sprive sprive2 = this;
        sprive sprive3 = this;
        sprive3.cfr_renamed_1 = arg0;
        sprive3.cfr_renamed_105 = 0;
        sprive2.cfr_renamed_79 = 0;
        sprive2.cfr_renamed_131 = 0;
    }

    public void cfr_renamed_3120() throws IOException {
        if (this.cfr_renamed_107) {
            return;
        }
        if (this.cfr_renamed_137 > 0) {
            this.cfr_renamed_4970();
        }
        sprive sprive2 = this;
        this.cfr_renamed_955 = -1;
        sprive2.cfr_renamed_4971();
        sprive2.cfr_renamed_4974();
        sprive2.cfr_renamed_107 = true;
        this.flush();
    }

    /*
     * WARNING - void declaration
     */
    public sprive(OutputStream outputStream, int n) throws IOException {
        int arg1;
        void arg0;
        sprive sprive2 = this;
        sprive sprive3 = this;
        sprive sprive4 = this;
        sprive sprive5 = this;
        sprive sprive6 = this;
        sprive sprive7 = this;
        sprive sprive8 = this;
        sprive sprive9 = this;
        sprive9.cfr_renamed_82 = new sprtte();
        sprive8.cfr_renamed_952 = new boolean[256];
        sprive8.cfr_renamed_84 = new char[256];
        sprive7.cfr_renamed_723 = new char[256];
        sprive7.cfr_renamed_724 = new char[18002];
        sprive6.cfr_renamed_96 = new char[18002];
        sprive6.cfr_renamed_91 = new int[258];
        sprive5.cfr_renamed_955 = -1;
        sprive5.cfr_renamed_137 = 0;
        sprive4.cfr_renamed_272 = 0;
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
        sprive4.cfr_renamed_956 = nArray;
        sprive3.cfr_renamed_499 = null;
        sprive3.cfr_renamed_0 = null;
        sprive2.cfr_renamed_31 = null;
        sprive2.cfr_renamed_133 = null;
        void v9 = arg0;
        v9.write(66);
        arg0.write(90);
        this.cfr_renamed_4973((OutputStream)v9);
        this.cfr_renamed_102 = 50;
        if (n > 9) {
            arg1 = 9;
        }
        if (arg1 < 1) {
            arg1 = 1;
        }
        sprive sprive10 = this;
        sprive10.cfr_renamed_951 = arg1;
        sprive10.cfr_renamed_4964();
        sprive10.cfr_renamed_1391();
        sprive10.cfr_renamed_4954();
    }

    @Override
    public void close() throws IOException {
        if (this.cfr_renamed_272) {
            return;
        }
        sprive sprive2 = this;
        sprive2.cfr_renamed_3120();
        this.cfr_renamed_272 = true;
        super.close();
        this.cfr_renamed_1.close();
    }

    private /* synthetic */ void cfr_renamed_4971() throws IOException {
        sprive sprive2;
        sprive sprive3 = this;
        sprive sprive4 = this;
        sprive sprive5 = this;
        sprive sprive6 = this;
        sprive sprive7 = this;
        sprive7.cfr_renamed_2 = sprive7.cfr_renamed_82.cfr_renamed_4949();
        sprive7.cfr_renamed_145 = sprive7.cfr_renamed_145 << 1 | this.cfr_renamed_145 >>> 31;
        sprive7.cfr_renamed_145 ^= this.cfr_renamed_2;
        sprive7.cfr_renamed_4950();
        sprive6.cfr_renamed_4956(49);
        sprive6.cfr_renamed_4956(65);
        sprive5.cfr_renamed_4956(89);
        sprive5.cfr_renamed_4956(38);
        sprive4.cfr_renamed_4956(83);
        sprive3.cfr_renamed_4956(89);
        sprive3.cfr_renamed_4963(sprive4.cfr_renamed_2);
        if (sprive3.cfr_renamed_1226) {
            sprive sprive8 = this;
            sprive2 = sprive8;
            sprive8.cfr_renamed_4957(1, 1);
            ++sprive8.cfr_renamed_88;
        } else {
            sprive sprive9 = this;
            sprive2 = sprive9;
            sprive9.cfr_renamed_4957(1, 0);
        }
        sprive2.cfr_renamed_4959();
    }

    private /* synthetic */ void cfr_renamed_4968(int arg0, int arg1, int arg2) {
        int n = arg1 - arg0 + 1;
        if (n < 2) {
            return;
        }
        int n2 = 0;
        sprive sprive2 = this;
        while (sprive2.cfr_renamed_956[n2] < n) {
            sprive2 = this;
            ++n2;
        }
        int n3 = --n2;
        while (n3 >= 0) {
            int n4 = this.cfr_renamed_956[n2];
            for (int i = arg0 + n4; i <= arg1; ++i) {
                int n5;
                block12: {
                    sprive sprive3;
                    block9: {
                        int n6;
                        int n7;
                        block11: {
                            sprive sprive4;
                            block8: {
                                int n8;
                                block10: {
                                    sprive sprive5;
                                    block7: {
                                        int n9;
                                        n5 = this.cfr_renamed_31[i];
                                        n7 = i;
                                        do {
                                            sprive sprive6 = this;
                                            if (!sprive6.cfr_renamed_4966(sprive6.cfr_renamed_31[n7 - n4] + arg2, n5 + arg2)) break block7;
                                            n9 = n7;
                                            this.cfr_renamed_31[n9] = this.cfr_renamed_31[n7 - n4];
                                        } while ((n7 = n9 - n4) > arg0 + n4 - 1);
                                        sprive5 = this;
                                        break block10;
                                    }
                                    sprive5 = this;
                                }
                                sprive5.cfr_renamed_31[n7] = n5;
                                if (++i > arg1) break;
                                n5 = this.cfr_renamed_31[i];
                                n7 = i;
                                do {
                                    sprive sprive7 = this;
                                    if (!sprive7.cfr_renamed_4966(sprive7.cfr_renamed_31[n7 - n4] + arg2, n5 + arg2)) break block8;
                                    n8 = n7;
                                    this.cfr_renamed_31[n8] = this.cfr_renamed_31[n7 - n4];
                                } while ((n7 = n8 - n4) > arg0 + n4 - 1);
                                sprive4 = this;
                                break block11;
                            }
                            sprive4 = this;
                        }
                        sprive4.cfr_renamed_31[n7] = n5;
                        if (++i > arg1) break;
                        n5 = this.cfr_renamed_31[i];
                        n7 = i;
                        do {
                            sprive sprive8 = this;
                            if (!sprive8.cfr_renamed_4966(sprive8.cfr_renamed_31[n7 - n4] + arg2, n5 + arg2)) break block9;
                            n6 = n7;
                            this.cfr_renamed_31[n6] = this.cfr_renamed_31[n7 - n4];
                        } while ((n7 = n6 - n4) > arg0 + n4 - 1);
                        sprive3 = this;
                        break block12;
                    }
                    sprive3 = this;
                }
                sprive3.cfr_renamed_31[n7] = n5;
                sprive sprive9 = this;
                if (sprive9.cfr_renamed_185 <= sprive9.cfr_renamed_805 || !this.cfr_renamed_128) continue;
                return;
            }
            n3 = --n2;
        }
    }

    private /* synthetic */ void cfr_renamed_4974() throws IOException {
        sprive sprive2 = this;
        sprive sprive3 = this;
        sprive sprive4 = this;
        sprive sprive5 = this;
        sprive5.cfr_renamed_4956(23);
        sprive5.cfr_renamed_4956(114);
        sprive4.cfr_renamed_4956(69);
        sprive4.cfr_renamed_4956(56);
        sprive3.cfr_renamed_4956(80);
        sprive2.cfr_renamed_4956(144);
        sprive2.cfr_renamed_4963(sprive3.cfr_renamed_145);
        sprive2.cfr_renamed_4965();
    }

    private /* synthetic */ void cfr_renamed_4960(int arg0, int arg1) throws IOException {
        this.cfr_renamed_4957(arg0, arg1);
    }

    private /* synthetic */ void cfr_renamed_4951() {
        int n;
        int n2;
        char c;
        int n3;
        int[] nArray = new int[256];
        int[] nArray2 = new int[256];
        boolean[] blArray = new boolean[256];
        int n4 = n3 = 0;
        while (n4 < 20) {
            sprive sprive2 = this;
            int n5 = sprive2.cfr_renamed_287 + n3 + 2;
            char c2 = this.cfr_renamed_499[n3 % (this.cfr_renamed_287 + 1) + 1];
            sprive2.cfr_renamed_499[n5] = c2;
            n4 = ++n3;
        }
        int n6 = n3 = 0;
        while (n6 <= this.cfr_renamed_287 + 20) {
            this.cfr_renamed_0[n3++] = 0;
            n6 = n3;
        }
        sprive sprive3 = this;
        sprive sprive4 = this;
        sprive3.cfr_renamed_499[0] = sprive4.cfr_renamed_499[sprive4.cfr_renamed_287 + 1];
        if (sprive3.cfr_renamed_287 < 4000) {
            int n7 = n3 = 0;
            while (n7 <= this.cfr_renamed_287) {
                int n8 = n3++;
                this.cfr_renamed_31[n8] = n8;
                n7 = n3;
            }
            sprive sprive5 = this;
            sprive5.cfr_renamed_128 = false;
            sprive5.cfr_renamed_805 = 0;
            this.cfr_renamed_185 = 0;
            sprive sprive6 = this;
            sprive6.cfr_renamed_4968(0, sprive6.cfr_renamed_287, 0);
            return;
        }
        int n9 = 0;
        int n10 = n3 = 0;
        while (n10 <= 255) {
            blArray[n3++] = false;
            n10 = n3;
        }
        int n11 = n3 = 0;
        while (n11 <= 65536) {
            this.cfr_renamed_133[n3++] = 0;
            n11 = n3;
        }
        char c3 = this.cfr_renamed_499[0];
        int n12 = n3 = 0;
        while (n12 <= this.cfr_renamed_287) {
            sprive sprive7 = this;
            c = sprive7.cfr_renamed_499[n3 + 1];
            int n13 = (c3 << 8) + c;
            sprive7.cfr_renamed_133[n13] = sprive7.cfr_renamed_133[n13] + 1;
            c3 = c;
            n12 = ++n3;
        }
        int n14 = n3 = 1;
        while (n14 <= 65536) {
            int n15 = n3;
            int n16 = this.cfr_renamed_133[n15] + this.cfr_renamed_133[n3 - 1];
            this.cfr_renamed_133[n15] = n16;
            n14 = ++n3;
        }
        c3 = this.cfr_renamed_499[1];
        int n17 = n3 = 0;
        while (n17 < this.cfr_renamed_287) {
            sprive sprive8 = this;
            c = sprive8.cfr_renamed_499[n3 + 2];
            n2 = (c3 << 8) + c;
            c3 = c;
            int n18 = n2;
            sprive8.cfr_renamed_133[n18] = sprive8.cfr_renamed_133[n18] - 1;
            sprive8.cfr_renamed_31[this.cfr_renamed_133[n2]] = n3++;
            n17 = n3;
        }
        sprive sprive9 = this;
        sprive sprive10 = this;
        int n19 = n2 = (sprive9.cfr_renamed_499[sprive9.cfr_renamed_287 + 1] << 8) + sprive10.cfr_renamed_499[1];
        sprive10.cfr_renamed_133[n19] = sprive10.cfr_renamed_133[n19] - 1;
        sprive9.cfr_renamed_31[this.cfr_renamed_133[n2]] = this.cfr_renamed_287;
        int n20 = n3 = 0;
        while (n20 <= 255) {
            int n21 = n3++;
            nArray[n21] = n21;
            n20 = n3;
        }
        int n22 = 1;
        while ((n22 = 3 * n22 + 1) <= 256) {
        }
        do {
            int n23 = n3 = (n22 /= 3);
            while (n23 <= 255) {
                block28: {
                    int[] nArray3;
                    n = nArray[n3];
                    n2 = n3;
                    while (this.cfr_renamed_133[nArray[n2 - n22] + 1 << 8] - this.cfr_renamed_133[nArray[n2 - n22] << 8] > this.cfr_renamed_133[n + 1 << 8] - this.cfr_renamed_133[n << 8]) {
                        int n24 = n2;
                        nArray[n24] = nArray[n2 - n22];
                        n2 = n24 - n22;
                        if (n2 > n22 - 1) continue;
                        nArray3 = nArray;
                        break block28;
                    }
                    nArray3 = nArray;
                }
                nArray3[n2] = n;
                n23 = ++n3;
            }
        } while (n22 != 1);
        int n25 = n3 = 0;
        while (n25 <= 255) {
            int n26 = nArray[n3];
            int n27 = n2 = 0;
            while (n27 <= 255) {
                int n28 = (n26 << 8) + n2;
                if ((this.cfr_renamed_133[n28] & 0x200000) != 0x200000) {
                    sprive sprive11 = this;
                    n22 = (sprive11.cfr_renamed_133[n28 + 1] & 0xFFDFFFFF) - 1;
                    n = sprive11.cfr_renamed_133[n28] & 0xFFDFFFFF;
                    if (n22 > n) {
                        sprive sprive12 = this;
                        sprive12.cfr_renamed_4967(n, n22, 2);
                        n9 += n22 - n + 1;
                        if (sprive12.cfr_renamed_185 > this.cfr_renamed_805 && this.cfr_renamed_128) {
                            return;
                        }
                    }
                    int n29 = n28;
                    this.cfr_renamed_133[n29] = this.cfr_renamed_133[n29] | 0x200000;
                }
                n27 = ++n2;
            }
            blArray[n26] = true;
            if (n3 < 255) {
                sprive sprive13 = this;
                n = sprive13.cfr_renamed_133[n26 << 8] & 0xFFDFFFFF;
                n22 = (sprive13.cfr_renamed_133[n26 + 1 << 8] & 0xFFDFFFFF) - n;
                int n30 = 0;
                int n31 = n22;
                while (n31 >> n30 > 65534) {
                    n31 = n22;
                    ++n30;
                }
                int n32 = n2 = 0;
                while (n32 < n22) {
                    int n33;
                    sprive sprive14 = this;
                    int n34 = sprive14.cfr_renamed_31[n + n2];
                    sprive14.cfr_renamed_0[n34] = n33 = n2 >> n30;
                    if (n34 < 20) {
                        this.cfr_renamed_0[n34 + this.cfr_renamed_287 + 1] = n33;
                    }
                    n32 = ++n2;
                }
                if (n22 - 1 >> n30 > 65535) {
                    System.out.println(sprnyq.cfr_renamed_9("\t^\u0017V\u001a"));
                }
            }
            int n35 = n2 = 0;
            while (n35 <= 255) {
                int n36 = n2++;
                nArray2[n36] = this.cfr_renamed_133[(n36 << 8) + n26] & 0xFFDFFFFF;
                n35 = n2;
            }
            int n37 = n2 = this.cfr_renamed_133[n26 << 8] & 0xFFDFFFFF;
            while (n37 < (this.cfr_renamed_133[n26 + 1 << 8] & 0xFFDFFFFF)) {
                sprive sprive15 = this;
                c3 = sprive15.cfr_renamed_499[sprive15.cfr_renamed_31[n2]];
                if (!blArray[c3]) {
                    sprive sprive16 = this;
                    this.cfr_renamed_31[nArray2[c3]] = this.cfr_renamed_31[n2] == 0 ? sprive16.cfr_renamed_287 : sprive16.cfr_renamed_31[n2] - 1;
                    char c4 = c3;
                    nArray2[c4] = nArray2[c4] + 1;
                }
                n37 = ++n2;
            }
            int n38 = n2 = 0;
            while (n38 <= 255) {
                int n39 = (n2 << 8) + n26;
                this.cfr_renamed_133[n39] = this.cfr_renamed_133[n39] | 0x200000;
                n38 = ++n2;
            }
            n25 = ++n3;
        }
    }
}

