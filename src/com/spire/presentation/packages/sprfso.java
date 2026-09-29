/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravp;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprkto;
import com.spire.presentation.packages.sprmvo;
import com.spire.presentation.packages.sprnyja;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprpt;
import com.spire.presentation.packages.sprpxo;
import com.spire.presentation.packages.sprruo;
import com.spire.presentation.packages.sprtea;
import java.util.Iterator;

@sprtea
public class sprfso
implements sprpt {
    private spravp cfr_renamed_3;
    private int cfr_renamed_4 = 65536;

    @Override
    public void cfr_renamed_18083(int arg0) {
        this.cfr_renamed_4 = arg0;
    }

    @Override
    public void cfr_renamed_15094(String arg0, byte[] arg1) {
        this.cfr_renamed_3.cfr_renamed_12160(arg0, arg1);
    }

    private static /* synthetic */ void cfr_renamed_18087(sprruo arg0) {
        sprmvo.cfr_renamed_17419(arg0.cfr_renamed_14060(), 4);
    }

    @Override
    public int cfr_renamed_18088() {
        return this.cfr_renamed_4;
    }

    @Override
    public void cfr_renamed_18084(spreen arg0) {
        Iterator iterator;
        sprruo sprruo2 = new sprruo(arg0);
        sprpxo sprpxo2 = new sprpxo();
        spreen spreen2 = arg0;
        sprfso sprfso2 = this;
        sprpxo2.cfr_renamed_2 = sprfso2.cfr_renamed_4;
        sprpxo2.cfr_renamed_4 = sprfso2.cfr_renamed_3.size();
        sprpxo2.cfr_renamed_18252(sprruo2);
        long l = spreen2.cfr_renamed_3274() + (long)(16 * this.cfr_renamed_3.size());
        long l2 = spreen2.cfr_renamed_3274();
        Iterator iterator2 = iterator = this.cfr_renamed_3.iterator();
        while (iterator2.hasNext()) {
            sprnyja sprnyja2 = (sprnyja)iterator.next();
            arg0.cfr_renamed_11548(l2);
            byte[] byArray = (byte[])sprnyja2.getValue();
            sprkto sprkto2 = new sprkto();
            new sprkto().cfr_renamed_0 = (String)sprnyja2.getKey();
            sprkto2.cfr_renamed_2 = byArray.length;
            spreen spreen3 = arg0;
            sprruo sprruo3 = sprruo2;
            sprkto2.cfr_renamed_3 = l;
            sprkto2.cfr_renamed_4 = sprkto.cfr_renamed_18081(byArray);
            sprkto2.cfr_renamed_18252(sprruo3);
            l2 = spreen3.cfr_renamed_3274();
            spreen3.cfr_renamed_11548(l);
            sprruo3.cfr_renamed_15098(byArray, 0, byArray.length);
            iterator2 = iterator;
            sprfso.cfr_renamed_18087(sprruo2);
            l = arg0.cfr_renamed_3274();
        }
    }

    public sprfso() {
        sprfso sprfso2 = this;
        this.cfr_renamed_3 = new spravp(true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_15096() {
        sprpdja sprpdja2 = new sprpdja();
        try {
            this.cfr_renamed_18084(sprpdja2);
            byte[] byArray = sprpdja2.cfr_renamed_4529();
            return byArray;
        }
        finally {
            if (sprpdja2 != null) {
                sprpdja2.cfr_renamed_2637();
            }
        }
    }

    public sprfso(int n) {
        this();
        this.cfr_renamed_4 = n;
    }
}

