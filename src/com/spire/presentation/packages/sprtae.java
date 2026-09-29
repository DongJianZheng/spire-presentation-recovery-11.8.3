/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.AppException;
import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprauq;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.spryee;
import com.spire.presentation.packages.spryte;

public class sprtae
extends sprkra
implements sprkj {
    public spra cfr_renamed_1;
    public int cfr_renamed_2;
    public static final int cfr_renamed_3 = 0;
    public static final int cfr_renamed_4 = 1;

    public sprtae(spryee arg0) {
        this(0, arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprtae(int n, spra spra2) {
        void arg0;
        sprtae sprtae2 = this;
        sprtae2.cfr_renamed_2 = arg0;
        sprtae2.cfr_renamed_1 = spra2;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprtae sprtae2 = this;
        return new sprhse(false, sprtae2.cfr_renamed_2, sprtae2.cfr_renamed_1);
    }

    public int cfr_renamed_324() {
        return this.cfr_renamed_2;
    }

    public spra cfr_renamed_313() {
        return this.cfr_renamed_1;
    }

    private /* synthetic */ void cfr_renamed_4507(StringBuffer arg0, String arg1, String arg2, String arg3) {
        String string = "    ";
        arg0.append(string);
        arg0.append(arg2);
        arg0.append(":");
        arg0.append(arg1);
        arg0.append(string);
        arg0.append(string);
        arg0.append(arg3);
        arg0.append(arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprtae(spryte spryte2) {
        void arg0;
        sprtae sprtae2 = this;
        sprtae2.cfr_renamed_2 = spryte2.cfr_renamed_312();
        if (sprtae2.cfr_renamed_2 == 0) {
            this.cfr_renamed_1 = spryee.cfr_renamed_341((spryte)arg0, false);
            return;
        }
        this.cfr_renamed_1 = sprere.cfr_renamed_341((spryte)arg0, false);
    }

    public String toString() {
        StringBuffer stringBuffer;
        String string = System.getProperty(sprauq.cfr_renamed_9("w$u(5>~=z?z9t?"));
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(AppException.cfr_renamed_9("a)V4W)G5Q)J.u/L.Q\u000eD-@z\u0005\u001b"));
        stringBuffer2.append(string);
        if (this.cfr_renamed_2 == 0) {
            StringBuffer stringBuffer3 = stringBuffer2;
            stringBuffer = stringBuffer3;
            this.cfr_renamed_4507(stringBuffer3, string, sprauq.cfr_renamed_9("}8w!U,v("), this.cfr_renamed_1.toString());
        } else {
            this.cfr_renamed_4507(stringBuffer2, string, AppException.cfr_renamed_9(".D-@\u0012@,D4L6@\u0014J\u0003w\fl3V5@2"), this.cfr_renamed_1.toString());
            stringBuffer = stringBuffer2;
        }
        stringBuffer.append("]");
        stringBuffer2.append(string);
        return stringBuffer2.toString();
    }

    public static sprtae cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprtae) {
            return (sprtae)arg0;
        }
        if (arg0 instanceof spryte) {
            return new sprtae((spryte)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprauq.cfr_renamed_9("8u&u\"l#;\"y'~.omr#;+z.o\"i4!m")).append(arg0.getClass().getName()).toString());
    }

    public static sprtae cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprtae.cfr_renamed_23(spryte.cfr_renamed_341(arg0, true));
    }
}

