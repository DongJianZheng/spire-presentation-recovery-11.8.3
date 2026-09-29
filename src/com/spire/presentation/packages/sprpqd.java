/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprase;
import com.spire.presentation.packages.sprcwe;
import com.spire.presentation.packages.spreoe;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.spreya;
import com.spire.presentation.packages.sprgl;
import com.spire.presentation.packages.sprgve;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprniy;
import com.spire.presentation.packages.sprnle;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sproa;
import com.spire.presentation.packages.sprql;
import com.spire.presentation.packages.sprswd;
import com.spire.presentation.packages.sprvn;
import com.spire.presentation.packages.sprvte;
import com.spire.presentation.packages.sprxwd;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;

public class sprpqd
extends sprswd {
    public sprxwd cfr_renamed_1467(sprql arg0, sproa arg1) throws sprlqd {
        return this.cfr_renamed_4177(arg0, arg1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprxwd cfr_renamed_4177(sprql arg0, sproa arg1) throws sprlqd {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        if (!this.cfr_renamed_119.isEmpty()) {
            throw new IllegalStateException(sprniy.cfr_renamed_9("\u0019,\u0014m\u0015#\u00164Z8\t(Z,\u001e)((\u0019$\n$\u001f#\u000e\n\u001f#\u001f?\u001b9\u0015?RdZ:\u00139\u0012m\u000e%\u0013>Z \u001f9\u0012\"\u001e"));
        }
        sprlre sprlre2 = new sprlre();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            object4 = arg1.cfr_renamed_1442(byteArrayOutputStream);
            OutputStream outputStream = object4;
            arg0.cfr_renamed_624(outputStream);
            outputStream.close();
        }
        catch (IOException iOException) {
            throw new sprlqd("");
        }
        object4 = byteArrayOutputStream.toByteArray();
        sproa sproa2 = arg1;
        sprije sprije2 = sproa2.cfr_renamed_615();
        sprnle sprnle2 = new sprnle((byte[])object4);
        spreya spreya2 = sproa2.cfr_renamed_1521();
        Object object5 = object3 = this.cfr_renamed_272.iterator();
        while (object5.hasNext()) {
            object2 = (sprvn)object3.next();
            object5 = object3;
            sprlre2.cfr_renamed_49(object2.cfr_renamed_3242(spreya2));
        }
        object3 = new spreoe(arg0.cfr_renamed_696(), sprije2, sprnle2);
        object2 = null;
        if (this.cfr_renamed_114 != null) {
            object = this.cfr_renamed_114.cfr_renamed_134(new HashMap());
            object2 = new sprgve(((sprvte)object).cfr_renamed_3968());
        }
        object = new sprnte(sprgl.cfr_renamed_2, new sprase(this.cfr_renamed_31, (sprere)new sprcwe(sprlre2), (spreoe)object3, (sprere)object2));
        return new sprxwd((sprnte)object);
    }
}

