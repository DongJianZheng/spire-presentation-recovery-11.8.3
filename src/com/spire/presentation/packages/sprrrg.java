/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbly;
import com.spire.presentation.packages.sprdbm;
import com.spire.presentation.packages.sprde;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sprmhm;
import com.spire.presentation.packages.sprnvg;
import com.spire.presentation.packages.sprnzl;
import com.spire.presentation.packages.sprtzl;
import com.spire.presentation.packages.sprvbh;
import com.spire.presentation.packages.sprwhm;
import com.spire.presentation.packages.sprxcm;
import com.spire.presentation.packages.sprzcm;
import com.spire.presentation.packages.sprzyg;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class sprrrg {
    private static final Logger cfr_renamed_4 = Logger.getLogger(sprrrg.class.getName());

    public abstract byte[] cfr_renamed_91() throws IOException;

    public abstract sprvbh cfr_renamed_1157();

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ boolean cfr_renamed_7840(int arg0) {
        switch (arg0) {
            case 13: 
            case 17: {
                return true;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List<sprzyg> cfr_renamed_7733(sprmam arg0) throws IOException {
        ArrayList<sprzyg> arrayList = new ArrayList<sprzyg>();
        block2: while (true) {
            sprmam sprmam2 = arg0;
            while (true) {
                if (sprmam2.cfr_renamed_7731() != 2) {
                    return arrayList;
                }
                try {
                    sprxcm sprxcm2 = (sprxcm)arg0.cfr_renamed_7676();
                    sprmhm sprmhm2 = sprrrg.cfr_renamed_7732(arg0);
                    arrayList.add(new sprzyg(sprxcm2, sprmhm2));
                    sprmam2 = arg0;
                }
                catch (sprwhm sprwhm2) {
                    if (!cfr_renamed_4.isLoggable(Level.FINE)) continue block2;
                    cfr_renamed_4.fine(new StringBuilder().insert(0, sprbly.cfr_renamed_9("'?=$$=:3t!:?:;#:t'=3:5 !&1nt")).append(sprwhm2.getMessage()).toString());
                    continue block2;
                }
            }
            break;
        }
    }

    public abstract void cfr_renamed_2623(OutputStream var1) throws IOException;

    public static void cfr_renamed_7734(sprmam arg0, List<sprde> arg1, List<sprmhm> arg2, List<List<sprzyg>> arg3) throws IOException {
        sprmam sprmam2 = arg0;
        while (sprrrg.cfr_renamed_7840(sprmam2.cfr_renamed_7731())) {
            List<sprmhm> list;
            sprzcm sprzcm2;
            sprtzl sprtzl2 = arg0.cfr_renamed_7676();
            if (sprtzl2 instanceof sprdbm) {
                sprzcm2 = (sprdbm)sprtzl2;
                list = arg2;
                arg1.add((sprde)((Object)sprzcm2));
            } else {
                sprzcm2 = (sprnzl)sprtzl2;
                list = arg2;
                arg1.add(new sprnvg(((sprnzl)sprzcm2).cfr_renamed_7841()));
            }
            list.add(sprrrg.cfr_renamed_7732(arg0));
            arg3.add(sprrrg.cfr_renamed_7733(arg0));
            sprmam2 = arg0;
        }
    }

    public abstract sprvbh cfr_renamed_5981(byte[] var1);

    public static sprmhm cfr_renamed_7732(sprmam arg0) throws IOException {
        if (arg0.cfr_renamed_7731() == 12) {
            return (sprmhm)arg0.cfr_renamed_7676();
        }
        return null;
    }

    public abstract int cfr_renamed_84();

    public abstract sprvbh cfr_renamed_7720(long var1);

    public abstract Iterator<sprvbh> cfr_renamed_7726(long var1);

    public abstract Iterator<sprvbh> cfr_renamed_7458();
}

