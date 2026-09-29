/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravo;
import com.spire.presentation.packages.sprgvo;
import com.spire.presentation.packages.sprhuo;
import com.spire.presentation.packages.sprkzo;
import com.spire.presentation.packages.sprrzo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprujo;
import com.spire.presentation.packages.sprupo;

@sprtea
public class sprzzo
extends spravo {
    public static final String cfr_renamed_3 = "JSTF";
    private sprkzo[] cfr_renamed_4;

    @Override
    public String cfr_renamed_313() {
        return cfr_renamed_3;
    }

    public static sprgvo cfr_renamed_18839(sprujo arg0) {
        int n;
        sprujo sprujo2 = arg0;
        long l = sprujo2.cfr_renamed_14060().cfr_renamed_3274();
        int n2 = sprujo2.cfr_renamed_13218();
        int[] nArray = sprrzo.cfr_renamed_18661(sprujo2, n2 & 0xFFFF);
        sprupo[] sprupoArray = new sprupo[n2];
        int n3 = n = 0;
        while (n3 < nArray.length) {
            int n4 = n;
            arg0.cfr_renamed_14060().cfr_renamed_11548(l + (long)(nArray[n] & 0xFFFF));
            sprupoArray[n4] = sprzzo.cfr_renamed_18840(arg0);
            n3 = ++n;
        }
        sprgvo sprgvo2 = new sprgvo();
        sprgvo2.cfr_renamed_4 = sprupoArray;
        return sprgvo2;
    }

    public static sprupo cfr_renamed_18840(sprujo arg0) {
        sprupo sprupo2 = new sprupo();
        sprujo sprujo2 = arg0;
        sprupo sprupo3 = sprupo2;
        sprujo sprujo3 = arg0;
        sprupo sprupo4 = sprupo2;
        sprujo sprujo4 = arg0;
        sprupo2.cfr_renamed_91 = arg0.cfr_renamed_13218();
        sprupo2.cfr_renamed_4 = sprujo4.cfr_renamed_13218();
        sprupo4.cfr_renamed_0 = sprujo4.cfr_renamed_13218();
        sprupo4.cfr_renamed_112 = arg0.cfr_renamed_13218();
        sprupo2.cfr_renamed_119 = sprujo3.cfr_renamed_13218();
        sprupo3.cfr_renamed_152 = sprujo3.cfr_renamed_13218();
        sprupo3.cfr_renamed_1 = arg0.cfr_renamed_13218();
        sprupo2.cfr_renamed_3 = sprujo2.cfr_renamed_13218();
        sprupo2.cfr_renamed_2 = sprujo2.cfr_renamed_13218();
        sprupo2.cfr_renamed_86 = arg0.cfr_renamed_13218();
        return sprupo2;
    }

    @Override
    public void cfr_renamed_18686(sprujo arg0) {
        int n;
        sprujo sprujo2 = arg0;
        long l = sprujo2.cfr_renamed_14060().cfr_renamed_3274();
        int n2 = sprujo2.cfr_renamed_13218();
        int n3 = sprujo2.cfr_renamed_13218();
        sprhuo[] sprhuoArray = new sprhuo[sprujo2.cfr_renamed_13218()];
        int n4 = n = 0;
        while (n4 < sprhuoArray.length) {
            sprhuoArray[n++] = new sprhuo(this, sprrzo.cfr_renamed_18658(arg0.cfr_renamed_13220()), arg0.cfr_renamed_13218());
            n4 = n;
        }
        this.cfr_renamed_4 = new sprkzo[sprhuoArray.length];
        int n5 = n = 0;
        while (n5 < sprhuoArray.length) {
            sprhuo sprhuo2 = sprhuoArray[n];
            sprujo sprujo3 = arg0;
            sprujo3.cfr_renamed_14060().cfr_renamed_11548(l + (long)(sprhuo2.cfr_renamed_4 & 0xFFFF));
            sprkzo sprkzo2 = sprzzo.cfr_renamed_18841(sprujo3);
            sprkzo2.cfr_renamed_18842(sprhuo2.cfr_renamed_2);
            this.cfr_renamed_4[n++] = sprkzo2;
            n5 = n;
        }
    }

    public static sprkzo cfr_renamed_18841(sprujo arg0) {
        sprkzo sprkzo2 = new sprkzo();
        sprujo sprujo2 = arg0;
        long l = sprujo2.cfr_renamed_14060().cfr_renamed_3274();
        int n = sprujo2.cfr_renamed_13218();
        int n2 = sprujo2.cfr_renamed_13218();
        int n3 = sprujo2.cfr_renamed_13218();
        if ((n3 & 0xFFFF) > 0) {
            int n4;
            sprgvo[] sprgvoArray = new sprgvo[n3];
            int n5 = n4 = 0;
            while (n5 < (n3 & 0xFFFF)) {
                sprgvoArray[n4++] = sprzzo.cfr_renamed_18839(arg0);
                n5 = n4;
            }
            sprkzo2.cfr_renamed_4 = sprgvoArray;
        }
        if ((n & 0xFFFF) > 0) {
            sprujo sprujo3 = arg0;
            sprujo3.cfr_renamed_14060().cfr_renamed_11548(l + (long)(n & 0xFFFF));
            sprkzo2.cfr_renamed_1 = sprzzo.cfr_renamed_18843(sprujo3);
        }
        if ((n2 & 0xFFFF) > 0) {
            sprujo sprujo4 = arg0;
            sprujo4.cfr_renamed_14060().cfr_renamed_11548(l + (long)(n2 & 0xFFFF));
            sprkzo2.cfr_renamed_3 = sprzzo.cfr_renamed_18839(sprujo4);
        }
        return sprkzo2;
    }

    public static int[] cfr_renamed_18843(sprujo arg0) {
        sprujo sprujo2 = arg0;
        return sprrzo.cfr_renamed_18661(sprujo2, sprujo2.cfr_renamed_13218() & 0xFFFF);
    }
}

