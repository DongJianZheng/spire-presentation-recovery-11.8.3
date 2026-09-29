/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.collections.CommentList;
import com.spire.presentation.packages.sprava;
import com.spire.presentation.packages.sprb;
import com.spire.presentation.packages.sprblb;
import com.spire.presentation.packages.sprcwa;
import com.spire.presentation.packages.sprgma;
import com.spire.presentation.packages.sprmua;
import com.spire.presentation.packages.sprw;
import com.spire.presentation.packages.sprwlb;
import com.spire.presentation.packages.sprzwa;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class sprhpb
extends sprwlb {
    private sprmua cfr_renamed_4;

    @Override
    public Collection cfr_renamed_150(sprb arg0) throws sprzwa {
        if (!(arg0 instanceof sprgma)) {
            return Collections.EMPTY_SET;
        }
        sprgma sprgma2 = (sprgma)arg0;
        HashSet hashSet = new HashSet();
        if (sprgma2.getBasicConstraints() > 0) {
            HashSet hashSet2 = hashSet;
            hashSet.addAll(this.cfr_renamed_4.cfr_renamed_210(sprgma2));
            hashSet2.addAll(this.cfr_renamed_2119(sprgma2));
            return hashSet2;
        }
        if (sprgma2.getBasicConstraints() == -2) {
            HashSet hashSet3 = hashSet;
            hashSet3.addAll(this.cfr_renamed_4.cfr_renamed_227(sprgma2));
            return hashSet3;
        }
        HashSet hashSet4 = hashSet;
        hashSet4.addAll(this.cfr_renamed_4.cfr_renamed_227(sprgma2));
        hashSet.addAll(this.cfr_renamed_4.cfr_renamed_210(sprgma2));
        hashSet.addAll(this.cfr_renamed_2119(sprgma2));
        return hashSet4;
    }

    private /* synthetic */ Collection cfr_renamed_2119(sprgma arg0) throws sprzwa {
        HashSet hashSet = new HashSet();
        sprcwa sprcwa2 = new sprcwa();
        sprcwa2.cfr_renamed_175(arg0);
        sprcwa2.cfr_renamed_176(new sprgma());
        HashSet hashSet2 = new HashSet(this.cfr_renamed_4.cfr_renamed_245(sprcwa2));
        HashSet<X509Certificate> hashSet3 = new HashSet<X509Certificate>();
        HashSet<X509Certificate> hashSet4 = new HashSet<X509Certificate>();
        for (sprava sprava2 : hashSet2) {
            if (sprava2.cfr_renamed_177() != null) {
                hashSet3.add(sprava2.cfr_renamed_177());
            }
            if (sprava2.cfr_renamed_178() == null) continue;
            hashSet4.add(sprava2.cfr_renamed_178());
        }
        HashSet hashSet5 = hashSet;
        hashSet5.addAll(hashSet3);
        hashSet.addAll(hashSet4);
        return hashSet5;
    }

    @Override
    public void cfr_renamed_151(sprw arg0) {
        if (!(arg0 instanceof sprblb)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, CommentList.cfr_renamed_9("\u0007\f'\u0016'\u0003\"\u000b4\u0003:\u000b!\fn\u0012/\u0010/\u000f+\u0016+\u0010=B#\u0017=\u0016n\u0000+B/\fn\u000b \u0011:\u0003 \u0001+B!\u0004n")).append(sprblb.class.getName()).append(".").toString());
        }
        this.cfr_renamed_4 = new sprmua((sprblb)arg0);
    }
}

