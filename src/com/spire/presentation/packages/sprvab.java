/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreya;
import com.spire.presentation.packages.sprgib;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.spritd;
import com.spire.presentation.packages.sprjnn;
import com.spire.presentation.packages.sprkvd;
import com.spire.presentation.packages.sprlxa;
import com.spire.presentation.packages.sprmfb;
import com.spire.presentation.packages.sprqhb;
import com.spire.presentation.packages.sprrwd;
import com.spire.presentation.packages.sprtjp;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

public class sprvab
extends sprqhb {
    private SecretKey cfr_renamed_3;
    private sprlxa cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprvab cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprlxa(new spritd((Provider)arg0));
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprvab cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprlxa(new sprrwd((String)arg0));
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprvab(sprije sprije2, SecretKey secretKey) {
        super((sprije)arg0);
        void arg0;
        sprvab sprvab2 = this;
        this.cfr_renamed_4 = new sprlxa(new sprkvd());
        this.cfr_renamed_3 = secretKey;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public spreya cfr_renamed_1534(sprije arg0, byte[] arg1) throws sprmfb {
        try {
            Cipher cipher = this.cfr_renamed_4.cfr_renamed_1542(this.cfr_renamed_615().cfr_renamed_593());
            cipher.init(4, this.cfr_renamed_3);
            return new sprgib(arg0, cipher.unwrap(arg1, this.cfr_renamed_4.cfr_renamed_1547(arg0.cfr_renamed_593()), 3));
        }
        catch (InvalidKeyException invalidKeyException) {
            throw new sprmfb(sprjnn.cfr_renamed_9("\u0011:\u0003\u007f\u00131\f>\u00166\u001e\u007f\u00131Z2\u001f,\t>\u001d:T"), invalidKeyException);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new sprmfb(sprtjp.cfr_renamed_9("I\nDL^KL\u0002D\u000f\n\nF\fE\u0019C\u001fB\u0006\u0004"), noSuchAlgorithmException);
        }
    }
}

