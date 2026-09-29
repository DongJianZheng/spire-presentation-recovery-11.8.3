/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprae;
import com.spire.presentation.packages.sprdg;
import com.spire.presentation.packages.sprdn;
import com.spire.presentation.packages.sprdtr;
import com.spire.presentation.packages.spreya;
import com.spire.presentation.packages.sprgxa;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.spritd;
import com.spire.presentation.packages.sprkvd;
import com.spire.presentation.packages.sprlxa;
import com.spire.presentation.packages.sprmdb;
import com.spire.presentation.packages.sprmfb;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprrnr;
import com.spire.presentation.packages.sprrwd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public class sprrhb
extends sprgxa {
    private SecureRandom cfr_renamed_2;
    private SecretKey cfr_renamed_3;
    private sprlxa cfr_renamed_4;

    private static /* synthetic */ sprije cfr_renamed_1554(SecretKey arg0) {
        String string = arg0.getAlgorithm();
        if (string.startsWith("DES")) {
            return new sprije(new sprtzd("1.2.840.113549.1.9.16.3.6"), sprume.cfr_renamed_3);
        }
        if (string.startsWith("RC2")) {
            return new sprije(new sprtzd(sprrnr.cfr_renamed_9("t\u0000w\u0000}\u001au\u0000t\u001fv\u001bq\u0017k\u001fk\u0017k\u001fs\u0000v\u0000r")), new sprooe(58L));
        }
        if (string.startsWith(sprdtr.cfr_renamed_9("/s="))) {
            sprtzd sprtzd2;
            int n = arg0.getEncoded().length * 8;
            if (n == 128) {
                sprtzd2 = sprdg.cfr_renamed_185;
            } else if (n == 192) {
                sprtzd2 = sprdg.cfr_renamed_3;
            } else if (n == 256) {
                sprtzd2 = sprdg.cfr_renamed_91;
            } else {
                throw new IllegalArgumentException(sprrnr.cfr_renamed_9("G)B I$BeE W6G?KeG+\u000e\u0004k\u0016"));
            }
            return new sprije(sprtzd2);
        }
        if (string.startsWith(sprdtr.cfr_renamed_9("e+s*"))) {
            return new sprije(sprdn.cfr_renamed_1);
        }
        if (string.startsWith(sprrnr.cfr_renamed_9("m$C B)G$"))) {
            sprtzd sprtzd3;
            int n = arg0.getEncoded().length * 8;
            if (n == 128) {
                sprtzd3 = sprae.cfr_renamed_4;
            } else if (n == 192) {
                sprtzd3 = sprae.cfr_renamed_0;
            } else if (n == 256) {
                sprtzd3 = sprae.cfr_renamed_91;
            } else {
                throw new IllegalArgumentException(sprdtr.cfr_renamed_9("\u0007Z\u0002S\tW\u0002\u0016\u0005S\u0017E\u0007L\u000b\u0016\u0007XNu\u000f[\u000bZ\u0002_\u000f"));
            }
            return new sprije(sprtzd3);
        }
        throw new IllegalArgumentException(sprrnr.cfr_renamed_9("0@.@*Y+\u000e$B\"A7G1F("));
    }

    public sprrhb cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprrhb(SecretKey secretKey) {
        super(sprrhb.cfr_renamed_1554((SecretKey)arg0));
        void arg0;
        sprrhb sprrhb2 = this;
        this.cfr_renamed_4 = new sprlxa(new sprkvd());
        this.cfr_renamed_3 = secretKey;
    }

    /*
     * WARNING - void declaration
     */
    public sprrhb cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprlxa(new sprrwd((String)arg0));
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprrhb cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprlxa(new spritd((Provider)arg0));
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_1533(spreya arg0) throws sprmfb {
        Key key = sprmdb.cfr_renamed_1535(arg0);
        Cipher cipher = this.cfr_renamed_4.cfr_renamed_1542(this.cfr_renamed_615().cfr_renamed_593());
        try {
            sprrhb sprrhb2 = this;
            cipher.init(3, (Key)sprrhb2.cfr_renamed_3, sprrhb2.cfr_renamed_2);
            return cipher.wrap(key);
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprmfb(new StringBuilder().insert(0, sprdtr.cfr_renamed_9("\rW\u0000X\u0001BNA\u001cW\u001e\u0016\u0005S\u0017\fN")).append(generalSecurityException.getMessage()).toString(), generalSecurityException);
        }
    }
}

