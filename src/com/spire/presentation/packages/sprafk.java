/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcye;
import com.spire.presentation.packages.sprhln;
import com.spire.presentation.packages.sprrkk;
import com.spire.presentation.packages.sprtue;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class sprafk
extends InputStream {
    public final byte[] cfr_renamed_152;
    public int cfr_renamed_112;
    public boolean cfr_renamed_119;
    public long cfr_renamed_91;
    public final InputStream cfr_renamed_0;
    public int cfr_renamed_1;
    public final OutputStream cfr_renamed_2;
    public final Long cfr_renamed_3;
    public final byte[] cfr_renamed_4;

    @Override
    public void close() throws IOException {
        this.cfr_renamed_0.close();
    }

    /*
     * WARNING - void declaration
     */
    public sprafk(InputStream inputStream, Long l) {
        void arg0;
        sprafk sprafk2 = this;
        sprafk sprafk3 = this;
        sprafk3.cfr_renamed_152 = new byte[1024];
        sprafk3.cfr_renamed_4 = new byte[768];
        sprafk2.cfr_renamed_0 = arg0;
        sprafk sprafk4 = this;
        sprafk2.cfr_renamed_2 = new sprrkk(this);
        sprafk2.cfr_renamed_3 = l;
    }

    public int cfr_renamed_9804() throws IOException {
        sprafk sprafk2;
        int n;
        int n2 = 0;
        int n3 = 0;
        do {
            if (this.cfr_renamed_3 != null && this.cfr_renamed_91 > this.cfr_renamed_3) {
                return -1;
            }
            n2 = this.cfr_renamed_0.read();
            if (n2 >= 33 || n2 == 13 || n2 == 10) {
                if (n3 >= this.cfr_renamed_152.length) {
                    throw new IOException(sprhln.cfr_renamed_9("Jhgsli}']uhizalu)Bgdfc`in+)ehtl1='engb)klinsa'7'87;3"));
                }
                sprafk sprafk3 = this;
                sprafk3.cfr_renamed_152[n3++] = (byte)n2;
                ++sprafk3.cfr_renamed_91;
                n = n2;
                continue;
            }
            if (n2 >= 0) {
                ++this.cfr_renamed_91;
            }
            n = n2;
        } while (n > -1 && n3 < this.cfr_renamed_152.length && n2 != 10);
        if (n3 > 0) {
            try {
                sprtue.cfr_renamed_272(this.cfr_renamed_152, 0, n3, this.cfr_renamed_2);
                sprafk2 = this;
            }
            catch (Exception exception) {
                throw new IOException(new StringBuilder().insert(0, sprcye.cfr_renamed_9("\u0018\u0010?\u001a8\u0010|7=\u00069ChU\u001f\u001a2\u00019\u001b(X\b\u0007=\u001b/\u00139\u0007q02\u00163\u00115\u001b;O|")).append(exception).toString());
            }
        } else {
            if (n2 == -1) {
                return -1;
            }
            sprafk2 = this;
        }
        return sprafk2.cfr_renamed_112;
    }

    public sprafk(InputStream arg0) {
        this(arg0, null);
    }

    @Override
    public int read() throws IOException {
        sprafk sprafk2 = this;
        if (sprafk2.cfr_renamed_1 == sprafk2.cfr_renamed_112) {
            this.cfr_renamed_1 = 0;
            this.cfr_renamed_112 = 0;
            int n = this.cfr_renamed_9804();
            if (n == -1) {
                return n;
            }
        }
        return this.cfr_renamed_4[this.cfr_renamed_1++] & 0xFF;
    }
}

