/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcrb;
import com.spire.presentation.packages.sprgb;
import com.spire.presentation.packages.sprmpb;
import com.spire.presentation.packages.sproxc;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvqb;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;

public class sprtob
extends sprcrb
implements sprgb {
    private int cfr_renamed_96;
    private int cfr_renamed_105;
    private boolean cfr_renamed_137;
    private int cfr_renamed_79;
    private int cfr_renamed_107;

    @Override
    public SecretKey engineGenerateSecret(KeySpec arg0) throws InvalidKeySpecException {
        if (arg0 instanceof PBEKeySpec) {
            sprt sprt2;
            PBEKeySpec pBEKeySpec = (PBEKeySpec)arg0;
            if (pBEKeySpec.getSalt() == null) {
                sprtob sprtob2 = this;
                sprtob sprtob3 = this;
                sprtob sprtob4 = this;
                return new sprmpb(sprtob2.cfr_renamed_4, sprtob2.cfr_renamed_3, sprtob3.cfr_renamed_79, sprtob3.cfr_renamed_96, sprtob4.cfr_renamed_107, sprtob4.cfr_renamed_105, pBEKeySpec, null);
            }
            if (this.cfr_renamed_137) {
                sprtob sprtob5 = this;
                sprtob sprtob6 = this;
                sprt2 = sprvqb.cfr_renamed_2394(pBEKeySpec, sprtob5.cfr_renamed_79, sprtob5.cfr_renamed_96, sprtob6.cfr_renamed_107, sprtob6.cfr_renamed_105);
            } else {
                sprtob sprtob7 = this;
                sprt2 = sprvqb.cfr_renamed_2395(pBEKeySpec, sprtob7.cfr_renamed_79, sprtob7.cfr_renamed_96, this.cfr_renamed_107);
            }
            sprtob sprtob8 = this;
            sprtob sprtob9 = this;
            sprtob sprtob10 = this;
            return new sprmpb(sprtob8.cfr_renamed_4, sprtob8.cfr_renamed_3, sprtob9.cfr_renamed_79, sprtob9.cfr_renamed_96, sprtob10.cfr_renamed_107, sprtob10.cfr_renamed_105, pBEKeySpec, sprt2);
        }
        throw new InvalidKeySpecException(sproxc.cfr_renamed_9(">F\u0001I\u001bA\u0013\b<M\u000e{\u0007M\u0014"));
    }

    /*
     * WARNING - void declaration
     */
    public sprtob(String string, sprtzd sprtzd2, boolean bl, int n, int n2, int n3, int n4) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprtob sprtob2 = this;
        sprtob sprtob3 = this;
        super((String)arg0, (sprtzd)arg1);
        this.cfr_renamed_137 = arg2;
        sprtob3.cfr_renamed_79 = arg3;
        sprtob3.cfr_renamed_96 = arg4;
        sprtob2.cfr_renamed_107 = arg5;
        sprtob2.cfr_renamed_105 = n4;
    }
}

