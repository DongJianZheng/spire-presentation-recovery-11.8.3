/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbee;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprehea;
import com.spire.presentation.packages.spreud;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.spriqy;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprnfe;
import com.spire.presentation.packages.sproje;
import com.spire.presentation.packages.sproqd;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprpve;
import com.spire.presentation.packages.sprqa;
import com.spire.presentation.packages.sprqwd;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruee;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprxbe;
import com.spire.presentation.packages.spryae;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class sprlod {
    private static Set cfr_renamed_3 = Collections.unmodifiableSet(new HashSet());
    private static List cfr_renamed_4 = Collections.unmodifiableList(new ArrayList());

    private static /* synthetic */ sprcge cfr_renamed_4427(sprbee arg0, sprije arg1, byte[] arg2) {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(arg0);
        sprlre3.cfr_renamed_49(arg1);
        sprlre sprlre4 = sprlre2;
        sprlre3.cfr_renamed_49(new sprmra(arg2));
        return sprcge.cfr_renamed_23(new sprpse(sprlre2));
    }

    public static sprmra cfr_renamed_27(boolean[] arg0) {
        int n;
        byte[] byArray = new byte[(arg0.length + 7) / 8];
        int n2 = n = 0;
        while (n2 != arg0.length) {
            int n3 = n / 8;
            byArray[n3] = (byte)(byArray[n3] | (arg0[n] ? 1 << 7 - n % 8 : 0));
            n2 = ++n;
        }
        n = arg0.length % 8;
        if (n == 0) {
            return new sprmra(byArray);
        }
        return new sprmra(byArray, 8 - n);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprcyd cfr_renamed_4215(sprqa arg0, sprbee arg1) {
        try {
            sprbee sprbee2 = arg1;
            return new sprcyd(sprlod.cfr_renamed_4427(sprbee2, arg0.cfr_renamed_615(), sprlod.cfr_renamed_4428(arg0, sprbee2)));
        }
        catch (IOException iOException) {
            throw new IllegalStateException(sprehea.cfr_renamed_9("\u0007i\nf\u000b|Dx\u0016g\u0000}\u0007mDk\u0001z\u0010a\u0002a\u0007i\u0010mD{\ro\ni\u0010}\u0016m"));
        }
    }

    private static /* synthetic */ sproje cfr_renamed_4429(sprxbe arg0, sprije arg1, byte[] arg2) {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(arg0);
        sprlre3.cfr_renamed_49(arg1);
        sprlre sprlre4 = sprlre2;
        sprlre3.cfr_renamed_49(new sprmra(arg2));
        return sproje.cfr_renamed_23(new sprpse(sprlre2));
    }

    public static Set cfr_renamed_4236(sprszd arg0) {
        if (arg0 == null) {
            return cfr_renamed_3;
        }
        return Collections.unmodifiableSet(new HashSet<sprtzd>(Arrays.asList(arg0.cfr_renamed_662())));
    }

    private static /* synthetic */ byte[] cfr_renamed_4428(sprqa arg0, spra arg1) throws IOException {
        sprqa sprqa2 = arg0;
        OutputStream outputStream = sprqa2.cfr_renamed_470();
        new sprpve(outputStream).cfr_renamed_2149(arg1);
        outputStream.close();
        return sprqa2.cfr_renamed_79();
    }

    public static boolean cfr_renamed_2157(sprije arg0, sprije arg1) {
        if (!arg0.cfr_renamed_593().equals(arg1.cfr_renamed_593())) {
            return false;
        }
        if (arg0.cfr_renamed_284() == null) {
            return arg1.cfr_renamed_284() == null || arg1.cfr_renamed_284().equals(sprume.cfr_renamed_3);
        }
        if (arg1.cfr_renamed_284() == null) {
            return arg0.cfr_renamed_284() == null || arg0.cfr_renamed_284().equals(sprume.cfr_renamed_3);
        }
        return arg0.cfr_renamed_284().equals(arg1.cfr_renamed_284());
    }

    public static List cfr_renamed_582(sprszd arg0) {
        if (arg0 == null) {
            return cfr_renamed_4;
        }
        return Collections.unmodifiableList(Arrays.asList(arg0.cfr_renamed_583()));
    }

    public static Set cfr_renamed_4234(sprszd arg0) {
        if (arg0 == null) {
            return cfr_renamed_3;
        }
        return Collections.unmodifiableSet(new HashSet<sprtzd>(Arrays.asList(arg0.cfr_renamed_665())));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Date cfr_renamed_4237(sprrpe arg0) {
        try {
            return arg0.cfr_renamed_110();
        }
        catch (ParseException parseException) {
            throw new IllegalStateException(new StringBuilder().insert(0, spriqy.cfr_renamed_9("X\u0007L\u000bA\f\r\u001dBI_\fN\u0006[\f_II\bY\f\u0017I")).append(parseException.getMessage()).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sproqd cfr_renamed_4228(sprqa arg0, spruee arg1) {
        try {
            spruee spruee2 = arg1;
            return new sproqd(sprlod.cfr_renamed_4430(spruee2, arg0.cfr_renamed_615(), sprlod.cfr_renamed_4428(arg0, spruee2)));
        }
        catch (IOException iOException) {
            throw new IllegalStateException(sprehea.cfr_renamed_9("\u0007i\nf\u000b|Dx\u0016g\u0000}\u0007mDi\u0010|\u0016a\u0006}\u0010mDk\u0001z\u0010a\u0002a\u0007i\u0010mD{\ro\ni\u0010}\u0016m"));
        }
    }

    public static boolean[] cfr_renamed_4238(sprmra arg0) {
        if (arg0 != null) {
            int n;
            byte[] byArray = arg0.cfr_renamed_81();
            boolean[] blArray = new boolean[byArray.length * 8 - arg0.cfr_renamed_106()];
            int n2 = n = 0;
            while (n2 != blArray.length) {
                int n3 = n;
                blArray[n3] = (byArray[n / 8] & 128 >>> n3 % 8) != 0;
                n2 = ++n;
            }
            return blArray;
        }
        return null;
    }

    private static /* synthetic */ sprnfe cfr_renamed_4430(spruee arg0, sprije arg1, byte[] arg2) {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(arg0);
        sprlre3.cfr_renamed_49(arg1);
        sprlre sprlre4 = sprlre2;
        sprlre3.cfr_renamed_49(new sprmra(arg2));
        return sprnfe.cfr_renamed_23(new sprpse(sprlre2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_571(spryae arg0, sprtzd arg1, boolean arg2, spra arg3) throws sprqwd {
        try {
            arg0.cfr_renamed_6(arg1, arg2, arg3);
            return;
        }
        catch (IOException iOException) {
            throw new sprqwd(new StringBuilder().insert(0, spriqy.cfr_renamed_9("\nL\u0007C\u0006YIH\u0007N\u0006I\f\r\fU\u001dH\u0007^\u0000B\u0007\u0017I")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static spreud cfr_renamed_4220(sprqa arg0, sprxbe arg1) {
        try {
            sprxbe sprxbe2 = arg1;
            return new spreud(sprlod.cfr_renamed_4429(sprxbe2, arg0.cfr_renamed_615(), sprlod.cfr_renamed_4428(arg0, sprxbe2)));
        }
        catch (IOException iOException) {
            throw new IllegalStateException(sprehea.cfr_renamed_9("\u0007i\nf\u000b|Dx\u0016g\u0000}\u0007mDk\u0001z\u0010a\u0002a\u0007i\u0010mD{\ro\ni\u0010}\u0016m"));
        }
    }
}

