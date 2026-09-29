/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlbn;
import com.spire.presentation.packages.sprlzm;
import com.spire.presentation.packages.sprmah;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqbn;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzpf;
import java.io.IOException;

public abstract class sprpan
extends sprxgf
implements sprml {
    public final byte[] cfr_renamed_3;
    public static final sprqbn cfr_renamed_4 = new sprlbn(sprpan.class, 26);

    @Override
    public final int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_3);
    }

    @Override
    public final void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        arg0.cfr_renamed_11219(arg1, 26, this.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public sprpan(byte[] byArray, boolean bl) {
        void arg0;
        this.cfr_renamed_3 = (byte[])(bl ? sproze.cfr_renamed_158((byte[])arg0) : arg0);
    }

    @Override
    public final boolean cfr_renamed_11277() {
        return false;
    }

    @Override
    public final boolean cfr_renamed_11432(sprxgf arg0) {
        if (!(arg0 instanceof sprpan)) {
            return false;
        }
        sprpan sprpan2 = (sprpan)arg0;
        return sproze.cfr_renamed_92(this.cfr_renamed_3, sprpan2.cfr_renamed_3);
    }

    public sprpan(String string) {
        this.cfr_renamed_3 = sprkoe.cfr_renamed_433(string);
    }

    public static sprpan cfr_renamed_11295(byte[] arg0) {
        return new sprlzm(arg0, false);
    }

    public String toString() {
        return this.cfr_renamed_314();
    }

    public static sprpan cfr_renamed_23(Object arg0) {
        sprxgf sprxgf2;
        if (arg0 == null || arg0 instanceof sprpan) {
            return (sprpan)arg0;
        }
        if (arg0 instanceof sprco && (sprxgf2 = ((sprco)arg0).cfr_renamed_119()) instanceof sprpan) {
            return (sprpan)sprxgf2;
        }
        if (arg0 instanceof byte[]) {
            try {
                return (sprpan)cfr_renamed_4.cfr_renamed_184((byte[])arg0);
            }
            catch (Exception exception) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprmah.cfr_renamed_9("4+2*5,?\"q #7>7q,?e6 %\f?6%$?&4\u007fq")).append(exception.toString()).toString());
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprzpf.cfr_renamed_9("0w5~>z5;6y3~:oyr7;>~-R7h-z7x<!y")).append(arg0.getClass().getName()).toString());
    }

    @Override
    public final String cfr_renamed_314() {
        return sprkoe.cfr_renamed_184(this.cfr_renamed_3);
    }

    public static sprpan cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return (sprpan)cfr_renamed_4.cfr_renamed_11433(arg0, arg1);
    }

    public final byte[] cfr_renamed_186() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    @Override
    public final int cfr_renamed_11213(boolean arg0) {
        return sproen.cfr_renamed_11214(arg0, this.cfr_renamed_3.length);
    }
}

