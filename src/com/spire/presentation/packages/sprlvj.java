/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvg;
import com.spire.presentation.packages.sprdfh;
import com.spire.presentation.packages.sprgmh;
import com.spire.presentation.packages.sprhgaa;
import com.spire.presentation.packages.sprhr;
import com.spire.presentation.packages.spris;
import com.spire.presentation.packages.sprjch;
import com.spire.presentation.packages.sprjfh;
import com.spire.presentation.packages.sprjvj;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlgh;
import com.spire.presentation.packages.sprlrg;
import com.spire.presentation.packages.sprmq;
import com.spire.presentation.packages.sprnjh;
import com.spire.presentation.packages.sprowj;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprppc;
import com.spire.presentation.packages.sprrih;
import com.spire.presentation.packages.sprsuj;
import com.spire.presentation.packages.sprumh;
import com.spire.presentation.packages.sprvwg;
import com.spire.presentation.packages.sprwgh;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprxwj;
import com.spire.presentation.packages.spryhk;
import com.spire.presentation.packages.sprzeh;
import java.io.IOException;
import java.io.OutputStream;

public class sprlvj
extends sprsuj {
    private final sprmq cfr_renamed_4;

    public spryhk cfr_renamed_9555(sprwgh arg0, sprxwj arg1) {
        return this.cfr_renamed_9534(arg0, arg1, null);
    }

    /*
     * WARNING - void declaration
     */
    public sprlvj(sprmq sprmq2, sprnjh sprnjh2) {
        super((sprnjh)arg1);
        void arg1;
        this.cfr_renamed_4 = sprmq2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public spryhk cfr_renamed_9534(sprwgh arg0, sprxwj arg1, sprjvj arg2) {
        sprumh sprumh2;
        sprgmh sprgmh2;
        sprlvj sprlvj2;
        sprzeh sprzeh2;
        sprnjh sprnjh2 = new sprnjh(this.cfr_renamed_2);
        sprnjh2.cfr_renamed_9546(arg0);
        if (arg2 != null) {
            sprnjh2.cfr_renamed_9547(arg2.cfr_renamed_568());
        }
        sprnjh2.cfr_renamed_9548(sprzeh.cfr_renamed_8232(arg1.cfr_renamed_568()));
        sprdfh sprdfh2 = sprnjh2.cfr_renamed_9553();
        sprdfh sprdfh3 = null;
        if (this.cfr_renamed_4.cfr_renamed_9516()) {
            sprzeh2 = sprdfh2.cfr_renamed_8242();
            sprlvj2 = this;
        } else {
            sprlvj sprlvj3 = this;
            sprlvj2 = sprlvj3;
            sprdfh3 = sprlvj3.cfr_renamed_4.cfr_renamed_614().cfr_renamed_568().cfr_renamed_8295();
            sprzeh2 = sprdfh3.cfr_renamed_8242();
        }
        OutputStream outputStream = sprlvj2.cfr_renamed_4.cfr_renamed_470();
        try {
            OutputStream outputStream2 = outputStream;
            outputStream2.write(sprrih.cfr_renamed_8165(sprdfh2, sprlrg.cfr_renamed_135.cfr_renamed_1451()));
            outputStream2.close();
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(sprhgaa.cfr_renamed_9("\u0013|\u001es\u001fiPm\u0002r\u0014h\u0013xP~\u0015o\u0004t\u0016t\u0013|\u0004xPn\u0019z\u001e|\u0004h\u0002x"));
        }
        sprvwg sprvwg2 = null;
        switch (sprzeh2.cfr_renamed_8227()) {
            case 0: {
                sprvwg2 = sprowj.cfr_renamed_9518(sprhr.cfr_renamed_1, this.cfr_renamed_4.cfr_renamed_79());
                break;
            }
            case 1: {
                sprvwg2 = sprowj.cfr_renamed_9518(spris.cfr_renamed_96, this.cfr_renamed_4.cfr_renamed_79());
                break;
            }
            case 2: {
                sprvwg2 = sprowj.cfr_renamed_9518(spris.cfr_renamed_93, this.cfr_renamed_4.cfr_renamed_79());
                break;
            }
            default: {
                throw new IllegalStateException(sprppc.cfr_renamed_9("O*Q*U3TdQ!CdN=J!"));
            }
        }
        sprumh sprumh3 = new sprumh();
        sprlvj sprlvj4 = this;
        sprlem sprlem2 = sprlvj4.cfr_renamed_4.cfr_renamed_410().cfr_renamed_593();
        if (sprlvj4.cfr_renamed_4.cfr_renamed_9516()) {
            if (sprlem2.cfr_renamed_5078(sprwr.cfr_renamed_1226)) {
                sprgmh2 = sprgmh.cfr_renamed_8291(sprjch.cfr_renamed_4);
                sprumh2 = sprumh3;
            } else {
                if (!sprlem2.cfr_renamed_5078(sprwr.cfr_renamed_112)) {
                    throw new IllegalStateException(sprhgaa.cfr_renamed_9("\u0005s\u001bs\u001fj\u001e=\u0014t\u0017x\u0003i"));
                }
                sprgmh2 = sprgmh.cfr_renamed_8291(sprjch.cfr_renamed_3);
                sprumh2 = sprumh3;
            }
        } else {
            byte[] byArray = this.cfr_renamed_4.cfr_renamed_9517();
            sprjfh sprjfh2 = new sprjfh(sproze.cfr_renamed_533(byArray, byArray.length - 8, byArray.length));
            if (sprlem2.cfr_renamed_5078(sprwr.cfr_renamed_1226)) {
                sprgmh2 = sprgmh.cfr_renamed_8294(sprjfh2);
                sprumh2 = sprumh3;
            } else {
                if (!sprlem2.cfr_renamed_5078(sprwr.cfr_renamed_112)) {
                    throw new IllegalStateException(sprppc.cfr_renamed_9("O*Q*U3Td^-]!I0"));
                }
                sprgmh2 = sprgmh.cfr_renamed_8292(sprjfh2);
                sprumh2 = sprumh3;
            }
        }
        sprumh2.cfr_renamed_9549((sprbvg)((Object)this.cfr_renamed_4));
        sprumh3.cfr_renamed_9550(sprlgh.cfr_renamed_3);
        sprumh3.cfr_renamed_9551(sprgmh2);
        sprumh3.cfr_renamed_9552(sprdfh2);
        sprumh3.cfr_renamed_9556(sprvwg2);
        return new spryhk(sprumh3.cfr_renamed_9554());
    }
}

