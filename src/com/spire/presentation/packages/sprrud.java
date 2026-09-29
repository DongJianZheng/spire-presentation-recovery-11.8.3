/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprche;
import com.spire.presentation.packages.sprcwe;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprn;
import com.spire.presentation.packages.sproi;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvte;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class sprrud
implements sprn {
    private final Hashtable cfr_renamed_4;

    public sprrud() {
        sprrud sprrud2 = this;
        sprrud2.cfr_renamed_4 = new Hashtable();
    }

    @Override
    public sprvte cfr_renamed_134(Map arg0) {
        return new sprvte(this.cfr_renamed_4094(arg0));
    }

    /*
     * WARNING - void declaration
     */
    public sprrud(sprvte sprvte2) {
        if (sprvte2 != null) {
            void arg0;
            this.cfr_renamed_4 = arg0.cfr_renamed_4095();
            return;
        }
        this.cfr_renamed_4 = new Hashtable();
    }

    public Hashtable cfr_renamed_4094(Map arg0) {
        Object object;
        Object object2;
        Hashtable hashtable = new Hashtable();
        Object object3 = object2 = this.cfr_renamed_4.keys();
        while (object3.hasMoreElements()) {
            Enumeration enumeration = object2;
            object3 = enumeration;
            object = enumeration.nextElement();
            Object k = object;
            hashtable.put(k, this.cfr_renamed_4.get(k));
        }
        if (!hashtable.containsKey(sproi.cfr_renamed_1)) {
            object2 = sprtzd.cfr_renamed_23(arg0.get("contentType"));
            object = new sprche(sproi.cfr_renamed_1, new sprcwe((spra)object2));
            hashtable.put(((sprche)object).cfr_renamed_204(), object);
        }
        if (!hashtable.containsKey(sproi.cfr_renamed_3)) {
            object2 = (byte[])arg0.get("digest");
            object = new sprche(sproi.cfr_renamed_3, new sprcwe(new sprlqe((byte[])object2)));
            hashtable.put(((sprche)object).cfr_renamed_204(), object);
        }
        return hashtable;
    }
}

