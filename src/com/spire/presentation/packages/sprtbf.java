/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spragf;
import com.spire.presentation.packages.sprbbf;
import com.spire.presentation.packages.sprdcf;
import com.spire.presentation.packages.sprdgha;
import com.spire.presentation.packages.sprfcf;
import com.spire.presentation.packages.sprjef;
import com.spire.presentation.packages.sprmaaa;
import com.spire.presentation.packages.sprvwe;
import java.security.SecureRandom;
import java.util.Vector;

public abstract class sprtbf {
    public Vector cfr_renamed_0;
    public spragf cfr_renamed_1;
    public Vector cfr_renamed_2;
    public int cfr_renamed_3;
    public final SecureRandom cfr_renamed_4;

    public sprtbf(SecureRandom secureRandom) {
        this.cfr_renamed_4 = secureRandom;
    }

    public final spragf cfr_renamed_1039() {
        if (this.cfr_renamed_1 == null) {
            this.cfr_renamed_1025();
        }
        return new spragf(this.cfr_renamed_1);
    }

    public final spragf[] cfr_renamed_5522(spragf[] arg0) {
        int n;
        int n2;
        spragf[] spragfArray = new spragf[arg0.length];
        spragf[] spragfArray2 = new spragf[arg0.length];
        int n3 = n2 = 0;
        while (n3 < this.cfr_renamed_3) {
            spragfArray[n2] = new spragf(arg0[n2]);
            spragfArray2[n2] = new spragf(this.cfr_renamed_3);
            spragfArray2[n2].cfr_renamed_949(this.cfr_renamed_3 - 1 - n2++);
            n3 = n2;
        }
        int n4 = n2 = 0;
        while (n4 < this.cfr_renamed_3 - 1) {
            int n5 = n = n2;
            while (n5 < this.cfr_renamed_3 && !spragfArray[n].cfr_renamed_1012(this.cfr_renamed_3 - 1 - n2)) {
                n5 = ++n;
            }
            if (n >= this.cfr_renamed_3) {
                throw new RuntimeException(sprmaaa.cfr_renamed_9("6CCk7l\u0014i\u0015+\u0018k\u0007`\u0003q<d\u0005w\u0018}K%<d\u0005w\u0018}Qf\u0010k\u001fj\u0005%\u0013`Ql\u001fs\u0014w\u0005`\u0015$"));
            }
            if (n2 != n) {
                spragf spragf2 = spragfArray[n2];
                spragfArray[n2] = spragfArray[n];
                spragfArray[n] = spragf2;
                spragf2 = spragfArray2[n2];
                spragfArray2[n2] = spragfArray2[n];
                spragfArray2[n] = spragf2;
            }
            int n6 = n = n2 + 1;
            while (n6 < this.cfr_renamed_3) {
                if (spragfArray[n].cfr_renamed_1012(this.cfr_renamed_3 - 1 - n2)) {
                    int n7 = n;
                    spragfArray[n7].cfr_renamed_5501(spragfArray[n2]);
                    spragfArray2[n7].cfr_renamed_5501(spragfArray2[n2]);
                }
                n6 = ++n;
            }
            n4 = ++n2;
        }
        int n8 = n2 = this.cfr_renamed_3 - 1;
        while (n8 > 0) {
            int n9 = n2 - 1;
            while (n9 >= 0) {
                if (spragfArray[n].cfr_renamed_1012(this.cfr_renamed_3 - 1 - n2)) {
                    int n10 = n;
                    spragfArray[n10].cfr_renamed_5501(spragfArray[n2]);
                    spragfArray2[n10].cfr_renamed_5501(spragfArray2[n2]);
                }
                n9 = --n;
            }
            n8 = --n2;
        }
        return spragfArray2;
    }

    public final boolean equals(Object arg0) {
        if (arg0 == null || !(arg0 instanceof sprtbf)) {
            return false;
        }
        sprtbf sprtbf2 = (sprtbf)arg0;
        if (sprtbf2.cfr_renamed_3 != this.cfr_renamed_3) {
            return false;
        }
        if (!this.cfr_renamed_1.equals(sprtbf2.cfr_renamed_1)) {
            return false;
        }
        if (this instanceof sprbbf && !(sprtbf2 instanceof sprbbf)) {
            return false;
        }
        return !(this instanceof sprjef) || sprtbf2 instanceof sprjef;
    }

    public abstract void cfr_renamed_5519(sprtbf var1);

    public int hashCode() {
        sprtbf sprtbf2 = this;
        return sprtbf2.cfr_renamed_3 + sprtbf2.cfr_renamed_1.hashCode();
    }

    public abstract sprdcf cfr_renamed_5512(spragf var1);

    public final sprdcf cfr_renamed_5529(sprdcf arg0, sprtbf arg1) throws RuntimeException {
        if (arg1 == this) {
            return (sprdcf)arg0.clone();
        }
        if (this.cfr_renamed_1.equals(arg1.cfr_renamed_1)) {
            return (sprdcf)arg0.clone();
        }
        if (this.cfr_renamed_3 != arg1.cfr_renamed_3) {
            throw new RuntimeException(sprdgha.cfr_renamed_9("%hP@$G\u0007B\u0006\u0000\u0001A\fX\u0007\\\u0016\u0014BlS\u000e\nO\u0011\u000e\u0003\u000e\u0006G\u0004H\u0007\\\u0007@\u0016\u000e\u0006K\u0005\\\u0007KBO\fJBZ\n[\u0011\u000e\u0001O\f@\rZBL\u0007\u000e\u0001A\u0014K\u0010Z\u0007JBZ\r\u000f"));
        }
        int n = this.cfr_renamed_2.indexOf(arg1);
        if (n == -1) {
            sprtbf sprtbf2 = this;
            sprtbf2.cfr_renamed_5519(arg1);
            n = sprtbf2.cfr_renamed_2.indexOf(arg1);
        }
        spragf[] spragfArray = (spragf[])this.cfr_renamed_0.elementAt(n);
        sprdcf sprdcf2 = (sprdcf)arg0.clone();
        if (sprdcf2 instanceof sprfcf) {
            ((sprfcf)sprdcf2).cfr_renamed_1078();
        }
        spragf spragf2 = new spragf(this.cfr_renamed_3, sprdcf2.cfr_renamed_953());
        spragf2.cfr_renamed_973(this.cfr_renamed_3);
        spragf spragf3 = new spragf(this.cfr_renamed_3);
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            if (spragf2.cfr_renamed_5506(spragfArray[n])) {
                spragf3.cfr_renamed_949(this.cfr_renamed_3 - 1 - n);
            }
            n2 = ++n;
        }
        if (arg1 instanceof sprbbf) {
            return new sprvwe((sprbbf)arg1, spragf3);
        }
        if (arg1 instanceof sprjef) {
            sprfcf sprfcf2 = new sprfcf((sprjef)arg1, spragf3.cfr_renamed_953());
            sprfcf2.cfr_renamed_1078();
            return sprfcf2;
        }
        throw new RuntimeException(sprmaaa.cfr_renamed_9("B77\u001fC\u0018`\u001da_f\u001ek\u0007`\u0003qK%34Qh\u0004v\u0005%\u0013`Qd\u001f%\u0018k\u0002q\u0010k\u0012`Qj\u0017%6CCk!j\u001d|\u001fj\u001cl\u0010i7l\u0014i\u0015%\u001ewQB77\u001fJ?G7l\u0014i\u0015$"));
    }

    public abstract void cfr_renamed_1025();

    public final int cfr_renamed_813() {
        return this.cfr_renamed_3;
    }
}

