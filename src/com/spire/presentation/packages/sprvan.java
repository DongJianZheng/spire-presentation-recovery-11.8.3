/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprju;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprukq;
import com.spire.presentation.packages.spruwl;
import com.spire.presentation.packages.sprvxm;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;

public abstract class sprvan {
    public static String cfr_renamed_11184(sprnvm arg0) {
        return sprvan.cfr_renamed_11434(arg0.cfr_renamed_8120(), arg0.cfr_renamed_312());
    }

    public static sprco cfr_renamed_11332(sprju arg0, int arg1, boolean arg2, int arg3) throws IOException {
        return sprvan.cfr_renamed_11435(arg0, 128, arg1, arg2, arg3);
    }

    public static sprco cfr_renamed_11436(sprju arg0, int arg1, int arg2) throws IOException {
        if (!arg0.cfr_renamed_11239(arg1, arg2)) {
            return null;
        }
        return arg0.cfr_renamed_11270();
    }

    public static sprnvm cfr_renamed_11437(sprnvm arg0, int arg1) {
        return sprvan.cfr_renamed_11438(arg0, 128, arg1);
    }

    public static sprco cfr_renamed_11439(sprju arg0, int arg1, int arg2, boolean arg3, int arg4) throws IOException {
        if (!arg0.cfr_renamed_11239(arg1, arg2)) {
            return null;
        }
        return arg0.cfr_renamed_11266(arg3, arg4);
    }

    public static sprnvm cfr_renamed_11440(sprnvm arg0, int arg1, int arg2) {
        if (!arg0.cfr_renamed_11239(arg1, arg2)) {
            String string = sprvan.cfr_renamed_11434(arg1, arg2);
            String string2 = sprvan.cfr_renamed_11184(arg0);
            throw new IllegalStateException(new StringBuilder().insert(0, spruwl.cfr_renamed_9("d{QfBwDg\u0001")).append(string).append(sprukq.cfr_renamed_9("\u001bQZB\u001bGNQ\u001bCTPUA\u001b")).append(string2).toString());
        }
        return arg0;
    }

    public static sprju cfr_renamed_11441(sprju arg0, int arg1, int arg2, int arg3, int arg4) throws IOException {
        return sprvan.cfr_renamed_11442(arg0, arg1, arg2).cfr_renamed_11273(arg3, arg4);
    }

    public static sprco cfr_renamed_11333(sprju arg0, int arg1) throws IOException {
        return sprvan.cfr_renamed_11443(arg0, 128, arg1);
    }

    public static sprxgf cfr_renamed_11444(sprnvm arg0, int arg1, boolean arg2, int arg3) {
        return sprvan.cfr_renamed_11445(arg0, 128, arg1, arg2, arg3);
    }

    public static sprqqe cfr_renamed_11446(sprnvm arg0, int arg1) {
        return sprvan.cfr_renamed_11447(arg0, 128, arg1);
    }

    public static sprju cfr_renamed_11448(sprju arg0, int arg1, int arg2) throws IOException {
        if (!arg0.cfr_renamed_11239(arg1, arg2)) {
            return null;
        }
        return arg0.cfr_renamed_11271();
    }

    public static sprnvm cfr_renamed_11438(sprnvm arg0, int arg1, int arg2) {
        return sprvan.cfr_renamed_11440(arg0, arg1, arg2).cfr_renamed_11204();
    }

    public static sprju cfr_renamed_11449(sprju arg0, int arg1, int arg2, int arg3) throws IOException {
        return sprvan.cfr_renamed_9183(arg0, 128, arg1, arg2, arg3);
    }

    public static sprnvm cfr_renamed_11450(sprnvm arg0, int arg1, int arg2, int arg3) {
        return sprvan.cfr_renamed_11451(arg0, 128, arg1, arg2, arg3);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = 3 << 3 ^ 3;
        int n4 = n2;
        char c = '\u0001';
        while (n4 >= 0) {
            int n5 = n2--;
            cArray[n5] = (char)(s.charAt(n5) ^ c);
            if (n2 < 0) break;
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public static sprqqe cfr_renamed_11447(sprnvm arg0, int arg1, int arg2) {
        if (!arg0.cfr_renamed_11239(arg1, arg2)) {
            return null;
        }
        return arg0.cfr_renamed_8225();
    }

    public static sprqqe cfr_renamed_11452(sprnvm arg0, int arg1, int arg2) {
        return sprvan.cfr_renamed_11440(arg0, arg1, arg2).cfr_renamed_8225();
    }

    public static sprco cfr_renamed_11453(sprju arg0, int arg1) throws IOException {
        return sprvan.cfr_renamed_11436(arg0, 128, arg1);
    }

    public static sprju cfr_renamed_11454(sprju arg0, int arg1, int arg2) throws IOException {
        return sprvan.cfr_renamed_11442(arg0, arg1, arg2).cfr_renamed_11271();
    }

    public static sprju cfr_renamed_11442(sprju arg0, int arg1, int arg2) {
        if (!arg0.cfr_renamed_11239(arg1, arg2)) {
            String string = sprvan.cfr_renamed_11434(arg1, arg2);
            String string2 = sprvan.cfr_renamed_11455(arg0);
            throw new IllegalStateException(new StringBuilder().insert(0, spruwl.cfr_renamed_9("d{QfBwDg\u0001")).append(string).append(sprukq.cfr_renamed_9("\u001bQZB\u001bGNQ\u001bCTPUA\u001b")).append(string2).toString());
        }
        return arg0;
    }

    public static sprnvm cfr_renamed_11456(sprnvm arg0, int arg1) {
        return sprvan.cfr_renamed_11457(arg0, 128, arg1);
    }

    public static sprju cfr_renamed_11458(sprju arg0, int arg1) throws IOException {
        return sprvan.cfr_renamed_11448(arg0, 128, arg1);
    }

    public static sprnvm cfr_renamed_11459(sprnvm arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0.cfr_renamed_11239(arg1, arg2)) {
            return null;
        }
        return arg0.cfr_renamed_11460(arg3, arg4);
    }

    public static String cfr_renamed_11455(sprju arg0) {
        return sprvan.cfr_renamed_11434(arg0.cfr_renamed_8120(), arg0.cfr_renamed_312());
    }

    public static sprnvm cfr_renamed_11461(sprnvm arg0, int arg1, int arg2, int arg3) {
        return sprvan.cfr_renamed_11459(arg0, 128, arg1, arg2, arg3);
    }

    public static sprnvm cfr_renamed_11451(sprnvm arg0, int arg1, int arg2, int arg3, int arg4) {
        return sprvan.cfr_renamed_11440(arg0, arg1, arg2).cfr_renamed_11460(arg3, arg4);
    }

    public static sprxgf cfr_renamed_11169(sprnvm arg0, int arg1, int arg2, boolean arg3, int arg4) {
        return sprvan.cfr_renamed_11440(arg0, arg1, arg2).cfr_renamed_10766(arg3, arg4);
    }

    public static sprxgf cfr_renamed_11445(sprnvm arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (!arg0.cfr_renamed_11239(arg1, arg2)) {
            return null;
        }
        return arg0.cfr_renamed_10766(arg3, arg4);
    }

    public static sprnvm cfr_renamed_11457(sprnvm arg0, int arg1, int arg2) {
        if (!arg0.cfr_renamed_11239(arg1, arg2)) {
            return null;
        }
        return arg0.cfr_renamed_11204();
    }

    public static sprqqe cfr_renamed_11462(sprnvm arg0, int arg1) {
        return sprvan.cfr_renamed_11452(arg0, 128, arg1);
    }

    public static String cfr_renamed_11463(sprvxm arg0) {
        return sprvan.cfr_renamed_11434(arg0.cfr_renamed_8120(), arg0.cfr_renamed_11464());
    }

    public static String cfr_renamed_11434(int arg0, int arg1) {
        switch (arg0) {
            case 64: {
                return new StringBuilder().insert(0, spruwl.cfr_renamed_9("zBqSmJbBuJnM\u0001")).append(arg1).append("]").toString();
            }
            case 128: {
                return new StringBuilder().insert(0, sprukq.cfr_renamed_9("`ftko`cq\u001b")).append(arg1).append("]").toString();
            }
            case 192: {
                return new StringBuilder().insert(0, spruwl.cfr_renamed_9("zSsJwBuF\u0001")).append(arg1).append("]").toString();
            }
        }
        return new StringBuilder().insert(0, sprukq.cfr_renamed_9("`pulm`ivzi\u001b")).append(arg1).append("]").toString();
    }

    public static sprco cfr_renamed_11465(sprju arg0, int arg1, boolean arg2, int arg3) throws IOException {
        return sprvan.cfr_renamed_11439(arg0, 128, arg1, arg2, arg3);
    }

    public static sprxgf cfr_renamed_11466(sprnvm arg0, int arg1, boolean arg2, int arg3) {
        return sprvan.cfr_renamed_11169(arg0, 128, arg1, arg2, arg3);
    }

    public static sprco cfr_renamed_11443(sprju arg0, int arg1, int arg2) throws IOException {
        return sprvan.cfr_renamed_11442(arg0, arg1, arg2).cfr_renamed_11270();
    }

    public static sprju cfr_renamed_11467(sprju arg0, int arg1, int arg2, int arg3) throws IOException {
        return sprvan.cfr_renamed_11441(arg0, 128, arg1, arg2, arg3);
    }

    public static sprco cfr_renamed_11435(sprju arg0, int arg1, int arg2, boolean arg3, int arg4) throws IOException {
        return sprvan.cfr_renamed_11442(arg0, arg1, arg2).cfr_renamed_11266(arg3, arg4);
    }

    public static sprju cfr_renamed_9183(sprju arg0, int arg1, int arg2, int arg3, int arg4) throws IOException {
        if (!arg0.cfr_renamed_11239(arg1, arg2)) {
            return null;
        }
        return arg0.cfr_renamed_11273(arg3, arg4);
    }

    public static sprju cfr_renamed_11468(sprju arg0, int arg1) throws IOException {
        return sprvan.cfr_renamed_11454(arg0, 128, arg1);
    }
}

