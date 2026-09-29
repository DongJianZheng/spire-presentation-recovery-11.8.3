/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.spreyl;
import com.spire.presentation.packages.sprmze;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprtgl;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprwjl;

public class sprmxk
implements spraq {
    private sprtgl cfr_renamed_91;
    private long cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private static final int cfr_renamed_3 = 8;
    private int cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_1235() {
        int n = this.cfr_renamed_91.cfr_renamed_3248() - (int)(this.cfr_renamed_0 % (long)this.cfr_renamed_91.cfr_renamed_3248());
        if (n < 13) {
            n += this.cfr_renamed_91.cfr_renamed_3248();
        }
        byte[] byArray = new byte[n];
        byArray[0] = -128;
        sprpxe.cfr_renamed_444(this.cfr_renamed_0 * 8L, byArray, byArray.length - 12);
        this.cfr_renamed_91.cfr_renamed_1197(byArray, 0, byArray.length);
    }

    @Override
    public String cfr_renamed_1315() {
        return spreyl.cfr_renamed_9("\\NlH/\b.\tU\\{");
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws sprddl, IllegalStateException {
        if (this.cfr_renamed_1 == null) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprmze.cfr_renamed_9("{*40{-5-/-:(27> ")).toString());
        }
        if (arg0.length - arg1 < this.cfr_renamed_4) {
            throw new sprwjl(spreyl.cfr_renamed_9("WHlMmI8_m[~Xj\u001dlRw\u001dkUwOl"));
        }
        sprmxk sprmxk2 = this;
        sprmxk2.cfr_renamed_1235();
        sprmxk2.cfr_renamed_91.cfr_renamed_1197(this.cfr_renamed_2, 0, this.cfr_renamed_2.length);
        sprmxk sprmxk3 = this;
        sprmxk3.cfr_renamed_0 = 0L;
        int n = sprmxk3.cfr_renamed_91.cfr_renamed_1219(arg0, arg1);
        sprmxk3.cfr_renamed_41();
        return n;
    }

    @Override
    public void cfr_renamed_41() {
        sprmxk sprmxk2 = this;
        sprmxk2.cfr_renamed_0 = 0L;
        sprmxk2.cfr_renamed_91.cfr_renamed_41();
        if (sprmxk2.cfr_renamed_1 != null) {
            sprmxk sprmxk3 = this;
            sprmxk3.cfr_renamed_91.cfr_renamed_1197(sprmxk3.cfr_renamed_1, 0, this.cfr_renamed_1.length);
        }
    }

    private /* synthetic */ byte[] cfr_renamed_10119(byte[] arg0) {
        int n = (arg0.length + this.cfr_renamed_91.cfr_renamed_3248() - 1) / this.cfr_renamed_91.cfr_renamed_3248() * this.cfr_renamed_91.cfr_renamed_3248();
        if (n - arg0.length < 13) {
            n += this.cfr_renamed_91.cfr_renamed_3248();
        }
        byte[] byArray = new byte[n];
        System.arraycopy(arg0, 0, byArray, 0, arg0.length);
        byArray[arg0.length] = -128;
        sprpxe.cfr_renamed_437(arg0.length * 8, byArray, byArray.length - 12);
        return byArray;
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) throws sprddl, IllegalStateException {
        if (arg0.length - arg1 < arg2) {
            throw new sprddl(sprmze.cfr_renamed_9("\u0012*+1/d91=\">6{04+{73+)0"));
        }
        if (this.cfr_renamed_1 == null) {
            throw new IllegalStateException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(spreyl.cfr_renamed_9("\u001dvRl\u001dqSqIq\\tTkX|")).toString());
        }
        sprmxk sprmxk2 = this;
        sprmxk2.cfr_renamed_91.cfr_renamed_1197(arg0, arg1, arg2);
        sprmxk2.cfr_renamed_0 += (long)arg2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5692(sprbj sprbj2) throws IllegalArgumentException {
        this.cfr_renamed_1 = null;
        this.cfr_renamed_41();
        if (sprbj2 instanceof sprtpk) {
            int n;
            void arg0;
            byte[] byArray = ((sprtpk)arg0).cfr_renamed_1521();
            this.cfr_renamed_2 = new byte[byArray.length];
            this.cfr_renamed_1 = this.cfr_renamed_10119(byArray);
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_2.length) {
                int n3 = n++;
                this.cfr_renamed_2[n3] = ~byArray[n3];
                n2 = n;
            }
        } else {
            throw new IllegalArgumentException(sprmze.cfr_renamed_9("\u0019%?d+%)%6!/!)d+%(7> "));
        }
        sprmxk sprmxk2 = this;
        sprmxk2.cfr_renamed_91.cfr_renamed_1197(sprmxk2.cfr_renamed_1, 0, this.cfr_renamed_1.length);
    }

    @Override
    public void cfr_renamed_1221(byte arg0) throws IllegalStateException {
        sprmxk sprmxk2 = this;
        sprmxk2.cfr_renamed_91.cfr_renamed_1221(arg0);
        ++sprmxk2.cfr_renamed_0;
    }

    @Override
    public int cfr_renamed_2404() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprmxk(int n) {
        void arg0;
        sprmxk sprmxk2 = this;
        sprmxk sprmxk3 = this;
        this.cfr_renamed_91 = new sprtgl((int)arg0);
        this.cfr_renamed_4 = arg0 / 8;
        sprmxk2.cfr_renamed_1 = null;
        sprmxk2.cfr_renamed_2 = null;
    }
}

