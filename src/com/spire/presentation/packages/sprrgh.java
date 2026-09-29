/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddh;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdxba;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprlum;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxil;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;

public class sprrgh
extends sprddh {
    public sprrr cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprrgh(sprlum sprlum2, sprrr sprrr2) {
        super((sprlum)arg0);
        void arg0;
        sprrgh sprrgh2 = this;
        this.cfr_renamed_4 = new sprrul();
        this.cfr_renamed_4 = sprrr2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PublicKey cfr_renamed_1157() throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException {
        try {
            sprrgh sprrgh2 = this;
            sprvhm sprvhm2 = ((sprlum)((Object)sprrgh2.cfr_renamed_4)).cfr_renamed_1622().cfr_renamed_1489();
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(sprvhm2.cfr_renamed_91());
            sprddm sprddm2 = sprvhm2.cfr_renamed_593();
            return sprrgh2.cfr_renamed_4.cfr_renamed_1511(sprddm2.cfr_renamed_593().cfr_renamed_19()).generatePublic(x509EncodedKeySpec);
        }
        catch (Exception exception) {
            throw new InvalidKeyException(sprdxba.cfr_renamed_9("\bB\u001f_\u001f\u0010\b^\u000e_\tY\u0003WM@\u0018R\u0001Y\u000e\u0010\u0006U\u0014"));
        }
    }

    public sprrgh cfr_renamed_1499(String arg0) {
        return new sprrgh((sprlum)((Object)this.cfr_renamed_4), new sprxil(arg0));
    }

    public sprrgh(byte[] byArray) {
        super(byArray);
        sprrgh sprrgh2 = this;
        sprrgh2.cfr_renamed_4 = new sprrul();
    }

    public sprrgh cfr_renamed_1498(Provider arg0) {
        return new sprrgh((sprlum)((Object)this.cfr_renamed_4), new sprkhi(arg0));
    }
}

