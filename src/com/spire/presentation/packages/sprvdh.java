/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralo;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spribh;
import com.spire.presentation.packages.sprkch;
import com.spire.presentation.packages.sprngh;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.spryd;

public class sprvdh
extends sprqqe
implements spryd {
    private final spribh cfr_renamed_3;
    private final sprkch cfr_renamed_4;

    public static sprngh cfr_renamed_7843() {
        return new sprngh();
    }

    /*
     * WARNING - void declaration
     */
    public sprvdh(sprkch sprkch2, spribh spribh2) {
        void arg0;
        sprvdh sprvdh2 = this;
        sprvdh2.cfr_renamed_4 = arg0;
        sprvdh2.cfr_renamed_3 = spribh.cfr_renamed_23(spribh2);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = this.cfr_renamed_3;
        return sprpch.cfr_renamed_8211(sprcoArray);
    }

    public static sprvdh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprvdh) {
            return (sprvdh)arg0;
        }
        if (arg0 != null) {
            return new sprvdh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprvdh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(spralo.cfr_renamed_9("\fK\u0019V\nG\fWI@\fB\u001cV\u0007P\f\u0013\u001aZ\u0013VI\\\u000f\u0013["));
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprkch.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = spribh.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    public sprkch cfr_renamed_8415() {
        return this.cfr_renamed_4;
    }

    public spribh cfr_renamed_8416() {
        return this.cfr_renamed_3;
    }
}

