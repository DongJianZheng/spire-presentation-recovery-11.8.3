/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprzcm;
import java.io.IOException;
import java.security.SecureRandom;

public class spruim
extends sprzcm {
    private final byte[] cfr_renamed_4;

    public spruim(int arg0, SecureRandom arg1) {
        this(spruim.cfr_renamed_11080(arg0, arg1));
    }

    @Override
    public void cfr_renamed_11038(sprjah arg0) throws IOException {
        arg0.cfr_renamed_11039(21, this.cfr_renamed_4);
    }

    public spruim(byte[] byArray) {
        this.cfr_renamed_4 = byArray;
    }

    public byte[] cfr_renamed_5888() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    private static /* synthetic */ byte[] cfr_renamed_11080(int arg0, SecureRandom arg1) {
        byte[] byArray = new byte[arg0];
        arg1.nextBytes(byArray);
        return byArray;
    }

    public spruim(sprmam sprmam2) throws IOException {
        this.cfr_renamed_4 = sprkqe.cfr_renamed_471(sprmam2);
    }
}

