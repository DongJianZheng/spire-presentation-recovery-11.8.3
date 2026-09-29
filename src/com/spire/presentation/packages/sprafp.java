/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprefp;
import com.spire.presentation.packages.spripe;
import com.spire.presentation.packages.sprmjp;
import com.spire.presentation.packages.sprnsp;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprpro;
import com.spire.presentation.packages.sprqep;
import com.spire.presentation.packages.sprsyia;
import com.spire.presentation.packages.sprtcp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.sprxgp;
import com.spire.presentation.packages.sprznp;
import java.util.Iterator;

@sprtea
public class sprafp
extends sprqep {
    @Override
    @sprtea
    public sprwvn cfr_renamed_14371() {
        try {
            int n;
            sprmjp sprmjp2 = new sprmjp(false);
            Object object = sprafp.cfr_renamed_18650();
            int n2 = ((String[])object).length;
            int n3 = n = 0;
            while (n3 < n2) {
                String string = object[n];
                if (sprznp.cfr_renamed_12328(string) && sprsyia.cfr_renamed_11642(string)) {
                    String string2;
                    try {
                        Iterator iterator = sprpro.cfr_renamed_17427(string, true).iterator();
                        while (iterator.hasNext()) {
                            String string3 = string2 = (String)iterator.next();
                            sprmjp2.cfr_renamed_14943(string3, string3);
                        }
                    }
                    catch (Exception exception) {
                        string2 = exception.getMessage();
                    }
                }
                n3 = ++n;
            }
            if (sprnsp.cfr_renamed_12985() == 0) {
                sprefp.cfr_renamed_18651(sprmjp2);
            }
            object = new sprwvn();
            if (sprmjp2.cfr_renamed_11861() > 0) {
                sprtcp sprtcp2;
                sprtcp sprtcp3 = sprtcp2 = sprmjp2.cfr_renamed_12162();
                while (sprtcp3.cfr_renamed_15064()) {
                    sprtcp3 = sprtcp2;
                    Object object2 = object;
                    sprovja.cfr_renamed_11658((sprwvn)object, new sprxgp(sprtcp2.cfr_renamed_15065()));
                }
            }
            return object;
        }
        catch (Exception exception) {
            return new sprwvn();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String[] cfr_renamed_18650() {
        switch (sprnsp.cfr_renamed_12985()) {
            case 0: {
                String[] stringArray = new String[1];
                stringArray[0] = sprefp.cfr_renamed_18652();
                return stringArray;
            }
            case 2: 
            case 4: {
                String[] stringArray = new String[1];
                stringArray[0] = spripe.cfr_renamed_9("\u0017\u0007Q)J*J2\u0017\rW%L8");
                return stringArray;
            }
            case 1: {
                return sprefp.cfr_renamed_18653();
            }
            case 3: {
                return sprefp.cfr_renamed_18654();
            }
        }
        return new String[0];
    }

    public sprafp(int arg0) {
        super(arg0);
    }

    public sprafp() {
    }
}

