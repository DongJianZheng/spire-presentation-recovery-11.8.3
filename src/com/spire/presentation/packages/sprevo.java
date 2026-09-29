/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprrpp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprznp;
import java.util.Iterator;

@sprtea
public abstract class sprevo {
    private sprrpp cfr_renamed_1;
    private sprrpp cfr_renamed_2;
    private sprrpp cfr_renamed_3;
    private sprrpp cfr_renamed_4;

    public void cfr_renamed_18346(int arg0, int arg1, String arg2) {
        if (!sprznp.cfr_renamed_12328(arg2)) {
            return;
        }
        sprrpp sprrpp2 = this.cfr_renamed_18344(arg0);
        if (sprrpp2 != null) {
            sprrpp2.cfr_renamed_12962(arg1, arg2);
        }
    }

    public sprevo() {
        sprevo sprevo2 = this;
        this.cfr_renamed_4 = new sprrpp();
        sprevo2.cfr_renamed_2 = new sprrpp();
        this.cfr_renamed_3 = new sprrpp();
        this.cfr_renamed_1 = new sprrpp();
    }

    /*
     * Enabled aggressive block sorting
     */
    public sprrpp cfr_renamed_18344(int arg0) {
        switch (arg0) {
            case 1: {
                return this.cfr_renamed_4;
            }
            case 2: {
                return this.cfr_renamed_2;
            }
            case 4: {
                return this.cfr_renamed_3;
            }
            case 6: {
                return this.cfr_renamed_1;
            }
        }
        return null;
    }

    public abstract String cfr_renamed_18343(int var1);

    public static String cfr_renamed_18345(sprrpp arg0) {
        Iterator iterator = arg0.cfr_renamed_205().iterator();
        if (iterator.hasNext()) {
            return (String)iterator.next();
        }
        return null;
    }

    public String[] cfr_renamed_12047(int arg0) {
        Iterator iterator;
        sprrpp sprrpp2 = this.cfr_renamed_18344(arg0);
        if (sprrpp2 == null) {
            return new String[0];
        }
        String[] stringArray = new String[sprrpp2.cfr_renamed_11861()];
        int n = 0;
        Iterator iterator2 = iterator = sprrpp2.cfr_renamed_205().iterator();
        while (iterator2.hasNext()) {
            String string = (String)iterator.next();
            iterator2 = iterator;
            stringArray[n++] = string;
        }
        return stringArray;
    }
}

