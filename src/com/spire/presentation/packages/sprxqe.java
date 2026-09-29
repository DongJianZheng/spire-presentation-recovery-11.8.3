/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.spraqe;
import com.spire.presentation.packages.sprdd;
import com.spire.presentation.packages.sprdua;
import com.spire.presentation.packages.sprhwe;
import com.spire.presentation.packages.sprjrj;
import com.spire.presentation.packages.sprkwe;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwue;
import java.io.IOException;

public class sprxqe
implements spra,
sprdd {
    private sprkwe cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprvva cfr_renamed_119() {
        try {
            return this.cfr_renamed_2414();
        }
        catch (IOException iOException) {
            throw new spraqe(sprdua.cfr_renamed_9("\u0016*\u0002&\u000f!C0\fd\u0004!\u0017d'\u00011d\f&\t!\u00000"), iOException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new spraqe(sprjrj.cfr_renamed_9("ciwezb6sy'qbb'RBD'ye|bus"), illegalArgumentException);
        }
    }

    public spra cfr_renamed_24() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_24();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprvva cfr_renamed_2414() throws IOException {
        try {
            return new sprhwe(this.cfr_renamed_4.cfr_renamed_4789());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprwue(illegalArgumentException.getMessage(), illegalArgumentException);
        }
    }

    public sprxqe(sprkwe sprkwe2) {
        this.cfr_renamed_4 = sprkwe2;
    }
}

