/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdsg;
import com.spire.presentation.packages.sprnsc;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrfh;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvfh;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.spryd;

public class sprjdh
extends sprqqe
implements spryd {
    private final sprrfh cfr_renamed_3;
    private final sprdsg cfr_renamed_4;

    public sprdsg cfr_renamed_8417() {
        return this.cfr_renamed_4;
    }

    public static sprvfh cfr_renamed_7843() {
        return new sprvfh();
    }

    public static sprjdh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjdh) {
            return (sprjdh)arg0;
        }
        if (arg0 != null) {
            return new sprjdh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprjdh(sprdsg sprdsg2, sprrfh sprrfh2) {
        void arg0;
        sprjdh sprjdh2 = this;
        sprjdh2.cfr_renamed_4 = arg0;
        sprjdh2.cfr_renamed_3 = sprrfh2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprjdh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprnsc.cfr_renamed_9("\u0000$\u00159\u0006(\u00008E/\u0000-\u00109\u000b?\u0000|\u00165\u001f9E3\u0003|W"));
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprdsg.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprrfh.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = this.cfr_renamed_3;
        return sprpch.cfr_renamed_8211(sprcoArray);
    }

    public sprrfh cfr_renamed_8418() {
        return this.cfr_renamed_3;
    }
}

