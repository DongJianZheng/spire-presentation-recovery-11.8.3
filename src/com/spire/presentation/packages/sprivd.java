/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprch;
import com.spire.presentation.packages.sprdqe;
import com.spire.presentation.packages.sprerd;
import com.spire.presentation.packages.sprgi;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.spripd;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprixd;
import com.spire.presentation.packages.sprkrd;
import com.spire.presentation.packages.sprlh;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprnraa;
import com.spire.presentation.packages.sprqn;
import com.spire.presentation.packages.sprurd;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class sprivd
extends sprurd {
    public static Map cfr_renamed_2 = new HashMap();
    private sprdqe cfr_renamed_3;
    public static Map cfr_renamed_4 = new HashMap();

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_4006() {
        try {
            spra spra2;
            if (this.cfr_renamed_3.cfr_renamed_4007() == null || (spra2 = this.cfr_renamed_3.cfr_renamed_4007().cfr_renamed_284()) == null) return null;
            return spra2.cfr_renamed_119().cfr_renamed_91();
        }
        catch (Exception exception) {
            throw new RuntimeException(new StringBuilder().insert(0, sprnraa.cfr_renamed_9("[&];N*W1P~Y;J*W0Y~[0],G.J7Q0\u001e._,_3[*[,M~")).append(exception).toString());
        }
    }

    public String cfr_renamed_4008() {
        if (this.cfr_renamed_3.cfr_renamed_4007() != null) {
            return this.cfr_renamed_3.cfr_renamed_4007().cfr_renamed_593().cfr_renamed_19();
        }
        return null;
    }

    static {
        cfr_renamed_4.put(spripd.cfr_renamed_145, spriwa.cfr_renamed_279(8));
        cfr_renamed_4.put(spripd.spr\ufe34, spriwa.cfr_renamed_279(16));
        cfr_renamed_4.put(spripd.cfr_renamed_88, spriwa.cfr_renamed_279(16));
        cfr_renamed_4.put(spripd.cfr_renamed_105, spriwa.cfr_renamed_279(16));
        cfr_renamed_2.put(spripd.cfr_renamed_145, spriwa.cfr_renamed_279(192));
        cfr_renamed_2.put(spripd.spr\ufe34, spriwa.cfr_renamed_279(128));
        cfr_renamed_2.put(spripd.cfr_renamed_88, spriwa.cfr_renamed_279(192));
        cfr_renamed_2.put(spripd.cfr_renamed_105, spriwa.cfr_renamed_279(256));
    }

    /*
     * WARNING - void declaration
     */
    public sprivd(sprdqe sprdqe2, sprije sprije2, sprch sprch2, sprgi sprgi2) {
        super(arg0.cfr_renamed_4000(), (sprije)arg1, (sprch)arg2, (sprgi)arg3);
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_3 = sprdqe2;
        sprivd sprivd2 = this;
        this.cfr_renamed_0 = new sprkrd();
    }

    public sprije cfr_renamed_4007() {
        return this.cfr_renamed_3.cfr_renamed_4007();
    }

    @Override
    public sprixd cfr_renamed_3999(sprlh arg0) throws sprlqd, IOException {
        sprqn sprqn2 = (sprqn)arg0;
        sprije sprije2 = sprije.cfr_renamed_23(sprije.cfr_renamed_23(this.cfr_renamed_3.cfr_renamed_4000()).cfr_renamed_284());
        byte[] byArray = sprerd.cfr_renamed_4009(sprqn2.cfr_renamed_3233(), sprqn2.cfr_renamed_1601());
        int n = (Integer)cfr_renamed_2.get(sprije2.cfr_renamed_593());
        sprqn sprqn3 = sprqn2;
        byte[] byArray2 = sprqn3.cfr_renamed_3222(byArray, this.cfr_renamed_4007(), n);
        return sprqn3.cfr_renamed_3224(sprije2, this.cfr_renamed_1, byArray2, this.cfr_renamed_3.cfr_renamed_4010().cfr_renamed_186());
    }
}

