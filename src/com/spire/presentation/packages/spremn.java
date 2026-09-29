/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfqn;
import com.spire.presentation.packages.sprlsn;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprngp;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprson;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprxnn;
import com.spire.presentation.packages.spryxp;

@sprtea
public class spremn
extends sprsmn {
    private static final float cfr_renamed_93 = 0.5f;
    private static final float cfr_renamed_86 = 0.01f;
    private sprfqn cfr_renamed_152;
    private static final float cfr_renamed_112 = 0.1f;
    private static final float cfr_renamed_119 = 0.025f;
    private sprlsn cfr_renamed_91;
    public sprmrn cfr_renamed_0;
    private float cfr_renamed_1;
    private static final float cfr_renamed_2 = 0.15f;
    public sprxln cfr_renamed_3;
    private float cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprmrn cfr_renamed_13852(sprmrn sprmrn2, float f, float f2) {
        void arg0;
        spremn spremn2;
        void arg1;
        this.cfr_renamed_1 = spryxp.cfr_renamed_13853((float)arg1, 0.01f, 0.5f);
        this.cfr_renamed_4 = spryxp.cfr_renamed_13853(f2, 0.01f, 0.5f);
        if (spremn2.cfr_renamed_4 > this.cfr_renamed_1) {
            this.cfr_renamed_4 = this.cfr_renamed_1;
        }
        arg0.cfr_renamed_13121(this);
        return this.cfr_renamed_0;
    }

    public sprmrn cfr_renamed_13854(sprmrn arg0, boolean arg1) {
        if (arg1) {
            return this.cfr_renamed_13852(arg0, 0.025f, 0.025f);
        }
        return this.cfr_renamed_13852(arg0, 0.15f, 0.1f);
    }

    private static /* synthetic */ sprmrn cfr_renamed_13855(sprmrn arg0, boolean arg1) {
        return new spremn().cfr_renamed_13854(arg0, arg1);
    }

    @Override
    public void cfr_renamed_13092(sprmrn arg0) {
        spremn spremn2;
        if (this.cfr_renamed_0 == null) {
            spremn2 = this;
            this.cfr_renamed_0 = new sprmrn();
        } else {
            sprmrn sprmrn2 = new sprmrn();
            this.cfr_renamed_0.cfr_renamed_12507(sprmrn2);
            spremn2 = this;
            this.cfr_renamed_0 = sprmrn2;
        }
        spremn2.cfr_renamed_0.cfr_renamed_12511(arg0.cfr_renamed_13094());
        super.cfr_renamed_13092(arg0);
    }

    private /* synthetic */ void cfr_renamed_13856(sprxnn arg0, float arg1, float arg2) {
        float f;
        if (arg0 == null) {
            return;
        }
        float f2 = 1.0f;
        sprngp sprngp2 = new sprngp(arg0.cfr_renamed_13167(), arg0.cfr_renamed_13171());
        if (!sprngp2.cfr_renamed_13857(arg0.cfr_renamed_13169()) || !sprngp2.cfr_renamed_13857(arg0.cfr_renamed_13170())) {
            f2 = this.cfr_renamed_13858(arg0, arg1, arg2);
        }
        float f3 = arg1;
        double d = 0.003;
        float f4 = f = 0.0f;
        while (f4 <= 1.0f + f2 / 2.0f) {
            double d2 = arg0.cfr_renamed_13793(f);
            f3 += f2;
            if (d2 > d || f3 >= arg1 || f >= 1.0f) {
                if (f > 1.0f) {
                    f = 1.0f;
                }
                this.cfr_renamed_152.cfr_renamed_13187().cfr_renamed_13516(arg0.cfr_renamed_13799(f));
                f3 = 0.0f;
            }
            f4 = f + f2;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_13178(sprlsn sprlsn2) {
        void arg0;
        spremn spremn2 = this;
        spremn spremn3 = this;
        spremn3.cfr_renamed_91 = new sprlsn();
        spremn2.cfr_renamed_91.cfr_renamed_12625(arg0.cfr_renamed_13174());
        spremn2.cfr_renamed_152 = new sprfqn();
        super.cfr_renamed_13178(sprlsn2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_13175(sprxnn sprxnn2) {
        void arg0;
        spremn spremn2 = this;
        spremn spremn3 = this;
        spremn2.cfr_renamed_13856((sprxnn)arg0, spremn3.cfr_renamed_1, spremn3.cfr_renamed_4);
        spremn2.cfr_renamed_152.cfr_renamed_13619(false);
        super.cfr_renamed_13175(sprxnn2);
    }

    @Override
    public void cfr_renamed_13098(sprxln sprxln2) {
        spremn spremn2 = this;
        this.cfr_renamed_3 = new sprxln();
        super.cfr_renamed_13098(sprxln2);
    }

    @Override
    public void cfr_renamed_13107(sprxln arg0) {
        spremn spremn2 = this;
        spremn2.cfr_renamed_3.cfr_renamed_12505(arg0.cfr_renamed_12571());
        spremn2.cfr_renamed_3.cfr_renamed_12550(arg0.cfr_renamed_12551());
        spremn2.cfr_renamed_0.cfr_renamed_12507(this.cfr_renamed_3);
    }

    @Override
    public void cfr_renamed_13101(sprmrn arg0) {
        if (this.cfr_renamed_0.cfr_renamed_8155() != null) {
            this.cfr_renamed_0 = (sprmrn)this.cfr_renamed_0.cfr_renamed_8155();
        }
        super.cfr_renamed_13092(arg0);
    }

    @Override
    public void cfr_renamed_13122(sprson arg0) {
        this.cfr_renamed_0.cfr_renamed_12507(arg0);
        super.cfr_renamed_13122(arg0);
    }

    private /* synthetic */ float cfr_renamed_13858(sprxnn arg0, float arg1, float arg2) {
        float f;
        float f2 = arg1 / (float)((int)((arg0.cfr_renamed_13789() - 5.0) / 10.0) + 1);
        if (f < arg2) {
            f2 = arg2;
        }
        return f2;
    }

    @Override
    public void cfr_renamed_13173(sprlsn arg0) {
        spremn spremn2 = this;
        spremn2.cfr_renamed_91.cfr_renamed_12507(spremn2.cfr_renamed_152);
        spremn spremn3 = this;
        spremn3.cfr_renamed_3.cfr_renamed_12507(spremn3.cfr_renamed_91);
        super.cfr_renamed_13173(arg0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_13186(sprfqn sprfqn2) {
        void arg0;
        spremn spremn2 = this;
        spremn2.cfr_renamed_152.cfr_renamed_13187().cfr_renamed_13517(arg0.cfr_renamed_13187());
        spremn2.cfr_renamed_152.cfr_renamed_13619(false);
        super.cfr_renamed_13186(sprfqn2);
    }

    public spremn() {
        spremn spremn2 = this;
        spremn2.cfr_renamed_1 = 0.15f;
        spremn2.cfr_renamed_4 = 0.1f;
    }

    public static sprxln cfr_renamed_13859(sprxln arg0, boolean arg1) {
        sprmrn sprmrn2;
        sprmrn sprmrn3 = sprmrn2 = new sprmrn();
        sprmrn3.cfr_renamed_12507(arg0);
        return (sprxln)spremn.cfr_renamed_13855(sprmrn3, arg1).cfr_renamed_576(0);
    }
}

