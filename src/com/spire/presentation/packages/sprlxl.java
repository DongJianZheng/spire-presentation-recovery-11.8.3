/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbul;
import com.spire.presentation.packages.sprbvm;
import com.spire.presentation.packages.sprdvm;
import com.spire.presentation.packages.sprkvm;
import com.spire.presentation.packages.sprmrg;

public class sprlxl {
    private final sprbvm[] cfr_renamed_4;

    public sprbul[] cfr_renamed_10996() {
        int n;
        sprbul[] sprbulArray = new sprbul[this.cfr_renamed_4.length];
        int n2 = n = 0;
        while (n2 != sprbulArray.length) {
            int n3 = n;
            sprbul sprbul2 = new sprbul(this.cfr_renamed_4[n]);
            sprbulArray[n3] = sprbul2;
            n2 = ++n;
        }
        return sprbulArray;
    }

    public sprkvm cfr_renamed_568() {
        return new sprkvm(this.cfr_renamed_4);
    }

    public static sprlxl cfr_renamed_10997(sprdvm arg0) {
        if (!sprlxl.cfr_renamed_10998(arg0.cfr_renamed_324())) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprmrg.cfr_renamed_9("+`&{-a</'ih_\u0003F\n`,vhx:`&hh{1\u007f-5h")).append(arg0.cfr_renamed_324()).toString());
        }
        return new sprlxl(sprkvm.cfr_renamed_23(arg0.cfr_renamed_480()));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean cfr_renamed_10998(int arg0) {
        switch (arg0) {
            case 0: 
            case 2: 
            case 7: 
            case 9: 
            case 13: {
                return true;
            }
        }
        return false;
    }

    public sprlxl(sprkvm sprkvm2) {
        this.cfr_renamed_4 = sprkvm2.cfr_renamed_4827();
    }
}

