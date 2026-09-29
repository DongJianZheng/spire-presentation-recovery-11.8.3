/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproyia;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrjh;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprueaa;
import com.spire.presentation.packages.sprxgf;

public class sprnlh
extends sprqqe {
    private final sproug cfr_renamed_3;
    private final sproug cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_8326() {
        if (this.cfr_renamed_4 == null || this.cfr_renamed_4.cfr_renamed_186().length != 4) {
            throw new IllegalArgumentException(sproyia.cfr_renamed_9("n{eAqH$Dw\rjXhA$Bv\rjBp\rbBq_$O}Ya^$AkCc"));
        }
        if (this.cfr_renamed_3 == null || this.cfr_renamed_3.cfr_renamed_186().length != 9) {
            throw new IllegalArgumentException(sprueaa.cfr_renamed_9(":h |))%zlg9e )#{lg#}lg%g)).p8l?) f\"n"));
        }
    }

    public static sprnlh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprnlh) {
            return (sprnlh)arg0;
        }
        if (arg0 != null) {
            return new sprnlh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = this.cfr_renamed_3;
        return sprpch.cfr_renamed_8211(sprcoArray);
    }

    public static sprrjh cfr_renamed_7843() {
        return new sprrjh();
    }

    public sproug cfr_renamed_97() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprnlh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sproyia.cfr_renamed_9("aUtHgYaI$^a\\qHjNa\rwD~H$Bb\r6"));
        }
        sprnlh sprnlh2 = this;
        sprnlh2.cfr_renamed_4 = sproug.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprnlh2.cfr_renamed_3 = sproug.cfr_renamed_23(arg0.cfr_renamed_85(1));
        this.cfr_renamed_8326();
    }

    public sproug cfr_renamed_8381() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprnlh(sproug sproug2, sproug sproug3) {
        void arg0;
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_3 = sproug3;
        this.cfr_renamed_8326();
    }
}

