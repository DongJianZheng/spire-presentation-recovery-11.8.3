/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdfo;
import com.spire.presentation.packages.sprflo;
import com.spire.presentation.packages.sprlmo;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprgeo
extends sprflo {
    private int cfr_renamed_2;
    private sprpdja cfr_renamed_3;
    private boolean cfr_renamed_4;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_16060(sprdfo arg0, sprlmo arg1) {
        sprgeo sprgeo2 = new sprgeo(arg0, arg1);
        try {
            byte[] byArray = sprgeo2.cfr_renamed_16061();
            return byArray;
        }
        finally {
            if (sprgeo2 != null) {
                sprgeo2.cfr_renamed_11665();
            }
        }
    }

    @Override
    public boolean cfr_renamed_16062() {
        if (this.cfr_renamed_16063().cfr_renamed_324() == 1574) {
            if (this.cfr_renamed_16064().cfr_renamed_12254() != 15) {
                return false;
            }
            this.cfr_renamed_16064().cfr_renamed_13218();
            sprgeo sprgeo2 = this;
            int n = sprgeo2.cfr_renamed_16064().cfr_renamed_12261();
            int n2 = sprgeo2.cfr_renamed_16064().cfr_renamed_12261();
            int n3 = sprgeo2.cfr_renamed_16064().cfr_renamed_12261();
            if (n != 1128680791 || n2 != 1 || n3 != 65536) {
                return false;
            }
            sprgeo sprgeo3 = this;
            sprgeo3.cfr_renamed_16064().cfr_renamed_13218();
            this.cfr_renamed_16064().cfr_renamed_12261();
            sprgeo sprgeo4 = this;
            int n4 = sprgeo4.cfr_renamed_16064().cfr_renamed_12261();
            int n5 = sprgeo4.cfr_renamed_16064().cfr_renamed_12261();
            int n6 = sprgeo4.cfr_renamed_16064().cfr_renamed_12261();
            int n7 = sprgeo4.cfr_renamed_16064().cfr_renamed_12261();
            byte[] byArray = sprgeo4.cfr_renamed_16064().cfr_renamed_16065(n5);
            sprgeo3.cfr_renamed_3.cfr_renamed_4924(byArray, 0, byArray.length);
            ++this.cfr_renamed_2;
            boolean bl = this.cfr_renamed_4 = (long)n7 == this.cfr_renamed_3.cfr_renamed_806() && n6 == 0 && n4 == this.cfr_renamed_2;
            return this.cfr_renamed_3.cfr_renamed_806() < (long)n7;
        }
        return false;
    }

    public void cfr_renamed_11665() {
        if (this.cfr_renamed_3 != null) {
            this.cfr_renamed_3.dispose();
            this.cfr_renamed_3 = null;
        }
    }

    private /* synthetic */ sprgeo(sprdfo sprdfo2, sprlmo sprlmo2) {
        super(sprdfo2, sprlmo2);
        sprgeo sprgeo2 = this;
        sprgeo2.cfr_renamed_3 = new sprpdja();
    }

    private /* synthetic */ byte[] cfr_renamed_16061() {
        sprgeo sprgeo2 = this;
        this.cfr_renamed_13697(false);
        byte[] byArray = sprgeo2.cfr_renamed_3.cfr_renamed_4529();
        if (sprgeo2.cfr_renamed_4 && byArray.length > 0) {
            return byArray;
        }
        return null;
    }
}

