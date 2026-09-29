/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprffm;
import com.spire.presentation.packages.sprjpj;
import com.spire.presentation.packages.sprrr;
import java.security.cert.CRLException;

public class sprlrj
extends sprjpj {
    private final CRLException cfr_renamed_2;
    private final byte[] cfr_renamed_3;

    @Override
    public byte[] getEncoded() throws CRLException {
        if (null != this.cfr_renamed_2) {
            throw this.cfr_renamed_2;
        }
        if (null == this.cfr_renamed_3) {
            throw new CRLException();
        }
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprlrj(sprrr sprrr2, sprffm sprffm2, String string, byte[] byArray, boolean bl, byte[] byArray2, CRLException cRLException) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprlrj sprlrj2 = this;
        super((sprrr)arg0, (sprffm)arg1, (String)arg2, (byte[])arg3, (boolean)arg4);
        sprlrj2.cfr_renamed_3 = arg5;
        sprlrj2.cfr_renamed_2 = cRLException;
    }
}

