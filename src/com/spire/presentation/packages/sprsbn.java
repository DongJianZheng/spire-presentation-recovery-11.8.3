/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spramja;
import com.spire.presentation.packages.sprawm;
import com.spire.presentation.packages.sprcrh;
import com.spire.presentation.packages.sprqqy;
import com.spire.presentation.packages.sprqzm;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprsbn {
    private int[] cfr_renamed_112;
    private byte[] cfr_renamed_119;
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private short[] cfr_renamed_2;
    private sprqzm cfr_renamed_3;
    private short[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprsbn(sprqzm sprqzm2, int n, int n2, int n3) {
        void arg1;
        void arg3;
        void arg2;
        void arg0;
        sprsbn sprsbn2 = this;
        sprsbn sprsbn3 = this;
        this.cfr_renamed_3 = arg0;
        sprsbn3.cfr_renamed_1 = arg2;
        sprsbn3.cfr_renamed_91 = arg3;
        sprsbn2.cfr_renamed_4 = new short[arg1];
        sprsbn2.cfr_renamed_112 = new int[n3];
    }

    public void cfr_renamed_12206() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.length) {
            spramja.cfr_renamed_12207(this.cfr_renamed_4[n] == 0, sprqqy.cfr_renamed_9("%o\u000b|\u0000{\u0003:\u000eu\u0000j\u001f\u007f\u001ei\u0002hM\u007f\u001fh\u0002h"), sprcrh.cfr_renamed_9("\u0006\u000e(\u001d#\u001a [-\u0014*\u001e=[:\t+\u001en\u0012=[ \u0014:[+\u0016>\u000f7U"));
            n2 = ++n;
        }
    }

    public void cfr_renamed_12208() {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6 = this.cfr_renamed_4.length;
        int[] nArray = new int[n6];
        int n7 = 0;
        int n8 = 0;
        int n9 = n5 = 0;
        while (n9 < n6) {
            n4 = this.cfr_renamed_4[n5];
            if (n4 != 0) {
                int n10;
                int n11;
                int n12 = n7++;
                while (n12 > 0 && this.cfr_renamed_4[nArray[n11 = (n10 - 1) / 2]] > n4) {
                    nArray[n10] = nArray[n11];
                    n12 = n11;
                }
                nArray[n10] = n5;
                n8 = n5;
            }
            n9 = ++n5;
        }
        int n13 = n7;
        while (n13 < 2) {
            nArray[n7++] = n8 < 2 ? ++n8 : 0;
            n13 = n7;
        }
        this.cfr_renamed_0 = Math.max(n8 + 1, this.cfr_renamed_1);
        n4 = n5 = n7;
        int[] nArray2 = new int[4 * n7 - 2];
        int[] nArray3 = new int[2 * n7 - 1];
        int n14 = n3 = 0;
        while (n14 < n7) {
            n2 = nArray[n3];
            int n15 = n = 2 * n3;
            nArray2[n15] = n2;
            nArray2[n15 + 1] = -1;
            nArray3[n3] = this.cfr_renamed_4[n2] << 8;
            int n16 = n3++;
            nArray[n16] = n16;
            n14 = n3;
        }
        do {
            int n17;
            n3 = nArray[0];
            n2 = nArray[--n7];
            n = nArray3[n2];
            int n18 = 0;
            int n19 = n17 = 1;
            while (n19 < n7) {
                if (n17 + 1 < n7 && nArray3[nArray[n17]] > nArray3[nArray[n17 + 1]]) {
                    ++n17;
                }
                nArray[n18] = nArray[n17];
                n18 = n17;
                n19 = n18 * 2 + 1;
            }
            int n20 = n17 = n18;
            while (n20 > 0 && nArray3[nArray[n18 = (n17 - 1) / 2]] > n) {
                n20 = n18;
                nArray[n17] = nArray[n18];
            }
            nArray[n17] = n2;
            int n21 = nArray[0];
            n2 = n4++;
            nArray2[2 * n2] = n3;
            nArray2[2 * n2 + 1] = n21;
            int n22 = Math.min(nArray3[n3] & 0xFF, nArray3[n21] & 0xFF);
            nArray3[n2] = n = nArray3[n3] + nArray3[n21] - n22 + 1;
            n18 = 0;
            int n23 = n17 = 1;
            while (n23 < n7) {
                if (n17 + 1 < n7 && nArray3[nArray[n17]] > nArray3[nArray[n17 + 1]]) {
                    ++n17;
                }
                nArray[n18] = nArray[n17];
                n18 = n17;
                n23 = n18 * 2 + 1;
            }
            int n24 = n17 = n18;
            while (n24 > 0 && nArray3[nArray[n18 = (n17 - 1) / 2]] > n) {
                n24 = n18;
                nArray[n17] = nArray[n18];
            }
            nArray[n17] = n2;
        } while (n7 > 1);
        if (nArray[0] != nArray2.length / 2 - 1) {
            throw new IllegalStateException(sprqqy.cfr_renamed_9("R\b{\u001d:\u0004t\u001b{\u001fs\ft\u0019:\u001bs\u0002v\fn\b~"));
        }
        this.cfr_renamed_12209(nArray2);
    }

    public byte[] cfr_renamed_12210() {
        return this.cfr_renamed_119;
    }

    private /* synthetic */ void cfr_renamed_12209(int[] arg0) {
        int n;
        int n2;
        int n3;
        int n4;
        this.cfr_renamed_119 = new byte[this.cfr_renamed_4.length];
        int n5 = arg0.length / 2;
        int n6 = (n5 + 1) / 2;
        int n7 = 0;
        int n8 = n4 = 0;
        while (n8 < this.cfr_renamed_91) {
            this.cfr_renamed_112[n4++] = 0;
            n8 = n4;
        }
        int[] nArray = new int[n5];
        int[] nArray2 = nArray;
        int n9 = n5;
        nArray[n9 - 1] = 0;
        int n10 = n3 = n9 - 1;
        while (n10 >= 0) {
            n2 = 2 * n3 + 1;
            if (arg0[n2] != -1) {
                n = nArray2[n3] + 1;
                if (n > this.cfr_renamed_91) {
                    ++n7;
                    n = this.cfr_renamed_91;
                }
                int n11 = n;
                nArray2[arg0[n2]] = n11;
                nArray2[arg0[n2 - 1]] = n11;
            } else {
                n = nArray2[n3];
                sprsbn sprsbn2 = this;
                int n12 = n - 1;
                sprsbn2.cfr_renamed_112[n12] = sprsbn2.cfr_renamed_112[n12] + 1;
                sprsbn2.cfr_renamed_119[arg0[n2 - 1]] = (byte)nArray2[n3];
            }
            n10 = --n3;
        }
        if (n7 == 0) {
            return;
        }
        n3 = this.cfr_renamed_91 - 1;
        do {
            sprsbn sprsbn3 = this;
            while (sprsbn3.cfr_renamed_112[--n3] == 0) {
                sprsbn3 = this;
            }
            do {
                sprsbn sprsbn4 = this;
                int n13 = n3++;
                sprsbn4.cfr_renamed_112[n13] = sprsbn4.cfr_renamed_112[n13] - 1;
                int n14 = n3;
                sprsbn4.cfr_renamed_112[n14] = sprsbn4.cfr_renamed_112[n14] + 1;
            } while ((n7 -= 1 << this.cfr_renamed_91 - 1 - n3) > 0 && n3 < this.cfr_renamed_91 - 1);
        } while (n7 > 0);
        sprsbn sprsbn5 = this;
        int n15 = this.cfr_renamed_91 - 1;
        sprsbn5.cfr_renamed_112[n15] = sprsbn5.cfr_renamed_112[n15] + n7;
        int n16 = this.cfr_renamed_91 - 2;
        sprsbn5.cfr_renamed_112[n16] = sprsbn5.cfr_renamed_112[n16] - n7;
        n2 = 2 * n6;
        int n17 = n = sprsbn5.cfr_renamed_91;
        while (n17 != 0) {
            int n18 = this.cfr_renamed_112[n - 1];
            while (n18 > 0) {
                int n19 = 2 * arg0[n2];
                ++n2;
                if (arg0[n19 + 1] != -1) continue;
                --n18;
                this.cfr_renamed_119[arg0[n19]] = (byte)n;
            }
            n17 = --n;
        }
    }

    public void cfr_renamed_41() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.length) {
            this.cfr_renamed_4[n++] = 0;
            n2 = n;
        }
        this.cfr_renamed_2 = null;
        this.cfr_renamed_119 = null;
    }

    public void cfr_renamed_12211(short[] arg0, byte[] arg1) {
        this.cfr_renamed_2 = (short[])arg0.clone();
        this.cfr_renamed_119 = (byte[])arg1.clone();
    }

    public void cfr_renamed_12212(sprsbn arg0) {
        int n = -1;
        int n2 = 0;
        block0: while (n2 < this.cfr_renamed_0) {
            int n3;
            int n4;
            int n5;
            block9: {
                int n6;
                int n7;
                n5 = 1;
                int n8 = this.cfr_renamed_119[n2] & 0xFF;
                if (n8 == 0) {
                    n7 = 138;
                    n4 = 3;
                    n6 = n8;
                } else {
                    n7 = 6;
                    n4 = 3;
                    if (n != n8) {
                        arg0.cfr_renamed_12213(n8);
                        n5 = 0;
                    }
                    n6 = n8;
                }
                n = n6;
                ++n2;
                while (n2 < this.cfr_renamed_0 && n == (this.cfr_renamed_119[n2] & 0xFF)) {
                    ++n2;
                    if (++n5 < n7) continue;
                    n3 = n5;
                    break block9;
                }
                n3 = n5;
            }
            if (n3 < n4) {
                int n9 = n5;
                while (true) {
                    --n5;
                    if (n9 <= 0) continue block0;
                    n9 = n5;
                    arg0.cfr_renamed_12213(n);
                }
            }
            if (n != 0) {
                arg0.cfr_renamed_12213(16);
                this.cfr_renamed_3.cfr_renamed_12214(n5 - 3, 2);
                continue;
            }
            if (n5 <= 10) {
                arg0.cfr_renamed_12213(17);
                this.cfr_renamed_3.cfr_renamed_12214(n5 - 3, 3);
                continue;
            }
            arg0.cfr_renamed_12213(18);
            this.cfr_renamed_3.cfr_renamed_12214(n5 - 11, 7);
        }
    }

    public int cfr_renamed_12215() {
        return this.cfr_renamed_0;
    }

    public int cfr_renamed_12216() {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_4.length) {
            short s = this.cfr_renamed_4[n];
            int n4 = this.cfr_renamed_119[n] & 0xFF;
            n2 += s * n4;
            n3 = ++n;
        }
        return n2;
    }

    public short[] cfr_renamed_12217() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_12218(sprsbn arg0) {
        int n = -1;
        int n2 = 0;
        while (n2 < this.cfr_renamed_0) {
            int n3;
            int n4;
            int n5;
            block8: {
                int n6;
                int n7;
                n5 = 1;
                int n8 = this.cfr_renamed_119[n2] & 0xFF;
                if (n8 == 0) {
                    n7 = 138;
                    n4 = 3;
                    n6 = n8;
                } else {
                    n7 = 6;
                    n4 = 3;
                    if (n != n8) {
                        int n9 = n8;
                        arg0.cfr_renamed_4[n9] = (short)(arg0.cfr_renamed_4[n9] + 1);
                        n5 = 0;
                    }
                    n6 = n8;
                }
                n = n6;
                ++n2;
                while (n2 < this.cfr_renamed_0 && n == (this.cfr_renamed_119[n2] & 0xFF)) {
                    ++n2;
                    if (++n5 < n7) continue;
                    n3 = n5;
                    break block8;
                }
                n3 = n5;
            }
            if (n3 < n4) {
                int n10 = n;
                arg0.cfr_renamed_4[n10] = (short)(arg0.cfr_renamed_4[n10] + (short)n5);
                continue;
            }
            if (n != 0) {
                arg0.cfr_renamed_4[16] = (short)(arg0.cfr_renamed_4[16] + 1);
                continue;
            }
            if (n5 <= 10) {
                arg0.cfr_renamed_4[17] = (short)(arg0.cfr_renamed_4[17] + 1);
                continue;
            }
            arg0.cfr_renamed_4[18] = (short)(arg0.cfr_renamed_4[18] + 1);
        }
    }

    public void cfr_renamed_12219() {
        int n;
        sprsbn sprsbn2 = this;
        int[] nArray = new int[sprsbn2.cfr_renamed_91];
        sprsbn2.cfr_renamed_2 = new short[sprsbn2.cfr_renamed_0];
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_91) {
            int n4 = n2;
            nArray[n] = n4;
            int n5 = this.cfr_renamed_112[n];
            int n6 = 15 - n;
            n2 = n4 + (n5 << n6);
            n3 = ++n;
        }
        int n7 = n = 0;
        while (n7 < this.cfr_renamed_0) {
            int n8 = this.cfr_renamed_119[n] & 0xFF;
            if (n8 > 0) {
                this.cfr_renamed_2[n] = sprawm.cfr_renamed_12177(nArray[n8 - 1]);
                int n9 = n8 - 1;
                nArray[n9] = nArray[n9] + (1 << 16 - n8);
            }
            n7 = ++n;
        }
    }

    public void cfr_renamed_12213(int arg0) {
        sprsbn sprsbn2 = this;
        sprsbn2.cfr_renamed_3.cfr_renamed_12214(sprsbn2.cfr_renamed_2[arg0] & 0xFFFF, this.cfr_renamed_119[arg0] & 0xFF);
    }
}

