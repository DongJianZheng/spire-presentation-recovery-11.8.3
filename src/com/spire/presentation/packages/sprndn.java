/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprebda;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;
import java.util.HashMap;
import java.util.Map;

public class sprndn
extends sprqqe {
    public static final sprndn cfr_renamed_137;
    public static final sprndn cfr_renamed_79;
    private static Map cfr_renamed_107;
    public static final sprndn cfr_renamed_132;
    public static final sprndn cfr_renamed_102;
    public static final sprndn cfr_renamed_93;
    public static final sprndn cfr_renamed_86;
    private final sprktm cfr_renamed_152;
    public static final sprndn cfr_renamed_112;
    public static final sprndn cfr_renamed_119;
    public static final sprndn cfr_renamed_91;
    public static final sprndn cfr_renamed_0;
    public static final sprndn cfr_renamed_1;
    public static final sprndn cfr_renamed_2;
    public static final sprndn cfr_renamed_3;
    public static final sprndn cfr_renamed_4;

    public static sprndn cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprndn) {
            return (sprndn)arg0;
        }
        if (arg0 != null) {
            sprndn sprndn2 = (sprndn)cfr_renamed_107.get(sprktm.cfr_renamed_23(arg0));
            if (sprndn2 != null) {
                return sprndn2;
            }
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprebda.cfr_renamed_9("\u0005t\u001bt\u001fm\u001e:\u001fx\u001a\u007f\u0013nPs\u001e:\u0017\u007f\u0004S\u001ei\u0004{\u001ey\u00152Y P")).append(arg0.getClass().getName()).toString());
        }
        return null;
    }

    private /* synthetic */ sprndn(sprktm sprktm2) {
        this.cfr_renamed_152 = sprktm2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_152;
    }

    static {
        cfr_renamed_119 = new sprndn(new sprktm(0L));
        cfr_renamed_3 = new sprndn(new sprktm(1L));
        cfr_renamed_4 = new sprndn(new sprktm(2L));
        cfr_renamed_112 = new sprndn(new sprktm(3L));
        cfr_renamed_137 = new sprndn(new sprktm(4L));
        cfr_renamed_132 = new sprndn(new sprktm(5L));
        cfr_renamed_86 = new sprndn(new sprktm(6L));
        cfr_renamed_91 = new sprndn(new sprktm(7L));
        cfr_renamed_0 = new sprndn(new sprktm(8L));
        cfr_renamed_93 = new sprndn(new sprktm(9L));
        cfr_renamed_2 = new sprndn(new sprktm(10L));
        cfr_renamed_102 = new sprndn(new sprktm(11L));
        cfr_renamed_1 = new sprndn(new sprktm(12L));
        cfr_renamed_79 = new sprndn(new sprktm(13L));
        cfr_renamed_107 = new HashMap();
        cfr_renamed_107.put(sprndn.cfr_renamed_119.cfr_renamed_152, cfr_renamed_119);
        cfr_renamed_107.put(sprndn.cfr_renamed_3.cfr_renamed_152, cfr_renamed_3);
        cfr_renamed_107.put(sprndn.cfr_renamed_4.cfr_renamed_152, cfr_renamed_4);
        cfr_renamed_107.put(sprndn.cfr_renamed_112.cfr_renamed_152, cfr_renamed_112);
        cfr_renamed_107.put(sprndn.cfr_renamed_137.cfr_renamed_152, cfr_renamed_137);
        cfr_renamed_107.put(sprndn.cfr_renamed_0.cfr_renamed_152, cfr_renamed_0);
        cfr_renamed_107.put(sprndn.cfr_renamed_132.cfr_renamed_152, cfr_renamed_132);
        cfr_renamed_107.put(sprndn.cfr_renamed_86.cfr_renamed_152, cfr_renamed_86);
        cfr_renamed_107.put(sprndn.cfr_renamed_91.cfr_renamed_152, cfr_renamed_91);
        cfr_renamed_107.put(sprndn.cfr_renamed_0.cfr_renamed_152, cfr_renamed_0);
        cfr_renamed_107.put(sprndn.cfr_renamed_93.cfr_renamed_152, cfr_renamed_93);
        cfr_renamed_107.put(sprndn.cfr_renamed_137.cfr_renamed_152, cfr_renamed_137);
        cfr_renamed_107.put(sprndn.cfr_renamed_0.cfr_renamed_152, cfr_renamed_0);
        cfr_renamed_107.put(sprndn.cfr_renamed_2.cfr_renamed_152, cfr_renamed_2);
        cfr_renamed_107.put(sprndn.cfr_renamed_102.cfr_renamed_152, cfr_renamed_102);
        cfr_renamed_107.put(sprndn.cfr_renamed_1.cfr_renamed_152, cfr_renamed_1);
        cfr_renamed_107.put(sprndn.cfr_renamed_79.cfr_renamed_152, cfr_renamed_79);
    }
}

