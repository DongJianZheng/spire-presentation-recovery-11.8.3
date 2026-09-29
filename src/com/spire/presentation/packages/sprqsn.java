/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprilo;
import com.spire.presentation.packages.sprklga;
import com.spire.presentation.packages.sprky;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprqdaa;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvio;
import com.spire.presentation.packages.sprvun;
import com.spire.presentation.packages.sprzjo;

@sprtea
public class sprqsn<T>
extends sprrzn {
    @sprtea
    public sprqsn cfr_renamed_15647(sprvio arg0) {
        if (arg0 == null) {
            sprqsn sprqsn2 = this;
            sprqsn2.cfr_renamed_15492("Value");
            return sprqsn2;
        }
        sprqsn sprqsn3 = this;
        sprqsn3.cfr_renamed_15480("Value", arg0.toString());
        return sprqsn3;
    }

    @sprtea
    public sprqsn cfr_renamed_15144(Integer arg0) {
        sprqsn sprqsn2;
        if (arg0 == null) {
            sprqsn sprqsn3 = this;
            sprqsn3.cfr_renamed_15492(sprqdaa.cfr_renamed_9("t_E[T"));
            return sprqsn3;
        }
        if (arg0 < 0) {
            arg0 = 0;
            sprqsn2 = this;
        } else {
            if (arg0 > 255) {
                arg0 = 255;
            }
            sprqsn2 = this;
        }
        sprqsn2.cfr_renamed_15480(sprklga.cfr_renamed_9("h.Y*H"), arg0.toString());
        return this;
    }

    @sprtea
    public Integer cfr_renamed_5949() {
        String string = this.cfr_renamed_15482(sprqdaa.cfr_renamed_9("t_E[T"));
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return 255;
        }
        Integer n = Integer.parseInt(string);
        if (n < 0 || n > 255) {
            throw new NumberFormatException(new StringBuilder().insert(0, sprklga.cfr_renamed_9("\u98de\u825b\u904d\u6627\u5ee4\u832a\u56b6\u5701b\u0019<\u001bw\u001cb\u4e62\u95b6\u53ff\u507e\uff33")).append(n).toString());
        }
        return n;
    }

    @sprtea
    public sprqsn(sprky sprky2) {
        sprqsn<T> sprqsn2 = this;
        sprqsn2();
        sprqsn2.cfr_renamed_15283(sprky2);
    }

    public sprqsn cfr_renamed_15296(sprvun arg0) {
        if (arg0 == null) {
            throw new NumberFormatException(new StringBuilder().insert(0, sprqdaa.cfr_renamed_9("CTGAVG]\u0015PT]\u0015]ZG\u0015QP\u0013[FY_\uff2f")).append(arg0).toString());
        }
        sprqsn sprqsn2 = this;
        sprqsn2.cfr_renamed_15555(arg0);
        return sprqsn2;
    }

    @sprtea
    public sprqsn() {
        super("Color");
    }

    @sprtea
    public sprqsn(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public Integer cfr_renamed_320() {
        String string = this.cfr_renamed_15482(sprklga.cfr_renamed_9("`,M'Q"));
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return null;
        }
        Integer n = Integer.parseInt(string);
        if (n < 0) {
            throw new NumberFormatException(sprqdaa.cfr_renamed_9("\u8c36\u8241\u674a\u4e1e\u98a9\u8241\u76b1\u7f25\u53c2\uff3f\u5ff0\u9848\u4e0f\u976d\u8d2a\u6547\u6545"));
        }
        return n;
    }

    @sprtea
    public sprqsn cfr_renamed_15648(sprzjo arg0) {
        if (arg0 == null) {
            sprqsn sprqsn2 = this;
            sprqsn2.cfr_renamed_15492(sprklga.cfr_renamed_9("\u0001F.F0z2H!L"));
            return sprqsn2;
        }
        sprqsn sprqsn3 = this;
        sprqsn3.cfr_renamed_15480(sprqdaa.cfr_renamed_9("pZ_ZAfCTPP"), arg0.toString());
        return sprqsn3;
    }

    @sprtea
    public sprqsn(String arg0) {
        super(arg0);
    }

    @sprtea
    public sprzjo cfr_renamed_12768() {
        return sprzjo.cfr_renamed_141(this.cfr_renamed_15482(sprklga.cfr_renamed_9("\u0001F.F0z2H!L")));
    }

    @sprtea
    public sprqsn cfr_renamed_15649(Integer arg0) {
        if (arg0 == null) {
            sprqsn sprqsn2 = this;
            sprqsn2.cfr_renamed_15492(sprqdaa.cfr_renamed_9("|]QVM"));
            return sprqsn2;
        }
        if (arg0 < 0) {
            throw new NumberFormatException(sprklga.cfr_renamed_9("\u8c2a\u8230\u6756\u4e6f\u98b5\u8230\u76ad\u7f54\u53de\uff4e\u5fec\u9839\u4e13\u971c\u8d36\u6536\u6559"));
        }
        sprqsn sprqsn3 = this;
        sprqsn3.cfr_renamed_15480(sprqdaa.cfr_renamed_9("|]QVM"), Integer.toString(arg0));
        return sprqsn3;
    }

    @sprtea
    public sprky cfr_renamed_12553() {
        sprdz<sprnco> sprdz2 = this.cfr_renamed_2445();
        if (sprdz2.size() == 0) {
            return null;
        }
        return sprilo.cfr_renamed_15650(sprdz2.cfr_renamed_12151(0));
    }

    @sprtea
    public static sprqsn cfr_renamed_15651(int[] arg0) {
        return sprqsn.cfr_renamed_15143(arg0[0], arg0[1], arg0[2]);
    }

    @sprtea
    public static sprqsn cfr_renamed_15143(int arg0, int arg1, int arg2) {
        Object[] objectArray = new Object[3];
        objectArray[0] = arg0;
        objectArray[1] = arg1;
        objectArray[2] = arg2;
        return new sprqsn().cfr_renamed_15647(new sprvio(objectArray));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @sprtea
    public T cfr_renamed_15652() throws Exception {
        sprdz<sprnco> sprdz2 = this.cfr_renamed_2445();
        if (sprdz2.size() == 0) {
            throw new Exception();
        }
        try {
            return (T)sprilo.cfr_renamed_15650(sprdz2.cfr_renamed_12151(0));
        }
        catch (Exception exception) {
            throw new Exception();
        }
    }

    @sprtea
    public sprvio cfr_renamed_97() {
        return sprvio.cfr_renamed_141(this.cfr_renamed_15482("Value"));
    }

    @sprtea
    public sprqsn cfr_renamed_15283(sprky arg0) {
        if (arg0 == null) {
            return this;
        }
        String[] stringArray = new String[5];
        stringArray[0] = sprklga.cfr_renamed_9("y#]6L0G");
        stringArray[1] = sprqdaa.cfr_renamed_9("rMZT_f[Q");
        stringArray[2] = sprklga.cfr_renamed_9("{#M+H.z*M");
        stringArray[3] = sprqdaa.cfr_renamed_9("tZFGR@Wf[Q");
        stringArray[4] = sprklga.cfr_renamed_9("\u000eH\u0005F7[#\\&z*M");
        this.cfr_renamed_15546(stringArray);
        this.cfr_renamed_15271((sprnco)((Object)arg0));
        return this;
    }
}

