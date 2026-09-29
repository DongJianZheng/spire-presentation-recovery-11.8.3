/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbbd;
import com.spire.presentation.packages.sprbsa;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprfrc;
import com.spire.presentation.packages.sprgtc;
import com.spire.presentation.packages.sprhcd;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.sprsj;
import com.spire.presentation.packages.sprvxc;
import com.spire.presentation.packages.sprxf;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzk;
import com.spire.presentation.packages.sprzsc;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

public class sproad
extends sprgtc {
    public sprhgb cfr_renamed_1;
    public sprmtc cfr_renamed_2;
    public byte[] cfr_renamed_3;
    public sprxf cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_2799() throws IOException {
        if (this.cfr_renamed_3 == null) {
            throw new spryad(80);
        }
        byte[] byArray = this.cfr_renamed_3;
        this.cfr_renamed_3 = null;
        return byArray;
    }

    @Override
    public void cfr_renamed_2796(sprsj arg0) throws IOException {
        if (!(arg0 instanceof sprzk)) {
            throw new spryad(80);
        }
    }

    @Override
    public void cfr_renamed_2857(InputStream arg0) throws IOException {
        sproad sproad2;
        byte[] byArray;
        if (sprzsc.cfr_renamed_2665((sprsc)((Object)this.cfr_renamed_2))) {
            byArray = sprbsa.cfr_renamed_471(arg0);
            sproad2 = this;
        } else {
            byArray = sprzsc.cfr_renamed_2629(arg0);
            sproad2 = this;
        }
        sproad2.cfr_renamed_3 = this.cfr_renamed_4.cfr_renamed_2892(byArray);
    }

    @Override
    public void cfr_renamed_2798() throws IOException {
        throw new spryad(10);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_2786(sprbbd arg0) throws IOException {
        if (arg0.cfr_renamed_29()) {
            throw new spryad(42);
        }
        sprcge sprcge2 = arg0.cfr_renamed_2720(0);
        sprdce sprdce2 = sprcge2.cfr_renamed_1489();
        try {
            this.cfr_renamed_1 = sprhcd.cfr_renamed_1531(sprdce2);
        }
        catch (RuntimeException runtimeException) {
            throw new spryad(43);
        }
        if (this.cfr_renamed_1.cfr_renamed_1352()) {
            throw new spryad(80);
        }
        sproad sproad2 = this;
        sproad2.cfr_renamed_2 = sproad2.cfr_renamed_2895((sprmtc)sproad2.cfr_renamed_1);
        sprzsc.cfr_renamed_2721(sprcge2, 32);
        super.cfr_renamed_2786(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sproad(Vector vector) {
        void arg0;
        sproad sproad2 = this;
        super(1, (Vector)arg0);
        this.cfr_renamed_1 = null;
        sproad2.cfr_renamed_2 = null;
        sproad2.cfr_renamed_4 = null;
    }

    public sprmtc cfr_renamed_2895(sprmtc arg0) throws IOException {
        if (!arg0.cfr_renamed_360().isProbablePrime(2)) {
            throw new spryad(47);
        }
        return arg0;
    }

    @Override
    public void cfr_renamed_2803(sprfrc arg0) throws IOException {
        int n;
        short[] sArray = arg0.cfr_renamed_2896();
        int n2 = n = 0;
        while (n2 < sArray.length) {
            switch (sArray[n]) {
                case 1: 
                case 2: 
                case 64: {
                    break;
                }
                default: {
                    throw new spryad(47);
                }
            }
            n2 = ++n;
        }
    }

    @Override
    public void spr\u3027(sprsj arg0) throws IOException {
        if (!(arg0 instanceof sprxf)) {
            throw new spryad(80);
        }
        sprsj sprsj2 = arg0;
        this.cfr_renamed_2786(sprsj2.cfr_renamed_2141());
        this.cfr_renamed_4 = (sprxf)sprsj2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_2801(OutputStream outputStream) throws IOException {
        void arg0;
        this.cfr_renamed_3 = sprvxc.cfr_renamed_2891((sprsc)((Object)this.cfr_renamed_2), this.cfr_renamed_2, (OutputStream)arg0);
    }
}

