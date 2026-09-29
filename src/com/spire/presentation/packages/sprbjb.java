/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprb;
import com.spire.presentation.packages.sprblb;
import com.spire.presentation.packages.sprcwa;
import com.spire.presentation.packages.sprmua;
import com.spire.presentation.packages.sprw;
import com.spire.presentation.packages.sprwlb;
import com.spire.presentation.packages.sprzpj;
import com.spire.presentation.packages.sprzwa;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class sprbjb
extends sprwlb {
    private sprmua cfr_renamed_4;

    @Override
    public Collection cfr_renamed_150(sprb arg0) throws sprzwa {
        if (!(arg0 instanceof sprcwa)) {
            return Collections.EMPTY_SET;
        }
        sprcwa sprcwa2 = (sprcwa)arg0;
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.cfr_renamed_4.cfr_renamed_245(sprcwa2));
        return hashSet;
    }

    @Override
    public void cfr_renamed_151(sprw arg0) {
        if (!(arg0 instanceof sprblb)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprzpj.cfr_renamed_9("!T\u0001N\u0001[\u0004S\u0012[\u001cS\u0007THJ\tH\tW\rN\rH\u001b\u001a\u0005O\u001bNHX\r\u001a\tTHS\u0006I\u001c[\u0006Y\r\u001a\u0007\\H")).append(sprblb.class.getName()).append(".").toString());
        }
        this.cfr_renamed_4 = new sprmua((sprblb)arg0);
    }
}

