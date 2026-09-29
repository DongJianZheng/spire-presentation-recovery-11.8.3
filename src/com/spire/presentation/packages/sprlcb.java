/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgb;
import com.spire.presentation.packages.spreya;
import com.spire.presentation.packages.sprgib;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.spritd;
import com.spire.presentation.packages.sprkgs;
import com.spire.presentation.packages.sprkvd;
import com.spire.presentation.packages.sprlxa;
import com.spire.presentation.packages.sprmfb;
import com.spire.presentation.packages.sprqvk;
import com.spire.presentation.packages.sprrwd;
import com.spire.presentation.packages.sprtzd;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
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

public class sprlcb
extends sprbgb {
    private Map cfr_renamed_2;
    private sprlxa cfr_renamed_3;
    private PrivateKey cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprlcb(sprije sprije2, PrivateKey privateKey) {
        void arg0;
        sprlcb sprlcb2 = this;
        super((sprije)arg0);
        sprlcb sprlcb3 = this;
        sprlcb2.cfr_renamed_3 = new sprlxa(new sprkvd());
        sprlcb2.cfr_renamed_2 = new HashMap();
        sprlcb2.cfr_renamed_4 = privateKey;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public spreya cfr_renamed_1534(sprije arg0, byte[] arg1) throws sprmfb {
        try {
            Key key;
            Key key2 = null;
            sprlcb sprlcb2 = this;
            Cipher cipher = this.cfr_renamed_3.cfr_renamed_1551(this.cfr_renamed_615().cfr_renamed_593(), sprlcb2.cfr_renamed_2);
            AlgorithmParameters algorithmParameters = sprlcb2.cfr_renamed_3.cfr_renamed_1544(this.cfr_renamed_615());
            try {
                Cipher cipher2;
                if (algorithmParameters != null) {
                    Cipher cipher3 = cipher;
                    cipher2 = cipher3;
                    cipher3.init(4, (Key)this.cfr_renamed_4, algorithmParameters);
                } else {
                    Cipher cipher4 = cipher;
                    cipher2 = cipher4;
                    cipher4.init(4, this.cfr_renamed_4);
                }
                key = key2 = cipher2.unwrap(arg1, this.cfr_renamed_3.cfr_renamed_1547(arg0.cfr_renamed_593()), 3);
            }
            catch (GeneralSecurityException generalSecurityException) {
                key = key2;
            }
            catch (IllegalStateException illegalStateException) {
                key = key2;
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                key = key2;
            }
            catch (ProviderException providerException) {
                key = key2;
            }
            if (key == null) {
                cipher.init(2, this.cfr_renamed_4);
                key2 = new SecretKeySpec(cipher.doFinal(arg1), arg0.cfr_renamed_593().cfr_renamed_19());
            }
            return new sprgib(arg0, key2);
        }
        catch (InvalidKeyException invalidKeyException) {
            throw new sprmfb(new StringBuilder().insert(0, sprkgs.cfr_renamed_9("~ol*|dckycq05")).append(invalidKeyException.getMessage()).toString(), invalidKeyException);
        }
        catch (IllegalBlockSizeException illegalBlockSizeException) {
            throw new sprmfb(new StringBuilder().insert(0, sprqvk.cfr_renamed_9("G-B$I BaL-A\"E2G;K{\u000e")).append(illegalBlockSizeException.getMessage()).toString(), illegalBlockSizeException);
        }
        catch (BadPaddingException badPaddingException) {
            throw new sprmfb(new StringBuilder().insert(0, sprkgs.cfr_renamed_9("wkq*ekqn|dr05")).append(badPaddingException.getMessage()).toString(), badPaddingException);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprlcb cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_3 = new sprlxa(new sprrwd((String)arg0));
        return this;
    }

    public sprlcb cfr_renamed_1557(sprtzd arg0, String arg1) {
        sprlcb sprlcb2 = this;
        sprlcb2.cfr_renamed_2.put(arg0, arg1);
        return sprlcb2;
    }

    /*
     * WARNING - void declaration
     */
    public sprlcb cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_3 = new sprlxa(new spritd((Provider)arg0));
        return this;
    }
}

