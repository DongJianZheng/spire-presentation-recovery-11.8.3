/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprmqg;
import com.spire.presentation.packages.sprmzh;
import com.spire.presentation.packages.sprnica;
import com.spire.presentation.packages.sprrbaa;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxil;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Hashtable;

public class sprrig
extends sprmqg {
    private sprrr cfr_renamed_3;
    private static Hashtable cfr_renamed_4 = new Hashtable();

    public sprrig(sprmzh sprmzh2) {
        super(sprmzh2);
        sprrig sprrig2 = this;
        sprrig2.cfr_renamed_3 = new sprrul();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PublicKey cfr_renamed_1157() throws InvalidKeyException, NoSuchAlgorithmException {
        try {
            KeyFactory keyFactory;
            sprvhm sprvhm2 = this.cfr_renamed_1489();
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(sprvhm2.cfr_renamed_91());
            try {
                KeyFactory keyFactory2;
                keyFactory = keyFactory2 = this.cfr_renamed_3.cfr_renamed_1511(sprvhm2.cfr_renamed_593().cfr_renamed_593().cfr_renamed_19());
                return keyFactory.generatePublic(x509EncodedKeySpec);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                KeyFactory keyFactory3;
                if (cfr_renamed_4.get(sprvhm2.cfr_renamed_593().cfr_renamed_593()) == null) throw noSuchAlgorithmException;
                String string = (String)cfr_renamed_4.get(sprvhm2.cfr_renamed_593().cfr_renamed_593());
                keyFactory = keyFactory3 = this.cfr_renamed_3.cfr_renamed_1511(string);
                return keyFactory.generatePublic(x509EncodedKeySpec);
            }
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            throw new InvalidKeyException(sprnica.cfr_renamed_9("\u0018P\u000fM\u000f\u0002\u0019G\u001eM\u0019K\u0013E]R\b@\u0011K\u001e\u0002\u0016G\u0004"));
        }
        catch (IOException iOException) {
            throw new InvalidKeyException(sprrbaa.cfr_renamed_9("Q'F:FuQ-@'U6@<Z2\u0014>Q,\u00140Z6[1];S"));
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprnica.cfr_renamed_9("A\u001cL\u0013M\t\u0002\u001bK\u0013F]R\u000fM\u000bK\u0019G\u000f\u0018]")).append(noSuchProviderException.getMessage()).toString());
        }
    }

    static {
        cfr_renamed_4.put(sprdl.cfr_renamed_1205, "RSA");
        cfr_renamed_4.put(sprbr.cfr_renamed_84, "DSA");
    }

    /*
     * WARNING - void declaration
     */
    public sprrig cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_3 = new sprkhi((Provider)arg0);
        return this;
    }

    public sprrig(byte[] byArray) throws IOException {
        super(byArray);
        sprrig sprrig2 = this;
        sprrig2.cfr_renamed_3 = new sprrul();
    }

    /*
     * WARNING - void declaration
     */
    public sprrig cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_3 = new sprxil((String)arg0);
        return this;
    }

    public sprrig(sprmqg sprmqg2) {
        super(sprmqg2.cfr_renamed_568());
        sprrig sprrig2 = this;
        sprrig2.cfr_renamed_3 = new sprrul();
    }
}

