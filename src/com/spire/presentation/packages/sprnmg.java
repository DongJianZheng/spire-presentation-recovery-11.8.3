/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spramk;
import com.spire.presentation.packages.sprboc;
import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprepk;
import com.spire.presentation.packages.sprhdi;
import com.spire.presentation.packages.sprihg;
import com.spire.presentation.packages.sprip;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprnfg;
import com.spire.presentation.packages.sproqm;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.spruig;
import com.spire.presentation.packages.sprvei;
import com.spire.presentation.packages.sprvng;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprxil;
import com.spire.presentation.packages.spryhg;
import com.spire.presentation.packages.sprymg;
import com.spire.presentation.packages.sprzlm;
import java.security.Key;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import javax.crypto.Cipher;

public class sprnmg
extends sprymg {
    private final byte[] cfr_renamed_119;
    private final String cfr_renamed_91;
    private final int cfr_renamed_0;
    private SecureRandom cfr_renamed_1;
    private final byte[] cfr_renamed_2;
    private PublicKey cfr_renamed_3;
    private sprvng cfr_renamed_4;

    public sprnmg cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprnmg cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprvng(new sprxil((String)arg0));
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_7424(sprnfg arg0) throws spryhg {
        Cipher cipher = this.cfr_renamed_4.cfr_renamed_7427(this.cfr_renamed_615().cfr_renamed_593(), new HashMap());
        try {
            sprnmg sprnmg2 = this;
            sprnmg sprnmg3 = this;
            spramk spramk2 = new sprepk(sprihg.cfr_renamed_7444(sprnmg2.cfr_renamed_91, sprnmg2.cfr_renamed_0), sprnmg3.cfr_renamed_2, sprnmg3.cfr_renamed_119).cfr_renamed_1451();
            sprnmg sprnmg4 = this;
            sprvei sprvei2 = new sprhdi(sprnmg4.cfr_renamed_91, sprnmg4.cfr_renamed_0, spramk2.cfr_renamed_91()).cfr_renamed_1451();
            Cipher cipher2 = cipher;
            cipher2.init(3, (Key)this.cfr_renamed_3, sprvei2, this.cfr_renamed_1);
            return cipher2.wrap(spruig.cfr_renamed_7426(arg0));
        }
        catch (Exception exception) {
            throw new spryhg(new StringBuilder().insert(0, sprboc.cfr_renamed_9("iT]XP_\u001cNS\u001aKH]J\u001cYSTH_RNO\u001aW_E\u0000\u001c")).append(exception.getMessage()).toString(), exception);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprnmg(PublicKey publicKey, String string, int n, byte[] byArray, byte[] byArray2) {
        void arg3;
        void arg0;
        void arg1;
        void arg2;
        sprnmg sprnmg2 = this;
        sprnmg sprnmg3 = this;
        sprnmg sprnmg4 = this;
        super(new sprddm(sprdl.cfr_renamed_722, new sproqm(new sprddm(sprip.cfr_renamed_112, new sprzlm(new sprddm(sprbr.cfr_renamed_1337, new sprddm(sprwr.cfr_renamed_1226)), (int)((arg2 + 7) / 8))), sprihg.cfr_renamed_7444((String)arg1, (int)arg2))));
        this.cfr_renamed_4 = new sprvng(new sprrul());
        this.cfr_renamed_3 = arg0;
        sprnmg3.cfr_renamed_91 = arg1;
        sprnmg3.cfr_renamed_0 = arg2;
        sprnmg2.cfr_renamed_2 = sproze.cfr_renamed_158((byte[])arg3);
        sprnmg2.cfr_renamed_119 = sproze.cfr_renamed_158(byArray2);
    }

    /*
     * WARNING - void declaration
     */
    public sprnmg cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprvng(new sprkhi((Provider)arg0));
        return this;
    }

    public sprnmg(X509Certificate arg0, String arg1, int arg2, byte[] arg3, byte[] arg4) {
        this(arg0.getPublicKey(), arg1, arg2, arg3, arg4);
    }
}

