/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprden;
import com.spire.presentation.packages.sprfdn;
import com.spire.presentation.packages.sprhbn;
import com.spire.presentation.packages.sprign;
import com.spire.presentation.packages.sprno;
import com.spire.presentation.packages.sprrym;
import com.spire.presentation.packages.spruzy;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxry;
import java.io.IOException;

public class sprpcn
implements sprno {
    private sprden cfr_renamed_4;

    @Override
    public sprco cfr_renamed_24() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_24();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprrym cfr_renamed_11307(sprden arg0) throws IOException {
        try {
            return new sprrym(new sprfdn(arg0.cfr_renamed_4789()));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprign(illegalArgumentException.getMessage(), illegalArgumentException);
        }
    }

    @Override
    public sprxgf cfr_renamed_2414() throws IOException {
        return sprpcn.cfr_renamed_11307(this.cfr_renamed_4);
    }

    public sprpcn(sprden sprden2) {
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
            throw new sprhbn(sprxry.cfr_renamed_9("tz`vmq!`n4fqu4EQS4nvkqb`"), iOException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprhbn(spruzy.cfr_renamed_9("\u0010e\u0004i\tnE\u007f\n+\u0002n\u0011+!N7+\ni\u000fn\u0006\u007f"), illegalArgumentException);
        }
    }
}

