/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;

public class sprufn
extends spridn {
    @Override
    public void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        arg0.cfr_renamed_11429(arg1, 49, this.cfr_renamed_2);
    }

    @Override
    public int cfr_renamed_11213(boolean arg0) throws IOException {
        int n = arg0 ? 4 : 3;
        int n2 = 0;
        int n3 = this.cfr_renamed_2.length;
        int n4 = n2;
        while (n4 < n3) {
            sprxgf sprxgf2 = this.cfr_renamed_2[n2].cfr_renamed_119();
            n += sprxgf2.cfr_renamed_11213(true);
            n4 = ++n2;
        }
        return n;
    }

    public sprufn(sprco arg0) {
        super(arg0);
    }

    public sprufn(boolean arg0, sprco[] arg1) {
        super(arg0, arg1);
    }

    public sprufn() {
    }

    public sprufn(sprco[] arg0) {
        super(arg0, false);
    }

    public sprufn(sprrvm arg0) {
        super(arg0, false);
    }
}

