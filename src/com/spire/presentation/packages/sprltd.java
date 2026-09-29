/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprb;
import com.spire.presentation.packages.spro;
import java.util.ArrayList;
import java.util.Collection;

public class sprltd
implements spro {
    private Collection cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprltd(Collection collection) {
        void arg0;
        sprltd sprltd2 = this;
        sprltd2.cfr_renamed_4 = new ArrayList(arg0);
    }

    @Override
    public Collection cfr_renamed_152(sprb arg0) {
        if (arg0 == null) {
            return new ArrayList(this.cfr_renamed_4);
        }
        ArrayList arrayList = new ArrayList();
        for (Object e : this.cfr_renamed_4) {
            if (!arg0.cfr_renamed_132(e)) continue;
            arrayList.add(e);
        }
        return arrayList;
    }
}

