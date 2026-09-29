/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprjjaa;
import com.spire.presentation.packages.sprow;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprtbq;
import com.spire.presentation.packages.sprvhm;
import java.io.IOException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sprwbk
implements PublicKey {
    private final List<PublicKey> cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprwbk(PublicKey ... publicKeyArray) {
        int n;
        void arg0;
        if (publicKeyArray == null || ((void)arg0).length == 0) {
            throw new IllegalArgumentException(sprtbq.cfr_renamed_9("&kgs\"~4kgp)zgo2}+v$?,z>?*j4kg}\"?7m(i.{\"{"));
        }
        ArrayList<void> arrayList = new ArrayList<void>(((void)arg0).length);
        int n2 = n = 0;
        while (n2 != ((void)arg0).length) {
            arrayList.add(arg0[n++]);
            n2 = n;
        }
        this.cfr_renamed_4 = Collections.unmodifiableList(arrayList);
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprwbk) {
            return ((Object)this.cfr_renamed_4).equals(((sprwbk)arg0).cfr_renamed_4);
        }
        return false;
    }

    public List<PublicKey> cfr_renamed_7458() {
        return this.cfr_renamed_4;
    }

    @Override
    public String getFormat() {
        return sprjjaa.cfr_renamed_9("2S_MS");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        int n;
        sprrvm sprrvm2 = new sprrvm();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.size()) {
            sprrvm2.cfr_renamed_5004(sprvhm.cfr_renamed_23(this.cfr_renamed_4.get(++n).getEncoded()));
            n2 = n;
        }
        try {
            return new sprvhm(new sprddm(sprow.cfr_renamed_152), new sprcen(sprrvm2)).cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprtbq.cfr_renamed_9("2q&}+zgk(?\"q$p#zg|(r7p4v3zgt\"f}?")).append(iOException.getMessage()).toString());
        }
    }

    @Override
    public String getAlgorithm() {
        return sprjjaa.cfr_renamed_9(")\u0012\u0007\r\u0005\u000e\u0003\t\u000f");
    }

    public int hashCode() {
        return ((Object)this.cfr_renamed_4).hashCode();
    }
}

