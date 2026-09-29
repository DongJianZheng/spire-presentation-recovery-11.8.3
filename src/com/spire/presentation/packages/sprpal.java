/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.spreyl;
import com.spire.presentation.packages.sprouk;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqnl;

public class sprpal
extends sprouk {
    public sprpal() {
    }

    @Override
    public int cfr_renamed_2404() {
        return 16;
    }

    @Override
    public long cfr_renamed_1206() throws sprddl, IllegalStateException {
        throw new UnsupportedOperationException(sprqnl.cfr_renamed_9("]'\u007f!W)U`\u0010hP;\u0019&V<\u0019;L8I'K<\\,"));
    }

    public sprpal(int arg0, int arg1) {
        super(arg0, arg1);
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws sprddl, IllegalStateException {
        sprpal sprpal2 = this;
        sprpal2.cfr_renamed_0 >>>= 7 - this.cfr_renamed_86 << 3;
        sprpal2.cfr_renamed_0 >>>= 8;
        sprpal2.cfr_renamed_0 |= ((long)((this.cfr_renamed_2 << 3) + this.cfr_renamed_86) & 0xFFL) << 56;
        sprpal2.cfr_renamed_3469();
        sprpal2.cfr_renamed_4 ^= 0xEEL;
        sprpal2.cfr_renamed_3468(sprpal2.cfr_renamed_152);
        long l = sprpal2.cfr_renamed_93 ^ this.cfr_renamed_112 ^ this.cfr_renamed_4 ^ this.cfr_renamed_3;
        sprpal2.cfr_renamed_112 ^= 0xDDL;
        sprpal2.cfr_renamed_3468(sprpal2.cfr_renamed_152);
        long l2 = sprpal2.cfr_renamed_93 ^ this.cfr_renamed_112 ^ this.cfr_renamed_4 ^ this.cfr_renamed_3;
        sprpal2.cfr_renamed_41();
        sprpxe.cfr_renamed_444(l, arg0, arg1);
        sprpxe.cfr_renamed_444(l2, arg0, arg1 + 8);
        return 16;
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, spreyl.cfr_renamed_9("KThuyNp\f*\u00055")).append(this.cfr_renamed_91).append("-").append(this.cfr_renamed_152).toString();
    }

    @Override
    public void cfr_renamed_41() {
        sprpal sprpal2 = this;
        super.cfr_renamed_41();
        sprpal2.cfr_renamed_112 ^= 0xEEL;
    }
}

