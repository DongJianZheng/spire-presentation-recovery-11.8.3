/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.charts.entity.ChartRotationThreeD;
import com.spire.presentation.packages.spragf;
import com.spire.presentation.packages.sprbhi;
import com.spire.presentation.packages.sprdcf;
import com.spire.presentation.packages.sprfcf;
import com.spire.presentation.packages.sprjef;
import com.spire.presentation.packages.sprnaf;
import com.spire.presentation.packages.sprtbf;
import com.spire.presentation.packages.sprvwe;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Vector;

public class sprbbf
extends sprtbf {
    private boolean cfr_renamed_0;
    private int[] cfr_renamed_1;
    private int cfr_renamed_2;
    private boolean cfr_renamed_3;
    public spragf[] cfr_renamed_4;

    public boolean cfr_renamed_1024() {
        return this.cfr_renamed_3;
    }

    public int[] cfr_renamed_1033() throws RuntimeException {
        if (!this.cfr_renamed_0) {
            throw new RuntimeException();
        }
        int[] nArray = new int[3];
        System.arraycopy(this.cfr_renamed_1, 0, nArray, 0, 3);
        return nArray;
    }

    private /* synthetic */ boolean cfr_renamed_1015() {
        int n;
        boolean bl = false;
        int n2 = 0;
        this.cfr_renamed_1 = (int[])new spragf(this.cfr_renamed_3 + 1);
        this.cfr_renamed_1.cfr_renamed_949(0);
        this.cfr_renamed_1.cfr_renamed_949(this.cfr_renamed_3 ? 1 : 0);
        int n3 = n = 1;
        while (n3 <= this.cfr_renamed_3 - 3 && !bl) {
            int n4 = n;
            this.cfr_renamed_1.cfr_renamed_949(n4);
            int n5 = n4 + 1;
            while (n5 <= this.cfr_renamed_3 - 2 && !bl) {
                int n6;
                int n7 = n6;
                this.cfr_renamed_1.cfr_renamed_949(n7);
                int n8 = n7 + 1;
                while (n8 <= this.cfr_renamed_3 - 1 && !bl) {
                    int n9;
                    boolean bl2;
                    int n10;
                    sprbbf sprbbf2 = this;
                    sprbbf2.cfr_renamed_1.cfr_renamed_949(n10);
                    if (sprbbf2.cfr_renamed_3 & true) {
                        bl2 = true;
                        n9 = n;
                    } else {
                        bl2 = false;
                        n9 = n;
                    }
                    if (bl2 | (n9 & 1) != 0 | (n6 & 1) != 0 | (n10 & 1) != 0) {
                        ++n2;
                        bl = this.cfr_renamed_1.cfr_renamed_1000();
                        if (bl) {
                            sprbbf sprbbf3 = this;
                            sprbbf3.cfr_renamed_0 = true;
                            sprbbf3.cfr_renamed_1[0] = n;
                            sprbbf3.cfr_renamed_1[1] = n6;
                            sprbbf3.cfr_renamed_1[2] = n10;
                            return bl;
                        }
                    }
                    this.cfr_renamed_1.cfr_renamed_965(n10++);
                    n8 = n10;
                }
                this.cfr_renamed_1.cfr_renamed_965(n6++);
                n5 = n6;
            }
            this.cfr_renamed_1.cfr_renamed_965(n++);
            n3 = n;
        }
        return bl;
    }

    public void cfr_renamed_1013() {
        if (this.cfr_renamed_1014()) {
            return;
        }
        if (this.cfr_renamed_1015()) {
            return;
        }
        this.cfr_renamed_1016();
    }

    private /* synthetic */ boolean cfr_renamed_1016() {
        boolean bl = false;
        sprbbf sprbbf2 = this;
        this.cfr_renamed_1 = (int[])new spragf(this.cfr_renamed_3 + 1);
        int n = 0;
        while (!bl) {
            sprbbf sprbbf3 = this;
            ++n;
            sprbbf3.cfr_renamed_1.cfr_renamed_988();
            sprbbf sprbbf4 = this;
            sprbbf3.cfr_renamed_1.cfr_renamed_949(sprbbf4.cfr_renamed_3 ? 1 : 0);
            sprbbf4.cfr_renamed_1.cfr_renamed_949(0);
            if (!sprbbf3.cfr_renamed_1.cfr_renamed_1000()) continue;
            bl = true;
            return true;
        }
        return bl;
    }

    public spragf cfr_renamed_1034(int arg0) {
        return new spragf(this.cfr_renamed_4[arg0]);
    }

    @Override
    public sprdcf cfr_renamed_5512(spragf arg0) {
        int n;
        sprnaf sprnaf2 = new sprnaf(arg0, this);
        int n2 = n = sprnaf2.cfr_renamed_813();
        while (n2 > 1) {
            sprnaf sprnaf3;
            int n3;
            do {
                int n4;
                sprbbf sprbbf2 = this;
                sprvwe sprvwe2 = new sprvwe(sprbbf2, (Random)sprbbf2.cfr_renamed_4);
                sprnaf sprnaf4 = new sprnaf(2, sprvwe.cfr_renamed_5513(this));
                sprnaf4.cfr_renamed_5514(1, sprvwe2);
                sprnaf sprnaf5 = new sprnaf(sprnaf4);
                int n5 = n4 = 1;
                while (n5 <= this.cfr_renamed_3 - 1) {
                    sprnaf sprnaf6 = sprnaf5;
                    sprnaf5 = sprnaf6.cfr_renamed_5515(sprnaf6, sprnaf2);
                    sprnaf5 = sprnaf5.cfr_renamed_5516(sprnaf4);
                    n5 = ++n4;
                }
                sprnaf3 = sprnaf5.cfr_renamed_5517(sprnaf2);
                n3 = sprnaf3.cfr_renamed_813();
                n = sprnaf2.cfr_renamed_813();
            } while (n3 == 0 || n3 == n);
            n2 = n = (n3 << 1 > n ? sprnaf2.cfr_renamed_5518(sprnaf3) : new sprnaf(sprnaf3)).cfr_renamed_813();
        }
        return sprnaf2.cfr_renamed_1032(0);
    }

    /*
     * WARNING - void declaration
     */
    public sprbbf(int n, SecureRandom secureRandom) {
        void arg0;
        void arg1;
        sprbbf sprbbf2 = this;
        super((SecureRandom)arg1);
        this.cfr_renamed_3 = false;
        sprbbf2.cfr_renamed_0 = false;
        sprbbf2.cfr_renamed_1 = new int[3];
        if (n < 3) {
            throw new IllegalArgumentException(ChartRotationThreeD.cfr_renamed_9("T\u0007RRLS\u001fEZ\u0007^S\u001fKZFLS\u001f\u0014"));
        }
        sprbbf sprbbf3 = this;
        sprbbf3.cfr_renamed_3 = arg0;
        sprbbf3.cfr_renamed_1025();
        sprbbf3.cfr_renamed_809();
        sprbbf sprbbf4 = this;
        sprbbf3.cfr_renamed_2 = (int)new Vector();
        sprbbf3.cfr_renamed_0 = new Vector();
    }

    /*
     * WARNING - void declaration
     */
    public sprbbf(int n, SecureRandom secureRandom, boolean bl) {
        sprbbf sprbbf2;
        void arg2;
        void arg0;
        void arg1;
        sprbbf sprbbf3 = this;
        super((SecureRandom)arg1);
        this.cfr_renamed_3 = false;
        sprbbf3.cfr_renamed_0 = false;
        sprbbf3.cfr_renamed_1 = new int[3];
        if (n < 3) {
            throw new IllegalArgumentException(sprbhi.cfr_renamed_9("l@j\u0015t\u0014'\u0002b@f\u0014'\fb\u0001t\u0014'S"));
        }
        this.cfr_renamed_3 = arg0;
        if (arg2 != false) {
            sprbbf sprbbf4 = this;
            sprbbf2 = sprbbf4;
            sprbbf4.cfr_renamed_1025();
        } else {
            sprbbf sprbbf5 = this;
            sprbbf2 = sprbbf5;
            sprbbf5.cfr_renamed_1013();
        }
        sprbbf2.cfr_renamed_809();
        sprbbf sprbbf6 = this;
        sprbbf6.cfr_renamed_2 = (int)new Vector();
        sprbbf6.cfr_renamed_0 = new Vector();
    }

    public int cfr_renamed_1018() throws RuntimeException {
        if (!this.cfr_renamed_3) {
            throw new RuntimeException();
        }
        return this.cfr_renamed_2;
    }

    @Override
    public void cfr_renamed_1025() {
        if (this.cfr_renamed_1014()) {
            return;
        }
        if (this.cfr_renamed_1015()) {
            return;
        }
        this.cfr_renamed_1016();
    }

    @Override
    public void cfr_renamed_5519(sprtbf arg0) {
        sprdcf[] sprdcfArray;
        sprdcf[] sprdcfArray2;
        sprdcf sprdcf2;
        int n;
        if (this.cfr_renamed_3 != arg0.cfr_renamed_3) {
            throw new IllegalArgumentException(ChartRotationThreeD.cfr_renamed_9("`y\u0015QwPKFIPJVFSaVBSC\u0011DPJORKB|h}j^SMNG\u001d\u001fe\u000e\u0007WFL\u0007^\u0007[NYAZUZIK\u0007[BXUZB\u001fFQC\u001fSWRL\u0007\\FQIPS\u001fEZ\u0007\\HIBMSZC\u001fSP\u0006"));
        }
        if (arg0 instanceof sprjef) {
            arg0.cfr_renamed_5519(this);
            return;
        }
        spragf[] spragfArray = new spragf[this.cfr_renamed_3];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            spragfArray[n++] = new spragf(this.cfr_renamed_3 ? 1 : 0);
            n2 = n;
        }
        while ((sprdcf2 = arg0.cfr_renamed_5512((spragf)this.cfr_renamed_1)).cfr_renamed_805()) {
        }
        sprbbf sprbbf2 = this;
        if (sprdcf2 instanceof sprfcf) {
            sprfcf[] sprfcfArray = new sprfcf[sprbbf2.cfr_renamed_3];
            sprdcfArray2 = sprfcfArray;
            sprfcfArray[this.cfr_renamed_3 - 1] = sprfcf.cfr_renamed_5520((sprjef)arg0);
            sprdcfArray = sprdcfArray2;
        } else {
            sprvwe[] sprvweArray = new sprvwe[sprbbf2.cfr_renamed_3];
            sprdcfArray2 = sprvweArray;
            sprvweArray[this.cfr_renamed_3 - 1] = sprvwe.cfr_renamed_5521((sprbbf)arg0);
            sprdcfArray = sprdcfArray2;
        }
        sprdcfArray[this.cfr_renamed_3 - 2] = sprdcf2;
        int n3 = n = this.cfr_renamed_3 - 3;
        while (n3 >= 0) {
            sprdcfArray2[--n] = (sprdcf)sprdcfArray2[n + 1].cfr_renamed_5494(sprdcf2);
            n3 = n;
        }
        if (arg0 instanceof sprjef) {
            int n4 = n = 0;
            while (n4 < this.cfr_renamed_3) {
                int n5;
                int n6 = n5 = 0;
                while (n6 < this.cfr_renamed_3) {
                    if (sprdcfArray2[n].cfr_renamed_1012(this.cfr_renamed_3 - n5 - 1)) {
                        spragfArray[this.cfr_renamed_3 - n5 - 1].cfr_renamed_949(this.cfr_renamed_3 - n - 1);
                    }
                    n6 = ++n5;
                }
                n4 = ++n;
            }
        } else {
            int n7 = n = 0;
            while (n7 < this.cfr_renamed_3) {
                int n8;
                int n9 = n8 = 0;
                while (n9 < this.cfr_renamed_3) {
                    if (sprdcfArray2[n].cfr_renamed_1012(n8)) {
                        spragfArray[this.cfr_renamed_3 - n8 - 1].cfr_renamed_949(this.cfr_renamed_3 - n - 1);
                    }
                    n9 = ++n8;
                }
                n7 = ++n;
            }
        }
        sprbbf sprbbf3 = this;
        sprbbf3.cfr_renamed_2.addElement(arg0);
        sprbbf3.cfr_renamed_0.addElement(spragfArray);
        sprtbf sprtbf2 = arg0;
        sprtbf2.cfr_renamed_2.addElement(this);
        sprtbf2.cfr_renamed_0.addElement(this.cfr_renamed_5522(spragfArray));
    }

    private /* synthetic */ boolean cfr_renamed_1014() {
        int n;
        boolean bl = false;
        int n2 = 0;
        this.cfr_renamed_1 = (int[])new spragf(this.cfr_renamed_3 + 1);
        this.cfr_renamed_1.cfr_renamed_949(0);
        this.cfr_renamed_1.cfr_renamed_949(this.cfr_renamed_3 ? 1 : 0);
        int n3 = n = 1;
        while (n3 < this.cfr_renamed_3 && !bl) {
            sprbbf sprbbf2 = this;
            sprbbf2.cfr_renamed_1.cfr_renamed_949(n);
            ++n2;
            bl = sprbbf2.cfr_renamed_1.cfr_renamed_1000();
            if (bl) {
                sprbbf sprbbf3 = this;
                sprbbf3.cfr_renamed_3 = true;
                sprbbf3.cfr_renamed_2 = n;
                return bl;
            }
            sprbbf sprbbf4 = this;
            sprbbf4.cfr_renamed_1.cfr_renamed_965(n);
            bl = sprbbf4.cfr_renamed_1.cfr_renamed_1000();
            n3 = ++n;
        }
        return bl;
    }

    public boolean cfr_renamed_1017() {
        return this.cfr_renamed_0;
    }

    private /* synthetic */ void cfr_renamed_809() {
        int n;
        spragf[] spragfArray = new spragf[this.cfr_renamed_3 - 1];
        this.cfr_renamed_4 = new spragf[this.cfr_renamed_3];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.length) {
            this.cfr_renamed_4[n++] = new spragf(this.cfr_renamed_3 ? 1 : 0, sprbhi.cfr_renamed_9("]%U/"));
            n2 = n;
        }
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_3 - 1) {
            int n4 = n++;
            spragfArray[n4] = new spragf(1, ChartRotationThreeD.cfr_renamed_9("hqb")).cfr_renamed_979(this.cfr_renamed_3 + n4).cfr_renamed_5497((spragf)this.cfr_renamed_1);
            n3 = n;
        }
        int n5 = n = 1;
        while (n5 <= Math.abs(this.cfr_renamed_3 >> 1)) {
            int n6;
            int n7 = n6 = 1;
            while (n7 <= this.cfr_renamed_3) {
                if (spragfArray[this.cfr_renamed_3 - (n << 1)].cfr_renamed_1012(this.cfr_renamed_3 - n6)) {
                    this.cfr_renamed_4[n6 - 1].cfr_renamed_949(this.cfr_renamed_3 - n);
                }
                n7 = ++n6;
            }
            n5 = ++n;
        }
        int n8 = n = Math.abs(this.cfr_renamed_3 >> 1) + 1;
        while (n8 <= this.cfr_renamed_3) {
            this.cfr_renamed_4[(n << 1) - this.cfr_renamed_3 - 1].cfr_renamed_949(this.cfr_renamed_3 - n++);
            n8 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprbbf(int n, SecureRandom secureRandom, spragf spragf2) throws RuntimeException {
        int n2;
        void arg0;
        void arg2;
        void arg1;
        sprbbf sprbbf2 = this;
        super((SecureRandom)arg1);
        this.cfr_renamed_3 = false;
        sprbbf2.cfr_renamed_0 = false;
        sprbbf2.cfr_renamed_1 = new int[3];
        if (n < 3) {
            throw new IllegalArgumentException(sprbhi.cfr_renamed_9("\u0004b\u0007u\u0005b@j\u0015t\u0014'\u0002b@f\u0014'\fb\u0001t\u0014'S"));
        }
        if (arg2.cfr_renamed_806() != arg0 + true) {
            throw new RuntimeException();
        }
        if (!arg2.cfr_renamed_1000()) {
            throw new RuntimeException();
        }
        sprbbf sprbbf3 = this;
        sprbbf3.cfr_renamed_3 = arg0;
        sprbbf3.cfr_renamed_1 = arg2;
        this.cfr_renamed_809();
        int n3 = 2;
        int n4 = n2 = 1;
        while (n4 < this.cfr_renamed_1.cfr_renamed_806() - 1) {
            if (this.cfr_renamed_1.cfr_renamed_1012(n2)) {
                if (++n3 == 3) {
                    this.cfr_renamed_2 = n2;
                }
                if (n3 <= 5) {
                    this.cfr_renamed_1[n3 - 3] = n2;
                }
            }
            n4 = ++n2;
        }
        if (n3 == 3) {
            this.cfr_renamed_3 = true;
        }
        if (n3 == 5) {
            this.cfr_renamed_0 = true;
        }
        sprbbf sprbbf4 = this;
        sprbbf4.cfr_renamed_2 = (int)new Vector();
        sprbbf sprbbf5 = this;
        sprbbf4.cfr_renamed_0 = new Vector();
    }
}

