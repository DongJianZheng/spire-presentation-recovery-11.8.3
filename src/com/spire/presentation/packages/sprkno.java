/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpeja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprujo;
import com.spire.presentation.packages.sprurr;

@sprtea
public class sprkno {
    private short cfr_renamed_152;
    private short cfr_renamed_112;
    private short cfr_renamed_119;
    private long cfr_renamed_91;
    private short cfr_renamed_0;
    private short cfr_renamed_1;
    private short cfr_renamed_2;
    private short cfr_renamed_3;
    private long cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_16811() {
        short s = 0;
        s = (short)(0 ^ (short)(this.cfr_renamed_91 & 0xFFFFFFFFL & 0xFFFFL));
        s = (short)(s ^ (short)((this.cfr_renamed_91 & 0xFFFFFFFFL & 0xFFFF0000L) >> 16));
        s = (short)(s ^ this.cfr_renamed_119);
        s = (short)(s ^ this.cfr_renamed_3);
        s = (short)(s ^ this.cfr_renamed_1);
        s = (short)(s ^ this.cfr_renamed_152);
        s = (short)(s ^ this.cfr_renamed_2);
        s = (short)(s ^ this.cfr_renamed_0);
        s = (short)(s ^ (short)(this.cfr_renamed_4 & 0xFFFFFFFFL & 0xFFFFL));
        if ((s = (short)(s ^ (short)((this.cfr_renamed_4 & 0xFFFFFFFFL & 0xFFFF0000L) >> 16))) != this.cfr_renamed_112) {
            throw new IllegalStateException(sprurr.cfr_renamed_9("vjOn]fWj\u001blSjXdHzV/R|\u001bfUyZcRk\u0015"));
        }
    }

    @sprtea
    public boolean cfr_renamed_16805() {
        sprkno sprkno2 = this;
        if (sprkno2.cfr_renamed_152 - sprkno2.cfr_renamed_3 > 0) {
            sprkno sprkno3 = this;
            if (sprkno3.cfr_renamed_2 - sprkno3.cfr_renamed_1 > 0) {
                return true;
            }
        }
        return false;
    }

    @sprtea
    public int cfr_renamed_16810() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public void cfr_renamed_16808(sprujo sprujo2) {
        void arg0;
        void v0 = arg0;
        sprkno sprkno2 = this;
        void v2 = arg0;
        sprkno sprkno3 = this;
        void v4 = arg0;
        this.cfr_renamed_91 = v4.cfr_renamed_13220();
        sprkno3.cfr_renamed_119 = v4.cfr_renamed_12254();
        sprkno3.cfr_renamed_3 = arg0.cfr_renamed_12254();
        this.cfr_renamed_1 = v2.cfr_renamed_12254();
        sprkno2.cfr_renamed_152 = v2.cfr_renamed_12254();
        sprkno2.cfr_renamed_2 = arg0.cfr_renamed_12254();
        this.cfr_renamed_0 = v0.cfr_renamed_12254();
        this.cfr_renamed_4 = v0.cfr_renamed_13220();
        this.cfr_renamed_112 = sprujo2.cfr_renamed_12254();
        this.cfr_renamed_16811();
    }

    @sprtea
    public sprpeja cfr_renamed_8505() {
        sprkno sprkno2 = this;
        sprkno sprkno3 = this;
        sprkno sprkno4 = this;
        return new sprpeja(sprkno2.cfr_renamed_3, sprkno2.cfr_renamed_1, sprkno3.cfr_renamed_152 - sprkno3.cfr_renamed_3, sprkno4.cfr_renamed_2 - sprkno4.cfr_renamed_1);
    }

    @sprtea
    public sprkno() {
    }
}

