/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbwn;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprxam;
import com.spire.presentation.packages.sprxvc;
import java.io.IOException;

public class sprucm
extends sprxam {
    public long cfr_renamed_2;
    public int cfr_renamed_3;
    public byte[] cfr_renamed_4;

    public int cfr_renamed_7832() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprucm(sprmam sprmam2) throws IOException {
        int n;
        void arg0;
        sprucm sprucm2 = this;
        void v1 = arg0;
        super((sprmam)v1);
        sprucm2.cfr_renamed_3 = v1.read();
        sprucm2.cfr_renamed_4 = new byte[sprmam2.read()];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.length) {
            int n3 = arg0.read();
            if (n3 < 0) {
                throw new IOException(sprbwn.cfr_renamed_9("qdiholq-ylil=yoxsn|yxi=ds-uh|ix\u007f"));
            }
            this.cfr_renamed_4[n++] = (byte)n3;
            n2 = n;
        }
        this.cfr_renamed_2 = (long)arg0.read() << 24 | (long)(arg0.read() << 16) | (long)(arg0.read() << 8) | (long)arg0.read();
        if (this.cfr_renamed_2 < 0L) {
            throw new IOException(sprxvc.cfr_renamed_9("=v%z#~=?5~%~qk#j?|0k4{qv??9z0{4m"));
        }
    }

    public byte[] cfr_renamed_7831() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public long cfr_renamed_7833() {
        return this.cfr_renamed_2 * 1000L;
    }

    public String cfr_renamed_678() {
        return sprkoe.cfr_renamed_427(this.cfr_renamed_4);
    }
}

