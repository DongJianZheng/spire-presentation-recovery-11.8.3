/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.spreqg;
import com.spire.presentation.packages.sprfpf;
import com.spire.presentation.packages.sprjlg;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprmuea;
import com.spire.presentation.packages.sprnfg;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprvng;
import com.spire.presentation.packages.sprxil;
import com.spire.presentation.packages.spryhg;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public class sprkpg
extends sprjlg {
    private SecretKey cfr_renamed_3;
    private sprvng cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprnfg cfr_renamed_7425(sprddm arg0, byte[] arg1) throws spryhg {
        try {
            Cipher cipher = this.cfr_renamed_4.cfr_renamed_7428(this.cfr_renamed_615().cfr_renamed_593());
            cipher.init(4, this.cfr_renamed_3);
            return new spreqg(arg0, cipher.unwrap(arg1, this.cfr_renamed_4.cfr_renamed_7431(arg0.cfr_renamed_593()), 3));
        }
        catch (InvalidKeyException invalidKeyException) {
            throw new spryhg(sprmuea.cfr_renamed_9("\bs\u001a6\nx\u0015w\u000f\u007f\u00076\nxC{\u0006e\u0010w\u0004sM"), invalidKeyException);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new spryhg(sprfpf.cfr_renamed_9("!b,$6#$j,gbb.d-q+w*nl"), noSuchAlgorithmException);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprkpg(sprddm sprddm2, SecretKey secretKey) {
        super((sprddm)arg0);
        void arg0;
        sprkpg sprkpg2 = this;
        this.cfr_renamed_4 = new sprvng(new sprrul());
        this.cfr_renamed_3 = secretKey;
    }

    /*
     * WARNING - void declaration
     */
    public sprkpg cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprvng(new sprkhi((Provider)arg0));
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprkpg cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprvng(new sprxil((String)arg0));
        return this;
    }
}

