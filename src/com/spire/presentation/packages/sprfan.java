/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhna;
import com.spire.presentation.packages.sprhwm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqbn;
import com.spire.presentation.packages.sprtks;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;

public abstract class sprfan
extends sprxgf {
    public static final sprqbn cfr_renamed_4 = new sprhwm(sprfan.class, 5);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprfan cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprfan) {
            return (sprfan)arg0;
        }
        if (arg0 == null) {
            return null;
        }
        try {
            return (sprfan)cfr_renamed_4.cfr_renamed_184((byte[])arg0);
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprtks.cfr_renamed_9("ss|~pv5fz2v}{aa``qa2[GY^5tg}x2wkawNO/2")).append(iOException.getMessage()).toString());
        }
    }

    @Override
    public boolean cfr_renamed_11432(sprxgf arg0) {
        return arg0 instanceof sprfan;
    }

    public String toString() {
        return sprhna.cfr_renamed_9("]-_4");
    }

    public static sprfan cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return (sprfan)cfr_renamed_4.cfr_renamed_11433(arg0, arg1);
    }

    @Override
    public int hashCode() {
        return -1;
    }

    public static sprfan cfr_renamed_11295(byte[] arg0) {
        if (0 != arg0.length) {
            throw new IllegalStateException(sprtks.cfr_renamed_9("\u007ft~s}g\u007fpv5\\@^Y2p|v}q{{u5w{qzg{fp`pv"));
        }
        return sprpen.cfr_renamed_4;
    }
}

