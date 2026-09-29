/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgag;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.sprlbg;
import com.spire.presentation.packages.sprnil;
import com.spire.presentation.packages.sprpbg;
import com.spire.presentation.packages.sprpcg;
import com.spire.presentation.packages.sprqtca;
import com.spire.presentation.packages.sprrtf;
import com.spire.presentation.packages.sprsbg;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprvvf;
import com.spire.presentation.packages.sprxvf;
import java.security.SecureRandom;

public class sprrxf
implements sprii {
    private sprlbg cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    private /* synthetic */ byte[] cfr_renamed_6008(int arg0) {
        byte[] byArray = new byte[arg0];
        this.cfr_renamed_4.nextBytes(byArray);
        return byArray;
    }

    @Override
    public sprsil cfr_renamed_1223() {
        sprnil sprnil2;
        sprrxf sprrxf2 = this;
        sprrtf sprrtf2 = sprrxf2.cfr_renamed_3.cfr_renamed_143();
        byte[] byArray = sprrxf2.cfr_renamed_6008(sprrtf2.cfr_renamed_1337);
        sprrtf sprrtf3 = sprrtf2;
        int n = (2 + sprrtf2.cfr_renamed_112 + (sprrtf3.cfr_renamed_102 * (sprrtf3.cfr_renamed_102 + 1) >>> 1) + (sprrtf2.cfr_renamed_1222 - 1) + (sprrtf2.cfr_renamed_102 + 1) * sprrtf2.cfr_renamed_725) * sprrtf2.cfr_renamed_722;
        int n2 = n + (sprrtf2.cfr_renamed_105 << 1) + (sprrtf2.cfr_renamed_0 << 1) << 3;
        sprpbg sprpbg2 = new sprpbg(n2 >>> 3);
        byte[] byArray2 = new byte[n2];
        sprnil sprnil3 = sprnil2 = new sprnil(sprrtf2.cfr_renamed_86);
        sprnil3.cfr_renamed_1197(byArray, 0, sprrtf2.cfr_renamed_1337);
        sprnil3.cfr_renamed_1199(byArray2, 0, n2);
        sprrtf sprrtf4 = sprrtf2;
        byte[] byArray3 = new byte[sprrtf4.cfr_renamed_1337];
        byte[] byArray4 = new byte[sprrtf4.cfr_renamed_114 * sprrtf2.cfr_renamed_1472 + 7 >> 3];
        System.arraycopy(byArray, 0, byArray3, 0, byArray3.length);
        sprpbg2.cfr_renamed_6615(0, byArray2, 0, byArray2.length);
        sprrtf2.cfr_renamed_6705(sprpbg2);
        sprrtf sprrtf5 = sprrtf2;
        sprpbg sprpbg3 = new sprpbg(sprrtf5.cfr_renamed_114 * sprrtf2.cfr_renamed_722);
        if (sprrtf5.cfr_renamed_1344 > 34) {
            sprrtf2.cfr_renamed_6706(sprpbg3, sprpbg2);
        }
        sprpbg sprpbg4 = new sprpbg(sprrtf2.cfr_renamed_1223);
        sprpbg sprpbg5 = new sprpbg(sprpbg4);
        sprpbg sprpbg6 = new sprpbg(sprpbg2, n);
        sprpbg sprpbg7 = new sprpbg(sprpbg6, sprrtf2.cfr_renamed_105);
        sprrtf sprrtf6 = sprrtf2;
        sprrtf2.cfr_renamed_6707(sprpbg6, sprpcg.cfr_renamed_3);
        sprrtf6.cfr_renamed_6707(sprpbg7, sprpcg.cfr_renamed_3);
        sprrtf6.cfr_renamed_6708(sprpbg4, sprpbg6, sprpbg7, sprpcg.cfr_renamed_3);
        if (sprrtf6.cfr_renamed_1344 <= 34) {
            if (sprrtf2.cfr_renamed_6709(sprpbg3, sprpbg2, sprpbg4) != 0) {
                throw new IllegalArgumentException(sprqtca.cfr_renamed_9("@,w1w"));
            }
        } else {
            sprrtf2.cfr_renamed_6710(sprpbg3, sprpbg4);
        }
        sprpbg6.cfr_renamed_6649(sprrtf2.cfr_renamed_105 << 1);
        sprrtf sprrtf7 = sprrtf2;
        sprpbg7.cfr_renamed_6660(sprpbg6.cfr_renamed_320() + sprrtf7.cfr_renamed_0);
        sprrtf sprrtf8 = sprrtf2;
        sprrtf8.cfr_renamed_6707(sprpbg6, sprpcg.cfr_renamed_1);
        sprrtf8.cfr_renamed_6707(sprpbg7, sprpcg.cfr_renamed_1);
        sprrtf7.cfr_renamed_6708(sprpbg5, sprpbg6, sprpbg7, sprpcg.cfr_renamed_1);
        if (sprrtf7.cfr_renamed_723 != 0) {
            Object object;
            int n3;
            sprrtf sprrtf9 = sprrtf2;
            sprrtf sprrtf10 = sprrtf2;
            int n4 = sprrtf9.cfr_renamed_114 * sprrtf9.cfr_renamed_128 + (8 - (sprrtf10.cfr_renamed_128 & 7) & 7);
            sprvvf sprvvf2 = new sprvvf(n4);
            int n5 = n3 = (sprrtf10.cfr_renamed_128 & 7) != 0 ? 1 : 0;
            while (n5 < sprrtf2.cfr_renamed_114) {
                sprrtf sprrtf11 = sprrtf2;
                sprrtf11.cfr_renamed_6711(sprvvf2, sprpbg3, sprpbg5, sprpcg.cfr_renamed_2);
                sprpbg3.cfr_renamed_6649(sprrtf11.cfr_renamed_722);
                sprvvf2.cfr_renamed_6622(sprrtf11.cfr_renamed_128);
                n5 = ++n3;
            }
            if ((sprrtf2.cfr_renamed_128 & 7) != 0) {
                object = new sprpbg(sprrtf2.cfr_renamed_31);
                sprrtf2.cfr_renamed_6711((sprpbg)object, sprpbg3, sprpbg5, sprpcg.cfr_renamed_2);
                int n6 = n3 = 0;
                while (n6 < sprrtf2.cfr_renamed_31) {
                    int n7 = n3++;
                    sprvvf2.cfr_renamed_6619(n7, ((sprpbg)object).cfr_renamed_576(n7));
                    n6 = n3;
                }
            }
            sprvvf2.cfr_renamed_6605();
            sprrtf sprrtf12 = sprrtf2;
            byte[] byArray5 = new byte[sprrtf2.cfr_renamed_723 * sprrtf12.cfr_renamed_1397];
            object = byArray5;
            sprrtf12.cfr_renamed_6712(byArray5, sprvvf2);
            sprvvf2.cfr_renamed_6605();
            if (sprrtf2.cfr_renamed_82 != 0 && sprrtf2.cfr_renamed_723 > 1) {
                sprrtf2.cfr_renamed_6713(byArray4, sprvvf2, (byte[])object);
            } else {
                sprrtf2.cfr_renamed_6714(byArray4, sprvvf2, (byte[])object);
            }
        } else {
            int n8;
            sprvvf sprvvf3 = new sprvvf(sprrtf2.cfr_renamed_31 << 3);
            int n9 = 0;
            int n10 = n8 = 0;
            while (n10 < sprrtf2.cfr_renamed_114) {
                sprvvf sprvvf4 = sprvvf3;
                sprrtf2.cfr_renamed_6711(sprvvf4, sprpbg3, sprpbg5, sprpcg.cfr_renamed_2);
                n9 = sprvvf4.cfr_renamed_6606(byArray4, n9, sprrtf2.cfr_renamed_128);
                sprvvf4.cfr_renamed_6605();
                sprpbg3.cfr_renamed_6649(sprrtf2.cfr_renamed_722);
                n10 = ++n8;
            }
        }
        return new sprsil(new sprxvf(this.cfr_renamed_3, byArray4), new sprsbg(this.cfr_renamed_3, byArray3));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5536(sprgye sprgye2) {
        void arg0;
        sprrxf sprrxf2 = this;
        sprrxf2.cfr_renamed_4 = arg0.cfr_renamed_1295();
        sprrxf2.cfr_renamed_3 = ((sprgag)sprgye2).cfr_renamed_284();
    }
}

