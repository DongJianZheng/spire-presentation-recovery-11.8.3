/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfwm;
import com.spire.presentation.packages.sprfz;
import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprjpm;
import com.spire.presentation.packages.sprjtm;
import com.spire.presentation.packages.sprkxl;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmh;
import com.spire.presentation.packages.sprnfg;
import com.spire.presentation.packages.sprnum;
import com.spire.presentation.packages.sprocn;
import com.spire.presentation.packages.sprpw;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsv;
import com.spire.presentation.packages.sprufn;
import com.spire.presentation.packages.spruol;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;

public class sprmwl
extends spruol {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprkxl cfr_renamed_10810(sprsv arg0, sprmh arg1) throws sprlyl {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        sprrvm sprrvm2 = new sprrvm();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            sprmh sprmh2 = arg1;
            object5 = sprmh2.cfr_renamed_1442(byteArrayOutputStream);
            OutputStream outputStream = object5;
            arg0.cfr_renamed_624(outputStream);
            outputStream.close();
            if (sprmh2 instanceof sprpw) {
                object4 = ((sprpw)arg1).cfr_renamed_7492();
                byteArrayOutputStream.write((byte[])object4, 0, ((byte[])object4).length);
            }
        }
        catch (IOException iOException) {
            throw new sprlyl("");
        }
        object5 = byteArrayOutputStream.toByteArray();
        sprmh sprmh3 = arg1;
        sprddm sprddm2 = sprmh3.cfr_renamed_615();
        sprfwm sprfwm2 = new sprfwm((byte[])object5);
        object4 = sprmh3.cfr_renamed_1521();
        Object object6 = object3 = this.cfr_renamed_102.iterator();
        while (object6.hasNext()) {
            object2 = (sprfz)object3.next();
            object6 = object3;
            sprrvm2.cfr_renamed_5004(object2.cfr_renamed_10668((sprnfg)object4));
        }
        object3 = new sprnum(arg0.cfr_renamed_696(), sprddm2, sprfwm2);
        object2 = null;
        if (this.cfr_renamed_93 != null) {
            object = this.cfr_renamed_93.cfr_renamed_134(Collections.EMPTY_MAP);
            object2 = new sprufn(((sprjpm)object).cfr_renamed_3968());
        }
        object = new sprlvm(sprgz.cfr_renamed_86, new sprjtm(this.cfr_renamed_4, (spridn)new sprocn(sprrvm2), (sprnum)object3, (spridn)object2));
        return new sprkxl((sprlvm)object);
    }

    public sprkxl cfr_renamed_7366(sprsv arg0, sprmh arg1) throws sprlyl {
        return this.cfr_renamed_10810(arg0, arg1);
    }
}

