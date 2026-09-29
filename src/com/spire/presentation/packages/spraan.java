/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvp;
import com.spire.presentation.packages.spryno;

@sprtea
public class spraan
implements sprvp {
    private sprqgp cfr_renamed_4;

    @Override
    public void cfr_renamed_12628(sprvp arg0) {
        this.cfr_renamed_12594(arg0.cfr_renamed_1778(), arg0.cfr_renamed_1997(), arg0.cfr_renamed_3369(), arg0.cfr_renamed_2112(), arg0.cfr_renamed_3688(), arg0.cfr_renamed_5958());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_12594(float f, float f2, float f3, float f4, float f5, float f6) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        spraan spraan2 = this;
        spraan2.cfr_renamed_4 = new sprqgp((float)arg0, (float)arg1, (float)arg2, (float)arg3, (float)arg4, (float)arg5);
    }

    public void cfr_renamed_12497(Object arg0) {
        this.cfr_renamed_4 = (sprqgp)arg0;
    }

    @Override
    public float cfr_renamed_3688() {
        return this.cfr_renamed_4.cfr_renamed_12599();
    }

    @Override
    public Object cfr_renamed_12496() {
        return this.cfr_renamed_4;
    }

    @Override
    public void cfr_renamed_12629(float arg0, float arg1) {
        this.cfr_renamed_4.cfr_renamed_12629(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public spraan(float f, float f2, float f3, float f4, float f5, float f6) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        spraan spraan2 = this;
        spraan2.cfr_renamed_4 = new sprqgp((float)arg0, (float)arg1, (float)arg2, (float)arg3, (float)arg4, (float)arg5);
    }

    @Override
    public float cfr_renamed_2112() {
        return this.cfr_renamed_4.cfr_renamed_12598();
    }

    @Override
    public void cfr_renamed_12630(sprvp arg0) {
        this.cfr_renamed_4.cfr_renamed_12593((sprqgp)arg0.cfr_renamed_12496());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_12631(float f, float f2, float[] fArray, float[] fArray2) {
        void arg1;
        void arg0;
        arg2[0] = this.cfr_renamed_1778() * arg0 + this.cfr_renamed_3369() * arg1 + this.cfr_renamed_3688();
        fArray2[0] = this.cfr_renamed_1997() * arg0 + this.cfr_renamed_2112() * arg1 + this.cfr_renamed_5958();
    }

    @Override
    public float cfr_renamed_1997() {
        return this.cfr_renamed_4.cfr_renamed_12596();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_12632(float f, float f2, float[] fArray, float[] fArray2) {
        void arg1;
        void arg0;
        arg2[0] = this.cfr_renamed_1778() * arg0 + this.cfr_renamed_3369() * arg1;
        fArray2[0] = this.cfr_renamed_1997() * arg0 + this.cfr_renamed_2112() * arg1;
    }

    @Override
    public void cfr_renamed_12633(sprvp arg0, int arg1) {
        this.cfr_renamed_4.cfr_renamed_12634((sprqgp)arg0.cfr_renamed_12496(), arg1);
    }

    @Override
    public sprvp cfr_renamed_12099() {
        new spraan().cfr_renamed_4 = this.cfr_renamed_4.cfr_renamed_12099();
        return new spraan();
    }

    public spraan() {
        spraan spraan2 = this;
        spraan2.cfr_renamed_4 = new sprqgp();
    }

    public float[] cfr_renamed_12635() {
        float[] fArray = new float[6];
        fArray[0] = this.cfr_renamed_1778();
        fArray[1] = this.cfr_renamed_1997();
        fArray[2] = this.cfr_renamed_3369();
        fArray[3] = this.cfr_renamed_2112();
        fArray[4] = this.cfr_renamed_3688();
        fArray[5] = this.cfr_renamed_5958();
        return fArray;
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_4.cfr_renamed_41();
    }

    @Override
    public float cfr_renamed_5958() {
        return this.cfr_renamed_4.cfr_renamed_12600();
    }

    @Override
    public float cfr_renamed_3369() {
        return this.cfr_renamed_4.cfr_renamed_12597();
    }

    public String toString() {
        Object[] objectArray = new Object[6];
        objectArray[0] = Float.valueOf(this.cfr_renamed_1778());
        objectArray[1] = Float.valueOf(this.cfr_renamed_1997());
        objectArray[2] = Float.valueOf(this.cfr_renamed_3369());
        objectArray[3] = Float.valueOf(this.cfr_renamed_2112());
        objectArray[4] = Float.valueOf(this.cfr_renamed_3688());
        objectArray[5] = Float.valueOf(this.cfr_renamed_5958());
        return sprraia.cfr_renamed_11562(spryno.cfr_renamed_9("\u001d;=#;3=\";3v:nhtnfhunf#o;=';3=&;3v:\u001b"), objectArray);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_12636(float f, float f2, float[] fArray, float[] fArray2) {
        void arg1;
        void arg0;
        arg2[0] = (this.cfr_renamed_2112() * arg0 - this.cfr_renamed_3369() * arg1) / (this.cfr_renamed_1778() * this.cfr_renamed_2112() - this.cfr_renamed_3369() * this.cfr_renamed_1997());
        fArray2[0] = (this.cfr_renamed_1778() * arg1 - this.cfr_renamed_1997() * arg0) / (this.cfr_renamed_1778() * this.cfr_renamed_2112() - this.cfr_renamed_3369() * this.cfr_renamed_1997());
    }

    private /* synthetic */ spraan(sprqgp sprqgp2) {
        this.cfr_renamed_4 = sprqgp2;
    }

    public void cfr_renamed_11665() {
    }

    @Override
    public float cfr_renamed_1778() {
        return this.cfr_renamed_4.cfr_renamed_12595();
    }
}

