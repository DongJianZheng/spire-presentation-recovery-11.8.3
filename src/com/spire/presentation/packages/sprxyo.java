/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;

@sprtea
public final class sprxyo {
    public static sprxyo cfr_renamed_119;
    public float cfr_renamed_91;
    public float cfr_renamed_0;
    public static sprxyo cfr_renamed_1;
    public static sprxyo cfr_renamed_2;
    public static sprxyo cfr_renamed_3;
    public static sprxyo cfr_renamed_4;

    public static sprxyo cfr_renamed_18256(sprxyo arg0, sprxyo arg1) {
        return new sprxyo(arg0.cfr_renamed_0 - arg1.cfr_renamed_0, arg0.cfr_renamed_91 - arg1.cfr_renamed_91);
    }

    public static sprxyo cfr_renamed_18257(sprxyo arg0, float arg1) {
        return new sprxyo(arg0.cfr_renamed_0 * arg1, arg0.cfr_renamed_91 * arg1);
    }

    public static boolean cfr_renamed_18258(sprxyo arg0, sprxyo arg1) {
        return arg0.cfr_renamed_0 == arg1.cfr_renamed_0 && arg0.cfr_renamed_91 == arg1.cfr_renamed_91;
    }

    public double cfr_renamed_4256() {
        sprxyo sprxyo2 = this;
        sprxyo sprxyo3 = this;
        return Math.sqrt(sprxyo2.cfr_renamed_0 * sprxyo2.cfr_renamed_0 + sprxyo3.cfr_renamed_91 * sprxyo3.cfr_renamed_91);
    }

    public static sprxyo cfr_renamed_18259() {
        return cfr_renamed_3;
    }

    public static sprxyo cfr_renamed_18260() {
        return cfr_renamed_4;
    }

    public static sprxyo cfr_renamed_18261(sprxyo arg0, sprxyo arg1) {
        return new sprxyo(arg0.cfr_renamed_0 + arg1.cfr_renamed_0, arg0.cfr_renamed_91 + arg1.cfr_renamed_91);
    }

    public sprxyo() {
    }

    public static boolean cfr_renamed_18262(sprxyo arg0, sprxyo arg1) {
        return arg0.cfr_renamed_0 != arg1.cfr_renamed_0 || arg0.cfr_renamed_91 != arg1.cfr_renamed_91;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public static sprxyo cfr_renamed_18263(sprxyo arg0, float arg1) {
        return new sprxyo(arg0.cfr_renamed_0 + arg1, arg0.cfr_renamed_91 + arg1);
    }

    public static double cfr_renamed_18264(sprxyo arg0, sprxyo arg1) {
        return arg0.cfr_renamed_0 * arg1.cfr_renamed_0 + arg0.cfr_renamed_91 * arg1.cfr_renamed_91;
    }

    static {
        cfr_renamed_2 = new sprxyo(0.0f, 0.0f);
        cfr_renamed_3 = new sprxyo(1.0f, 1.0f);
        cfr_renamed_4 = new sprxyo(1.0f, 0.0f);
        cfr_renamed_1 = new sprxyo(0.0f, 1.0f);
        cfr_renamed_119 = new sprxyo(0.0f, 0.0f);
    }

    /*
     * WARNING - void declaration
     */
    public sprxyo(float f, float f2) {
        void arg0;
        sprxyo sprxyo2 = this;
        sprxyo2.cfr_renamed_0 = arg0;
        sprxyo2.cfr_renamed_91 = f2;
    }

    public static sprxyo cfr_renamed_18265(sprxyo arg0) {
        sprxyo sprxyo2 = arg0;
        sprxyo sprxyo3 = arg0;
        double d = 1.0 / Math.sqrt(sprxyo2.cfr_renamed_0 * sprxyo2.cfr_renamed_0 + sprxyo3.cfr_renamed_91 * sprxyo3.cfr_renamed_91);
        return new sprxyo((float)((double)arg0.cfr_renamed_0 * d), (float)((double)arg0.cfr_renamed_91 * d));
    }

    public boolean equals(Object arg0) {
        if (arg0 instanceof sprxyo) {
            sprxyo sprxyo2 = (sprxyo)arg0;
            return sprxyo.cfr_renamed_18258(this, sprxyo2);
        }
        return false;
    }

    public static sprxyo cfr_renamed_18266(float arg0, sprxyo arg1) {
        return new sprxyo(arg1.cfr_renamed_0 * arg0, arg1.cfr_renamed_91 * arg0);
    }

    public static sprxyo cfr_renamed_18267(sprxyo arg0, float arg1) {
        return new sprxyo(arg0.cfr_renamed_0 / arg1, arg0.cfr_renamed_91 / arg1);
    }

    public double cfr_renamed_18268() {
        sprxyo sprxyo2 = this;
        sprxyo sprxyo3 = this;
        return sprxyo2.cfr_renamed_0 * sprxyo2.cfr_renamed_0 + sprxyo3.cfr_renamed_91 * sprxyo3.cfr_renamed_91;
    }

    public static sprxyo cfr_renamed_18269(sprxyo arg0, sprxyo arg1) {
        sprxyo sprxyo2;
        float f;
        if (arg0.cfr_renamed_0 > arg1.cfr_renamed_0) {
            f = arg0.cfr_renamed_0;
            sprxyo2 = arg0;
        } else {
            f = arg1.cfr_renamed_0;
            sprxyo2 = arg0;
        }
        return new sprxyo(f, sprxyo2.cfr_renamed_91 > arg1.cfr_renamed_91 ? arg0.cfr_renamed_91 : arg1.cfr_renamed_91);
    }

    public static sprxyo cfr_renamed_18270() {
        return cfr_renamed_1;
    }

    public static sprxyo cfr_renamed_18271(sprxyo arg0, sprxyo arg1) {
        sprxyo sprxyo2;
        float f;
        if (arg0.cfr_renamed_0 < arg1.cfr_renamed_0) {
            f = arg0.cfr_renamed_0;
            sprxyo2 = arg0;
        } else {
            f = arg1.cfr_renamed_0;
            sprxyo2 = arg0;
        }
        return new sprxyo(f, sprxyo2.cfr_renamed_91 < arg1.cfr_renamed_91 ? arg0.cfr_renamed_91 : arg1.cfr_renamed_91);
    }
}

