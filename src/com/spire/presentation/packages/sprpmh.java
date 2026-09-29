/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprilh;
import com.spire.presentation.packages.sprmpd;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.Iterator;

public class sprpmh
extends sprqqe {
    private final sproug cfr_renamed_3;
    private final sproug cfr_renamed_4;

    public sproug cfr_renamed_8419() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprpmh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprmpd.cfr_renamed_9("J\\_ALPJ@\u000fWJUZAAGJ\u0004\\MUA\u000fKI\u0004\u001d"));
        }
        Iterator<sprco> iterator = arg0.iterator();
        sprpmh sprpmh2 = this;
        sprpmh2.cfr_renamed_4 = sproug.cfr_renamed_23(iterator.next());
        sprpmh2.cfr_renamed_3 = sproug.cfr_renamed_23(iterator.next());
    }

    /*
     * WARNING - void declaration
     */
    public sprpmh(sproug sproug2, sproug sproug3) {
        void arg0;
        sprpmh sprpmh2 = this;
        sprpmh2.cfr_renamed_4 = arg0;
        sprpmh2.cfr_renamed_3 = sproug3;
    }

    public sproug cfr_renamed_8420() {
        return this.cfr_renamed_3;
    }

    public static sprilh cfr_renamed_7843() {
        return new sprilh();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = this.cfr_renamed_3;
        return sprpch.cfr_renamed_8211(sprcoArray);
    }

    public static sprpmh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprpmh) {
            return (sprpmh)arg0;
        }
        if (arg0 != null) {
            return new sprpmh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

