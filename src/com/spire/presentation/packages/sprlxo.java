/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtvp;

@sprtea
public class sprlxo {
    private static /* synthetic */ int cfr_renamed_17284(int arg0) {
        switch (arg0) {
            case 1: {
                while (false) {
                }
                return 10;
            }
            case 3: {
                return 1000;
            }
            case 4: {
                return 10000;
            }
            default: {
                return 0;
            }
        }
    }

    public static sprtvp cfr_renamed_17192(int arg0, int arg1) {
        sprtvp sprtvp2 = new sprtvp(10);
        int n = sprlxo.cfr_renamed_17284(arg1);
        do {
            sprtvp2.cfr_renamed_12819(arg0 % n);
        } while ((arg0 /= n) > 0);
        return sprtvp2;
    }

    private /* synthetic */ sprlxo() {
    }
}

