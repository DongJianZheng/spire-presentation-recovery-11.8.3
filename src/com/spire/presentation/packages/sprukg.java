/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spragg;
import com.spire.presentation.packages.sprazo;
import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprfiz;
import com.spire.presentation.packages.sprirg;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxil;
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

public class sprukg {
    private static final Map cfr_renamed_3 = new HashMap();
    private sprrr cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PublicKey cfr_renamed_5726(sprvhm arg0) throws spragg {
        try {
            KeyFactory keyFactory = this.cfr_renamed_7520(arg0.cfr_renamed_593());
            return keyFactory.generatePublic(new X509EncodedKeySpec(arg0.cfr_renamed_91()));
        }
        catch (Exception exception) {
            throw new spragg(new StringBuilder().insert(0, sprazo.cfr_renamed_9("aNuBxE4T{\u0000wOzVqR`\u0000\u007fEm\u0000dA}R.\u0000")).append(exception.getMessage()).toString(), exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public KeyPair cfr_renamed_7521(sprirg arg0) throws spragg {
        try {
            KeyFactory keyFactory = this.cfr_renamed_7520(arg0.cfr_renamed_1598().cfr_renamed_1254());
            return new KeyPair(keyFactory.generatePublic(new X509EncodedKeySpec(arg0.cfr_renamed_1597().cfr_renamed_91())), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(arg0.cfr_renamed_1598().cfr_renamed_91())));
        }
        catch (Exception exception) {
            throw new spragg(new StringBuilder().insert(0, sprfiz.cfr_renamed_9("\u0010\u0000\u0004\f\t\u000bE\u001a\nN\u0006\u0001\u000b\u0018\u0000\u001c\u0011N\u000e\u000b\u001cN\u0015\u000f\f\u001c_N")).append(exception.getMessage()).toString(), exception);
        }
    }

    static {
        cfr_renamed_3.put(sprbr.cfr_renamed_135, sprazo.cfr_renamed_9("eWdGa"));
        cfr_renamed_3.put(sprdl.cfr_renamed_1205, "RSA");
        cfr_renamed_3.put(sprbr.cfr_renamed_84, "DSA");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ KeyFactory cfr_renamed_7520(sprddm arg0) throws NoSuchAlgorithmException, NoSuchProviderException {
        sprlem sprlem2 = arg0.cfr_renamed_593();
        String string = (String)cfr_renamed_3.get(sprlem2);
        if (string == null) {
            string = sprlem2.cfr_renamed_19();
        }
        try {
            return this.cfr_renamed_4.cfr_renamed_1511(string);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            if (string.equals(sprfiz.cfr_renamed_9("+&*6/"))) {
                return this.cfr_renamed_4.cfr_renamed_1511("EC");
            }
            throw noSuchAlgorithmException;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprukg cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprxil((String)arg0);
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PrivateKey cfr_renamed_5729(sprcom arg0) throws spragg {
        try {
            KeyFactory keyFactory = this.cfr_renamed_7520(arg0.cfr_renamed_1254());
            return keyFactory.generatePrivate(new PKCS8EncodedKeySpec(arg0.cfr_renamed_91()));
        }
        catch (Exception exception) {
            throw new spragg(new StringBuilder().insert(0, sprazo.cfr_renamed_9("aNuBxE4T{\u0000wOzVqR`\u0000\u007fEm\u0000dA}R.\u0000")).append(exception.getMessage()).toString(), exception);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprukg cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprkhi((Provider)arg0);
        return this;
    }

    public sprukg() {
        sprukg sprukg2 = this;
        sprukg2.cfr_renamed_4 = new sprrul();
    }
}

