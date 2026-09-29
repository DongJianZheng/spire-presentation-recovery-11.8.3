/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahk;
import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprbml;
import com.spire.presentation.packages.sprfoo;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprwlk;
import com.spire.presentation.packages.sprxxda;

public class sprnal
implements spraq {
    public static final int cfr_renamed_1 = 256;
    private sprbml cfr_renamed_2;
    public static final int cfr_renamed_3 = 512;
    public static final int cfr_renamed_4 = 1024;

    /*
     * WARNING - void declaration
     */
    public sprnal(int n, int n2) {
        void arg1;
        void arg0;
        sprnal sprnal2 = this;
        sprnal2.cfr_renamed_2 = new sprbml((int)arg0, (int)arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprnal(sprnal sprnal2) {
        void arg0;
        sprnal sprnal3 = this;
        sprnal3.cfr_renamed_2 = new sprbml(arg0.cfr_renamed_2);
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        return this.cfr_renamed_2.cfr_renamed_1219(arg0, arg1);
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_2.cfr_renamed_1221(arg0);
    }

    @Override
    public int cfr_renamed_2404() {
        return this.cfr_renamed_2.cfr_renamed_3466();
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_2.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, sprxxda.cfr_renamed_9("2?\u0004=\u000fy,\u0015\"y")).append(this.cfr_renamed_2.cfr_renamed_1195() * 8).append("-").append(this.cfr_renamed_2.cfr_renamed_3466() * 8).toString();
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_2.cfr_renamed_41();
    }

    @Override
    public void cfr_renamed_5692(sprbj arg0) throws IllegalArgumentException {
        sprahk sprahk2;
        sprahk sprahk3;
        if (arg0 instanceof sprahk) {
            sprahk2 = sprahk3 = (sprahk)arg0;
        } else if (arg0 instanceof sprtpk) {
            sprahk2 = sprahk3 = new sprwlk().cfr_renamed_2402(((sprtpk)arg0).cfr_renamed_1521()).cfr_renamed_1451();
        } else {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprfoo.cfr_renamed_9("`\u001a_\u0015E\u001dMTY\u0015[\u0015D\u0011]\u0011[TY\u0015Z\u0007L\u0010\t\u0000FTz\u001fL\u001dGTd5jT@\u001a@\u0000\tY\t")).append(arg0.getClass().getName()).toString());
        }
        if (sprahk2.cfr_renamed_1521() == null) {
            throw new IllegalArgumentException(sprxxda.cfr_renamed_9("\u0007\n1\b:A\u0019 \u0017A&\u0004%\u0014=\u00131\u0012t\u0000t\n1\u0018t\u00115\u00135\f1\u00151\u0013z"));
        }
        this.cfr_renamed_2.cfr_renamed_10111(sprahk3);
    }
}

