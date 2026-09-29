/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprazc;
import com.spire.presentation.packages.sprcbd;
import com.spire.presentation.packages.spreue;
import com.spire.presentation.packages.sprjej;
import com.spire.presentation.packages.sprmpe;
import com.spire.presentation.packages.sprrxc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sprpvc
extends sprazc {
    private List cfr_renamed_4;

    public List cfr_renamed_626() {
        return Collections.unmodifiableList(this.cfr_renamed_4);
    }

    public sprpvc(spreue arg0) throws sprcbd {
        int n;
        spreue spreue2 = arg0;
        super(spreue2);
        sprmpe[] sprmpeArray = spreue2.cfr_renamed_626();
        if (sprmpeArray == null) {
            throw new sprcbd(sprjej.cfr_renamed_9("_\tX\fI:j*~,oq\u007f>o>5<~-o,;,s0n3\u007f\u007fy:;,k:x6}6~;;9t-;\tK\u0014X\u007fh:i)r<~"));
        }
        this.cfr_renamed_4 = new ArrayList(sprmpeArray.length);
        int n2 = n = 0;
        while (n2 != sprmpeArray.length) {
            this.cfr_renamed_4.add(new sprrxc(sprmpeArray[n++]));
            n2 = n;
        }
    }
}

