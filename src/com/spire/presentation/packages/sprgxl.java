/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfwm;
import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.sprjpl;
import com.spire.presentation.packages.sprjpm;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmh;
import com.spire.presentation.packages.sprnnm;
import com.spire.presentation.packages.sprnum;
import com.spire.presentation.packages.sprovl;
import com.spire.presentation.packages.sprsv;
import com.spire.presentation.packages.sprufn;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;

public class sprgxl
extends sprjpl {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprovl cfr_renamed_10810(sprsv arg0, sprmh arg1) throws sprlyl {
        Object object;
        Object object2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            object2 = arg1.cfr_renamed_1442(byteArrayOutputStream);
            OutputStream outputStream = object2;
            arg0.cfr_renamed_624(outputStream);
            outputStream.close();
        }
        catch (IOException iOException) {
            throw new sprlyl("");
        }
        object2 = byteArrayOutputStream.toByteArray();
        sprddm sprddm2 = arg1.cfr_renamed_615();
        sprfwm sprfwm2 = new sprfwm((byte[])object2);
        sprnum sprnum2 = new sprnum(arg0.cfr_renamed_696(), sprddm2, sprfwm2);
        sprufn sprufn2 = null;
        if (this.cfr_renamed_4 != null) {
            object = this.cfr_renamed_4.cfr_renamed_134(Collections.EMPTY_MAP);
            sprufn2 = new sprufn(((sprjpm)object).cfr_renamed_3968());
        }
        object = new sprlvm(sprgz.cfr_renamed_145, new sprnnm(sprnum2, sprufn2));
        return new sprovl((sprlvm)object);
    }

    public sprovl cfr_renamed_7366(sprsv arg0, sprmh arg1) throws sprlyl {
        return this.cfr_renamed_10810(arg0, arg1);
    }
}

