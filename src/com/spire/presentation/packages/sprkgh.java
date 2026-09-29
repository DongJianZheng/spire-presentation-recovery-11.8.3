/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcnh;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprsqr;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzdh;
import java.util.Iterator;

public class sprkgh
extends sprqqe {
    private final sproug cfr_renamed_3;
    private final sprzdh cfr_renamed_4;

    public static sprkgh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprkgh) {
            return (sprkgh)arg0;
        }
        if (arg0 != null) {
            return new sprkgh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprzdh cfr_renamed_8424() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_3;
        sprcoArray[1] = this.cfr_renamed_4;
        return sprpch.cfr_renamed_8211(sprcoArray);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprkgh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprsqr.cfr_renamed_9("{\u001an\u0007}\u0016{\u0006>\u0011{\u0013k\u0007p\u0001{Bm\u000bd\u0007>\rxB,"));
        }
        Iterator<sprco> iterator = arg0.iterator();
        sprkgh sprkgh2 = this;
        sprkgh2.cfr_renamed_3 = sproug.cfr_renamed_23(iterator.next());
        sprkgh2.cfr_renamed_4 = sprzdh.cfr_renamed_23(iterator.next());
    }

    public static sprcnh cfr_renamed_7843() {
        return new sprcnh();
    }

    public sproug cfr_renamed_596() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprkgh(sproug sproug2, sprzdh sprzdh2) {
        void arg0;
        sprkgh sprkgh2 = this;
        sprkgh2.cfr_renamed_3 = arg0;
        sprkgh2.cfr_renamed_4 = sprzdh2;
    }
}

