/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprvhm;

public class sprjij {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_5679(sprddm arg0, sprco arg1) {
        try {
            return sprjij.cfr_renamed_5675(new sprvhm(arg0, arg1));
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_5675(sprvhm arg0) {
        try {
            return arg0.cfr_renamed_104("DER");
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_5674(sprcom arg0) {
        try {
            return arg0.cfr_renamed_104("DER");
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_5677(sprddm arg0, byte[] arg1) {
        try {
            return sprjij.cfr_renamed_5675(new sprvhm(arg0, arg1));
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_5678(sprddm arg0, sprco arg1) {
        try {
            sprcom sprcom2 = new sprcom(arg0, arg1.cfr_renamed_119());
            return sprjij.cfr_renamed_5674(sprcom2);
        }
        catch (Exception exception) {
            return null;
        }
    }
}

