/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprgbi;
import com.spire.presentation.packages.sprjdi;
import com.spire.presentation.packages.sprjy;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprodi;
import com.spire.presentation.packages.sprvco;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;

public class sprthi
extends sprodi
implements sprjy {
    private boolean spr\ufe34;
    private int cfr_renamed_82;
    private int cfr_renamed_126;
    private int cfr_renamed_88;
    private int cfr_renamed_31;

    @Override
    public SecretKey engineGenerateSecret(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof PBEKeySpec) {
            sprbj sprbj2;
            PBEKeySpec pBEKeySpec = (PBEKeySpec)arg0;
            if (pBEKeySpec.getSalt() == null) {
                sprthi sprthi2 = this;
                sprthi sprthi3 = this;
                sprthi sprthi4 = this;
                return new sprgbi(sprthi2.cfr_renamed_4, sprthi2.cfr_renamed_3, sprthi3.cfr_renamed_88, sprthi3.cfr_renamed_31, sprthi4.cfr_renamed_82, sprthi4.cfr_renamed_126, pBEKeySpec, null);
            }
            if (this.spr\ufe34) {
                sprthi sprthi5 = this;
                sprthi sprthi6 = this;
                sprbj2 = sprjdi.cfr_renamed_2394(pBEKeySpec, sprthi5.cfr_renamed_88, sprthi5.cfr_renamed_31, sprthi6.cfr_renamed_82, sprthi6.cfr_renamed_126);
            } else {
                sprthi sprthi7 = this;
                sprbj2 = sprjdi.cfr_renamed_2395(pBEKeySpec, sprthi7.cfr_renamed_88, sprthi7.cfr_renamed_31, this.cfr_renamed_82);
            }
            sprthi sprthi8 = this;
            sprthi sprthi9 = this;
            sprthi sprthi10 = this;
            return new sprgbi(sprthi8.cfr_renamed_4, sprthi8.cfr_renamed_3, sprthi9.cfr_renamed_88, sprthi9.cfr_renamed_31, sprthi10.cfr_renamed_82, sprthi10.cfr_renamed_126, pBEKeySpec, sprbj2);
        }
        throw new InvalidKeySpecException(sprvco.cfr_renamed_9("\u0019\u0005&\n<\u00024K\u001b\u000e)8 \u000e3"));
    }

    /*
     * WARNING - void declaration
     */
    public sprthi(String string, sprlem sprlem2, boolean bl, int n, int n2, int n3, int n4) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprthi sprthi2 = this;
        sprthi sprthi3 = this;
        super((String)arg0, (sprlem)arg1);
        this.spr\ufe34 = arg2;
        sprthi3.cfr_renamed_88 = arg3;
        sprthi3.cfr_renamed_31 = arg4;
        sprthi2.cfr_renamed_82 = arg5;
        sprthi2.cfr_renamed_126 = n4;
    }
}

