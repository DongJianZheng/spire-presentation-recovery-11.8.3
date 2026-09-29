/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spregn;
import com.spire.presentation.packages.sprfiz;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprmfaa;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqbn;
import com.spire.presentation.packages.sprscn;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;

public abstract class sprwfn
extends sprxgf
implements sprml {
    public final byte[] cfr_renamed_3;
    public static final sprqbn cfr_renamed_4 = new spregn(sprwfn.class, 20);

    /*
     * WARNING - void declaration
     */
    public sprwfn(byte[] byArray, boolean bl) {
        void arg0;
        this.cfr_renamed_3 = (byte[])(bl ? sproze.cfr_renamed_158((byte[])arg0) : arg0);
    }

    public static sprwfn cfr_renamed_23(Object arg0) {
        sprxgf sprxgf2;
        if (arg0 == null || arg0 instanceof sprwfn) {
            return (sprwfn)arg0;
        }
        if (arg0 instanceof sprco && (sprxgf2 = ((sprco)arg0).cfr_renamed_119()) instanceof sprwfn) {
            return (sprwfn)sprxgf2;
        }
        if (arg0 instanceof byte[]) {
            try {
                return (sprwfn)cfr_renamed_4.cfr_renamed_184((byte[])arg0);
            }
            catch (Exception exception) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprmfaa.cfr_renamed_9("t~r\u007fuy\u007fw1ucb~b1y\u007f0vueY\u007fceq\u007fst*1")).append(exception.toString()).toString());
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprfiz.cfr_renamed_9("\u0007\t\u0002\u0000\t\u0004\u0002E\u0001\u0007\u0004\u0000\r\u0011N\f\u0000E\t\u0000\u001a,\u0000\u0016\u001a\u0004\u0000\u0006\u000b_N")).append(arg0.getClass().getName()).toString());
    }

    @Override
    public final String cfr_renamed_314() {
        return sprkoe.cfr_renamed_184(this.cfr_renamed_3);
    }

    @Override
    public final int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_3);
    }

    @Override
    public final void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        arg0.cfr_renamed_11219(arg1, 20, this.cfr_renamed_3);
    }

    @Override
    public final boolean cfr_renamed_11277() {
        return false;
    }

    public static sprwfn cfr_renamed_11295(byte[] arg0) {
        return new sprscn(arg0, false);
    }

    public final byte[] cfr_renamed_186() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    public static sprwfn cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return (sprwfn)cfr_renamed_4.cfr_renamed_11433(arg0, arg1);
    }

    @Override
    public final boolean cfr_renamed_11432(sprxgf arg0) {
        if (!(arg0 instanceof sprwfn)) {
            return false;
        }
        sprwfn sprwfn2 = (sprwfn)arg0;
        return sproze.cfr_renamed_92(this.cfr_renamed_3, sprwfn2.cfr_renamed_3);
    }

    @Override
    public final int cfr_renamed_11213(boolean arg0) {
        return sproen.cfr_renamed_11214(arg0, this.cfr_renamed_3.length);
    }

    public String toString() {
        return this.cfr_renamed_314();
    }

    public sprwfn(String string) {
        this.cfr_renamed_3 = sprkoe.cfr_renamed_433(string);
    }
}

