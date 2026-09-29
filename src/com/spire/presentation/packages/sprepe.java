/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprewe;
import com.spire.presentation.packages.sprhdf;
import com.spire.presentation.packages.sprlne;
import com.spire.presentation.packages.sprtve;
import java.math.BigInteger;

public class sprepe
extends sprlne {
    public sprepe(String arg0, int arg1) {
        sprtve[] sprtveArray = new sprtve[1];
        sprtveArray[0] = new sprewe(sprhdf.cfr_renamed_514(new BigInteger(arg0, arg1)));
        super(sprtveArray);
    }

    public sprepe(int arg0, byte[] arg1) {
        sprtve[] sprtveArray = new sprtve[1];
        sprtveArray[0] = new sprewe(arg0, arg1);
        super(sprtveArray);
    }

    public sprepe(String arg0) {
        this(arg0, 10);
    }

    public sprepe(byte[] arg0) {
        sprtve[] sprtveArray = new sprtve[1];
        sprtveArray[0] = new sprewe(arg0);
        super(sprtveArray);
    }
}

