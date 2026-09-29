/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgp;
import com.spire.presentation.packages.sprdqe;
import com.spire.presentation.packages.sprerd;
import com.spire.presentation.packages.spreya;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprivd;
import com.spire.presentation.packages.sprkee;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprnue;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvn;
import java.security.SecureRandom;

public abstract class sprbrd
implements sprvn {
    private char[] cfr_renamed_119;
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private SecureRandom cfr_renamed_2;
    private sprije cfr_renamed_3;
    private sprtzd cfr_renamed_4;

    private static /* synthetic */ int cfr_renamed_1513(sprtzd arg0) {
        Integer n = (Integer)sprivd.cfr_renamed_2.get(arg0);
        if (n == null) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprbgp.cfr_renamed_9("/#\",#6l$%,(b''5b?+6'l$#0l# %#0%6$/vb")).append(arg0).toString());
        }
        return n;
    }

    public sprbrd(sprtzd arg0, char[] arg1) {
        sprtzd sprtzd2 = arg0;
        this(sprtzd2, arg1, sprbrd.cfr_renamed_1513(sprtzd2), (Integer)sprivd.cfr_renamed_4.get(arg0));
    }

    @Override
    public sprnue cfr_renamed_3242(spreya arg0) throws sprlqd {
        byte[] byArray;
        sprbrd sprbrd2 = this;
        byte[] byArray2 = new byte[sprbrd2.cfr_renamed_91];
        if (sprbrd2.cfr_renamed_2 == null) {
            sprbrd sprbrd3 = this;
            sprbrd3.cfr_renamed_2 = new SecureRandom();
        }
        sprbrd sprbrd4 = this;
        sprbrd4.cfr_renamed_2.nextBytes(byArray2);
        if (sprbrd4.cfr_renamed_3 == null) {
            byArray = new byte[20];
            this.cfr_renamed_2.nextBytes(byArray);
            this.cfr_renamed_3 = new sprije(sprm.cfr_renamed_1217, new sprkee(byArray, 1024));
        }
        sprbrd sprbrd5 = this;
        byArray = sprerd.cfr_renamed_4009(sprbrd5.cfr_renamed_0, sprbrd5.cfr_renamed_119);
        sprbrd sprbrd6 = this;
        byte[] byArray3 = sprbrd6.cfr_renamed_3222(byArray, this.cfr_renamed_3, sprbrd6.cfr_renamed_1);
        byte[] byArray4 = sprbrd5.cfr_renamed_4011(new sprije(this.cfr_renamed_4, new sprlqe(byArray2)), byArray3, arg0);
        sprlqe sprlqe2 = new sprlqe(byArray4);
        sprlre sprlre2 = new sprlre();
        sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        sprlre2.cfr_renamed_49(new sprlqe(byArray2));
        sprije sprije2 = new sprije(sprm.cfr_renamed_470, new sprpse(sprlre2));
        return new sprnue(new sprdqe(this.cfr_renamed_3, sprije2, sprlqe2));
    }

    /*
     * WARNING - void declaration
     */
    public sprbrd(sprtzd sprtzd2, char[] cArray, int n, int n2) {
        void arg2;
        void arg0;
        void arg1;
        sprbrd sprbrd2 = this;
        sprbrd sprbrd3 = this;
        this.cfr_renamed_119 = arg1;
        sprbrd3.cfr_renamed_0 = 1;
        sprbrd3.cfr_renamed_4 = arg0;
        sprbrd2.cfr_renamed_1 = arg2;
        sprbrd2.cfr_renamed_91 = n2;
    }

    public sprbrd cfr_renamed_4012(int arg0) {
        this.cfr_renamed_0 = arg0;
        return this;
    }

    public abstract byte[] cfr_renamed_4011(sprije var1, byte[] var2, spreya var3) throws sprlqd;

    /*
     * WARNING - void declaration
     */
    public sprbrd cfr_renamed_4013(byte[] byArray, int n) {
        void arg1;
        void arg0;
        this.cfr_renamed_3 = new sprije(sprm.cfr_renamed_1217, new sprkee((byte[])arg0, (int)arg1));
        return this;
    }

    public sprbrd cfr_renamed_1555(SecureRandom arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    public abstract byte[] cfr_renamed_3222(byte[] var1, sprije var2, int var3) throws sprlqd;
}

