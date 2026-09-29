/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprow;
import com.spire.presentation.packages.sprrhn;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsdn;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sprutj
implements PrivateKey {
    private final List<PrivateKey> cfr_renamed_4;

    @Override
    public String getFormat() {
        return sprrhn.cfr_renamed_9("QhBp\"\u001b");
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprutj) {
            return ((Object)this.cfr_renamed_4).equals(((sprutj)arg0).cfr_renamed_4);
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public sprutj(PrivateKey ... privateKeyArray) {
        int n;
        void arg0;
        if (privateKeyArray == null || ((void)arg0).length == 0) {
            throw new IllegalArgumentException(sprsdn.cfr_renamed_9("\u0016[WC\u0012N\u0004[W@\u0019JW_\u0002M\u001bF\u0014\u000f\u001cJ\u000e\u000f\u001aZ\u0004[WM\u0012\u000f\u0007]\u0018Y\u001eK\u0012K"));
        }
        ArrayList<void> arrayList = new ArrayList<void>(((void)arg0).length);
        int n2 = n = 0;
        while (n2 != ((void)arg0).length) {
            arrayList.add(arg0[n++]);
            n2 = n;
        }
        this.cfr_renamed_4 = Collections.unmodifiableList(arrayList);
    }

    public int hashCode() {
        return ((Object)this.cfr_renamed_4).hashCode();
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
            sprrvm2.cfr_renamed_5004(sprcom.cfr_renamed_23(this.cfr_renamed_4.get(++n).getEncoded()));
            n2 = n;
        }
        try {
            return new sprcom(new sprddm(sprow.cfr_renamed_152), new sprcen(sprrvm2)).cfr_renamed_104("DER");
        }
        catch (IOException iOException) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprrhn.cfr_renamed_9("tM`AmF!Wn\u0003dMbLeF!@nNqLrJuF!HdZ;\u0003")).append(iOException.getMessage()).toString());
        }
    }

    @Override
    public String getAlgorithm() {
        return sprsdn.cfr_renamed_9("l\u0018B\u0007@\u0004F\u0003J");
    }

    public List<PrivateKey> cfr_renamed_7466() {
        return this.cfr_renamed_4;
    }
}

