/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprb;
import com.spire.presentation.packages.sprblb;
import com.spire.presentation.packages.sprgad;
import com.spire.presentation.packages.sprgva;
import com.spire.presentation.packages.sprmua;
import com.spire.presentation.packages.sprw;
import com.spire.presentation.packages.sprwlb;
import com.spire.presentation.packages.sprzwa;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class sprypb
extends sprwlb {
    private sprmua cfr_renamed_4;

    @Override
    public Collection cfr_renamed_150(sprb arg0) throws sprzwa {
        if (!(arg0 instanceof sprgva)) {
            return Collections.EMPTY_SET;
        }
        sprgva sprgva2 = (sprgva)arg0;
        HashSet hashSet = new HashSet();
        if (sprgva2.cfr_renamed_159()) {
            HashSet hashSet2 = hashSet;
            hashSet2.addAll(this.cfr_renamed_4.cfr_renamed_259(sprgva2));
            return hashSet2;
        }
        HashSet hashSet3 = hashSet;
        hashSet3.addAll(this.cfr_renamed_4.cfr_renamed_259(sprgva2));
        hashSet.addAll(this.cfr_renamed_4.cfr_renamed_217(sprgva2));
        hashSet.addAll(this.cfr_renamed_4.cfr_renamed_233(sprgva2));
        hashSet.addAll(this.cfr_renamed_4.cfr_renamed_267(sprgva2));
        hashSet.addAll(this.cfr_renamed_4.cfr_renamed_250(sprgva2));
        return hashSet3;
    }

    @Override
    public void cfr_renamed_151(sprw arg0) {
        if (!(arg0 instanceof sprblb)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprgad.cfr_renamed_9("{\u0004[\u001e[\u000b^\u0003H\u000bF\u0003]\u0004\u0012\u001aS\u0018S\u0007W\u001eW\u0018AJ_\u001fA\u001e\u0012\bWJS\u0004\u0012\u0003\\\u0019F\u000b\\\tWJ]\f\u0012")).append(sprblb.class.getName()).append(".").toString());
        }
        this.cfr_renamed_4 = new sprmua((sprblb)arg0);
    }
}

