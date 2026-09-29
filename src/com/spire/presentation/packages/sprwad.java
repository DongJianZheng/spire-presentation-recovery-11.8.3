/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprayc;
import com.spire.presentation.packages.sprbbd;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.spreed;
import com.spire.presentation.packages.sprfrc;
import com.spire.presentation.packages.sprgtc;
import com.spire.presentation.packages.sprhcd;
import com.spire.presentation.packages.sprhf;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprixc;
import com.spire.presentation.packages.sprkc;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprrbd;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.sprsj;
import com.spire.presentation.packages.sprtwg;
import com.spire.presentation.packages.sprwmd;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzk;
import com.spire.presentation.packages.sprzsc;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

public class sprwad
extends sprgtc {
    public sprwmd cfr_renamed_112;
    public sprkc cfr_renamed_119;
    public sprhgb cfr_renamed_91;
    public spreed cfr_renamed_0;
    public short[] cfr_renamed_1;
    public sprhf cfr_renamed_2;
    public short[] cfr_renamed_3;
    public int[] cfr_renamed_4;

    @Override
    public void cfr_renamed_2801(OutputStream arg0) throws IOException {
        if (this.cfr_renamed_2 == null) {
            this.cfr_renamed_0 = sprrbd.cfr_renamed_2984(this.cfr_renamed_2.cfr_renamed_2794(), this.cfr_renamed_3, this.cfr_renamed_112.cfr_renamed_284(), arg0);
        }
    }

    @Override
    public void cfr_renamed_2857(InputStream arg0) throws IOException {
        if (this.cfr_renamed_112 != null) {
            return;
        }
        byte[] byArray = sprzsc.cfr_renamed_2763(arg0);
        sprwad sprwad2 = this;
        sprqid sprqid2 = sprwad2.cfr_renamed_0.cfr_renamed_284();
        sprwad2.cfr_renamed_112 = sprrbd.cfr_renamed_2985(sprrbd.cfr_renamed_2986(sprwad2.cfr_renamed_3, sprqid2, byArray));
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
                case 64: 
                case 65: 
                case 66: {
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
    public byte[] cfr_renamed_2799() throws IOException {
        if (this.cfr_renamed_2 != null) {
            sprwad sprwad2 = this;
            return sprwad2.cfr_renamed_2.cfr_renamed_2987(sprwad2.cfr_renamed_112);
        }
        if (this.cfr_renamed_0 != null) {
            sprwad sprwad3 = this;
            return sprrbd.cfr_renamed_2988(sprwad3.cfr_renamed_112, sprwad3.cfr_renamed_0);
        }
        throw new spryad(80);
    }

    @Override
    public void cfr_renamed_2846(sprbbd arg0) throws IOException {
    }

    @Override
    public void cfr_renamed_2797(sprsc arg0) {
        sprwad sprwad2 = this;
        super.cfr_renamed_2797(arg0);
        if (sprwad2.cfr_renamed_119 != null) {
            this.cfr_renamed_119.cfr_renamed_2797(arg0);
        }
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
        sprwad sprwad2;
        if (arg0.cfr_renamed_29()) {
            throw new spryad(42);
        }
        sprcge sprcge2 = arg0.cfr_renamed_2720(0);
        sprdce sprdce2 = sprcge2.cfr_renamed_1489();
        try {
            this.cfr_renamed_91 = sprhcd.cfr_renamed_1531(sprdce2);
        }
        catch (RuntimeException runtimeException) {
            throw new spryad(43);
        }
        if (this.cfr_renamed_119 == null) {
            try {
                this.cfr_renamed_112 = sprrbd.cfr_renamed_2985((sprwmd)this.cfr_renamed_91);
            }
            catch (ClassCastException classCastException) {
                throw new spryad(46);
            }
            sprzsc.cfr_renamed_2721(sprcge2, 8);
            sprwad2 = this;
        } else {
            sprwad sprwad3 = this;
            if (!sprwad3.cfr_renamed_119.cfr_renamed_2787(sprwad3.cfr_renamed_91)) {
                throw new spryad(46);
            }
            sprzsc.cfr_renamed_2721(sprcge2, 128);
            sprwad2 = this;
        }
        super.cfr_renamed_2786(arg0);
    }

    @Override
    public void cfr_renamed_2796(sprsj arg0) throws IOException {
        if (arg0 instanceof sprhf) {
            this.cfr_renamed_2 = (sprhf)arg0;
            return;
        }
        if (arg0 instanceof sprzk) {
            return;
        }
        throw new spryad(80);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean cfr_renamed_2788() {
        switch (this.cfr_renamed_3) {
            case 17: 
            case 19: 
            case 20: {
                return true;
            }
        }
        return false;
    }

    public sprwad(int arg0, Vector arg1, int[] arg2, short[] arg3, short[] arg4) {
        int n = arg0;
        super(n, arg1);
        switch (n) {
            case 19: {
                sprwad sprwad2 = this;
                this.cfr_renamed_119 = new sprayc();
                break;
            }
            case 17: {
                sprwad sprwad2 = this;
                this.cfr_renamed_119 = new sprixc();
                break;
            }
            case 16: 
            case 18: {
                while (false) {
                }
                sprwad sprwad2 = this;
                this.cfr_renamed_119 = null;
                break;
            }
            default: {
                throw new IllegalArgumentException(sprtwg.cfr_renamed_9("\u0013\u000e\u0015\u0015\u0016\u0010\t\u0012\u0012\u0005\u0002@\r\u0005\u001f@\u0003\u0018\u0005\b\u0007\u000e\u0001\u0005F\u0001\n\u0007\t\u0012\u000f\u0014\u000e\r"));
            }
        }
        sprwad2.cfr_renamed_3 = (short[])arg0;
        sprwad sprwad3 = this;
        this.cfr_renamed_4 = arg2;
        sprwad3.cfr_renamed_1 = arg3;
        sprwad3.cfr_renamed_3 = arg4;
    }
}

