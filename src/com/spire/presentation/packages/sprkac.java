/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlc;
import java.security.MessageDigest;

public class sprkac
extends MessageDigest {
    public sprlc cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprkac(sprlc sprlc2) {
        super(arg0.cfr_renamed_1315());
        void arg0;
        this.cfr_renamed_4 = sprlc2;
    }

    @Override
    public void engineReset() {
        this.cfr_renamed_4.cfr_renamed_41();
    }

    @Override
    public void engineUpdate(byte arg0) {
        this.cfr_renamed_4.cfr_renamed_1221(arg0);
    }

    @Override
    public void engineUpdate(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_4.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public byte[] engineDigest() {
        sprkac sprkac2 = this;
        byte[] byArray = new byte[sprkac2.cfr_renamed_4.cfr_renamed_1218()];
        sprkac2.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
        return byArray;
    }
}

