/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraof;
import com.spire.presentation.packages.sprdab;
import com.spire.presentation.packages.sprdjf;
import com.spire.presentation.packages.sprhnf;
import com.spire.presentation.packages.sprjqf;
import com.spire.presentation.packages.sprkbz;
import com.spire.presentation.packages.sprknf;
import com.spire.presentation.packages.sprojf;
import com.spire.presentation.packages.sprxjf;
import com.spire.presentation.packages.spryof;

public class sprvkf {
    public static sprknf cfr_renamed_5742(spraof arg0, sprojf arg1, sprdjf arg2) {
        int n;
        if (arg1 == null) {
            throw new NullPointerException(sprkbz.cfr_renamed_9("sTaMjBHDz\u0001>\u001c#OvMo"));
        }
        if (arg2 == null) {
            throw new NullPointerException(sprdab.cfr_renamed_9("s%v3w2aa/|2/g-~"));
        }
        int n2 = arg0.cfr_renamed_2110().cfr_renamed_5786();
        byte[][] byArray = arg1.cfr_renamed_954();
        sprknf[] sprknfArray = new sprknf[byArray.length];
        int n3 = n = 0;
        while (n3 < byArray.length) {
            int n4 = n;
            sprknf sprknf2 = new sprknf(0, byArray[n]);
            sprknfArray[n4] = sprknf2;
            n3 = ++n;
        }
        arg2 = (sprdjf)((sprhnf)((sprhnf)((sprhnf)new sprhnf().cfr_renamed_5733(arg2.cfr_renamed_5734())).cfr_renamed_5735(arg2.cfr_renamed_5736())).cfr_renamed_5737(arg2.cfr_renamed_5819()).cfr_renamed_5743(0).cfr_renamed_5739(arg2.cfr_renamed_5744()).cfr_renamed_5745(arg2.cfr_renamed_5746())).cfr_renamed_1451();
        int n5 = n2;
        while (n5 > 1) {
            int n6 = n = 0;
            while (n6 < (int)Math.floor(n2 / 2)) {
                arg2 = (sprdjf)((sprhnf)((sprhnf)((sprhnf)new sprhnf().cfr_renamed_5733(arg2.cfr_renamed_5734())).cfr_renamed_5735(arg2.cfr_renamed_5736())).cfr_renamed_5737(arg2.cfr_renamed_5819()).cfr_renamed_5743(arg2.cfr_renamed_5747()).cfr_renamed_5739(n).cfr_renamed_5745(arg2.cfr_renamed_5746())).cfr_renamed_1451();
                sprknfArray[++n] = sprvkf.cfr_renamed_5748(arg0, sprknfArray[2 * n], sprknfArray[2 * n + 1], arg2);
                n6 = n;
            }
            if (n2 % 2 == 1) {
                sprknfArray[(int)Math.floor((double)((double)(n2 / 2)))] = sprknfArray[n2 - 1];
            }
            n2 = (int)Math.ceil((double)n2 / 2.0);
            arg2 = (sprdjf)((sprhnf)((sprhnf)((sprhnf)new sprhnf().cfr_renamed_5733(arg2.cfr_renamed_5734())).cfr_renamed_5735(arg2.cfr_renamed_5736())).cfr_renamed_5737(arg2.cfr_renamed_5819()).cfr_renamed_5743(arg2.cfr_renamed_5747() + 1).cfr_renamed_5739(arg2.cfr_renamed_5744()).cfr_renamed_5745(arg2.cfr_renamed_5746())).cfr_renamed_1451();
            n5 = n2;
        }
        return sprknfArray[0];
    }

    public static sprknf cfr_renamed_5748(spraof arg0, sprknf arg1, sprknf arg2, spryof arg3) {
        int n;
        spraof spraof2;
        Object object;
        spraof spraof3;
        Object object2;
        spraof spraof4;
        Object object3;
        if (arg1 == null) {
            throw new NullPointerException(sprkbz.cfr_renamed_9("MfGw\u0001>\u001c#OvMo"));
        }
        if (arg2 == null) {
            throw new NullPointerException(sprdab.cfr_renamed_9("`(u)fa/|2/g-~"));
        }
        if (arg1.cfr_renamed_1452() != arg2.cfr_renamed_1452()) {
            throw new IllegalStateException(sprkbz.cfr_renamed_9("IfHdIw\u0001lG#ClUk\u0001mNgDp\u0001nTpU#Cf\u0001fPv@o"));
        }
        if (arg3 == null) {
            throw new NullPointerException(sprdab.cfr_renamed_9("s%v3w2aa/|2/g-~"));
        }
        byte[] byArray = arg0.cfr_renamed_5769();
        if (arg3 instanceof sprdjf) {
            object3 = (sprdjf)arg3;
            arg3 = (sprdjf)((sprhnf)((sprhnf)((sprhnf)new sprhnf().cfr_renamed_5733(((spryof)object3).cfr_renamed_5734())).cfr_renamed_5735(((spryof)object3).cfr_renamed_5736())).cfr_renamed_5737(((sprdjf)object3).cfr_renamed_5819()).cfr_renamed_5743(((sprdjf)object3).cfr_renamed_5747()).cfr_renamed_5739(((sprdjf)object3).cfr_renamed_5744()).cfr_renamed_5745(0)).cfr_renamed_1451();
            spraof4 = arg0;
        } else {
            if (arg3 instanceof sprjqf) {
                object3 = (sprjqf)arg3;
                arg3 = (sprjqf)((sprxjf)((sprxjf)((sprxjf)new sprxjf().cfr_renamed_5733(((spryof)object3).cfr_renamed_5734())).cfr_renamed_5735(((spryof)object3).cfr_renamed_5736())).cfr_renamed_5743(((sprjqf)object3).cfr_renamed_5747()).cfr_renamed_5739(((sprjqf)object3).cfr_renamed_5744()).cfr_renamed_5745(0)).cfr_renamed_1451();
            }
            spraof4 = arg0;
        }
        object3 = spraof4.cfr_renamed_5784().cfr_renamed_5773(byArray, arg3.cfr_renamed_954());
        if (arg3 instanceof sprdjf) {
            object2 = (sprdjf)arg3;
            arg3 = (sprdjf)((sprhnf)((sprhnf)((sprhnf)new sprhnf().cfr_renamed_5733(((spryof)object2).cfr_renamed_5734())).cfr_renamed_5735(((spryof)object2).cfr_renamed_5736())).cfr_renamed_5737(((sprdjf)object2).cfr_renamed_5819()).cfr_renamed_5743(((sprdjf)object2).cfr_renamed_5747()).cfr_renamed_5739(((sprdjf)object2).cfr_renamed_5744()).cfr_renamed_5745(1)).cfr_renamed_1451();
            spraof3 = arg0;
        } else {
            if (arg3 instanceof sprjqf) {
                object2 = (sprjqf)arg3;
                arg3 = (sprjqf)((sprxjf)((sprxjf)((sprxjf)new sprxjf().cfr_renamed_5733(((spryof)object2).cfr_renamed_5734())).cfr_renamed_5735(((spryof)object2).cfr_renamed_5736())).cfr_renamed_5743(((sprjqf)object2).cfr_renamed_5747()).cfr_renamed_5739(((sprjqf)object2).cfr_renamed_5744()).cfr_renamed_5745(1)).cfr_renamed_1451();
            }
            spraof3 = arg0;
        }
        object2 = spraof3.cfr_renamed_5784().cfr_renamed_5773(byArray, arg3.cfr_renamed_954());
        spryof spryof2 = arg3;
        if (arg3 instanceof sprdjf) {
            object = (sprdjf)spryof2;
            arg3 = (sprdjf)((sprhnf)((sprhnf)((sprhnf)new sprhnf().cfr_renamed_5733(((spryof)object).cfr_renamed_5734())).cfr_renamed_5735(((spryof)object).cfr_renamed_5736())).cfr_renamed_5737(((sprdjf)object).cfr_renamed_5819()).cfr_renamed_5743(((sprdjf)object).cfr_renamed_5747()).cfr_renamed_5739(((sprdjf)object).cfr_renamed_5744()).cfr_renamed_5745(2)).cfr_renamed_1451();
            spraof2 = arg0;
        } else {
            if (spryof2 instanceof sprjqf) {
                object = (sprjqf)arg3;
                arg3 = (sprjqf)((sprxjf)((sprxjf)((sprxjf)new sprxjf().cfr_renamed_5733(((spryof)object).cfr_renamed_5734())).cfr_renamed_5735(((spryof)object).cfr_renamed_5736())).cfr_renamed_5743(((sprjqf)object).cfr_renamed_5747()).cfr_renamed_5739(((sprjqf)object).cfr_renamed_5744()).cfr_renamed_5745(2)).cfr_renamed_1451();
            }
            spraof2 = arg0;
        }
        object = spraof2.cfr_renamed_5784().cfr_renamed_5773(byArray, arg3.cfr_renamed_954());
        int n2 = arg0.cfr_renamed_2110().cfr_renamed_5732();
        byte[] byArray2 = new byte[2 * n2];
        int n3 = n = 0;
        while (n3 < n2) {
            int n4 = n;
            byte by = (byte)(arg1.cfr_renamed_97()[n] ^ object2[n4]);
            byArray2[n4] = by;
            n3 = ++n;
        }
        int n5 = n = 0;
        while (n5 < n2) {
            int n6 = n + n2;
            byte by = (byte)(arg2.cfr_renamed_97()[n] ^ object[n]);
            byArray2[n6] = by;
            n5 = ++n;
        }
        byte[] byArray3 = arg0.cfr_renamed_5784().cfr_renamed_5820((byte[])object3, byArray2);
        return new sprknf(arg1.cfr_renamed_1452(), byArray3);
    }
}

