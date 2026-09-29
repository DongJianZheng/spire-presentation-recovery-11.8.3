/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprale;
import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprine;
import com.spire.presentation.packages.sprrai;
import com.spire.presentation.packages.sprrme;
import com.spire.presentation.packages.sprsqr;
import com.spire.presentation.packages.sprsvh;
import com.spire.presentation.packages.sprxi;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class sprvqh
extends sprsvh {
    private sprale cfr_renamed_4;

    @Override
    public void cfr_renamed_5027(sprxi arg0) {
        if (!(arg0 instanceof sprrai)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprsqr.cfr_renamed_9("W\fw\u0016w\u0003r\u000bd\u0003j\u000bq\f>\u0012\u007f\u0010\u007f\u000f{\u0016{\u0010mBs\u0017m\u0016>\u0000{B\u007f\f>\u000bp\u0011j\u0003p\u0001{Bq\u0004>")).append(sprrai.class.getName()).append(".").toString());
        }
        this.cfr_renamed_4 = new sprale((sprrai)arg0);
    }

    @Override
    public Collection cfr_renamed_5028(sprhd arg0) throws sprine {
        if (!(arg0 instanceof sprrme)) {
            return Collections.EMPTY_SET;
        }
        sprrme sprrme2 = (sprrme)arg0;
        HashSet hashSet = new HashSet();
        if (sprrme2.cfr_renamed_159()) {
            HashSet hashSet2 = hashSet;
            hashSet2.addAll(this.cfr_renamed_4.cfr_renamed_5054(sprrme2));
            return hashSet2;
        }
        HashSet hashSet3 = hashSet;
        hashSet3.addAll(this.cfr_renamed_4.cfr_renamed_5054(sprrme2));
        hashSet.addAll(this.cfr_renamed_4.cfr_renamed_5058(sprrme2));
        hashSet.addAll(this.cfr_renamed_4.cfr_renamed_5060(sprrme2));
        hashSet.addAll(this.cfr_renamed_4.cfr_renamed_5049(sprrme2));
        hashSet.addAll(this.cfr_renamed_4.cfr_renamed_5043(sprrme2));
        return hashSet3;
    }
}

