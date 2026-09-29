/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraqe;
import com.spire.presentation.packages.sprkim;
import com.spire.presentation.packages.sprkyz;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxpm;
import java.io.IOException;

public class sprvtm
extends sprxpm {
    public static sprvtm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        if (arg0 != null) {
            if (arg1) {
                return sprvtm.cfr_renamed_23(arg0.cfr_renamed_8225());
            }
            throw new IllegalArgumentException(spraqe.cfr_renamed_9("}In\bd]z\\)Jl\blPyD`K`\\"));
        }
        return null;
    }

    public sprvtm(sprkim arg0) {
        super(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprvtm cfr_renamed_23(Object arg0) {
        Object object;
        if (arg0 == null || arg0 instanceof sprvtm) {
            return (sprvtm)arg0;
        }
        if (arg0 instanceof sprxpm) {
            try {
                return sprvtm.cfr_renamed_23(((sprxpm)arg0).cfr_renamed_91());
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
                throw new IllegalArgumentException(sprkyz.cfr_renamed_9("\u0002.=!')/`..(//)%'k)%`\b%94\n.%\u0003$.?%%4"));
            }
        } else {
            object = arg0;
        }
        if (object instanceof sprszm) {
            return new sprvtm(sprndm.cfr_renamed_23(arg0));
        }
        if (arg0 instanceof sprnvm) {
            sprnvm sprnvm2 = sprnvm.cfr_renamed_6501(arg0, 128);
            return new sprvtm(sprnvm2.cfr_renamed_312(), sprnvm2.cfr_renamed_8225());
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, spraqe.cfr_renamed_9("@F\u007fIeAm\bfJcMj\\3\b")).append(arg0.getClass().getName()).toString());
    }

    public sprvtm(int arg0, sprqqe arg1) {
        super(arg0, arg1);
    }

    public sprvtm(sprndm arg0) {
        super(arg0);
    }
}

