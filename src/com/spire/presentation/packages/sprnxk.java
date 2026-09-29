/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhx;
import com.spire.presentation.packages.sprivk;
import com.spire.presentation.packages.sprjzk;
import com.spire.presentation.packages.sprkpy;
import com.spire.presentation.packages.sprmdl;
import com.spire.presentation.packages.sprocl;
import com.spire.presentation.packages.sprohl;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpwp;
import com.spire.presentation.packages.sprpxe;

public class sprnxk {
    private final sprjzk cfr_renamed_2;
    private final int cfr_renamed_3;
    private static final String cfr_renamed_4 = "HPKE-v1";

    public byte[] cfr_renamed_10152(byte[] arg0, byte[] arg1, String arg2, byte[] arg3) {
        if (arg0 == null) {
            arg0 = new byte[this.cfr_renamed_3];
        }
        byte[] byArray = sproze.cfr_renamed_526(cfr_renamed_4.getBytes(), arg1, arg2.getBytes(), arg3);
        return this.cfr_renamed_2.cfr_renamed_10159(arg0, byArray);
    }

    public byte[] cfr_renamed_10128(byte[] arg0, byte[] arg1, String arg2, byte[] arg3, int arg4) {
        if (arg4 > 65536) {
            throw new IllegalArgumentException(sprkpy.cfr_renamed_9("``UyK|\u0005t@vBlM8FyKvJl\u0005z@8IyW\u007f@j\u0005lMyK8\u0017F\u0014."));
        }
        byte[] byArray = sproze.cfr_renamed_526(sprpxe.cfr_renamed_5178((short)arg4), cfr_renamed_4.getBytes(), arg1, arg2.getBytes());
        sprnxk sprnxk2 = this;
        sprnxk2.cfr_renamed_2.cfr_renamed_5671(sprivk.cfr_renamed_3364(arg0, sproze.cfr_renamed_543(byArray, arg3)));
        byte[] byArray2 = new byte[arg4];
        sprnxk2.cfr_renamed_2.cfr_renamed_2341(byArray2, 0, byArray2.length);
        return byArray2;
    }

    public int cfr_renamed_9835() {
        return this.cfr_renamed_3;
    }

    public sprnxk(short s) {
        sprhx sprhx2;
        switch (s) {
            case 1: {
                sprhx2 = new sprohl();
                sprnxk sprnxk2 = this;
                break;
            }
            case 2: {
                sprhx2 = new sprmdl();
                sprnxk sprnxk2 = this;
                break;
            }
            case 3: {
                sprhx2 = new sprocl();
                sprnxk sprnxk2 = this;
                break;
            }
            default: {
                throw new IllegalArgumentException(sprpwp.cfr_renamed_9("&_9P#X+\u0011$U)\u0011&U"));
            }
        }
        sprnxk2.cfr_renamed_2 = new sprjzk((sprgf)((Object)sprhx2));
        this.cfr_renamed_3 = sprhx2.cfr_renamed_1218();
    }
}

