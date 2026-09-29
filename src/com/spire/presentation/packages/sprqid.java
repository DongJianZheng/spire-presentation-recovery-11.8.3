/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpb;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprzra;
import java.math.BigInteger;

public class sprqid
implements sprpb {
    private sprrlb cfr_renamed_112;
    private BigInteger cfr_renamed_119;
    private BigInteger cfr_renamed_91;
    private sprpib cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public sprqid(sprpib arg0, sprrlb arg1, BigInteger arg2) {
        this(arg0, arg1, arg2, cfr_renamed_0, null);
    }

    public BigInteger cfr_renamed_1153() {
        return this.cfr_renamed_91;
    }

    public sprqid(sprpib arg0, sprrlb arg1, BigInteger arg2, BigInteger arg3) {
        this(arg0, arg1, arg2, arg3, null);
    }

    /*
     * WARNING - void declaration
     */
    public sprqid(sprpib sprpib2, sprrlb sprrlb2, BigInteger bigInteger, BigInteger bigInteger2, byte[] byArray) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprqid sprqid2 = this;
        sprqid sprqid3 = this;
        this.cfr_renamed_3 = arg0;
        sprqid3.cfr_renamed_112 = arg1.cfr_renamed_1775();
        sprqid3.cfr_renamed_119 = arg2;
        sprqid2.cfr_renamed_91 = arg3;
        sprqid2.cfr_renamed_4 = byArray;
    }

    public byte[] cfr_renamed_2113() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_4);
    }

    public sprrlb cfr_renamed_1145() {
        return this.cfr_renamed_112;
    }

    public sprpib cfr_renamed_1769() {
        return this.cfr_renamed_3;
    }

    public BigInteger cfr_renamed_1146() {
        return this.cfr_renamed_119;
    }
}

