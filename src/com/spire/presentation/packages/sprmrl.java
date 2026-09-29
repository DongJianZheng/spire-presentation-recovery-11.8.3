/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprixl;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprnvl;
import com.spire.presentation.packages.sprumn;
import com.spire.presentation.packages.sprxll;
import java.io.IOException;
import java.io.OutputStream;

public class sprmrl {
    private final sprjj cfr_renamed_4;

    public sprmrl(sprjj sprjj2) {
        this.cfr_renamed_4 = sprjj2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprnvl cfr_renamed_10946(String string) throws sprixl {
        Object object;
        void arg0;
        void v0 = arg0;
        byte[] byArray = sprkoe.cfr_renamed_431(v0.substring(0, v0.indexOf(64)));
        try {
            object = this.cfr_renamed_4.cfr_renamed_470();
            ((OutputStream)object).write(byArray);
            ((OutputStream)object).close();
        }
        catch (IOException iOException) {
            throw new sprixl(new StringBuilder().insert(0, sprxll.cfr_renamed_9("\u0005:16<1p ?t35<7%81 5t4=71# p'$&9:7np")).append(iOException.getMessage()).toString(), iOException);
        }
        object = this.cfr_renamed_4.cfr_renamed_580();
        void v1 = arg0;
        String string2 = new StringBuilder().insert(0, sprkoe.cfr_renamed_184(sprfqe.cfr_renamed_485((byte[])object))).append(sprumn.cfr_renamed_9("-Xpjjjfdfuw)")).append(v1.substring(v1.indexOf(64) + 1)).toString();
        return new sprnvl(string2);
    }
}

