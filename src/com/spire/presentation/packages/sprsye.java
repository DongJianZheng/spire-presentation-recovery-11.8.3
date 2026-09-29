/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgze;
import com.spire.presentation.packages.sprkff;
import com.spire.presentation.packages.sprogf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrhf;
import java.util.Enumeration;
import java.util.Vector;

public class sprsye {
    public static sprogf[] cfr_renamed_5638(sprogf[] arg0) {
        if (arg0 == null) {
            return null;
        }
        sprogf[] sprogfArray = new sprogf[arg0.length];
        System.arraycopy(arg0, 0, sprogfArray, 0, arg0.length);
        return sprogfArray;
    }

    public static byte[][] cfr_renamed_522(byte[][] arg0) {
        int n;
        if (arg0 == null) {
            return null;
        }
        byte[][] byArrayArray = new byte[arg0.length][];
        int n2 = n = 0;
        while (n2 != arg0.length) {
            int n3 = n++;
            byArrayArray[n3] = sproze.cfr_renamed_158(arg0[n3]);
            n2 = n;
        }
        return byArrayArray;
    }

    public static sprrhf[] cfr_renamed_5639(sprrhf[] arg0) {
        if (arg0 == null) {
            return null;
        }
        sprrhf[] sprrhfArray = new sprrhf[arg0.length];
        System.arraycopy(arg0, 0, sprrhfArray, 0, arg0.length);
        return sprrhfArray;
    }

    public static Vector[] cfr_renamed_1161(Vector[] arg0) {
        int n;
        if (arg0 == null) {
            return null;
        }
        Vector[] vectorArray = new Vector[arg0.length];
        int n2 = n = 0;
        while (n2 != arg0.length) {
            int n3 = n;
            int n4 = n;
            vectorArray[n3] = new Vector();
            Enumeration enumeration = arg0[n3].elements();
            while (enumeration.hasMoreElements()) {
                Enumeration enumeration2;
                Enumeration enumeration3 = enumeration2;
                enumeration = enumeration3;
                vectorArray[n].addElement(enumeration3.nextElement());
            }
            n2 = ++n;
        }
        return vectorArray;
    }

    public static sprkff[] cfr_renamed_5640(sprkff[] arg0) {
        if (arg0 == null) {
            return null;
        }
        sprkff[] sprkffArray = new sprkff[arg0.length];
        System.arraycopy(arg0, 0, sprkffArray, 0, arg0.length);
        return sprkffArray;
    }

    public static sprkff[][] cfr_renamed_5641(sprkff[][] arg0) {
        int n;
        if (arg0 == null) {
            return null;
        }
        sprkff[][] sprkffArray = new sprkff[arg0.length][];
        int n2 = n = 0;
        while (n2 != arg0.length) {
            int n3 = n++;
            sprkffArray[n3] = sprsye.cfr_renamed_5640(arg0[n3]);
            n2 = n;
        }
        return sprkffArray;
    }

    public static byte[][][] cfr_renamed_521(byte[][][] arg0) {
        int n;
        if (arg0 == null) {
            return null;
        }
        byte[][][] byArrayArray = new byte[arg0.length][][];
        int n2 = n = 0;
        while (n2 != arg0.length) {
            int n3 = n++;
            byArrayArray[n3] = sprsye.cfr_renamed_522(arg0[n3]);
            n2 = n;
        }
        return byArrayArray;
    }

    public static Vector[][] cfr_renamed_1159(Vector[][] arg0) {
        int n;
        if (arg0 == null) {
            return null;
        }
        Vector[][] vectorArray = new Vector[arg0.length][];
        int n2 = n = 0;
        while (n2 != arg0.length) {
            int n3 = n++;
            vectorArray[n3] = sprsye.cfr_renamed_1161(arg0[n3]);
            n2 = n;
        }
        return vectorArray;
    }

    public static sprgze[] cfr_renamed_5642(sprgze[] arg0) {
        if (arg0 == null) {
            return null;
        }
        sprgze[] sprgzeArray = new sprgze[arg0.length];
        System.arraycopy(arg0, 0, sprgzeArray, 0, arg0.length);
        return sprgzeArray;
    }
}

