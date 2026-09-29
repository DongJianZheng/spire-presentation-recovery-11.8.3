/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraco;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtsn;
import com.spire.presentation.packages.sprueka;
import java.util.Iterator;

@sprtea
public class sprhzn
extends sprtsn {
    public sprhzn cfr_renamed_15352(byte[] arg0, String arg1) {
        if (arg0 == null) {
            return this;
        }
        sprhzn sprhzn2 = this;
        sprhzn2.cfr_renamed_15331(arg0, arg1);
        return sprhzn2;
    }

    public sprhzn(String arg0, sprtsn arg1) {
        super(arg0, arg1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public String cfr_renamed_15353(byte[] arg0) {
        sprueka sprueka2;
        Iterator iterator = this.cfr_renamed_14727().iterator();
        block0: do {
            Iterator iterator2 = iterator;
            while (true) {
                if (!iterator2.hasNext()) {
                    return "";
                }
                sprueka2 = (sprueka)iterator.next();
                if (((byte[])sprueka2.cfr_renamed_97()).length == arg0.length) continue block0;
                iterator2 = iterator;
            }
        } while (!spraco.cfr_renamed_15145((byte[])sprueka2.cfr_renamed_97(), arg0));
        return sprraia.cfr_renamed_434((String)sprueka2.cfr_renamed_1521(), '/')[sprraia.cfr_renamed_434((String)sprueka2.cfr_renamed_1521(), '/').length - 1];
    }
}

