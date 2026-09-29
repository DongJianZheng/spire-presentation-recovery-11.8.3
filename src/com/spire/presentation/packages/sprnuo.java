/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdpo;
import com.spire.presentation.packages.sprkqo;
import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sprrgo;
import com.spire.presentation.packages.sprruo;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprnuo
extends sprkqo {
    @sprtea
    public int cfr_renamed_105;
    @sprtea
    public long cfr_renamed_137;
    @sprtea
    public short cfr_renamed_79;
    @sprtea
    public long cfr_renamed_107;
    @sprtea
    public short cfr_renamed_132;
    @sprtea
    public long cfr_renamed_102;
    @sprtea
    public long cfr_renamed_93;
    @sprtea
    public short cfr_renamed_86;
    @sprtea
    public int cfr_renamed_152;
    @sprtea
    public int cfr_renamed_112;
    @sprtea
    public short cfr_renamed_119;
    @sprtea
    public int cfr_renamed_91;
    @sprtea
    public short cfr_renamed_0;
    @sprtea
    public long cfr_renamed_1;
    @sprtea
    public long cfr_renamed_2;
    @sprtea
    public short cfr_renamed_3;
    @sprtea
    public short cfr_renamed_4;

    @sprtea
    public int cfr_renamed_13303() {
        int n = 0;
        n = 0 | ((this.cfr_renamed_152 & 0xFFFF & 1) != 0 ? 1 : 0);
        n |= (this.cfr_renamed_152 & 0xFFFF & 2) != 0 ? 2 : 0;
        return n |= (this.cfr_renamed_152 & 0xFFFF & 4) != 0 ? 4 : 0;
    }

    @sprtea
    public void cfr_renamed_18312(boolean arg0) {
        this.cfr_renamed_79 = (short)(!arg0 ? 1 : 0);
    }

    @sprtea
    public boolean cfr_renamed_15090() {
        return this.cfr_renamed_79 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @sprtea
    public void cfr_renamed_18252(sprruo sprruo2) {
        void arg0;
        void v0 = arg0;
        sprnuo sprnuo2 = this;
        void v2 = arg0;
        sprnuo sprnuo3 = this;
        void v4 = arg0;
        sprnuo sprnuo4 = this;
        void v6 = arg0;
        sprnuo sprnuo5 = this;
        void v8 = arg0;
        sprnuo sprnuo6 = this;
        void v10 = arg0;
        v10.cfr_renamed_15097(this.cfr_renamed_137);
        v10.cfr_renamed_15097(this.cfr_renamed_1);
        arg0.cfr_renamed_15097(sprnuo6.cfr_renamed_107);
        v8.cfr_renamed_15097(sprnuo6.cfr_renamed_102);
        v8.cfr_renamed_15085(this.cfr_renamed_112 & 0xFFFF);
        arg0.cfr_renamed_15085(sprnuo5.cfr_renamed_91 & 0xFFFF);
        v6.cfr_renamed_17448(sprnuo5.cfr_renamed_2);
        v6.cfr_renamed_17448(this.cfr_renamed_93);
        arg0.cfr_renamed_14639(sprnuo4.cfr_renamed_119);
        v4.cfr_renamed_14639(sprnuo4.cfr_renamed_0);
        v4.cfr_renamed_14639(this.cfr_renamed_4);
        arg0.cfr_renamed_14639(sprnuo3.cfr_renamed_3);
        v2.cfr_renamed_15085(sprnuo3.cfr_renamed_152 & 0xFFFF);
        v2.cfr_renamed_15085(this.cfr_renamed_105 & 0xFFFF);
        arg0.cfr_renamed_14639(sprnuo2.cfr_renamed_132);
        v0.cfr_renamed_14639(sprnuo2.cfr_renamed_79);
        v0.cfr_renamed_14639(this.cfr_renamed_86);
    }

    @sprtea
    public static sprnuo cfr_renamed_15088(sprmzo arg0) {
        sprnuo sprnuo2 = new sprnuo();
        sprnuo2.cfr_renamed_137 = arg0.cfr_renamed_13220();
        if ((sprnuo2.cfr_renamed_137 & 0xFFFFFFFFL) != 65536L) {
            throw new UnsupportedOperationException(sprdpo.cfr_renamed_9("ssUhVmIoRxB=@rHi\u0006uC|B=PxTnOrH3"));
        }
        sprnuo sprnuo3 = sprnuo2;
        sprmzo sprmzo2 = arg0;
        sprnuo2.cfr_renamed_1 = sprmzo2.cfr_renamed_13220();
        sprnuo3.cfr_renamed_107 = sprmzo2.cfr_renamed_13220();
        sprnuo3.cfr_renamed_102 = arg0.cfr_renamed_13220();
        if ((sprnuo2.cfr_renamed_102 & 0xFFFFFFFFL) != 1594834165L) {
            throw new UnsupportedOperationException(sprrgo.cfr_renamed_9("bHDSGVXTCCS\u0006QIYR\u0017NRGS\u0006ZGPOT\u0006YSZDRT\u0019"));
        }
        sprnuo sprnuo4 = sprnuo2;
        sprmzo sprmzo3 = arg0;
        sprnuo sprnuo5 = sprnuo2;
        sprmzo sprmzo4 = arg0;
        sprnuo sprnuo6 = sprnuo2;
        sprmzo sprmzo5 = arg0;
        sprnuo sprnuo7 = sprnuo2;
        sprmzo sprmzo6 = arg0;
        sprnuo2.cfr_renamed_112 = arg0.cfr_renamed_13218();
        sprnuo2.cfr_renamed_91 = sprmzo6.cfr_renamed_13218();
        sprnuo7.cfr_renamed_2 = sprmzo6.cfr_renamed_17453();
        sprnuo7.cfr_renamed_93 = arg0.cfr_renamed_17453();
        sprnuo2.cfr_renamed_119 = sprmzo5.cfr_renamed_12254();
        sprnuo6.cfr_renamed_0 = sprmzo5.cfr_renamed_12254();
        sprnuo6.cfr_renamed_4 = arg0.cfr_renamed_12254();
        sprnuo2.cfr_renamed_3 = sprmzo4.cfr_renamed_12254();
        sprnuo5.cfr_renamed_152 = sprmzo4.cfr_renamed_13218();
        sprnuo5.cfr_renamed_105 = arg0.cfr_renamed_13218();
        sprnuo2.cfr_renamed_132 = sprmzo3.cfr_renamed_12254();
        sprnuo4.cfr_renamed_79 = sprmzo3.cfr_renamed_12254();
        sprnuo4.cfr_renamed_86 = arg0.cfr_renamed_12254();
        return sprnuo2;
    }
}

