/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjxl;
import com.spire.presentation.packages.sprkq;
import com.spire.presentation.packages.sprmgo;
import com.spire.presentation.packages.sprqio;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprsfo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvxd;

@sprtea
public class sprpko
extends sprmgo
implements sprkq {
    private Double cfr_renamed_1;
    private Double cfr_renamed_2;
    private Double cfr_renamed_3;
    private Double cfr_renamed_4;

    @sprtea
    public sprpko cfr_renamed_15293(Double arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    @sprtea
    public Double cfr_renamed_15783() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprpko(Object ... objectArray) {
        sprpko sprpko2;
        void arg0;
        sprpko sprpko3 = this;
        sprpko sprpko4 = this;
        sprpko4.cfr_renamed_2 = 0.0;
        sprpko4.cfr_renamed_1 = 0.0;
        sprpko3.cfr_renamed_3 = 0.0;
        sprpko3.cfr_renamed_4 = 0.0;
        if (objectArray == null) {
            throw new IllegalArgumentException(sprjxl.cfr_renamed_9("\u53a3\u6573\u4e6c\u80fe\u4e5b\u7a79"));
        }
        if (((void)arg0).length != 4) {
            throw new IllegalArgumentException(sprvxd.cfr_renamed_9("g\u0016]Y\u5fe0\u9802\u5166\u7d59\u4e0f\u6509\u7b6cM"));
        }
        sprpko sprpko5 = this;
        void v3 = arg0;
        this.cfr_renamed_2 = sprpko.cfr_renamed_15505(v3[0].toString());
        sprpko5.cfr_renamed_1 = sprpko.cfr_renamed_15505(v3[1].toString());
        sprpko5.cfr_renamed_3 = sprpko.cfr_renamed_15505(arg0[2].toString());
        if (this.cfr_renamed_3 <= 0.0) {
            throw new IllegalArgumentException(sprjxl.cfr_renamed_9("\u0016j\u0005w\t#\u5ef5\u5924\u4eef3"));
        }
        this.cfr_renamed_4 = sprpko.cfr_renamed_15505(arg0[3].toString());
        if (sprpko2.cfr_renamed_4 <= 0.0) {
            throw new IllegalArgumentException(sprvxd.cfr_renamed_9("\u0011@\u0010B\u0011QY\u5eb1\u595e\u4eabI"));
        }
    }

    @sprtea
    public static sprpko cfr_renamed_141(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || sprraia.cfr_renamed_12806(arg0).length() == 0) {
            return null;
        }
        String[] stringArray = sprqio.cfr_renamed_15133(sprraia.cfr_renamed_12806(arg0), " ", true);
        if (stringArray.length != 4) {
            return null;
        }
        return new sprpko(sprpko.cfr_renamed_15505(stringArray[0]), sprpko.cfr_renamed_15505(stringArray[1]), sprpko.cfr_renamed_15505(stringArray[2]), sprpko.cfr_renamed_15505(stringArray[3]));
    }

    public String toString() {
        return new StringBuilder().insert(0, sprpko.cfr_renamed_15502(this.cfr_renamed_2)).append(" ").append(sprpko.cfr_renamed_15502(this.cfr_renamed_1)).append(" ").append(sprpko.cfr_renamed_15502(this.cfr_renamed_3)).append(" ").append(sprpko.cfr_renamed_15502(this.cfr_renamed_4)).toString();
    }

    @sprtea
    public Double cfr_renamed_15784() {
        return this.cfr_renamed_1;
    }

    @Override
    public Object cfr_renamed_12099() {
        return new sprpko(this.cfr_renamed_2, this.cfr_renamed_1, this.cfr_renamed_3, this.cfr_renamed_4);
    }

    @sprtea
    public Double cfr_renamed_1452() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public Double cfr_renamed_1942() {
        return this.cfr_renamed_3;
    }

    @sprtea
    public sprpko cfr_renamed_15785(Double arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }

    @sprtea
    public sprpko cfr_renamed_15786(Double arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprpko(double d, double d2, double d3, double d4) {
        void arg2;
        void arg1;
        void arg0;
        sprpko sprpko2 = this;
        sprpko sprpko3 = this;
        sprpko sprpko4 = this;
        sprpko sprpko5 = this;
        sprpko5.cfr_renamed_2 = 0.0;
        sprpko5.cfr_renamed_1 = 0.0;
        sprpko4.cfr_renamed_3 = 0.0;
        sprpko4.cfr_renamed_4 = 0.0;
        sprpko3.cfr_renamed_2 = (double)arg0;
        sprpko3.cfr_renamed_1 = (double)arg1;
        sprpko2.cfr_renamed_3 = (double)arg2;
        sprpko2.cfr_renamed_4 = d4;
    }

    @sprtea
    public sprpko cfr_renamed_15294(Double arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    @sprtea
    public sprsfo cfr_renamed_15787() {
        return new sprsfo(this.cfr_renamed_2, this.cfr_renamed_1);
    }
}

