/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprhyda;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprjs;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sprkv;
import com.spire.presentation.packages.sprlbl;
import com.spire.presentation.packages.sprmuk;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrkl;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprwfq;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryzk;
import com.spire.presentation.packages.sprzuk;
import java.security.SecureRandom;

public class sprdvk
implements sprkv {
    private sprjs cfr_renamed_91;
    private boolean cfr_renamed_0;
    private boolean cfr_renamed_1;
    private sprmuk cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private boolean cfr_renamed_4;

    @Override
    public void cfr_renamed_5692(sprbj arg0) throws IllegalArgumentException {
        if (!(arg0 instanceof sprmuk)) {
            throw new IllegalArgumentException(sprwfq.cfr_renamed_9("j\u0014\u000f<J.\u000f%J&Z>]2K"));
        }
        this.cfr_renamed_2 = (sprmuk)arg0;
        sprybl.cfr_renamed_9170(new sprfdl(sprhyda.cfr_renamed_9("\u0015*\u0019,\u0003\"5\u0004"), sprrkl.cfr_renamed_9917(this.cfr_renamed_2.cfr_renamed_284().cfr_renamed_1769()), arg0, spriil.cfr_renamed_0));
    }

    public sprbj cfr_renamed_3487(byte[] arg0, int arg1) {
        return this.cfr_renamed_3485(arg0, 0, arg1);
    }

    public sprbj cfr_renamed_3488(byte[] arg0, int arg1) {
        return this.cfr_renamed_1456(arg0, 0, arg0.length, arg1);
    }

    @Override
    public sprbj cfr_renamed_3485(byte[] arg0, int arg1, int arg2) throws IllegalArgumentException {
        if (!(this.cfr_renamed_2 instanceof sprnzk)) {
            throw new IllegalArgumentException(sprwfq.cfr_renamed_9("\u0007Z5C>LwD2Vw]2^\"F%J3\u000f1@%\u000f2A4]._#F8A"));
        }
        sprdvk sprdvk2 = this;
        sprdvk sprdvk3 = this;
        sprki sprki2 = new spryzk(arg2, sprdvk2.cfr_renamed_91, sprdvk2.cfr_renamed_3, sprdvk3.cfr_renamed_4, sprdvk3.cfr_renamed_1, this.cfr_renamed_0).cfr_renamed_5686(this.cfr_renamed_2);
        byte[] byArray = sprki2.cfr_renamed_5684();
        System.arraycopy(byArray, 0, arg0, arg1, byArray.length);
        return new sprtpk(sprki2.cfr_renamed_3880());
    }

    public sprdvk(sprjs arg0, SecureRandom arg1, boolean arg2, boolean arg3, boolean arg4) {
        sprdvk sprdvk2;
        sprdvk sprdvk3 = this;
        sprdvk3.cfr_renamed_91 = arg0;
        sprdvk3.cfr_renamed_3 = arg1;
        this.cfr_renamed_4 = arg2;
        if (this.cfr_renamed_4) {
            sprdvk2 = this;
            this.cfr_renamed_1 = false;
        } else {
            sprdvk2 = this;
            this.cfr_renamed_1 = arg3;
        }
        sprdvk2.cfr_renamed_0 = arg4;
    }

    /*
     * WARNING - void declaration
     */
    public sprdvk(sprjs sprjs2, SecureRandom secureRandom) {
        void arg1;
        void arg0;
        sprdvk sprdvk2 = this;
        sprdvk sprdvk3 = this;
        this.cfr_renamed_91 = arg0;
        sprdvk3.cfr_renamed_3 = arg1;
        sprdvk3.cfr_renamed_4 = false;
        sprdvk2.cfr_renamed_1 = false;
        sprdvk2.cfr_renamed_0 = false;
    }

    @Override
    public sprbj cfr_renamed_1456(byte[] arg0, int arg1, int arg2, int arg3) throws IllegalArgumentException {
        if (!(this.cfr_renamed_2 instanceof sprzuk)) {
            throw new IllegalArgumentException(sprhyda.cfr_renamed_9("9\"\u0000&\b$\fp\u00025\u0010p\u001b5\u0018%\u0000\"\f4I6\u0006\"I5\u00073\u001b)\u0019$\u0000?\u0007"));
        }
        sprzuk sprzuk2 = (sprzuk)this.cfr_renamed_2;
        sprdvk sprdvk2 = this;
        sprdvk sprdvk3 = this;
        int n = arg1;
        byte[] byArray = new sprlbl(sprzuk2, arg3, sprdvk2.cfr_renamed_91, sprdvk2.cfr_renamed_4, sprdvk3.cfr_renamed_1, sprdvk3.cfr_renamed_0).cfr_renamed_5685(sproze.cfr_renamed_533(arg0, n, n + arg2));
        return new sprtpk(byArray);
    }
}

