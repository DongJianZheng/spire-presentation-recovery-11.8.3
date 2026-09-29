/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprasn;
import com.spire.presentation.packages.sprbdd;
import com.spire.presentation.packages.sprcjn;
import com.spire.presentation.packages.sprdqn;
import com.spire.presentation.packages.sprebp;
import com.spire.presentation.packages.sprhkn;
import com.spire.presentation.packages.sprnmp;
import com.spire.presentation.packages.sprnyn;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprsin;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.sprznp;
import java.util.Iterator;

@sprtea
public class sprksn
extends sprasn {
    private static final float cfr_renamed_1 = 10.0f;
    private sprdqn cfr_renamed_2;
    private static final String cfr_renamed_3 = "http://www.w3.org/2000/svg";
    private static final String cfr_renamed_4 = "http://www.w3.org/1999/xlink";

    /*
     * WARNING - void declaration
     */
    public sprksn(sprdqn sprdqn2) {
        super((sprcjn)arg0);
        void arg0;
        this.cfr_renamed_2 = sprdqn2;
    }

    @Override
    @sprtea
    public void cfr_renamed_12434() {
        sprksn sprksn2;
        if (this.cfr_renamed_2.cfr_renamed_13454().cfr_renamed_13476()) {
            sprksn sprksn3 = this;
            sprksn2 = sprksn3;
            sprksn3.cfr_renamed_13380().cfr_renamed_12423("svg");
        } else {
            sprksn sprksn4 = this;
            sprksn2 = sprksn4;
            sprksn4.cfr_renamed_13380().cfr_renamed_12458("svg");
        }
        sprksn2.cfr_renamed_13380().cfr_renamed_12405("xmlns", cfr_renamed_3);
        sprksn sprksn5 = this;
        sprksn5.cfr_renamed_13380().cfr_renamed_12405(sprnyn.cfr_renamed_9("t\u0003`\u0000\u007fTt\u0002e\u0000g"), cfr_renamed_4);
        sprksn5.cfr_renamed_13380().cfr_renamed_12405("version", "1.1");
    }

    @Override
    public sprsin cfr_renamed_13415() {
        return new sprhkn(this.cfr_renamed_2);
    }

    @Override
    @sprtea
    public void cfr_renamed_12453() {
        Iterator iterator;
        sprksn sprksn2;
        sprksn sprksn3 = this;
        this.cfr_renamed_4 += (((sprwvn)((Object)sprksn3.cfr_renamed_2)).size() - 1) * sprnmp.cfr_renamed_13494(10.0);
        if (sprksn3.cfr_renamed_2.cfr_renamed_13454().cfr_renamed_13475()) {
            sprksn sprksn4 = this;
            sprksn4.cfr_renamed_13380().cfr_renamed_12405("width", sprbdd.cfr_renamed_9("uTtA"));
            sprksn4.cfr_renamed_13380().cfr_renamed_12405("height", sprnyn.cfr_renamed_9("_<^)"));
            Object[] objectArray = new Object[2];
            objectArray[0] = (int)this.cfr_renamed_1;
            objectArray[1] = (int)this.cfr_renamed_4;
            sprksn4.cfr_renamed_13380().cfr_renamed_12405("viewBox", sprraia.cfr_renamed_11562(sprbdd.cfr_renamed_9("TdTd\u001ft\u0019d\u001fu\u0019"), objectArray));
            sprksn2 = this;
        } else {
            sprksn sprksn5 = this;
            sprksn2 = sprksn5;
            sprksn sprksn6 = this;
            sprksn5.cfr_renamed_13380().cfr_renamed_12405("width", Integer.toString((int)sprksn6.cfr_renamed_1));
            sprksn6.cfr_renamed_13380().cfr_renamed_12405("height", Integer.toString((int)this.cfr_renamed_4));
        }
        if (sprznp.cfr_renamed_12328(sprksn2.cfr_renamed_2820().cfr_renamed_13097().cfr_renamed_13212())) {
            Object[] objectArray = new Object[1];
            objectArray[0] = this.cfr_renamed_2820().cfr_renamed_13097().cfr_renamed_13212();
            this.cfr_renamed_13380().cfr_renamed_12393(sprraia.cfr_renamed_11562(sprnyn.cfr_renamed_9(")i\u0000i\u001cm\u001ai\n,\fuNw^q"), objectArray));
        }
        sprksn sprksn7 = this;
        sprksn7.cfr_renamed_2820().cfr_renamed_13434();
        sprksn7.cfr_renamed_13380().cfr_renamed_12423("g");
        sprksn7.cfr_renamed_13380().cfr_renamed_12405("transform", sprbdd.cfr_renamed_9("7\u0007%\b!LuJwWwWwM"));
        float f = 0.0f;
        Iterator iterator2 = iterator = this.cfr_renamed_2.iterator();
        while (iterator2.hasNext()) {
            sprhkn sprhkn2 = (sprhkn)iterator.next();
            sprksn sprksn8 = this;
            float f2 = ((float)sprnmp.cfr_renamed_13495(sprksn8.cfr_renamed_1) - sprhkn2.cfr_renamed_13471().cfr_renamed_1942()) / 2.0f;
            sprksn8.cfr_renamed_13380().cfr_renamed_12423("g");
            if (f2 > 0.0f || f > 0.0f) {
                Object[] objectArray = new Object[2];
                objectArray[0] = sprebp.cfr_renamed_13083(f2);
                objectArray[1] = sprebp.cfr_renamed_13083(f);
                this.cfr_renamed_13380().cfr_renamed_12405("transform", sprraia.cfr_renamed_11562(sprnyn.cfr_renamed_9("\u001a~\u000fb\u001d`\u000fx\u000b$\u0015<\u0013 \u0015=\u0013%"), objectArray));
            }
            sprhkn2.cfr_renamed_13396();
            iterator2 = iterator;
            this.cfr_renamed_13380().cfr_renamed_12439();
            f += sprhkn2.cfr_renamed_13471().cfr_renamed_1452() + 10.0f;
        }
        sprksn sprksn9 = this;
        sprksn9.cfr_renamed_13380().cfr_renamed_12439();
        sprksn sprksn10 = this;
        if (sprksn9.cfr_renamed_2.cfr_renamed_13454().cfr_renamed_13476()) {
            sprksn10.cfr_renamed_13380().cfr_renamed_12439();
            this.cfr_renamed_13380().cfr_renamed_2947();
            return;
        }
        sprksn10.cfr_renamed_13380().cfr_renamed_12453();
    }
}

