/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbly;
import com.spire.presentation.packages.sprgl;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprmk;
import com.spire.presentation.packages.sprmre;
import com.spire.presentation.packages.sprnle;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sprql;
import com.spire.presentation.packages.sprwud;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class sprrpd {
    public static final String cfr_renamed_4 = "1.2.840.113549.1.9.16.3.8";

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprwud cfr_renamed_4188(sprql arg0, sprmk arg1) throws sprlqd {
        sprnle sprnle2;
        sprije sprije2;
        Object object;
        Object object2;
        try {
            object2 = new ByteArrayOutputStream();
            sprmk sprmk2 = arg1;
            object = sprmk2.cfr_renamed_1442((OutputStream)object2);
            OutputStream outputStream = object;
            arg0.cfr_renamed_624(outputStream);
            outputStream.close();
            sprije2 = sprmk2.cfr_renamed_615();
            sprnle2 = new sprnle(((ByteArrayOutputStream)object2).toByteArray());
        }
        catch (IOException iOException) {
            throw new sprlqd(sprbly.cfr_renamed_9("1,71$ =;:t1:7;0=:3t05 5z"), iOException);
        }
        object2 = new sprnte(arg0.cfr_renamed_696(), sprnle2);
        object = new sprnte(sprgl.cfr_renamed_112, new sprmre(sprije2, (sprnte)object2));
        return new sprwud((sprnte)object);
    }
}

