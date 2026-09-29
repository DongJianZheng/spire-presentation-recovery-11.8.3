/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraen;
import com.spire.presentation.packages.sprcep;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpnia;
import com.spire.presentation.packages.sprqbn;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzym;
import java.io.IOException;

public abstract class sprkgn
extends sprxgf
implements sprml {
    public final byte[] cfr_renamed_3;
    public static final sprqbn cfr_renamed_4 = new sprzym(sprkgn.class, 12);

    @Override
    public final int cfr_renamed_11213(boolean arg0) {
        return sproen.cfr_renamed_11214(arg0, this.cfr_renamed_3.length);
    }

    public sprkgn(String arg0) {
        this(sprkoe.cfr_renamed_431(arg0), false);
    }

    public static sprkgn cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return (sprkgn)cfr_renamed_4.cfr_renamed_11433(arg0, arg1);
    }

    @Override
    public final boolean cfr_renamed_11277() {
        return false;
    }

    @Override
    public final void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        arg0.cfr_renamed_11219(arg1, 12, this.cfr_renamed_3);
    }

    @Override
    public final String cfr_renamed_314() {
        return sprkoe.cfr_renamed_427(this.cfr_renamed_3);
    }

    public static sprkgn cfr_renamed_23(Object arg0) {
        sprxgf sprxgf2;
        if (arg0 == null || arg0 instanceof sprkgn) {
            return (sprkgn)arg0;
        }
        if (arg0 instanceof sprco && (sprxgf2 = ((sprco)arg0).cfr_renamed_119()) instanceof sprkgn) {
            return (sprkgn)sprxgf2;
        }
        if (arg0 instanceof byte[]) {
            try {
                return (sprkgn)cfr_renamed_4.cfr_renamed_184((byte[])arg0);
            }
            catch (Exception exception) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprpnia.cfr_renamed_9("o'i&n d.*,x;e;* dim,~\u0000d:~(d*os*")).append(exception.toString()).toString());
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprcep.cfr_renamed_9("}cxjsnx/{m~jw{4fz/sj`Fz|`nzlq54")).append(arg0.getClass().getName()).toString());
    }

    @Override
    public final int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_3);
    }

    @Override
    public final boolean cfr_renamed_11432(sprxgf arg0) {
        if (!(arg0 instanceof sprkgn)) {
            return false;
        }
        sprkgn sprkgn2 = (sprkgn)arg0;
        return sproze.cfr_renamed_92(this.cfr_renamed_3, sprkgn2.cfr_renamed_3);
    }

    public static sprkgn cfr_renamed_11295(byte[] arg0) {
        return new spraen(arg0, false);
    }

    public String toString() {
        return this.cfr_renamed_314();
    }

    /*
     * WARNING - void declaration
     */
    public sprkgn(byte[] byArray, boolean bl) {
        void arg0;
        this.cfr_renamed_3 = (byte[])(bl ? sproze.cfr_renamed_158((byte[])arg0) : arg0);
    }
}

