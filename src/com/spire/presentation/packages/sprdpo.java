/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlyy;
import com.spire.presentation.packages.sprsqr;
import com.spire.presentation.packages.sprtea;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@sprtea
public final class sprdpo {
    public static final long cfr_renamed_93 = 1024L;
    public static final long cfr_renamed_86 = 2L;
    public static final long cfr_renamed_152 = 4L;
    public static final long cfr_renamed_112 = 4096L;
    public static final int cfr_renamed_119 = 10;
    public static final long cfr_renamed_91 = 2048L;
    public static final long cfr_renamed_0 = 1L;
    public static final long cfr_renamed_1 = 0x80000000L;
    public static final long cfr_renamed_2 = 8192L;
    public static final long cfr_renamed_3 = 32L;
    public static final long cfr_renamed_4 = 16384L;

    public static String cfr_renamed_16513(long arg0) {
        if (1L == arg0) {
            return sprsqr.cfr_renamed_9("&w\u0010{\u0001j\u000bq\fL\u000by\nj6q.{\u0004j");
        }
        if (2L == arg0) {
            return sprlyy.cfr_renamed_9("M {,j=`&g\u001fl;} j(e");
        }
        if (4L == arg0) {
            return sprsqr.cfr_renamed_9("P\rX\u000bj r\u0003}\t\\\rf");
        }
        if (32L == arg0) {
            return sprlyy.cfr_renamed_9("\r`:y%h0O&{$h=J&g={&e");
        }
        if (1024L == arg0) {
            return sprsqr.cfr_renamed_9(",q$q\fj$\u007f\u000er\u0000\u007f\u0001u");
        }
        if (2048L == arg0) {
            return sprlyy.cfr_renamed_9("D,h:|;l\u001d{(`%`'n\u001ay(j,z");
        }
        if (4096L == arg0) {
            return sprsqr.cfr_renamed_9(",q5l\u0003n");
        }
        if (8192L == arg0) {
            return sprlyy.cfr_renamed_9("E g,E d }");
        }
        if (16384L == arg0) {
            return sprsqr.cfr_renamed_9(",q!r\u000bn");
        }
        if (0x80000000L == arg0) {
            return sprlyy.cfr_renamed_9("K0y(z:N-`");
        }
        return sprsqr.cfr_renamed_9("K\fu\fq\u0015pB[\u000fx2r\u0017m1j\u0010w\fy$q\u0010s\u0003j$r\u0003y\u0011>\u0014\u007f\u000ek\u00070");
    }

    public static long cfr_renamed_12046(Set<String> arg0) {
        Iterator<String> iterator;
        long l = 0L;
        Iterator<String> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            String string = iterator.next();
            l |= sprdpo.cfr_renamed_5644(string);
            iterator2 = iterator;
        }
        return l;
    }

    private /* synthetic */ sprdpo() {
    }

    public static String cfr_renamed_16514(long arg0) {
        if (1L == arg0) {
            return sprlyy.cfr_renamed_9("\r`;l*} f'[ n!}\u001df\u0005l/}");
        }
        if (2L == arg0) {
            return sprsqr.cfr_renamed_9("Z\u000bl\u0007}\u0016w\rp4{\u0010j\u000b}\u0003r");
        }
        if (4L == arg0) {
            return sprlyy.cfr_renamed_9("G&O }\u000be(j\"K&q");
        }
        if (32L == arg0) {
            return sprsqr.cfr_renamed_9("&w\u0011n\u000e\u007f\u001bX\rl\u000f\u007f\u0016]\rp\u0016l\rr");
        }
        if (1024L == arg0) {
            return sprlyy.cfr_renamed_9("\u0007f\u000ff'}\u000fh%e+h*b");
        }
        if (2048L == arg0) {
            return sprsqr.cfr_renamed_9("S\u0007\u007f\u0011k\u0010{6l\u0003w\u000ew\fy1n\u0003}\u0007m");
        }
        if (4096L == arg0) {
            return sprlyy.cfr_renamed_9("\u0007f\u001e{(y");
        }
        if (8192L == arg0) {
            return sprsqr.cfr_renamed_9("R\u000bp\u0007R\u000bs\u000bj");
        }
        if (16384L == arg0) {
            return sprlyy.cfr_renamed_9("\u0007f\ne y");
        }
        if (0x80000000L == arg0) {
            return sprsqr.cfr_renamed_9("\\\u001bn\u0003m\u0011Y\u0006w");
        }
        return sprlyy.cfr_renamed_9("\\'b'f>giL$o\u0019e<z\u001a};`'n\u000ff;d(}\u000fe(n:)?h%|,'");
    }

    public static long cfr_renamed_5644(String arg0) {
        if (sprsqr.cfr_renamed_9("&w\u0010{\u0001j\u000bq\fL\u000by\nj6q.{\u0004j").equals(arg0)) {
            return 1L;
        }
        if (sprlyy.cfr_renamed_9("M {,j=`&g\u001fl;} j(e").equals(arg0)) {
            return 2L;
        }
        if (sprsqr.cfr_renamed_9("P\rX\u000bj r\u0003}\t\\\rf").equals(arg0)) {
            return 4L;
        }
        if (sprlyy.cfr_renamed_9("\r`:y%h0O&{$h=J&g={&e").equals(arg0)) {
            return 32L;
        }
        if (sprsqr.cfr_renamed_9(",q$q\fj$\u007f\u000er\u0000\u007f\u0001u").equals(arg0)) {
            return 1024L;
        }
        if (sprlyy.cfr_renamed_9("D,h:|;l\u001d{(`%`'n\u001ay(j,z").equals(arg0)) {
            return 2048L;
        }
        if (sprsqr.cfr_renamed_9(",q5l\u0003n").equals(arg0)) {
            return 4096L;
        }
        if (sprlyy.cfr_renamed_9("E g,E d }").equals(arg0)) {
            return 8192L;
        }
        if (sprsqr.cfr_renamed_9(",q!r\u000bn").equals(arg0)) {
            return 16384L;
        }
        if (sprlyy.cfr_renamed_9("K0y(z:N-`").equals(arg0)) {
            return 0x80000000L;
        }
        throw new IllegalArgumentException(sprsqr.cfr_renamed_9("7p\tp\ri\f>'s\u0004N\u000ek\u0011M\u0016l\u000bp\u0005X\rl\u000f\u007f\u0016X\u000e\u007f\u0005mBp\u0003s\u00070"));
    }

    public static long[] cfr_renamed_205() {
        long[] lArray = new long[10];
        lArray[0] = 1L;
        lArray[1] = 2L;
        lArray[2] = 4L;
        lArray[3] = 32L;
        lArray[4] = 1024L;
        lArray[5] = 2048L;
        lArray[6] = 4096L;
        lArray[7] = 8192L;
        lArray[8] = 16384L;
        lArray[9] = 0x80000000L;
        return lArray;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = 1 << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = 3 << 3 ^ 5;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public static Set<String> cfr_renamed_16515(long arg0) {
        HashSet<String> hashSet = new HashSet<String>();
        if ((1L & arg0) == 1L) {
            hashSet.add(sprlyy.cfr_renamed_9("\r`;l*} f'[ n!}\u001df\u0005l/}"));
        }
        if ((2L & arg0) == 2L) {
            hashSet.add(sprsqr.cfr_renamed_9("Z\u000bl\u0007}\u0016w\rp4{\u0010j\u000b}\u0003r"));
        }
        if ((4L & arg0) == 4L) {
            hashSet.add(sprlyy.cfr_renamed_9("G&O }\u000be(j\"K&q"));
        }
        if ((0x20L & arg0) == 32L) {
            hashSet.add(sprsqr.cfr_renamed_9("&w\u0011n\u000e\u007f\u001bX\rl\u000f\u007f\u0016]\rp\u0016l\rr"));
        }
        if ((0x400L & arg0) == 1024L) {
            hashSet.add(sprlyy.cfr_renamed_9("\u0007f\u000ff'}\u000fh%e+h*b"));
        }
        if ((0x800L & arg0) == 2048L) {
            hashSet.add(sprsqr.cfr_renamed_9("S\u0007\u007f\u0011k\u0010{6l\u0003w\u000ew\fy1n\u0003}\u0007m"));
        }
        if ((0x1000L & arg0) == 4096L) {
            hashSet.add(sprlyy.cfr_renamed_9("\u0007f\u001e{(y"));
        }
        if ((0x2000L & arg0) == 8192L) {
            hashSet.add(sprsqr.cfr_renamed_9("R\u000bp\u0007R\u000bs\u000bj"));
        }
        if ((0x4000L & arg0) == 16384L) {
            hashSet.add(sprlyy.cfr_renamed_9("\u0007f\ne y"));
        }
        if ((0x80000000L & arg0) == 0x80000000L) {
            hashSet.add(sprsqr.cfr_renamed_9("\\\u001bn\u0003m\u0011Y\u0006w"));
        }
        return hashSet;
    }
}

