/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcch;
import com.spire.presentation.packages.sprejh;
import com.spire.presentation.packages.sprfhh;
import com.spire.presentation.packages.sprfwl;
import com.spire.presentation.packages.sprhkh;
import com.spire.presentation.packages.sprich;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmh;
import com.spire.presentation.packages.sprpih;
import com.spire.presentation.packages.sprslh;
import com.spire.presentation.packages.sprych;
import java.io.IOException;
import java.io.OutputStream;

public class sprjmh
extends sprhkh {
    private final OutputStream cfr_renamed_1;
    private final sprmh cfr_renamed_2;
    private final String cfr_renamed_3;
    private final sprfwl cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprjmh(sprslh sprslh2, sprmh sprmh2, OutputStream outputStream) {
        void arg1;
        void arg0;
        sprjmh sprjmh2 = this;
        sprjmh sprjmh3 = this;
        super(new sprfhh(sprjmh.cfr_renamed_8496(sprslh.cfr_renamed_8516((sprslh)arg0)), arg0.cfr_renamed_4));
        sprjmh3.cfr_renamed_4 = sprslh.cfr_renamed_8517((sprslh)arg0);
        sprjmh3.cfr_renamed_3 = arg0.cfr_renamed_4;
        sprjmh2.cfr_renamed_2 = arg1;
        sprjmh2.cfr_renamed_1 = outputStream;
    }

    public /* synthetic */ sprjmh(sprslh arg0, sprmh arg1, OutputStream arg2, sprpih arg3) {
        this(arg0, arg1, arg2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public OutputStream cfr_renamed_4004() throws IOException {
        sprjmh sprjmh2 = this;
        ((sprfhh)((Object)this.cfr_renamed_4)).cfr_renamed_8495(sprjmh2.cfr_renamed_1);
        sprjmh2.cfr_renamed_1.write(sprkoe.cfr_renamed_433("\r\n"));
        try {
            OutputStream outputStream = this.cfr_renamed_1;
            if ("base64".equals(this.cfr_renamed_3)) {
                outputStream = new sprych(outputStream);
            }
            OutputStream outputStream2 = this.cfr_renamed_4.cfr_renamed_8518(sprich.cfr_renamed_8493(outputStream), this.cfr_renamed_2);
            return new sprejh(outputStream2, outputStream);
        }
        catch (sprlyl sprlyl2) {
            throw new sprcch(sprlyl2.getMessage(), sprlyl2);
        }
    }
}

