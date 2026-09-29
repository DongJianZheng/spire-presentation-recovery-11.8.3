/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprayc;
import com.spire.presentation.packages.sprbbd;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprfap;
import com.spire.presentation.packages.sprfrc;
import com.spire.presentation.packages.sprgtc;
import com.spire.presentation.packages.sprgwc;
import com.spire.presentation.packages.sprhcd;
import com.spire.presentation.packages.sprhf;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprkc;
import com.spire.presentation.packages.sprlxc;
import com.spire.presentation.packages.sprmgd;
import com.spire.presentation.packages.sprrkd;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.sprsj;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzk;
import com.spire.presentation.packages.sprzmd;
import com.spire.presentation.packages.sprzsc;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Vector;

public class sprtyc
extends sprgtc {
    public sprmgd cfr_renamed_86;
    public static final BigInteger cfr_renamed_152;
    public sprmgd cfr_renamed_112;
    public sprhgb cfr_renamed_119;
    public sprzmd cfr_renamed_91;
    public static final BigInteger cfr_renamed_0;
    public sprrkd cfr_renamed_1;
    public sprkc cfr_renamed_2;
    public sprhf cfr_renamed_3;
    public sprrkd cfr_renamed_4;

    public sprtyc(int arg0, Vector arg1, sprzmd arg2) {
        int n = arg0;
        super(n, arg1);
        switch (n) {
            case 7: 
            case 9: {
                sprtyc sprtyc2 = this;
                this.cfr_renamed_2 = null;
                break;
            }
            case 5: {
                sprtyc sprtyc2 = this;
                this.cfr_renamed_2 = new sprayc();
                break;
            }
            case 3: {
                while (false) {
                }
                sprtyc sprtyc2 = this;
                this.cfr_renamed_2 = new sprlxc();
                break;
            }
            default: {
                throw new IllegalArgumentException(sprfap.cfr_renamed_9("FZ@ACD\\FGQW\u0014XQJ\u0014VLP\\RZTQ\u0013U_S\\FZ@[Y"));
            }
        }
        sprtyc2.cfr_renamed_91 = arg2;
    }

    @Override
    public void cfr_renamed_2801(OutputStream arg0) throws IOException {
        if (this.cfr_renamed_3 == null) {
            this.cfr_renamed_1 = sprgwc.cfr_renamed_2902(this.cfr_renamed_2.cfr_renamed_2794(), this.cfr_renamed_86.cfr_renamed_284(), arg0);
        }
    }

    @Override
    public void cfr_renamed_2797(sprsc arg0) {
        sprtyc sprtyc2 = this;
        super.cfr_renamed_2797(arg0);
        if (sprtyc2.cfr_renamed_2 != null) {
            this.cfr_renamed_2.cfr_renamed_2797(arg0);
        }
    }

    @Override
    public void cfr_renamed_2796(sprsj arg0) throws IOException {
        if (arg0 instanceof sprhf) {
            this.cfr_renamed_3 = (sprhf)arg0;
            return;
        }
        if (arg0 instanceof sprzk) {
            return;
        }
        throw new spryad(80);
    }

    static {
        cfr_renamed_0 = BigInteger.valueOf(1L);
        cfr_renamed_152 = BigInteger.valueOf(2L);
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
                case 3: 
                case 4: 
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

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean cfr_renamed_2788() {
        switch (this.cfr_renamed_3) {
            case 3: 
            case 5: 
            case 11: {
                return true;
            }
        }
        return false;
    }

    @Override
    public void cfr_renamed_2798() throws IOException {
        throw new spryad(10);
    }

    @Override
    public byte[] cfr_renamed_2799() throws IOException {
        if (this.cfr_renamed_3 != null) {
            sprtyc sprtyc2 = this;
            return sprtyc2.cfr_renamed_3.cfr_renamed_2987(sprtyc2.cfr_renamed_86);
        }
        if (this.cfr_renamed_4 != null) {
            sprtyc sprtyc3 = this;
            return sprgwc.cfr_renamed_2904(sprtyc3.cfr_renamed_112, sprtyc3.cfr_renamed_4);
        }
        if (this.cfr_renamed_1 != null) {
            sprtyc sprtyc4 = this;
            return sprgwc.cfr_renamed_2904(sprtyc4.cfr_renamed_86, sprtyc4.cfr_renamed_1);
        }
        throw new spryad(80);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_2786(sprbbd arg0) throws IOException {
        sprtyc sprtyc2;
        if (arg0.cfr_renamed_29()) {
            throw new spryad(42);
        }
        sprcge sprcge2 = arg0.cfr_renamed_2720(0);
        sprdce sprdce2 = sprcge2.cfr_renamed_1489();
        try {
            this.cfr_renamed_119 = sprhcd.cfr_renamed_1531(sprdce2);
        }
        catch (RuntimeException runtimeException) {
            throw new spryad(43);
        }
        if (this.cfr_renamed_2 == null) {
            try {
                this.cfr_renamed_86 = sprgwc.cfr_renamed_2899((sprmgd)this.cfr_renamed_119);
            }
            catch (ClassCastException classCastException) {
                throw new spryad(46);
            }
            sprzsc.cfr_renamed_2721(sprcge2, 8);
            sprtyc2 = this;
        } else {
            sprtyc sprtyc3 = this;
            if (!sprtyc3.cfr_renamed_2.cfr_renamed_2787(sprtyc3.cfr_renamed_119)) {
                throw new spryad(46);
            }
            sprzsc.cfr_renamed_2721(sprcge2, 128);
            sprtyc2 = this;
        }
        super.cfr_renamed_2786(arg0);
    }
}

