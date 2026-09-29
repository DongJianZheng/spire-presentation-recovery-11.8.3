/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprtjk
extends InputStream {
    public int cfr_renamed_3;
    private InputStream cfr_renamed_4;

    public sprtjk(InputStream inputStream) {
        sprtjk sprtjk2 = this;
        sprtjk2.cfr_renamed_3 = 0;
        sprtjk2.cfr_renamed_4 = inputStream;
    }

    private /* synthetic */ String cfr_renamed_9803() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n = 0;
        do {
            if ((n = this.cfr_renamed_4.read()) == -1) {
                if (byteArrayOutputStream.size() == 0) {
                    return null;
                }
                return byteArrayOutputStream.toString().trim();
            }
            byteArrayOutputStream.write(n & 0xFF);
        } while (n != 10);
        return byteArrayOutputStream.toString().trim();
    }

    @Override
    public int read() throws IOException {
        if (this.cfr_renamed_3 == Integer.MIN_VALUE) {
            return -1;
        }
        if (this.cfr_renamed_3 == 0) {
            String string = null;
            while ((string = this.cfr_renamed_9803()) != null && string.length() == 0) {
            }
            if (string == null) {
                return -1;
            }
            this.cfr_renamed_3 = Integer.parseInt(string.trim(), 16);
            if (this.cfr_renamed_3 == 0) {
                this.cfr_renamed_9803();
                this.cfr_renamed_3 = Integer.MIN_VALUE;
                return -1;
            }
        }
        sprtjk sprtjk2 = this;
        int n = sprtjk2.cfr_renamed_4.read();
        --sprtjk2.cfr_renamed_3;
        return n;
    }
}

