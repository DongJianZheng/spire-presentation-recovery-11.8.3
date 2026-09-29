/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhnn;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sprqbn;
import com.spire.presentation.packages.sprtbn;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxjaa;
import java.io.IOException;

public class sprbxm
extends sprxgf {
    public static final sprbxm cfr_renamed_91;
    public static final sprqbn cfr_renamed_0;
    private static final byte cfr_renamed_1 = 0;
    private static final byte cfr_renamed_2 = -1;
    private final byte cfr_renamed_3;
    public static final sprbxm cfr_renamed_4;

    public static sprbxm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return (sprbxm)cfr_renamed_0.cfr_renamed_11433(arg0, arg1);
    }

    public static sprbxm cfr_renamed_4944(int arg0) {
        if (arg0 != 0) {
            return cfr_renamed_91;
        }
        return cfr_renamed_4;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static sprbxm cfr_renamed_11295(byte[] arg0) {
        if (arg0.length != 1) {
            throw new IllegalArgumentException(sprhnn.cfr_renamed_9("!S,P&]-<\u0015}\u000fi\u0006<\u0010t\fi\u000fxCt\u0002j\u0006<R<\u0001e\u0017yCu\r<\nh"));
        }
        byte by = arg0[0];
        switch (by) {
            case 0: {
                return cfr_renamed_4;
            }
            case -1: {
                return cfr_renamed_91;
            }
        }
        return new sprbxm(by);
    }

    public String toString() {
        if (this.cfr_renamed_587()) {
            return sprxjaa.cfr_renamed_9("?\u001d>\n");
        }
        return sprhnn.cfr_renamed_9("Z\"P0Y");
    }

    @Override
    public boolean cfr_renamed_11432(sprxgf arg0) {
        if (!(arg0 instanceof sprbxm)) {
            return false;
        }
        sprbxm sprbxm2 = (sprbxm)arg0;
        return this.cfr_renamed_587() == sprbxm2.cfr_renamed_587();
    }

    @Override
    public int cfr_renamed_11213(boolean arg0) {
        return sproen.cfr_renamed_11214(arg0, 1);
    }

    @Override
    public int hashCode() {
        if (this.cfr_renamed_587()) {
            return 1;
        }
        return 0;
    }

    public static sprbxm cfr_renamed_655(boolean arg0) {
        if (arg0) {
            return cfr_renamed_91;
        }
        return cfr_renamed_4;
    }

    private /* synthetic */ sprbxm(byte by) {
        this.cfr_renamed_3 = by;
    }

    public boolean cfr_renamed_587() {
        return this.cfr_renamed_3 != 0;
    }

    @Override
    public void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        arg0.cfr_renamed_11496(arg1, 1, this.cfr_renamed_3);
    }

    @Override
    public sprxgf cfr_renamed_4615() {
        if (this.cfr_renamed_587()) {
            return cfr_renamed_91;
        }
        return cfr_renamed_4;
    }

    static {
        cfr_renamed_0 = new sprtbn(sprbxm.class, 1);
        cfr_renamed_4 = new sprbxm(0);
        cfr_renamed_91 = new sprbxm(-1);
    }

    @Override
    public boolean cfr_renamed_11277() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprbxm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprbxm) {
            return (sprbxm)arg0;
        }
        if (!(arg0 instanceof byte[])) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprhnn.cfr_renamed_9("u\u000fp\u0006{\u0002pCs\u0001v\u0006\u007f\u0017<\nrC{\u0006h*r\u0010h\u0002r\u0000yY<")).append(arg0.getClass().getName()).toString());
        }
        byte[] byArray = (byte[])arg0;
        try {
            return (sprbxm)cfr_renamed_0.cfr_renamed_184(byArray);
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprxjaa.cfr_renamed_9(")\n&\u0007*\u000fo\u001f K,\u0004!\u0018;\u0019:\b;K-\u0004 \u0007*\n!K)\u0019 \u0006o\t6\u001f*0\u0012Qo")).append(iOException.getMessage()).toString());
        }
    }
}

