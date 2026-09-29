/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.SaveToImageOption;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sproci;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpl;
import com.spire.presentation.packages.sprvo;
import com.spire.presentation.packages.sprzll;
import java.security.SecureRandom;

public class sprefl
implements sprvo {
    private final sprgf cfr_renamed_2;
    private final SecureRandom cfr_renamed_3;
    private final int cfr_renamed_4;

    @Override
    public boolean cfr_renamed_10587(sprzll arg0, byte[] arg1) {
        if (arg1.length + arg0.cfr_renamed_3880().length != this.cfr_renamed_4) {
            throw new sprddl(sproci.cfr_renamed_9("B\u0007|\u0011n\u0005jBn\fkBx\u000b{\fj\u0011|B|\u0007l\u0010j\u0016/\u000ej\fh\u0016g\u0011/\u0006`Ba\r{Bb\u0003{\u0001gL"));
        }
        byte[] byArray = this.cfr_renamed_3879(arg0.cfr_renamed_3880(), arg1);
        return sproze.cfr_renamed_559(arg0.cfr_renamed_3881(), byArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprefl(sprpl sprpl2, SecureRandom secureRandom) {
        void arg0;
        sprefl sprefl2 = this;
        this.cfr_renamed_2 = arg0;
        sprefl2.cfr_renamed_4 = this.cfr_renamed_2.cfr_renamed_3248();
        sprefl2.cfr_renamed_3 = secureRandom;
    }

    @Override
    public sprzll cfr_renamed_3878(byte[] arg0) {
        if (arg0.length > this.cfr_renamed_4 / 2) {
            throw new sprddl(SaveToImageOption.cfr_renamed_9("*l\u0014z\u0006n\u0002)\u0013fGk\u0002)\u0004f\nd\u000e}\u0013l\u0003)\u0013fG}\bfGe\u0006{\u0000lGo\b{Gm\u000en\u0002z\u0013'"));
        }
        byte[] byArray = new byte[this.cfr_renamed_4 - arg0.length];
        this.cfr_renamed_3.nextBytes(byArray);
        return new sprzll(byArray, this.cfr_renamed_3879(byArray, arg0));
    }

    private /* synthetic */ byte[] cfr_renamed_3879(byte[] arg0, byte[] arg1) {
        sprefl sprefl2 = this;
        byte[] byArray = new byte[sprefl2.cfr_renamed_2.cfr_renamed_1218()];
        sprefl2.cfr_renamed_2.cfr_renamed_1197(arg0, 0, arg0.length);
        this.cfr_renamed_2.cfr_renamed_1197(arg1, 0, arg1.length);
        this.cfr_renamed_2.cfr_renamed_1221((byte)(arg1.length >>> 8));
        this.cfr_renamed_2.cfr_renamed_1221((byte)arg1.length);
        this.cfr_renamed_2.cfr_renamed_1219(byArray, 0);
        return byArray;
    }
}

