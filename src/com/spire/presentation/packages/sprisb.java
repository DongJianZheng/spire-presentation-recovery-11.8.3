/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlsb;
import com.spire.presentation.packages.sprqid;
import com.spire.presentation.packages.sprste;
import com.spire.presentation.packages.sprtzd;
import java.util.Enumeration;

public class sprisb {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprlsb cfr_renamed_2315(String arg0) {
        sprqid sprqid2;
        sprqid sprqid3 = sprste.cfr_renamed_1837(arg0);
        if (sprqid3 == null) {
            try {
                sprqid2 = sprqid3 = sprste.cfr_renamed_2102(new sprtzd(arg0));
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return null;
            }
        } else {
            sprqid2 = sprqid3;
        }
        if (sprqid2 == null) {
            return null;
        }
        return new sprlsb(arg0, sprqid3.cfr_renamed_1769(), sprqid3.cfr_renamed_1145(), sprqid3.cfr_renamed_1146(), sprqid3.cfr_renamed_1153(), sprqid3.cfr_renamed_2113());
    }

    public static Enumeration cfr_renamed_289() {
        return sprste.cfr_renamed_289();
    }
}

