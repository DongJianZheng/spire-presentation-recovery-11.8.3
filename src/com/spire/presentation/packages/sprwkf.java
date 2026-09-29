/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraof;
import com.spire.presentation.packages.sprbsf;
import com.spire.presentation.packages.sprdjf;
import com.spire.presentation.packages.sprhnf;
import com.spire.presentation.packages.sprjqf;
import com.spire.presentation.packages.sprknf;
import com.spire.presentation.packages.sprojf;
import com.spire.presentation.packages.sprqcs;
import com.spire.presentation.packages.sprrqf;
import com.spire.presentation.packages.sprvkf;
import com.spire.presentation.packages.sprxjf;
import com.spire.presentation.packages.sprzbs;

public class sprwkf {
    public static sprknf cfr_renamed_5731(spraof arg0, int arg1, byte[] arg2, sprbsf arg3, sprrqf arg4, int arg5) {
        int n;
        if (arg2.length != arg0.cfr_renamed_2110().cfr_renamed_5732()) {
            throw new IllegalArgumentException(sprqcs.cfr_renamed_9("Y\"P.\n$LkG.Y8K,O\u000fC,O8^kD.O/Yk^$\n)OkO:_*Fk^$\n8C1OkE-\n/C,O8^"));
        }
        if (arg3 == null) {
            throw new NullPointerException(sprzbs.cfr_renamed_9("7\u0018#\u001f%\u00051\u0003!QyLd\u001f1\u001d("));
        }
        if (arg4 == null) {
            throw new NullPointerException(sprqcs.cfr_renamed_9("$^8b*Y#k/N9O8Yk\u0017v\n%_'F"));
        }
        sprdjf sprdjf2 = (sprdjf)((sprhnf)((sprhnf)new sprhnf().cfr_renamed_5733(arg4.cfr_renamed_5734())).cfr_renamed_5735(arg4.cfr_renamed_5736())).cfr_renamed_5737(arg4.cfr_renamed_5738()).cfr_renamed_1451();
        sprjqf sprjqf2 = (sprjqf)((sprxjf)((sprxjf)new sprxjf().cfr_renamed_5733(arg4.cfr_renamed_5734())).cfr_renamed_5735(arg4.cfr_renamed_5736())).cfr_renamed_5739(arg4.cfr_renamed_5738()).cfr_renamed_1451();
        sprojf sprojf2 = arg0.cfr_renamed_5740(arg2, arg3.cfr_renamed_5741(), arg4);
        sprknf[] sprknfArray = new sprknf[2];
        sprknf[] sprknfArray2 = sprknfArray;
        sprknfArray[0] = sprvkf.cfr_renamed_5742(arg0, sprojf2, sprdjf2);
        int n2 = n = 0;
        while (n2 < arg1) {
            sprknf[] sprknfArray3;
            sprjqf2 = (sprjqf)((sprxjf)((sprxjf)((sprxjf)new sprxjf().cfr_renamed_5733(sprjqf2.cfr_renamed_5734())).cfr_renamed_5735(sprjqf2.cfr_renamed_5736())).cfr_renamed_5743(n).cfr_renamed_5739(sprjqf2.cfr_renamed_5744()).cfr_renamed_5745(sprjqf2.cfr_renamed_5746())).cfr_renamed_1451();
            if (Math.floor(arg5 / (1 << n)) % 2.0 == 0.0) {
                sprjqf2 = (sprjqf)((sprxjf)((sprxjf)((sprxjf)new sprxjf().cfr_renamed_5733(sprjqf2.cfr_renamed_5734())).cfr_renamed_5735(sprjqf2.cfr_renamed_5736())).cfr_renamed_5743(sprjqf2.cfr_renamed_5747()).cfr_renamed_5739(sprjqf2.cfr_renamed_5744() / 2).cfr_renamed_5745(sprjqf2.cfr_renamed_5746())).cfr_renamed_1451();
                sprknfArray2[1] = sprvkf.cfr_renamed_5748(arg0, sprknfArray2[0], arg3.cfr_renamed_1415().get(n), sprjqf2);
                sprknfArray3 = sprknfArray2;
                sprknfArray2[1] = new sprknf(sprknfArray2[1].cfr_renamed_1452() + 1, sprknfArray2[1].cfr_renamed_97());
            } else {
                sprjqf2 = (sprjqf)((sprxjf)((sprxjf)((sprxjf)new sprxjf().cfr_renamed_5733(sprjqf2.cfr_renamed_5734())).cfr_renamed_5735(sprjqf2.cfr_renamed_5736())).cfr_renamed_5743(sprjqf2.cfr_renamed_5747()).cfr_renamed_5739((sprjqf2.cfr_renamed_5744() - 1) / 2).cfr_renamed_5745(sprjqf2.cfr_renamed_5746())).cfr_renamed_1451();
                sprknfArray2[1] = sprvkf.cfr_renamed_5748(arg0, arg3.cfr_renamed_1415().get(n), sprknfArray2[0], sprjqf2);
                sprknfArray3 = sprknfArray2;
                sprknfArray2[1] = new sprknf(sprknfArray2[1].cfr_renamed_1452() + 1, sprknfArray2[1].cfr_renamed_97());
            }
            sprknfArray3[0] = sprknfArray2[1];
            n2 = ++n;
        }
        return sprknfArray2[0];
    }
}

