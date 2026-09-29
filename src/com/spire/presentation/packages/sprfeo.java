/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraro;
import com.spire.presentation.packages.sprhio;
import com.spire.presentation.packages.sprieo;
import com.spire.presentation.packages.sprkko;
import com.spire.presentation.packages.sprleo;
import com.spire.presentation.packages.sprloo;
import com.spire.presentation.packages.sprrto;
import com.spire.presentation.packages.sprsgo;
import com.spire.presentation.packages.sprsto;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvlo;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprzmo;

@sprtea
public class sprfeo {
    private static /* synthetic */ sprwbp[] cfr_renamed_16281(sprwbp arg0, sprwbp arg1) {
        if (sprfeo.cfr_renamed_16214(arg0, arg1)) {
            sprwbp[] sprwbpArray = new sprwbp[2];
            sprwbpArray[0] = sprloo.cfr_renamed_4;
            sprwbpArray[1] = sprloo.cfr_renamed_3;
            return sprwbpArray;
        }
        sprwbp[] sprwbpArray = new sprwbp[2];
        sprwbpArray[0] = sprloo.cfr_renamed_3;
        sprwbpArray[1] = sprloo.cfr_renamed_4;
        return sprwbpArray;
    }

    @sprtea
    public static boolean cfr_renamed_16214(sprwbp arg0, sprwbp arg1) {
        return arg0.cfr_renamed_3353() + arg0.cfr_renamed_1145() + arg0.cfr_renamed_1997() < arg1.cfr_renamed_3353() + arg1.cfr_renamed_1145() + arg1.cfr_renamed_1997();
    }

    public static sprieo cfr_renamed_16196(sprkko arg0, int arg1) {
        sprkko sprkko2 = arg0;
        short s = sprkko2.cfr_renamed_12254();
        sprkko2.cfr_renamed_12254();
        int n = arg1 - 4;
        sprkko sprkko3 = arg0;
        long l = sprkko3.cfr_renamed_14060().cfr_renamed_3274();
        sprrto sprrto2 = spraro.cfr_renamed_16217(sprkko3);
        if (s == 3 && (sprrto2.cfr_renamed_16218() & 0xFFFF) == 1 && sprrto2.cfr_renamed_16219() == 8) {
            sprkko sprkko4 = arg0;
            sprwbp sprwbp2 = sprkko4.cfr_renamed_16078();
            sprwbp sprwbp3 = sprkko4.cfr_renamed_16078();
            byte[] byArray = sprsto.cfr_renamed_16220(sprrto2, sprfeo.cfr_renamed_16281(sprwbp2, sprwbp3), arg0, n - sprrto2.cfr_renamed_2773() - sprrto2.cfr_renamed_16219());
            return new sprloo(byArray);
        }
        arg0.cfr_renamed_14060().cfr_renamed_11548(l);
        byte[] byArray = sprsto.cfr_renamed_16221(arg0, n);
        return new sprzmo(byArray);
    }

    public static sprieo cfr_renamed_16282(sprhio arg0) {
        sprhio sprhio2 = arg0;
        int n = (int)sprhio2.cfr_renamed_14060().cfr_renamed_3274() - 8;
        int n2 = sprhio2.cfr_renamed_12261();
        sprhio2.cfr_renamed_12261();
        sprhio sprhio3 = arg0;
        int n3 = sprhio3.cfr_renamed_12261();
        int n4 = sprhio3.cfr_renamed_12261();
        sprhio3.cfr_renamed_12261();
        sprhio sprhio4 = arg0;
        int n5 = sprhio4.cfr_renamed_12261();
        sprhio4.cfr_renamed_14060().cfr_renamed_11548(n + n3);
        byte[] byArray = sprsto.cfr_renamed_16253(sprhio4, n4, n5);
        sprzmo sprzmo2 = new sprzmo(byArray);
        sprzmo2.cfr_renamed_16244(n2);
        return sprzmo2;
    }

    public static sprieo cfr_renamed_16209(sprkko arg0) {
        sprkko sprkko2 = arg0;
        byte[] byArray = sprkko2.cfr_renamed_16065((int)sprkko2.cfr_renamed_14060().cfr_renamed_806());
        return new sprzmo(byArray);
    }

    public static sprieo cfr_renamed_16208(sprkko arg0) {
        sprkko sprkko2 = arg0;
        short s = sprkko2.cfr_renamed_12254();
        sprwbp sprwbp2 = sprkko2.cfr_renamed_16078();
        short s2 = sprkko2.cfr_renamed_12254();
        switch (s) {
            case 1: {
                return new sprvlo();
            }
            case 0: {
                return new sprleo(sprwbp2);
            }
            case 2: {
                return new sprsgo(s2, sprwbp2);
            }
        }
        return new sprleo(sprwbp.cfr_renamed_1513);
    }

    public static sprieo cfr_renamed_16283(sprhio arg0) {
        sprieo sprieo2;
        sprieo sprieo3;
        sprhio sprhio2 = arg0;
        int n = sprhio2.cfr_renamed_12261();
        int n2 = (int)(sprhio2.cfr_renamed_13220() & 0xFFFFFFFFL);
        sprwbp sprwbp2 = sprhio2.cfr_renamed_16078();
        int n3 = sprhio2.cfr_renamed_12261();
        switch (n2) {
            case 1: {
                sprieo3 = new sprvlo();
                sprieo2 = sprieo3;
                break;
            }
            case 0: {
                sprieo3 = new sprleo(sprwbp2);
                sprieo2 = sprieo3;
                break;
            }
            case 2: {
                sprieo3 = new sprsgo(n3, sprwbp2);
                sprieo2 = sprieo3;
                break;
            }
            default: {
                sprieo3 = new sprleo(sprwbp.cfr_renamed_1513);
                sprieo2 = sprieo3;
            }
        }
        sprieo2.cfr_renamed_16244(n);
        return sprieo3;
    }

    public static sprieo cfr_renamed_16284(sprhio arg0) {
        sprhio sprhio2 = arg0;
        int n = (int)sprhio2.cfr_renamed_14060().cfr_renamed_3274() - 8;
        int n2 = sprhio2.cfr_renamed_12261();
        sprhio2.cfr_renamed_12261();
        sprhio sprhio3 = arg0;
        int n3 = sprhio3.cfr_renamed_12261();
        sprhio3.cfr_renamed_12261();
        sprhio sprhio4 = arg0;
        int n4 = sprhio4.cfr_renamed_12261();
        int n5 = sprhio4.cfr_renamed_12261();
        sprhio4.cfr_renamed_14060().cfr_renamed_11548(n + n3);
        sprrto sprrto2 = spraro.cfr_renamed_16217(sprhio4);
        if ((sprrto2.cfr_renamed_16218() & 0xFFFF) != 1) {
            sprleo sprleo2 = new sprleo(sprwbp.cfr_renamed_955);
            sprleo2.cfr_renamed_16244(n2);
            return sprleo2;
        }
        sprwbp[] sprwbpArray = new sprwbp[2];
        sprwbpArray[0] = sprloo.cfr_renamed_4;
        sprwbpArray[1] = sprloo.cfr_renamed_3;
        sprwbp[] sprwbpArray2 = sprwbpArray;
        arg0.cfr_renamed_14060().cfr_renamed_11548(n + n4);
        byte[] byArray = sprsto.cfr_renamed_16220(sprrto2, sprwbpArray2, arg0, n5);
        sprloo sprloo2 = new sprloo(byArray);
        sprloo2.cfr_renamed_16244(n2);
        return sprloo2;
    }
}

