/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprale;
import com.spire.presentation.packages.sprcqe;
import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprine;
import com.spire.presentation.packages.sprrai;
import com.spire.presentation.packages.sprrze;
import com.spire.presentation.packages.sprsvh;
import com.spire.presentation.packages.sprxi;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class sprlth
extends sprsvh {
    private sprale cfr_renamed_4;

    @Override
    public Collection cfr_renamed_5028(sprhd arg0) throws sprine {
        if (!(arg0 instanceof sprcqe)) {
            return Collections.EMPTY_SET;
        }
        sprcqe sprcqe2 = (sprcqe)arg0;
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.cfr_renamed_4.cfr_renamed_5055(sprcqe2));
        return hashSet;
    }

    @Override
    public void cfr_renamed_5027(sprxi arg0) {
        if (!(arg0 instanceof sprrai)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprrze.cfr_renamed_9("fXFBFWC_UW[_@X\u000fFNDN[JBJD\\\u0016BC\\B\u000fTJ\u0016NX\u000f_AE[WAUJ\u0016@P\u000f")).append(sprrai.class.getName()).append(".").toString());
        }
        this.cfr_renamed_4 = new sprale((sprrai)arg0);
    }
}

