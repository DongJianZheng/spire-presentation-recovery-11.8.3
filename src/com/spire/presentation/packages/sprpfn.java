/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdnaa;
import com.spire.presentation.packages.sprhur;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprldn;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxm;
import com.spire.presentation.packages.sprqbn;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;

public abstract class sprpfn
extends sprxgf
implements sprml {
    public static final sprqbn cfr_renamed_3 = new sprpxm(sprpfn.class, 19);
    public final byte[] cfr_renamed_4;

    @Override
    public final boolean cfr_renamed_11432(sprxgf arg0) {
        if (!(arg0 instanceof sprpfn)) {
            return false;
        }
        sprpfn sprpfn2 = (sprpfn)arg0;
        return sproze.cfr_renamed_92(this.cfr_renamed_4, sprpfn2.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprpfn(String string, boolean bl) {
        void arg0;
        if (bl && !sprpfn.cfr_renamed_4449((String)arg0)) {
            throw new IllegalArgumentException(sprdnaa.cfr_renamed_9("<i=t!zo~ s;|&s<=&q#x(|#=,u.o.~;x=n"));
        }
        this.cfr_renamed_4 = sprkoe.cfr_renamed_433((String)arg0);
    }

    @Override
    public final String cfr_renamed_314() {
        return sprkoe.cfr_renamed_184(this.cfr_renamed_4);
    }

    public static boolean cfr_renamed_4449(String arg0) {
        int n;
        int n2 = n = arg0.length() - 1;
        while (n2 >= 0) {
            char c = arg0.charAt(n);
            if (c > '\u007f') {
                return false;
            }
            if (!('a' <= c && c <= 'z' || 'A' <= c && c <= 'Z' || '0' <= c && c <= '9')) {
                switch (c) {
                    case ' ': 
                    case '\'': 
                    case '(': 
                    case ')': 
                    case '+': 
                    case ',': 
                    case '-': 
                    case '.': 
                    case '/': 
                    case ':': 
                    case '=': 
                    case '?': {
                        break;
                    }
                    default: {
                        return false;
                    }
                }
            }
            n2 = --n;
        }
        return true;
    }

    @Override
    public final void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        arg0.cfr_renamed_11219(arg1, 19, this.cfr_renamed_4);
    }

    public String toString() {
        return this.cfr_renamed_314();
    }

    /*
     * WARNING - void declaration
     */
    public sprpfn(byte[] byArray, boolean bl) {
        void arg0;
        this.cfr_renamed_4 = (byte[])(bl ? sproze.cfr_renamed_158((byte[])arg0) : arg0);
    }

    @Override
    public final int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_4);
    }

    public static sprpfn cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return (sprpfn)cfr_renamed_3.cfr_renamed_11433(arg0, arg1);
    }

    public static sprpfn cfr_renamed_23(Object arg0) {
        sprxgf sprxgf2;
        if (arg0 == null || arg0 instanceof sprpfn) {
            return (sprpfn)arg0;
        }
        if (arg0 instanceof sprco && (sprxgf2 = ((sprco)arg0).cfr_renamed_119()) instanceof sprpfn) {
            return (sprpfn)sprxgf2;
        }
        if (arg0 instanceof byte[]) {
            try {
                return (sprpfn)cfr_renamed_3.cfr_renamed_184((byte[])arg0);
            }
            catch (Exception exception) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprhur.cfr_renamed_9("i>o?h9b7,5~\"c\",9bpk5x\u0019b#x1b3ij,")).append(exception.toString()).toString());
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprdnaa.cfr_renamed_9("t#q*z.qor-w*~;=&soz*i\u0006s<i.s,xu=")).append(arg0.getClass().getName()).toString());
    }

    public static sprpfn cfr_renamed_11295(byte[] arg0) {
        return new sprldn(arg0, false);
    }

    @Override
    public final int cfr_renamed_11213(boolean arg0) {
        return sproen.cfr_renamed_11214(arg0, this.cfr_renamed_4.length);
    }

    public final byte[] cfr_renamed_186() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    @Override
    public final boolean cfr_renamed_11277() {
        return false;
    }
}

