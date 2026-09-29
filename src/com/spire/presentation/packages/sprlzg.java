/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprar;
import com.spire.presentation.packages.sprcvz;
import com.spire.presentation.packages.sprfvd;
import com.spire.presentation.packages.sprghm;
import com.spire.presentation.packages.sprifm;
import com.spire.presentation.packages.sprikl;
import com.spire.presentation.packages.sprohl;
import com.spire.presentation.packages.sprrk;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprudl;
import com.spire.presentation.packages.sprwcm;
import com.spire.presentation.packages.sprwhm;
import com.spire.presentation.packages.sprwil;
import java.io.IOException;

public class sprlzg
implements sprrk {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_7812(sprifm arg0) throws sprtqg {
        sprikl sprikl2;
        sprikl sprikl3;
        Object object;
        sprifm sprifm2 = arg0;
        sprar sprar2 = sprifm2.cfr_renamed_1521();
        if (sprifm2.cfr_renamed_3() > 3) {
            if (arg0.cfr_renamed_3() == 4) {
                try {
                    object = arg0.cfr_renamed_7661();
                    sprikl sprikl4 = sprikl3 = new sprwil();
                    sprikl4.cfr_renamed_1221((byte)-103);
                    sprikl4.cfr_renamed_1221((byte)(((Object)object).length >> 8));
                    sprikl3.cfr_renamed_1221((byte)((Object)object).length);
                    Object object2 = object;
                    sprikl3.cfr_renamed_1197((byte[])object2, 0, ((Object)object2).length);
                    sprikl2 = sprikl3;
                }
                catch (IOException iOException) {
                    throw new sprtqg(new StringBuilder().insert(0, sprfvd.cfr_renamed_9("!o,)6.'`!a&kbe'wbm-c2a,k,z14b")).append(iOException.getMessage()).toString(), iOException);
                }
            } else {
                if (arg0.cfr_renamed_3() != 6) {
                    throw new sprwhm(new StringBuilder().insert(0, sprfvd.cfr_renamed_9("\u0017`1{2~-|6k&.\u0012I\u0012.)k;.4k0}+a,4b")).append(arg0.cfr_renamed_3()).toString());
                }
                try {
                    object = arg0.cfr_renamed_7661();
                    sprikl sprikl5 = sprikl3 = new sprohl();
                    sprikl5.cfr_renamed_1221((byte)-101);
                    sprikl5.cfr_renamed_1221((byte)(((Object)object).length >> 24));
                    sprikl3.cfr_renamed_1221((byte)(((Object)object).length >> 16));
                    sprikl3.cfr_renamed_1221((byte)(((Object)object).length >> 8));
                    sprikl3.cfr_renamed_1221((byte)((Object)object).length);
                    Object object3 = object;
                    sprikl3.cfr_renamed_1197((byte[])object3, 0, ((Object)object3).length);
                    sprikl2 = sprikl3;
                }
                catch (IOException iOException) {
                    throw new sprtqg(new StringBuilder().insert(0, sprcvz.cfr_renamed_9("&c+%1\" l&m!gei {ea*o5m+g+v68e")).append(iOException.getMessage()).toString(), iOException);
                }
            }
        } else {
            object = (sprwcm)sprar2;
            try {
                sprikl3 = new sprudl();
                byte[] byArray = new sprghm(((sprwcm)object).cfr_renamed_2295()).cfr_renamed_91();
                sprikl3.cfr_renamed_1197(byArray, 2, byArray.length - 2);
                byArray = new sprghm(((sprwcm)object).cfr_renamed_2296()).cfr_renamed_91();
                sprikl3.cfr_renamed_1197(byArray, 2, byArray.length - 2);
            }
            catch (IOException iOException) {
                throw new sprtqg(new StringBuilder().insert(0, sprcvz.cfr_renamed_9("&c+%1\" l&m!gei {ea*o5m+g+v68e")).append(iOException.getMessage()).toString(), iOException);
            }
            sprikl2 = sprikl3;
        }
        Object object4 = object = (Object)new byte[sprikl2.cfr_renamed_1218()];
        sprikl3.cfr_renamed_1219((byte[])object4, 0);
        return object4;
    }
}

