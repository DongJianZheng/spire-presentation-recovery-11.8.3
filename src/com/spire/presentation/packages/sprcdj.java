/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgo;
import com.spire.presentation.packages.sprgyi;
import com.spire.presentation.packages.sprwj;
import java.security.SecureRandom;

public class sprcdj
implements sprgo {
    private final SecureRandom cfr_renamed_3;
    private final boolean cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprcdj(SecureRandom secureRandom, boolean bl) {
        void arg0;
        sprcdj sprcdj2 = this;
        sprcdj2.cfr_renamed_3 = arg0;
        sprcdj2.cfr_renamed_4 = bl;
    }

    public static /* synthetic */ boolean cfr_renamed_9315(sprcdj arg0) {
        return arg0.cfr_renamed_4;
    }

    public static /* synthetic */ void cfr_renamed_9316(long arg0) throws InterruptedException {
        sprcdj.cfr_renamed_9317(arg0);
    }

    private static /* synthetic */ void cfr_renamed_9317(long arg0) throws InterruptedException {
        if (arg0 != 0L) {
            Thread.sleep(arg0);
        }
    }

    public static /* synthetic */ SecureRandom cfr_renamed_9318(sprcdj arg0) {
        return arg0.cfr_renamed_3;
    }

    @Override
    public sprwj cfr_renamed_576(int arg0) {
        return new sprgyi(this, arg0);
    }
}

