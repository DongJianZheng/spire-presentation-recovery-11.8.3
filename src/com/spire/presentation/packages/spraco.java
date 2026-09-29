/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcop;
import com.spire.presentation.packages.sprebp;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.spridfa;
import com.spire.presentation.packages.sprnmp;
import com.spire.presentation.packages.sproco;
import com.spire.presentation.packages.sprpko;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprqsn;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprsfo;
import com.spire.presentation.packages.sprsfp;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtiz;
import com.spire.presentation.packages.sprvio;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprxsp;
import com.spire.presentation.packages.spryzn;
import com.spire.presentation.packages.sprznp;
import java.util.Iterator;

@sprtea
public class spraco {
    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static String cfr_renamed_13155(int arg0) {
        switch (arg0) {
            case 0: {
                return sprtiz.cfr_renamed_9("5\u001b\u0012\u0003");
            }
            case 2: {
                return spridfa.cfr_renamed_9("E\u0018b\u0019s");
            }
            case 3: {
                return sprtiz.cfr_renamed_9("'\u0005\u001a\u0016\u001d\u0010\u001f\u0012");
            }
        }
        return spridfa.cfr_renamed_9("$f\u0002v\u0005r");
    }

    @sprtea
    public static sprvio cfr_renamed_15137(float[] arg0) {
        int n;
        String string = "";
        int n2 = n = 0;
        while (n2 < arg0.length) {
            string = sprraia.cfr_renamed_15138(string, Float.valueOf(spraco.cfr_renamed_15139(arg0[n])));
            if (n < arg0.length - 1) {
                string = sprraia.cfr_renamed_11961(string, " ");
            }
            n2 = ++n;
        }
        return sprvio.cfr_renamed_141(string);
    }

    public static boolean cfr_renamed_1110(byte[] arg0, byte[] arg1) {
        int n;
        if (arg0 == null || arg1 == null) {
            return false;
        }
        if (arg0.length != arg1.length) {
            return false;
        }
        int n2 = n = 0;
        while (n2 < arg0.length) {
            if ((arg0[n] & 0xFF & (arg1[n] & 0xFF)) == 0) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    @sprtea
    public static sprvio cfr_renamed_15140(float[] arg0, float arg1) {
        int n;
        String string = "";
        int n2 = n = 0;
        while (n2 < arg0.length) {
            string = sprraia.cfr_renamed_15138(string, Float.valueOf(spraco.cfr_renamed_15139(arg0[n] * arg1)));
            if (n < arg0.length - 1) {
                string = sprraia.cfr_renamed_11961(string, " ");
            }
            n2 = ++n;
        }
        return sprvio.cfr_renamed_141(string);
    }

    private static /* synthetic */ boolean cfr_renamed_12419(String arg0) {
        if (!sprznp.cfr_renamed_12328(arg0)) {
            return false;
        }
        Iterator iterator = new sprcop(arg0).iterator();
        while (iterator.hasNext()) {
            if (spraco.cfr_renamed_12420((Integer)iterator.next())) continue;
            return true;
        }
        return false;
    }

    @sprtea
    public static float cfr_renamed_15139(float arg0) {
        return (float)sprnmp.cfr_renamed_15019(arg0);
    }

    @sprtea
    public static sprsfo cfr_renamed_15141(sprsuja arg0) {
        return new sprsfo(spraco.cfr_renamed_15139(arg0.cfr_renamed_1980()), spraco.cfr_renamed_15139(arg0.spr\u3181()));
    }

    private static /* synthetic */ boolean cfr_renamed_12420(int arg0) {
        return arg0 == 9 || arg0 == 10 || arg0 == 13 || arg0 >= 32 && arg0 <= 55295 || arg0 >= 57344 && arg0 <= 65533 || arg0 >= 65536 && arg0 <= 0x10FFFF;
    }

    @sprtea
    public static sprqsn cfr_renamed_15142(sprwbp arg0) {
        return sprqsn.cfr_renamed_15143(arg0.cfr_renamed_3353() & 0xFF, arg0.cfr_renamed_1145() & 0xFF, arg0.cfr_renamed_1997() & 0xFF).cfr_renamed_15144(arg0.cfr_renamed_1778() & 0xFF);
    }

    @sprtea
    public static sproco cfr_renamed_13150(int arg0) {
        switch (arg0) {
            case 0: 
            case 16: 
            case 19: 
            case 20: 
            case 240: 
            case 255: {
                while (false) {
                }
                sproco sproco2 = sproco.cfr_renamed_1;
                return sproco2;
            }
            case 2: 
            case 18: {
                sproco sproco3 = sproco.cfr_renamed_152;
                return sproco3;
            }
            case 1: 
            case 17: {
                sproco sproco4 = sproco.cfr_renamed_91;
                return sproco4;
            }
        }
        sproco sproco5 = sproco.cfr_renamed_91;
        return sproco5;
    }

    @sprtea
    public static spryzn cfr_renamed_13148(int arg0) {
        switch (arg0) {
            case 1: {
                spryzn spryzn2 = spryzn.cfr_renamed_119;
                return spryzn2;
            }
            case 0: 
            case 3: {
                while (false) {
                }
                spryzn spryzn3 = spryzn.cfr_renamed_112;
                return spryzn3;
            }
            case 2: {
                spryzn spryzn4 = spryzn.cfr_renamed_2;
                return spryzn4;
            }
        }
        spryzn spryzn5 = spryzn.cfr_renamed_119;
        return spryzn5;
    }

    public static boolean cfr_renamed_15145(byte[] arg0, byte[] arg1) {
        if (arg0 == null || arg1 == null) {
            return false;
        }
        if (arg0.length != arg1.length) {
            return false;
        }
        byte[] byArray = sprsfp.cfr_renamed_15146(arg0);
        byte[] byArray2 = sprsfp.cfr_renamed_15146(arg1);
        return spraco.cfr_renamed_1110(byArray, byArray2);
    }

    @sprtea
    public static sprpko cfr_renamed_15147(sprgeja arg0) {
        return new sprpko(spraco.cfr_renamed_15139(arg0.cfr_renamed_1980()), spraco.cfr_renamed_15139(arg0.spr\u3181()), spraco.cfr_renamed_15139(arg0.cfr_renamed_1942()), spraco.cfr_renamed_15139(arg0.cfr_renamed_1452()));
    }

    @sprtea
    public static sprvio cfr_renamed_15148(sprqgp arg0) {
        Object[] objectArray = new Object[6];
        objectArray[0] = sprebp.cfr_renamed_13295(arg0.cfr_renamed_12595());
        objectArray[1] = sprebp.cfr_renamed_13295(arg0.cfr_renamed_12596());
        objectArray[2] = sprebp.cfr_renamed_13295(arg0.cfr_renamed_12597());
        objectArray[3] = sprebp.cfr_renamed_13295(arg0.cfr_renamed_12598());
        objectArray[4] = Float.valueOf(spraco.cfr_renamed_15139(arg0.cfr_renamed_12599()));
        objectArray[5] = Float.valueOf(spraco.cfr_renamed_15139(arg0.cfr_renamed_12600()));
        return new sprvio(objectArray);
    }

    public static String cfr_renamed_12422(String arg0) {
        if (!spraco.cfr_renamed_12419(arg0)) {
            return arg0;
        }
        StringBuilder stringBuilder = new StringBuilder(2048);
        stringBuilder.setLength(0);
        Iterator iterator = new sprcop(arg0).iterator();
        while (iterator.hasNext()) {
            int n = (Integer)iterator.next();
            if (!spraco.cfr_renamed_12420(n)) continue;
            sprghha.cfr_renamed_12279(stringBuilder, sprxsp.cfr_renamed_12396(n));
        }
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static String cfr_renamed_13294(int arg0) {
        switch (arg0) {
            case 4: {
                return sprtiz.cfr_renamed_9("=\u0018\u001d\u0012");
            }
            case 0: {
                return spridfa.cfr_renamed_9("#~\u001br");
            }
            case 1: {
                return sprtiz.cfr_renamed_9("1\u001f\u001e\u0003/");
            }
            case 2: {
                return spridfa.cfr_renamed_9("Q\u001b~\u0007N");
            }
            case 3: {
                return sprtiz.cfr_renamed_9("5\u001b\u001a\u0007+.");
            }
        }
        return spridfa.cfr_renamed_9("9x\u0019r");
    }
}

