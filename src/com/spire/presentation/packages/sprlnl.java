/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprsv;
import com.spire.presentation.packages.sprszm;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

public class sprlnl
implements sprsv {
    private final sprlem cfr_renamed_3;
    private final sprco cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprlnl(sprlem sprlem2, sprco sprco2) {
        void arg0;
        sprlnl sprlnl2 = this;
        sprlnl2.cfr_renamed_3 = arg0;
        sprlnl2.cfr_renamed_4 = sprco2;
    }

    @Override
    public sprlem cfr_renamed_696() {
        return this.cfr_renamed_3;
    }

    @Override
    public void cfr_renamed_624(OutputStream arg0) throws IOException, sprlyl {
        if (this.cfr_renamed_4 instanceof sprszm) {
            Iterator<sprco> iterator;
            sprszm sprszm2 = sprszm.cfr_renamed_23(this.cfr_renamed_4);
            Iterator<sprco> iterator2 = iterator = sprszm2.iterator();
            while (iterator2.hasNext()) {
                sprco sprco2 = iterator.next();
                iterator2 = iterator;
                arg0.write(sprco2.cfr_renamed_119().cfr_renamed_104("DER"));
            }
        } else {
            byte[] byArray = this.cfr_renamed_4.cfr_renamed_119().cfr_renamed_104("DER");
            int n = 1;
            byte[] byArray2 = byArray;
            while ((byArray2[n] & 0xFF) > 127) {
                byArray2 = byArray;
                ++n;
            }
            arg0.write(byArray, ++n, byArray.length - n);
        }
    }

    @Override
    public Object cfr_renamed_480() {
        return this.cfr_renamed_4;
    }
}

