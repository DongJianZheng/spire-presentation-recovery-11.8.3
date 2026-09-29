/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbtaa;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdhl;
import com.spire.presentation.packages.sprdul;
import com.spire.presentation.packages.sprjrl;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprnfg;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpfl;
import com.spire.presentation.packages.sprvll;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sprycl
extends sprvll {
    private sprdul cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprycl cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprdul(new sprpfl((String)arg0));
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_10673(sprddm arg0, byte[] arg1, sprnfg arg2) throws sprlyl {
        sprycl sprycl2 = this;
        Key key = sprycl2.cfr_renamed_4.cfr_renamed_7426(arg2);
        Cipher cipher = sprycl2.cfr_renamed_4.cfr_renamed_10698(arg0.cfr_renamed_593());
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(sproug.cfr_renamed_23(arg0.cfr_renamed_284()).cfr_renamed_186());
            Cipher cipher2 = cipher;
            cipher2.init(3, (Key)new SecretKeySpec(arg1, cipher.getAlgorithm()), ivParameterSpec);
            return cipher2.wrap(key);
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprlyl(new StringBuilder().insert(0, sprbtaa.cfr_renamed_9("a)l&m<\"8p'a-q;\"+m&v-l<\"-l+p1r<k'lhi-{r\"")).append(generalSecurityException.getMessage()).toString(), generalSecurityException);
        }
    }

    @Override
    public byte[] cfr_renamed_10670(int arg0, sprddm arg1, int arg2) throws sprlyl {
        return this.cfr_renamed_4.cfr_renamed_10699(arg0, this.cfr_renamed_0, arg1, arg2);
    }

    public sprycl(sprlem sprlem2, char[] cArray) {
        super(sprlem2, cArray);
        sprycl sprycl2 = this;
        sprycl2.cfr_renamed_4 = new sprdul(new sprjrl());
    }

    /*
     * WARNING - void declaration
     */
    public sprycl cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprdul(new sprdhl((Provider)arg0));
        return this;
    }
}

