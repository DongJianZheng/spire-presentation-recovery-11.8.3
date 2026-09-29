/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprerz;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.spriu;
import com.spire.presentation.packages.sprivm;
import com.spire.presentation.packages.sprkrl;
import com.spire.presentation.packages.sprlom;
import com.spire.presentation.packages.sprmom;
import com.spire.presentation.packages.sprnhn;
import com.spire.presentation.packages.sprrtl;
import com.spire.presentation.packages.sprzwl;
import java.io.IOException;

public class spranl {
    public static final int cfr_renamed_91 = 0;
    public static final int cfr_renamed_0 = 1;
    public static final int cfr_renamed_1 = 5;
    public static final int cfr_renamed_2 = 6;
    public static final int cfr_renamed_3 = 3;
    public static final int cfr_renamed_4 = 2;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprkrl cfr_renamed_4283(int arg0, Object arg1) throws sprzwl {
        sprfvg sprfvg2;
        if (arg1 == null) {
            return new sprkrl(new sprmom(new sprivm(arg0), null));
        }
        if (!(arg1 instanceof sprrtl)) {
            throw new sprzwl(sprnhn.cfr_renamed_9("hUvUrLs\u001bo^nKrUn^=T\u007fQxXi"));
        }
        sprrtl sprrtl2 = (sprrtl)arg1;
        try {
            sprfvg2 = new sprfvg(sprrtl2.cfr_renamed_91());
        }
        catch (IOException iOException) {
            throw new sprzwl(sprerz.cfr_renamed_9("q\t|OfHw\u0006q\u0007v\r2\u0007p\u0002w\u000bfF"), iOException);
        }
        sprlom sprlom2 = new sprlom(spriu.cfr_renamed_112, sprfvg2);
        return new sprkrl(new sprmom(new sprivm(arg0), sprlom2));
    }
}

