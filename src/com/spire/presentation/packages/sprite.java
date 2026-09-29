/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprune;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxvh;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprzdq;
import java.math.BigInteger;

public class sprite
extends sprkra {
    public static final sprite cfr_renamed_0;
    private sprune cfr_renamed_1;
    public static final sprite cfr_renamed_2;
    public static final sprite cfr_renamed_3;
    public static final sprite cfr_renamed_4;

    public BigInteger cfr_renamed_97() {
        return this.cfr_renamed_1.cfr_renamed_97();
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_1;
    }

    private /* synthetic */ sprite(sprune sprune2) {
        this.cfr_renamed_1 = sprune2;
    }

    public static sprite cfr_renamed_341(spryte arg0, boolean arg1) {
        return sprite.cfr_renamed_23(sprune.cfr_renamed_341(arg0, arg1));
    }

    static {
        cfr_renamed_2 = new sprite(1);
        cfr_renamed_0 = new sprite(2);
        cfr_renamed_4 = new sprite(3);
        cfr_renamed_3 = new sprite(4);
    }

    public static sprite cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprite) {
            return (sprite)arg0;
        }
        if (arg0 != null) {
            return new sprite(sprune.cfr_renamed_23(arg0));
        }
        return null;
    }

    public String toString() {
        int n = this.cfr_renamed_1.cfr_renamed_97().intValue();
        return new StringBuilder().insert(0, "").append(n).append(n == cfr_renamed_2.cfr_renamed_97().intValue() ? sprzdq.cfr_renamed_9("3aKf2") : (n == cfr_renamed_0.cfr_renamed_97().intValue() ? sprxvh.cfr_renamed_9(";F@T:") : (n == cfr_renamed_4.cfr_renamed_97().intValue() ? sprzdq.cfr_renamed_9("\nMrPa2") : (n == cfr_renamed_3.cfr_renamed_97().intValue() ? sprxvh.cfr_renamed_9("8PSCT:") : sprzdq.cfr_renamed_9("$"))))).toString();
    }

    /*
     * WARNING - void declaration
     */
    public sprite(int n) {
        void arg0;
        sprite sprite2 = this;
        sprite2.cfr_renamed_1 = new sprune((int)arg0);
    }
}

