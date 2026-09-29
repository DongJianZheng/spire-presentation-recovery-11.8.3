/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprblk;
import com.spire.presentation.packages.sprboc;
import com.spire.presentation.packages.sprcik;
import com.spire.presentation.packages.sprfqm;
import com.spire.presentation.packages.sprirm;
import com.spire.presentation.packages.sprpfk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sprxpk
extends sprblk {
    private List cfr_renamed_4;

    public sprxpk(sprirm arg0) throws sprpfk {
        int n;
        sprirm sprirm2 = arg0;
        super(sprirm2);
        sprfqm[] sprfqmArray = sprirm2.cfr_renamed_626();
        if (sprfqmArray == null) {
            throw new sprpfk(sprboc.cfr_renamed_9("xl\u007fin_MOYIH\u0014X[H[\u0012YYHHI\u001cITUIVX\u001a^_\u001cIL__SZSY^\u001c\\SH\u001cllq\u007f\u001aO_NLUYY"));
        }
        this.cfr_renamed_4 = new ArrayList(sprfqmArray.length);
        int n2 = n = 0;
        while (n2 != sprfqmArray.length) {
            this.cfr_renamed_4.add(new sprcik(sprfqmArray[n++]));
            n2 = n;
        }
    }

    public List cfr_renamed_626() {
        return Collections.unmodifiableList(this.cfr_renamed_4);
    }
}

