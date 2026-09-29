/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcqa;
import com.spire.presentation.packages.sprhua;
import com.spire.presentation.packages.sprjwn;
import com.spire.presentation.packages.sprsrf;
import com.spire.presentation.packages.sprsta;
import com.spire.presentation.packages.sprwla;
import com.spire.presentation.packages.spryoa;
import com.spire.presentation.packages.spryua;
import java.util.Vector;

public abstract class sprrma {
    public int cfr_renamed_1;
    public Vector cfr_renamed_2;
    public Vector cfr_renamed_3;
    public sprhua cfr_renamed_4;

    public abstract void cfr_renamed_1019(sprrma var1);

    public final int cfr_renamed_813() {
        return this.cfr_renamed_1;
    }

    public abstract void cfr_renamed_1025();

    public int hashCode() {
        sprrma sprrma2 = this;
        return sprrma2.cfr_renamed_1 + sprrma2.cfr_renamed_4.hashCode();
    }

    public final sprhua cfr_renamed_1039() {
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_1025();
        }
        return new sprhua(this.cfr_renamed_4);
    }

    public final spryua cfr_renamed_1079(spryua arg0, sprrma arg1) throws RuntimeException {
        if (arg1 == this) {
            return (spryua)arg0.clone();
        }
        if (this.cfr_renamed_4.equals(arg1.cfr_renamed_4)) {
            return (spryua)arg0.clone();
        }
        if (this.cfr_renamed_1 != arg1.cfr_renamed_1) {
            throw new RuntimeException(sprjwn.cfr_renamed_9("7BBj6m\u0015h\u0014*\u0013k\u001er\u0015v\u0004>PFA$\u0018e\u0003$\u0011$\u0014m\u0016b\u0015v\u0015j\u0004$\u0014a\u0017v\u0015aPe\u001e`Pp\u0018q\u0003$\u0013e\u001ej\u001fpPf\u0015$\u0013k\u0006a\u0002p\u0015`Pp\u001f%"));
        }
        int n = this.cfr_renamed_3.indexOf(arg1);
        if (n == -1) {
            sprrma sprrma2 = this;
            sprrma2.cfr_renamed_1019(arg1);
            n = sprrma2.cfr_renamed_3.indexOf(arg1);
        }
        sprhua[] sprhuaArray = (sprhua[])this.cfr_renamed_2.elementAt(n);
        spryua spryua2 = (spryua)arg0.clone();
        if (spryua2 instanceof sprsta) {
            ((sprsta)spryua2).cfr_renamed_1078();
        }
        sprhua sprhua2 = new sprhua(this.cfr_renamed_1, spryua2.cfr_renamed_953());
        sprhua2.cfr_renamed_973(this.cfr_renamed_1);
        sprhua sprhua3 = new sprhua(this.cfr_renamed_1);
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_1) {
            if (sprhua2.cfr_renamed_996(sprhuaArray[n])) {
                sprhua3.cfr_renamed_949(this.cfr_renamed_1 - 1 - n);
            }
            n2 = ++n;
        }
        if (arg1 instanceof sprcqa) {
            return new spryoa((sprcqa)arg1, sprhua3);
        }
        if (arg1 instanceof sprwla) {
            sprsta sprsta2 = new sprsta((sprwla)arg1, sprhua3.cfr_renamed_953());
            sprsta2.cfr_renamed_1078();
            return sprsta2;
        }
        throw new RuntimeException(sprsrf.cfr_renamed_9("\fEym\rj.o/-(l%u.q?9kAz#&v8wka.#*mkj%p?b%`.#$ekD\r1%S$o2m$n\"b'E\"f'gkl9#\fEym\u0004M\tE\"f'gj"));
    }

    public abstract spryua cfr_renamed_1020(sprhua var1);

    public final boolean equals(Object arg0) {
        if (arg0 == null || !(arg0 instanceof sprrma)) {
            return false;
        }
        sprrma sprrma2 = (sprrma)arg0;
        if (sprrma2.cfr_renamed_1 != this.cfr_renamed_1) {
            return false;
        }
        if (!this.cfr_renamed_4.equals(sprrma2.cfr_renamed_4)) {
            return false;
        }
        if (this instanceof sprcqa && !(sprrma2 instanceof sprcqa)) {
            return false;
        }
        return !(this instanceof sprwla) || sprrma2 instanceof sprwla;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final sprhua[] cfr_renamed_1023(sprhua[] arg0) {
        int n;
        int n2;
        sprhua[] sprhuaArray = new sprhua[arg0.length];
        sprhua[] sprhuaArray2 = new sprhua[arg0.length];
        int n3 = n2 = 0;
        while (n3 < this.cfr_renamed_1) {
            try {
                sprhuaArray[n2] = new sprhua(arg0[n2]);
                sprhuaArray2[n2] = new sprhua(this.cfr_renamed_1);
                sprhuaArray2[n2].cfr_renamed_949(this.cfr_renamed_1 - 1 - n2);
            }
            catch (RuntimeException runtimeException) {
                runtimeException.printStackTrace();
            }
            n3 = ++n2;
        }
        int n4 = n2 = 0;
        while (n4 < this.cfr_renamed_1 - 1) {
            int n5 = n = n2;
            while (n5 < this.cfr_renamed_1 && !sprhuaArray[n].cfr_renamed_1012(this.cfr_renamed_1 - 1 - n2)) {
                n5 = ++n;
            }
            if (n >= this.cfr_renamed_1) {
                throw new RuntimeException(sprjwn.cfr_renamed_9("7BBj6m\u0015h\u0014*\u0019j\u0006a\u0002p=e\u0004v\u0019|J$=e\u0004v\u0019|Pg\u0011j\u001ek\u0004$\u0012aPm\u001er\u0015v\u0004a\u0014%"));
            }
            if (n2 != n) {
                sprhua sprhua2 = sprhuaArray[n2];
                sprhuaArray[n2] = sprhuaArray[n];
                sprhuaArray[n] = sprhua2;
                sprhua2 = sprhuaArray2[n2];
                sprhuaArray2[n2] = sprhuaArray2[n];
                sprhuaArray2[n] = sprhua2;
            }
            int n6 = n = n2 + 1;
            while (n6 < this.cfr_renamed_1) {
                if (sprhuaArray[n].cfr_renamed_1012(this.cfr_renamed_1 - 1 - n2)) {
                    int n7 = n;
                    sprhuaArray[n7].cfr_renamed_972(sprhuaArray[n2]);
                    sprhuaArray2[n7].cfr_renamed_972(sprhuaArray2[n2]);
                }
                n6 = ++n;
            }
            n4 = ++n2;
        }
        int n8 = n2 = this.cfr_renamed_1 - 1;
        while (n8 > 0) {
            int n9 = n2 - 1;
            while (n9 >= 0) {
                if (sprhuaArray[n].cfr_renamed_1012(this.cfr_renamed_1 - 1 - n2)) {
                    int n10 = n;
                    sprhuaArray[n10].cfr_renamed_972(sprhuaArray[n2]);
                    sprhuaArray2[n10].cfr_renamed_972(sprhuaArray2[n2]);
                }
                n9 = --n;
            }
            n8 = --n2;
        }
        return sprhuaArray2;
    }
}

