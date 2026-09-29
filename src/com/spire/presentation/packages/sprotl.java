/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcye;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfwm;
import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.sprhpm;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprsv;
import com.spire.presentation.packages.sprvnl;
import com.spire.presentation.packages.sprzt;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class sprotl {
    public static final String cfr_renamed_4 = sprgz.cfr_renamed_112.cfr_renamed_19();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprvnl cfr_renamed_10817(sprsv arg0, sprzt arg1) throws sprlyl {
        sprfwm sprfwm2;
        sprddm sprddm2;
        Object object;
        Object object2;
        try {
            object2 = new ByteArrayOutputStream();
            sprzt sprzt2 = arg1;
            object = sprzt2.cfr_renamed_1442((OutputStream)object2);
            OutputStream outputStream = object;
            arg0.cfr_renamed_624(outputStream);
            outputStream.close();
            sprddm2 = sprzt2.cfr_renamed_615();
            sprfwm2 = new sprfwm(((ByteArrayOutputStream)object2).toByteArray());
        }
        catch (IOException iOException) {
            throw new sprlyl(sprcye.cfr_renamed_9("\u0010$\u00169\u0005(\u001c3\u001b|\u00102\u00163\u00115\u001b;U8\u0014(\u0014r"), iOException);
        }
        object2 = new sprlvm(arg0.cfr_renamed_696(), sprfwm2);
        object = new sprlvm(sprgz.cfr_renamed_91, new sprhpm(sprddm2, (sprlvm)object2));
        return new sprvnl((sprlvm)object);
    }
}

