/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbln;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprhtn;
import com.spire.presentation.packages.sprodo;
import com.spire.presentation.packages.sproyn;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprruo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruao;
import com.spire.presentation.packages.sprwyy;
import com.spire.presentation.packages.sprwzq;
import com.spire.presentation.packages.spryjn;
import com.spire.presentation.packages.spryun;

@sprtea
public class sprlvn
extends sprbln {
    private sprodo cfr_renamed_3;
    private sproyn cfr_renamed_4;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void cfr_renamed_14285(spryjn arg0) {
        sprpdja sprpdja2;
        sprpdja sprpdja3;
        block9: {
            sprpdja3 = this.cfr_renamed_14637();
            try {
                block8: {
                    sprpdja sprpdja4 = new sprpdja();
                    try {
                        spruao spruao2 = this.cfr_renamed_14638(sprpdja3.cfr_renamed_806());
                        sprpdja sprpdja5 = spruao2 != null ? spruao2.cfr_renamed_14115(sprpdja4) : sprpdja4;
                        ((spreen)sprpdja5).cfr_renamed_4924(sprpdja3.cfr_renamed_3461(), 0, (int)sprpdja3.cfr_renamed_806());
                        spryjn spryjn2 = arg0;
                        spryjn2.cfr_renamed_14086();
                        spryjn2.cfr_renamed_14057(sprwzq.cfr_renamed_9("q1'\u0015;"), sprwyy.cfr_renamed_9("\fVqkE"));
                        spryjn2.cfr_renamed_14057(sprwzq.cfr_renamed_9("J\t"), sprwyy.cfr_renamed_9("x?\u0003:\u0003<~"));
                        this.cfr_renamed_3.cfr_renamed_14347(arg0);
                        if (spruao2 != null) {
                            spruao2.cfr_renamed_14404(arg0);
                        }
                        spryjn spryjn3 = arg0;
                        spryjn spryjn4 = arg0;
                        spryjn4.cfr_renamed_14094(sprwzq.cfr_renamed_9("q);\u000b9\u00116"), (int)sprpdja4.cfr_renamed_806());
                        spryjn4.cfr_renamed_14061();
                        spryjn3.cfr_renamed_11735("stream");
                        spryjn3.cfr_renamed_4924(sprpdja4.cfr_renamed_3461(), 0, (int)sprpdja4.cfr_renamed_806());
                        spryjn3.cfr_renamed_14076();
                        arg0.cfr_renamed_11835(sprwyy.cfr_renamed_9("F`G}W|FoN"));
                        if (sprpdja4 == null) break block8;
                        sprpdja2 = sprpdja3;
                    }
                    catch (Throwable throwable) {
                        if (sprpdja4 != null) {
                            sprpdja4.cfr_renamed_2637();
                        }
                        throw throwable;
                    }
                    sprpdja4.cfr_renamed_2637();
                    break block9;
                }
                sprpdja2 = sprpdja3;
            }
            catch (Throwable throwable) {
                if (sprpdja3 != null) {
                    sprpdja3.cfr_renamed_2637();
                }
                throw throwable;
            }
        }
        if (sprpdja2 != null) {
            sprpdja3.cfr_renamed_2637();
            return;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprlvn(sprgdo sprgdo2, sproyn sproyn2, sprodo sprodo2) {
        void arg1;
        void arg0;
        sprlvn sprlvn2 = this;
        super((sprgdo)arg0);
        sprlvn2.cfr_renamed_4 = arg1;
        sprlvn2.cfr_renamed_3 = sprodo2;
    }

    private /* synthetic */ spruao cfr_renamed_14638(long arg0) {
        int n = 200;
        if (arg0 < (long)n) {
            return null;
        }
        if (this.cfr_renamed_2820().cfr_renamed_13097().cfr_renamed_14411() == 3) {
            return new spryun();
        }
        return null;
    }

    private /* synthetic */ sprpdja cfr_renamed_14637() {
        int n;
        sprpdja sprpdja2 = new sprpdja();
        sprruo sprruo2 = new sprruo(sprpdja2);
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.cfr_renamed_8434().cfr_renamed_11861()) {
            sprhtn sprhtn2 = (sprhtn)this.cfr_renamed_4.cfr_renamed_8434().cfr_renamed_13485(n);
            sprruo sprruo3 = sprruo2;
            sprhtn sprhtn3 = sprhtn2;
            sprruo2.cfr_renamed_11594((byte)sprhtn3.cfr_renamed_324());
            sprruo3.cfr_renamed_12761(sprhtn3.cfr_renamed_14610());
            sprruo3.cfr_renamed_14639(sprhtn2.cfr_renamed_14640());
            n2 = ++n;
        }
        return sprpdja2;
    }
}

