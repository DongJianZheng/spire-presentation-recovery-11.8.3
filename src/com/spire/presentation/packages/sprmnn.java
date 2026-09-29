/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjin;
import com.spire.presentation.packages.sprmzo;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprqt;
import com.spire.presentation.packages.sprsto;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryvo;

@sprtea
public class sprmnn
extends sprjin {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    @sprtea
    public boolean cfr_renamed_13216(int arg0) {
        switch (arg0) {
            case 5: 
            case 6: 
            case 8: {
                return true;
            }
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @sprtea
    public static boolean cfr_renamed_13217(byte[] arg0) {
        sprpdja sprpdja2 = new sprpdja(arg0);
        try {
            sprmzo sprmzo2 = new sprmzo(sprpdja2);
            sprmzo2.cfr_renamed_13218();
            int n = sprmzo2.cfr_renamed_13218();
            while (true) {
                int n2;
                if ((n & 0xFFFF & 0xFFF0) == 65472 && (n & 0xFFFF) != 65476) {
                    if ((n & 0xFFFF) != 65484) return false;
                }
                switch (n) {
                    case 65504: 
                    case 65505: 
                    case 65506: 
                    case 65517: 
                    case 65518: {
                        n2 = 1;
                        return n2 != 0;
                    }
                }
                n2 = sprmzo2.cfr_renamed_13218();
                sprpdja2.cfr_renamed_11547((n2 & 0xFFFF) - 2, 1);
                n = sprmzo2.cfr_renamed_13218();
            }
        }
        finally {
            if (sprpdja2 != null) {
                sprpdja2.cfr_renamed_2637();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @sprtea
    public static boolean cfr_renamed_13219(byte[] arg0) {
        sprpdja sprpdja2 = new sprpdja(arg0);
        try {
            sprmzo sprmzo2 = new sprmzo(sprpdja2);
            int n = 8;
            sprpdja sprpdja3 = sprpdja2;
            sprpdja sprpdja4 = sprpdja3;
            sprpdja3.cfr_renamed_11548(n);
            String string = "";
            String string2 = "";
            boolean bl = true;
            while (sprpdja4.cfr_renamed_3274() <= sprpdja2.cfr_renamed_806() - 8L) {
                long l = sprmzo2.cfr_renamed_13220();
                String string3 = new String(sprmzo2.cfr_renamed_13221(4));
                if (bl) {
                    string = string3;
                    bl = false;
                }
                string2 = string3;
                if (sprpdja2.cfr_renamed_3274() + (l & 0xFFFFFFFFL) + 4L > sprpdja2.cfr_renamed_806()) break;
                sprpdja sprpdja5 = sprpdja2;
                sprpdja4 = sprpdja5;
                sprpdja5.cfr_renamed_11547((l & 0xFFFFFFFFL) + 4L, 1);
            }
            boolean bl2 = "IHDR".equals(string) && "IEND".equals(string2);
            return bl2;
        }
        finally {
            if (sprpdja2 != null) {
                sprpdja2.cfr_renamed_2637();
            }
        }
    }

    @sprtea
    public static boolean cfr_renamed_13222(byte[] arg0) {
        return new spryvo(arg0).cfr_renamed_13223();
    }

    public sprmnn(int arg0, sprqt arg1, int arg2) {
        super(arg0, arg1, arg2);
    }

    @Override
    @sprtea
    public boolean cfr_renamed_13224(byte[] arg0) {
        switch (sprsto.cfr_renamed_13225(arg0)) {
            case 5: {
                while (false) {
                }
                return sprmnn.cfr_renamed_13217(arg0);
            }
            case 6: {
                return sprmnn.cfr_renamed_13219(arg0);
            }
            case 8: {
                return sprmnn.cfr_renamed_13222(arg0);
            }
            default: {
                return false;
            }
        }
    }
}

