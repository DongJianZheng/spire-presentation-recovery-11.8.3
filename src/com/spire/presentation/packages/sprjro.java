/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprevo;
import com.spire.presentation.packages.sprewo;
import com.spire.presentation.packages.sprmap;
import com.spire.presentation.packages.sprnzha;
import com.spire.presentation.packages.sprpqo;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprjro {
    private String cfr_renamed_1;
    private sprpqo cfr_renamed_2;
    private sprewo cfr_renamed_3;
    private sprmap cfr_renamed_4;

    @sprtea
    public String cfr_renamed_18347(int arg0) {
        String string = this.cfr_renamed_5544(arg0);
        if (string == null) {
            throw new IllegalStateException(sprnzha.cfr_renamed_9("W\u0011t\u0001`\u0007q\u0011aTdTk\u0015h\u0011%\u0007q\u0006l\u001abTq\u001cd\u0000%\u001dvTk\u001bqTu\u0006`\u0007`\u001aqTl\u001a%\u0000m\u0011%\u0012j\u001aqZ"));
        }
        return string;
    }

    @sprtea
    public String cfr_renamed_5544(int arg0) {
        String string = this.cfr_renamed_4.cfr_renamed_18343(arg0);
        if (string == null) {
            string = this.cfr_renamed_2.cfr_renamed_18343(arg0);
        }
        if (string == null) {
            string = this.cfr_renamed_3.cfr_renamed_18343(arg0);
        }
        return string;
    }

    private /* synthetic */ sprevo cfr_renamed_18348(int arg0) {
        switch (arg0) {
            case 0: {
                while (false) {
                }
                return this.cfr_renamed_3;
            }
            case 1: {
                return this.cfr_renamed_2;
            }
            case 3: {
                return this.cfr_renamed_4;
            }
            default: {
                return null;
            }
        }
    }

    @sprtea
    public void cfr_renamed_18349(int arg0, int arg1, int arg2, String arg3) {
        if (arg0 == 5) {
            this.cfr_renamed_1 = arg3;
            return;
        }
        sprevo sprevo2 = this.cfr_renamed_18348(arg1);
        if (sprevo2 == null) {
            return;
        }
        sprevo2.cfr_renamed_18346(arg0, arg2, arg3);
    }

    @sprtea
    public String[] cfr_renamed_12047(int arg0) {
        String[] stringArray = this.cfr_renamed_4.cfr_renamed_12047(arg0);
        if (stringArray.length == 0) {
            stringArray = this.cfr_renamed_2.cfr_renamed_12047(arg0);
        }
        if (stringArray.length == 0) {
            stringArray = this.cfr_renamed_3.cfr_renamed_12047(arg0);
        }
        return stringArray;
    }

    public sprjro() {
        sprjro sprjro2 = this;
        sprjro sprjro3 = this;
        sprjro3.cfr_renamed_4 = new sprmap();
        sprjro2.cfr_renamed_2 = new sprpqo();
        sprjro2.cfr_renamed_3 = new sprewo();
        sprjro2.cfr_renamed_1 = "";
    }

    public String cfr_renamed_18350() {
        return this.cfr_renamed_1;
    }
}

