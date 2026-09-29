/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprawf;
import com.spire.presentation.packages.sprcvf;
import com.spire.presentation.packages.sprfuf;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.sprjdg;
import com.spire.presentation.packages.sprjxf;
import com.spire.presentation.packages.sprjzf;
import com.spire.presentation.packages.sprncg;
import com.spire.presentation.packages.sprovf;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.spryxf;
import java.security.SecureRandom;

public class sprobg
implements sprii {
    private sprovf cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    private /* synthetic */ byte[] cfr_renamed_6008(int arg0) {
        byte[] byArray = new byte[arg0];
        this.cfr_renamed_4.nextBytes(byArray);
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5536(sprgye sprgye2) {
        void arg0;
        sprobg sprobg2 = this;
        sprobg2.cfr_renamed_4 = arg0.cfr_renamed_1295();
        sprobg2.cfr_renamed_3 = ((spryxf)sprgye2).cfr_renamed_284();
    }

    @Override
    public sprsil cfr_renamed_1223() {
        sprawf sprawf2;
        byte[] byArray;
        sprncg sprncg2;
        Object object;
        sprncg sprncg3 = this.cfr_renamed_3.cfr_renamed_143();
        if (sprncg3 instanceof sprfuf) {
            object = this.cfr_renamed_6008(sprncg3.cfr_renamed_112 * 3);
            sprncg sprncg4 = sprncg3;
            sprncg2 = sprncg4;
            byte[] byArray2 = new byte[sprncg4.cfr_renamed_112];
            byte[] byArray3 = new byte[sprncg4.cfr_renamed_112];
            byArray = new byte[sprncg4.cfr_renamed_112];
            System.arraycopy(object, 0, byArray2, 0, sprncg3.cfr_renamed_112);
            System.arraycopy(object, sprncg3.cfr_renamed_112, byArray3, 0, sprncg3.cfr_renamed_112);
            System.arraycopy(object, sprncg3.cfr_renamed_112 << 1, byArray, 0, sprncg3.cfr_renamed_112);
            sprawf2 = new sprawf(byArray2, byArray3);
        } else {
            sprawf2 = new sprawf(this.cfr_renamed_6008(sprncg3.cfr_renamed_112), this.cfr_renamed_6008(sprncg3.cfr_renamed_112));
            byArray = this.cfr_renamed_6008(sprncg3.cfr_renamed_112);
            sprncg2 = sprncg3;
        }
        sprncg2.cfr_renamed_148(byArray);
        byte[] byArray4 = byArray;
        object = new sprjdg(byArray, new sprjxf((sprncg)sprncg3, (byte[])sprawf2.cfr_renamed_4, (byte[])byArray).cfr_renamed_4);
        return new sprsil(new sprjzf(this.cfr_renamed_3, (sprjdg)object), new sprcvf(this.cfr_renamed_3, sprawf2, (sprjdg)object));
    }
}

