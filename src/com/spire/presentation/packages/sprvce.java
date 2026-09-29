/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprdqd;
import com.spire.presentation.packages.sprdtaa;
import com.spire.presentation.packages.sprfje;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprude;
import com.spire.presentation.packages.sprxue;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public class sprvce {
    private Vector cfr_renamed_3;
    private Hashtable cfr_renamed_4;

    public void cfr_renamed_41() {
        sprvce sprvce2 = this;
        sprvce2.cfr_renamed_4 = new Hashtable();
        sprvce2.cfr_renamed_3 = new Vector();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_6(sprtzd arg0, boolean arg1, spra arg2) {
        try {
            this.cfr_renamed_18(arg0, arg1, arg2.cfr_renamed_119().cfr_renamed_104("DER"));
            return;
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprdtaa.cfr_renamed_9("\u0014T\u0003I\u0003\u0006\u0014H\u0012I\u0015O\u001fAQP\u0010J\u0004CK\u0006")).append(iOException).toString());
        }
    }

    public void cfr_renamed_18(sprtzd arg0, boolean arg1, byte[] arg2) {
        if (this.cfr_renamed_4.containsKey(arg0)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprdqd.cfr_renamed_9("hjywcad}c2")).append(arg0).append(sprdtaa.cfr_renamed_9("QG\u001dT\u0014G\u0015_QG\u0015B\u0014B")).toString());
        }
        sprvce sprvce2 = this;
        sprvce2.cfr_renamed_3.addElement(arg0);
        sprvce2.cfr_renamed_4.put(arg0, new sprfje(arg1, (sprxue)new sprlqe(arg2)));
    }

    public boolean cfr_renamed_29() {
        return this.cfr_renamed_3.isEmpty();
    }

    public sprvce() {
        sprvce sprvce2 = this;
        this.cfr_renamed_4 = new Hashtable();
        sprvce2.cfr_renamed_3 = new Vector();
    }

    public sprude cfr_renamed_31() {
        sprvce sprvce2 = this;
        return new sprude(sprvce2.cfr_renamed_3, sprvce2.cfr_renamed_4);
    }
}

