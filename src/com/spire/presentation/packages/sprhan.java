/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdtq;
import com.spire.presentation.packages.sprkgba;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqbn;
import com.spire.presentation.packages.sprqwm;
import com.spire.presentation.packages.sprtfn;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;

public abstract class sprhan
extends sprxgf
implements sprml {
    public final byte[] cfr_renamed_3;
    public static final sprqbn cfr_renamed_4 = new sprtfn(sprhan.class, 18);

    public static boolean cfr_renamed_11497(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            switch (arg0[n]) {
                case 32: 
                case 48: 
                case 49: 
                case 50: 
                case 51: 
                case 52: 
                case 53: 
                case 54: 
                case 55: 
                case 56: 
                case 57: {
                    break;
                }
                default: {
                    return false;
                }
            }
            n2 = ++n;
        }
        return true;
    }

    @Override
    public final int cfr_renamed_11213(boolean arg0) {
        return sproen.cfr_renamed_11214(arg0, this.cfr_renamed_3.length);
    }

    /*
     * WARNING - void declaration
     */
    public sprhan(String string, boolean bl) {
        void arg0;
        if (bl && !sprhan.cfr_renamed_4793((String)arg0)) {
            throw new IllegalArgumentException(sprkgba.cfr_renamed_9("e\u0018d\u0005x\u000b6\u000fy\u0002b\r\u007f\u0002eL\u007f\u0000z\tq\rzLu\u0004w\u001ew\u000fb\td\u001f"));
        }
        this.cfr_renamed_3 = sprkoe.cfr_renamed_433((String)arg0);
    }

    public static sprhan cfr_renamed_11295(byte[] arg0) {
        return new sprqwm(arg0, false);
    }

    public static sprhan cfr_renamed_23(Object arg0) {
        sprxgf sprxgf2;
        if (arg0 == null || arg0 instanceof sprhan) {
            return (sprhan)arg0;
        }
        if (arg0 instanceof sprco && (sprxgf2 = ((sprco)arg0).cfr_renamed_119()) instanceof sprhan) {
            return (sprhan)sprxgf2;
        }
        if (arg0 instanceof byte[]) {
            try {
                return (sprhan)cfr_renamed_4.cfr_renamed_184((byte[])arg0);
            }
            catch (Exception exception) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprdtq.cfr_renamed_9("T!R U&_(\u0011*C=^=\u0011&_oV*E\u0006_<E._,Tu\u0011")).append(exception.toString()).toString());
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprkgba.cfr_renamed_9("\u0005z\u0000s\u000bw\u00006\u0003t\u0006s\u000fbL\u007f\u00026\u000bs\u0018_\u0002e\u0018w\u0002u\t,L")).append(arg0.getClass().getName()).toString());
    }

    @Override
    public final boolean cfr_renamed_11432(sprxgf arg0) {
        if (!(arg0 instanceof sprhan)) {
            return false;
        }
        sprhan sprhan2 = (sprhan)arg0;
        return sproze.cfr_renamed_92(this.cfr_renamed_3, sprhan2.cfr_renamed_3);
    }

    public static boolean cfr_renamed_4793(String arg0) {
        int n;
        int n2 = n = arg0.length() - 1;
        while (n2 >= 0) {
            char c = arg0.charAt(n);
            if (c > '\u007f') {
                return false;
            }
            if (('0' > c || c > '9') && c != ' ') {
                return false;
            }
            n2 = --n;
        }
        return true;
    }

    public String toString() {
        return this.cfr_renamed_314();
    }

    public static sprhan cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return (sprhan)cfr_renamed_4.cfr_renamed_11433(arg0, arg1);
    }

    @Override
    public final void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        arg0.cfr_renamed_11219(arg1, 18, this.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public sprhan(byte[] byArray, boolean bl) {
        void arg0;
        this.cfr_renamed_3 = (byte[])(bl ? sproze.cfr_renamed_158((byte[])arg0) : arg0);
    }

    public final byte[] cfr_renamed_186() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    @Override
    public final int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_3);
    }

    @Override
    public final String cfr_renamed_314() {
        return sprkoe.cfr_renamed_184(this.cfr_renamed_3);
    }

    @Override
    public final boolean cfr_renamed_11277() {
        return false;
    }
}

