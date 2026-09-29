/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcqa;
import com.spire.presentation.packages.sprhua;
import com.spire.presentation.packages.sprlsa;
import com.spire.presentation.packages.sprrhn;
import com.spire.presentation.packages.sprrma;
import com.spire.presentation.packages.sprsta;
import com.spire.presentation.packages.sprwla;
import com.spire.presentation.packages.spryoa;
import com.spire.presentation.packages.spryua;

public class sprnma {
    private int cfr_renamed_3;
    private spryua[] cfr_renamed_4;

    public final sprnma cfr_renamed_1056(sprnma arg0) throws RuntimeException, ArithmeticException {
        sprnma[] sprnmaArray = new sprnma[2];
        sprnmaArray = this.cfr_renamed_1057(arg0);
        return sprnmaArray[1];
    }

    public int hashCode() {
        return this.cfr_renamed_813() + this.cfr_renamed_4.hashCode();
    }

    public final void cfr_renamed_1058() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            this.cfr_renamed_4[n++].cfr_renamed_986();
            n2 = n;
        }
    }

    public final void cfr_renamed_1059(int arg0) {
        if (arg0 <= this.cfr_renamed_3) {
            return;
        }
        spryua[] spryuaArray = new spryua[arg0];
        sprnma sprnma2 = this;
        System.arraycopy(sprnma2.cfr_renamed_4, 0, spryuaArray, 0, this.cfr_renamed_3);
        sprrma sprrma2 = sprnma2.cfr_renamed_4[0].cfr_renamed_845();
        if (sprnma2.cfr_renamed_4[0] instanceof spryoa) {
            int n;
            int n2 = n = this.cfr_renamed_3;
            while (n2 < arg0) {
                spryuaArray[n++] = spryoa.cfr_renamed_1026((sprcqa)sprrma2);
                n2 = n;
            }
        } else if (this.cfr_renamed_4[0] instanceof sprsta) {
            int n;
            int n3 = n = this.cfr_renamed_3;
            while (n3 < arg0) {
                spryuaArray[n++] = sprsta.cfr_renamed_1060((sprwla)sprrma2);
                n3 = n;
            }
        }
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = spryuaArray;
    }

    public sprnma(int arg0, spryua arg1) {
        int n;
        sprnma sprnma2 = this;
        sprnma sprnma3 = this;
        sprnma2.cfr_renamed_3 = arg0;
        sprnma2.cfr_renamed_4 = new spryua[sprnma3.cfr_renamed_3];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            this.cfr_renamed_4[n++] = (spryua)arg1.clone();
            n2 = n;
        }
    }

    public final int cfr_renamed_84() {
        return this.cfr_renamed_3;
    }

    public final boolean equals(Object arg0) {
        int n;
        if (arg0 == null || !(arg0 instanceof sprnma)) {
            return false;
        }
        sprnma sprnma2 = (sprnma)arg0;
        if (this.cfr_renamed_813() != sprnma2.cfr_renamed_813()) {
            return false;
        }
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            if (!this.cfr_renamed_4[n].equals(sprnma2.cfr_renamed_4[n])) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public final sprnma cfr_renamed_1061(sprnma sprnma2) throws RuntimeException {
        int n;
        int n2;
        int n3 = this.cfr_renamed_84();
        if (n3 != (n2 = sprnma2.cfr_renamed_84())) {
            throw new IllegalArgumentException(sprlsa.cfr_renamed_9("\u0013-/;--.+\".\u0004\u0004q,m/6.7+3.:xc6++0b\",'b!b.706c*\"4&b7*&b0#.'c1*8&c"));
        }
        sprnma sprnma3 = new sprnma((n3 << 1) - 1);
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_84()) {
            void arg0;
            int n5;
            int n6 = n5 = 0;
            while (n6 < arg0.cfr_renamed_84()) {
                sprnma3.cfr_renamed_4[n + n5] = sprnma3.cfr_renamed_4[n + n5] == null ? (spryua)this.cfr_renamed_4[n].cfr_renamed_955(arg0.cfr_renamed_4[n5]) : (spryua)sprnma3.cfr_renamed_4[n + n5].cfr_renamed_128(this.cfr_renamed_4[n].cfr_renamed_955(arg0.cfr_renamed_4[n5]));
                n6 = ++n5;
            }
            n4 = ++n;
        }
        return sprnma3;
    }

    public final sprnma cfr_renamed_1030(sprnma arg0) throws RuntimeException, ArithmeticException {
        sprnma sprnma2;
        sprnma sprnma3 = new sprnma(this);
        sprnma sprnma4 = sprnma2 = new sprnma(arg0);
        sprnma3.cfr_renamed_1062();
        sprnma2.cfr_renamed_1062();
        while (!sprnma4.cfr_renamed_805()) {
            sprnma sprnma5 = sprnma3.cfr_renamed_1056(sprnma2);
            sprnma3 = sprnma2;
            sprnma4 = sprnma5;
        }
        sprnma sprnma6 = sprnma3;
        return sprnma6.cfr_renamed_1063((spryua)sprnma6.cfr_renamed_4[sprnma3.cfr_renamed_813()].cfr_renamed_952());
    }

    public final sprnma cfr_renamed_979(int arg0) {
        int n;
        if (arg0 <= 0) {
            return new sprnma(this);
        }
        sprnma sprnma2 = new sprnma(this.cfr_renamed_3 + arg0, this.cfr_renamed_4[0]);
        sprnma2.cfr_renamed_1058();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            int n3 = n + arg0;
            spryua spryua2 = this.cfr_renamed_4[n];
            sprnma2.cfr_renamed_4[n3] = spryua2;
            n2 = ++n;
        }
        return sprnma2;
    }

    public final sprnma cfr_renamed_1064(sprnma arg0) throws RuntimeException, ArithmeticException {
        return this.cfr_renamed_1056(arg0);
    }

    private /* synthetic */ sprnma(int arg0) {
        sprnma sprnma2 = this;
        sprnma sprnma3 = this;
        sprnma2.cfr_renamed_3 = arg0;
        sprnma2.cfr_renamed_4 = new spryua[sprnma3.cfr_renamed_3];
    }

    public final int cfr_renamed_813() {
        int n;
        int n2 = n = this.cfr_renamed_3 - 1;
        while (n2 >= 0) {
            if (!this.cfr_renamed_4[n].cfr_renamed_805()) {
                return n;
            }
            n2 = --n;
        }
        return -1;
    }

    public final sprnma cfr_renamed_1029(sprnma arg0) throws RuntimeException {
        sprnma sprnma2;
        if (this.cfr_renamed_84() >= arg0.cfr_renamed_84()) {
            int n;
            sprnma2 = new sprnma(this.cfr_renamed_84());
            int n2 = n = 0;
            while (n2 < arg0.cfr_renamed_84()) {
                int n3 = n;
                spryua spryua2 = (spryua)this.cfr_renamed_4[n].cfr_renamed_128(arg0.cfr_renamed_4[n3]);
                sprnma2.cfr_renamed_4[n3] = spryua2;
                n2 = ++n;
            }
            int n4 = n;
            while (n4 < this.cfr_renamed_84()) {
                int n5 = n++;
                sprnma2.cfr_renamed_4[n5] = this.cfr_renamed_4[n5];
                n4 = n;
            }
        } else {
            int n;
            sprnma2 = new sprnma(arg0.cfr_renamed_84());
            int n6 = n = 0;
            while (n6 < this.cfr_renamed_84()) {
                int n7 = n;
                spryua spryua3 = (spryua)this.cfr_renamed_4[n].cfr_renamed_128(arg0.cfr_renamed_4[n7]);
                sprnma2.cfr_renamed_4[n7] = spryua3;
                n6 = ++n;
            }
            int n8 = n;
            while (n8 < arg0.cfr_renamed_84()) {
                int n9 = n++;
                sprnma2.cfr_renamed_4[n9] = arg0.cfr_renamed_4[n9];
                n8 = n;
            }
        }
        return sprnma2;
    }

    public final void cfr_renamed_1062() {
        int n;
        sprnma sprnma2 = this;
        for (n = (v76282).cfr_renamed_3 - 1; sprnma2.cfr_renamed_4[n].cfr_renamed_805() && n > 0; --n) {
            sprnma2 = this;
        }
        if (++n < this.cfr_renamed_3) {
            spryua[] spryuaArray = new spryua[n];
            sprnma sprnma3 = this;
            System.arraycopy(this.cfr_renamed_4, 0, spryuaArray, 0, n);
            sprnma3.cfr_renamed_4 = spryuaArray;
            sprnma3.cfr_renamed_3 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprnma(sprnma sprnma2) {
        int n;
        void arg0;
        this.cfr_renamed_4 = new spryua[sprnma2.cfr_renamed_3];
        this.cfr_renamed_3 = arg0.cfr_renamed_3;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            int n3 = n++;
            this.cfr_renamed_4[n3] = (spryua)arg0.cfr_renamed_4[n3].clone();
            n2 = n;
        }
    }

    public final sprnma cfr_renamed_1063(spryua arg0) throws RuntimeException {
        int n;
        sprnma sprnma2 = new sprnma(this.cfr_renamed_84());
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_84()) {
            int n3 = n++;
            sprnma2.cfr_renamed_4[n3] = (spryua)this.cfr_renamed_4[n3].cfr_renamed_955(arg0);
            n2 = n;
        }
        return sprnma2;
    }

    public final sprnma[] cfr_renamed_1057(sprnma arg0) throws RuntimeException, ArithmeticException {
        int n;
        sprnma[] sprnmaArray = new sprnma[2];
        sprnma sprnma2 = new sprnma(this);
        sprnma sprnma3 = arg0;
        sprnma2.cfr_renamed_1062();
        int n2 = sprnma3.cfr_renamed_813();
        spryua spryua2 = (spryua)sprnma3.cfr_renamed_4[n2].cfr_renamed_952();
        if (sprnma2.cfr_renamed_813() < n2) {
            sprnma[] sprnmaArray2 = sprnmaArray;
            sprnmaArray[0] = new sprnma(this);
            sprnmaArray[0].cfr_renamed_1058();
            sprnmaArray[0].cfr_renamed_1062();
            sprnmaArray2[1] = new sprnma(this);
            sprnmaArray[1].cfr_renamed_1062();
            return sprnmaArray2;
        }
        sprnmaArray[0] = new sprnma(this);
        sprnmaArray[0].cfr_renamed_1058();
        int n3 = n = sprnma2.cfr_renamed_813() - n2;
        while (n3 >= 0) {
            sprnma sprnma4;
            spryua spryua3 = (spryua)sprnma2.cfr_renamed_4[sprnma2.cfr_renamed_813()].cfr_renamed_955(spryua2);
            sprnma sprnma5 = sprnma4 = arg0.cfr_renamed_1063(spryua3);
            sprnma5.cfr_renamed_1065(n);
            sprnma2 = sprnma2.cfr_renamed_1029(sprnma5);
            sprnma2.cfr_renamed_1062();
            sprnmaArray[0].cfr_renamed_4[n] = (spryua)spryua3.clone();
            n3 = sprnma2.cfr_renamed_813() - n2;
        }
        sprnmaArray[1] = sprnma2;
        sprnmaArray[0].cfr_renamed_1062();
        return sprnmaArray;
    }

    public final void cfr_renamed_1027(int arg0, spryua arg1) {
        if (!(arg1 instanceof spryoa) && !(arg1 instanceof sprsta)) {
            throw new IllegalArgumentException(sprrhn.cfr_renamed_9("snOxMnNhBmdG\u0011o\rrFu\u0003g\u0003lVrW!Ad\u0003`M!JoPuBo@d\u0003nE!FhWiFs\u0003Fe3MQLmZoLlJ`ODOdNdMu\u0003nQ!dG\u0011olOaDOdNdMu\u0002"));
        }
        this.cfr_renamed_4[arg0] = (spryua)arg1.clone();
    }

    public final void cfr_renamed_1065(int arg0) {
        block3: {
            int n;
            sprrma sprrma2;
            block4: {
                if (arg0 <= 0) break block3;
                sprnma sprnma2 = this;
                int n2 = sprnma2.cfr_renamed_3;
                sprrma2 = sprnma2.cfr_renamed_4[0].cfr_renamed_845();
                sprnma2.cfr_renamed_1059(sprnma2.cfr_renamed_3 + arg0);
                int n3 = n = n2 - 1;
                while (n3 >= 0) {
                    int n4 = n + arg0;
                    spryua spryua2 = this.cfr_renamed_4[n];
                    this.cfr_renamed_4[n4] = spryua2;
                    n3 = --n;
                }
                if (!(this.cfr_renamed_4[0] instanceof spryoa)) break block4;
                int n5 = n = arg0 - 1;
                while (n5 >= 0) {
                    this.cfr_renamed_4[n--] = spryoa.cfr_renamed_1026((sprcqa)sprrma2);
                    n5 = n;
                }
                break block3;
            }
            if (!(this.cfr_renamed_4[0] instanceof sprsta)) break block3;
            int n6 = n = arg0 - 1;
            while (n6 >= 0) {
                this.cfr_renamed_4[n--] = sprsta.cfr_renamed_1060((sprwla)sprrma2);
                n6 = n;
            }
        }
    }

    public final boolean cfr_renamed_805() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            if (this.cfr_renamed_4[n] != null && !this.cfr_renamed_4[n].cfr_renamed_805()) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public final spryua cfr_renamed_1032(int arg0) {
        return this.cfr_renamed_4[arg0];
    }

    public final sprnma cfr_renamed_1031(sprnma arg0) throws RuntimeException, ArithmeticException {
        sprnma[] sprnmaArray = new sprnma[2];
        sprnmaArray = this.cfr_renamed_1057(arg0);
        return sprnmaArray[0];
    }

    public final sprnma cfr_renamed_1028(sprnma arg0, sprnma arg1) throws RuntimeException, ArithmeticException {
        return this.cfr_renamed_1061(arg0).cfr_renamed_1064(arg1);
    }

    public sprnma(sprhua arg0, sprrma arg1) {
        sprnma sprnma2 = this;
        sprnma sprnma3 = this;
        sprnma2.cfr_renamed_3 = arg1.cfr_renamed_813() + 1;
        sprnma2.cfr_renamed_4 = new spryua[sprnma3.cfr_renamed_3];
        if (arg1 instanceof sprwla) {
            int n;
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_3) {
                this.cfr_renamed_4[n] = arg0.cfr_renamed_1012(n) ? sprsta.cfr_renamed_1021((sprwla)arg1) : sprsta.cfr_renamed_1060((sprwla)arg1);
                n2 = ++n;
            }
        } else if (arg1 instanceof sprcqa) {
            int n;
            int n3 = n = 0;
            while (n3 < this.cfr_renamed_3) {
                this.cfr_renamed_4[n] = arg0.cfr_renamed_1012(n) ? spryoa.cfr_renamed_1022((sprcqa)arg1) : spryoa.cfr_renamed_1026((sprcqa)arg1);
                n3 = ++n;
            }
        } else {
            throw new IllegalArgumentException(sprlsa.cfr_renamed_9("\u0013-/;--.+\".\u0004\u0004q,k\u0000*6061+-%ob\u0004\u0004q,\u0005+&.'kyb\u0001sc/617b!'c#-b*,06\", 'c-%b\u0004\u0004q,\f\f\u0001\u0004*'/&c-1b\u0004\u0004q,\u0013-/;--.+\".\u0005+&.'c"));
        }
    }
}

