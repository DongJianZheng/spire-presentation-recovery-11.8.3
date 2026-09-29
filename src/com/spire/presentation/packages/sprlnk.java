/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprmoo;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.spryrb;
import com.spire.presentation.packages.spryye;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public final class sprlnk
extends spryye {
    private final byte[] cfr_renamed_3 = new byte[56];
    public static final int cfr_renamed_4 = 56;

    public sprlnk(byte[] byArray, int n) {
        super(false);
        System.arraycopy(byArray, n, this.cfr_renamed_3, 0, 56);
    }

    public byte[] cfr_renamed_91() {
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    public void cfr_renamed_8007(byte[] arg0, int arg1) {
        System.arraycopy(this.cfr_renamed_3, 0, arg0, arg1, 56);
    }

    private static /* synthetic */ byte[] cfr_renamed_9971(byte[] arg0) {
        if (arg0.length != 56) {
            throw new IllegalArgumentException(sprmoo.cfr_renamed_9("\u0004\u0017V\u0013\u0004UN\u0000P\u0001\u0003\u001dB\u0003FUO\u0010M\u0012W\u001d\u0003@\u0015"));
        }
        return arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprlnk(InputStream inputStream) throws IOException {
        super(false);
        void arg0;
        if (56 != sprkqe.cfr_renamed_476((InputStream)arg0, this.cfr_renamed_3)) {
            throw new EOFException(spryrb.cfr_renamed_9("g+dDG\nA\u000bW\nV\u0001P\u0001FDK\n\u0002\tK\u0000F\bGDM\u0002\u0002<\u0016P\u001aDR\u0011@\bK\u0007\u0002\u000fG\u001d"));
        }
    }

    public sprlnk(byte[] arg0) {
        this(sprlnk.cfr_renamed_9971(arg0), 0);
    }
}

