/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprche;
import com.spire.presentation.packages.sprcwe;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprmme;
import com.spire.presentation.packages.sprn;
import com.spire.presentation.packages.sproi;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvte;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class sprqqd
implements sprn {
    private final Hashtable cfr_renamed_4;

    private static /* synthetic */ Hashtable cfr_renamed_4093(Hashtable arg0) {
        Enumeration enumeration;
        Hashtable hashtable = new Hashtable();
        Enumeration enumeration2 = enumeration = arg0.keys();
        while (enumeration2.hasMoreElements()) {
            Object k;
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            Object k2 = k = enumeration3.nextElement();
            hashtable.put(k2, arg0.get(k2));
        }
        return hashtable;
    }

    public Hashtable cfr_renamed_4094(Map arg0) {
        sprche sprche2;
        Object object;
        Hashtable hashtable = sprqqd.cfr_renamed_4093(this.cfr_renamed_4);
        if (!hashtable.containsKey(sproi.cfr_renamed_1) && (object = sprtzd.cfr_renamed_23(arg0.get("contentType"))) != null) {
            sprche2 = new sprche(sproi.cfr_renamed_1, new sprcwe((spra)object));
            hashtable.put(sprche2.cfr_renamed_204(), sprche2);
        }
        if (!hashtable.containsKey(sproi.cfr_renamed_4)) {
            object = new Date();
            sprche2 = new sprche(sproi.cfr_renamed_4, new sprcwe(new sprmme((Date)object)));
            hashtable.put(sprche2.cfr_renamed_204(), sprche2);
        }
        if (!hashtable.containsKey(sproi.cfr_renamed_3)) {
            object = (byte[])arg0.get("digest");
            sprche2 = new sprche(sproi.cfr_renamed_3, new sprcwe(new sprlqe((byte[])object)));
            hashtable.put(sprche2.cfr_renamed_204(), sprche2);
        }
        return hashtable;
    }

    public sprqqd() {
        sprqqd sprqqd2 = this;
        sprqqd2.cfr_renamed_4 = new Hashtable();
    }

    @Override
    public sprvte cfr_renamed_134(Map arg0) {
        return new sprvte(this.cfr_renamed_4094(arg0));
    }

    /*
     * WARNING - void declaration
     */
    public sprqqd(sprvte sprvte2) {
        if (sprvte2 != null) {
            void arg0;
            this.cfr_renamed_4 = arg0.cfr_renamed_4095();
            return;
        }
        this.cfr_renamed_4 = new Hashtable();
    }
}

