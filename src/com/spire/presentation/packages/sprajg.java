/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.spreqg;
import com.spire.presentation.packages.sprffb;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnfg;
import com.spire.presentation.packages.sprnng;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprvng;
import com.spire.presentation.packages.sprweaa;
import com.spire.presentation.packages.sprxil;
import com.spire.presentation.packages.spryhg;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.ProviderException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.SecretKeySpec;

public class sprajg
extends sprnng {
    private Map cfr_renamed_1;
    private PrivateKey cfr_renamed_2;
    private sprvng cfr_renamed_3;
    private boolean cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprnfg cfr_renamed_7425(sprddm arg0, byte[] arg1) throws spryhg {
        try {
            Key key;
            AlgorithmParameters algorithmParameters;
            Cipher cipher;
            Key key2;
            block19: {
                block18: {
                    key2 = null;
                    sprajg sprajg2 = this;
                    cipher = this.cfr_renamed_3.cfr_renamed_7427(this.cfr_renamed_615().cfr_renamed_593(), sprajg2.cfr_renamed_1);
                    algorithmParameters = sprajg2.cfr_renamed_3.cfr_renamed_7443(this.cfr_renamed_615());
                    try {
                        Cipher cipher2;
                        if (algorithmParameters != null && !this.cfr_renamed_615().cfr_renamed_593().cfr_renamed_5078(sprgt.cfr_renamed_152)) {
                            Cipher cipher3 = cipher;
                            cipher2 = cipher3;
                            cipher3.init(4, (Key)this.cfr_renamed_2, algorithmParameters);
                        } else {
                            Cipher cipher4 = cipher;
                            cipher2 = cipher4;
                            cipher4.init(4, this.cfr_renamed_2);
                        }
                        key2 = cipher2.unwrap(arg1, this.cfr_renamed_3.cfr_renamed_7431(arg0.cfr_renamed_593()), 3);
                        if (!this.cfr_renamed_4) break block18;
                        try {
                            byte[] byArray = key2.getEncoded();
                            if (byArray == null || byArray.length == 0) {
                                key2 = null;
                            }
                        }
                        catch (Exception exception) {
                            key2 = null;
                        }
                    }
                    catch (GeneralSecurityException generalSecurityException) {
                        key = key2;
                        break block19;
                    }
                    catch (IllegalStateException illegalStateException) {
                        key = key2;
                        break block19;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        key = key2;
                        break block19;
                    }
                    catch (ProviderException providerException) {
                        // empty catch block
                    }
                }
                key = key2;
            }
            if (key == null) {
                Cipher cipher5 = cipher;
                if (algorithmParameters != null) {
                    cipher5.init(2, (Key)this.cfr_renamed_2, algorithmParameters);
                } else {
                    cipher5.init(2, this.cfr_renamed_2);
                }
                key2 = new SecretKeySpec(cipher.doFinal(arg1), arg0.cfr_renamed_593().cfr_renamed_19());
            }
            return new spreqg(arg0, key2);
        }
        catch (InvalidKeyException invalidKeyException) {
            throw new spryhg(new StringBuilder().insert(0, sprffb.cfr_renamed_9("5U'\u00107^(Q2Y:\n~")).append(invalidKeyException.getMessage()).toString(), invalidKeyException);
        }
        catch (IllegalBlockSizeException illegalBlockSizeException) {
            throw new spryhg(new StringBuilder().insert(0, sprweaa.cfr_renamed_9("_iZ`QdZ%TiYf]v_\u007fS?\u0016")).append(illegalBlockSizeException.getMessage()).toString(), illegalBlockSizeException);
        }
        catch (BadPaddingException badPaddingException) {
            throw new spryhg(new StringBuilder().insert(0, sprffb.cfr_renamed_9("<Q:\u0010.Q:T7^9\n~")).append(badPaddingException.getMessage()).toString(), badPaddingException);
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new spryhg(new StringBuilder().insert(0, sprweaa.cfr_renamed_9("lXsWi_a\u0016dZbYw_q^h\u0016uWwWhSqSwE?\u0016")).append(invalidAlgorithmParameterException.getMessage()).toString(), invalidAlgorithmParameterException);
        }
    }

    public sprajg cfr_renamed_7451(sprlem arg0, String arg1) {
        sprajg sprajg2 = this;
        sprajg2.cfr_renamed_1.put(arg0, arg1);
        return sprajg2;
    }

    public sprajg cfr_renamed_7454(boolean arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprajg cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_3 = new sprvng(new sprxil((String)arg0));
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprajg cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_3 = new sprvng(new sprkhi((Provider)arg0));
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprajg(sprddm sprddm2, PrivateKey privateKey) {
        void arg0;
        sprajg sprajg2 = this;
        super((sprddm)arg0);
        sprajg sprajg3 = this;
        sprajg2.cfr_renamed_3 = new sprvng(new sprrul());
        sprajg2.cfr_renamed_1 = new HashMap();
        sprajg2.cfr_renamed_2 = privateKey;
    }
}

