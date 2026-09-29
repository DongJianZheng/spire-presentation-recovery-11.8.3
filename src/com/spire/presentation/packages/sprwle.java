/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdcz;
import com.spire.presentation.packages.sprilaa;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprmm;
import com.spire.presentation.packages.sprom;

public class sprwle
implements sprmm {
    private String cfr_renamed_1;
    private Throwable cfr_renamed_2;
    private boolean cfr_renamed_3;
    private static final String cfr_renamed_4 = sprkoe.cfr_renamed_5114();

    @Override
    public String toString() {
        return this.cfr_renamed_1;
    }

    @Override
    public boolean cfr_renamed_3228() {
        return this.cfr_renamed_3;
    }

    public static sprmm cfr_renamed_5115(sprom arg0, String arg1) {
        return new sprwle(true, arg0.cfr_renamed_313() + ": " + arg1);
    }

    public static sprmm cfr_renamed_5116(sprom arg0, String arg1) {
        return new sprwle(false, arg0.cfr_renamed_313() + ": " + arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprwle(boolean bl, String string) {
        void arg0;
        sprwle sprwle2 = this;
        sprwle2.cfr_renamed_3 = arg0;
        sprwle2.cfr_renamed_1 = string;
    }

    /*
     * WARNING - void declaration
     */
    public sprwle(boolean bl, String string, Throwable throwable) {
        void arg1;
        void arg0;
        sprwle sprwle2 = this;
        this.cfr_renamed_3 = arg0;
        sprwle2.cfr_renamed_1 = arg1;
        sprwle2.cfr_renamed_2 = throwable;
    }

    public static String cfr_renamed_5117(String arg0, String arg1, String arg2, String arg3) {
        StringBuffer stringBuffer = new StringBuffer(arg0);
        StringBuffer stringBuffer2 = stringBuffer.append(sprilaa.cfr_renamed_9("R\u001d\u0013\u0012\u001e\u0012\u001c\u001cR")).append(arg1);
        StringBuffer stringBuffer3 = stringBuffer;
        stringBuffer.append(cfr_renamed_4).append(sprdcz.cfr_renamed_9("\u000bQ\u000bQN\t[\u0014H\u0005N\u0015\u0011Q")).append(arg2);
        stringBuffer3.append(cfr_renamed_4).append(sprilaa.cfr_renamed_9("[R[R\u001c\u001d\u000fR[R[RAR")).append(arg3);
        return stringBuffer3.toString();
    }

    /*
     * WARNING - void declaration
     */
    public static sprmm cfr_renamed_5118(sprom sprom2, String string, Object object, Object object2) {
        void arg3;
        void arg2;
        void arg1;
        sprom arg0;
        return sprwle.cfr_renamed_5116(arg0, (String)arg1 + cfr_renamed_4 + sprdcz.cfr_renamed_9("n\t[\u0014H\u0005N\u0015\u0011Q") + arg2 + cfr_renamed_4 + sprilaa.cfr_renamed_9("=\u001d\u000e\u001c\u001fR[RAR") + arg3);
    }

    public static sprmm cfr_renamed_5119(sprom arg0, String arg1, Throwable arg2) {
        return new sprwle(false, arg0.cfr_renamed_313() + ": " + arg1, arg2);
    }

    @Override
    public Throwable cfr_renamed_3223() {
        return this.cfr_renamed_2;
    }
}

