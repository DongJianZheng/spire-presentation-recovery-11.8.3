/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprfap;
import com.spire.presentation.packages.sprlnk;
import com.spire.presentation.packages.sprvlh;
import com.spire.presentation.packages.sprwgk;
import com.spire.presentation.packages.spryye;

public class sprjgk
implements sprbj {
    private spryye cfr_renamed_3;
    private spryye cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprjgk(spryye spryye2, spryye spryye3) {
        void arg1;
        void arg0;
        if (spryye2 == null) {
            throw new NullPointerException(sprfap.cfr_renamed_9("@@R@ZWcAQXZWxQJ\u0014PU]Z\\@\u0013VV\u0014]A_X"));
        }
        if (!(arg0 instanceof sprlnk) && !(arg0 instanceof sprwgk)) {
            throw new IllegalArgumentException(sprvlh.cfr_renamed_9("vzum9L+!,% 4xz}4A -,9dxfxyx`|fj4zuw4{q9ajq}"));
        }
        if (arg1 == null) {
            throw new NullPointerException(sprfap.cfr_renamed_9("QC\\VYVFRXcAQXZWxQJ\u0014PU]Z\\@\u0013VV\u0014]A_X"));
        }
        if (!arg0.getClass().isAssignableFrom(arg1.getClass())) {
            throw new IllegalArgumentException(sprvlh.cfr_renamed_9("j`x`pw9uwp9qi||y|fxx9dlvu}z4rq`g9|xb|4}}\u007fr|f|zm4}{tupz9dxfxy|`|fj"));
        }
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = arg1;
    }

    public spryye cfr_renamed_3351() {
        return this.cfr_renamed_3;
    }

    public spryye cfr_renamed_2096() {
        return this.cfr_renamed_4;
    }
}

