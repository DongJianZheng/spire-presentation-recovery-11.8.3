/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraxm;
import com.spire.presentation.packages.sprden;
import com.spire.presentation.packages.sprfwm;
import com.spire.presentation.packages.sprhbn;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprme;
import com.spire.presentation.packages.sprwzj;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.io.InputStream;

public class sproxm
implements sprme {
    private sprden cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_2414() throws IOException {
        return sproxm.cfr_renamed_11307(this.cfr_renamed_4);
    }

    public static sprfwm cfr_renamed_11307(sprden arg0) throws IOException {
        return new sprfwm(sprkqe.cfr_renamed_471(new spraxm(arg0)));
    }

    @Override
    public InputStream cfr_renamed_698() {
        return new spraxm(this.cfr_renamed_4);
    }

    public sproxm(sprden sprden2) {
        this.cfr_renamed_4 = sprden2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprxgf cfr_renamed_119() {
        try {
            return this.cfr_renamed_2414();
        }
        catch (IOException iOException) {
            throw new sprhbn(new StringBuilder().insert(0, sprwzj.cfr_renamed_9("=!1\u0016\u0017\u000b\u0004\u001a\u001d\u0001\u001aN\u0017\u0001\u001a\u0018\u0011\u001c\u0000\u0007\u001a\tT\u001d\u0000\u001c\u0011\u000f\u0019N\u0000\u0001T\f\r\u001a\u0011N\u0015\u001c\u0006\u000f\rTT")).append(iOException.getMessage()).toString(), iOException);
        }
    }
}

