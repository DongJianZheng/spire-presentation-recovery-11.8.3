/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahe;
import com.spire.presentation.packages.sprbnja;
import com.spire.presentation.packages.sprcye;
import com.spire.presentation.packages.sprnhf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprwff;
import com.spire.presentation.packages.sprydf;

public class sprexe
extends sprcye {
    private sprnhf cfr_renamed_3;
    private int[] cfr_renamed_4;

    public sprnhf cfr_renamed_845() {
        return this.cfr_renamed_3;
    }

    @Override
    public int hashCode() {
        int n = this.cfr_renamed_3.hashCode();
        n = n * 31 + sproze.cfr_renamed_552(this.cfr_renamed_4);
        return n;
    }

    @Override
    public byte[] cfr_renamed_91() {
        int n;
        int n2 = 8;
        int n3 = 1;
        sprexe sprexe2 = this;
        while (sprexe2.cfr_renamed_3.cfr_renamed_813() > n2) {
            n2 += 8;
            sprexe2 = this;
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

    /*
     * WARNING - void declaration
     */
    public sprexe(sprexe sprexe2) {
        void arg0;
        sprexe sprexe3 = this;
        sprexe sprexe4 = this;
        sprexe4.cfr_renamed_3 = new sprnhf(arg0.cfr_renamed_3);
        sprexe3.cfr_renamed_4 = arg0.cfr_renamed_4;
        sprexe3.cfr_renamed_4 = sprydf.cfr_renamed_535(sprexe2.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprexe(sprnhf sprnhf2, int[] nArray) {
        void arg1;
        int n;
        void arg0;
        sprexe sprexe2 = this;
        sprexe2.cfr_renamed_3 = arg0;
        sprexe2.cfr_renamed_4 = (int[])nArray.length;
        int n2 = n = ((void)arg1).length - 1;
        while (n2 >= 0) {
            if (!arg0.cfr_renamed_839((int)arg1[n])) {
                throw new ArithmeticException(sprbnja.cfr_renamed_9("\bX(Y(Z9\u0014,F?U4\u0014$GmZ\"@mG=Q.]+](Pm[;Q?\u00149\\(\u0014*];Q#\u0014+]#]9QmR$Q!Pc"));
            }
            n2 = --n;
        }
        this.cfr_renamed_4 = sprydf.cfr_renamed_535((int[])arg1);
    }

    public int[] cfr_renamed_846() {
        return sprydf.cfr_renamed_535(this.cfr_renamed_4);
    }

    @Override
    public sprcye cfr_renamed_5468(sprcye arg0) {
        throw new RuntimeException(sprahe.cfr_renamed_9("40.\u007f32*3?2?1.:>"));
    }

    /*
     * WARNING - void declaration
     */
    public sprexe(sprnhf sprnhf2, byte[] byArray) {
        int n;
        void arg1;
        void arg0;
        sprnhf sprnhf3 = sprnhf2;
        sprexe sprexe2 = this;
        sprexe2.cfr_renamed_3 = new sprnhf((sprnhf)arg0);
        int n2 = 8;
        int n3 = 1;
        while (sprnhf3.cfr_renamed_813() > n2) {
            n2 += 8;
            sprnhf3 = arg0;
            ++n3;
        }
        if (((void)arg1).length % n3 != 0) {
            throw new IllegalArgumentException(sprbnja.cfr_renamed_9("v4@(\u0014,F?U4\u0014$GmZ\"@mU#\u0014(Z.[)Q)\u0014;Q.@\"Fm[;Q?\u00149\\(\u0014*];Q#\u0014+]#]9QmR$Q!Pc"));
        }
        this.cfr_renamed_4 = (int[])(((void)arg1).length / n3);
        this.cfr_renamed_4 = new int[this.cfr_renamed_4];
        n3 = 0;
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_4.length) {
            int n5;
            int n6 = n5 = 0;
            while (n6 < n2) {
                int n7 = n;
                int n8 = arg1[n3] & 0xFF;
                ++n3;
                int n9 = this.cfr_renamed_4[n7] | n8 << n5;
                this.cfr_renamed_4[n7] = n9;
                n6 = n5 += 8;
            }
            if (!arg0.cfr_renamed_839(this.cfr_renamed_4[n])) {
                throw new IllegalArgumentException(sprahe.cfr_renamed_9("\u001d#+?\u007f;-(>#\u007f3,z15+z>4\u007f?190>:>\u007f,:9+5-z0,:(\u007f.7?\u007f=6,:4\u007f<646.:z93:6;t"));
            }
            n4 = ++n;
        }
    }

    @Override
    public boolean cfr_renamed_805() {
        int n;
        int n2 = n = this.cfr_renamed_4.length - 1;
        while (n2 >= 0) {
            if (this.cfr_renamed_4[n] != 0) {
                return false;
            }
            n2 = --n;
        }
        return true;
    }

    @Override
    public String toString() {
        int n;
        StringBuffer stringBuffer = new StringBuffer();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.length) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < this.cfr_renamed_3.cfr_renamed_813()) {
                int n5 = n3 & 0x1F;
                int n6 = 1 << n5;
                if ((this.cfr_renamed_4[n] & n6) != 0) {
                    stringBuffer.append('1');
                } else {
                    stringBuffer.append('0');
                }
                n4 = ++n3;
            }
            stringBuffer.append(' ');
            n2 = ++n;
        }
        return stringBuffer.toString();
    }

    @Override
    public sprcye cfr_renamed_5467(sprwff arg0) {
        int n;
        int[] nArray = arg0.cfr_renamed_876();
        if (this.cfr_renamed_4 != nArray.length) {
            throw new ArithmeticException(sprbnja.cfr_renamed_9("=Q?Y8@,@$[#\u0014>]7QmU#PmB(W9[?\u0014>]7QmY$G U9W%"));
        }
        int[] nArray2 = new int[this.cfr_renamed_4];
        int n2 = n = 0;
        while (n2 < nArray.length) {
            int n3 = n++;
            nArray2[n3] = this.cfr_renamed_4[nArray[n3]];
            n2 = n;
        }
        return new sprexe(this.cfr_renamed_3, nArray2);
    }

    @Override
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprexe)) {
            return false;
        }
        sprexe sprexe2 = (sprexe)arg0;
        if (!this.cfr_renamed_3.equals(sprexe2.cfr_renamed_3)) {
            return false;
        }
        return sprydf.cfr_renamed_874(this.cfr_renamed_4, sprexe2.cfr_renamed_4);
    }
}

