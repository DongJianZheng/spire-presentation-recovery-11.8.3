/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprasp;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhlaa;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpl;
import com.spire.presentation.packages.sprvo;
import com.spire.presentation.packages.sprzll;
import java.security.SecureRandom;

public class sprcml
implements sprvo {
    private final sprgf cfr_renamed_2;
    private final int cfr_renamed_3;
    private final SecureRandom cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprcml(sprpl sprpl2, SecureRandom secureRandom) {
        void arg0;
        sprcml sprcml2 = this;
        this.cfr_renamed_2 = arg0;
        sprcml2.cfr_renamed_3 = this.cfr_renamed_2.cfr_renamed_3248();
        sprcml2.cfr_renamed_4 = secureRandom;
    }

    @Override
    public sprzll cfr_renamed_3878(byte[] arg0) {
        if (arg0.length > this.cfr_renamed_3 / 2) {
            throw new sprddl(sprhlaa.cfr_renamed_9("\u001b#%57!3f\")v$3f5);+?2\"#2f\")v29)v*741#v 94v\"?!35\"h"));
        }
        byte[] byArray = new byte[this.cfr_renamed_3 - arg0.length];
        this.cfr_renamed_4.nextBytes(byArray);
        return new sprzll(byArray, this.cfr_renamed_3879(byArray, arg0));
    }

    private /* synthetic */ byte[] cfr_renamed_3879(byte[] arg0, byte[] arg1) {
        sprcml sprcml2 = this;
        byte[] byArray = new byte[sprcml2.cfr_renamed_2.cfr_renamed_1218()];
        sprcml2.cfr_renamed_2.cfr_renamed_1197(arg0, 0, arg0.length);
        this.cfr_renamed_2.cfr_renamed_1197(arg1, 0, arg1.length);
        this.cfr_renamed_2.cfr_renamed_1219(byArray, 0);
        return byArray;
    }

    @Override
    public boolean cfr_renamed_10587(sprzll arg0, byte[] arg1) {
        if (arg1.length + arg0.cfr_renamed_3880().length != this.cfr_renamed_3) {
            throw new sprddl(sprasp.cfr_renamed_9("8\f\u0006\u001a\u0014\u000e\u0010I\u0014\u0007\u0011I\u0002\u0000\u0001\u0007\u0010\u001a\u0006I\u0006\f\u0016\u001b\u0010\u001dU\u0005\u0010\u0007\u0012\u001d\u001d\u001aU\r\u001aI\u001b\u0006\u0001I\u0018\b\u0001\n\u001dG"));
        }
        byte[] byArray = this.cfr_renamed_3879(arg0.cfr_renamed_3880(), arg1);
        return sproze.cfr_renamed_559(arg0.cfr_renamed_3881(), byArray);
    }
}

