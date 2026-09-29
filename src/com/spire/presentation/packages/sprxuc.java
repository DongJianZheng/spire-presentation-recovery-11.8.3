/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbbd;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprctc;
import com.spire.presentation.packages.sprcwr;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprfc;
import com.spire.presentation.packages.sprfrc;
import com.spire.presentation.packages.sprgtc;
import com.spire.presentation.packages.sprgwc;
import com.spire.presentation.packages.sprhcd;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprmgd;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sprrkd;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.sprsj;
import com.spire.presentation.packages.sprvxc;
import com.spire.presentation.packages.sprxf;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzmd;
import com.spire.presentation.packages.sprzsc;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

public class sprxuc
extends sprgtc {
    public sprmgd cfr_renamed_102;
    public short[] cfr_renamed_93;
    public sprmtc cfr_renamed_86;
    public sprfc cfr_renamed_152;
    public byte[] cfr_renamed_112;
    public short[] cfr_renamed_119;
    public byte[] cfr_renamed_91;
    public sprxf cfr_renamed_0;
    public sprrkd cfr_renamed_1;
    public sprhgb cfr_renamed_2;
    public sprzmd cfr_renamed_3;
    public int[] cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_2799() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        sprxuc sprxuc2 = this;
        byte[] byArray = sprxuc2.cfr_renamed_152.cfr_renamed_2897();
        byte[] byArray2 = sprxuc2.cfr_renamed_2898(byArray.length);
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream = new ByteArrayOutputStream(4 + byArray2.length + byArray.length);
        sprzsc.cfr_renamed_2624(byArray2, byteArrayOutputStream);
        sprzsc.cfr_renamed_2624(byArray, byteArrayOutputStream2);
        return byteArrayOutputStream2.toByteArray();
    }

    /*
     * WARNING - void declaration
     */
    public sprxuc(int n, Vector vector, sprfc sprfc2, sprzmd sprzmd2, int[] nArray, short[] sArray, short[] sArray2) {
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprxuc sprxuc2 = this;
        sprxuc sprxuc3 = this;
        sprxuc sprxuc4 = this;
        super((int)arg0, (Vector)arg1);
        sprxuc4.cfr_renamed_112 = null;
        sprxuc4.cfr_renamed_1 = null;
        sprxuc3.cfr_renamed_102 = null;
        sprxuc3.cfr_renamed_2 = null;
        sprxuc2.cfr_renamed_86 = null;
        sprxuc2.cfr_renamed_0 = null;
        switch (n) {
            case 13: 
            case 14: 
            case 15: 
            case 24: {
                break;
            }
            default: {
                throw new IllegalArgumentException(sprcwr.cfr_renamed_9("yR\u007fI|LcNxYh\u001cgYu\u001ciDoTmRkY,]`[cNeHdQ"));
            }
        }
        sprxuc sprxuc5 = this;
        sprxuc sprxuc6 = this;
        sprxuc6.cfr_renamed_152 = arg2;
        sprxuc6.cfr_renamed_3 = arg3;
        sprxuc5.cfr_renamed_4 = arg4;
        sprxuc5.cfr_renamed_93 = arg5;
        this.cfr_renamed_119 = arg6;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_2786(sprbbd arg0) throws IOException {
        if (this.cfr_renamed_3 != 15) {
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
        if (this.cfr_renamed_2.cfr_renamed_1352()) {
            throw new spryad(80);
        }
        sprxuc sprxuc2 = this;
        sprxuc2.cfr_renamed_86 = sprxuc2.cfr_renamed_2895((sprmtc)sprxuc2.cfr_renamed_2);
        sprzsc.cfr_renamed_2721(sprcge2, 32);
        super.cfr_renamed_2786(arg0);
    }

    @Override
    public void cfr_renamed_2796(sprsj arg0) throws IOException {
        throw new spryad(80);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean cfr_renamed_2788() {
        switch (this.cfr_renamed_3) {
            case 14: 
            case 24: {
                return true;
            }
        }
        return false;
    }

    @Override
    public void cfr_renamed_2789(InputStream arg0) throws IOException {
        this.cfr_renamed_112 = sprzsc.cfr_renamed_2629(arg0);
        if (this.cfr_renamed_3 == 14) {
            sprctc sprctc2 = sprctc.cfr_renamed_2661(arg0);
            this.cfr_renamed_102 = sprgwc.cfr_renamed_2899(sprctc2.cfr_renamed_1157());
            return;
        }
        if (this.cfr_renamed_3 == 24) {
            // empty if block
        }
    }

    @Override
    public void cfr_renamed_2801(OutputStream arg0) throws IOException {
        sprxuc sprxuc2;
        if (this.cfr_renamed_112 == null) {
            sprxuc sprxuc3 = this;
            sprxuc2 = sprxuc3;
            sprxuc3.cfr_renamed_152.cfr_renamed_1453();
        } else {
            sprxuc sprxuc4 = this;
            sprxuc2 = sprxuc4;
            sprxuc4.cfr_renamed_152.cfr_renamed_2900(sprxuc4.cfr_renamed_112);
        }
        sprzsc.cfr_renamed_2624(sprxuc2.cfr_renamed_152.cfr_renamed_2901(), arg0);
        if (this.cfr_renamed_3 == 14) {
            this.cfr_renamed_1 = sprgwc.cfr_renamed_2902(this.cfr_renamed_2.cfr_renamed_2794(), this.cfr_renamed_102.cfr_renamed_284(), arg0);
            return;
        }
        if (this.cfr_renamed_3 == 24) {
            throw new spryad(80);
        }
        if (this.cfr_renamed_3 == 15) {
            this.cfr_renamed_91 = sprvxc.cfr_renamed_2891((sprsc)((Object)this.cfr_renamed_2), this.cfr_renamed_86, arg0);
        }
    }

    @Override
    public void cfr_renamed_2798() throws IOException {
        if (this.cfr_renamed_3 == 15) {
            throw new spryad(10);
        }
    }

    @Override
    public void spr\u3027(sprsj arg0) throws IOException {
        if (!(arg0 instanceof sprxf)) {
            throw new spryad(80);
        }
        sprsj sprsj2 = arg0;
        this.cfr_renamed_2786(sprsj2.cfr_renamed_2141());
        this.cfr_renamed_0 = (sprxf)sprsj2;
    }

    @Override
    public void cfr_renamed_2803(sprfrc arg0) throws IOException {
        throw new spryad(10);
    }

    @Override
    public byte[] cfr_renamed_2879() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        sprxuc sprxuc2;
        this.cfr_renamed_112 = null;
        if (this.cfr_renamed_112 == null && !this.cfr_renamed_2788()) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        if (this.cfr_renamed_112 == null) {
            sprzsc.cfr_renamed_2624(sprzsc.cfr_renamed_1, byteArrayOutputStream2);
            sprxuc2 = this;
        } else {
            sprxuc sprxuc3 = this;
            sprxuc2 = sprxuc3;
            sprzsc.cfr_renamed_2624(sprxuc3.cfr_renamed_112, byteArrayOutputStream2);
        }
        if (sprxuc2.cfr_renamed_3 == 14) {
            if (this.cfr_renamed_3 == null) {
                throw new spryad(80);
            }
            this.cfr_renamed_1 = sprgwc.cfr_renamed_2903(this.cfr_renamed_2.cfr_renamed_2794(), this.cfr_renamed_3, byteArrayOutputStream2);
            byteArrayOutputStream = byteArrayOutputStream2;
        } else {
            if (this.cfr_renamed_3 == 24) {
                // empty if block
            }
            byteArrayOutputStream = byteArrayOutputStream2;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public sprmtc cfr_renamed_2895(sprmtc arg0) throws IOException {
        if (!arg0.cfr_renamed_360().isProbablePrime(2)) {
            throw new spryad(47);
        }
        return arg0;
    }

    public byte[] cfr_renamed_2898(int arg0) throws IOException {
        if (this.cfr_renamed_3 == 14) {
            if (this.cfr_renamed_1 != null) {
                sprxuc sprxuc2 = this;
                return sprgwc.cfr_renamed_2904(sprxuc2.cfr_renamed_102, sprxuc2.cfr_renamed_1);
            }
            throw new spryad(80);
        }
        if (this.cfr_renamed_3 == 24) {
            throw new spryad(80);
        }
        if (this.cfr_renamed_3 == 15) {
            return this.cfr_renamed_91;
        }
        return new byte[arg0];
    }
}

