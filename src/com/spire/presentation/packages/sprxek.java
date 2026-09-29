/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvg;
import com.spire.presentation.packages.spredh;
import com.spire.presentation.packages.sprfxg;
import com.spire.presentation.packages.sprjfh;
import com.spire.presentation.packages.sprlrg;
import com.spire.presentation.packages.sprmhh;
import com.spire.presentation.packages.sprmjh;
import com.spire.presentation.packages.sprmq;
import com.spire.presentation.packages.sprowj;
import com.spire.presentation.packages.sprphk;
import com.spire.presentation.packages.sprpkh;
import com.spire.presentation.packages.sprrih;
import com.spire.presentation.packages.sprsch;
import com.spire.presentation.packages.sprstg;
import com.spire.presentation.packages.sprtgh;
import com.spire.presentation.packages.sprtgk;
import com.spire.presentation.packages.sprvjh;
import com.spire.presentation.packages.sprvlh;
import com.spire.presentation.packages.sprvwg;
import com.spire.presentation.packages.sprwhh;
import com.spire.presentation.packages.spryhk;
import com.spire.presentation.packages.sprzdh;
import com.spire.presentation.packages.sprzgh;
import com.spire.presentation.packages.sprzhh;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class sprxek {
    private static final sprvlh cfr_renamed_1 = sprlrg.cfr_renamed_951.cfr_renamed_1451();
    private final sprsch cfr_renamed_2;
    private sprzgh cfr_renamed_3;
    private sprwhh cfr_renamed_4;

    private /* synthetic */ sprxek(sprfxg arg0) {
        this(sprsch.cfr_renamed_7843().cfr_renamed_9574(arg0).cfr_renamed_9575(sprstg.cfr_renamed_8339()).cfr_renamed_9576());
    }

    public sprtgk cfr_renamed_9577(sprmq arg0, sprjfh arg1) {
        sprvjh sprvjh2 = this.cfr_renamed_9578();
        sprmq sprmq2 = arg0;
        sprxek.cfr_renamed_9579(sprmq2.cfr_renamed_470(), sprrih.cfr_renamed_8165(sprvjh2, cfr_renamed_1));
        sprvwg sprvwg2 = sprowj.cfr_renamed_9518(sprmq2.cfr_renamed_9515(), arg0.cfr_renamed_79());
        return new sprtgk(spredh.cfr_renamed_7843().cfr_renamed_9580(sprphk.cfr_renamed_9573(arg0.cfr_renamed_410().cfr_renamed_593())).cfr_renamed_9581(sprvjh2).cfr_renamed_9582(sprpkh.cfr_renamed_8267(arg1)).cfr_renamed_9556(sprvwg2).cfr_renamed_9583());
    }

    public static sprxek cfr_renamed_9584(sprfxg arg0) {
        return new sprxek(arg0);
    }

    private /* synthetic */ sprvjh cfr_renamed_9578() {
        sprxek sprxek2 = this;
        sprtgh sprtgh2 = new sprtgh(sprxek2.cfr_renamed_3, sprxek2.cfr_renamed_4);
        return sprvjh.cfr_renamed_7843().cfr_renamed_9585(sprtgh2).cfr_renamed_9586(this.cfr_renamed_2).cfr_renamed_9587();
    }

    public sprtgk cfr_renamed_9588(sprmq arg0, List<spryhk> arg1) {
        Object object;
        sprvjh sprvjh2 = this.cfr_renamed_9578();
        sprxek.cfr_renamed_9579(arg0.cfr_renamed_470(), sprrih.cfr_renamed_8165(sprvjh2, cfr_renamed_1));
        ArrayList<sprmhh> arrayList = new ArrayList<sprmhh>();
        Object object2 = object = arg1.iterator();
        while (object2.hasNext()) {
            spryhk spryhk2 = object.next();
            object2 = object;
            arrayList.add(sprmhh.cfr_renamed_23(spryhk2.cfr_renamed_568()));
        }
        object = sprowj.cfr_renamed_9518(arg0.cfr_renamed_9515(), arg0.cfr_renamed_79());
        return new sprtgk(spredh.cfr_renamed_7843().cfr_renamed_9580(sprphk.cfr_renamed_9573(arg0.cfr_renamed_410().cfr_renamed_593())).cfr_renamed_9581(sprvjh2).cfr_renamed_9582(sprpkh.cfr_renamed_8265(new sprzhh(arrayList))).cfr_renamed_9556((sprvwg)object).cfr_renamed_9583());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ void cfr_renamed_9579(OutputStream arg0, byte[] arg1) {
        try {
            OutputStream outputStream = arg0;
            outputStream.write(arg1);
            outputStream.flush();
            outputStream.close();
            return;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception.getMessage(), exception);
        }
    }

    public sprxek cfr_renamed_9589(sprmjh arg0) {
        this.cfr_renamed_3 = sprzgh.cfr_renamed_7843().cfr_renamed_9590(new sprbvg(3)).cfr_renamed_9591(arg0).cfr_renamed_9592();
        return this;
    }

    public sprxek cfr_renamed_9593(sprwhh arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprxek cfr_renamed_9594(byte[] arg0) {
        this.cfr_renamed_3 = sprzgh.cfr_renamed_7843().cfr_renamed_9590(new sprbvg(3)).cfr_renamed_9591(sprmjh.cfr_renamed_8300(new sprzdh(arg0))).cfr_renamed_9595();
        return this;
    }

    public sprtgk cfr_renamed_9596(sprmq arg0) {
        sprvjh sprvjh2 = this.cfr_renamed_9578();
        sprmq sprmq2 = arg0;
        sprxek.cfr_renamed_9579(sprmq2.cfr_renamed_470(), sprrih.cfr_renamed_8165(sprvjh2, cfr_renamed_1));
        sprvwg sprvwg2 = sprowj.cfr_renamed_9518(sprmq2.cfr_renamed_9515(), arg0.cfr_renamed_79());
        return new sprtgk(spredh.cfr_renamed_7843().cfr_renamed_9580(sprphk.cfr_renamed_9573(arg0.cfr_renamed_410().cfr_renamed_593())).cfr_renamed_9581(sprvjh2).cfr_renamed_9582(sprpkh.cfr_renamed_8266()).cfr_renamed_9556(sprvwg2).cfr_renamed_9583());
    }

    private /* synthetic */ sprxek(sprsch sprsch2) {
        this.cfr_renamed_2 = sprsch2;
    }

    public static sprxek cfr_renamed_9597(sprsch arg0) {
        return new sprxek(arg0);
    }
}

