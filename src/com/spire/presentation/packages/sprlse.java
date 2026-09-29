/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraqe;
import com.spire.presentation.packages.sprbho;
import com.spire.presentation.packages.sprgle;
import java.io.IOException;
import java.util.Enumeration;

public class sprlse
implements Enumeration {
    private Object cfr_renamed_3;
    private sprgle cfr_renamed_4;

    public sprlse(byte[] arg0) {
        this.cfr_renamed_4 = new sprgle(arg0, true);
        this.cfr_renamed_3 = this.cfr_renamed_24();
    }

    public Object nextElement() {
        sprlse sprlse2 = this;
        Object object = sprlse2.cfr_renamed_3;
        sprlse2.cfr_renamed_3 = sprlse2.cfr_renamed_24();
        return object;
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
            throw new spraqe(new StringBuilder().insert(0, sprbho.cfr_renamed_9(".^/Y,M.Z'\u001f\u0007z\u0011\u001f P-L7M6\\7V,Qy\u001f")).append(iOException).toString(), iOException);
        }
    }

    @Override
    public boolean hasMoreElements() {
        return this.cfr_renamed_3 != null;
    }
}

