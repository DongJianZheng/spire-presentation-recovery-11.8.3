/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbud;
import com.spire.presentation.packages.sprcj;
import com.spire.presentation.packages.sprcwd;
import com.spire.presentation.packages.sprfhfa;
import com.spire.presentation.packages.sprlje;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprmde;
import com.spire.presentation.packages.sprnoq;
import com.spire.presentation.packages.sprqtd;
import com.spire.presentation.packages.spryje;
import java.io.IOException;

public class sprtqd {
    public static final int cfr_renamed_91 = 1;
    public static final int cfr_renamed_0 = 2;
    public static final int cfr_renamed_1 = 6;
    public static final int cfr_renamed_2 = 3;
    public static final int cfr_renamed_3 = 5;
    public static final int cfr_renamed_4 = 0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprqtd cfr_renamed_4283(int arg0, Object arg1) throws sprbud {
        sprlqe sprlqe2;
        if (arg1 == null) {
            return new sprqtd(new spryje(new sprmde(arg0), null));
        }
        if (!(arg1 instanceof sprcwd)) {
            throw new sprbud(sprfhfa.cfr_renamed_9("#E=E9\\8\u000b$N%[9E%NvD4A3H\""));
        }
        sprcwd sprcwd2 = (sprcwd)arg1;
        try {
            sprlqe2 = new sprlqe(sprcwd2.cfr_renamed_91());
        }
        catch (IOException iOException) {
            throw new sprbud(sprnoq.cfr_renamed_9("F!KgQ`@.F/A%\u0005/G*@#Qn"), iOException);
        }
        sprlje sprlje2 = new sprlje(sprcj.cfr_renamed_3, sprlqe2);
        return new sprqtd(new spryje(new sprmde(arg0), sprlje2));
    }
}

