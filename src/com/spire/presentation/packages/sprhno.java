/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhfd;
import com.spire.presentation.packages.sprklg;
import com.spire.presentation.packages.sprtea;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@sprtea
public final class sprhno {
    public static final int cfr_renamed_102 = 4;
    public static final int cfr_renamed_93 = 2048;
    public static final int cfr_renamed_86 = 128;
    public static final int cfr_renamed_152 = 11;
    public static final int cfr_renamed_112 = 4096;
    public static final int cfr_renamed_119 = 8192;
    public static final int cfr_renamed_91 = 512;
    public static final int cfr_renamed_0 = 65536;
    public static final int cfr_renamed_1 = 1024;
    public static final int cfr_renamed_2 = 16;
    public static final int cfr_renamed_3 = 256;
    public static final int cfr_renamed_4 = 2;

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 2: {
                return sprhfd.cfr_renamed_9("c\u0018M\u0019Y\r");
            }
            case 4: {
                return sprklg.cfr_renamed_9("QP{LbYv");
            }
            case 16: {
                return sprhfd.cfr_renamed_9("k\u0004U\u0018D!B\fI\u0010");
            }
            case 128: {
                return sprklg.cfr_renamed_9("nfP@YsX{Ru");
            }
            case 256: {
                return sprhfd.cfr_renamed_9("b\u0007~\rO\u001c");
            }
            case 512: {
                return sprklg.cfr_renamed_9("o\u007f]~PQTsNa");
            }
            case 1024: {
                return sprhfd.cfr_renamed_9("&Y\u0005I\u001aE\u000b_$C\u000bM\u0004");
            }
            case 2048: {
                return sprklg.cfr_renamed_9("\\I\u007fY`UqO^]fU|");
            }
            case 4096: {
                return sprhfd.cfr_renamed_9("e\u000fB\u0007^\r`\tB\u000fY\tK\r");
            }
            case 8192: {
                return sprklg.cfr_renamed_9("BXk");
            }
            case 65536: {
                return sprhfd.cfr_renamed_9(":I\u001eI\u001a_\re\u0006H\rT%M\u0018");
            }
        }
        return sprklg.cfr_renamed_9("GRyR}K|\u001cWQtyjHFYjH]IfsbH{S|O2JsPgY<");
    }

    public static int cfr_renamed_12046(Set<String> arg0) {
        Iterator<String> iterator;
        int n = 0;
        Iterator<String> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            String string = iterator.next();
            n |= sprhno.cfr_renamed_5644(string);
            iterator2 = iterator;
        }
        return n;
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[11];
        nArray[0] = 2;
        nArray[1] = 4;
        nArray[2] = 16;
        nArray[3] = 128;
        nArray[4] = 256;
        nArray[5] = 512;
        nArray[6] = 1024;
        nArray[7] = 2048;
        nArray[8] = 4096;
        nArray[9] = 8192;
        nArray[10] = 65536;
        return nArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 2: {
                return sprhfd.cfr_renamed_9("c\u0018M\u0019Y\r");
            }
            case 4: {
                return sprklg.cfr_renamed_9("QP{LbYv");
            }
            case 16: {
                return sprhfd.cfr_renamed_9("k\u0004U\u0018D!B\fI\u0010");
            }
            case 128: {
                return sprklg.cfr_renamed_9("nfP@YsX{Ru");
            }
            case 256: {
                return sprhfd.cfr_renamed_9("b\u0007~\rO\u001c");
            }
            case 512: {
                return sprklg.cfr_renamed_9("o\u007f]~PQTsNa");
            }
            case 1024: {
                return sprhfd.cfr_renamed_9("&Y\u0005I\u001aE\u000b_$C\u000bM\u0004");
            }
            case 2048: {
                return sprklg.cfr_renamed_9("\\I\u007fY`UqO^]fU|");
            }
            case 4096: {
                return sprhfd.cfr_renamed_9("e\u000fB\u0007^\r`\tB\u000fY\tK\r");
            }
            case 8192: {
                return sprklg.cfr_renamed_9("BXk");
            }
            case 65536: {
                return sprhfd.cfr_renamed_9(":I\u001eI\u001a_\re\u0006H\rT%M\u0018");
            }
        }
        return sprklg.cfr_renamed_9("GRyR}K|\u001cWQtyjHFYjH]IfsbH{S|O2JsPgY<");
    }

    public static Set<String> cfr_renamed_12047(int arg0) {
        HashSet<String> hashSet = new HashSet<String>();
        if ((2 & arg0) == 2) {
            hashSet.add(sprhfd.cfr_renamed_9("c\u0018M\u0019Y\r"));
        }
        if ((4 & arg0) == 4) {
            hashSet.add(sprklg.cfr_renamed_9("QP{LbYv"));
        }
        if ((0x10 & arg0) == 16) {
            hashSet.add(sprhfd.cfr_renamed_9("k\u0004U\u0018D!B\fI\u0010"));
        }
        if ((0x80 & arg0) == 128) {
            hashSet.add(sprklg.cfr_renamed_9("nfP@YsX{Ru"));
        }
        if ((0x100 & arg0) == 256) {
            hashSet.add(sprhfd.cfr_renamed_9("b\u0007~\rO\u001c"));
        }
        if ((0x200 & arg0) == 512) {
            hashSet.add(sprklg.cfr_renamed_9("o\u007f]~PQTsNa"));
        }
        if ((0x400 & arg0) == 1024) {
            hashSet.add(sprhfd.cfr_renamed_9("&Y\u0005I\u001aE\u000b_$C\u000bM\u0004"));
        }
        if ((0x800 & arg0) == 2048) {
            hashSet.add(sprklg.cfr_renamed_9("\\I\u007fY`UqO^]fU|"));
        }
        if ((0x1000 & arg0) == 4096) {
            hashSet.add(sprhfd.cfr_renamed_9("e\u000fB\u0007^\r`\tB\u000fY\tK\r"));
        }
        if ((0x2000 & arg0) == 8192) {
            hashSet.add(sprklg.cfr_renamed_9("BXk"));
        }
        if ((0x10000 & arg0) == 65536) {
            hashSet.add(sprhfd.cfr_renamed_9(":I\u001eI\u001a_\re\u0006H\rT%M\u0018"));
        }
        return hashSet;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 5;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (2 ^ 5) << 1;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ 2 << 1;
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

    private /* synthetic */ sprhno() {
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprklg.cfr_renamed_9("sb]cIw").equals(arg0)) {
            return 2;
        }
        if (sprhfd.cfr_renamed_9("+@\u0001\\\u0018I\f").equals(arg0)) {
            return 4;
        }
        if (sprklg.cfr_renamed_9("{~EbT[RvYj").equals(arg0)) {
            return 16;
        }
        if (sprhfd.cfr_renamed_9("~\u001c@:I\tH\u0001B\u000f").equals(arg0)) {
            return 128;
        }
        if (sprklg.cfr_renamed_9("r}nw_f").equals(arg0)) {
            return 256;
        }
        if (sprhfd.cfr_renamed_9("\u007f\u0005M\u0004@+D\t^\u001b").equals(arg0)) {
            return 512;
        }
        if (sprklg.cfr_renamed_9("\\I\u007fY`UqO^Sq]~").equals(arg0)) {
            return 1024;
        }
        if (sprhfd.cfr_renamed_9("&Y\u0005I\u001aE\u000b_$M\u001cE\u0006").equals(arg0)) {
            return 2048;
        }
        if (sprklg.cfr_renamed_9("uuR}NwpsRuIs[w").equals(arg0)) {
            return 4096;
        }
        if (sprhfd.cfr_renamed_9("8H\u0011").equals(arg0)) {
            return 8192;
        }
        if (sprklg.cfr_renamed_9("@YdY`Owu|XwD_]b").equals(arg0)) {
            return 65536;
        }
        throw new IllegalArgumentException(sprhfd.cfr_renamed_9("y\u0006G\u0006C\u001fBHi\u0005J-T\u001cx\rT\u001cc\u001dX'\\\u001cE\u0007B\u001b\f\u0006M\u0005IF"));
    }
}

