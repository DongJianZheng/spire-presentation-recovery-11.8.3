/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spragf;
import com.spire.presentation.packages.sprbbf;
import com.spire.presentation.packages.sprdcf;
import com.spire.presentation.packages.sprfcf;
import com.spire.presentation.packages.sprjef;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprtbf;
import com.spire.presentation.packages.sprtrda;
import com.spire.presentation.packages.sprvwe;
import com.spire.presentation.packages.sprwlp;

public class sprnaf {
    private sprdcf[] cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprnaf(sprnaf sprnaf2) {
        int n;
        void arg0;
        this.cfr_renamed_3 = new sprdcf[sprnaf2.cfr_renamed_4];
        this.cfr_renamed_4 = arg0.cfr_renamed_4;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4) {
            int n3 = n++;
            this.cfr_renamed_3[n3] = (sprdcf)arg0.cfr_renamed_3[n3].clone();
            n2 = n;
        }
    }

    public final int cfr_renamed_813() {
        int n;
        int n2 = n = this.cfr_renamed_4 - 1;
        while (n2 >= 0) {
            if (!this.cfr_renamed_3[n].cfr_renamed_805()) {
                return n;
            }
            n2 = --n;
        }
        return -1;
    }

    public final void cfr_renamed_1059(int arg0) {
        if (arg0 <= this.cfr_renamed_4) {
            return;
        }
        sprdcf[] sprdcfArray = new sprdcf[arg0];
        sprnaf sprnaf2 = this;
        System.arraycopy(sprnaf2.cfr_renamed_3, 0, sprdcfArray, 0, this.cfr_renamed_4);
        sprtbf sprtbf2 = sprnaf2.cfr_renamed_3[0].cfr_renamed_845();
        if (sprnaf2.cfr_renamed_3[0] instanceof sprvwe) {
            int n;
            int n2 = n = this.cfr_renamed_4;
            while (n2 < arg0) {
                sprdcfArray[n++] = sprvwe.cfr_renamed_5513((sprbbf)sprtbf2);
                n2 = n;
            }
        } else if (this.cfr_renamed_3[0] instanceof sprfcf) {
            int n;
            int n3 = n = this.cfr_renamed_4;
            while (n3 < arg0) {
                sprdcfArray[n++] = sprfcf.cfr_renamed_5523((sprjef)sprtbf2);
                n3 = n;
            }
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_3 = sprdcfArray;
    }

    public final sprdcf cfr_renamed_1032(int arg0) {
        return this.cfr_renamed_3[arg0];
    }

    public int hashCode() {
        return this.cfr_renamed_813() * 7 + sproze.cfr_renamed_546(this.cfr_renamed_3);
    }

    public final boolean equals(Object arg0) {
        int n;
        if (arg0 == null || !(arg0 instanceof sprnaf)) {
            return false;
        }
        sprnaf sprnaf2 = (sprnaf)arg0;
        if (this.cfr_renamed_813() != sprnaf2.cfr_renamed_813()) {
            return false;
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4) {
            if (!this.cfr_renamed_3[n].equals(sprnaf2.cfr_renamed_3[n])) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public sprnaf(spragf arg0, sprtbf arg1) {
        sprnaf sprnaf2 = this;
        sprnaf sprnaf3 = this;
        sprnaf2.cfr_renamed_4 = arg1.cfr_renamed_813() + 1;
        sprnaf2.cfr_renamed_3 = new sprdcf[sprnaf3.cfr_renamed_4];
        if (arg1 instanceof sprjef) {
            int n;
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_4) {
                this.cfr_renamed_3[n] = arg0.cfr_renamed_1012(n) ? sprfcf.cfr_renamed_5520((sprjef)arg1) : sprfcf.cfr_renamed_5523((sprjef)arg1);
                n2 = ++n;
            }
        } else if (arg1 instanceof sprbbf) {
            int n;
            int n3 = n = 0;
            while (n3 < this.cfr_renamed_4) {
                this.cfr_renamed_3[n] = arg0.cfr_renamed_1012(n) ? sprvwe.cfr_renamed_5521((sprbbf)arg1) : sprvwe.cfr_renamed_5513((sprbbf)arg1);
                n3 = ++n;
            }
        } else {
            throw new IllegalArgumentException(sprwlp.cfr_renamed_9("$`\u0018v\u001a`\u0019f\u0015c3IFa\\M\u001d{\u0007{\u0006f\u001ahX/3IFa2f\u0011c\u0010&N/6>Tb\u0001|\u0000/\u0016jTn\u001a/\u001da\u0007{\u0015a\u0017jT`\u0012/3IFa;A6I\u001dj\u0018kT`\u0006/3IFa$`\u0018v\u001a`\u0019f\u0015c2f\u0011c\u0010."));
        }
    }

    public final sprnaf cfr_renamed_5524(sprdcf arg0) {
        int n;
        sprnaf sprnaf2 = new sprnaf(this.cfr_renamed_84());
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_84()) {
            int n3 = n++;
            sprnaf2.cfr_renamed_3[n3] = (sprdcf)this.cfr_renamed_3[n3].cfr_renamed_5494(arg0);
            n2 = n;
        }
        return sprnaf2;
    }

    public final void cfr_renamed_1065(int arg0) {
        block3: {
            int n;
            sprtbf sprtbf2;
            block4: {
                if (arg0 <= 0) break block3;
                sprnaf sprnaf2 = this;
                int n2 = sprnaf2.cfr_renamed_4;
                sprtbf2 = sprnaf2.cfr_renamed_3[0].cfr_renamed_845();
                sprnaf2.cfr_renamed_1059(sprnaf2.cfr_renamed_4 + arg0);
                int n3 = n = n2 - 1;
                while (n3 >= 0) {
                    int n4 = n + arg0;
                    sprdcf sprdcf2 = this.cfr_renamed_3[n];
                    this.cfr_renamed_3[n4] = sprdcf2;
                    n3 = --n;
                }
                if (!(this.cfr_renamed_3[0] instanceof sprvwe)) break block4;
                int n5 = n = arg0 - 1;
                while (n5 >= 0) {
                    this.cfr_renamed_3[n--] = sprvwe.cfr_renamed_5513((sprbbf)sprtbf2);
                    n5 = n;
                }
                break block3;
            }
            if (!(this.cfr_renamed_3[0] instanceof sprfcf)) break block3;
            int n6 = n = arg0 - 1;
            while (n6 >= 0) {
                this.cfr_renamed_3[n--] = sprfcf.cfr_renamed_5523((sprjef)sprtbf2);
                n6 = n;
            }
        }
    }

    public final sprnaf cfr_renamed_5525(sprnaf arg0) throws RuntimeException, ArithmeticException {
        return this.cfr_renamed_5526(arg0);
    }

    public final sprnaf[] cfr_renamed_5527(sprnaf arg0) {
        int n;
        sprnaf[] sprnafArray = new sprnaf[2];
        sprnaf sprnaf2 = new sprnaf(this);
        sprnaf sprnaf3 = arg0;
        sprnaf2.cfr_renamed_1062();
        int n2 = sprnaf3.cfr_renamed_813();
        sprdcf sprdcf2 = (sprdcf)sprnaf3.cfr_renamed_3[n2].cfr_renamed_952();
        if (sprnaf2.cfr_renamed_813() < n2) {
            sprnaf[] sprnafArray2 = sprnafArray;
            sprnafArray[0] = new sprnaf(this);
            sprnafArray[0].cfr_renamed_1058();
            sprnafArray[0].cfr_renamed_1062();
            sprnafArray2[1] = new sprnaf(this);
            sprnafArray[1].cfr_renamed_1062();
            return sprnafArray2;
        }
        sprnafArray[0] = new sprnaf(this);
        sprnafArray[0].cfr_renamed_1058();
        int n3 = n = sprnaf2.cfr_renamed_813() - n2;
        while (n3 >= 0) {
            sprnaf sprnaf4;
            sprdcf sprdcf3 = (sprdcf)sprnaf2.cfr_renamed_3[sprnaf2.cfr_renamed_813()].cfr_renamed_5494(sprdcf2);
            sprnaf sprnaf5 = sprnaf4 = arg0.cfr_renamed_5524(sprdcf3);
            sprnaf5.cfr_renamed_1065(n);
            sprnaf2 = sprnaf2.cfr_renamed_5516(sprnaf5);
            sprnaf2.cfr_renamed_1062();
            sprnafArray[0].cfr_renamed_3[n] = (sprdcf)sprdcf3.clone();
            n3 = sprnaf2.cfr_renamed_813() - n2;
        }
        sprnafArray[1] = sprnaf2;
        sprnafArray[0].cfr_renamed_1062();
        return sprnafArray;
    }

    public final int cfr_renamed_84() {
        return this.cfr_renamed_4;
    }

    public final sprnaf cfr_renamed_5518(sprnaf arg0) throws RuntimeException, ArithmeticException {
        sprnaf[] sprnafArray = new sprnaf[2];
        sprnafArray = this.cfr_renamed_5527(arg0);
        return sprnafArray[0];
    }

    public final sprnaf cfr_renamed_5515(sprnaf arg0, sprnaf arg1) {
        return this.cfr_renamed_5528(arg0).cfr_renamed_5525(arg1);
    }

    public sprnaf(int arg0, sprdcf arg1) {
        int n;
        sprnaf sprnaf2 = this;
        sprnaf sprnaf3 = this;
        sprnaf2.cfr_renamed_4 = arg0;
        sprnaf2.cfr_renamed_3 = new sprdcf[sprnaf3.cfr_renamed_4];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4) {
            this.cfr_renamed_3[n++] = (sprdcf)arg1.clone();
            n2 = n;
        }
    }

    public final sprnaf cfr_renamed_5516(sprnaf arg0) {
        sprnaf sprnaf2;
        if (this.cfr_renamed_84() >= arg0.cfr_renamed_84()) {
            int n;
            sprnaf2 = new sprnaf(this.cfr_renamed_84());
            int n2 = n = 0;
            while (n2 < arg0.cfr_renamed_84()) {
                int n3 = n;
                sprdcf sprdcf2 = (sprdcf)this.cfr_renamed_3[n].cfr_renamed_5492(arg0.cfr_renamed_3[n3]);
                sprnaf2.cfr_renamed_3[n3] = sprdcf2;
                n2 = ++n;
            }
            int n4 = n;
            while (n4 < this.cfr_renamed_84()) {
                int n5 = n++;
                sprnaf2.cfr_renamed_3[n5] = this.cfr_renamed_3[n5];
                n4 = n;
            }
        } else {
            int n;
            sprnaf2 = new sprnaf(arg0.cfr_renamed_84());
            int n6 = n = 0;
            while (n6 < this.cfr_renamed_84()) {
                int n7 = n;
                sprdcf sprdcf3 = (sprdcf)this.cfr_renamed_3[n].cfr_renamed_5492(arg0.cfr_renamed_3[n7]);
                sprnaf2.cfr_renamed_3[n7] = sprdcf3;
                n6 = ++n;
            }
            int n8 = n;
            while (n8 < arg0.cfr_renamed_84()) {
                int n9 = n++;
                sprnaf2.cfr_renamed_3[n9] = arg0.cfr_renamed_3[n9];
                n8 = n;
            }
        }
        return sprnaf2;
    }

    public final void cfr_renamed_1058() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4) {
            this.cfr_renamed_3[n++].cfr_renamed_986();
            n2 = n;
        }
    }

    public final void cfr_renamed_1062() {
        int n;
        sprnaf sprnaf2 = this;
        for (n = (v759380).cfr_renamed_4 - 1; sprnaf2.cfr_renamed_3[n].cfr_renamed_805() && n > 0; --n) {
            sprnaf2 = this;
        }
        if (++n < this.cfr_renamed_4) {
            sprdcf[] sprdcfArray = new sprdcf[n];
            sprnaf sprnaf3 = this;
            System.arraycopy(this.cfr_renamed_3, 0, sprdcfArray, 0, n);
            sprnaf3.cfr_renamed_3 = sprdcfArray;
            sprnaf3.cfr_renamed_4 = n;
        }
    }

    public final sprnaf cfr_renamed_5526(sprnaf arg0) throws RuntimeException, ArithmeticException {
        sprnaf[] sprnafArray = new sprnaf[2];
        sprnafArray = this.cfr_renamed_5527(arg0);
        return sprnafArray[1];
    }

    private /* synthetic */ sprnaf(int arg0) {
        sprnaf sprnaf2 = this;
        sprnaf sprnaf3 = this;
        sprnaf2.cfr_renamed_4 = arg0;
        sprnaf2.cfr_renamed_3 = new sprdcf[sprnaf3.cfr_renamed_4];
    }

    /*
     * WARNING - void declaration
     */
    public final sprnaf cfr_renamed_5528(sprnaf sprnaf2) {
        int n;
        int n2;
        int n3 = this.cfr_renamed_84();
        if (n3 != (n2 = sprnaf2.cfr_renamed_84())) {
            throw new IllegalArgumentException(sprtrda.cfr_renamed_9("\u001e5\"# 5#3/6\t\u001c|4`7;6:3>67`n.&3=z/4*z,z#/=.n2/,+z:2+z=;#?n)' +{"));
        }
        sprnaf sprnaf3 = new sprnaf((n3 << 1) - 1);
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_84()) {
            void arg0;
            int n5;
            int n6 = n5 = 0;
            while (n6 < arg0.cfr_renamed_84()) {
                sprnaf3.cfr_renamed_3[n + n5] = sprnaf3.cfr_renamed_3[n + n5] == null ? (sprdcf)this.cfr_renamed_3[n].cfr_renamed_5494(arg0.cfr_renamed_3[n5]) : (sprdcf)sprnaf3.cfr_renamed_3[n + n5].cfr_renamed_5492(this.cfr_renamed_3[n].cfr_renamed_5494(arg0.cfr_renamed_3[n5]));
                n6 = ++n5;
            }
            n4 = ++n;
        }
        return sprnaf3;
    }

    public final boolean cfr_renamed_805() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4) {
            if (this.cfr_renamed_3[n] != null && !this.cfr_renamed_3[n].cfr_renamed_805()) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public final sprnaf cfr_renamed_5517(sprnaf arg0) {
        sprnaf sprnaf2;
        sprnaf sprnaf3 = new sprnaf(this);
        sprnaf sprnaf4 = sprnaf2 = new sprnaf(arg0);
        sprnaf3.cfr_renamed_1062();
        sprnaf2.cfr_renamed_1062();
        while (!sprnaf4.cfr_renamed_805()) {
            sprnaf sprnaf5 = sprnaf3.cfr_renamed_5526(sprnaf2);
            sprnaf3 = sprnaf2;
            sprnaf4 = sprnaf5;
        }
        sprnaf sprnaf6 = sprnaf3;
        return sprnaf6.cfr_renamed_5524((sprdcf)sprnaf6.cfr_renamed_3[sprnaf3.cfr_renamed_813()].cfr_renamed_952());
    }

    public final void cfr_renamed_5514(int arg0, sprdcf arg1) {
        if (!(arg1 instanceof sprvwe) && !(arg1 instanceof sprfcf)) {
            throw new IllegalArgumentException(sprwlp.cfr_renamed_9("_\u001bc\ra\u001bb\u001dn\u0018H2=\u001a!\u0007j\u0000/\u0012/\u0019z\u0007{Tm\u0011/\u0015aTf\u001a|\u0000n\u001al\u0011/\u001biTj\u001d{\u001cj\u0006/3IFa$`\u0018v\u001a`\u0019f\u0015c1c\u0011b\u0011a\u0000/\u001b}TH2=\u001a@:M1c\u0011b\u0011a\u0000."));
        }
        this.cfr_renamed_3[arg0] = (sprdcf)arg1.clone();
    }

    public final sprnaf cfr_renamed_979(int arg0) {
        int n;
        if (arg0 <= 0) {
            return new sprnaf(this);
        }
        sprnaf sprnaf2 = new sprnaf(this.cfr_renamed_4 + arg0, this.cfr_renamed_3[0]);
        sprnaf2.cfr_renamed_1058();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4) {
            int n3 = n + arg0;
            sprdcf sprdcf2 = this.cfr_renamed_3[n];
            sprnaf2.cfr_renamed_3[n3] = sprdcf2;
            n2 = ++n;
        }
        return sprnaf2;
    }
}

