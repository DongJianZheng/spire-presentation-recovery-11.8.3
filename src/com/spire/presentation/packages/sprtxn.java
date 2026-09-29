/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralq;
import com.spire.presentation.packages.sprbxn;
import com.spire.presentation.packages.sprewn;
import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprmvn;
import com.spire.presentation.packages.sprpyn;
import com.spire.presentation.packages.sprqvn;
import com.spire.presentation.packages.sprqzfa;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprreha;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryjn;

@sprtea
public class sprtxn
extends sprewn {
    private static final String cfr_renamed_1 = "Symbol";
    private static final String cfr_renamed_2 = "Symbol";
    private static spralq cfr_renamed_3 = new spralq();
    private String cfr_renamed_4;

    @sprtea
    public static String cfr_renamed_14581(sprfzo arg0) {
        return (String)cfr_renamed_3.get(arg0.cfr_renamed_13492());
    }

    static {
        cfr_renamed_3.cfr_renamed_12160("Arial", sprreha.cfr_renamed_9("\u0011\t5\u001a<\u00180\u000f8"));
        cfr_renamed_3.cfr_renamed_12160(sprqzfa.cfr_renamed_9("\u001e06#3b\u00166>.6!"), sprreha.cfr_renamed_9("\u0011\t5\u001a<\u00180\u000f8A\u0016\u000e5\u0005(\u0019<"));
        cfr_renamed_3.cfr_renamed_12160(sprqzfa.cfr_renamed_9("\u001e06#3b\u001d-3&"), sprreha.cfr_renamed_9("$<\u0000/\t-\u0005:\rt.6\u0000="));
        cfr_renamed_3.cfr_renamed_12160(sprqzfa.cfr_renamed_9("\u0003-+>.\u007f\u00000.;b\u00166>.6!"), sprreha.cfr_renamed_9("\u0011\t5\u001a<\u00180\u000f8A\u001b\u00035\b\u0016\u000e5\u0005(\u0019<"));
        cfr_renamed_3.cfr_renamed_12160(sprqzfa.cfr_renamed_9("\u000107-+:0\u007f\f:5"), "Courier");
        cfr_renamed_3.cfr_renamed_12160(sprreha.cfr_renamed_9("/6\u0019+\u0005<\u001ey\"<\u001by%-\r5\u0005:"), sprqzfa.cfr_renamed_9("\u000107-+:0r\r=.63*'"));
        cfr_renamed_3.cfr_renamed_12160(sprreha.cfr_renamed_9("/6\u0019+\u0005<\u001ey\"<\u001by.6\u0000="), sprqzfa.cfr_renamed_9("\u001c-*06'-o\u001d-3&"));
        cfr_renamed_3.cfr_renamed_12160(sprreha.cfr_renamed_9("\u001a\u0003,\u001e0\t+L\u0017\t.L\u001b\u00035\by%-\r5\u0005:"), sprqzfa.cfr_renamed_9("\u000107-+:0r\u00000.;\r=.63*'"));
        cfr_renamed_3.cfr_renamed_12160("Times New Roman", sprreha.cfr_renamed_9("\r\u00054\t*A\u000b\u00034\r7"));
        cfr_renamed_3.cfr_renamed_12160(sprqzfa.cfr_renamed_9("\u000b+2',b\u0011'(b\r-2#1b\u00166>.6!"), sprreha.cfr_renamed_9("80\u0001<\u001ft%-\r5\u0005:"));
        cfr_renamed_3.cfr_renamed_12160(sprqzfa.cfr_renamed_9("\u000b+2',b\u0011'(b\r-2#1b\u001d-3&"), sprreha.cfr_renamed_9("80\u0001<\u001ft.6\u0000="));
        cfr_renamed_3.cfr_renamed_12160(sprqzfa.cfr_renamed_9("\u00166/:1\u007f\f:5\u007f\u00100/>,\u007f\u00000.;b\u00166>.6!"), sprreha.cfr_renamed_9("80\u0001<\u001ft.6\u0000=%-\r5\u0005:"));
        cfr_renamed_3.cfr_renamed_12160("Symbol", "Symbol");
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_14285(spryjn spryjn2) {
        void arg0;
        void v0 = arg0;
        void v1 = arg0;
        v1.cfr_renamed_14086();
        v1.cfr_renamed_14057(sprqzfa.cfr_renamed_9("m\u000b;/'"), sprreha.cfr_renamed_9("v*6\u0002-"));
        v0.cfr_renamed_14057(sprqzfa.cfr_renamed_9("p\u0011* +;/'"), sprreha.cfr_renamed_9("C\r\u0015)\th"));
        Object[] objectArray = new Object[1];
        objectArray[0] = this.cfr_renamed_4;
        v0.cfr_renamed_14057(sprqzfa.cfr_renamed_9("m\u001d#,'\u0019-16"), sprraia.cfr_renamed_11562(sprreha.cfr_renamed_9("C\"\\$"), objectArray));
        void v3 = arg0;
        this.cfr_renamed_4572().cfr_renamed_14843((spryjn)v3);
        v3.cfr_renamed_14061();
    }

    @sprtea
    public static boolean cfr_renamed_14596(sprfzo arg0) {
        return cfr_renamed_3.containsKey(arg0.cfr_renamed_13492());
    }

    public sprtxn(sprgdo arg0, boolean arg1, boolean arg2, sprqvn arg3, String arg4) {
        sprqvn sprqvn2;
        sprmvn sprmvn2;
        if ("Symbol".equals(arg4)) {
            sprmvn2 = new sprbxn();
            sprqvn2 = arg3;
        } else {
            sprmvn2 = new sprpyn();
            sprqvn2 = arg3;
        }
        super(arg0, arg1, arg2, sprmvn2, sprqvn2);
        this.cfr_renamed_4 = arg4;
    }
}

