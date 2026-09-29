/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprakp;
import com.spire.presentation.packages.sprtada;
import com.spire.presentation.packages.sprtea;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@sprtea
public final class sprfin {
    public static final int cfr_renamed_272 = 4096;
    public static final int cfr_renamed_145 = 0;
    public static final int cfr_renamed_114 = 65536;
    public static final int cfr_renamed_96 = 4;
    public static final int cfr_renamed_105 = 131072;
    public static final int cfr_renamed_137 = 2;
    public static final int cfr_renamed_79 = 512;
    public static final int cfr_renamed_107 = 256;
    public static final int cfr_renamed_132 = 8;
    public static final int cfr_renamed_102 = 32;
    public static final int cfr_renamed_93 = 64;
    public static final int cfr_renamed_86 = -1;
    public static final int cfr_renamed_152 = 20;
    public static final int cfr_renamed_112 = 32768;
    public static final int cfr_renamed_119 = 128;
    public static final int cfr_renamed_91 = 8192;
    public static final int cfr_renamed_0 = 1024;
    public static final int cfr_renamed_1 = 1;
    public static final int cfr_renamed_2 = 16;
    public static final int cfr_renamed_3 = 2048;
    public static final int cfr_renamed_4 = 16384;

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[20];
        nArray[0] = 1;
        nArray[1] = 2;
        nArray[2] = 4;
        nArray[3] = 8;
        nArray[4] = 16;
        nArray[5] = 32;
        nArray[6] = 64;
        nArray[7] = 128;
        nArray[8] = 256;
        nArray[9] = 512;
        nArray[10] = 1024;
        nArray[11] = 2048;
        nArray[12] = 4096;
        nArray[13] = 8192;
        nArray[14] = 16384;
        nArray[15] = 32768;
        nArray[16] = 65536;
        nArray[17] = 131072;
        nArray[18] = -1;
        nArray[19] = 0;
        return nArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 1: {
                return "Tab";
            }
            case 2: {
                return "Space";
            }
            case 4: {
                return sprakp.cfr_renamed_9("j\u0005H\u0005]\u0016[\u0014R)[\u0016Q");
            }
            case 8: {
                return "Bookmark";
            }
            case 16: {
                return sprtada.cfr_renamed_9("\b]'\\,]'\\4");
            }
            case 32: {
                return sprakp.cfr_renamed_9("7W\u0005H\u0010n\u0005]");
            }
            case 64: {
                return sprtada.cfr_renamed_9("d)W4A2Q\u0010X!W%\\/X$Q2");
            }
            case 128: {
                return sprakp.cfr_renamed_9("+J\u0010S\u000bT\u0005V,C\u0014R\u0001T");
            }
            case 256: {
                return sprtada.cfr_renamed_9("{\"^%W4u.W([2");
            }
            case 512: {
                return sprakp.cfr_renamed_9("0_\u001cN&U\u0011T\u0000I");
            }
            case 1024: {
                return sprtada.cfr_renamed_9("v!W+S2[5Z$s2U0\\)W3");
            }
            case 2048: {
                return sprakp.cfr_renamed_9("\"S\u0001V\u0000i\f[\u0000S\n]");
            }
            case 4096: {
                return sprtada.cfr_renamed_9("r)Q,P\u0003[$Q3");
            }
            case 8192: {
                return sprakp.cfr_renamed_9("n\u0005X\b_#H\r^");
            }
            case 16384: {
                return sprtada.cfr_renamed_9("\u0015Z+Z/C.q,Q-Q.@3");
            }
            case 32768: {
                return sprakp.cfr_renamed_9("0_\u001cN&U\u001cy\u000bT\u0010_\nN");
            }
            case 65536: {
                return sprtada.cfr_renamed_9("\u0013P4");
            }
            case 131072: {
                return sprakp.cfr_renamed_9("~\tV!\\\u0002_\u0007N");
            }
            case -1: {
                return sprtada.cfr_renamed_9("\u0001X,");
            }
            case 0: {
                return sprakp.cfr_renamed_9("*U\n_");
            }
        }
        return sprtada.cfr_renamed_9("a._.[7Z`d3s2[5D\u0003U4Q'[2M`B!X5Qn");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 1: {
                return "Tab";
            }
            case 2: {
                return "Space";
            }
            case 4: {
                return sprakp.cfr_renamed_9("j\u0005H\u0005]\u0016[\u0014R)[\u0016Q");
            }
            case 8: {
                return "Bookmark";
            }
            case 16: {
                return sprtada.cfr_renamed_9("\b]'\\,]'\\4");
            }
            case 32: {
                return sprakp.cfr_renamed_9("7W\u0005H\u0010n\u0005]");
            }
            case 64: {
                return sprtada.cfr_renamed_9("d)W4A2Q\u0010X!W%\\/X$Q2");
            }
            case 128: {
                return sprakp.cfr_renamed_9("+J\u0010S\u000bT\u0005V,C\u0014R\u0001T");
            }
            case 256: {
                return sprtada.cfr_renamed_9("{\"^%W4u.W([2");
            }
            case 512: {
                return sprakp.cfr_renamed_9("0_\u001cN&U\u0011T\u0000I");
            }
            case 1024: {
                return sprtada.cfr_renamed_9("v!W+S2[5Z$s2U0\\)W3");
            }
            case 2048: {
                return sprakp.cfr_renamed_9("\"S\u0001V\u0000i\f[\u0000S\n]");
            }
            case 4096: {
                return sprtada.cfr_renamed_9("r)Q,P\u0003[$Q3");
            }
            case 8192: {
                return sprakp.cfr_renamed_9("n\u0005X\b_#H\r^");
            }
            case 16384: {
                return sprtada.cfr_renamed_9("\u0015Z+Z/C.q,Q-Q.@3");
            }
            case 32768: {
                return sprakp.cfr_renamed_9("0_\u001cN&U\u001cy\u000bT\u0010_\nN");
            }
            case 65536: {
                return sprtada.cfr_renamed_9("\u0013P4");
            }
            case 131072: {
                return sprakp.cfr_renamed_9("~\tV!\\\u0002_\u0007N");
            }
            case -1: {
                return sprtada.cfr_renamed_9("\u0001X,");
            }
            case 0: {
                return sprakp.cfr_renamed_9("*U\n_");
            }
        }
        return sprtada.cfr_renamed_9("a._.[7Z`d3s2[5D\u0003U4Q'[2M`B!X5Qn");
    }

    public static Set<String> cfr_renamed_12047(int arg0) {
        HashSet<String> hashSet = new HashSet<String>();
        if ((1 & arg0) == 1) {
            hashSet.add("Tab");
        }
        if ((2 & arg0) == 2) {
            hashSet.add("Space");
        }
        if ((4 & arg0) == 4) {
            hashSet.add(sprakp.cfr_renamed_9("j\u0005H\u0005]\u0016[\u0014R)[\u0016Q"));
        }
        if ((8 & arg0) == 8) {
            hashSet.add("Bookmark");
        }
        if ((0x10 & arg0) == 16) {
            hashSet.add(sprtada.cfr_renamed_9("\b]'\\,]'\\4"));
        }
        if ((0x20 & arg0) == 32) {
            hashSet.add(sprakp.cfr_renamed_9("7W\u0005H\u0010n\u0005]"));
        }
        if ((0x40 & arg0) == 64) {
            hashSet.add(sprtada.cfr_renamed_9("d)W4A2Q\u0010X!W%\\/X$Q2"));
        }
        if ((0x80 & arg0) == 128) {
            hashSet.add(sprakp.cfr_renamed_9("+J\u0010S\u000bT\u0005V,C\u0014R\u0001T"));
        }
        if ((0x100 & arg0) == 256) {
            hashSet.add(sprtada.cfr_renamed_9("{\"^%W4u.W([2"));
        }
        if ((0x200 & arg0) == 512) {
            hashSet.add(sprakp.cfr_renamed_9("0_\u001cN&U\u0011T\u0000I"));
        }
        if ((0x400 & arg0) == 1024) {
            hashSet.add(sprtada.cfr_renamed_9("v!W+S2[5Z$s2U0\\)W3"));
        }
        if ((0x800 & arg0) == 2048) {
            hashSet.add(sprakp.cfr_renamed_9("\"S\u0001V\u0000i\f[\u0000S\n]"));
        }
        if ((0x1000 & arg0) == 4096) {
            hashSet.add(sprtada.cfr_renamed_9("r)Q,P\u0003[$Q3"));
        }
        if ((0x2000 & arg0) == 8192) {
            hashSet.add(sprakp.cfr_renamed_9("n\u0005X\b_#H\r^"));
        }
        if ((0x4000 & arg0) == 16384) {
            hashSet.add(sprtada.cfr_renamed_9("\u0015Z+Z/C.q,Q-Q.@3"));
        }
        if ((0x8000 & arg0) == 32768) {
            hashSet.add(sprakp.cfr_renamed_9("0_\u001cN&U\u001cy\u000bT\u0010_\nN"));
        }
        if ((0x10000 & arg0) == 65536) {
            hashSet.add(sprtada.cfr_renamed_9("\u0013P4"));
        }
        if ((0x20000 & arg0) == 131072) {
            hashSet.add(sprakp.cfr_renamed_9("~\tV!\\\u0002_\u0007N"));
        }
        if ((0xFFFFFFFF & arg0) == -1) {
            hashSet.add(sprtada.cfr_renamed_9("\u0001X,"));
        }
        if ((0 & arg0) == 0) {
            hashSet.add(sprakp.cfr_renamed_9("*U\n_"));
        }
        return hashSet;
    }

    public static int cfr_renamed_12046(Set<String> arg0) {
        Iterator<String> iterator;
        int n = 0;
        Iterator<String> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            String string = iterator.next();
            n |= sprfin.cfr_renamed_5644(string);
            iterator2 = iterator;
        }
        return n;
    }

    public static int cfr_renamed_5644(String arg0) {
        if ("Tab".equals(arg0)) {
            return 1;
        }
        if ("Space".equals(arg0)) {
            return 2;
        }
        if (sprtada.cfr_renamed_9("\u0010U2U'F!D(y!F+").equals(arg0)) {
            return 4;
        }
        if ("Bookmark".equals(arg0)) {
            return 8;
        }
        if (sprakp.cfr_renamed_9("r\r]\fV\r]\fN").equals(arg0)) {
            return 16;
        }
        if (sprtada.cfr_renamed_9("g-U2@\u0014U'").equals(arg0)) {
            return 32;
        }
        if (sprakp.cfr_renamed_9("4S\u0007N\u0011H\u0001j\b[\u0007_\fU\b^\u0001H").equals(arg0)) {
            return 64;
        }
        if (sprtada.cfr_renamed_9("{0@)[.U,|9D(Q.").equals(arg0)) {
            return 128;
        }
        if (sprakp.cfr_renamed_9("+X\u000e_\u0007N%T\u0007R\u000bH").equals(arg0)) {
            return 256;
        }
        if (sprtada.cfr_renamed_9("`%L4v/A.P3").equals(arg0)) {
            return 512;
        }
        if (sprakp.cfr_renamed_9("&[\u0007Q\u0003H\u000bO\n^#H\u0005J\fS\u0007I").equals(arg0)) {
            return 1024;
        }
        if (sprtada.cfr_renamed_9("r)Q,P\u0013\\!P)Z'").equals(arg0)) {
            return 2048;
        }
        if (sprakp.cfr_renamed_9("\"S\u0001V\u0000y\u000b^\u0001I").equals(arg0)) {
            return 4096;
        }
        if (sprtada.cfr_renamed_9("\u0014U\"X%s2]$").equals(arg0)) {
            return 8192;
        }
        if (sprakp.cfr_renamed_9("o\nQ\nU\u0013T!V\u0001W\u0001T\u0010I").equals(arg0)) {
            return 16384;
        }
        if (sprtada.cfr_renamed_9("`%L4v/L\u0003[.@%Z4").equals(arg0)) {
            return 32768;
        }
        if (sprakp.cfr_renamed_9("i\u0000N").equals(arg0)) {
            return 65536;
        }
        if (sprtada.cfr_renamed_9("\u0004Y,q&R%W4").equals(arg0)) {
            return 131072;
        }
        if (sprakp.cfr_renamed_9("{\bV").equals(arg0)) {
            return -1;
        }
        if (sprtada.cfr_renamed_9("z/Z%").equals(arg0)) {
            return 0;
        }
        throw new IllegalArgumentException(sprakp.cfr_renamed_9("o\nQ\nU\u0013TDj\u0017}\u0016U\u0011J'[\u0010_\u0003U\u0016CDT\u0005W\u0001\u0014"));
    }

    private /* synthetic */ sprfin() {
    }
}

