/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvg;
import com.spire.presentation.packages.sprdfh;
import com.spire.presentation.packages.sprgmh;
import com.spire.presentation.packages.sprhjh;
import com.spire.presentation.packages.sprlgh;
import com.spire.presentation.packages.sprpeka;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvwg;

public class sprkjh
extends sprhjh {
    public static sprkjh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprkjh) {
            return (sprkjh)arg0;
        }
        if (arg0 != null) {
            return new sprkjh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprkjh(sprhjh arg0) {
        this(arg0.cfr_renamed_3(), arg0.cfr_renamed_102(), arg0.cfr_renamed_8295(), arg0.cfr_renamed_79());
    }

    public sprkjh(sprszm arg0) {
        sprkjh sprkjh2 = this;
        super(arg0);
        if (!sprkjh2.cfr_renamed_324().cfr_renamed_5078(sprlgh.cfr_renamed_3)) {
            throw new IllegalArgumentException(sprpeka.cfr_renamed_9("BcGdNu\rvLr\rbHsYhKhN`Yd\rcLrH!OtY!YiH!Yx]d\rvLr\roBu\rdUqAhNhY"));
        }
    }

    public sprkjh(sprbvg arg0, sprgmh arg1, sprdfh arg2, sprvwg arg3) {
        super(arg0, sprlgh.cfr_renamed_3, arg1, arg2, arg3);
    }
}

