/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.SaveToPdfOption;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprfiz;
import com.spire.presentation.packages.sprhn;
import com.spire.presentation.packages.spritd;
import com.spire.presentation.packages.sprkvd;
import com.spire.presentation.packages.sprlza;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprrwd;
import com.spire.presentation.packages.sprtk;
import com.spire.presentation.packages.sprwjb;
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

public class sprmab
extends sprlza {
    private static Hashtable cfr_renamed_3 = new Hashtable();
    private sprhn cfr_renamed_4;

    static {
        cfr_renamed_3.put(sprm.cfr_renamed_1510, "RSA");
        cfr_renamed_3.put(sprtk.cfr_renamed_314, "DSA");
    }

    public sprmab(byte[] byArray) throws IOException {
        super(byArray);
        sprmab sprmab2 = this;
        sprmab2.cfr_renamed_4 = new sprkvd();
    }

    public sprmab(sprlza sprlza2) {
        super(sprlza2.cfr_renamed_568());
        sprmab sprmab2 = this;
        sprmab2.cfr_renamed_4 = new sprkvd();
    }

    /*
     * WARNING - void declaration
     */
    public sprmab cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprrwd((String)arg0);
        return this;
    }

    public sprmab(sprwjb sprwjb2) {
        super(sprwjb2);
        sprmab sprmab2 = this;
        sprmab2.cfr_renamed_4 = new sprkvd();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public PublicKey cfr_renamed_1157() throws InvalidKeyException, NoSuchAlgorithmException {
        try {
            KeyFactory keyFactory;
            sprdce sprdce2 = this.cfr_renamed_1489();
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(sprdce2.cfr_renamed_91());
            try {
                KeyFactory keyFactory2;
                keyFactory = keyFactory2 = this.cfr_renamed_4.cfr_renamed_1511(sprdce2.cfr_renamed_593().cfr_renamed_593().cfr_renamed_19());
                return keyFactory.generatePublic(x509EncodedKeySpec);
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                KeyFactory keyFactory3;
                if (cfr_renamed_3.get(sprdce2.cfr_renamed_593().cfr_renamed_593()) == null) throw noSuchAlgorithmException;
                String string = (String)cfr_renamed_3.get(sprdce2.cfr_renamed_593().cfr_renamed_593());
                keyFactory = keyFactory3 = this.cfr_renamed_4.cfr_renamed_1511(string);
                return keyFactory.generatePublic(x509EncodedKeySpec);
            }
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            throw new InvalidKeyException(SaveToPdfOption.cfr_renamed_9("\u000b7\u001c*\u001ce\n \r*\n,\u0000\"N5\u001b'\u0002,\re\u0005 \u0017"));
        }
        catch (IOException iOException) {
            throw new InvalidKeyException(sprfiz.cfr_renamed_9("\u000b\u0017\u001c\n\u001cE\u000b\u001d\u001a\u0017\u000f\u0006\u001a\f\u0000\u0002N\u000e\u000b\u001cN\u0000\u0000\u0006\u0001\u0001\u0007\u000b\t"));
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new NoSuchAlgorithmException(new StringBuilder().insert(0, SaveToPdfOption.cfr_renamed_9("&\u000f+\u0000*\u001ae\b,\u0000!N5\u001c*\u0018,\n \u001c\u007fN")).append(noSuchProviderException.getMessage()).toString());
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprmab cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new spritd((Provider)arg0);
        return this;
    }
}

