/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravd;
import com.spire.presentation.packages.sprayd;
import com.spire.presentation.packages.sprbwe;
import com.spire.presentation.packages.spreoe;
import com.spire.presentation.packages.sprgl;
import com.spire.presentation.packages.sprgve;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprnle;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sproa;
import com.spire.presentation.packages.sprql;
import com.spire.presentation.packages.sprvte;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;

public class sprsyd
extends spravd {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprayd cfr_renamed_4177(sprql arg0, sproa arg1) throws sprlqd {
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
            throw new sprlqd("");
        }
        object2 = byteArrayOutputStream.toByteArray();
        sprije sprije2 = arg1.cfr_renamed_615();
        sprnle sprnle2 = new sprnle((byte[])object2);
        spreoe spreoe2 = new spreoe(arg0.cfr_renamed_696(), sprije2, sprnle2);
        sprgve sprgve2 = null;
        if (this.cfr_renamed_4 != null) {
            object = this.cfr_renamed_4.cfr_renamed_134(new HashMap());
            sprgve2 = new sprgve(((sprvte)object).cfr_renamed_3968());
        }
        object = new sprnte(sprgl.cfr_renamed_102, new sprbwe(spreoe2, sprgve2));
        return new sprayd((sprnte)object);
    }

    public sprayd cfr_renamed_1467(sprql arg0, sproa arg1) throws sprlqd {
        return this.cfr_renamed_4177(arg0, arg1);
    }
}

