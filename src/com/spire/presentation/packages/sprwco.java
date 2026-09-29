/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprubs;
import com.spire.presentation.packages.sprxjy;

@sprtea
public final class sprwco {
    public static final int cfr_renamed_2 = 2;
    public static final byte cfr_renamed_3 = 0;
    public static final byte cfr_renamed_4 = 1;

    public static String cfr_renamed_12048(byte arg0) {
        if (0 == arg0) {
            return sprubs.cfr_renamed_9(";B\u0006I\u0000E\u001d^");
        }
        if (1 == arg0) {
            return sprxjy.cfr_renamed_9("d\u0019U\u0004S\bN\u0013");
        }
        return sprubs.cfr_renamed_9("y\u001cG\u001cC\u0005BRo\u001eE\u0002~\u0017K\u001bC\u001c\f\u0004M\u001eY\u0017\u0002");
    }

    public static byte[] cfr_renamed_205() {
        byte[] byArray = new byte[2];
        byArray[0] = 0;
        byArray[1] = 1;
        return byArray;
    }

    private /* synthetic */ sprwco() {
    }

    public static String cfr_renamed_12049(byte arg0) {
        if (0 == arg0) {
            return sprxjy.cfr_renamed_9("h\u000fU\u0004S\bN\u0013");
        }
        if (1 == arg0) {
            return sprubs.cfr_renamed_9("7T\u0006I\u0000E\u001d^");
        }
        return sprxjy.cfr_renamed_9("4O\nO\u000eV\u000f\u0001\"M\bQ3D\u0006H\u000eOAW\u0000M\u0014DO");
    }

    public static byte cfr_renamed_5644(String arg0) {
        if (sprubs.cfr_renamed_9(";B\u0006I\u0000E\u001d^").equals(arg0)) {
            return 0;
        }
        if (sprxjy.cfr_renamed_9("d\u0019U\u0004S\bN\u0013").equals(arg0)) {
            return 1;
        }
        throw new IllegalArgumentException(sprubs.cfr_renamed_9("'B\u0019B\u001d[\u001c\f1@\u001b\\ I\u0015E\u001dBRB\u0013A\u0017\u0002"));
    }
}

