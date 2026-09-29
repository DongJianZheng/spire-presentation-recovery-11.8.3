/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprage;
import com.spire.presentation.packages.sprca;
import com.spire.presentation.packages.sprfbe;
import com.spire.presentation.packages.sprfxa;
import com.spire.presentation.packages.sprha;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprnje;
import com.spire.presentation.packages.sprseca;
import java.io.OutputStream;

public class sprpgb {
    private sprca cfr_renamed_4;

    public sprpgb(sprca sprca2) {
        this.cfr_renamed_4 = sprca2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprage cfr_renamed_1464(char[] arg0, byte[] arg1) throws sprfxa {
        Object object;
        sprha sprha2;
        try {
            sprha2 = this.cfr_renamed_4.cfr_renamed_1480(arg0);
            object = sprha2.cfr_renamed_470();
            ((OutputStream)object).write(arg1);
            ((OutputStream)object).close();
        }
        catch (Exception exception) {
            throw new sprfxa(new StringBuilder().insert(0, sprseca.cfr_renamed_9("a\u0018u\u0014x\u00134\u0002{Vd\u0004{\u0015q\u0005gVp\u0017`\u0017.V")).append(exception.getMessage()).toString(), exception);
        }
        object = sprha2.cfr_renamed_615();
        sprnje sprnje2 = new sprnje(this.cfr_renamed_4.cfr_renamed_1479(), sprha2.cfr_renamed_1472());
        sprfbe sprfbe2 = sprfbe.cfr_renamed_23(((sprije)object).cfr_renamed_284());
        return new sprage(sprnje2, sprfbe2.cfr_renamed_1205(), sprfbe2.cfr_renamed_1490().intValue());
    }
}

