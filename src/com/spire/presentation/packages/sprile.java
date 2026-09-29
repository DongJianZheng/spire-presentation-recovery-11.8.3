/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.spriue;
import com.spire.presentation.packages.sprjan;
import com.spire.presentation.packages.sprmte;
import com.spire.presentation.packages.sprqld;
import com.spire.presentation.packages.sprque;
import com.spire.presentation.packages.sprsvh;
import com.spire.presentation.packages.sprug;
import com.spire.presentation.packages.sprxi;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Collection;

public class sprile
implements sprug {
    private Provider cfr_renamed_3;
    private sprsvh cfr_renamed_4;

    public static sprile cfr_renamed_5029(String arg0, sprxi arg1, String arg2) throws sprmte, NoSuchProviderException {
        return sprile.cfr_renamed_5030(arg0, arg1, spriue.cfr_renamed_121(arg2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprile cfr_renamed_5031(String arg0, sprxi arg1) throws sprmte {
        try {
            sprque sprque2 = spriue.cfr_renamed_117(sprjan.cfr_renamed_9("#7K;(v\u0014p\u001e"), arg0);
            return sprile.cfr_renamed_5032(sprque2, arg1);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new sprmte(noSuchAlgorithmException.getMessage());
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprile(Provider provider, sprsvh sprsvh2) {
        void arg0;
        sprile sprile2 = this;
        sprile2.cfr_renamed_3 = arg0;
        sprile2.cfr_renamed_4 = sprsvh2;
    }

    private static /* synthetic */ sprile cfr_renamed_5032(sprque arg0, sprxi arg1) {
        sprsvh sprsvh2 = (sprsvh)arg0.cfr_renamed_143();
        sprsvh2.cfr_renamed_5027(arg1);
        return new sprile(arg0.cfr_renamed_144(), sprsvh2);
    }

    public Provider cfr_renamed_144() {
        return this.cfr_renamed_3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprile cfr_renamed_5030(String arg0, sprxi arg1, Provider arg2) throws sprmte {
        try {
            sprque sprque2 = spriue.cfr_renamed_115(sprqld.cfr_renamed_9("?!W-4`\bf\u0002"), arg0, arg2);
            return sprile.cfr_renamed_5032(sprque2, arg1);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new sprmte(noSuchAlgorithmException.getMessage());
        }
    }

    public Collection cfr_renamed_3216(sprhd arg0) {
        return this.cfr_renamed_4.cfr_renamed_5028(arg0);
    }
}

