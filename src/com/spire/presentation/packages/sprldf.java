/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spramm;
import com.spire.presentation.packages.spraxz;
import com.spire.presentation.packages.sprdef;
import com.spire.presentation.packages.sprfwm;
import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprlmm;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmvm;
import com.spire.presentation.packages.sprnrm;
import com.spire.presentation.packages.sprqxe;
import com.spire.presentation.packages.sprvff;
import com.spire.presentation.packages.sprzpm;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprldf
extends sprvff {
    public sprdef cfr_renamed_5390(sprqxe arg0, byte[] arg1) throws sprlyl {
        return this.cfr_renamed_5391(arg0, new ByteArrayInputStream(arg1));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprdef cfr_renamed_5391(sprqxe arg0, InputStream arg1) throws sprlyl {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (arg1 != null) {
            try {
                sprkqe.cfr_renamed_472(arg1, byteArrayOutputStream);
            }
            catch (IOException iOException) {
                throw new sprlyl(new StringBuilder().insert(0, spraxz.cfr_renamed_9("2A4\\'M>V9\u00192W4X'J\"U6M>W0\u00194V9M2W#\u0003w")).append(iOException.getMessage()).toString(), iOException);
            }
        }
        sprfwm sprfwm2 = null;
        if (byteArrayOutputStream.size() != 0) {
            sprfwm2 = new sprfwm(byteArrayOutputStream.toByteArray());
        }
        sprmvm sprmvm2 = new sprmvm(arg0.cfr_renamed_637().cfr_renamed_568());
        sprnrm sprnrm2 = null;
        if (this.cfr_renamed_4 != null) {
            sprnrm2 = new sprnrm(this.cfr_renamed_4.toString());
        }
        return new sprdef(new sprlvm(sprgz.cfr_renamed_152, new sprlmm(sprnrm2, this.cfr_renamed_3, sprfwm2, new spramm(new sprzpm(sprmvm2)))));
    }

    public sprdef cfr_renamed_5392(sprqxe arg0) throws sprlyl {
        return this.cfr_renamed_5391(arg0, null);
    }
}

