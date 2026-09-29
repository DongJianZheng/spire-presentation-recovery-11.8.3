/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcuk;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprkki;
import com.spire.presentation.packages.sprkzk;
import com.spire.presentation.packages.sprrkl;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprssk;
import com.spire.presentation.packages.sprval;
import com.spire.presentation.packages.sprwrk;
import com.spire.presentation.packages.sprwsk;
import com.spire.presentation.packages.sprybl;
import java.math.BigInteger;

public class sprhwk
implements sprii {
    private sprval cfr_renamed_4;

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        this.cfr_renamed_4 = (sprval)arg0;
        sprybl.cfr_renamed_9170(new sprfdl(sprkki.cfr_renamed_9("\u0016\u0003\u0014\u000e>\u000e?$6\u0016\u0014\n="), sprrkl.cfr_renamed_9919(this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_1155()), this.cfr_renamed_4.cfr_renamed_284(), spriil.cfr_renamed_91));
    }

    @Override
    public sprsil cfr_renamed_1223() {
        sprkzk sprkzk2 = sprkzk.cfr_renamed_4;
        sprcuk sprcuk2 = this.cfr_renamed_4.cfr_renamed_284();
        sprwsk sprwsk2 = new sprwsk(sprcuk2.cfr_renamed_1155(), sprcuk2.cfr_renamed_1145(), null, sprcuk2.cfr_renamed_2331());
        sprkzk sprkzk3 = sprkzk2;
        BigInteger bigInteger = sprkzk3.cfr_renamed_10181(sprwsk2, this.cfr_renamed_4.cfr_renamed_1295());
        BigInteger bigInteger2 = sprkzk3.cfr_renamed_10182(sprwsk2, bigInteger);
        return new sprsil(new sprssk(bigInteger2, sprcuk2), new sprwrk(bigInteger, sprcuk2));
    }
}

