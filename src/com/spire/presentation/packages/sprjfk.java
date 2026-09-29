/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgo;
import com.spire.presentation.packages.sprqkk;
import com.spire.presentation.packages.sprwj;
import java.security.SecureRandom;

public class sprjfk
implements sprgo {
    private final SecureRandom cfr_renamed_3;
    private final boolean cfr_renamed_4;

    public static /* synthetic */ boolean cfr_renamed_9969(sprjfk arg0) {
        return arg0.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprjfk(SecureRandom secureRandom, boolean bl) {
        void arg0;
        sprjfk sprjfk2 = this;
        sprjfk2.cfr_renamed_3 = arg0;
        sprjfk2.cfr_renamed_4 = bl;
    }

    @Override
    public sprwj cfr_renamed_576(int arg0) {
        return new sprqkk(this, arg0);
    }

    public static /* synthetic */ SecureRandom cfr_renamed_9970(sprjfk arg0) {
        return arg0.cfr_renamed_3;
    }
}

