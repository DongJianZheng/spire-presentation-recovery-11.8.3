/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprboc;
import com.spire.presentation.packages.sprcud;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprmn;
import com.spire.presentation.packages.sprrj;
import com.spire.presentation.packages.sprrrd;
import com.spire.presentation.packages.sprsod;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprwge;
import java.math.BigInteger;

public class sprwwd
implements sprmn {
    private int cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprwge cfr_renamed_4;

    public sprwwd() {
        this(true);
    }

    public sprwwd(boolean bl) {
        this.cfr_renamed_3 = bl;
    }

    @Override
    public void cfr_renamed_462(sprrj arg0) {
        sprwwd sprwwd2 = (sprwwd)arg0;
        sprwwd sprwwd3 = this;
        sprwwd sprwwd4 = sprwwd2;
        this.cfr_renamed_3 = sprwwd4.cfr_renamed_3;
        sprwwd3.cfr_renamed_4 = sprwwd4.cfr_renamed_4;
        sprwwd3.cfr_renamed_2 = sprwwd2.cfr_renamed_2;
    }

    @Override
    public void cfr_renamed_3232(sprcud arg0, sprcyd arg1) throws sprrrd {
        sprwwd sprwwd2;
        block7: {
            block6: {
                block4: {
                    sprwge sprwge2;
                    block5: {
                        int n;
                        BigInteger bigInteger;
                        if (this.cfr_renamed_2 < 0) {
                            throw new sprrrd(sprboc.cfr_renamed_9("~[OS_ySTONN[UTHI\u001cJ]NT\u001aP_R]HR\u001c_DYY_X_X"));
                        }
                        arg0.cfr_renamed_4247(sprtie.cfr_renamed_272);
                        sprwge2 = sprwge.cfr_renamed_2757(arg1.cfr_renamed_98());
                        if (sprwge2 == null) break block4;
                        if (this.cfr_renamed_4 == null) break block5;
                        if (sprwge2.cfr_renamed_296() && (bigInteger = sprwge2.cfr_renamed_299()) != null && (n = bigInteger.intValue()) < this.cfr_renamed_2) {
                            sprwwd sprwwd3 = this;
                            sprwwd3.cfr_renamed_2 = n;
                            sprwwd3.cfr_renamed_4 = sprwge2;
                        }
                        break block6;
                    }
                    this.cfr_renamed_4 = sprwge2;
                    if (!sprwge2.cfr_renamed_296()) break block6;
                    sprwwd2 = this;
                    this.cfr_renamed_2 = sprwge2.cfr_renamed_299().intValue();
                    break block7;
                }
                if (this.cfr_renamed_4 != null) {
                    --this.cfr_renamed_2;
                }
            }
            sprwwd2 = this;
        }
        if (sprwwd2.cfr_renamed_3 && this.cfr_renamed_4 == null) {
            throw new sprrrd(sprsod.cfr_renamed_9("@;q3a\u0019m4q.p;k4v)\"4m.\"*p?q?l.\"3lzr;v2"));
        }
    }

    @Override
    public sprrj cfr_renamed_461() {
        sprwwd sprwwd2 = new sprwwd(this.cfr_renamed_3);
        sprwwd2.cfr_renamed_4 = this.cfr_renamed_4;
        sprwwd2.cfr_renamed_2 = this.cfr_renamed_2;
        return sprwwd2;
    }
}

