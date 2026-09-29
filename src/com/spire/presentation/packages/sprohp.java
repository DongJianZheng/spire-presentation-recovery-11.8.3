/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraxz;
import com.spire.presentation.packages.sprey;
import com.spire.presentation.packages.sprjgp;
import com.spire.presentation.packages.sprlfp;
import com.spire.presentation.packages.sprqro;
import com.spire.presentation.packages.sprshp;
import com.spire.presentation.packages.sprtada;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprohp
implements sprey {
    private /* synthetic */ String cfr_renamed_18989(sprjgp arg0) {
        if (arg0.cfr_renamed_16910() == 1) {
            return "Symbol";
        }
        return "Wingdings";
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ String cfr_renamed_18990(sprjgp arg0) {
        switch (arg0.cfr_renamed_16910()) {
            case 0: 
            case 1: {
                if (arg0.cfr_renamed_18991() == 1) {
                    return sprtada.cfr_renamed_9("\rg`y)Z#\\/");
                }
                return "Times New Roman";
            }
            case 2: 
            case 3: {
                if (arg0.cfr_renamed_18991() == 1) {
                    return spraxz.cfr_renamed_9("\u001ajw~8M?P4");
                }
                return "Arial";
            }
            case 5: {
                return sprtada.cfr_renamed_9("s!V2]/X!");
            }
            case 4: {
                return spraxz.cfr_renamed_9("{%X3U2@wq6W3\u0019\u001em\u0014");
            }
        }
        return null;
    }

    @Override
    public String cfr_renamed_18950(sprjgp arg0, sprlfp[] arg1) {
        if (sprohp.cfr_renamed_18992(arg0.cfr_renamed_18523())) {
            return null;
        }
        if (!sprohp.cfr_renamed_18993(arg0.cfr_renamed_18523())) {
            return sprtada.cfr_renamed_9("\u0003[5F)Q2\u0014\u000eQ7");
        }
        if (arg0.cfr_renamed_15541() == 2) {
            return this.cfr_renamed_18989(arg0);
        }
        if (arg0.cfr_renamed_18493().cfr_renamed_18470() == sprqro.cfr_renamed_1) {
            return "Symbol";
        }
        if (arg0.cfr_renamed_18493().cfr_renamed_18470() == sprqro.cfr_renamed_2) {
            return this.cfr_renamed_18994(arg0);
        }
        return this.cfr_renamed_18990(arg0);
    }

    private static /* synthetic */ boolean cfr_renamed_18993(sprshp arg0) {
        int n;
        byte[] byArray = arg0.cfr_renamed_205();
        int n2 = byArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            if (byArray[n] != 0) {
                return false;
            }
            n3 = ++n;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ String cfr_renamed_18994(sprjgp arg0) {
        switch (arg0.cfr_renamed_16910()) {
            case 0: 
            case 2: 
            case 4: 
            case 5: {
                return "Arial";
            }
            case 1: {
                return "Times New Roman";
            }
            case 3: {
                return spraxz.cfr_renamed_9("\u0014V\"K>\\%\u0019\u0019\\ ");
            }
        }
        return null;
    }

    private static /* synthetic */ boolean cfr_renamed_18992(sprshp arg0) {
        return arg0.cfr_renamed_205()[0] != 0 && arg0.cfr_renamed_205()[0] != 1;
    }
}

