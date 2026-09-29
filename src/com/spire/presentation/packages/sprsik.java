/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraql;
import com.spire.presentation.packages.sprgok;
import com.spire.presentation.packages.sprjil;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprvgk;
import com.spire.presentation.packages.sprycga;
import com.spire.presentation.packages.sprywl;
import com.spire.presentation.packages.sprzql;
import java.io.IOException;

public class sprsik {
    private final sprzql cfr_renamed_4;

    public sprsik(sprzql sprzql2) {
        this.cfr_renamed_4 = sprzql2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprywl cfr_renamed_9835(sprgok arg0) throws sprvgk {
        try {
            byte[] byArray = arg0.cfr_renamed_480().cfr_renamed_119().cfr_renamed_104("DER");
            return this.cfr_renamed_4.cfr_renamed_5289(new spraql(arg0.cfr_renamed_696(), byArray), true);
        }
        catch (sprlyl sprlyl2) {
            throw new sprvgk(sprycga.cfr_renamed_9("6S\u0000P\u0011\u001c\u001bS\u0001\u001c\u0006U\u0012RUx#\u007f&\u001c\u0007Y\u0004I\u0010O\u0001"), sprlyl2);
        }
        catch (IOException iOException) {
            throw new sprvgk(sprjil.cfr_renamed_9("tpBsS?YpC?RqTpSz\u0017[a\\d?EzFjRlC"), iOException);
        }
    }
}

