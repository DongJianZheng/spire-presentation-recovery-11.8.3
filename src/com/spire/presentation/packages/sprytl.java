/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfoq;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprku;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprpy;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class sprytl
implements sprpy,
sprku {
    private boolean cfr_renamed_3;
    private InputStream cfr_renamed_4;

    @Override
    public void cfr_renamed_624(OutputStream arg0) throws IOException, sprlyl {
        sprytl sprytl2 = this;
        sprytl2.cfr_renamed_4156();
        sprkqe.cfr_renamed_472(sprytl2.cfr_renamed_4, arg0);
        sprytl2.cfr_renamed_4.close();
    }

    @Override
    public Object cfr_renamed_480() {
        return this.cfr_renamed_2920();
    }

    public sprytl(InputStream inputStream) {
        sprytl sprytl2 = this;
        sprytl2.cfr_renamed_3 = false;
        sprytl2.cfr_renamed_4 = inputStream;
    }

    @Override
    public InputStream cfr_renamed_2920() {
        sprytl sprytl2 = this;
        sprytl2.cfr_renamed_4156();
        return sprytl2.cfr_renamed_4;
    }

    private synchronized /* synthetic */ void cfr_renamed_4156() {
        if (this.cfr_renamed_3) {
            throw new IllegalStateException(sprfoq.cfr_renamed_9("6?&\"\u0007\u001d\u0016\u0017\u0006\u0001\u0014\u0010\u0019\u0017<\u001c\u0005\u0007\u0001!\u0001\u0000\u0010\u0013\u0018R\u0016\u0013\u001bR\u001a\u001c\u0019\u000bU\u0010\u0010R\u0000\u0001\u0010\u0016U\u001d\u001b\u0011\u0010"));
        }
        this.cfr_renamed_3 = true;
    }
}

