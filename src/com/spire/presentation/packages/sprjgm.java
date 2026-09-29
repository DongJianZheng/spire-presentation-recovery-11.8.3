/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprhhm;
import com.spire.presentation.packages.sprjjy;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprpnia;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxfm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprjgm
extends sprqqe {
    public sprhhm cfr_renamed_2;
    public spraem cfr_renamed_3;
    public sprxfm cfr_renamed_4;

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

    public String toString() {
        String string = sprkoe.cfr_renamed_5114();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(sprjjy.cfr_renamed_9("\u0014n#s\"n2r$n?i\u0000h9i$=p\\"));
        stringBuffer.append(string);
        if (this.cfr_renamed_2 != null) {
            this.cfr_renamed_4507(stringBuffer, string, sprpnia.cfr_renamed_9("n y=x h<~ e'Z&c'~"), this.cfr_renamed_2.toString());
        }
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_4507(stringBuffer, string, sprjjy.cfr_renamed_9("u5f#h>t"), this.cfr_renamed_4.toString());
        }
        if (this.cfr_renamed_3 != null) {
            this.cfr_renamed_4507(stringBuffer, string, sprpnia.cfr_renamed_9("i\u001bF\u0000y:\u007f,x"), this.cfr_renamed_3.toString());
        }
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer2.append("]");
        stringBuffer.append(string);
        return stringBuffer2.toString();
    }

    /*
     * WARNING - void declaration
     */
    public sprjgm(sprhhm sprhhm2, sprxfm sprxfm2, spraem spraem2) {
        void arg1;
        void arg0;
        sprjgm sprjgm2 = this;
        this.cfr_renamed_2 = arg0;
        sprjgm2.cfr_renamed_4 = arg1;
        sprjgm2.cfr_renamed_3 = spraem2;
    }

    public spraem cfr_renamed_2186() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public sprjgm(sprszm sprszm2) {
        int n;
        int n2 = n = 0;
        void arg0;
        while (n2 != arg0.cfr_renamed_84()) {
            sprnvm sprnvm2 = sprnvm.cfr_renamed_23(arg0.cfr_renamed_85(n));
            switch (sprnvm2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_2 = sprhhm.cfr_renamed_5085(sprnvm2, true);
                    break;
                }
                case 1: {
                    this.cfr_renamed_4 = new sprxfm(sprgbf.cfr_renamed_5085(sprnvm2, false));
                    break;
                }
                case 2: {
                    this.cfr_renamed_3 = spraem.cfr_renamed_5085(sprnvm2, false);
                    break;
                }
                default: {
                    throw new IllegalArgumentException(new StringBuilder().insert(0, sprjjy.cfr_renamed_9("\u0005i;i?p>'$f7'5i3h%i$b\"b4'9ipt$u%d$r\"bj'")).append(sprnvm2.cfr_renamed_312()).toString());
                }
            }
            n2 = ++n;
        }
        return;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        if (this.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0, this.cfr_renamed_2));
        }
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)this.cfr_renamed_4));
        }
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 2, (sprco)this.cfr_renamed_3));
        }
        return new sprcen(sprrvm2);
    }

    public static sprjgm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprjgm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public sprxfm cfr_renamed_2204() {
        return this.cfr_renamed_4;
    }

    public sprhhm cfr_renamed_323() {
        return this.cfr_renamed_2;
    }

    public static sprjgm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprjgm) {
            return (sprjgm)arg0;
        }
        if (arg0 instanceof sprszm) {
            return new sprjgm((sprszm)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprpnia.cfr_renamed_9("C'|(f niN y=x h<~ e'Z&c'~s*")).append(arg0.getClass().getName()).toString());
    }
}

