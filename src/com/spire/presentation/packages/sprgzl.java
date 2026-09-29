/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprazo;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprulg;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprgzl
extends sprqqe {
    private spraem cfr_renamed_3;
    private sprigm cfr_renamed_4;

    public String[] cfr_renamed_4487() {
        int n;
        if (this.cfr_renamed_3 == null) {
            return new String[0];
        }
        sprigm[] sprigmArray = this.cfr_renamed_3.cfr_renamed_289();
        String[] stringArray = new String[sprigmArray.length];
        int n2 = n = 0;
        while (n2 < sprigmArray.length) {
            sprco sprco2 = sprigmArray[n].cfr_renamed_313();
            stringArray[n] = sprco2 instanceof sprml ? ((sprml)((Object)sprco2)).cfr_renamed_314() : sprco2.toString();
            n2 = ++n;
        }
        return stringArray;
    }

    public static sprgzl cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprgzl) {
            return (sprgzl)arg0;
        }
        if (arg0 != null) {
            return new sprgzl(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprgzl(sprszm sprszm2) {
        int n;
        void arg0;
        if (sprszm2.cfr_renamed_84() < 1 || arg0.cfr_renamed_84() > 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprulg.cfr_renamed_9("'#\u0001b\u0016'\u00147\u0000,\u0006'E1\f8\u0000xE")).append(arg0.cfr_renamed_84()).toString());
        }
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_84()) {
            sprnvm sprnvm2 = sprnvm.cfr_renamed_23(arg0.cfr_renamed_85(n));
            switch (sprnvm2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_3 = spraem.cfr_renamed_5085(sprnvm2, false);
                    break;
                }
                case 1: {
                    this.cfr_renamed_4 = sprigm.cfr_renamed_5085(sprnvm2, true);
                    break;
                }
                default: {
                    throw new IllegalArgumentException(sprazo.cfr_renamed_9("uzKzOcN4TuG4Iz\u0000FOxEGYzTuX"));
                }
            }
            n2 = ++n;
        }
        return;
    }

    public String cfr_renamed_4488() {
        return ((sprml)((Object)this.cfr_renamed_4.cfr_renamed_313())).cfr_renamed_314();
    }

    public spraem cfr_renamed_4489() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprgzl(spraem spraem2, sprigm sprigm2) {
        void arg0;
        void arg1;
        if (sprigm2 == null || arg1.cfr_renamed_312() != 6 || ((sprml)((Object)arg1.cfr_renamed_313())).cfr_renamed_314().equals("")) {
            throw new IllegalArgumentException(sprulg.cfr_renamed_9("6\r'E0\n.\u0000b\u000b#\b'E\u000f0\u00111b\u0007'E,\n,E'\b2\u0011;E#\u000b&E\u000f0\u00111b\u00101\u0000b\u0011*\u0000b0\u0010,b\n2\u0011+\n,E-\u0003b\"'\u000b'\u0017#\t\f\u0004/\u0000"));
        }
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = arg1;
    }

    public sprgzl(sprigm arg0) {
        this(null, arg0);
    }

    public String toString() {
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2 = new StringBuffer(new StringBuilder().insert(0, sprazo.cfr_renamed_9("ZAyE.\u0000")).append(this.cfr_renamed_4488()).append(sprulg.cfr_renamed_9("EoE\u0003\u00106\rxE")).toString());
        if (this.cfr_renamed_3 == null || this.cfr_renamed_3.cfr_renamed_289().length == 0) {
            StringBuffer stringBuffer3 = stringBuffer2;
            stringBuffer = stringBuffer3;
            stringBuffer3.append(sprazo.cfr_renamed_9("n;a"));
        } else {
            String[] stringArray = this.cfr_renamed_4487();
            stringBuffer2.append('[').append(stringArray[0]);
            int n = 1;
            int n2 = n;
            while (n2 < stringArray.length) {
                stringBuffer2.append(sprulg.cfr_renamed_9("nE")).append(stringArray[n++]);
                n2 = n;
            }
            StringBuffer stringBuffer4 = stringBuffer2;
            stringBuffer = stringBuffer4;
            stringBuffer4.append(']');
        }
        return stringBuffer.toString();
    }

    /*
     * WARNING - void declaration
     */
    public sprgzl(String string) {
        this(new sprigm(6, (String)(arg0 == null ? "" : arg0)));
        void arg0;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        if (this.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_3));
        }
        sprrvm2.cfr_renamed_5004(new sprycn(1 != 0, 1, (sprco)this.cfr_renamed_4));
        return new sprcen(sprrvm2);
    }

    public sprigm cfr_renamed_4490() {
        return this.cfr_renamed_4;
    }
}

