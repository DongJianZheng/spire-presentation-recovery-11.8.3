/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkqm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprntm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprws;

public abstract class sprfnm
extends sprqqe {
    public abstract sprlem cfr_renamed_2567();

    public static sprfnm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprfnm) {
            return (sprfnm)arg0;
        }
        if (arg0 != null) {
            sprszm sprszm2 = sprszm.cfr_renamed_23(arg0);
            if (sprlem.cfr_renamed_23(sprszm2.cfr_renamed_85(0)).cfr_renamed_5966(sprws.cfr_renamed_137)) {
                return new sprntm(sprszm2);
            }
            return new sprkqm(sprszm2);
        }
        return null;
    }
}

