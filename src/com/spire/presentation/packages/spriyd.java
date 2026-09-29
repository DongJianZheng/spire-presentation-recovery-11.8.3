/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbqd;
import com.spire.presentation.packages.sprbrd;
import com.spire.presentation.packages.spreya;
import com.spire.presentation.packages.sprhzz;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkee;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprqrd;
import com.spire.presentation.packages.sprryca;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprypd;
import com.spire.presentation.packages.sprzxd;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class spriyd
extends sprbrd {
    private sprzxd cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spriyd cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprzxd(new sprqrd((Provider)arg0));
        return this;
    }

    @Override
    public byte[] cfr_renamed_3222(byte[] arg0, sprije arg1, int arg2) throws sprlqd {
        sprryca sprryca2;
        sprkee sprkee2 = sprkee.cfr_renamed_23(arg1.cfr_renamed_284());
        sprryca sprryca3 = sprryca2 = new sprryca();
        sprryca3.cfr_renamed_1515(arg0, sprkee2.cfr_renamed_1477(), sprkee2.cfr_renamed_1478().intValue());
        return ((sprnld)sprryca3.cfr_renamed_249(arg2)).cfr_renamed_1521();
    }

    public spriyd(sprtzd sprtzd2, char[] cArray) {
        super(sprtzd2, cArray);
        spriyd spriyd2 = this;
        spriyd2.cfr_renamed_4 = new sprzxd(new sprypd());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_4011(sprije arg0, byte[] arg1, spreya arg2) throws sprlqd {
        spriyd spriyd2 = this;
        Key key = spriyd2.cfr_renamed_4.cfr_renamed_1535(arg2);
        Cipher cipher = spriyd2.cfr_renamed_4.cfr_renamed_4040(arg0.cfr_renamed_593());
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(sprxue.cfr_renamed_23(arg0.cfr_renamed_284()).cfr_renamed_186());
            Cipher cipher2 = cipher;
            cipher2.init(3, (Key)new SecretKeySpec(arg1, cipher.getAlgorithm()), ivParameterSpec);
            return cipher2.wrap(key);
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprlqd(new StringBuilder().insert(0, sprhzz.cfr_renamed_9("_~RqSk\u001coNp_zOl\u001c|SqHzRk\u001czR|NfLkUpR?WzE%\u001c")).append(generalSecurityException.getMessage()).toString(), generalSecurityException);
        }
    }

    /*
     * WARNING - void declaration
     */
    public spriyd cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprzxd(new sprbqd((String)arg0));
        return this;
    }
}

