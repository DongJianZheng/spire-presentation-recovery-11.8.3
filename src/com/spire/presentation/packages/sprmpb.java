/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprttl;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprxsb;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.PBEKeySpec;

public class sprmpb
implements PBEKey {
    public int cfr_renamed_152;
    public boolean cfr_renamed_112;
    public sprtzd cfr_renamed_119;
    public sprt cfr_renamed_91;
    public String cfr_renamed_0;
    public int cfr_renamed_1;
    public int cfr_renamed_2;
    public PBEKeySpec cfr_renamed_3;
    public int cfr_renamed_4;

    public sprt cfr_renamed_2292() {
        return this.cfr_renamed_91;
    }

    public int cfr_renamed_580() {
        return this.cfr_renamed_2;
    }

    @Override
    public int getIterationCount() {
        return this.cfr_renamed_3.getIterationCount();
    }

    public int cfr_renamed_2398() {
        return this.cfr_renamed_1;
    }

    public boolean cfr_renamed_2399() {
        return this.cfr_renamed_112;
    }

    /*
     * WARNING - void declaration
     */
    public sprmpb(String string, sprtzd sprtzd2, int n, int n2, int n3, int n4, PBEKeySpec pBEKeySpec, sprt sprt2) {
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprmpb sprmpb2 = this;
        sprmpb sprmpb3 = this;
        sprmpb sprmpb4 = this;
        sprmpb sprmpb5 = this;
        this.cfr_renamed_112 = false;
        sprmpb5.cfr_renamed_0 = arg0;
        sprmpb5.cfr_renamed_119 = arg1;
        sprmpb4.cfr_renamed_4 = arg2;
        sprmpb4.cfr_renamed_2 = arg3;
        sprmpb3.cfr_renamed_1 = arg4;
        sprmpb3.cfr_renamed_152 = arg5;
        sprmpb2.cfr_renamed_3 = arg6;
        sprmpb2.cfr_renamed_91 = sprt2;
    }

    public sprtzd cfr_renamed_113() {
        return this.cfr_renamed_119;
    }

    public void cfr_renamed_1502(boolean arg0) {
        this.cfr_renamed_112 = arg0;
    }

    @Override
    public String getFormat() {
        return sprttl.cfr_renamed_9("URP");
    }

    @Override
    public char[] getPassword() {
        return this.cfr_renamed_3.getPassword();
    }

    @Override
    public byte[] getSalt() {
        return this.cfr_renamed_3.getSalt();
    }

    @Override
    public String getAlgorithm() {
        return this.cfr_renamed_0;
    }

    public int cfr_renamed_324() {
        return this.cfr_renamed_4;
    }

    @Override
    public byte[] getEncoded() {
        if (this.cfr_renamed_91 != null) {
            sprnld sprnld2;
            sprnld sprnld3;
            return (this.cfr_renamed_91 instanceof sprnjd ? (sprnld3 = (sprnld)((sprnjd)this.cfr_renamed_91).cfr_renamed_284()) : (sprnld2 = (sprnld)this.cfr_renamed_91)).cfr_renamed_1521();
        }
        if (this.cfr_renamed_4 == 2) {
            return sprxsb.cfr_renamed_1516(this.cfr_renamed_3.getPassword());
        }
        if (this.cfr_renamed_4 == 5) {
            return sprxsb.cfr_renamed_2400(this.cfr_renamed_3.getPassword());
        }
        return sprxsb.cfr_renamed_1606(this.cfr_renamed_3.getPassword());
    }

    public int cfr_renamed_2294() {
        return this.cfr_renamed_152;
    }
}

