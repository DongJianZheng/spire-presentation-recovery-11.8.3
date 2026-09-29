/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcdh;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxaea;
import com.spire.presentation.packages.spryke;
import com.spire.presentation.packages.spryte;

public class sprefe
extends sprkra {
    public sprbne cfr_renamed_4;

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String string = System.getProperty(sprcdh.cfr_renamed_9("_K]G\u001dQVRRPRV\\P"));
        stringBuffer.append(sprxaea.cfr_renamed_9("5\u007f:i\u001f^\u0002}\u0019D\u0018YL"));
        stringBuffer.append(string);
        spryke[] sprykeArray = this.cfr_renamed_322();
        int n = 0;
        int n2 = n;
        while (n2 != sprykeArray.length) {
            stringBuffer.append("    ");
            stringBuffer.append(sprykeArray[n]);
            stringBuffer.append(string);
            n2 = ++n;
        }
        return stringBuffer.toString();
    }

    public spryke[] cfr_renamed_322() {
        int n;
        spryke[] sprykeArray = new spryke[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.cfr_renamed_84()) {
            int n3 = n++;
            sprykeArray[n3] = spryke.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n3));
            n2 = n;
        }
        return sprykeArray;
    }

    public static sprefe cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprefe) {
            return (sprefe)arg0;
        }
        if (arg0 != null) {
            return new sprefe(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    private /* synthetic */ sprefe(sprbne sprbne2) {
        sprefe sprefe2 = this;
        sprefe2.cfr_renamed_4 = null;
        sprefe2.cfr_renamed_4 = sprbne2;
    }

    public static sprefe cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprefe.cfr_renamed_23(sprbne.cfr_renamed_341(arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    public sprefe(spryke[] sprykeArray) {
        void arg0;
        int n;
        this.cfr_renamed_4 = null;
        sprlre sprlre2 = new sprlre();
        int n2 = n = 0;
        while (n2 != ((void)arg0).length) {
            sprlre2.cfr_renamed_49((spra)arg0[n++]);
            n2 = n;
        }
        this.cfr_renamed_4 = new sprpse(sprlre2);
    }
}

