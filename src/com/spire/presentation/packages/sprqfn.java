/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqry;
import com.spire.presentation.packages.sprxgf;
import java.util.HashMap;
import java.util.Map;

public class sprqfn
extends sprqqe {
    public static final sprqfn cfr_renamed_152;
    public static final sprqfn cfr_renamed_112;
    public static final sprqfn cfr_renamed_119;
    public static final sprqfn cfr_renamed_91;
    public static final sprqfn cfr_renamed_0;
    private final sprktm cfr_renamed_1;
    private static Map cfr_renamed_2;
    public static final sprqfn cfr_renamed_3;
    public static final sprqfn cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_1;
    }

    public static sprqfn cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprqfn) {
            return (sprqfn)arg0;
        }
        if (arg0 != null) {
            sprqfn sprqfn2 = (sprqfn)cfr_renamed_2.get(sprktm.cfr_renamed_23(arg0));
            if (sprqfn2 != null) {
                return sprqfn2;
            }
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprqry.cfr_renamed_9("gKyK}R|\u0005}Gx@qQ2L|\u0005u@fl|VfD|Fw\r;\u001f2")).append(arg0.getClass().getName()).toString());
        }
        return null;
    }

    private /* synthetic */ sprqfn(sprktm sprktm2) {
        this.cfr_renamed_1 = sprktm2;
    }

    static {
        cfr_renamed_112 = new sprqfn(new sprktm(0L));
        cfr_renamed_119 = new sprqfn(new sprktm(2L));
        cfr_renamed_91 = new sprqfn(new sprktm(3L));
        cfr_renamed_4 = new sprqfn(new sprktm(4L));
        cfr_renamed_3 = new sprqfn(new sprktm(5L));
        cfr_renamed_0 = new sprqfn(new sprktm(6L));
        cfr_renamed_152 = new sprqfn(new sprktm(7L));
        cfr_renamed_2 = new HashMap();
        cfr_renamed_2.put(sprqfn.cfr_renamed_112.cfr_renamed_1, cfr_renamed_112);
        cfr_renamed_2.put(sprqfn.cfr_renamed_119.cfr_renamed_1, cfr_renamed_119);
        cfr_renamed_2.put(sprqfn.cfr_renamed_91.cfr_renamed_1, cfr_renamed_91);
        cfr_renamed_2.put(sprqfn.cfr_renamed_4.cfr_renamed_1, cfr_renamed_4);
        cfr_renamed_2.put(sprqfn.cfr_renamed_3.cfr_renamed_1, cfr_renamed_3);
        cfr_renamed_2.put(sprqfn.cfr_renamed_0.cfr_renamed_1, cfr_renamed_0);
        cfr_renamed_2.put(sprqfn.cfr_renamed_152.cfr_renamed_1, cfr_renamed_152);
    }
}

