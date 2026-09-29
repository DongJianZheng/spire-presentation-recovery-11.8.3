/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvg;
import com.spire.presentation.packages.sprcxe;
import com.spire.presentation.packages.sprdfh;
import com.spire.presentation.packages.sprgmh;
import com.spire.presentation.packages.sprhjh;
import com.spire.presentation.packages.sprlgh;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvwg;

public class sprbjh
extends sprhjh {
    private /* synthetic */ sprbjh(sprszm arg0) {
        sprbjh sprbjh2 = this;
        super(arg0);
        if (!sprbjh2.cfr_renamed_324().cfr_renamed_5078(sprlgh.cfr_renamed_4)) {
            throw new IllegalArgumentException(sprcxe.cfr_renamed_9("\u0012Q\u0017V\u001eG]D\u001c@]P\u0018A\tZ\u001bZ\u001eR\tV]Q\u001c@\u0018\u0013\u001fF\t\u0013\t[\u0018\u0013\tJ\rV]D\u001c@]]\u0012G]Z\u0010C\u0011Z\u001eZ\t"));
        }
    }

    public static sprbjh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbjh) {
            return (sprbjh)arg0;
        }
        if (arg0 != null) {
            return new sprbjh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprbjh(sprbvg arg0, sprgmh arg1, sprdfh arg2, sprvwg arg3) {
        super(arg0, sprlgh.cfr_renamed_4, arg1, arg2, arg3);
    }

    public sprbjh(sprhjh arg0) {
        this(arg0.cfr_renamed_3(), arg0.cfr_renamed_102(), arg0.cfr_renamed_8295(), arg0.cfr_renamed_79());
    }
}

