/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprhym;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprrif;
import com.spire.presentation.packages.sprsun;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprwtf;
import com.spire.presentation.packages.spryye;

public class sprxbf {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_5673(spryye arg0, spridn arg1) {
        if (!arg0.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprhym.cfr_renamed_9("\u0018,\n5\u0001:H2\r H?\u0007,\u0006="));
        }
        try {
            return sprxbf.cfr_renamed_5674(sprwtf.cfr_renamed_5661(arg0, arg1));
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
    public static byte[] cfr_renamed_5676(spryye arg0) {
        if (arg0.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprsun.cfr_renamed_9("(\b1\f9\u000e=Z3\u001f!Z>\u0015-\u0014<"));
        }
        try {
            return sprxbf.cfr_renamed_5675(sprrif.cfr_renamed_5658(arg0));
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
            return sprxbf.cfr_renamed_5675(new sprvhm(arg0, arg1));
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
            return sprxbf.cfr_renamed_5674(sprcom2);
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
    public static byte[] cfr_renamed_5679(sprddm arg0, sprco arg1) {
        try {
            return sprxbf.cfr_renamed_5675(new sprvhm(arg0, arg1));
        }
        catch (Exception exception) {
            return null;
        }
    }
}

