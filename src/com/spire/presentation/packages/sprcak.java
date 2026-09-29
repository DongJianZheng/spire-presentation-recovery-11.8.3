/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvg;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprgfh;
import com.spire.presentation.packages.sprgmh;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprjfh;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlgh;
import com.spire.presentation.packages.sprlj;
import com.spire.presentation.packages.sprnjh;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprraz;
import com.spire.presentation.packages.sprsuj;
import com.spire.presentation.packages.sprumh;
import com.spire.presentation.packages.sprwgh;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.spryhk;
import com.spire.presentation.packages.sprywg;
import com.spire.presentation.packages.sprzeh;
import java.io.OutputStream;
import java.math.BigInteger;

public class sprcak
extends sprsuj {
    private final sprgmh cfr_renamed_4;

    public spryhk cfr_renamed_9544(sprwgh arg0, BigInteger arg1, BigInteger arg2) {
        return this.cfr_renamed_9545(arg0, arg1, arg2, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprcak(spryhk arg0, sprlj arg1, sprnjh arg2) {
        super(arg0, arg2);
        Object object;
        sprjj sprjj2;
        sprddm sprddm2 = new sprddm(sprwr.cfr_renamed_1226);
        sprlem sprlem2 = sprddm2.cfr_renamed_593();
        try {
            sprjj2 = arg1.cfr_renamed_5279(sprddm2);
        }
        catch (sprhjg sprhjg2) {
            throw new IllegalStateException(sprhjg2.getMessage(), sprhjg2);
        }
        {
            object = sprjj2.cfr_renamed_470();
            ((OutputStream)object).write(arg0.cfr_renamed_91());
            ((OutputStream)object).close();
        }
        Object object2 = object = (Object)sprjj2.cfr_renamed_580();
        sprjfh sprjfh2 = new sprjfh(sproze.cfr_renamed_533((byte[])object2, ((Object)object2).length - 8, ((Object)object).length));
        if (sprlem2.cfr_renamed_5078(sprwr.cfr_renamed_1226)) {
            this.cfr_renamed_4 = sprgmh.cfr_renamed_8294(sprjfh2);
            return;
        }
        if (sprlem2.cfr_renamed_5078(sprwr.cfr_renamed_112)) {
            this.cfr_renamed_4 = sprgmh.cfr_renamed_8292(sprjfh2);
            return;
        }
        throw new IllegalStateException(sprraz.cfr_renamed_9("\u001aL\u0004L\u0000U\u0001\u0002\u000bK\bG\u001cV"));
    }

    public spryhk cfr_renamed_9545(sprwgh arg0, BigInteger arg1, BigInteger arg2, sprywg arg3) {
        sprgfh sprgfh2 = sprgfh.cfr_renamed_8400(arg1, arg2);
        sprnjh sprnjh2 = new sprnjh(this.cfr_renamed_2);
        sprnjh2.cfr_renamed_9546(arg0);
        if (arg3 != null) {
            sprnjh2.cfr_renamed_9547(arg3);
        }
        sprnjh2.cfr_renamed_9548(sprzeh.cfr_renamed_8234(sprgfh2));
        sprumh sprumh2 = new sprumh();
        sprumh2.cfr_renamed_9549((sprbvg)((Object)this.cfr_renamed_4));
        sprumh2.cfr_renamed_9550(sprlgh.cfr_renamed_4);
        sprumh2.cfr_renamed_9551(this.cfr_renamed_4);
        sprumh2.cfr_renamed_9552(sprnjh2.cfr_renamed_9553());
        return new spryhk(sprumh2.cfr_renamed_9554());
    }
}

