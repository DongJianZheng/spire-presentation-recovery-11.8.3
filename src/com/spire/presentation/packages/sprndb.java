/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprda;
import com.spire.presentation.packages.sprhfb;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.spriya;
import com.spire.presentation.packages.sprkgb;
import com.spire.presentation.packages.sprleb;
import com.spire.presentation.packages.sproma;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprurr;
import com.spire.presentation.packages.sprvxa;
import com.spire.presentation.packages.sprwor;
import com.spire.presentation.packages.sprzra;
import java.security.PublicKey;

public class sprndb
implements PublicKey {
    private short[][] cfr_renamed_91;
    private short[][] cfr_renamed_0;
    private short[] cfr_renamed_1;
    private int cfr_renamed_2;
    private static final long cfr_renamed_3 = 1L;
    private sprkgb cfr_renamed_4;

    public short[] cfr_renamed_1133() {
        return sprzra.cfr_renamed_538(this.cfr_renamed_1);
    }

    public short[][] cfr_renamed_1132() {
        return this.cfr_renamed_0;
    }

    @Override
    public byte[] getEncoded() {
        sprndb sprndb2 = this;
        sprndb sprndb3 = this;
        sprvxa sprvxa2 = new sprvxa(sprndb2.cfr_renamed_2, sprndb2.cfr_renamed_0, sprndb3.cfr_renamed_91, sprndb3.cfr_renamed_1);
        return sprleb.cfr_renamed_1187(new sprije(sprda.cfr_renamed_107, sprume.cfr_renamed_3), sprvxa2);
    }

    @Override
    public String getFormat() {
        return sprurr.cfr_renamed_9("c!\u000e?\u0002");
    }

    public int cfr_renamed_1130() {
        return this.cfr_renamed_2;
    }

    public sprndb(sproma arg0) {
        this(arg0.cfr_renamed_1130(), arg0.cfr_renamed_1132(), arg0.cfr_renamed_1131(), arg0.cfr_renamed_1133());
    }

    /*
     * WARNING - void declaration
     */
    public sprndb(int n, short[][] sArray, short[][] sArray2, short[] sArray3) {
        void arg2;
        void arg1;
        void arg0;
        sprndb sprndb2 = this;
        sprndb sprndb3 = this;
        sprndb3.cfr_renamed_2 = arg0;
        sprndb3.cfr_renamed_0 = arg1;
        sprndb2.cfr_renamed_91 = arg2;
        sprndb2.cfr_renamed_1 = sArray3;
    }

    public short[][] cfr_renamed_1131() {
        int n;
        short[][] sArrayArray = new short[this.cfr_renamed_91.length][];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_91.length) {
            int n3 = n++;
            sArrayArray[n3] = sprzra.cfr_renamed_538(this.cfr_renamed_91[n3]);
            n2 = n;
        }
        return sArrayArray;
    }

    public int hashCode() {
        int n = this.cfr_renamed_2;
        n = n * 37 + sprzra.cfr_renamed_517(this.cfr_renamed_0);
        n = n * 37 + sprzra.cfr_renamed_517(this.cfr_renamed_91);
        n = n * 37 + sprzra.cfr_renamed_518(this.cfr_renamed_1);
        return n;
    }

    public sprndb(sprhfb arg0) {
        this(arg0.cfr_renamed_1130(), arg0.cfr_renamed_1132(), arg0.cfr_renamed_1131(), arg0.cfr_renamed_1133());
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !(arg0 instanceof sprndb)) {
            return false;
        }
        sprndb sprndb2 = (sprndb)arg0;
        return this.cfr_renamed_2 == sprndb2.cfr_renamed_1130() && spriya.cfr_renamed_1230(this.cfr_renamed_0, sprndb2.cfr_renamed_1132()) && spriya.cfr_renamed_1230(this.cfr_renamed_91, sprndb2.cfr_renamed_1131()) && spriya.cfr_renamed_1231(this.cfr_renamed_1, sprndb2.cfr_renamed_1133());
    }

    @Override
    public final String getAlgorithm() {
        return sprwor.cfr_renamed_9("\u0004Z?U4T!");
    }
}

