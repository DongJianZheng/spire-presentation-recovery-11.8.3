/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.spryee;
import java.util.Vector;

public class sprgee {
    private Vector cfr_renamed_4;

    public sprgee cfr_renamed_4512(sprmee arg0) {
        sprgee sprgee2 = this;
        sprgee2.cfr_renamed_4.addElement(arg0);
        return sprgee2;
    }

    public spryee cfr_renamed_1451() {
        int n;
        sprmee[] sprmeeArray = new sprmee[this.cfr_renamed_4.size()];
        int n2 = n = 0;
        while (n2 != sprmeeArray.length) {
            int n3 = n++;
            sprmeeArray[n3] = (sprmee)this.cfr_renamed_4.elementAt(n3);
            n2 = n;
        }
        return new spryee(sprmeeArray);
    }

    public sprgee cfr_renamed_4513(spryee arg0) {
        int n;
        sprmee[] sprmeeArray = arg0.cfr_renamed_289();
        int n2 = n = 0;
        while (n2 != sprmeeArray.length) {
            this.cfr_renamed_4.addElement(sprmeeArray[n++]);
            n2 = n;
        }
        return this;
    }

    public sprgee() {
        sprgee sprgee2 = this;
        sprgee2.cfr_renamed_4 = new Vector();
    }
}

