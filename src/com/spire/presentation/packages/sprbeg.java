/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprbxf;
import com.spire.presentation.packages.sprcnx;
import com.spire.presentation.packages.sprgm;
import com.spire.presentation.packages.spriyf;
import com.spire.presentation.packages.sprlyf;
import com.spire.presentation.packages.sproxl;
import com.spire.presentation.packages.spruzf;
import java.io.IOException;

public class sprbeg
implements sprgm {
    private sprbxf cfr_renamed_3;
    private spriyf cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public boolean cfr_renamed_129(byte[] arg0, byte[] arg1) {
        try {
            return spruzf.cfr_renamed_6468(this.cfr_renamed_3, sprlyf.cfr_renamed_23(arg1), arg0);
        }
        catch (IOException iOException) {
            throw new IllegalStateException(new StringBuilder().insert(0, sproxl.cfr_renamed_9("\u0002L\u0016@\u001bGWV\u0018\u0002\u0013G\u0014M\u0013GWQ\u001eE\u0019C\u0003W\u0005GM\u0002")).append(iOException.getMessage()).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_125(byte[] arg0) {
        try {
            return spruzf.cfr_renamed_6469(this.cfr_renamed_4, arg0).cfr_renamed_91();
        }
        catch (IOException iOException) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprcnx.cfr_renamed_9("9+-'  l1#e)+/*( l6%\"\"$80> ve")).append(iOException.getMessage()).toString());
        }
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        if (arg0) {
            this.cfr_renamed_4 = (spriyf)arg1;
            return;
        }
        this.cfr_renamed_3 = (sprbxf)arg1;
    }
}

