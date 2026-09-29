/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.spraqa;
import com.spire.presentation.packages.sprhie;
import com.spire.presentation.packages.spride;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprnpe;
import com.spire.presentation.packages.sprnua;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpua;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprwlb;
import com.spire.presentation.packages.spryae;
import java.io.IOException;
import java.math.BigInteger;

public class sprdta {
    private sprnpe cfr_renamed_2;
    private sprtzd cfr_renamed_3;
    private spryae cfr_renamed_4;

    public void cfr_renamed_18(sprtzd arg0, boolean arg1, byte[] arg2) {
        this.cfr_renamed_4.cfr_renamed_18(arg0, arg1, arg2);
    }

    public sprdta() {
        sprdta sprdta2 = this;
        sprdta2.cfr_renamed_4 = new spryae();
    }

    public void cfr_renamed_654(boolean arg0) {
        this.cfr_renamed_2 = sprnpe.cfr_renamed_655(arg0);
    }

    public void cfr_renamed_6(sprtzd arg0, boolean arg1, spra arg2) throws spraqa {
        sprpua.cfr_renamed_571(this.cfr_renamed_4, arg0, arg1, arg2);
    }

    public sprnua cfr_renamed_656(String arg0, byte[] arg1, BigInteger arg2) {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprwlb.cfr_renamed_9("\u0007SiX [,O=\u001c(P.S;U=T$\u001c:L,_ Z Y-"));
        }
        sprtzd sprtzd2 = new sprtzd(arg0);
        sprije sprije2 = new sprije(sprtzd2, sprume.cfr_renamed_3);
        spride spride2 = new spride(sprije2, arg1);
        sprszd sprszd2 = null;
        if (!this.cfr_renamed_4.cfr_renamed_29()) {
            sprszd2 = this.cfr_renamed_4.cfr_renamed_31();
        }
        if (arg2 != null) {
            return new sprnua(new sprhie(spride2, this.cfr_renamed_3, new sprooe(arg2), this.cfr_renamed_2, sprszd2));
        }
        return new sprnua(new sprhie(spride2, this.cfr_renamed_3, null, this.cfr_renamed_2, sprszd2));
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_657(String string) {
        void arg0;
        sprdta sprdta2 = this;
        sprdta2.cfr_renamed_3 = new sprtzd((String)arg0);
    }

    public void cfr_renamed_658(sprtzd arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public sprnua cfr_renamed_659(String arg0, byte[] arg1) {
        return this.cfr_renamed_656(arg0, arg1, null);
    }

    public void cfr_renamed_33(String arg0, boolean arg1, byte[] arg2) {
        this.cfr_renamed_4.cfr_renamed_18(new sprtzd(arg0), arg1, arg2);
    }

    public void cfr_renamed_5(String arg0, boolean arg1, spra arg2) throws IOException {
        this.cfr_renamed_33(arg0, arg1, arg2.cfr_renamed_119().cfr_renamed_91());
    }

    public sprnua cfr_renamed_660(sprtzd arg0, byte[] arg1) {
        return this.cfr_renamed_659(arg0.cfr_renamed_19(), arg1);
    }

    public sprnua cfr_renamed_661(sprtzd arg0, byte[] arg1, BigInteger arg2) {
        return this.cfr_renamed_656(arg0.cfr_renamed_19(), arg1, arg2);
    }
}

