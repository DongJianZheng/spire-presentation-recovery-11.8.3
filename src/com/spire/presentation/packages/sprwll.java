/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdgl;
import com.spire.presentation.packages.sprhym;
import com.spire.presentation.packages.sprndl;
import com.spire.presentation.packages.sprwxo;
import com.spire.presentation.packages.sprxq;
import java.util.Collections;
import java.util.Set;

public class sprwll
extends sprdgl {
    private final int cfr_renamed_4;

    public sprwll(int n) {
        super(Collections.EMPTY_SET);
        this.cfr_renamed_4 = n;
    }

    /*
     * WARNING - void declaration
     */
    public sprwll(int n, Set<String> set) {
        super((Set<String>)arg1);
        void arg1;
        this.cfr_renamed_4 = n;
    }

    @Override
    public void cfr_renamed_10580(sprxq arg0) {
        if (this.cfr_renamed_10586(arg0.cfr_renamed_9171())) {
            return;
        }
        if (arg0.cfr_renamed_10429() < this.cfr_renamed_4) {
            throw new sprndl(new StringBuilder().insert(0, sprhym.cfr_renamed_9("*\r+\u001e0\u000b<H=\u0007<\u001by\u00066\u001cy\u0018+\u0007/\u0001=\ry")).append(this.cfr_renamed_4).append(sprwxo.cfr_renamed_9("'\u001bn\rtYh\u001f'\nb\u001ar\u000bn\r~Yh\u0017k\u0000'")).append(arg0.cfr_renamed_10429()).toString());
        }
    }
}

