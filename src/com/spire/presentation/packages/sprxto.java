/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravp;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprfso;
import com.spire.presentation.packages.sprkto;
import com.spire.presentation.packages.sprmvo;
import com.spire.presentation.packages.sprnyja;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprpt;
import com.spire.presentation.packages.sprruo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtzja;
import com.spire.presentation.packages.sprwfp;
import java.util.Iterator;

@sprtea
public class sprxto
implements sprpt {
    private static final int cfr_renamed_1 = 44;
    private int cfr_renamed_2 = 65536;
    private spravp cfr_renamed_3;
    private static final int cfr_renamed_4 = 20;

    public sprxto() {
        sprxto sprxto2 = this;
        this.cfr_renamed_3 = new spravp(true);
    }

    private /* synthetic */ int cfr_renamed_18080(byte[] arg0) {
        Object object;
        sprfso sprfso2 = new sprfso(this.cfr_renamed_2);
        Object object2 = object = this.cfr_renamed_3.iterator();
        while (object2.hasNext()) {
            sprnyja sprnyja2 = (sprnyja)object.next();
            String string = (String)sprnyja2.getKey();
            byte[] byArray = (byte[])sprnyja2.getValue();
            if ("head".equals(string)) {
                byArray = arg0;
            }
            sprfso2.cfr_renamed_15094(string, byArray);
            object2 = object;
        }
        object = sprfso2.cfr_renamed_15096();
        return (int)(2981146554L - (long)sprkto.cfr_renamed_18081((byte[])object) & 0xFFFFFFFFL);
    }

    private static /* synthetic */ void cfr_renamed_18082(sprruo arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        int n;
        int n2 = n = 0;
        while (n2 < arg1.length()) {
            arg0.cfr_renamed_11594((byte)arg1.charAt(n++));
            n2 = n;
        }
        sprruo sprruo2 = arg0;
        arg0.cfr_renamed_12761(arg2);
        sprruo2.cfr_renamed_12761(arg3);
        sprruo2.cfr_renamed_12761(arg4);
        arg0.cfr_renamed_12761(arg5);
    }

    @Override
    public void cfr_renamed_18083(int arg0) {
        this.cfr_renamed_2 = arg0;
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

    private /* synthetic */ int cfr_renamed_18085() {
        Iterator iterator;
        int n = 12;
        n = 12 + 16 * this.cfr_renamed_3.size();
        Iterator iterator2 = iterator = this.cfr_renamed_3.iterator();
        while (iterator2.hasNext()) {
            byte[] byArray = (byte[])((sprnyja)iterator.next()).getValue();
            n += (int)((long)(byArray.length + 3) & 0xFFFFFFFCL);
            iterator2 = iterator;
        }
        return n;
    }

    public sprxto(int n) {
        this();
        this.cfr_renamed_2 = n;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_18086(sprruo sprruo2) {
        void arg0;
        void v0 = arg0;
        void v1 = arg0;
        void v2 = arg0;
        void v3 = arg0;
        void v4 = arg0;
        void v5 = arg0;
        sprxto sprxto2 = this;
        void v7 = arg0;
        v7.cfr_renamed_12761(2001684038);
        v5.cfr_renamed_12761(sprxto2.cfr_renamed_2);
        v5.cfr_renamed_12761((int)v7.cfr_renamed_14060().cfr_renamed_806());
        v4.cfr_renamed_14639(sprxto2.cfr_renamed_3.size());
        v4.cfr_renamed_14639(0);
        v3.cfr_renamed_12761(this.cfr_renamed_18085());
        v3.cfr_renamed_14639(1);
        v2.cfr_renamed_14639(0);
        v2.cfr_renamed_12761(0);
        v1.cfr_renamed_12761(0);
        v1.cfr_renamed_12761(0);
        v0.cfr_renamed_12761(0);
        v0.cfr_renamed_12761(0);
    }

    private static /* synthetic */ void cfr_renamed_18087(sprruo arg0) {
        sprmvo.cfr_renamed_17419(arg0.cfr_renamed_14060(), 4);
    }

    private static /* synthetic */ int cfr_renamed_18081(byte[] arg0) {
        byte[] byArray = new byte[(int)((long)(arg0.length + 3) & 0xFFFFFFFCL)];
        System.arraycopy(arg0, 0, byArray, 0, arg0.length);
        return sprkto.cfr_renamed_18081(byArray);
    }

    @Override
    public void cfr_renamed_15094(String arg0, byte[] arg1) {
        this.cfr_renamed_3.cfr_renamed_12160(arg0, arg1);
    }

    @Override
    public int cfr_renamed_18088() {
        return this.cfr_renamed_2;
    }

    @Override
    public void cfr_renamed_18084(spreen arg0) {
        Iterator iterator;
        sprruo sprruo2 = new sprruo(arg0);
        spreen spreen2 = arg0;
        long l = spreen2.cfr_renamed_3274();
        spreen2.cfr_renamed_11548(l + 44L);
        long l2 = spreen2.cfr_renamed_3274();
        spreen2.cfr_renamed_11548(l2 + (long)(20 * this.cfr_renamed_3.size()));
        long l3 = spreen2.cfr_renamed_3274();
        Iterator iterator2 = iterator = this.cfr_renamed_3.iterator();
        while (iterator2.hasNext()) {
            byte[] byArray;
            sprnyja sprnyja2 = (sprnyja)iterator.next();
            String string = (String)sprnyja2.getKey();
            byte[] byArray2 = (byte[])sprnyja2.getValue();
            if ("head".equals(string)) {
                byArray2[8] = 0;
                byArray2[9] = 0;
                byArray2[10] = 0;
                byArray2[11] = 0;
            }
            int n = sprxto.cfr_renamed_18081(byArray2);
            if ("head".equals(string)) {
                int n2 = this.cfr_renamed_18080(byArray2);
                byte[] byArray3 = sprtzja.cfr_renamed_12109(n2);
                byArray2[8] = byArray3[3];
                byArray2[9] = byArray3[2];
                byArray2[10] = byArray3[1];
                byArray2[11] = byArray3[0];
            }
            if ((byArray = sprwfp.cfr_renamed_12187(byArray2, 1)).length >= byArray2.length) {
                byArray = byArray2;
            }
            arg0.cfr_renamed_11548(l2);
            sprxto.cfr_renamed_18082(sprruo2, string, (int)l3, byArray.length, byArray2.length, n);
            l2 += 20L;
            arg0.cfr_renamed_11548(l3);
            sprruo2.cfr_renamed_15098(byArray, 0, byArray.length);
            iterator2 = iterator;
            sprxto.cfr_renamed_18087(sprruo2);
            l3 = arg0.cfr_renamed_3274();
        }
        arg0.cfr_renamed_11548(l);
        this.cfr_renamed_18086(sprruo2);
    }
}

