/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprale;
import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprine;
import com.spire.presentation.packages.sprrai;
import com.spire.presentation.packages.sprsvh;
import com.spire.presentation.packages.sprtaz;
import com.spire.presentation.packages.sprxi;
import com.spire.presentation.packages.spryue;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class sprxth
extends sprsvh {
    private sprale cfr_renamed_4;

    @Override
    public Collection cfr_renamed_5028(sprhd arg0) throws sprine {
        if (!(arg0 instanceof spryue)) {
            return Collections.EMPTY_SET;
        }
        spryue spryue2 = (spryue)arg0;
        HashSet hashSet = new HashSet();
        boolean bl = hashSet.addAll(this.cfr_renamed_4.cfr_renamed_5046(spryue2));
        HashSet hashSet2 = hashSet;
        hashSet.addAll(this.cfr_renamed_4.cfr_renamed_5050(spryue2));
        hashSet2.addAll(this.cfr_renamed_4.cfr_renamed_5059(spryue2));
        return hashSet2;
    }

    @Override
    public void cfr_renamed_5027(sprxi arg0) {
        if (!(arg0 instanceof sprrai)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprtaz.cfr_renamed_9("sdS~SkVc@kNcUd\u001az[x[g_~_xI*W\u007fI~\u001ah_*[d\u001acTyNkTi_*Ul\u001a")).append(sprrai.class.getName()).append(".").toString());
        }
        this.cfr_renamed_4 = new sprale((sprrai)arg0);
    }
}

