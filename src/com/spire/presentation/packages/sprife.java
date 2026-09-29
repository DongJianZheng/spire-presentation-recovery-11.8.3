/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprdin;
import com.spire.presentation.packages.sprhno;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprx;
import com.spire.presentation.packages.spryee;
import com.spire.presentation.packages.spryte;

public class sprife
extends sprkra {
    private sprmee cfr_renamed_3;
    private spryee cfr_renamed_4;

    public String[] cfr_renamed_4487() {
        int n;
        if (this.cfr_renamed_4 == null) {
            return new String[0];
        }
        sprmee[] sprmeeArray = this.cfr_renamed_4.cfr_renamed_289();
        String[] stringArray = new String[sprmeeArray.length];
        int n2 = n = 0;
        while (n2 < sprmeeArray.length) {
            spra spra2 = sprmeeArray[n].cfr_renamed_313();
            stringArray[n] = spra2 instanceof sprx ? ((sprx)((Object)spra2)).cfr_renamed_314() : spra2.toString();
            n2 = ++n;
        }
        return stringArray;
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(new sprhse(0 != 0, 0, this.cfr_renamed_4));
        }
        sprlre2.cfr_renamed_49(new sprhse(1 != 0, 1, this.cfr_renamed_3));
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprife(String string) {
        this(new sprmee(6, (String)(arg0 == null ? "" : arg0)));
        void arg0;
    }

    public sprife(sprmee arg0) {
        this(null, arg0);
    }

    public String toString() {
        StringBuffer stringBuffer;
        StringBuffer stringBuffer2 = new StringBuffer(new StringBuilder().insert(0, sprdin.cfr_renamed_9("z=Y9\u000e|")).append(this.cfr_renamed_4488()).append(sprhno.cfr_renamed_9("ThT\u0004\u00011\u001c\u007fT")).toString());
        if (this.cfr_renamed_4 == null || this.cfr_renamed_4.cfr_renamed_289().length == 0) {
            StringBuffer stringBuffer3 = stringBuffer2;
            stringBuffer = stringBuffer3;
            stringBuffer3.append(sprdin.cfr_renamed_9("\u0012\u001b\u001d"));
        } else {
            String[] stringArray = this.cfr_renamed_4487();
            stringBuffer2.append('[').append(stringArray[0]);
            int n = 1;
            int n2 = n;
            while (n2 < stringArray.length) {
                stringBuffer2.append(sprhno.cfr_renamed_9("iT")).append(stringArray[n++]);
                n2 = n;
            }
            StringBuffer stringBuffer4 = stringBuffer2;
            stringBuffer = stringBuffer4;
            stringBuffer4.append(']');
        }
        return stringBuffer.toString();
    }

    public spryee cfr_renamed_4489() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprife(spryee spryee2, sprmee sprmee2) {
        void arg0;
        void arg1;
        if (sprmee2 == null || arg1.cfr_renamed_312() != 6 || ((sprx)((Object)arg1.cfr_renamed_313())).cfr_renamed_314().equals("")) {
            throw new IllegalArgumentException(sprdin.cfr_renamed_9("@4Q|F3X9\u00142U1Q|y\tg\b\u0014>Q|Z3Z|Q1D(M|U2P|y\tg\b\u0014)G9\u0014(\\9\u0014\tf\u0015\u00143D(]3Z|[:\u0014\u001bQ2Q.U0z=Y9"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_3 = arg1;
    }

    public sprmee cfr_renamed_4490() {
        return this.cfr_renamed_3;
    }

    public static sprife cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprife) {
            return (sprife)arg0;
        }
        if (arg0 != null) {
            return new sprife(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    public String cfr_renamed_4488() {
        return ((sprx)((Object)this.cfr_renamed_3.cfr_renamed_313())).cfr_renamed_314();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprife(sprbne sprbne2) {
        int n;
        void arg0;
        if (sprbne2.cfr_renamed_84() < 1 || arg0.cfr_renamed_84() > 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprhno.cfr_renamed_9("6$\u0010e\u0007 \u00050\u0011+\u0017 T6\u001d?\u0011\u007fT")).append(arg0.cfr_renamed_84()).toString());
        }
        int n2 = n = 0;
        while (n2 != arg0.cfr_renamed_84()) {
            spryte spryte2 = spryte.cfr_renamed_23(arg0.cfr_renamed_85(n));
            switch (spryte2.cfr_renamed_312()) {
                case 0: {
                    this.cfr_renamed_4 = spryee.cfr_renamed_341(spryte2, false);
                    break;
                }
                case 1: {
                    this.cfr_renamed_3 = sprmee.cfr_renamed_341(spryte2, true);
                    break;
                }
                default: {
                    throw new IllegalArgumentException(sprdin.cfr_renamed_9("\tZ7Z3C2\u0014(U;\u00145Z|f3X9g%Z(U$"));
                }
            }
            n2 = ++n;
        }
        return;
    }
}

