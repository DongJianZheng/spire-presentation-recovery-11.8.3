/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprku;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprsv;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class sprdwl
implements sprsv,
sprku {
    private final int cfr_renamed_1;
    private final sprlem cfr_renamed_2;
    private static final int cfr_renamed_3 = 32768;
    private final File cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprdwl(sprlem sprlem2, File file, int n) {
        void arg1;
        void arg0;
        sprdwl sprdwl2 = this;
        this.cfr_renamed_2 = arg0;
        sprdwl2.cfr_renamed_4 = arg1;
        sprdwl2.cfr_renamed_1 = n;
    }

    public sprdwl(File arg0) {
        this(arg0, 32768);
    }

    @Override
    public void cfr_renamed_624(OutputStream arg0) throws IOException, sprlyl {
        FileInputStream fileInputStream = new FileInputStream(this.cfr_renamed_4);
        sprkqe.cfr_renamed_5195(fileInputStream, arg0, this.cfr_renamed_1);
        fileInputStream.close();
    }

    @Override
    public sprlem cfr_renamed_696() {
        return this.cfr_renamed_2;
    }

    @Override
    public Object cfr_renamed_480() {
        return this.cfr_renamed_4;
    }

    @Override
    public InputStream cfr_renamed_2920() throws IOException, sprlyl {
        return new BufferedInputStream(new FileInputStream(this.cfr_renamed_4), this.cfr_renamed_1);
    }

    public sprdwl(File arg0, int arg1) {
        this(sprgz.cfr_renamed_3, arg0, arg1);
    }
}

