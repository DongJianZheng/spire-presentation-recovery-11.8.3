/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprgem;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprukz;
import com.spire.presentation.packages.sprvih;
import com.spire.presentation.packages.sprycn;
import java.io.IOException;

public class sprnxl {
    public static final int cfr_renamed_0 = 1;
    public static final int cfr_renamed_1 = 16;
    public static final int cfr_renamed_2 = 8;
    public static final int cfr_renamed_3 = 4;
    public static final int cfr_renamed_4 = 2;

    private static /* synthetic */ sprgem cfr_renamed_10935(sprszm arg0) {
        int n;
        sprlem sprlem2 = new sprlem(sprvih.cfr_renamed_9("6@5X*V0^*_*_5Z4\\3@<^*X*_"));
        sprszm sprszm2 = arg0;
        sprszm sprszm3 = sprszm.cfr_renamed_5085(sprnvm.cfr_renamed_23(sprszm2.cfr_renamed_85(sprszm2.cfr_renamed_84() - 1)), true);
        sprgem sprgem2 = new sprgem();
        int n2 = n = 0;
        while (n2 != sprszm3.cfr_renamed_84()) {
            sprrdm sprrdm2 = sprrdm.cfr_renamed_23(sprszm3.cfr_renamed_85(n));
            if (!sprlem2.cfr_renamed_5078(sprrdm2.cfr_renamed_4521())) {
                sprgem2.cfr_renamed_5283(sprrdm2);
            }
            n2 = ++n;
        }
        return sprgem2;
    }

    public static sprrdm cfr_renamed_10936(boolean arg0, int arg1, sprtpl arg2) throws IOException {
        sprrvm sprrvm2 = new sprrvm();
        sprrvm2.cfr_renamed_5004(new sprktm(arg2.cfr_renamed_114()));
        if ((arg1 & 1) != 0) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)arg2.cfr_renamed_89()));
        }
        if ((arg1 & 2) != 0) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 1, (sprco)arg2.cfr_renamed_102()));
        }
        if ((arg1 & 4) != 0) {
            sprrvm sprrvm3;
            sprrvm sprrvm4 = sprrvm3 = new sprrvm(2);
            sprrvm4.cfr_renamed_5004(arg2.cfr_renamed_568().cfr_renamed_2148());
            sprrvm4.cfr_renamed_5004(arg2.cfr_renamed_568().cfr_renamed_2146());
            sprrvm2.cfr_renamed_5004(new sprycn(false, 2, (sprco)new sprcen(sprrvm3)));
        }
        if ((arg1 & 8) != 0) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 3, (sprco)arg2.cfr_renamed_1485()));
        }
        sprrvm2.cfr_renamed_5004(arg2.cfr_renamed_1489());
        if ((arg1 & 0x10) != 0 && arg2.cfr_renamed_98() != null) {
            sprrvm2.cfr_renamed_5004(new sprycn(false, 4, (sprco)arg2.cfr_renamed_98()));
        }
        sprrvm2.cfr_renamed_5004(new sprdye(arg2.cfr_renamed_79()));
        return new sprrdm(new sprlem(sprukz.cfr_renamed_9("f\u0003e\u001bz\u0015`\u001dz\u001cz\u001ce\u0019d\u001fc\u0003l\u001dz\u001bz\u001c")), arg0, new sprcen(sprrvm2).cfr_renamed_104("DER"));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static sprtpl cfr_renamed_10937(sprtpl arg0) {
        int n;
        Object object;
        Object object2;
        sprco sprco2;
        sprlem sprlem2 = new sprlem(sprvih.cfr_renamed_9("6@5X*V0^*_*_5Z4\\3@<^*X*_"));
        sprtpl sprtpl2 = arg0;
        sprszm sprszm2 = sprszm.cfr_renamed_23(sprtpl2.cfr_renamed_5024(sprlem2).cfr_renamed_372());
        sprszm sprszm3 = sprszm.cfr_renamed_23(sprtpl2.cfr_renamed_568().cfr_renamed_2151().cfr_renamed_119());
        int n2 = 0;
        sprco[] sprcoArray = sprszm3.cfr_renamed_4529();
        sprcoArray[0] = sprszm3.cfr_renamed_85(0);
        sprszm sprszm4 = sprszm2;
        sprktm sprktm2 = sprktm.cfr_renamed_23(sprszm4.cfr_renamed_85(n2));
        sprcoArray[1] = sprktm2;
        sprco sprco3 = sprco2 = sprszm4.cfr_renamed_85(++n2);
        ++n2;
        while (sprco3 instanceof sprnvm) {
            sprszm sprszm5;
            object2 = sprnvm.cfr_renamed_23(sprco2);
            switch (((sprnvm)object2).cfr_renamed_312()) {
                case 0: {
                    sprcoArray[2] = sprszm.cfr_renamed_5085((sprnvm)object2, false);
                    sprszm5 = sprszm2;
                    break;
                }
                case 1: {
                    sprcoArray[3] = sprszm.cfr_renamed_5085((sprnvm)object2, true);
                    sprszm5 = sprszm2;
                    break;
                }
                case 2: {
                    sprcoArray[4] = sprszm.cfr_renamed_5085((sprnvm)object2, false);
                    sprszm5 = sprszm2;
                    break;
                }
                case 3: {
                    sprcoArray[5] = sprszm.cfr_renamed_5085((sprnvm)sprco2, true);
                }
                default: {
                    sprszm5 = sprszm2;
                }
            }
            sprco3 = sprszm5.cfr_renamed_85(n2);
            ++n2;
        }
        sprcoArray[6] = sprco2;
        if (sprcoArray[2] == null) {
            sprcoArray[2] = sprszm3.cfr_renamed_85(2);
        }
        if (sprcoArray[3] == null) {
            sprcoArray[3] = sprszm3.cfr_renamed_85(3);
        }
        if (sprcoArray[4] == null) {
            sprcoArray[4] = sprszm3.cfr_renamed_85(4);
        }
        if (sprcoArray[5] == null) {
            sprcoArray[5] = sprszm3.cfr_renamed_85(5);
        }
        object2 = sprnxl.cfr_renamed_10935(sprszm3);
        if (n2 < sprszm2.cfr_renamed_84() - 1) {
            int n3;
            sprco2 = sprszm2.cfr_renamed_85(n2);
            ++n2;
            object = sprnvm.cfr_renamed_23(sprco2);
            if (((sprnvm)object).cfr_renamed_312() != 4) {
                throw new IllegalArgumentException(sprukz.cfr_renamed_9("@5A2B&@1ItI1A LtH,Y1C'D;C"));
            }
            sprszm sprszm6 = sprszm.cfr_renamed_5085((sprnvm)object, false);
            int n4 = n3 = 0;
            while (n4 != sprszm6.cfr_renamed_84()) {
                ((sprgem)object2).cfr_renamed_10851(sprrdm.cfr_renamed_23(sprszm6.cfr_renamed_85(n3++)));
                n4 = n3;
            }
            sprcoArray[7] = new sprycn(3, ((sprgem)object2).cfr_renamed_31());
        } else {
            if (!((sprgem)object2).cfr_renamed_29()) {
                sprcoArray[7] = ((sprgem)object2).cfr_renamed_31();
            }
            sprcoArray[7] = null;
        }
        object = new sprrvm(7);
        int n5 = n = 0;
        while (true) {
            if (n5 == sprcoArray.length) {
                sprrvm sprrvm2 = new sprrvm();
                sprszm sprszm7 = sprszm2;
                sprrvm sprrvm3 = sprrvm2;
                sprrvm2.cfr_renamed_5004(new sprcen((sprrvm)object));
                sprrvm3.cfr_renamed_5004(sprszm.cfr_renamed_23(sprcoArray[2]));
                sprrvm3.cfr_renamed_5004(sprgbf.cfr_renamed_23(sprszm7.cfr_renamed_85(sprszm7.cfr_renamed_84() - 1)));
                return new sprtpl(sprndm.cfr_renamed_23(new sprcen(sprrvm2)));
            }
            if (sprcoArray[n] != null) {
                ((sprrvm)object).cfr_renamed_5004(sprcoArray[n]);
            }
            n5 = ++n;
        }
    }
}

