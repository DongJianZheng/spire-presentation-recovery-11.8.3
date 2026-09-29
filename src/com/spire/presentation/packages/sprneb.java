/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcep;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprhn;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.spritd;
import com.spire.presentation.packages.sprkvd;
import com.spire.presentation.packages.sprkza;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmgb;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprmrg;
import com.spire.presentation.packages.sprrwd;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprtzd;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

public class sprneb {
    private sprhn cfr_renamed_3;
    private static final Map cfr_renamed_4 = new HashMap();

    /*
     * WARNING - void declaration
     */
    public sprneb cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_3 = new sprrwd((String)arg0);
        return this;
    }

    static {
        cfr_renamed_4.put(sprtk.cfr_renamed_137, sprmrg.cfr_renamed_9("\rL\f\\\t"));
        cfr_renamed_4.put(sprm.cfr_renamed_1510, "RSA");
        cfr_renamed_4.put(sprtk.cfr_renamed_314, "DSA");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PublicKey cfr_renamed_1255(sprdce arg0) throws sprkza {
        try {
            KeyFactory keyFactory = this.cfr_renamed_1619(arg0.cfr_renamed_593());
            return keyFactory.generatePublic(new X509EncodedKeySpec(arg0.cfr_renamed_91()));
        }
        catch (Exception exception) {
            throw new sprkza(new StringBuilder().insert(0, sprcep.cfr_renamed_9("zznvcq/``4l{abjf{4dqv4\u007fuff54")).append(exception.getMessage()).toString(), exception);
        }
    }

    public sprneb() {
        sprneb sprneb2 = this;
        sprneb2.cfr_renamed_3 = new sprkvd();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PrivateKey cfr_renamed_1253(sprmke arg0) throws sprkza {
        try {
            KeyFactory keyFactory = this.cfr_renamed_1619(arg0.cfr_renamed_1254());
            return keyFactory.generatePrivate(new PKCS8EncodedKeySpec(arg0.cfr_renamed_91()));
        }
        catch (Exception exception) {
            throw new sprkza(new StringBuilder().insert(0, sprmrg.cfr_renamed_9("z&n*c-/<`hl'a>j:{hd-vh\u007f)f:5h")).append(exception.getMessage()).toString(), exception);
        }
    }

    private /* synthetic */ KeyFactory cfr_renamed_1619(sprije arg0) throws NoSuchAlgorithmException, NoSuchProviderException {
        sprtzd sprtzd2 = arg0.cfr_renamed_593();
        String string = (String)cfr_renamed_4.get(sprtzd2);
        if (string == null) {
            string = sprtzd2.cfr_renamed_19();
        }
        return this.cfr_renamed_3.cfr_renamed_1511(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public KeyPair cfr_renamed_1620(sprmgb arg0) throws sprkza {
        try {
            KeyFactory keyFactory = this.cfr_renamed_1619(arg0.cfr_renamed_1598().cfr_renamed_1254());
            return new KeyPair(keyFactory.generatePublic(new X509EncodedKeySpec(arg0.cfr_renamed_1597().cfr_renamed_91())), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(arg0.cfr_renamed_1598().cfr_renamed_91())));
        }
        catch (Exception exception) {
            throw new sprkza(new StringBuilder().insert(0, sprcep.cfr_renamed_9("zznvcq/``4l{abjf{4dqv4\u007fuff54")).append(exception.getMessage()).toString(), exception);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprneb cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_3 = new spritd((Provider)arg0);
        return this;
    }
}

