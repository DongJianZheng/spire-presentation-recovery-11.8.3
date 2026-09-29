/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spriep;
import com.spire.presentation.packages.sprjzo;
import com.spire.presentation.packages.sprlep;
import com.spire.presentation.packages.sprlfp;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprqep;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwvn;
import java.util.ArrayList;
import java.util.Iterator;

@sprtea
public class sprbjp
extends sprlep {
    private sprlfp[] cfr_renamed_2 = cfr_renamed_3;
    private static sprlfp[] cfr_renamed_3 = new sprlfp[0];
    private sprqep[] cfr_renamed_4;

    @sprtea
    public sprbjp(sprqep[] sprqepArray) {
        this.cfr_renamed_4 = sprqepArray;
    }

    @Override
    public void cfr_renamed_19019() {
        this.cfr_renamed_2 = sprbjp.cfr_renamed_19020(this.cfr_renamed_4);
    }

    @sprtea
    public sprlfp[] cfr_renamed_19021() {
        return this.cfr_renamed_2;
    }

    @sprtea
    public static sprlfp[] cfr_renamed_19020(sprqep[] arg0) {
        try {
            int n;
            sprwvn sprwvn2 = new sprwvn();
            sprjzo sprjzo2 = new sprjzo();
            sprqep[] sprqepArray = arg0;
            int n2 = arg0.length;
            int n3 = n = 0;
            while (n3 < n2) {
                sprqep sprqep2 = sprqepArray[n];
                Iterator iterator = sprqep2.cfr_renamed_14371().iterator();
                while (iterator.hasNext()) {
                    Iterator iterator2;
                    spriep spriep2 = (spriep)iterator2.next();
                    iterator = iterator2;
                    sprjzo2.cfr_renamed_18487(sprwvn2, spriep2, sprqep2);
                }
                n3 = ++n;
            }
            return (sprlfp[])sprovja.cfr_renamed_13436((ArrayList)sprwvn.cfr_renamed_13437(sprwvn2), sprlfp.class);
        }
        catch (Exception exception) {
            return cfr_renamed_3;
        }
    }
}

