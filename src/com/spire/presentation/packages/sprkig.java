/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprael;
import com.spire.presentation.packages.spragg;
import com.spire.presentation.packages.sprbwk;
import com.spire.presentation.packages.sprcah;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.spretk;
import com.spire.presentation.packages.sprgrk;
import com.spire.presentation.packages.sprhok;
import com.spire.presentation.packages.sprhqk;
import com.spire.presentation.packages.sprhxr;
import com.spire.presentation.packages.sprirk;
import com.spire.presentation.packages.sprkkl;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprkuh;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnrk;
import com.spire.presentation.packages.sprpzk;
import com.spire.presentation.packages.sprrqk;
import com.spire.presentation.packages.sprtll;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprujha;
import com.spire.presentation.packages.sprwil;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprxhl;
import com.spire.presentation.packages.sprxyk;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class sprkig {
    private static final Set cfr_renamed_2;
    private static final Set cfr_renamed_3;
    private static final Map cfr_renamed_4;

    private static /* synthetic */ sprtpk cfr_renamed_7526(char[] arg0, int arg1, byte[] arg2, boolean arg3) throws spragg {
        sprrqk sprrqk2;
        sprrqk sprrqk3 = sprrqk2 = new sprrqk();
        sprrqk3.cfr_renamed_1515(sprkuh.cfr_renamed_1606(arg0), arg2, 1);
        sprtpk sprtpk2 = (sprtpk)((sprkuh)sprrqk3).cfr_renamed_249(arg1 * 8);
        if (arg3 && sprtpk2.cfr_renamed_1521().length == 24) {
            byte[] byArray = sprtpk2.cfr_renamed_1521();
            System.arraycopy(byArray, 0, byArray, 16, 8);
            return new sprtpk(byArray);
        }
        return sprtpk2;
    }

    public static sprtpk cfr_renamed_1605(String arg0, char[] arg1, byte[] arg2, int arg3) {
        sprnrk sprnrk2;
        sprnrk sprnrk3 = sprnrk2 = new sprnrk(new sprwil());
        sprnrk3.cfr_renamed_1515(sprkuh.cfr_renamed_1606(arg1), arg2, arg3);
        return (sprtpk)((sprkuh)sprnrk3).cfr_renamed_249(sprkig.cfr_renamed_1595(arg0));
    }

    private static /* synthetic */ sprtpk cfr_renamed_7527(char[] arg0, int arg1, byte[] arg2) throws spragg {
        return sprkig.cfr_renamed_7526(arg0, arg1, arg2, false);
    }

    public static boolean cfr_renamed_7379(sprlem arg0) {
        return arg0.cfr_renamed_19().startsWith(sprdl.cfr_renamed_2920.cfr_renamed_19());
    }

    public static boolean cfr_renamed_7501(sprlem arg0) {
        return cfr_renamed_2.contains(arg0);
    }

    public static boolean cfr_renamed_7509(sprlem arg0) {
        return cfr_renamed_3.contains(arg0);
    }

    static {
        cfr_renamed_4 = new HashMap();
        cfr_renamed_2 = new HashSet();
        cfr_renamed_3 = new HashSet();
        cfr_renamed_2.add(sprdl.cfr_renamed_93);
        cfr_renamed_2.add(sprdl.cfr_renamed_1521);
        cfr_renamed_2.add(sprdl.cfr_renamed_1452);
        cfr_renamed_2.add(sprdl.cfr_renamed_0);
        cfr_renamed_2.add(sprdl.cfr_renamed_1397);
        cfr_renamed_2.add(sprdl.cfr_renamed_133);
        cfr_renamed_3.add(sprdl.cfr_renamed_112);
        cfr_renamed_3.add(sprdl.cfr_renamed_2797);
        cfr_renamed_3.add(sprwr.cfr_renamed_88);
        cfr_renamed_3.add(sprwr.cfr_renamed_1223);
        cfr_renamed_3.add(sprwr.cfr_renamed_724);
        cfr_renamed_4.put(sprdl.cfr_renamed_2797.cfr_renamed_19(), spruaf.cfr_renamed_279(192));
        cfr_renamed_4.put(sprwr.cfr_renamed_88.cfr_renamed_19(), spruaf.cfr_renamed_279(128));
        cfr_renamed_4.put(sprwr.cfr_renamed_1223.cfr_renamed_19(), spruaf.cfr_renamed_279(192));
        cfr_renamed_4.put(sprwr.cfr_renamed_724.cfr_renamed_19(), spruaf.cfr_renamed_279(256));
        cfr_renamed_4.put(sprdl.cfr_renamed_272.cfr_renamed_19(), spruaf.cfr_renamed_279(128));
        cfr_renamed_4.put(sprdl.cfr_renamed_1454, spruaf.cfr_renamed_279(40));
        cfr_renamed_4.put(sprdl.cfr_renamed_805, spruaf.cfr_renamed_279(128));
        cfr_renamed_4.put(sprdl.cfr_renamed_954, spruaf.cfr_renamed_279(192));
        cfr_renamed_4.put(sprdl.cfr_renamed_1260, spruaf.cfr_renamed_279(128));
        cfr_renamed_4.put(sprdl.cfr_renamed_2, spruaf.cfr_renamed_279(40));
    }

    /*
     * Unable to fully structure code
     */
    public static byte[] cfr_renamed_7528(boolean arg0, byte[] arg1, char[] arg2, String arg3, byte[] arg4) throws spragg {
        block32: {
            block31: {
                var5_5 = arg4;
                var6_6 = sprhxr.cfr_renamed_9("#3#");
                var8_7 = new sprxyk();
                if (arg3.endsWith(sprujha.cfr_renamed_9("|U\u0017T"))) {
                    var6_6 = sprhxr.cfr_renamed_9("#7\"");
                    var8_7 = null;
                }
                if (arg3.endsWith(sprujha.cfr_renamed_9("|S\u0012T")) || sprhxr.cfr_renamed_9("$43\\%5%").equals(arg3) || sprujha.cfr_renamed_9("\u0015S\u0002;\u0014R\u0014%").equals(arg3)) {
                    var6_6 = sprhxr.cfr_renamed_9("%2\"");
                    var5_5 = null;
                }
                if (arg3.endsWith(sprujha.cfr_renamed_9("|Y\u0017T"))) {
                    var6_6 = sprhxr.cfr_renamed_9("/7\"");
                    var8_7 = null;
                }
                if (arg3.startsWith(sprujha.cfr_renamed_9("R\u0014E|S\u0015S"))) {
                    var10_8 = arg3.startsWith(sprhxr.cfr_renamed_9("5%\"M4$4S")) == false;
                    var9_13 = sprkig.cfr_renamed_7526(arg2, 24, arg4, var10_8);
                    var7_14 = new sprxhl();
                    v0 = var6_6;
                } else if (arg3.startsWith(sprujha.cfr_renamed_9("\u0015S\u0002;"))) {
                    var9_13 = sprkig.cfr_renamed_7527(arg2, 8, arg4);
                    var7_14 = new sprtll();
                    v0 = var6_6;
                } else if (arg3.startsWith(sprhxr.cfr_renamed_9("\"7M"))) {
                    var9_13 = sprkig.cfr_renamed_7527(arg2, 16, arg4);
                    var7_14 = new sprkkl();
                    v0 = var6_6;
                } else if (arg3.startsWith(sprujha.cfr_renamed_9("\u0003Uc;"))) {
                    var10_9 = 128;
                    if (arg3.startsWith(sprhxr.cfr_renamed_9("22R\\TAM"))) {
                        var10_9 = 40;
                    } else if (arg3.startsWith(sprujha.cfr_renamed_9("D\u0012$| e;"))) {
                        var10_9 = 64;
                    }
                    var9_13 = new sprhok(sprkig.cfr_renamed_7527(arg2, var10_9 / 8, arg4).cfr_renamed_1521(), var10_9);
                    var7_14 = new sprpzk();
                    v0 = var6_6;
                } else if (arg3.startsWith(sprhxr.cfr_renamed_9("0%\"M"))) {
                    var10_10 = arg4;
                    if (arg4.length > 8) {
                        var10_10 = new byte[8];
                        System.arraycopy(arg4, 0, var10_10, 0, 8);
                    }
                    if (arg3.startsWith(sprujha.cfr_renamed_9("\u0010S\u0002;`$i;"))) {
                        var11_15 = 128;
                        v1 = arg2;
                    } else if (arg3.startsWith(sprhxr.cfr_renamed_9("0%\"M@YCM"))) {
                        var11_15 = 192;
                        v1 = arg2;
                    } else if (arg3.startsWith(sprujha.cfr_renamed_9("\u0010S\u0002;c#g;"))) {
                        var11_15 = 256;
                        v1 = arg2;
                    } else {
                        throw new sprcah(new StringBuilder().insert(0, sprhxr.cfr_renamed_9("\u0015\u001f\u000b\u001f\u000f\u0006\u000eQ!43Q\u0005\u001f\u0003\u0003\u0019\u0001\u0014\u0018\u000f\u001f@\u0006\t\u0005\bQ\u0010\u0003\t\u0007\u0001\u0005\u0005Q\u000b\u0014\u0019K@")).append(arg3).toString());
                    }
                    var9_13 = sprkig.cfr_renamed_7527(v1, var11_15 / 8, var10_10);
                    var7_14 = sprael.cfr_renamed_7529();
                    v0 = var6_6;
                } else {
                    throw new sprcah(new StringBuilder().insert(0, sprujha.cfr_renamed_9("c?}?y&xqs?u#o!b8y?6&\u007f%~qf#\u007f'w%sq}4ok6")).append(arg3).toString());
                }
                if (!v0.equals(sprhxr.cfr_renamed_9("#3#"))) break block31;
                var7_14 = sprhqk.cfr_renamed_7530(var7_14);
                v2 = var8_7;
                ** GOTO lbl81
            }
            if (!var6_6.equals(sprujha.cfr_renamed_9("U\u0017T"))) break block32;
            v3 = var7_14;
            var7_14 = spretk.cfr_renamed_7531(v3, v3.cfr_renamed_1195() * 8);
            v2 = var8_7;
            ** GOTO lbl81
        }
        if (var6_6.equals(sprhxr.cfr_renamed_9("/7\""))) {
            v4 = var7_14;
            var7_14 = new sprbwk(v4, v4.cfr_renamed_1195() * 8);
        }
        try {
            v2 = var8_7;
lbl81:
            // 3 sources

            if (v2 == null) {
                var10_11 = new sprirk(var7_14);
                v5 = var5_5;
            } else {
                var10_11 = new sprgrk(var7_14, var8_7);
                v5 = var5_5;
            }
            if (v5 == null) {
                v6 = var10_11;
                v7 = v6;
                v6.cfr_renamed_5535(arg0, var9_13);
            } else {
                v8 = var10_11;
                v7 = v8;
                v8.cfr_renamed_5535(arg0, new sprkpk(var9_13, var5_5));
            }
            var11_16 = new byte[v7.cfr_renamed_1202(arg1.length)];
            v9 = var12_17 = var10_11.cfr_renamed_505(arg1, 0, arg1.length, var11_16, 0);
            var12_17 = v9 + var10_11.cfr_renamed_1219(var11_16, v9);
            if (var12_17 == var11_16.length) {
                return var11_16;
            }
            var13_18 = new byte[var12_17];
            System.arraycopy(var11_16, 0, var13_18, 0, var12_17);
            return var13_18;
        }
        catch (Exception var10_12) {
            throw new sprcah(sprujha.cfr_renamed_9("4n2s!b8y?6$e8x662\u007f!~4dq;qf=s0e462~4u:6!w\"e&y#rqw?rqr0b08"), (Throwable)var10_12);
        }
    }

    public static int cfr_renamed_1595(String arg0) {
        if (!cfr_renamed_4.containsKey(arg0)) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprhxr.cfr_renamed_9("\u000e\u001e@\u001a\u0005\b@\u0002\t\u000b\u0005Q\u0006\u001e\u0012Q\u0001\u001d\u0007\u001e\u0012\u0018\u0014\u0019\rK@")).append(arg0).toString());
        }
        return (Integer)cfr_renamed_4.get(arg0);
    }
}

