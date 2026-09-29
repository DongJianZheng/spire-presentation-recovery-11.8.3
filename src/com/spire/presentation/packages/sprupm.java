/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprben;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprnrm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqbn;
import com.spire.presentation.packages.sprtcea;
import com.spire.presentation.packages.sprugk;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;

public abstract class sprupm
extends sprxgf
implements sprml {
    public static final sprqbn cfr_renamed_3 = new sprben(sprupm.class, 22);
    public final byte[] cfr_renamed_4;

    public final byte[] cfr_renamed_186() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    @Override
    public final void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        arg0.cfr_renamed_11219(arg1, 22, this.cfr_renamed_4);
    }

    @Override
    public final int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_4);
    }

    public static boolean cfr_renamed_4794(String arg0) {
        int n;
        int n2 = n = arg0.length() - 1;
        while (n2 >= 0) {
            if (arg0.charAt(n) > '\u007f') {
                return false;
            }
            n2 = --n;
        }
        return true;
    }

    public static sprupm cfr_renamed_11295(byte[] arg0) {
        return new sprnrm(arg0, false);
    }

    @Override
    public final boolean cfr_renamed_11432(sprxgf arg0) {
        if (!(arg0 instanceof sprupm)) {
            return false;
        }
        sprupm sprupm2 = (sprupm)arg0;
        return sproze.cfr_renamed_92(this.cfr_renamed_4, sprupm2.cfr_renamed_4);
    }

    public String toString() {
        return this.cfr_renamed_314();
    }

    /*
     * WARNING - void declaration
     */
    public sprupm(byte[] byArray, boolean bl) {
        void arg0;
        this.cfr_renamed_4 = (byte[])(bl ? sproze.cfr_renamed_158((byte[])arg0) : arg0);
    }

    @Override
    public final boolean cfr_renamed_11277() {
        return false;
    }

    public static sprupm cfr_renamed_23(Object arg0) {
        sprxgf sprxgf2;
        if (arg0 == null || arg0 instanceof sprupm) {
            return (sprupm)arg0;
        }
        if (arg0 instanceof sprco && (sprxgf2 = ((sprco)arg0).cfr_renamed_119()) instanceof sprupm) {
            return (sprupm)sprxgf2;
        }
        if (arg0 instanceof byte[]) {
            try {
                return (sprupm)cfr_renamed_3.cfr_renamed_184((byte[])arg0);
            }
            catch (Exception exception) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprugk.cfr_renamed_9("\u000f*\t+\u000e-\u0004#J!\u00186\u00056J-\u0004d\r!\u001e\r\u00047\u001e%\u0004'\u000f~J")).append(exception.toString()).toString());
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprtcea.cfr_renamed_9(">x;q0u;48v=q4`w}940q#]9g#u9w2.w")).append(arg0.getClass().getName()).toString());
    }

    @Override
    public final int cfr_renamed_11213(boolean arg0) {
        return sproen.cfr_renamed_11214(arg0, this.cfr_renamed_4.length);
    }

    @Override
    public final String cfr_renamed_314() {
        return sprkoe.cfr_renamed_184(this.cfr_renamed_4);
    }

    public static sprupm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return (sprupm)cfr_renamed_3.cfr_renamed_11433(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprupm(String string, boolean bl) {
        void arg0;
        void arg1;
        if (string == null) {
            throw new NullPointerException(sprugk.cfr_renamed_9("M7\u001e6\u0003*\rcJ'\u000b*\u0004+\u001ed\b!J*\u001f(\u0006"));
        }
        if (arg1 != false && !sprupm.cfr_renamed_4794((String)arg0)) {
            throw new IllegalArgumentException(sprtcea.cfr_renamed_9("3$`%}9sp44{9`6}9gw};x2s6xww?u%u4`2f$"));
        }
        this.cfr_renamed_4 = sprkoe.cfr_renamed_433((String)arg0);
    }
}

