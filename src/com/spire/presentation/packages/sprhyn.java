/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprczo;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprizc;
import com.spire.presentation.packages.sprqte;
import com.spire.presentation.packages.sprrtn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruao;

@sprtea
public class sprhyn
extends spruao {
    private int cfr_renamed_3;
    private sprczo cfr_renamed_4;

    @Override
    @sprtea
    public String cfr_renamed_14084() {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        sprghha.cfr_renamed_12279(stringBuilder2, sprqte.cfr_renamed_9("\u000eu"));
        Object[] objectArray = new Object[2];
        objectArray[0] = sprqte.cfr_renamed_9("\u001d\u0002");
        objectArray[1] = this.cfr_renamed_14923();
        sprghha.cfr_renamed_12289(stringBuilder2, sprizc.cfr_renamed_9("e,c<e-c"), objectArray);
        Object[] objectArray2 = new Object[2];
        objectArray2[0] = "/Columns";
        objectArray2[1] = this.cfr_renamed_4.cfr_renamed_1942();
        sprghha.cfr_renamed_12289(stringBuilder, sprizc.cfr_renamed_9("e,c<e-c"), objectArray2);
        Object[] objectArray3 = new Object[2];
        objectArray3[0] = sprizc.cfr_renamed_9("1Nqkm");
        objectArray3[1] = this.cfr_renamed_4.cfr_renamed_1452();
        sprghha.cfr_renamed_12289(stringBuilder, sprqte.cfr_renamed_9("2\u00024\u00122\u00034"), objectArray3);
        sprghha.cfr_renamed_12279(stringBuilder, sprqte.cfr_renamed_9("\fw"));
        return stringBuilder.toString();
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprhyn(int n, sprczo sprczo2) {
        void arg0;
        sprhyn sprhyn2 = this;
        sprhyn2.cfr_renamed_3 = arg0;
        sprhyn2.cfr_renamed_4 = sprczo2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ int cfr_renamed_14923() {
        switch (this.cfr_renamed_3) {
            case 7: {
                return 0;
            }
            case 8: {
                return -1;
            }
        }
        throw new IllegalStateException(sprizc.cfr_renamed_9("Kr{dny}h{x>\u007fqqnn{omuqr0"));
    }

    @Override
    @sprtea
    public String cfr_renamed_14083() {
        return sprqte.cfr_renamed_9("fq\n{\u001df\u000fS1v,Q&V,");
    }

    @Override
    @sprtea
    public spreen cfr_renamed_14115(spreen arg0) {
        int n = this.cfr_renamed_3 == 7 ? 3 : 4;
        return new sprrtn(arg0, n, (float)this.cfr_renamed_4.cfr_renamed_14218(), this.cfr_renamed_4.cfr_renamed_1942());
    }
}

