/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahm;
import com.spire.presentation.packages.sprbxm;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcog;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdem;
import com.spire.presentation.packages.sprfbf;
import com.spire.presentation.packages.sprgem;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.spriye;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprkye;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprttc;
import com.spire.presentation.packages.sprxwg;
import java.io.IOException;
import java.math.BigInteger;

public class spregf {
    private sprbxm cfr_renamed_1;
    private static final sprcog cfr_renamed_2 = new sprcog();
    private sprgem cfr_renamed_3;
    private sprlem cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_657(String string) {
        void arg0;
        spregf spregf2 = this;
        spregf2.cfr_renamed_4 = new sprlem((String)arg0);
    }

    public void cfr_renamed_4997(String arg0, boolean arg1, sprco arg2) throws IOException {
        this.cfr_renamed_33(arg0, arg1, arg2.cfr_renamed_119().cfr_renamed_91());
    }

    public void cfr_renamed_654(boolean arg0) {
        this.cfr_renamed_1 = sprbxm.cfr_renamed_655(arg0);
    }

    public sprfbf cfr_renamed_5305(sprlem arg0, byte[] arg1, BigInteger arg2) {
        return this.cfr_renamed_5306(cfr_renamed_2.cfr_renamed_5307(arg0), arg1, arg2);
    }

    public sprfbf cfr_renamed_5308(sprddm arg0, byte[] arg1) {
        return this.cfr_renamed_5306(arg0, arg1, null);
    }

    public sprfbf cfr_renamed_5309(sprlem arg0, byte[] arg1) {
        return this.cfr_renamed_5308(cfr_renamed_2.cfr_renamed_5307(arg0), arg1);
    }

    public spregf() {
        spregf spregf2 = this;
        spregf2.cfr_renamed_3 = new sprgem();
    }

    public void cfr_renamed_33(String arg0, boolean arg1, byte[] arg2) {
        this.cfr_renamed_3.cfr_renamed_5013(new sprlem(arg0), arg1, arg2);
    }

    public sprfbf cfr_renamed_656(String arg0, byte[] arg1, BigInteger arg2) {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprxwg.cfr_renamed_9("Vq8zqy}ml>yr\u007fqjwlvu>kn}}qxq{|"));
        }
        sprlem sprlem2 = new sprlem(arg0);
        sprddm sprddm2 = cfr_renamed_2.cfr_renamed_5307(sprlem2);
        sprahm sprahm2 = new sprahm(sprddm2, arg1);
        sprhgm sprhgm2 = null;
        if (!this.cfr_renamed_3.cfr_renamed_29()) {
            sprhgm2 = this.cfr_renamed_3.cfr_renamed_31();
        }
        if (arg2 != null) {
            return new sprfbf(new sprdem(sprahm2, this.cfr_renamed_4, new sprktm(arg2), this.cfr_renamed_1, sprhgm2));
        }
        return new sprfbf(new sprdem(sprahm2, this.cfr_renamed_4, null, this.cfr_renamed_1, sprhgm2));
    }

    public sprfbf cfr_renamed_5306(sprddm arg0, byte[] arg1, BigInteger arg2) {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprttc.cfr_renamed_9("\f#\u000f/\u001b>H+\u0004-\u00078\u0001>\u0000'H$\u0007>H9\u0018/\u000b#\u000e#\r."));
        }
        sprahm sprahm2 = new sprahm(arg0, arg1);
        sprhgm sprhgm2 = null;
        if (!this.cfr_renamed_3.cfr_renamed_29()) {
            sprhgm2 = this.cfr_renamed_3.cfr_renamed_31();
        }
        if (arg2 != null) {
            return new sprfbf(new sprdem(sprahm2, this.cfr_renamed_4, new sprktm(arg2), this.cfr_renamed_1, sprhgm2));
        }
        return new sprfbf(new sprdem(sprahm2, this.cfr_renamed_4, null, this.cfr_renamed_1, sprhgm2));
    }

    public void cfr_renamed_5013(sprlem arg0, boolean arg1, byte[] arg2) {
        this.cfr_renamed_3.cfr_renamed_5013(arg0, arg1, arg2);
    }

    public void cfr_renamed_4998(sprlem arg0, boolean arg1, sprco arg2) throws spriye {
        sprkye.cfr_renamed_5280(this.cfr_renamed_3, arg0, arg1, arg2);
    }

    public sprfbf cfr_renamed_659(String arg0, byte[] arg1) {
        return this.cfr_renamed_656(arg0, arg1, null);
    }

    public void cfr_renamed_5310(sprlem arg0) {
        this.cfr_renamed_4 = arg0;
    }
}

