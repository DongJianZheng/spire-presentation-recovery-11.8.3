/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprb;
import com.spire.presentation.packages.sprblb;
import com.spire.presentation.packages.sprkna;
import com.spire.presentation.packages.sprmua;
import com.spire.presentation.packages.sprw;
import com.spire.presentation.packages.sprwlb;
import com.spire.presentation.packages.sprwxca;
import com.spire.presentation.packages.sprzwa;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class spryob
extends sprwlb {
    private sprmua cfr_renamed_4;

    @Override
    public Collection cfr_renamed_150(sprb arg0) throws sprzwa {
        if (!(arg0 instanceof sprkna)) {
            return Collections.EMPTY_SET;
        }
        sprkna sprkna2 = (sprkna)arg0;
        HashSet hashSet = new HashSet();
        boolean bl = hashSet.addAll(this.cfr_renamed_4.cfr_renamed_263(sprkna2));
        HashSet hashSet2 = hashSet;
        hashSet.addAll(this.cfr_renamed_4.cfr_renamed_255(sprkna2));
        hashSet2.addAll(this.cfr_renamed_4.cfr_renamed_241(sprkna2));
        return hashSet2;
    }

    @Override
    public void cfr_renamed_151(sprw arg0) {
        if (!(arg0 instanceof sprblb)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprwxca.cfr_renamed_9("=:\u001d \u001d5\u0018=\u000e5\u0000=\u001b:T$\u0015&\u00159\u0011 \u0011&\u0007t\u0019!\u0007 T6\u0011t\u0015:T=\u001a'\u00005\u001a7\u0011t\u001b2T")).append(sprblb.class.getName()).append(".").toString());
        }
        this.cfr_renamed_4 = new sprmua((sprblb)arg0);
    }
}

