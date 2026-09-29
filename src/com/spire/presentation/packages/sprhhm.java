/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprppr;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprwob;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprhhm
extends sprqqe
implements sprlm {
    public static final int cfr_renamed_1 = 1;
    public static final int cfr_renamed_2 = 0;
    public sprco cfr_renamed_3;
    public int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprhhm(int n, sprco sprco2) {
        void arg0;
        sprhhm sprhhm2 = this;
        sprhhm2.cfr_renamed_4 = arg0;
        sprhhm2.cfr_renamed_3 = sprco2;
    }

    /*
     * WARNING - void declaration
     */
    public sprhhm(sprnvm sprnvm2) {
        void arg0;
        sprhhm sprhhm2 = this;
        sprhhm2.cfr_renamed_4 = sprnvm2.cfr_renamed_312();
        if (sprhhm2.cfr_renamed_4 == 0) {
            this.cfr_renamed_3 = spraem.cfr_renamed_5085((sprnvm)arg0, false);
            return;
        }
        this.cfr_renamed_3 = spridn.cfr_renamed_5085((sprnvm)arg0, false);
    }

    public int cfr_renamed_324() {
        return this.cfr_renamed_4;
    }

    public static sprhhm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprhhm.cfr_renamed_23(sprnvm.cfr_renamed_5085(arg0, true));
    }

    public String toString() {
        StringBuffer stringBuffer;
        String string = sprkoe.cfr_renamed_5114();
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(sprppr.cfr_renamed_9("#\u001e\u0014\u0003\u0015\u001e\u0005\u0002\u0013\u001e\b\u00197\u0018\u000e\u0019\u00139\u0006\u001a\u0002MG,"));
        stringBuffer2.append(string);
        if (this.cfr_renamed_4 == 0) {
            StringBuffer stringBuffer3 = stringBuffer2;
            stringBuffer = stringBuffer3;
            this.cfr_renamed_4507(stringBuffer3, string, sprwob.cfr_renamed_9("&C,Z\u000eW-S"), this.cfr_renamed_3.toString());
        } else {
            this.cfr_renamed_4507(stringBuffer2, string, sprppr.cfr_renamed_9("\u0019\u0006\u001a\u0002%\u0002\u001b\u0006\u0003\u000e\u0001\u0002#\b45;.\u0004\u0014\u0002\u0002\u0005"), this.cfr_renamed_3.toString());
            stringBuffer = stringBuffer2;
        }
        stringBuffer.append("]");
        stringBuffer2.append(string);
        return stringBuffer2.toString();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprhhm sprhhm2 = this;
        return new sprycn(false, sprhhm2.cfr_renamed_4, sprhhm2.cfr_renamed_3);
    }

    public sprco cfr_renamed_313() {
        return this.cfr_renamed_3;
    }

    public static sprhhm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprhhm) {
            return (sprhhm)arg0;
        }
        if (arg0 instanceof sprnvm) {
            return new sprhhm((sprnvm)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprwob.cfr_renamed_9("C.].Y7X`Y\"\\%U4\u0016)X`P!U4Y2Oz\u0016")).append(arg0.getClass().getName()).toString());
    }

    public sprhhm(spraem arg0) {
        this(0, arg0);
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
}

