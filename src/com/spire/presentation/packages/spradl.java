/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdhl;
import com.spire.presentation.packages.sprdlca;
import com.spire.presentation.packages.sprdul;
import com.spire.presentation.packages.sprjrl;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpfl;
import com.spire.presentation.packages.sprzq;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class spradl
implements sprzq {
    private int cfr_renamed_2;
    public sprdul cfr_renamed_3;
    private char[] cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_10670(int arg0, sprddm arg1, int arg2) throws sprlyl {
        return this.cfr_renamed_3.cfr_renamed_10699(arg0, this.cfr_renamed_4, arg1, arg2);
    }

    @Override
    public int cfr_renamed_3233() {
        return this.cfr_renamed_2;
    }

    public spradl(char[] cArray) {
        spradl spradl2 = this;
        spradl2.cfr_renamed_2 = 1;
        spradl spradl3 = this;
        spradl2.cfr_renamed_3 = new sprdul(new sprjrl());
        spradl2.cfr_renamed_4 = cArray;
    }

    @Override
    public char[] cfr_renamed_1601() {
        return this.cfr_renamed_4;
    }

    public spradl cfr_renamed_4012(int arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public spradl cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_3 = new sprdul(new sprpfl((String)arg0));
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Key cfr_renamed_10700(sprddm arg0, sprddm arg1, byte[] arg2, byte[] arg3) throws sprlyl {
        Cipher cipher = this.cfr_renamed_3.cfr_renamed_10698(arg0.cfr_renamed_593());
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(sproug.cfr_renamed_23(arg0.cfr_renamed_284()).cfr_renamed_186());
            Cipher cipher2 = cipher;
            cipher2.init(4, (Key)new SecretKeySpec(arg2, cipher.getAlgorithm()), ivParameterSpec);
            return cipher2.unwrap(arg3, arg1.cfr_renamed_593().cfr_renamed_19(), 3);
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprlyl(new StringBuilder().insert(0, sprdlca.cfr_renamed_9("}\\pSqI>MlR}XmN>^qSjXpI>Xp^lDnIwRp\u001duXg\u0007>")).append(generalSecurityException.getMessage()).toString(), generalSecurityException);
        }
    }

    /*
     * WARNING - void declaration
     */
    public spradl cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_3 = new sprdul(new sprdhl((Provider)arg0));
        return this;
    }
}

