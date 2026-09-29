/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraqy;
import com.spire.presentation.packages.sprar;
import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprjre;
import com.spire.presentation.packages.sprklk;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sproze;
import java.io.IOException;

public abstract class sprfhm
extends sprklk
implements sprar {
    private final byte[] cfr_renamed_4;

    @Override
    public void cfr_renamed_11038(sprjah arg0) throws IOException {
        arg0.write(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprfhm(int n, byte[] byArray) {
        void arg1;
        void arg0;
        if (byArray.length != arg0) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, spraqy.cfr_renamed_9("&W6A#\\0M6]sR6@s\\=Z<]:W4\u0019?\\=^'Qi\u00196A#\\0M6]s")).append((int)arg0).append(sprjre.cfr_renamed_9("k}2k.lg?,p??")).append(((void)arg1).length).toString());
        }
        this.cfr_renamed_4 = new byte[arg0];
        System.arraycopy(arg1, 0, this.cfr_renamed_4, 0, (int)arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_91() {
        try {
            return super.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public String cfr_renamed_7832() {
        return spraqy.cfr_renamed_9("\u0003~\u0003");
    }

    /*
     * WARNING - void declaration
     */
    public sprfhm(int n, sprmam sprmam2) throws IOException {
        void arg0;
        sprfhm sprfhm2 = this;
        sprfhm2.cfr_renamed_4 = new byte[arg0];
        sprmam2.cfr_renamed_4932(sprfhm2.cfr_renamed_4);
    }

    public byte[] cfr_renamed_1521() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }
}

