/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprarg;
import com.spire.presentation.packages.sprbbe;
import com.spire.presentation.packages.sprdgb;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sproa;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class spraxa {
    private sprmke cfr_renamed_4;

    public spraxa(sprmke sprmke2) {
        this.cfr_renamed_4 = sprmke2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprdgb cfr_renamed_1441(sproa arg0) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            OutputStream outputStream = arg0.cfr_renamed_1442(byteArrayOutputStream);
            outputStream.write(this.cfr_renamed_4.cfr_renamed_91());
            outputStream.close();
            return new sprdgb(new sprbbe(arg0.cfr_renamed_615(), byteArrayOutputStream.toByteArray()));
        }
        catch (IOException iOException) {
            throw new IllegalStateException(sprarg.cfr_renamed_9("HGEHDR\u000bCEEDBN\u0006[TBPJRNmN_bHMI"));
        }
    }
}

