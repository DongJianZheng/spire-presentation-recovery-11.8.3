/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkoe;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprkfh {
    private int cfr_renamed_3;
    private final InputStream cfr_renamed_4;

    public String cfr_renamed_8520() throws IOException {
        int n;
        int n2;
        int n3;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (this.cfr_renamed_3 != -1) {
            if (this.cfr_renamed_3 == 13) {
                return "";
            }
            n3 = this.cfr_renamed_3;
            this.cfr_renamed_3 = -1;
            n2 = n3;
        } else {
            n2 = n3 = this.cfr_renamed_4.read();
        }
        while (n2 >= 0 && n3 != 13 && n3 != 10) {
            byteArrayOutputStream.write(n3);
            n2 = this.cfr_renamed_4.read();
        }
        if (n3 == 13 && (n = this.cfr_renamed_4.read()) != 10 && n >= 0) {
            this.cfr_renamed_3 = n;
        }
        if (n3 < 0) {
            return null;
        }
        return sprkoe.cfr_renamed_427(byteArrayOutputStream.toByteArray());
    }

    public sprkfh(InputStream inputStream) {
        sprkfh sprkfh2 = this;
        sprkfh2.cfr_renamed_3 = -1;
        sprkfh2.cfr_renamed_4 = inputStream;
    }
}

