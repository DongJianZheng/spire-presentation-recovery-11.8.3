/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spramk;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprepk;
import com.spire.presentation.packages.spreqg;
import com.spire.presentation.packages.sprhdi;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprnfg;
import com.spire.presentation.packages.sprnng;
import com.spire.presentation.packages.sproqm;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprvei;
import com.spire.presentation.packages.sprvng;
import com.spire.presentation.packages.sprxil;
import com.spire.presentation.packages.spryeo;
import com.spire.presentation.packages.spryhg;
import com.spire.presentation.packages.sprzlm;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Provider;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;

public class sprtlg
extends sprnng {
    private PrivateKey cfr_renamed_0;
    private sprvng cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private Map cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprtlg cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_1 = new sprvng(new sprkhi((Provider)arg0));
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprtlg(sprddm sprddm2, PrivateKey privateKey, byte[] byArray, byte[] byArray2) {
        void arg2;
        void arg1;
        void arg0;
        sprtlg sprtlg2 = this;
        sprtlg sprtlg3 = this;
        super((sprddm)arg0);
        sprtlg sprtlg4 = this;
        sprtlg3.cfr_renamed_1 = new sprvng(new sprrul());
        sprtlg3.cfr_renamed_4 = new HashMap();
        sprtlg3.cfr_renamed_0 = arg1;
        sprtlg2.cfr_renamed_2 = sproze.cfr_renamed_158((byte[])arg2);
        sprtlg2.cfr_renamed_3 = sproze.cfr_renamed_158(byArray2);
    }

    /*
     * WARNING - void declaration
     */
    public sprtlg cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_1 = new sprvng(new sprxil((String)arg0));
        return this;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprnfg cfr_renamed_7425(sprddm sprddm2, byte[] byArray) throws spryhg {
        sprtlg sprtlg2 = this;
        sproqm sproqm2 = sproqm.cfr_renamed_23(sprtlg2.cfr_renamed_615().cfr_renamed_284());
        sprtlg sprtlg3 = this;
        Cipher cipher = sprtlg2.cfr_renamed_1.cfr_renamed_7427(this.cfr_renamed_615().cfr_renamed_593(), sprtlg3.cfr_renamed_4);
        String string = sprtlg3.cfr_renamed_1.cfr_renamed_7435(sproqm2.cfr_renamed_7445().cfr_renamed_593());
        sprzlm sprzlm2 = sprzlm.cfr_renamed_23(sproqm2.cfr_renamed_7446().cfr_renamed_284());
        int n = sprzlm2.cfr_renamed_4600().intValue() * 8;
        try {
            void arg0;
            void arg1;
            sprtlg sprtlg4 = this;
            spramk spramk2 = new sprepk(sproqm2.cfr_renamed_7445(), sprtlg4.cfr_renamed_2, sprtlg4.cfr_renamed_3).cfr_renamed_1451();
            sprvei sprvei2 = new sprhdi(string, n, spramk2.cfr_renamed_91()).cfr_renamed_7447(sprzlm2.cfr_renamed_7448()).cfr_renamed_1451();
            Cipher cipher2 = cipher;
            cipher2.init(4, (Key)this.cfr_renamed_0, sprvei2);
            Key key = cipher2.unwrap((byte[])arg1, this.cfr_renamed_1.cfr_renamed_7431(arg0.cfr_renamed_593()), 3);
            return new spreqg((sprddm)arg0, key);
        }
        catch (Exception exception) {
            throw new spryhg(new StringBuilder().insert(0, spryeo.cfr_renamed_9("s\u001aG\u0016J\u0011\u0006\u0000ITS\u001aQ\u0006G\u0004\u0006\u0017I\u001aR\u0011H\u0000UTM\u0011_N\u0006")).append(exception.getMessage()).toString(), exception);
        }
    }
}

