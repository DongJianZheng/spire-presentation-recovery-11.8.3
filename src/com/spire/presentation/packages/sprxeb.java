/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcnaa;
import com.spire.presentation.packages.sprfxa;
import com.spire.presentation.packages.sprhcd;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprlza;
import com.spire.presentation.packages.sprwjb;
import java.io.IOException;

public class sprxeb
extends sprlza {
    public sprxeb(sprlza arg0) {
        super(arg0.cfr_renamed_568());
    }

    public sprxeb(byte[] arg0) throws IOException {
        super(arg0);
    }

    public sprxeb(sprwjb arg0) {
        super(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprhgb cfr_renamed_1157() throws sprfxa {
        try {
            return sprhcd.cfr_renamed_1531(this.cfr_renamed_1489());
        }
        catch (IOException iOException) {
            throw new sprfxa(new StringBuilder().insert(0, sprcnaa.cfr_renamed_9("\u0001q\u0016l\u0016#\u0001{\u0010q\u0005`\u0010j\ndDh\u0001zDf\n`\u000bg\rm\u00039D")).append(iOException.getMessage()).toString(), iOException);
        }
    }
}

