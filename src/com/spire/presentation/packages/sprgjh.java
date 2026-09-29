/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfhh;
import com.spire.presentation.packages.sprtih;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class sprgjh
extends FilterOutputStream {
    public int cfr_renamed_2 = -1;
    private final boolean cfr_renamed_3;
    public static byte[] cfr_renamed_4 = new byte[2];

    @Override
    public void write(byte[] arg0) throws IOException {
        this.write(arg0, 0, arg0.length);
    }

    @Override
    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        int n;
        int n2 = n = arg1;
        while (n2 != arg1 + arg2) {
            this.write(arg0[n++]);
            n2 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprgjh(sprtih sprtih2, sprfhh sprfhh2, OutputStream outputStream) {
        super((OutputStream)arg2);
        void arg0;
        void arg2;
        if (sprfhh2.cfr_renamed_696() != null) {
            void arg1;
            this.cfr_renamed_3 = arg1.cfr_renamed_696() != null && !arg1.cfr_renamed_696().equals("binary");
            return;
        }
        this.cfr_renamed_3 = arg0.cfr_renamed_8508().equals("7bit");
    }

    @Override
    public void write(int arg0) throws IOException {
        block2: {
            sprgjh sprgjh2;
            block4: {
                block0: {
                    block3: {
                        block1: {
                            if (!this.cfr_renamed_3) break block0;
                            if (arg0 != 13) break block1;
                            sprgjh sprgjh3 = this;
                            sprgjh2 = sprgjh3;
                            sprgjh3.out.write(cfr_renamed_4);
                            break block2;
                        }
                        if (arg0 != 10) break block3;
                        if (this.cfr_renamed_2 == 13) break block4;
                        sprgjh sprgjh4 = this;
                        sprgjh2 = sprgjh4;
                        sprgjh4.out.write(cfr_renamed_4);
                        break block2;
                    }
                    sprgjh sprgjh5 = this;
                    sprgjh2 = sprgjh5;
                    sprgjh5.out.write(arg0);
                    break block2;
                }
                this.out.write(arg0);
            }
            sprgjh2 = this;
        }
        sprgjh2.cfr_renamed_2 = arg0;
    }

    public void cfr_renamed_8532() throws IOException {
        this.out.write(cfr_renamed_4);
    }

    static {
        sprgjh.cfr_renamed_4[0] = 13;
        sprgjh.cfr_renamed_4[1] = 10;
    }
}

