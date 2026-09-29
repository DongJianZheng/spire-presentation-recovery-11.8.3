/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfap;
import com.spire.presentation.packages.sprsef;
import java.security.spec.AlgorithmParameterSpec;

public class spryaf
implements AlgorithmParameterSpec {
    private final sprsef[] cfr_renamed_4;

    public sprsef[] cfr_renamed_5648() {
        return (sprsef[])this.cfr_renamed_4.clone();
    }

    /*
     * WARNING - void declaration
     */
    public spryaf(sprsef ... sprsefArray) {
        void arg0;
        if (sprsefArray.length == 0) {
            throw new IllegalArgumentException(sprfap.cfr_renamed_9("R@\u0013XVU@@\u0013[]Q\u0013x~gxQJsVZcUAU^QGQAgCQP\u0014AQBAZFVP"));
        }
        this.cfr_renamed_4 = (sprsef[])arg0.clone();
    }
}

