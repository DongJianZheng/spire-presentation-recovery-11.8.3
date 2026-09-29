/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprffea;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpmfa;
import com.spire.presentation.packages.sprqbn;
import com.spire.presentation.packages.sprwvm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.spryen;
import java.io.IOException;

public abstract class sprwzm
extends sprxgf
implements sprml {
    public final byte[] cfr_renamed_3;
    public static final sprqbn cfr_renamed_4 = new sprwvm(sprwzm.class, 27);

    public static sprwzm cfr_renamed_23(Object arg0) {
        sprxgf sprxgf2;
        if (arg0 == null || arg0 instanceof sprwzm) {
            return (sprwzm)arg0;
        }
        if (arg0 instanceof sprco && (sprxgf2 = ((sprco)arg0).cfr_renamed_119()) instanceof sprwzm) {
            return (sprwzm)sprxgf2;
        }
        if (arg0 instanceof byte[]) {
            try {
                return (sprwzm)cfr_renamed_4.cfr_renamed_184((byte[])arg0);
            }
            catch (Exception exception) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprffea.cfr_renamed_9("]B[C\\EVK\u0018IJ^W^\u0018EV\f_ILeV_LMVO]\u0016\u0018")).append(exception.toString()).toString());
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprpmfa.cfr_renamed_9("0d5m>i5(6j3m:|ya7(>m-A7{-i7k<2y")).append(arg0.getClass().getName()).toString());
    }

    public final byte[] cfr_renamed_186() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    public static sprwzm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return (sprwzm)cfr_renamed_4.cfr_renamed_11433(arg0, arg1);
    }

    public String toString() {
        return this.cfr_renamed_314();
    }

    @Override
    public final boolean cfr_renamed_11277() {
        return false;
    }

    @Override
    public final String cfr_renamed_314() {
        return sprkoe.cfr_renamed_184(this.cfr_renamed_3);
    }

    @Override
    public final int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_3);
    }

    public static sprwzm cfr_renamed_11295(byte[] arg0) {
        return new spryen(arg0, false);
    }

    @Override
    public final int cfr_renamed_11213(boolean arg0) {
        return sproen.cfr_renamed_11214(arg0, this.cfr_renamed_3.length);
    }

    @Override
    public final void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        arg0.cfr_renamed_11219(arg1, 27, this.cfr_renamed_3);
    }

    public sprwzm(String string) {
        this.cfr_renamed_3 = sprkoe.cfr_renamed_433(string);
    }

    /*
     * WARNING - void declaration
     */
    public sprwzm(byte[] byArray, boolean bl) {
        void arg0;
        this.cfr_renamed_3 = (byte[])(bl ? sproze.cfr_renamed_158((byte[])arg0) : arg0);
    }

    @Override
    public final boolean cfr_renamed_11432(sprxgf arg0) {
        if (!(arg0 instanceof sprwzm)) {
            return false;
        }
        sprwzm sprwzm2 = (sprwzm)arg0;
        return sproze.cfr_renamed_92(this.cfr_renamed_3, sprwzm2.cfr_renamed_3);
    }
}

