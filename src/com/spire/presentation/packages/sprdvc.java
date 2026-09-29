/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprald;
import com.spire.presentation.packages.sprayc;
import com.spire.presentation.packages.sprbbd;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprfrc;
import com.spire.presentation.packages.sprgbd;
import com.spire.presentation.packages.sprgjd;
import com.spire.presentation.packages.sprgtc;
import com.spire.presentation.packages.sprhcd;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprjnd;
import com.spire.presentation.packages.sprkc;
import com.spire.presentation.packages.sprkpa;
import com.spire.presentation.packages.sprlxc;
import com.spire.presentation.packages.sprowc;
import com.spire.presentation.packages.sprpbd;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.sprsj;
import com.spire.presentation.packages.sprta;
import com.spire.presentation.packages.sprvmd;
import com.spire.presentation.packages.sprvpa;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzsc;
import com.spire.presentation.packages.sprzuc;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Vector;

public class sprdvc
extends sprgtc {
    public BigInteger cfr_renamed_119;
    public byte[] cfr_renamed_91;
    public sprald cfr_renamed_0;
    public byte[] cfr_renamed_1;
    public sprhgb cfr_renamed_2;
    public sprkc cfr_renamed_3;
    public byte[] cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_2786(sprbbd arg0) throws IOException {
        if (this.cfr_renamed_3 == null) {
            throw new spryad(10);
        }
        if (arg0.cfr_renamed_29()) {
            throw new spryad(42);
        }
        sprcge sprcge2 = arg0.cfr_renamed_2720(0);
        sprdce sprdce2 = sprcge2.cfr_renamed_1489();
        try {
            this.cfr_renamed_2 = sprhcd.cfr_renamed_1531(sprdce2);
        }
        catch (RuntimeException runtimeException) {
            throw new spryad(43);
        }
        if (!this.cfr_renamed_3.cfr_renamed_2787(this.cfr_renamed_2)) {
            throw new spryad(46);
        }
        sprzsc.cfr_renamed_2721(sprcge2, 128);
        super.cfr_renamed_2786(arg0);
    }

    @Override
    public boolean cfr_renamed_2788() {
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public sprdvc(int n, Vector vector, byte[] byArray, byte[] byArray2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprdvc sprdvc2 = this;
        super((int)arg0, (Vector)arg1);
        this.cfr_renamed_2 = null;
        sprdvc2.cfr_renamed_1 = null;
        sprdvc2.cfr_renamed_119 = null;
        sprdvc sprdvc3 = this;
        sprdvc2.cfr_renamed_0 = new sprald();
        switch (n) {
            case 21: {
                while (false) {
                }
                sprdvc sprdvc4 = this;
                this.cfr_renamed_3 = null;
                break;
            }
            case 23: {
                sprdvc sprdvc4 = this;
                this.cfr_renamed_3 = new sprayc();
                break;
            }
            case 22: {
                sprdvc sprdvc4 = this;
                this.cfr_renamed_3 = new sprlxc();
                break;
            }
            default: {
                throw new IllegalArgumentException(sprgjd.cfr_renamed_9("Y\u001d_\u0006\\\u0003C\u0001X\u0016HSG\u0016USI\u000bO\u001bM\u001dK\u0016\f\u0012@\u0014C\u0001E\u0007D\u001e"));
            }
        }
        sprdvc4.cfr_renamed_3 = arg0;
        sprdvc sprdvc5 = this;
        sprdvc5.cfr_renamed_91 = arg2;
        sprdvc5.cfr_renamed_4 = arg3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_2789(InputStream arg0) throws IOException {
        Object object;
        Object object2;
        sprdvc sprdvc2 = this;
        sprgbd sprgbd2 = sprdvc2.cfr_renamed_2.cfr_renamed_2666();
        sprowc sprowc2 = null;
        InputStream inputStream = arg0;
        if (sprdvc2.cfr_renamed_3 != null) {
            sprowc2 = new sprowc();
            inputStream = new sprkpa(arg0, sprowc2);
        }
        InputStream inputStream2 = inputStream;
        byte[] byArray = sprzsc.cfr_renamed_2629(inputStream2);
        byte[] byArray2 = sprzsc.cfr_renamed_2629(inputStream2);
        byte[] byArray3 = sprzsc.cfr_renamed_2763(inputStream2);
        byte[] byArray4 = sprzsc.cfr_renamed_2629(inputStream2);
        if (sprowc2 != null) {
            sprdvc sprdvc3 = this;
            object2 = sprpbd.cfr_renamed_2628((sprsc)((Object)sprdvc3.cfr_renamed_2), arg0);
            Object object3 = object = sprdvc3.cfr_renamed_2790(sprdvc3.cfr_renamed_3, ((sprpbd)object2).cfr_renamed_593(), sprgbd2);
            sprowc2.cfr_renamed_2791((sprta)object3);
            if (!object3.cfr_renamed_1328(((sprpbd)object2).cfr_renamed_79())) {
                throw new spryad(51);
            }
        }
        object2 = new BigInteger(1, byArray);
        object = new BigInteger(1, byArray2);
        this.cfr_renamed_1 = byArray3;
        try {
            this.cfr_renamed_119 = sprjnd.cfr_renamed_2792((BigInteger)object2, new BigInteger(1, byArray4));
        }
        catch (sprvmd sprvmd2) {
            throw new spryad(47);
        }
        this.cfr_renamed_0.cfr_renamed_2793((BigInteger)object2, (BigInteger)object, sprzsc.cfr_renamed_2640((short)2), this.cfr_renamed_2.cfr_renamed_2794());
    }

    public sprta cfr_renamed_2790(sprkc arg0, sprzuc arg1, sprgbd arg2) {
        sprta sprta2 = arg0.cfr_renamed_2795(arg1, this.cfr_renamed_2);
        sprta2.cfr_renamed_1197(arg2.cfr_renamed_86, 0, arg2.cfr_renamed_86.length);
        sprta2.cfr_renamed_1197(arg2.cfr_renamed_93, 0, arg2.cfr_renamed_93.length);
        return sprta2;
    }

    @Override
    public void cfr_renamed_2796(sprsj arg0) throws IOException {
        throw new spryad(80);
    }

    @Override
    public void cfr_renamed_2797(sprsc arg0) {
        sprdvc sprdvc2 = this;
        super.cfr_renamed_2797(arg0);
        if (sprdvc2.cfr_renamed_3 != null) {
            this.cfr_renamed_3.cfr_renamed_2797(arg0);
        }
    }

    @Override
    public void cfr_renamed_2798() throws IOException {
        if (this.cfr_renamed_3 != null) {
            throw new spryad(10);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_2799() throws IOException {
        try {
            sprdvc sprdvc2 = this;
            return sprvpa.cfr_renamed_514(sprdvc2.cfr_renamed_0.cfr_renamed_2800(sprdvc2.cfr_renamed_119));
        }
        catch (sprvmd sprvmd2) {
            throw new spryad(47);
        }
    }

    @Override
    public void cfr_renamed_2801(OutputStream arg0) throws IOException {
        sprdvc sprdvc2 = this;
        sprdvc sprdvc3 = this;
        sprzsc.cfr_renamed_2624(sprvpa.cfr_renamed_514(sprdvc2.cfr_renamed_0.cfr_renamed_2802(sprdvc2.cfr_renamed_1, sprdvc3.cfr_renamed_91, sprdvc3.cfr_renamed_4)), arg0);
    }

    @Override
    public void cfr_renamed_2803(sprfrc arg0) throws IOException {
        throw new spryad(10);
    }
}

