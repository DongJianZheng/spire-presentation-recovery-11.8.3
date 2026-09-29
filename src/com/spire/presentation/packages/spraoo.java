/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprabi;
import com.spire.presentation.packages.sprnac;
import com.spire.presentation.packages.sprtea;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@sprtea
public final class spraoo {
    public static final int cfr_renamed_79 = 16;
    public static final int cfr_renamed_107 = 64;
    public static final int cfr_renamed_132 = 32;
    public static final int cfr_renamed_102 = 4096;
    public static final int cfr_renamed_93 = 2;
    public static final int cfr_renamed_86 = 2048;
    public static final int cfr_renamed_152 = 1;
    public static final int cfr_renamed_112 = 8;
    public static final int cfr_renamed_119 = 1024;
    public static final int cfr_renamed_91 = 14;
    public static final int cfr_renamed_0 = 0;
    public static final int cfr_renamed_1 = 128;
    public static final int cfr_renamed_2 = 4;
    public static final int cfr_renamed_3 = 256;
    public static final int cfr_renamed_4 = 512;

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_5544(int arg0) {
        switch (arg0) {
            case 0: {
                return sprnac.cfr_renamed_9("H\u001eh\u0014");
            }
            case 1: {
                return sprabi.cfr_renamed_9("r\u0018L9C\tC)P\u001cL\u000eD\u0012P\u0010");
            }
            case 2: {
                return sprnac.cfr_renamed_9("!c\u001fB\u0010r\u0010U\u0005g\u0003r2g\u0001");
            }
            case 4: {
                return sprabi.cfr_renamed_9("-G\u0013f\u001cV\u001cg\u0013F>C\r");
            }
            case 8: {
                return sprnac.cfr_renamed_9("!c\u001fB\u0010r\u0010L\u001eo\u001f");
            }
            case 16: {
                return sprabi.cfr_renamed_9("-G\u0013f\u001cV\u001co\u0014V\u0018P1K\u0010K\t");
            }
            case 32: {
                return sprnac.cfr_renamed_9("V\u0014h5g\u0005g=o\u001fc\"r\bj\u0014");
            }
            case 64: {
                return sprabi.cfr_renamed_9("r\u0018L9C\tC9C\u000eJ\u0018F1K\u0013G>C\r");
            }
            case 128: {
                return sprnac.cfr_renamed_9("!c\u001fB\u0010r\u0010B\u0010u\u0019c\u0015J\u0018h\u0014I\u0017`\u0002c\u0005");
            }
            case 256: {
                return sprabi.cfr_renamed_9("-G\u0013f\u001cV\u001cf\u001cQ\u0015G\u0019n\u0014L\u0018");
            }
            case 512: {
                return sprnac.cfr_renamed_9("V\u0014h5g\u0005g?i\u001fE\u0014h\u0005c\u0003");
            }
            case 1024: {
                return sprabi.cfr_renamed_9("-G\u0013f\u001cV\u001ca\u0012O\rM\bL\u0019n\u0014L\u0018");
            }
            case 2048: {
                return sprnac.cfr_renamed_9("!c\u001fB\u0010r\u0010E\u0004u\u0005i\u001cU\u0005g\u0003r2g\u0001");
            }
            case 4096: {
                return sprabi.cfr_renamed_9("-G\u0013f\u001cV\u001ca\bQ\tM\u0010g\u0013F>C\r");
            }
        }
        return sprnac.cfr_renamed_9("S\u001fm\u001fi\u0006hQC\u001c`!j\u0004u!c\u001fB\u0010r\u0010@\u001dg\u0016uQp\u0010j\u0004c_");
    }

    public static int cfr_renamed_12046(Set<String> arg0) {
        Iterator<String> iterator;
        int n = 0;
        Iterator<String> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            String string = iterator.next();
            n |= spraoo.cfr_renamed_5644(string);
            iterator2 = iterator;
        }
        return n;
    }

    private /* synthetic */ spraoo() {
    }

    public static int[] cfr_renamed_205() {
        int[] nArray = new int[14];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 4;
        nArray[4] = 8;
        nArray[5] = 16;
        nArray[6] = 32;
        nArray[7] = 64;
        nArray[8] = 128;
        nArray[9] = 256;
        nArray[10] = 512;
        nArray[11] = 1024;
        nArray[12] = 2048;
        nArray[13] = 4096;
        return nArray;
    }

    public static Set<String> cfr_renamed_12047(int arg0) {
        HashSet<String> hashSet = new HashSet<String>();
        if ((0 & arg0) == 0) {
            hashSet.add(sprabi.cfr_renamed_9("l\u0012L\u0018"));
        }
        if ((1 & arg0) == 1) {
            hashSet.add(sprnac.cfr_renamed_9("V\u0014h5g\u0005g%t\u0010h\u0002`\u001et\u001c"));
        }
        if ((2 & arg0) == 2) {
            hashSet.add(sprabi.cfr_renamed_9("-G\u0013f\u001cV\u001cq\tC\u000fV>C\r"));
        }
        if ((4 & arg0) == 4) {
            hashSet.add(sprnac.cfr_renamed_9("!c\u001fB\u0010r\u0010C\u001fb2g\u0001"));
        }
        if ((8 & arg0) == 8) {
            hashSet.add(sprabi.cfr_renamed_9("-G\u0013f\u001cV\u001ch\u0012K\u0013"));
        }
        if ((0x10 & arg0) == 16) {
            hashSet.add(sprnac.cfr_renamed_9("!c\u001fB\u0010r\u0010K\u0018r\u0014t=o\u001co\u0005"));
        }
        if ((0x20 & arg0) == 32) {
            hashSet.add(sprabi.cfr_renamed_9("r\u0018L9C\tC1K\u0013G.V\u0004N\u0018"));
        }
        if ((0x40 & arg0) == 64) {
            hashSet.add(sprnac.cfr_renamed_9("V\u0014h5g\u0005g5g\u0002n\u0014b=o\u001fc2g\u0001"));
        }
        if ((0x80 & arg0) == 128) {
            hashSet.add(sprabi.cfr_renamed_9("-G\u0013f\u001cV\u001cf\u001cQ\u0015G\u0019n\u0014L\u0018m\u001bD\u000eG\t"));
        }
        if ((0x100 & arg0) == 256) {
            hashSet.add(sprnac.cfr_renamed_9("!c\u001fB\u0010r\u0010B\u0010u\u0019c\u0015J\u0018h\u0014"));
        }
        if ((0x200 & arg0) == 512) {
            hashSet.add(sprabi.cfr_renamed_9("r\u0018L9C\tC3M\u0013a\u0018L\tG\u000f"));
        }
        if ((0x400 & arg0) == 1024) {
            hashSet.add(sprnac.cfr_renamed_9("!c\u001fB\u0010r\u0010E\u001ek\u0001i\u0004h\u0015J\u0018h\u0014"));
        }
        if ((0x800 & arg0) == 2048) {
            hashSet.add(sprabi.cfr_renamed_9("-G\u0013f\u001cV\u001ca\bQ\tM\u0010q\tC\u000fV>C\r"));
        }
        if ((0x1000 & arg0) == 4096) {
            hashSet.add(sprnac.cfr_renamed_9("!c\u001fB\u0010r\u0010E\u0004u\u0005i\u001cC\u001fb2g\u0001"));
        }
        return hashSet;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_957(int arg0) {
        switch (arg0) {
            case 0: {
                return sprabi.cfr_renamed_9("l\u0012L\u0018");
            }
            case 1: {
                return sprnac.cfr_renamed_9("V\u0014h5g\u0005g%t\u0010h\u0002`\u001et\u001c");
            }
            case 2: {
                return sprabi.cfr_renamed_9("-G\u0013f\u001cV\u001cq\tC\u000fV>C\r");
            }
            case 4: {
                return sprnac.cfr_renamed_9("!c\u001fB\u0010r\u0010C\u001fb2g\u0001");
            }
            case 8: {
                return sprabi.cfr_renamed_9("-G\u0013f\u001cV\u001ch\u0012K\u0013");
            }
            case 16: {
                return sprnac.cfr_renamed_9("!c\u001fB\u0010r\u0010K\u0018r\u0014t=o\u001co\u0005");
            }
            case 32: {
                return sprabi.cfr_renamed_9("r\u0018L9C\tC1K\u0013G.V\u0004N\u0018");
            }
            case 64: {
                return sprnac.cfr_renamed_9("V\u0014h5g\u0005g5g\u0002n\u0014b=o\u001fc2g\u0001");
            }
            case 128: {
                return sprabi.cfr_renamed_9("-G\u0013f\u001cV\u001cf\u001cQ\u0015G\u0019n\u0014L\u0018m\u001bD\u000eG\t");
            }
            case 256: {
                return sprnac.cfr_renamed_9("!c\u001fB\u0010r\u0010B\u0010u\u0019c\u0015J\u0018h\u0014");
            }
            case 512: {
                return sprabi.cfr_renamed_9("r\u0018L9C\tC3M\u0013a\u0018L\tG\u000f");
            }
            case 1024: {
                return sprnac.cfr_renamed_9("!c\u001fB\u0010r\u0010E\u001ek\u0001i\u0004h\u0015J\u0018h\u0014");
            }
            case 2048: {
                return sprabi.cfr_renamed_9("-G\u0013f\u001cV\u001ca\bQ\tM\u0010q\tC\u000fV>C\r");
            }
            case 4096: {
                return sprnac.cfr_renamed_9("!c\u001fB\u0010r\u0010E\u0004u\u0005i\u001cC\u001fb2g\u0001");
            }
        }
        return sprabi.cfr_renamed_9("w\u0013I\u0013M\nL]g\u0010D-N\bQ-G\u0013f\u001cV\u001cd\u0011C\u001aQ]T\u001cN\bGS");
    }

    public static int cfr_renamed_5644(String arg0) {
        if (sprnac.cfr_renamed_9("H\u001eh\u0014").equals(arg0)) {
            return 0;
        }
        if (sprabi.cfr_renamed_9("r\u0018L9C\tC)P\u001cL\u000eD\u0012P\u0010").equals(arg0)) {
            return 1;
        }
        if (sprnac.cfr_renamed_9("!c\u001fB\u0010r\u0010U\u0005g\u0003r2g\u0001").equals(arg0)) {
            return 2;
        }
        if (sprabi.cfr_renamed_9("-G\u0013f\u001cV\u001cg\u0013F>C\r").equals(arg0)) {
            return 4;
        }
        if (sprnac.cfr_renamed_9("!c\u001fB\u0010r\u0010L\u001eo\u001f").equals(arg0)) {
            return 8;
        }
        if (sprabi.cfr_renamed_9("-G\u0013f\u001cV\u001co\u0014V\u0018P1K\u0010K\t").equals(arg0)) {
            return 16;
        }
        if (sprnac.cfr_renamed_9("V\u0014h5g\u0005g=o\u001fc\"r\bj\u0014").equals(arg0)) {
            return 32;
        }
        if (sprabi.cfr_renamed_9("r\u0018L9C\tC9C\u000eJ\u0018F1K\u0013G>C\r").equals(arg0)) {
            return 64;
        }
        if (sprnac.cfr_renamed_9("!c\u001fB\u0010r\u0010B\u0010u\u0019c\u0015J\u0018h\u0014I\u0017`\u0002c\u0005").equals(arg0)) {
            return 128;
        }
        if (sprabi.cfr_renamed_9("-G\u0013f\u001cV\u001cf\u001cQ\u0015G\u0019n\u0014L\u0018").equals(arg0)) {
            return 256;
        }
        if (sprnac.cfr_renamed_9("V\u0014h5g\u0005g?i\u001fE\u0014h\u0005c\u0003").equals(arg0)) {
            return 512;
        }
        if (sprabi.cfr_renamed_9("-G\u0013f\u001cV\u001ca\u0012O\rM\bL\u0019n\u0014L\u0018").equals(arg0)) {
            return 1024;
        }
        if (sprnac.cfr_renamed_9("!c\u001fB\u0010r\u0010E\u0004u\u0005i\u001cU\u0005g\u0003r2g\u0001").equals(arg0)) {
            return 2048;
        }
        if (sprabi.cfr_renamed_9("-G\u0013f\u001cV\u001ca\bQ\tM\u0010g\u0013F>C\r").equals(arg0)) {
            return 4096;
        }
        throw new IllegalArgumentException(sprnac.cfr_renamed_9("$h\u001ah\u001eq\u001f&4k\u0017V\u001ds\u0002V\u0014h5g\u0005g7j\u0010a\u0002&\u001fg\u001cc_"));
    }
}

