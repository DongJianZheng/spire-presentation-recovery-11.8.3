/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprefd;
import com.spire.presentation.packages.spreya;
import com.spire.presentation.packages.sprfhf;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.spritd;
import com.spire.presentation.packages.sprkvd;
import com.spire.presentation.packages.sprlxa;
import com.spire.presentation.packages.sprmdb;
import com.spire.presentation.packages.sprmfb;
import com.spire.presentation.packages.sprnza;
import com.spire.presentation.packages.sprrwd;
import com.spire.presentation.packages.sprtzd;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.Provider;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;

public class sprdhb
extends sprnza {
    private Map cfr_renamed_1;
    private PublicKey cfr_renamed_2;
    private sprlxa cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprdhb cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_3 = new sprlxa(new spritd((Provider)arg0));
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprdhb cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_3 = new sprlxa(new sprrwd((String)arg0));
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprdhb(PublicKey publicKey) {
        void arg0;
        sprdhb sprdhb2 = this;
        super(sprdce.cfr_renamed_23(arg0.getEncoded()).cfr_renamed_593());
        sprdhb sprdhb3 = this;
        sprdhb2.cfr_renamed_3 = new sprlxa(new sprkvd());
        sprdhb2.cfr_renamed_1 = new HashMap();
        sprdhb2.cfr_renamed_2 = publicKey;
    }

    public sprdhb cfr_renamed_1557(sprtzd arg0, String arg1) {
        sprdhb sprdhb2 = this;
        sprdhb2.cfr_renamed_1.put(arg0, arg1);
        return sprdhb2;
    }

    public sprdhb cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_1533(spreya spreya2) throws sprmfb {
        byte[] byArray;
        void arg0;
        sprdhb sprdhb2 = this;
        Cipher cipher = this.cfr_renamed_3.cfr_renamed_1551(this.cfr_renamed_615().cfr_renamed_593(), sprdhb2.cfr_renamed_1);
        AlgorithmParameters algorithmParameters = sprdhb2.cfr_renamed_3.cfr_renamed_1544(this.cfr_renamed_615());
        byte[] byArray2 = null;
        try {
            Cipher cipher2;
            if (algorithmParameters != null) {
                Cipher cipher3 = cipher;
                cipher2 = cipher3;
                cipher3.init(3, (Key)this.cfr_renamed_2, algorithmParameters, this.cfr_renamed_4);
            } else {
                Cipher cipher4 = cipher;
                cipher2 = cipher4;
                sprdhb sprdhb3 = this;
                cipher4.init(3, (Key)sprdhb3.cfr_renamed_2, sprdhb3.cfr_renamed_4);
            }
            byArray = byArray2 = cipher2.wrap(sprmdb.cfr_renamed_1535((spreya)arg0));
        }
        catch (InvalidKeyException invalidKeyException) {
            byArray = byArray2;
        }
        catch (GeneralSecurityException generalSecurityException) {
            byArray = byArray2;
        }
        catch (IllegalStateException illegalStateException) {
            byArray = byArray2;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            byArray = byArray2;
        }
        catch (ProviderException providerException) {
            byArray = byArray2;
        }
        if (byArray != null) {
            return byArray2;
        }
        try {
            sprdhb sprdhb4 = this;
            cipher.init(1, (Key)sprdhb4.cfr_renamed_2, sprdhb4.cfr_renamed_4);
            return cipher.doFinal(sprmdb.cfr_renamed_1535((spreya)arg0).getEncoded());
        }
        catch (InvalidKeyException invalidKeyException) {
            throw new sprmfb(sprfhf.cfr_renamed_9("k&\u007f*r-><qh{&}:g8jh}'p<{&j;>#{1"), invalidKeyException);
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprmfb(sprefd.cfr_renamed_9("SdGhJo\u0006~I*CdEx_zR*EeH~CdRy\u0006aCs"), generalSecurityException);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprdhb(sprije sprije2, PublicKey publicKey) {
        void arg0;
        sprdhb sprdhb2 = this;
        super((sprije)arg0);
        sprdhb sprdhb3 = this;
        sprdhb2.cfr_renamed_3 = new sprlxa(new sprkvd());
        sprdhb2.cfr_renamed_1 = new HashMap();
        sprdhb2.cfr_renamed_2 = publicKey;
    }

    public sprdhb(X509Certificate arg0) {
        this(arg0.getPublicKey());
    }
}

