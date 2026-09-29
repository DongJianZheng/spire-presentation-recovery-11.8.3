/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprgfh;
import com.spire.presentation.packages.sprjdda;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxch;
import com.spire.presentation.packages.sprxgf;

public class spruih
extends sprqqe {
    private final sproug cfr_renamed_2;
    private final sprgfh cfr_renamed_3;
    private final sproug cfr_renamed_4;

    public sproug cfr_renamed_1144() {
        return this.cfr_renamed_2;
    }

    public sproug cfr_renamed_3369() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[3];
        sprcoArray[0] = this.cfr_renamed_3;
        sprcoArray[1] = this.cfr_renamed_4;
        sprcoArray[2] = this.cfr_renamed_2;
        return new sprcen(sprcoArray);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spruih(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(sprjdda.cfr_renamed_9("u\u000b`\u0016s\u0007u\u00170\u0000u\u0002e\u0016~\u0010uSc\u001aj\u00160\u001cvS#"));
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprgfh.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sproug.cfr_renamed_23(v0.cfr_renamed_85(1));
        this.cfr_renamed_2 = sproug.cfr_renamed_23(v0.cfr_renamed_85(2));
    }

    public sprgfh cfr_renamed_3694() {
        return this.cfr_renamed_3;
    }

    public static sprxch cfr_renamed_7843() {
        return new sprxch();
    }

    /*
     * WARNING - void declaration
     */
    public spruih(sprgfh sprgfh2, sproug sproug2, sproug sproug3) {
        void arg1;
        void arg0;
        spruih spruih2 = this;
        this.cfr_renamed_3 = arg0;
        spruih2.cfr_renamed_4 = arg1;
        spruih2.cfr_renamed_2 = sproug3;
    }

    public static spruih cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spruih) {
            return (spruih)arg0;
        }
        if (arg0 != null) {
            return new spruih(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

