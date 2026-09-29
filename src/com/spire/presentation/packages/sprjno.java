/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprizc;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxra;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@sprtea
public final class sprjno {
    public static final int cfr_renamed_86 = 0;
    public static final int cfr_renamed_152 = 2;
    public static final int cfr_renamed_112 = 9;
    public static final int cfr_renamed_119 = 64;
    public static final int cfr_renamed_91 = 8;
    public static final int cfr_renamed_0 = 16;
    public static final int cfr_renamed_1 = 4;
    public static final int cfr_renamed_2 = 128;
    public static final int cfr_renamed_3 = 256;
    public static final int cfr_renamed_4 = 1;

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprxra.cfr_renamed_9("L\u0017l\u001d");
            }
            case 1: {
                return sprizc.cfr_renamed_9("\\nkovX\u007fh\u007fL\u007fhv");
            }
            case 2: {
                return sprxra.cfr_renamed_9("@\nw\u000bj<c\fc,p\u0019l\u000bd\u0017p\u0015");
            }
            case 4: {
                return sprizc.cfr_renamed_9("\\nkovX\u007fh\u007fLlymyj_qpqnm");
            }
            case 8: {
                return sprxra.cfr_renamed_9("@\nw\u000bj<c\fc:n\u001dl\u001cD\u0019a\fm\nq0");
            }
            case 16: {
                return sprizc.cfr_renamed_9("^limtZ}j}\\p{rzZ\u007f\u007fjsloH");
            }
            case 64: {
                return sprxra.cfr_renamed_9("@\nw\u000bj<c\fc>m\u001bw\u000bQ\u001bc\u0014g\u000b");
            }
            case 128: {
                return sprizc.cfr_renamed_9("\\nkovX\u007fh\u007fUm[\u007fqs}]sln{\u007fjyz");
            }
            case 256: {
                return sprxra.cfr_renamed_9(":p\rq\u0010F\u0019v\u0019F\u0017L\u0017v,p\u0019l\u000bd\u0017p\u0015");
            }
        }
        return sprizc.cfr_renamed_9("Ipwpsir>YszNpko\\nkovX\u007fh\u007fZr}yo>j\u007fpky0");
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprxra.cfr_renamed_9("L\u0017l\u001d").equals(arg0)) {
            return 0;
        }
        if (sprizc.cfr_renamed_9("\\nkovX\u007fh\u007fL\u007fhv").equals(arg0)) {
            return 1;
        }
        if (sprxra.cfr_renamed_9("@\nw\u000bj<c\fc,p\u0019l\u000bd\u0017p\u0015").equals(arg0)) {
            return 2;
        }
        if (sprizc.cfr_renamed_9("\\nkovX\u007fh\u007fLlymyj_qpqnm").equals(arg0)) {
            return 4;
        }
        if (sprxra.cfr_renamed_9("@\nw\u000bj<c\fc:n\u001dl\u001cD\u0019a\fm\nq0").equals(arg0)) {
            return 8;
        }
        if (sprizc.cfr_renamed_9("^limtZ}j}\\p{rzZ\u007f\u007fjsloH").equals(arg0)) {
            return 16;
        }
        if (sprxra.cfr_renamed_9("@\nw\u000bj<c\fc>m\u001bw\u000bQ\u001bc\u0014g\u000b").equals(arg0)) {
            return 64;
        }
        if (sprizc.cfr_renamed_9("\\nkovX\u007fh\u007fUm[\u007fqs}]sln{\u007fjyz").equals(arg0)) {
            return 128;
        }
        if (sprxra.cfr_renamed_9(":p\rq\u0010F\u0019v\u0019F\u0017L\u0017v,p\u0019l\u000bd\u0017p\u0015").equals(arg0)) {
            return 256;
        }
        throw new IllegalArgumentException(sprizc.cfr_renamed_9("Krurqkp<[qxLrim^limtZ}j}Xp\u007f{m<p}sy0"));
    }

    public static int cfr_renamed_12046(Set<String> arg0) {
        Iterator<String> iterator;
        int n = 0;
        Iterator<String> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            String string = iterator.next();
            n |= sprjno.cfr_renamed_5644(string);
            iterator2 = iterator;
        }
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprxra.cfr_renamed_9("L\u0017l\u001d");
            }
            case 1: {
                return sprizc.cfr_renamed_9("\\nkovX\u007fh\u007fL\u007fhv");
            }
            case 2: {
                return sprxra.cfr_renamed_9("@\nw\u000bj<c\fc,p\u0019l\u000bd\u0017p\u0015");
            }
            case 4: {
                return sprizc.cfr_renamed_9("\\nkovX\u007fh\u007fLlymyj_qpqnm");
            }
            case 8: {
                return sprxra.cfr_renamed_9("@\nw\u000bj<c\fc:n\u001dl\u001cD\u0019a\fm\nq0");
            }
            case 16: {
                return sprizc.cfr_renamed_9("^limtZ}j}\\p{rzZ\u007f\u007fjsloH");
            }
            case 64: {
                return sprxra.cfr_renamed_9("@\nw\u000bj<c\fc>m\u001bw\u000bQ\u001bc\u0014g\u000b");
            }
            case 128: {
                return sprizc.cfr_renamed_9("\\nkovX\u007fh\u007fUm[\u007fqs}]sln{\u007fjyz");
            }
            case 256: {
                return sprxra.cfr_renamed_9(":p\rq\u0010F\u0019v\u0019F\u0017L\u0017v,p\u0019l\u000bd\u0017p\u0015");
            }
        }
        return sprizc.cfr_renamed_9("Ipwpsir>YszNpko\\nkovX\u007fh\u007fZr}yo>j\u007fpky0");
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[9];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 4;
        nArray[4] = 8;
        nArray[5] = 16;
        nArray[6] = 64;
        nArray[7] = 128;
        nArray[8] = 256;
        return nArray;
    }

    public static Set<String> cfr_renamed_12047(int arg0) {
        HashSet<String> hashSet = new HashSet<String>();
        if ((0 & arg0) == 0) {
            hashSet.add(sprxra.cfr_renamed_9("L\u0017l\u001d"));
        }
        if ((1 & arg0) == 1) {
            hashSet.add(sprizc.cfr_renamed_9("\\nkovX\u007fh\u007fL\u007fhv"));
        }
        if ((2 & arg0) == 2) {
            hashSet.add(sprxra.cfr_renamed_9("@\nw\u000bj<c\fc,p\u0019l\u000bd\u0017p\u0015"));
        }
        if ((4 & arg0) == 4) {
            hashSet.add(sprizc.cfr_renamed_9("\\nkovX\u007fh\u007fLlymyj_qpqnm"));
        }
        if ((8 & arg0) == 8) {
            hashSet.add(sprxra.cfr_renamed_9("@\nw\u000bj<c\fc:n\u001dl\u001cD\u0019a\fm\nq0"));
        }
        if ((0x10 & arg0) == 16) {
            hashSet.add(sprizc.cfr_renamed_9("^limtZ}j}\\p{rzZ\u007f\u007fjsloH"));
        }
        if ((0x40 & arg0) == 64) {
            hashSet.add(sprxra.cfr_renamed_9("@\nw\u000bj<c\fc>m\u001bw\u000bQ\u001bc\u0014g\u000b"));
        }
        if ((0x80 & arg0) == 128) {
            hashSet.add(sprizc.cfr_renamed_9("\\nkovX\u007fh\u007fUm[\u007fqs}]sln{\u007fjyz"));
        }
        if ((0x100 & arg0) == 256) {
            hashSet.add(sprxra.cfr_renamed_9(":p\rq\u0010F\u0019v\u0019F\u0017L\u0017v,p\u0019l\u000bd\u0017p\u0015"));
        }
        return hashSet;
    }

    private /* synthetic */ sprjno() {
    }
}

