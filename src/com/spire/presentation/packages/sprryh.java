/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprale;
import com.spire.presentation.packages.sprcqe;
import com.spire.presentation.packages.sprcse;
import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprhve;
import com.spire.presentation.packages.sprine;
import com.spire.presentation.packages.sprocaa;
import com.spire.presentation.packages.sprrai;
import com.spire.presentation.packages.sprsvh;
import com.spire.presentation.packages.sprxi;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class sprryh
extends sprsvh {
    private sprale cfr_renamed_4;

    @Override
    public void cfr_renamed_5027(sprxi arg0) {
        if (!(arg0 instanceof sprrai)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprocaa.cfr_renamed_9("NYnCnVk^}Vs^hY'GfEfZbCbEt\u0017jBtC'Ub\u0017fY'^iDsViTb\u0017hQ'")).append(sprrai.class.getName()).append(".").toString());
        }
        this.cfr_renamed_4 = new sprale((sprrai)arg0);
    }

    @Override
    public Collection cfr_renamed_5028(sprhd arg0) throws sprine {
        if (!(arg0 instanceof sprhve)) {
            return Collections.EMPTY_SET;
        }
        sprhve sprhve2 = (sprhve)arg0;
        HashSet hashSet = new HashSet();
        if (sprhve2.getBasicConstraints() > 0) {
            HashSet hashSet2 = hashSet;
            hashSet.addAll(this.cfr_renamed_4.cfr_renamed_5061(sprhve2));
            hashSet2.addAll(this.cfr_renamed_9055(sprhve2));
            return hashSet2;
        }
        if (sprhve2.getBasicConstraints() == -2) {
            HashSet hashSet3 = hashSet;
            hashSet3.addAll(this.cfr_renamed_4.cfr_renamed_5051(sprhve2));
            return hashSet3;
        }
        HashSet hashSet4 = hashSet;
        hashSet4.addAll(this.cfr_renamed_4.cfr_renamed_5051(sprhve2));
        hashSet.addAll(this.cfr_renamed_4.cfr_renamed_5061(sprhve2));
        hashSet.addAll(this.cfr_renamed_9055(sprhve2));
        return hashSet4;
    }

    private /* synthetic */ Collection cfr_renamed_9055(sprhve arg0) throws sprine {
        HashSet hashSet = new HashSet();
        sprcqe sprcqe2 = new sprcqe();
        sprcqe2.cfr_renamed_5035(arg0);
        sprcqe2.cfr_renamed_5034(new sprhve());
        HashSet hashSet2 = new HashSet(this.cfr_renamed_4.cfr_renamed_5055(sprcqe2));
        HashSet<X509Certificate> hashSet3 = new HashSet<X509Certificate>();
        HashSet<X509Certificate> hashSet4 = new HashSet<X509Certificate>();
        for (sprcse sprcse2 : hashSet2) {
            if (sprcse2.cfr_renamed_177() != null) {
                hashSet3.add(sprcse2.cfr_renamed_177());
            }
            if (sprcse2.cfr_renamed_178() == null) continue;
            hashSet4.add(sprcse2.cfr_renamed_178());
        }
        HashSet hashSet5 = hashSet;
        hashSet5.addAll(hashSet3);
        hashSet.addAll(hashSet4);
        return hashSet5;
    }
}

