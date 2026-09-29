/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprmdl;
import com.spire.presentation.packages.sprocl;
import com.spire.presentation.packages.sprohl;
import com.spire.presentation.packages.sprqyy;
import com.spire.presentation.packages.sprthl;
import com.spire.presentation.packages.sprwil;

public class sprwcf {
    public static sprgf cfr_renamed_2390(String arg0) {
        if (arg0.equals("SHA-1")) {
            return new sprwil();
        }
        if (arg0.equals("SHA-224")) {
            return new sprthl();
        }
        if (arg0.equals("SHA-256")) {
            return new sprohl();
        }
        if (arg0.equals("SHA-384")) {
            return new sprmdl();
        }
        if (arg0.equals("SHA-512")) {
            return new sprocl();
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprqyy.cfr_renamed_9("pRwYfSbRlO`X%Xl[`Oq\u001cdPbSwUqTh\u0006%")).append(arg0).toString());
    }
}

