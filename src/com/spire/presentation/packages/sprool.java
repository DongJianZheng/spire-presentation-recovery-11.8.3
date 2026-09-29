/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprgum;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprugg;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprwmaa;
import com.spire.presentation.packages.sprzwl;
import java.io.OutputStream;

public class sprool {
    public sprgum cfr_renamed_3;
    public static final sprddm cfr_renamed_4 = new sprddm(sprgt.cfr_renamed_0, sprpen.cfr_renamed_4);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprool(sprvhm arg0, sprjj arg1) throws sprzwl {
        try {
            if (!arg1.cfr_renamed_615().equals(cfr_renamed_4)) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprugg.cfr_renamed_9("jrie%OM](-%\u007fdr%~`<po`x%klhm<WyvlLX%1%zjikx?<")).append(arg1.cfr_renamed_615().cfr_renamed_593()).toString());
            }
            OutputStream outputStream = arg1.cfr_renamed_470();
            outputStream.write(arg0.cfr_renamed_2314().cfr_renamed_81());
            outputStream.close();
            sprool sprool2 = this;
            sprool2.cfr_renamed_3 = new sprgum(new sprfvg(arg1.cfr_renamed_580()));
            return;
        }
        catch (Exception exception) {
            throw new sprzwl(new StringBuilder().insert(0, sprwmaa.cfr_renamed_9("\u0004o\u001b\u007f\u0018x\u0019=\u0017o\u0011|\u0000t\u001azTT0'T")).append(exception).toString(), exception);
        }
    }

    public int hashCode() {
        return this.cfr_renamed_3.hashCode();
    }

    public sprool(sprgum sprgum2) {
        this.cfr_renamed_3 = sprgum2;
    }

    /*
     * WARNING - void declaration
     */
    public sprool(sprnbm sprnbm2) {
        void arg0;
        sprool sprool2 = this;
        sprool2.cfr_renamed_3 = new sprgum((sprnbm)arg0);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprool)) {
            return false;
        }
        sprool sprool2 = (sprool)arg0;
        return this.cfr_renamed_3.equals(sprool2.cfr_renamed_3);
    }

    public sprgum cfr_renamed_119() {
        return this.cfr_renamed_3;
    }
}

