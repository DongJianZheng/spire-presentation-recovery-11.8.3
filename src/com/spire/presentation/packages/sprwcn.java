/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhbn;
import com.spire.presentation.packages.sprpsd;
import com.spire.presentation.packages.sprrzm;
import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

public class sprwcn
implements Enumeration {
    private Object cfr_renamed_3;
    private sprrzm cfr_renamed_4;

    public sprwcn(byte[] arg0) {
        this.cfr_renamed_4 = new sprrzm(arg0, true);
        this.cfr_renamed_3 = this.cfr_renamed_24();
    }

    public Object nextElement() {
        if (this.cfr_renamed_3 != null) {
            sprwcn sprwcn2 = this;
            Object object = sprwcn2.cfr_renamed_3;
            sprwcn2.cfr_renamed_3 = sprwcn2.cfr_renamed_24();
            return object;
        }
        throw new NoSuchElementException();
    }

    @Override
    public boolean hasMoreElements() {
        return this.cfr_renamed_3 != null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ Object cfr_renamed_24() {
        try {
            return this.cfr_renamed_4.cfr_renamed_24();
        }
        catch (IOException iOException) {
            throw new sprhbn(new StringBuilder().insert(0, sprpsd.cfr_renamed_9("_9^>]*_=Vxs\u000b|v\u0003b\u0012")).append(iOException).toString(), iOException);
        }
    }
}

