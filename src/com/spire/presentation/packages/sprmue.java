/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprlne;
import com.spire.presentation.packages.sprtve;
import com.spire.presentation.packages.spryne;

public class sprmue
extends sprlne {
    public sprmue(byte[] arg0) {
        sprtve[] sprtveArray = new sprtve[1];
        sprtveArray[0] = new spryne(arg0);
        super(sprtveArray);
    }

    public sprmue(String arg0) {
        sprtve[] sprtveArray = new sprtve[1];
        sprtveArray[0] = new spryne(sprfqe.cfr_renamed_488(arg0));
        super(sprtveArray);
    }
}

