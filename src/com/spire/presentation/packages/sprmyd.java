/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spred;
import com.spire.presentation.packages.sprfa;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.spritd;
import com.spire.presentation.packages.sprkvd;
import com.spire.presentation.packages.sprpwd;
import com.spire.presentation.packages.sprrwd;
import com.spire.presentation.packages.sprsud;
import com.spire.presentation.packages.sprucq;
import com.spire.presentation.packages.sprwmq;
import com.spire.presentation.packages.sprzod;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.ProviderException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.SecretKeySpec;

public class sprmyd
implements spred {
    private sprsud cfr_renamed_3;
    private PrivateKey cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprmyd cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_3 = new sprsud(new sprrwd((String)arg0));
        return this;
    }

    public sprmyd(PrivateKey privateKey) {
        sprmyd sprmyd2 = this;
        this.cfr_renamed_3 = new sprsud(new sprkvd());
        this.cfr_renamed_4 = privateKey;
    }

    @Override
    public sprfa cfr_renamed_3245(sprije arg0, sprije arg1, byte[] arg2) throws sprzod {
        sprmyd sprmyd2 = this;
        Key key = sprmyd2.cfr_renamed_4047(arg0, arg1, arg2);
        Cipher cipher = sprmyd2.cfr_renamed_3.cfr_renamed_4042(key, arg1);
        return new sprpwd(this, arg1, cipher);
    }

    /*
     * WARNING - void declaration
     */
    public sprmyd cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_3 = new sprsud(new spritd((Provider)arg0));
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ Key cfr_renamed_4047(sprije arg0, sprije arg1, byte[] arg2) throws sprzod {
        try {
            Key key;
            Key key2 = null;
            Cipher cipher = this.cfr_renamed_3.cfr_renamed_4059(arg0.cfr_renamed_593());
            try {
                cipher.init(4, this.cfr_renamed_4);
                key = key2 = cipher.unwrap(arg2, arg1.cfr_renamed_593().cfr_renamed_19(), 3);
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
            if (key != null) return key2;
            cipher.init(2, this.cfr_renamed_4);
            return new SecretKeySpec(cipher.doFinal(arg2), arg1.cfr_renamed_593().cfr_renamed_19());
        }
        catch (InvalidKeyException invalidKeyException) {
            throw new sprzod(sprwmq.cfr_renamed_9("nW|\u0012l\\sSi[a\u0012l\\%_`AvSbW+"), invalidKeyException);
        }
        catch (IllegalBlockSizeException illegalBlockSizeException) {
            throw new sprzod(sprucq.cfr_renamed_9("P0U9^=U|[0V?R/P&\\|P2\u00191\\/J=^9\u0017"), illegalBlockSizeException);
        }
        catch (BadPaddingException badPaddingException) {
            throw new sprzod(sprwmq.cfr_renamed_9("gSa\u0012uSaVl\\b\u0012l\\%_`AvSbW+"), badPaddingException);
        }
    }
}

