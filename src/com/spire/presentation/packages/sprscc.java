/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.drawing.GradientStopData;
import com.spire.presentation.packages.sprr;
import com.spire.presentation.packages.sprseea;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprydb;

public abstract class sprscc
extends sprydb {
    public void cfr_renamed_2461(sprr arg0, String arg1, String arg2, String arg3) {
        String string = new StringBuilder().insert(0, sprseea.cfr_renamed_9("$>-0")).append(arg1).toString();
        sprr sprr2 = arg0;
        sprr2.cfr_renamed_1260(GradientStopData.cfr_renamed_9("m<Cs") + string, arg2);
        arg0.cfr_renamed_1260(new StringBuilder().insert(0, sprseea.cfr_renamed_9("2\u0000\u0014B2\u0000\u001a\r\u0000B>\r\u0010B;!2/^")).append(arg1).toString(), string);
        sprr2.cfr_renamed_1260(new StringBuilder().insert(0, GradientStopData.cfr_renamed_9("\u001cL:\u000e\u001cL4A.\u000e\u0010A>\u000e\u0015m\u001ccr")).append(arg1).toString(), string);
        sprr2.cfr_renamed_1260(new StringBuilder().insert(0, sprseea.cfr_renamed_9("8\t\n+\u0016\u0002\u0016\u001e\u0012\u0018\u001c\u001e]")).append(string).toString(), arg3);
        sprr2.cfr_renamed_1260(new StringBuilder().insert(0, GradientStopData.cfr_renamed_9("a1Gsa1I<Ssk8Y\u001aE3E/A)O/\u000e\u0015m\u001ccp")).append(arg1).toString(), string);
        sprr2.cfr_renamed_1260(new StringBuilder().insert(0, sprseea.cfr_renamed_9("-\u001f\u000b]-\u001f\u0005\u0012\u001f]'\u0016\u00154\t\u001d\t\u0001\r\u0007\u0003\u0001B;!2/\\")).append(arg1).toString(), string);
    }

    public void cfr_renamed_2462(sprr arg0, String arg1, sprtzd arg2) {
        String string = new StringBuilder().insert(0, GradientStopData.cfr_renamed_9("h\u0010a\u001e")).append(arg1).toString();
        sprr sprr2 = arg0;
        sprr2.cfr_renamed_1260(sprseea.cfr_renamed_9("-\u001f\u000b]-\u001f\u0005\u0012\u001f]!\u0012\u000f]") + arg2, string);
        sprr2.cfr_renamed_1260(new StringBuilder().insert(0, GradientStopData.cfr_renamed_9("\u001cL:\u000e\u001cL4A.\u000e\u0016E$g8N8R<T2Rs")).append(arg2).toString(), string);
    }
}

