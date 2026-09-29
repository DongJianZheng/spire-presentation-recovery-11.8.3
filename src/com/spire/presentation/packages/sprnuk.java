/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprflh;
import com.spire.presentation.packages.sprjrh;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprlzz;
import com.spire.presentation.packages.sprmhba;
import com.spire.presentation.packages.spryye;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public final class sprnuk
extends spryye {
    private final sprflh cfr_renamed_3;
    public static final int cfr_renamed_4 = 32;

    /*
     * WARNING - void declaration
     */
    public sprnuk(InputStream inputStream) throws IOException {
        super(false);
        void arg0;
        byte[] byArray = new byte[32];
        if (32 != sprkqe.cfr_renamed_476((InputStream)arg0, byArray)) {
            throw new EOFException(sprlzz.cfr_renamed_9("AoB\u0000aNgOqNpEvE`\u0000mN$MmD`La\u0000kF$e`\u00121\u00155\u0019$PqBhIg\u0000oE}"));
        }
        this.cfr_renamed_3 = sprnuk.cfr_renamed_8042(byArray, 0);
    }

    private static /* synthetic */ byte[] cfr_renamed_9971(byte[] arg0) {
        if (arg0.length != 32) {
            throw new IllegalArgumentException(sprmhba.cfr_renamed_9("\"'p#\"eh0v1%-d3`ei k\"q-%v7"));
        }
        return arg0;
    }

    public void cfr_renamed_8007(byte[] arg0, int arg1) {
        sprjrh.cfr_renamed_8841(this.cfr_renamed_3, arg0, arg1);
    }

    public byte[] cfr_renamed_91() {
        byte[] byArray = new byte[32];
        this.cfr_renamed_8007(byArray, 0);
        return byArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean cfr_renamed_9939(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        switch (arg0) {
            case 0: {
                if (null != arg1) {
                    throw new IllegalArgumentException(sprlzz.cfr_renamed_9("gT|"));
                }
                return sprjrh.cfr_renamed_8822(arg5, arg6, this.cfr_renamed_3, arg2, arg3, arg4);
            }
            case 1: {
                if (null == arg1) {
                    throw new NullPointerException(sprmhba.cfr_renamed_9("bf1}b%&d+k*qeg %+p)i"));
                }
                if (arg1.length > 255) {
                    throw new IllegalArgumentException(sprlzz.cfr_renamed_9("gT|"));
                }
                return sprjrh.cfr_renamed_8814(arg5, arg6, this.cfr_renamed_3, arg1, arg2, arg3, arg4);
            }
            case 2: {
                if (null == arg1) {
                    throw new NullPointerException(sprmhba.cfr_renamed_9("bf1}b%&d+k*qeg %+p)i"));
                }
                if (arg1.length > 255) {
                    throw new IllegalArgumentException(sprlzz.cfr_renamed_9("gT|"));
                }
                if (64 != arg4) {
                    throw new IllegalArgumentException(sprmhba.cfr_renamed_9("(v\"I k"));
                }
                return sprjrh.cfr_renamed_8834(arg5, arg6, this.cfr_renamed_3, arg1, arg2, arg3);
            }
        }
        throw new IllegalArgumentException("algorithm");
    }

    /*
     * WARNING - void declaration
     */
    public sprnuk(sprflh sprflh2) {
        super(false);
        void arg0;
        if (sprflh2 == null) {
            throw new NullPointerException(sprlzz.cfr_renamed_9("\u0007tUfLmCTOmNp\u0007$CeNjOp\u0000fE$NqLh"));
        }
        this.cfr_renamed_3 = arg0;
    }

    public sprnuk(byte[] arg0) {
        this(sprnuk.cfr_renamed_9971(arg0), 0);
    }

    /*
     * WARNING - void declaration
     */
    public sprnuk(byte[] byArray, int n) {
        super(false);
        void arg1;
        this.cfr_renamed_3 = sprnuk.cfr_renamed_8042(byArray, (int)arg1);
    }

    private static /* synthetic */ sprflh cfr_renamed_8042(byte[] arg0, int arg1) {
        sprflh sprflh2 = sprjrh.cfr_renamed_8810(arg0, arg1);
        if (sprflh2 == null) {
            throw new IllegalArgumentException(sprmhba.cfr_renamed_9(",k3d)l!%5p'i,fen |"));
        }
        return sprflh2;
    }
}

