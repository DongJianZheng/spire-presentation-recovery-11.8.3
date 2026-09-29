/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfvca;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprzwq;
import java.security.SecureRandom;

public class sprsgk
extends sprgye {
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private boolean cfr_renamed_4;

    public int cfr_renamed_3349() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_3341() {
        return this.cfr_renamed_2;
    }

    public boolean cfr_renamed_3350() {
        return this.cfr_renamed_4;
    }

    public sprsgk(SecureRandom arg0, int arg1, int arg2, int arg3) {
        this(arg0, arg1, arg2, arg3, false);
    }

    /*
     * WARNING - void declaration
     */
    public sprsgk(SecureRandom secureRandom, int n, int n2, int n3, boolean bl) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprsgk sprsgk2 = this;
        super((SecureRandom)arg0, (int)arg1);
        sprsgk2.cfr_renamed_4 = false;
        sprsgk2.cfr_renamed_2 = arg2;
        if (n3 % 2 == 1) {
            throw new IllegalArgumentException(sprzwq.cfr_renamed_9("<m+P2b3o\u000fq6n:p\u007fn*p+#=f\u007fb\u007fn*o+j/o:#0e\u007f1"));
        }
        if (arg3 < 30) {
            throw new IllegalArgumentException(sprfvca.cfr_renamed_9("N<Y\u0001@3A>} D?H!\r?X!YrO7\rl\u0010r\u001eb\r4B \r!H1X D&Tr_7L!B<^"));
        }
        this.cfr_renamed_3 = arg3;
        this.cfr_renamed_4 = arg4;
    }
}

