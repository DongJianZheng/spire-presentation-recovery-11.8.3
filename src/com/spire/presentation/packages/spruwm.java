/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprjmb;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprmen;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprppba;
import com.spire.presentation.packages.sprqbn;
import com.spire.presentation.packages.sprvdn;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;

public abstract class spruwm
extends sprxgf
implements sprml {
    public static final sprqbn cfr_renamed_3 = new sprmen(spruwm.class, 25);
    public final byte[] cfr_renamed_4;

    @Override
    public final int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_4);
    }

    @Override
    public final boolean cfr_renamed_11432(sprxgf arg0) {
        if (!(arg0 instanceof spruwm)) {
            return false;
        }
        spruwm spruwm2 = (spruwm)arg0;
        return sproze.cfr_renamed_92(this.cfr_renamed_4, spruwm2.cfr_renamed_4);
    }

    public static spruwm cfr_renamed_23(Object arg0) {
        sprxgf sprxgf2;
        if (arg0 == null || arg0 instanceof spruwm) {
            return (spruwm)arg0;
        }
        if (arg0 instanceof sprco && (sprxgf2 = ((sprco)arg0).cfr_renamed_119()) instanceof spruwm) {
            return (spruwm)sprxgf2;
        }
        if (arg0 instanceof byte[]) {
            try {
                return (spruwm)cfr_renamed_3.cfr_renamed_184((byte[])arg0);
            }
            catch (Exception exception) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprjmb.cfr_renamed_9("\u0001\u0017\u0007\u0016\u0000\u0010\n\u001eD\u001c\u0016\u000b\u000b\u000bD\u0010\nY\u0003\u001c\u00100\n\n\u0010\u0018\n\u001a\u0001CD")).append(exception.toString()).toString());
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprppba.cfr_renamed_9("},x%s!x`{\"~%w44)z`s%`\tz3`!z#qz4")).append(arg0.getClass().getName()).toString());
    }

    @Override
    public final boolean cfr_renamed_11277() {
        return false;
    }

    @Override
    public final String cfr_renamed_314() {
        return sprkoe.cfr_renamed_184(this.cfr_renamed_4);
    }

    @Override
    public final void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        arg0.cfr_renamed_11219(arg1, 25, this.cfr_renamed_4);
    }

    @Override
    public final int cfr_renamed_11213(boolean arg0) {
        return sproen.cfr_renamed_11214(arg0, this.cfr_renamed_4.length);
    }

    /*
     * WARNING - void declaration
     */
    public spruwm(byte[] byArray, boolean bl) {
        void arg1;
        void arg0;
        if (null == arg0) {
            throw new NullPointerException(sprjmb.cfr_renamed_9("C\u001a\u000b\u0017\u0010\u001c\n\r\u0017^D\u001a\u0005\u0017\n\u0016\u0010Y\u0006\u001cD\u0017\u0011\u0015\b"));
        }
        this.cfr_renamed_4 = (byte[])(arg1 != false ? sproze.cfr_renamed_158((byte[])arg0) : arg0);
    }

    public static spruwm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return (spruwm)cfr_renamed_3.cfr_renamed_11433(arg0, arg1);
    }

    public static spruwm cfr_renamed_11295(byte[] arg0) {
        return new sprvdn(arg0, false);
    }

    public final byte[] cfr_renamed_186() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }
}

