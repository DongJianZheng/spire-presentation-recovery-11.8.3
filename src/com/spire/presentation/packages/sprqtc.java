/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbbd;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sprqtha;
import com.spire.presentation.packages.sprquq;
import com.spire.presentation.packages.sprrtc;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.sprvxc;
import java.io.IOException;

public class sprqtc
extends sprrtc {
    public sprsc cfr_renamed_2;
    public sprhgb cfr_renamed_3;
    public sprbbd cfr_renamed_4;

    @Override
    public sprbbd cfr_renamed_2141() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprqtc(sprsc sprsc2, sprbbd sprbbd2, sprhgb sprhgb2) {
        void arg0;
        void arg2;
        void arg1;
        if (sprbbd2 == null) {
            throw new IllegalArgumentException(sprquq.cfr_renamed_9(";xyihrzr\u007fzh~;;\u007fzruso<yy;rnpw"));
        }
        if (arg1.cfr_renamed_29()) {
            throw new IllegalArgumentException(sprqtha.cfr_renamed_9("sd1u n2n7f bs'7f:i;ste1'1j$s-"));
        }
        if (arg2 == null) {
            throw new IllegalArgumentException(sprquq.cfr_renamed_9("<lium}oyPyb;;\u007fzruso<yy;rnpw"));
        }
        if (!arg2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprqtha.cfr_renamed_9(" $u=q5s1L1~s'9r'ste1'$u=q5s1"));
        }
        if (!(arg2 instanceof sprmtc)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprquq.cfr_renamed_9("<lium}oyPyb;;hbl~<uso<hikltnoy\u007f&;")).append(arg2.getClass().getName()).toString());
        }
        this.cfr_renamed_2 = arg0;
        sprqtc sprqtc2 = this;
        sprqtc2.cfr_renamed_4 = arg1;
        sprqtc2.cfr_renamed_3 = arg2;
    }

    @Override
    public byte[] cfr_renamed_2892(byte[] arg0) throws IOException {
        sprqtc sprqtc2 = this;
        return sprvxc.cfr_renamed_2890(sprqtc2.cfr_renamed_2, (sprmtc)sprqtc2.cfr_renamed_3, arg0);
    }
}

