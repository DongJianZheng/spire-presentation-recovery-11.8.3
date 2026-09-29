/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgl;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprql;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvi;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class sprmzd
implements sprql,
sprvi {
    private final File cfr_renamed_1;
    private static final int cfr_renamed_2 = 32768;
    private final byte[] cfr_renamed_3;
    private final sprtzd cfr_renamed_4;

    @Override
    public Object cfr_renamed_480() {
        return this.cfr_renamed_1;
    }

    @Override
    public sprtzd cfr_renamed_696() {
        return this.cfr_renamed_4;
    }

    public sprmzd(File arg0) {
        this(arg0, 32768);
    }

    /*
     * WARNING - void declaration
     */
    public sprmzd(File file, int n) {
        this(new sprtzd(sprgl.cfr_renamed_152.cfr_renamed_19()), (File)arg0, (int)arg1);
        void arg1;
        void arg0;
    }

    @Override
    public InputStream cfr_renamed_2920() throws IOException, sprlqd {
        return new BufferedInputStream(new FileInputStream(this.cfr_renamed_1), 32768);
    }

    @Override
    public void cfr_renamed_624(OutputStream arg0) throws IOException, sprlqd {
        int n;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = fileInputStream = new FileInputStream(this.cfr_renamed_1);
        while ((n = fileInputStream2.read(this.cfr_renamed_3, 0, this.cfr_renamed_3.length)) > 0) {
            fileInputStream2 = fileInputStream;
            arg0.write(this.cfr_renamed_3, 0, n);
        }
        fileInputStream.close();
    }

    /*
     * WARNING - void declaration
     */
    public sprmzd(sprtzd sprtzd2, File file, int n) {
        void arg1;
        void arg0;
        sprmzd sprmzd2 = this;
        this.cfr_renamed_4 = arg0;
        sprmzd2.cfr_renamed_1 = arg1;
        sprmzd2.cfr_renamed_3 = new byte[n];
    }
}

