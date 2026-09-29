/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfy;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprgtja;
import com.spire.presentation.packages.sprmjp;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtkn;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprwzn;
import com.spire.presentation.packages.spryjn;
import com.spire.presentation.packages.sprzos;
import com.spire.presentation.packages.sprzpf;

@sprtea
public final class sprawn
extends sprtkn {
    private String cfr_renamed_91;
    private float[] cfr_renamed_0;
    private String cfr_renamed_1;
    private sprwbp cfr_renamed_2;
    private String cfr_renamed_3;
    private sprgtja cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprawn(sprgdo sprgdo2, sprgeja sprgeja2, float[] fArray, String string, String string2, String string3, sprwbp sprwbp2, sprgtja sprgtja2) {
        void arg6;
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprawn sprawn2 = this;
        sprawn sprawn3 = this;
        sprawn sprawn4 = this;
        super((sprgdo)arg0, (sprgeja)arg1, null);
        sprawn4.cfr_renamed_0 = arg2;
        sprawn4.cfr_renamed_3 = arg3;
        sprawn3.cfr_renamed_1 = arg4;
        sprawn3.cfr_renamed_91 = arg5;
        sprawn2.cfr_renamed_2 = arg6;
        sprawn2.cfr_renamed_4 = sprgtja2;
    }

    @Override
    @sprtea
    public String cfr_renamed_14049() {
        return sprzos.cfr_renamed_9("f\" \r!\u0006 \r!\u001e");
    }

    @Override
    public void cfr_renamed_14294(spryjn arg0) {
        if (this.cfr_renamed_2820().cfr_renamed_13097().cfr_renamed_14358()) {
            arg0.cfr_renamed_14094(sprzpf.cfr_renamed_9("4\u001f"), 28);
        }
        spryjn spryjn2 = arg0;
        spryjn spryjn3 = arg0;
        arg0.cfr_renamed_14092(sprzos.cfr_renamed_9("E\u0018\u001f(\u000e\u0019\u0005 \u0004=\u0019"), this.cfr_renamed_0);
        spryjn3.cfr_renamed_14286(sprzpf.cfr_renamed_9("4\r"), this.cfr_renamed_3);
        spryjn3.cfr_renamed_14286(sprzos.cfr_renamed_9("E\n\u0005'\u001e,\u0004=\u0019"), this.cfr_renamed_1);
        spryjn2.cfr_renamed_14057(sprzpf.cfr_renamed_9("vY6i=~+"), sprzos.cfr_renamed_9("1yJyJy7"));
        spryjn2.cfr_renamed_14057(sprzpf.cfr_renamed_9("4\u001a"), sprawn.cfr_renamed_13163(this.cfr_renamed_2));
        arg0.cfr_renamed_14289(sprzos.cfr_renamed_9("f'"), this.cfr_renamed_4);
        String string = this.cfr_renamed_2820().cfr_renamed_9196().cfr_renamed_14939(this.cfr_renamed_91);
        if (string != null) {
            arg0.cfr_renamed_14057(sprzpf.cfr_renamed_9("4\u0010I\r"), string);
        }
        if (this.cfr_renamed_14486() > 0) {
            arg0.cfr_renamed_14094(sprzos.cfr_renamed_9("E\u001a\u001e;\u001f*\u001e\u0019\u000b;\u000f'\u001e"), this.cfr_renamed_14486());
        }
    }

    private static /* synthetic */ String cfr_renamed_13163(sprwbp arg0) {
        sprwzn sprwzn2 = sprwzn.cfr_renamed_14797(arg0);
        Object[] objectArray = new Object[1];
        objectArray[0] = sprwzn2.cfr_renamed_13163(arg0);
        return sprraia.cfr_renamed_11562(sprzpf.cfr_renamed_9("\u0002`if\u0004"), objectArray);
    }

    @Override
    @sprtea
    public void cfr_renamed_14290(sprfy arg0, sprmjp arg1) {
        this.cfr_renamed_14291(arg0);
    }
}

