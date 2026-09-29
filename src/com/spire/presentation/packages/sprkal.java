/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprirk;
import com.spire.presentation.packages.sprjs;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.spruy;
import com.spire.presentation.packages.sprvsk;

public class sprkal
extends sprvsk {
    @Override
    public byte[] cfr_renamed_10353(byte[] arg0) {
        byte[] byArray = new byte[4];
        if (arg0 != null) {
            sprpxe.cfr_renamed_442(arg0.length * 8, byArray, 0);
        }
        return byArray;
    }

    public sprkal(spruy arg0, sprjs arg1, spraq arg2) {
        super(arg0, arg1, arg2);
    }

    public sprkal(spruy arg0, sprjs arg1, spraq arg2, sprirk arg3) {
        super(arg0, arg1, arg2, arg3);
    }
}

