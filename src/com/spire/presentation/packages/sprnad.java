/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprkxc;
import com.spire.presentation.packages.sprprn;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzsc;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Hashtable;

public class sprnad {
    public static final Integer cfr_renamed_4 = spriwa.cfr_renamed_279(12);

    public static void cfr_renamed_2782(Hashtable arg0, byte[] arg1) throws IOException {
        arg0.put(cfr_renamed_4, sprnad.cfr_renamed_2783(arg1));
    }

    public static byte[] cfr_renamed_2784(byte[] arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprprn.cfr_renamed_9("0dourodhxoS`c`0!t`yoxu7cr!yt{m"));
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arg0);
        byte[] byArray = sprzsc.cfr_renamed_2763(byteArrayInputStream);
        sprkxc.cfr_renamed_2674(byteArrayInputStream);
        return byArray;
    }

    public static byte[] cfr_renamed_2785(Hashtable arg0) throws IOException {
        byte[] byArray = sprzsc.cfr_renamed_2642(arg0, cfr_renamed_4);
        if (byArray == null) {
            return null;
        }
        return sprnad.cfr_renamed_2784(byArray);
    }

    public static byte[] cfr_renamed_2783(byte[] arg0) throws IOException {
        if (arg0 == null) {
            throw new spryad(80);
        }
        return sprzsc.cfr_renamed_2741(arg0);
    }
}

