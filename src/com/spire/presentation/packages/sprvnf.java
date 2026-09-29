/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spremf;
import com.spire.presentation.packages.sprgpf;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.sprknf;
import com.spire.presentation.packages.sprlpf;
import com.spire.presentation.packages.sprqlf;
import com.spire.presentation.packages.sprqsf;
import com.spire.presentation.packages.sprrqf;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprsqf;
import com.spire.presentation.packages.sprtsf;
import com.spire.presentation.packages.sprunf;
import java.security.SecureRandom;

public final class sprvnf
implements sprii {
    private SecureRandom cfr_renamed_3;
    private sprlpf cfr_renamed_4;

    @Override
    public sprsil cfr_renamed_1223() {
        sprvnf sprvnf2 = this;
        spremf spremf2 = sprvnf2.cfr_renamed_5859(this.cfr_renamed_4, sprvnf2.cfr_renamed_3);
        sprknf sprknf2 = spremf2.cfr_renamed_5771().cfr_renamed_1411();
        spremf2 = new sprunf(this.cfr_renamed_4).cfr_renamed_5799(spremf2.cfr_renamed_5768()).cfr_renamed_5800(spremf2.cfr_renamed_5774()).cfr_renamed_5801(spremf2.cfr_renamed_5769()).cfr_renamed_5802(sprknf2.cfr_renamed_97()).cfr_renamed_5803(spremf2.cfr_renamed_5771()).cfr_renamed_1451();
        sprgpf sprgpf2 = new sprsqf(this.cfr_renamed_4).cfr_renamed_5802(sprknf2.cfr_renamed_97()).cfr_renamed_5801(spremf2.cfr_renamed_5769()).cfr_renamed_1451();
        return new sprsil(sprgpf2, spremf2);
    }

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        sprqlf sprqlf2 = (sprqlf)arg0;
        sprvnf sprvnf2 = this;
        sprvnf2.cfr_renamed_3 = sprqlf2.cfr_renamed_1295();
        sprvnf2.cfr_renamed_4 = sprqlf2.cfr_renamed_284();
    }

    private /* synthetic */ spremf cfr_renamed_5859(sprlpf arg0, SecureRandom arg1) {
        int n = arg0.cfr_renamed_5732();
        byte[] byArray = new byte[n];
        SecureRandom secureRandom = arg1;
        secureRandom.nextBytes(byArray);
        byte[] byArray2 = new byte[n];
        secureRandom.nextBytes(byArray2);
        byte[] byArray3 = new byte[n];
        secureRandom.nextBytes(byArray3);
        byte[] byArray4 = byArray;
        return new sprunf(arg0).cfr_renamed_5799(byArray).cfr_renamed_5800(byArray2).cfr_renamed_5801(byArray3).cfr_renamed_5803(new sprqsf(arg0, byArray3, byArray, (sprrqf)new sprtsf().cfr_renamed_1451())).cfr_renamed_1451();
    }
}

