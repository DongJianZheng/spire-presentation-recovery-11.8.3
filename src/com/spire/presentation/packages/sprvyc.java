/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprawba;
import com.spire.presentation.packages.sprpgo;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.spryje;
import com.spire.presentation.packages.sprzsc;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class sprvyc {
    public short cfr_renamed_3;
    public Object cfr_renamed_4;

    public spryje cfr_renamed_3261() {
        if (!sprvyc.cfr_renamed_3074((short)1, this.cfr_renamed_4)) {
            throw new IllegalStateException(sprpgo.cfr_renamed_9("\u001a`XaM}SaX5\u001d{N2S}I2\\|\u001d]~Am@XaM}SaX"));
        }
        return (spryje)this.cfr_renamed_4;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void cfr_renamed_2623(OutputStream arg0) throws IOException {
        sprvyc sprvyc2 = this;
        sprzsc.cfr_renamed_2676(sprvyc2.cfr_renamed_3, arg0);
        switch (sprvyc2.cfr_renamed_3) {
            case 1: {
                sprzsc.cfr_renamed_2712(((spryje)this.cfr_renamed_4).cfr_renamed_104("DER"), arg0);
                return;
            }
        }
        throw new spryad(80);
    }

    public short cfr_renamed_3258() {
        return this.cfr_renamed_3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static sprvyc cfr_renamed_2661(InputStream arg0) throws IOException {
        short s = sprzsc.cfr_renamed_2630(arg0);
        switch (s) {
            case 1: {
                spryje spryje2 = spryje.cfr_renamed_23(sprzsc.cfr_renamed_2768(sprzsc.cfr_renamed_2700(arg0)));
                return new sprvyc(s, spryje2);
            }
        }
        throw new spryad(50);
    }

    /*
     * WARNING - void declaration
     */
    public sprvyc(short s, Object object) {
        void arg0;
        void arg1;
        if (!sprvyc.cfr_renamed_3074(s, arg1)) {
            throw new IllegalArgumentException(sprawba.cfr_renamed_9("F\u0003\u0004\u0002\u0011\u001e\u000f\u0002\u0004VA\u0018\u0012Q\u000f\u001e\u0015Q\u0000\u001fA\u0018\u000f\u0002\u0015\u0010\u000f\u0012\u0004Q\u000e\u0017A\u0005\t\u0014A\u0012\u000e\u0003\u0013\u0014\u0002\u0005A\u0005\u0018\u0001\u0004"));
        }
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = arg1;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean cfr_renamed_3074(short arg0, Object arg1) {
        switch (arg0) {
            case 1: {
                return arg1 instanceof spryje;
            }
        }
        throw new IllegalArgumentException(sprpgo.cfr_renamed_9("5Nf\\fHaikMw\u001a2Ta\u001dsS2H|NgMbR`IwY2KsQgX"));
    }

    public Object cfr_renamed_3262() {
        return this.cfr_renamed_4;
    }
}

