/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprdus;
import com.spire.presentation.packages.sprjag;
import com.spire.presentation.packages.sprqag;
import com.spire.presentation.packages.sprvzf;
import com.spire.presentation.packages.sprxbg;
import com.spire.presentation.packages.sprzhn;

public class sprnxf
implements sprbj {
    public static final sprnxf cfr_renamed_107;
    public static final sprnxf cfr_renamed_132;
    public static final sprnxf cfr_renamed_102;
    public static final sprnxf cfr_renamed_93;
    public static final sprnxf cfr_renamed_86;
    private final int cfr_renamed_152;
    public static final sprnxf cfr_renamed_112;
    private final String cfr_renamed_119;
    public static final sprnxf cfr_renamed_91;
    public static final sprnxf cfr_renamed_0;
    public static final sprnxf cfr_renamed_1;
    public static final sprnxf cfr_renamed_2;
    public static final sprnxf cfr_renamed_3;
    public static final sprnxf cfr_renamed_4;

    public String cfr_renamed_313() {
        return this.cfr_renamed_119;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprnxf(String string, int n) {
        void arg0;
        sprnxf sprnxf2 = this;
        sprnxf2.cfr_renamed_119 = arg0;
        sprnxf2.cfr_renamed_152 = n;
    }

    static {
        cfr_renamed_91 = new sprnxf(sprdus.cfr_renamed_9(")\u0012:\u00150\u00185J?\b"), 1);
        cfr_renamed_93 = new sprnxf(sprzhn.cfr_renamed_9("\u0002,\u0011+\u001b&\u001et\u00077"), 2);
        cfr_renamed_112 = new sprnxf(sprdus.cfr_renamed_9(")\u0012:\u00150\u00185H?\b"), 3);
        cfr_renamed_132 = new sprnxf(sprzhn.cfr_renamed_9("\u0002,\u0011+\u001b&\u001ev\u00077"), 4);
        cfr_renamed_86 = new sprnxf(sprdus.cfr_renamed_9(")\u0012:\u00150\u00185N?\b"), 5);
        cfr_renamed_4 = new sprnxf(sprzhn.cfr_renamed_9("\u0002,\u0011+\u001b&\u001ep\u00077"), 6);
        cfr_renamed_0 = new sprnxf(sprdus.cfr_renamed_9("\u000b0\u00187\u0012:H5J"), 7);
        cfr_renamed_1 = new sprnxf(sprzhn.cfr_renamed_9("5\u001b&\u001c,\u0011v\u001ev"), 8);
        cfr_renamed_107 = new sprnxf(sprdus.cfr_renamed_9("\u000b0\u00187\u0012:H5N"), 9);
        cfr_renamed_102 = new sprnxf(sprzhn.cfr_renamed_9("\u0002,\u0011+\u001b&\u001et\u00140\u001e)"), 10);
        cfr_renamed_2 = new sprnxf(sprdus.cfr_renamed_9(")\u0012:\u00150\u00185H?\u000e5\u0017"), 11);
        cfr_renamed_3 = new sprnxf(sprzhn.cfr_renamed_9("\u0002,\u0011+\u001b&\u001ep\u00140\u001e)"), 12);
    }

    public sprqag cfr_renamed_143() {
        switch (this.cfr_renamed_152) {
            case 1: 
            case 2: 
            case 7: 
            case 10: {
                return new sprqag(this.cfr_renamed_152, sprxbg.cfr_renamed_4);
            }
            case 3: 
            case 4: 
            case 8: 
            case 11: {
                return new sprqag(this.cfr_renamed_152, sprvzf.cfr_renamed_4);
            }
            case 5: 
            case 6: 
            case 9: 
            case 12: {
                return new sprqag(this.cfr_renamed_152, sprjag.cfr_renamed_4);
            }
        }
        return null;
    }
}

