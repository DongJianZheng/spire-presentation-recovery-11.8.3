/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcmm;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprctl;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprjz;
import com.spire.presentation.packages.sprlcd;
import com.spire.presentation.packages.sprlq;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprlz;
import com.spire.presentation.packages.sprmtl;
import com.spire.presentation.packages.sprppl;
import com.spire.presentation.packages.sprpsl;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprzq;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class sprtwl
extends sprctl {
    private sprcmm cfr_renamed_2;
    public static Map cfr_renamed_3;
    public static Map cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprtwl(sprcmm sprcmm2, sprddm sprddm2, sprjz sprjz2, sprlq sprlq2) {
        super(arg0.cfr_renamed_4000(), (sprddm)arg1, (sprjz)arg2, (sprlq)arg3);
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_2 = sprcmm2;
        sprtwl sprtwl2 = this;
        this.cfr_renamed_4 = new sprppl();
    }

    public sprddm cfr_renamed_4007() {
        return this.cfr_renamed_2.cfr_renamed_4007();
    }

    static {
        cfr_renamed_4 = new HashMap();
        cfr_renamed_3 = new HashMap();
        cfr_renamed_3.put(sprpsl.cfr_renamed_1222, spruaf.cfr_renamed_279(8));
        cfr_renamed_3.put(sprpsl.cfr_renamed_272, spruaf.cfr_renamed_279(16));
        cfr_renamed_3.put(sprpsl.cfr_renamed_723, spruaf.cfr_renamed_279(16));
        cfr_renamed_3.put(sprpsl.cfr_renamed_102, spruaf.cfr_renamed_279(16));
        cfr_renamed_4.put(sprpsl.cfr_renamed_1222, spruaf.cfr_renamed_279(192));
        cfr_renamed_4.put(sprpsl.cfr_renamed_272, spruaf.cfr_renamed_279(128));
        cfr_renamed_4.put(sprpsl.cfr_renamed_723, spruaf.cfr_renamed_279(192));
        cfr_renamed_4.put(sprpsl.cfr_renamed_102, spruaf.cfr_renamed_279(256));
    }

    @Override
    public sprmtl cfr_renamed_10666(sprlz arg0) throws sprlyl, IOException {
        sprzq sprzq2 = (sprzq)arg0;
        sprddm sprddm2 = sprddm.cfr_renamed_23(sprddm.cfr_renamed_23(this.cfr_renamed_2.cfr_renamed_4000()).cfr_renamed_284());
        int n = (Integer)cfr_renamed_4.get(sprddm2.cfr_renamed_593());
        sprzq sprzq3 = sprzq2;
        byte[] byArray = sprzq3.cfr_renamed_10670(sprzq3.cfr_renamed_3233(), this.cfr_renamed_4007(), n);
        return sprzq3.cfr_renamed_10671(sprddm2, this.cfr_renamed_119, byArray, this.cfr_renamed_2.cfr_renamed_4010().cfr_renamed_186());
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_4006() {
        try {
            sprco sprco2;
            if (this.cfr_renamed_2.cfr_renamed_4007() == null || (sprco2 = this.cfr_renamed_2.cfr_renamed_4007().cfr_renamed_284()) == null) return null;
            return sprco2.cfr_renamed_119().cfr_renamed_91();
        }
        catch (Exception exception) {
            throw new RuntimeException(new StringBuilder().insert(0, sprlcd.cfr_renamed_9("\u0019+\u001f6\f'\u0015<\u0012s\u001b6\b'\u0015=\u001bs\u0019=\u001f!\u0005#\b:\u0013=\\#\u001d!\u001d>\u0019'\u0019!\u000fs")).append(exception).toString());
        }
    }

    public String cfr_renamed_4008() {
        if (this.cfr_renamed_2.cfr_renamed_4007() != null) {
            return this.cfr_renamed_2.cfr_renamed_4007().cfr_renamed_593().cfr_renamed_19();
        }
        return null;
    }
}

