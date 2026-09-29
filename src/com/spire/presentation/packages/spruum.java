/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdtaa;
import com.spire.presentation.packages.sprkim;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxky;
import com.spire.presentation.packages.sprxpm;
import java.io.IOException;

public class spruum
extends sprxpm {
    public spruum(sprndm arg0) {
        super(arg0);
    }

    public spruum(int arg0, sprqqe arg1) {
        super(arg0, arg1);
    }

    public static spruum cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        if (arg0 != null) {
            if (arg1) {
                return spruum.cfr_renamed_23(arg0.cfr_renamed_8225());
            }
            throw new IllegalArgumentException(sprxky.cfr_renamed_9("{ph1bd|e/sj1ji\u007f}frfe"));
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static spruum cfr_renamed_23(Object arg0) {
        Object object;
        if (arg0 == null || arg0 instanceof spruum) {
            return (spruum)arg0;
        }
        if (arg0 instanceof sprxpm) {
            try {
                return spruum.cfr_renamed_23(((sprxpm)arg0).cfr_renamed_91());
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(iOException.getMessage(), iOException);
            }
        }
        if (arg0 instanceof byte[]) {
            try {
                object = arg0 = sprxgf.cfr_renamed_184((byte[])arg0);
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(sprdtaa.cfr_renamed_9("o\u001fP\u0010J\u0018BQC\u001fE\u001eB\u0018H\u0016\u0006\u0018HQi>d2C\u0003R"));
            }
        } else {
            object = arg0;
        }
        if (object instanceof sprszm) {
            return new spruum(sprndm.cfr_renamed_23(arg0));
        }
        if (arg0 instanceof sprnvm) {
            sprnvm sprnvm2 = sprnvm.cfr_renamed_6501(arg0, 128);
            return new spruum(sprnvm2.cfr_renamed_312(), sprnvm2.cfr_renamed_8225());
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprxky.cfr_renamed_9("F\u007fypcxk1`setle51")).append(arg0.getClass().getName()).toString());
    }

    public spruum(sprkim arg0) {
        super(1, arg0);
    }
}

