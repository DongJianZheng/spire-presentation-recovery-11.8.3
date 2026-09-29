/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbrn;
import com.spire.presentation.packages.sprghp;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprru;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprxqn;

@sprtea
public class sprnrn {
    public float cfr_renamed_86;
    public float cfr_renamed_152;
    public float cfr_renamed_112;
    public sprru cfr_renamed_119;
    public float cfr_renamed_91;
    public static final float cfr_renamed_0 = 0.001f;
    public float cfr_renamed_1;
    public sprwbp cfr_renamed_2;
    public sprsuja[] cfr_renamed_3;
    public float cfr_renamed_4;

    public void cfr_renamed_12791(sprxqn arg0, float arg1, float arg2, boolean arg3) {
        boolean bl;
        if (this.cfr_renamed_1 == 0.0f) {
            bl = arg3;
            sprnrn sprnrn2 = this;
            sprnrn2.cfr_renamed_3[0] = new sprsuja(this.cfr_renamed_112, 0.0f);
            sprnrn2.cfr_renamed_3[1] = new sprsuja(this.cfr_renamed_112, arg2);
            sprnrn2.cfr_renamed_119.cfr_renamed_12622(this.cfr_renamed_112, 0.0f);
            sprnrn2.cfr_renamed_119.cfr_renamed_12608(this.cfr_renamed_112, arg2);
            sprnrn2.cfr_renamed_119.cfr_renamed_12608(this.cfr_renamed_86, arg2);
            sprnrn2.cfr_renamed_119.cfr_renamed_12608(this.cfr_renamed_86, 0.0f);
        } else if (this.cfr_renamed_91 == 0.0f) {
            bl = arg3;
            sprnrn sprnrn3 = this;
            sprnrn3.cfr_renamed_3[0] = new sprsuja(0.0f, this.cfr_renamed_152);
            sprnrn3.cfr_renamed_3[1] = new sprsuja(arg1, this.cfr_renamed_152);
            sprnrn3.cfr_renamed_119.cfr_renamed_12622(0.0f, this.cfr_renamed_152);
            sprnrn3.cfr_renamed_119.cfr_renamed_12608(arg1, this.cfr_renamed_152);
            sprnrn3.cfr_renamed_119.cfr_renamed_12608(arg1, this.cfr_renamed_4);
            sprnrn3.cfr_renamed_119.cfr_renamed_12608(0.0f, this.cfr_renamed_4);
        } else {
            sprnrn sprnrn4 = this;
            sprnrn sprnrn5 = this;
            sprnrn sprnrn6 = this;
            float f = sprnrn4.cfr_renamed_12792(sprnrn4.cfr_renamed_112, sprnrn5.cfr_renamed_152, sprnrn6.cfr_renamed_91, sprnrn6.cfr_renamed_1);
            float f2 = -f / this.cfr_renamed_1;
            float f3 = -(f + arg1 * this.cfr_renamed_91) / this.cfr_renamed_1;
            sprnrn5.cfr_renamed_3[0] = new sprsuja(0.0f, (float)sprrgga.cfr_renamed_12793(f2));
            sprnrn4.cfr_renamed_3[1] = new sprsuja(arg1, (float)sprrgga.cfr_renamed_12793(f3));
            sprnrn sprnrn7 = this;
            if (sprnrn4.cfr_renamed_4 == 0.0f) {
                sprnrn7.cfr_renamed_119.cfr_renamed_12622(0.0f, f2 + 1.0f);
                bl = arg3;
                sprnrn sprnrn8 = this;
                sprnrn8.cfr_renamed_119.cfr_renamed_12608(arg1, f3 + 1.0f);
                sprnrn sprnrn9 = this;
                sprnrn8.cfr_renamed_119.cfr_renamed_12608(arg1, sprnrn9.cfr_renamed_4);
                sprnrn9.cfr_renamed_119.cfr_renamed_12608(0.0f, this.cfr_renamed_4);
            } else {
                sprnrn7.cfr_renamed_119.cfr_renamed_12622(0.0f, f2 - 1.0f);
                bl = arg3;
                sprnrn sprnrn10 = this;
                sprnrn10.cfr_renamed_119.cfr_renamed_12608(arg1, f3 - 1.0f);
                sprnrn sprnrn11 = this;
                sprnrn10.cfr_renamed_119.cfr_renamed_12608(arg1, sprnrn11.cfr_renamed_4);
                sprnrn11.cfr_renamed_119.cfr_renamed_12608(0.0f, this.cfr_renamed_4);
            }
        }
        if (bl) {
            sprghp sprghp2 = new sprghp(this.cfr_renamed_2);
            sprovja.cfr_renamed_11658(arg0.cfr_renamed_4, this.cfr_renamed_119.cfr_renamed_12496());
            sprovja.cfr_renamed_11658(arg0.cfr_renamed_4, sprghp2);
        }
    }

    public float cfr_renamed_12792(float arg0, float arg1, float arg2, float arg3) {
        return -(arg1 * arg3 + arg0 * arg2);
    }

    public sprru cfr_renamed_12794() {
        return this.cfr_renamed_119;
    }

    /*
     * WARNING - void declaration
     */
    public sprnrn(float f, float f2, float f3, float f4, float f5, float f6, sprwbp sprwbp2) {
        void arg6;
        sprnrn sprnrn2;
        void v3;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprnrn sprnrn3 = this;
        sprnrn3.cfr_renamed_119 = sprbrn.cfr_renamed_12653(0);
        sprnrn3.cfr_renamed_3 = new sprsuja[2];
        sprnrn sprnrn4 = this;
        sprnrn sprnrn5 = this;
        sprnrn5.cfr_renamed_86 = arg0;
        sprnrn5.cfr_renamed_4 = arg1;
        sprnrn4.cfr_renamed_112 = arg2;
        sprnrn4.cfr_renamed_152 = arg3;
        if (Math.abs((float)arg4) < 0.001f) {
            v3 = arg5;
            this.cfr_renamed_91 = 0.0f;
        } else {
            this.cfr_renamed_91 = arg4;
            v3 = arg5;
        }
        if (Math.abs((float)v3) < 0.001f) {
            sprnrn2 = this;
            this.cfr_renamed_1 = 0.0f;
        } else {
            sprnrn2 = this;
            this.cfr_renamed_1 = arg5;
        }
        sprnrn2.cfr_renamed_2 = arg6;
    }
}

