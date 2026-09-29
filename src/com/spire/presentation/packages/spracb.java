/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhxa;
import com.spire.presentation.packages.spridb;
import com.spire.presentation.packages.sprjcb;
import com.spire.presentation.packages.sprtdb;
import com.spire.presentation.packages.sprzra;
import java.util.Enumeration;
import java.util.Vector;

public class spracb {
    public static sprhxa[] cfr_renamed_1172(sprhxa[] arg0) {
        if (arg0 == null) {
            return null;
        }
        sprhxa[] sprhxaArray = new sprhxa[arg0.length];
        System.arraycopy(arg0, 0, sprhxaArray, 0, arg0.length);
        return sprhxaArray;
    }

    public static sprjcb[] cfr_renamed_1164(sprjcb[] arg0) {
        if (arg0 == null) {
            return null;
        }
        sprjcb[] sprjcbArray = new sprjcb[arg0.length];
        System.arraycopy(arg0, 0, sprjcbArray, 0, arg0.length);
        return sprjcbArray;
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
            vectorArray[n3] = spracb.cfr_renamed_1161(arg0[n3]);
            n2 = n;
        }
        return vectorArray;
    }

    public static sprtdb[] cfr_renamed_1178(sprtdb[] arg0) {
        if (arg0 == null) {
            return null;
        }
        sprtdb[] sprtdbArray = new sprtdb[arg0.length];
        System.arraycopy(arg0, 0, sprtdbArray, 0, arg0.length);
        return sprtdbArray;
    }

    public static spridb[] cfr_renamed_1170(spridb[] arg0) {
        if (arg0 == null) {
            return null;
        }
        spridb[] spridbArray = new spridb[arg0.length];
        System.arraycopy(arg0, 0, spridbArray, 0, arg0.length);
        return spridbArray;
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
            byArrayArray[n3] = spracb.cfr_renamed_522(arg0[n3]);
            n2 = n;
        }
        return byArrayArray;
    }

    public static sprhxa[][] cfr_renamed_1171(sprhxa[][] arg0) {
        int n;
        if (arg0 == null) {
            return null;
        }
        sprhxa[][] sprhxaArray = new sprhxa[arg0.length][];
        int n2 = n = 0;
        while (n2 != arg0.length) {
            int n3 = n++;
            sprhxaArray[n3] = spracb.cfr_renamed_1172(arg0[n3]);
            n2 = n;
        }
        return sprhxaArray;
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
            byArrayArray[n3] = sprzra.cfr_renamed_158(arg0[n3]);
            n2 = n;
        }
        return byArrayArray;
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
}

