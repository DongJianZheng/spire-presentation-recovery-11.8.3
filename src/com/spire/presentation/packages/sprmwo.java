/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprhso;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtpo;
import com.spire.presentation.packages.spryxo;
import java.util.Iterator;

@sprtea
public final class sprmwo {
    public static void cfr_renamed_18765(sprfzo arg0, sprhso arg1) {
        int n;
        Iterator iterator;
        sprtpo[] sprtpoArray = new sprtpo[arg0.cfr_renamed_13027().cfr_renamed_11861()];
        int n2 = 0;
        spryxo[] spryxoArray = arg1.cfr_renamed_4;
        n2 = 0;
        if (spryxoArray.cfr_renamed_4 != null) {
            Iterator iterator2 = iterator = spryxoArray.cfr_renamed_4.cfr_renamed_18766().iterator();
            while (iterator2.hasNext()) {
                n = (Integer)iterator.next();
                iterator2 = iterator;
                sprmwo.cfr_renamed_18767(sprtpoArray, n).cfr_renamed_18768(spryxoArray.cfr_renamed_3[n2++]);
            }
        }
        spryxoArray = arg1.cfr_renamed_0;
        n2 = 0;
        if (spryxoArray.cfr_renamed_3 != null) {
            iterator = spryxoArray.cfr_renamed_3.cfr_renamed_18766().iterator();
            Iterator iterator3 = iterator;
            while (iterator3.hasNext()) {
                n = (Integer)iterator.next();
                iterator3 = iterator;
                sprmwo.cfr_renamed_18767(sprtpoArray, n).cfr_renamed_18769(spryxoArray.cfr_renamed_4[n2++]);
            }
        }
        n2 = 0;
        if (arg1.cfr_renamed_1 != null) {
            spryxo[] spryxoArray2 = spryxoArray = arg1.cfr_renamed_1.cfr_renamed_18766().iterator();
            while (spryxoArray2.hasNext()) {
                int n3 = (Integer)spryxoArray.next();
                spryxoArray2 = spryxoArray;
                ++n2;
                sprmwo.cfr_renamed_18767(sprtpoArray, n3).cfr_renamed_18770(true);
            }
        }
        n2 = 0;
        if (arg1.cfr_renamed_119 != null) {
            sprhso sprhso2 = arg1;
            spryxoArray = sprhso2.cfr_renamed_112;
            iterator = sprhso2.cfr_renamed_119.cfr_renamed_18766().iterator();
            Iterator iterator4 = iterator;
            while (iterator4.hasNext()) {
                n = (Integer)iterator.next();
                iterator4 = iterator;
                sprmwo.cfr_renamed_18767(sprtpoArray, n).cfr_renamed_18771(spryxoArray[n2++]);
            }
        }
        spryxoArray = arg1.cfr_renamed_3;
        n2 = 0;
        iterator = spryxoArray.cfr_renamed_4.cfr_renamed_18766().iterator();
        Iterator iterator5 = iterator;
        while (iterator5.hasNext()) {
            n = (Integer)iterator.next();
            iterator5 = iterator;
            sprmwo.cfr_renamed_18767((sprtpo[])sprtpoArray, (int)n).cfr_renamed_4 = spryxoArray.cfr_renamed_3[n2++];
        }
        n2 = 0;
        if (spryxoArray.cfr_renamed_0 != null) {
            iterator = spryxoArray.cfr_renamed_0.cfr_renamed_18766().iterator();
            Iterator iterator6 = iterator;
            while (iterator6.hasNext()) {
                n = (Integer)iterator.next();
                iterator6 = iterator;
                sprmwo.cfr_renamed_18767((sprtpo[])sprtpoArray, (int)n).cfr_renamed_0 = spryxoArray.cfr_renamed_2[n2++];
            }
        }
    }

    public static sprtpo cfr_renamed_18767(sprtpo[] arg0, int arg1) {
        if (arg0[arg1 & 0xFFFF] != null) {
            return arg0[arg1 & 0xFFFF];
        }
        sprtpo sprtpo2 = new sprtpo(arg1);
        arg0[arg1 & 0xFFFF] = sprtpo2;
        return sprtpo2;
    }
}

