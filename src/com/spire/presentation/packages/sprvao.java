/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpefa;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprzyaa;

@sprtea
public final class sprvao {
    public static final byte cfr_renamed_152 = 5;
    public static final byte cfr_renamed_112 = 4;
    public static final byte cfr_renamed_119 = 0;
    public static final byte cfr_renamed_91 = 6;
    public static final byte cfr_renamed_0 = 2;
    public static final byte cfr_renamed_1 = 1;
    public static final byte cfr_renamed_2 = 3;
    public static final int cfr_renamed_3 = 8;
    public static final byte cfr_renamed_4 = 7;

    public static byte[] cfr_renamed_205() {
        byte[] byArray = new byte[8];
        byArray[0] = 0;
        byArray[1] = 1;
        byArray[2] = 2;
        byArray[3] = 3;
        byArray[4] = 4;
        byArray[5] = 5;
        byArray[6] = 6;
        byArray[7] = 7;
        return byArray;
    }

    private /* synthetic */ sprvao() {
    }

    public static byte cfr_renamed_5644(String arg0) {
        if (sprzyaa.cfr_renamed_9("l\u001fN\u001b]\u0016\\)G\u000fZ\u0019M").equals(arg0)) {
            return 0;
        }
        if (sprpefa.cfr_renamed_9("\u0015\u0012 \b\u0007\u00028\u00027\u0013").equals(arg0)) {
            return 1;
        }
        if (sprzyaa.cfr_renamed_9("7I\u0014]\u001bD<M\u001fL").equals(arg0)) {
            return 2;
        }
        if (sprpefa.cfr_renamed_9("\u0019\u00128\u0013=7!\u0015$\b'\u0002\u0000\u00155\u001e").equals(arg0)) {
            return 3;
        }
        if (sprzyaa.cfr_renamed_9("}\nX\u001fZ9I\t[\u001f\\\u000eM").equals(arg0)) {
            return 4;
        }
        if (sprpefa.cfr_renamed_9("+;\u00101\u0015\u0017\u0006'\u00141\u0013 \u0002").equals(arg0)) {
            return 5;
        }
        if (sprzyaa.cfr_renamed_9("?F\fM\u0016G\nM.Z\u001bQ").equals(arg0)) {
            return 6;
        }
        if (sprpefa.cfr_renamed_9("3<\u000e&\u0003\u0017\u0006'\u00141\u0013 \u0002").equals(arg0)) {
            return 7;
        }
        throw new IllegalArgumentException(sprzyaa.cfr_renamed_9("}\u0014C\u0014G\rFZe\u001fL\u0013I)G\u000fZ\u0019MZF\u001bE\u001f\u0006"));
    }

    public static String cfr_renamed_12049(byte arg0) {
        if (0 == arg0) {
            return sprpefa.cfr_renamed_9("#1\u00015\u00128\u0013\u0007\b!\u00157\u0002");
        }
        if (1 == arg0) {
            return sprzyaa.cfr_renamed_9(";]\u000eG)M\u0016M\u0019\\");
        }
        if (2 == arg0) {
            return sprpefa.cfr_renamed_9("\u0019\u0006:\u00125\u000b\u0012\u00021\u0003");
        }
        if (3 == arg0) {
            return sprzyaa.cfr_renamed_9("7]\u0016\\\u0013x\u000fZ\nG\tM.Z\u001bQ");
        }
        if (4 == arg0) {
            return sprpefa.cfr_renamed_9("2$\u00171\u0015\u0017\u0006'\u00141\u0013 \u0002");
        }
        if (5 == arg0) {
            return sprzyaa.cfr_renamed_9("d\u0015_\u001fZ9I\t[\u001f\\\u000eM");
        }
        if (6 == arg0) {
            return sprpefa.cfr_renamed_9("\u0011\t\"\u00028\b$\u0002\u0000\u00155\u001e");
        }
        if (7 == arg0) {
            return sprzyaa.cfr_renamed_9("|\u0012A\bL9I\t[\u001f\\\u000eM");
        }
        return sprpefa.cfr_renamed_9("\u0001\t?\t;\u0010:G\u0019\u00020\u000e54;\u0012&\u00041G\"\u00068\u00121I");
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (3 << 2 ^ 3);
        int cfr_ignored_0 = 4 << 4;
        int n4 = n2;
        int n5 = 5 << 3;
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

    public static String cfr_renamed_12048(byte arg0) {
        if (0 == arg0) {
            return sprzyaa.cfr_renamed_9("l\u001fN\u001b]\u0016\\)G\u000fZ\u0019M");
        }
        if (1 == arg0) {
            return sprpefa.cfr_renamed_9("\u0015\u0012 \b\u0007\u00028\u00027\u0013");
        }
        if (2 == arg0) {
            return sprzyaa.cfr_renamed_9("7I\u0014]\u001bD<M\u001fL");
        }
        if (3 == arg0) {
            return sprpefa.cfr_renamed_9("\u0019\u00128\u0013=7!\u0015$\b'\u0002\u0000\u00155\u001e");
        }
        if (4 == arg0) {
            return sprzyaa.cfr_renamed_9("}\nX\u001fZ9I\t[\u001f\\\u000eM");
        }
        if (5 == arg0) {
            return sprpefa.cfr_renamed_9("+;\u00101\u0015\u0017\u0006'\u00141\u0013 \u0002");
        }
        if (6 == arg0) {
            return sprzyaa.cfr_renamed_9("?F\fM\u0016G\nM.Z\u001bQ");
        }
        if (7 == arg0) {
            return sprpefa.cfr_renamed_9("3<\u000e&\u0003\u0017\u0006'\u00141\u0013 \u0002");
        }
        return sprzyaa.cfr_renamed_9("/F\u0011F\u0015_\u0014\b7M\u001eA\u001b{\u0015]\bK\u001f\b\fI\u0016]\u001f\u0006");
    }
}

