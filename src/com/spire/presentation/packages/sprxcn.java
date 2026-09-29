/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfar;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sprogn;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqbn;
import com.spire.presentation.packages.sprsey;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzdn;
import java.io.IOException;

public abstract class sprxcn
extends sprxgf
implements sprml {
    public static final sprqbn cfr_renamed_3 = new sprzdn(sprxcn.class, 21);
    public final byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprxcn(byte[] byArray, boolean bl) {
        void arg0;
        this.cfr_renamed_4 = (byte[])(bl ? sproze.cfr_renamed_158((byte[])arg0) : arg0);
    }

    @Override
    public final void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        arg0.cfr_renamed_11219(arg1, 21, this.cfr_renamed_4);
    }

    @Override
    public final String cfr_renamed_314() {
        return sprkoe.cfr_renamed_184(this.cfr_renamed_4);
    }

    public static sprxcn cfr_renamed_11295(byte[] arg0) {
        return new sprogn(arg0, false);
    }

    @Override
    public final boolean cfr_renamed_11277() {
        return false;
    }

    @Override
    public final int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_4);
    }

    public static sprxcn cfr_renamed_23(Object arg0) {
        sprxgf sprxgf2;
        if (arg0 == null || arg0 instanceof sprxcn) {
            return (sprxcn)arg0;
        }
        if (arg0 instanceof sprco && (sprxgf2 = ((sprco)arg0).cfr_renamed_119()) instanceof sprxcn) {
            return (sprxcn)sprxgf2;
        }
        if (arg0 instanceof byte[]) {
            try {
                return (sprxcn)cfr_renamed_3.cfr_renamed_184((byte[])arg0);
            }
            catch (Exception exception) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprsey.cfr_renamed_9("-@+A,G&IhK:\\'\\hG&\u000e/K<g&]<O&M-\u0014h")).append(exception.toString()).toString());
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprfar.cfr_renamed_9("\u000eB\u000bK\u0000O\u000b\u000e\bL\rK\u0004ZGG\t\u000e\u0000K\u0013g\t]\u0013O\tM\u0002\u0014G")).append(arg0.getClass().getName()).toString());
    }

    public final byte[] cfr_renamed_186() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    @Override
    public final boolean cfr_renamed_11432(sprxgf arg0) {
        if (!(arg0 instanceof sprxcn)) {
            return false;
        }
        sprxcn sprxcn2 = (sprxcn)arg0;
        return sproze.cfr_renamed_92(this.cfr_renamed_4, sprxcn2.cfr_renamed_4);
    }

    public static sprxcn cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return (sprxcn)cfr_renamed_3.cfr_renamed_11433(arg0, arg1);
    }

    @Override
    public final int cfr_renamed_11213(boolean arg0) {
        return sproen.cfr_renamed_11214(arg0, this.cfr_renamed_4.length);
    }
}

