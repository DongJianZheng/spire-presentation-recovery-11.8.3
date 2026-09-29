/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.spritd;
import com.spire.presentation.packages.sprkvd;
import com.spire.presentation.packages.sprlxa;
import com.spire.presentation.packages.sprqa;
import com.spire.presentation.packages.sprqnl;
import com.spire.presentation.packages.sprrwd;
import com.spire.presentation.packages.sprweb;
import com.spire.presentation.packages.sprwxa;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Signature;

public class sprlfb {
    private SecureRandom cfr_renamed_1;
    private String cfr_renamed_2;
    private sprlxa cfr_renamed_3;
    private sprije cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprlfb cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_3 = new sprlxa(new spritd((Provider)arg0));
        return this;
    }

    public sprlfb cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprlfb cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_3 = new sprlxa(new sprrwd((String)arg0));
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprlfb(String string) {
        void arg0;
        sprlfb sprlfb2 = this;
        sprlfb sprlfb3 = this;
        sprlfb2.cfr_renamed_3 = new sprlxa(new sprkvd());
        sprlfb2.cfr_renamed_2 = string;
        sprlfb2.cfr_renamed_4 = new sprwxa().cfr_renamed_1494((String)arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprqa cfr_renamed_1568(PrivateKey arg0) throws sprfya {
        try {
            sprlfb sprlfb2 = this;
            Signature signature = sprlfb2.cfr_renamed_3.cfr_renamed_1548(sprlfb2.cfr_renamed_4);
            if (sprlfb2.cfr_renamed_1 != null) {
                signature.initSign(arg0, this.cfr_renamed_1);
                return new sprweb(this, signature);
            }
            signature.initSign(arg0);
            return new sprweb(this, signature);
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprfya(new StringBuilder().insert(0, sprqnl.cfr_renamed_9("Z)W&V<\u0019+K-X<\\hJ!^&\\:\u0003h")).append(generalSecurityException.getMessage()).toString(), generalSecurityException);
        }
    }

    public static /* synthetic */ sprije cfr_renamed_1569(sprlfb arg0) {
        return arg0.cfr_renamed_4;
    }
}

