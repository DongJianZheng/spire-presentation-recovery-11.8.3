/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprabz;
import com.spire.presentation.packages.spreyja;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprmgo;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprsfo;
import com.spire.presentation.packages.sprshn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprywja;
import java.util.Iterator;

@sprtea
public class sprtbo
extends sprrzn {
    private sprywja cfr_renamed_4;

    @sprtea
    public sprtbo cfr_renamed_15728(double arg0, double arg1, double arg2, double arg3, double arg4, double arg5) {
        String[] stringArray = new String[13];
        stringArray[0] = sprabz.cfr_renamed_9("w");
        stringArray[1] = " ";
        stringArray[2] = sprmgo.cfr_renamed_15502(arg0);
        stringArray[3] = " ";
        stringArray[4] = sprmgo.cfr_renamed_15502(arg1);
        stringArray[5] = " ";
        stringArray[6] = sprmgo.cfr_renamed_15502(arg2);
        stringArray[7] = " ";
        stringArray[8] = sprmgo.cfr_renamed_15502(arg3);
        stringArray[9] = " ";
        stringArray[10] = sprmgo.cfr_renamed_15502(arg4);
        stringArray[11] = " ";
        stringArray[12] = sprmgo.cfr_renamed_15502(arg5);
        this.cfr_renamed_4.cfr_renamed_15729(stringArray);
        return this;
    }

    @sprtea
    public static sprywja cfr_renamed_15500(String arg0) {
        return null;
    }

    @sprtea
    public sprtbo cfr_renamed_15730() {
        return this.cfr_renamed_2637();
    }

    @sprtea
    public sprtbo cfr_renamed_15731(double arg0, double arg1, double arg2, double arg3) {
        return this.cfr_renamed_15732(arg0, arg1, arg2, arg3);
    }

    @sprtea
    public sprtbo cfr_renamed_15733(double arg0, double arg1) {
        String[] stringArray = new String[5];
        stringArray[0] = sprshn.cfr_renamed_9("\u0019");
        stringArray[1] = " ";
        stringArray[2] = sprmgo.cfr_renamed_15502(arg0);
        stringArray[3] = " ";
        stringArray[4] = sprmgo.cfr_renamed_15502(arg1);
        this.cfr_renamed_4.cfr_renamed_15729(stringArray);
        return this;
    }

    @sprtea
    public sprtbo cfr_renamed_15732(double arg0, double arg1, double arg2, double arg3) {
        String[] stringArray = new String[9];
        stringArray[0] = sprabz.cfr_renamed_9("d");
        stringArray[1] = " ";
        stringArray[2] = sprmgo.cfr_renamed_15502(arg0);
        stringArray[3] = " ";
        stringArray[4] = sprmgo.cfr_renamed_15502(arg1);
        stringArray[5] = " ";
        stringArray[6] = sprmgo.cfr_renamed_15502(arg2);
        stringArray[7] = " ";
        stringArray[8] = sprmgo.cfr_renamed_15502(arg3);
        this.cfr_renamed_4.cfr_renamed_15729(stringArray);
        return this;
    }

    @sprtea
    public sprtbo cfr_renamed_2947() {
        sprtbo sprtbo2 = this;
        sprtbo2.cfr_renamed_15489(sprtbo2.toString());
        return sprtbo2;
    }

    @sprtea
    public sprtbo cfr_renamed_15734(double arg0, double arg1) {
        String[] stringArray = new String[5];
        stringArray[0] = "M";
        stringArray[1] = " ";
        stringArray[2] = sprmgo.cfr_renamed_15502(arg0);
        stringArray[3] = " ";
        stringArray[4] = sprmgo.cfr_renamed_15502(arg1);
        this.cfr_renamed_4.cfr_renamed_15729(stringArray);
        return this;
    }

    @sprtea
    public sprtbo cfr_renamed_15735(double arg0, double arg1, double arg2, double arg3, double arg4, double arg5) {
        return this.cfr_renamed_15728(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    public String toString() {
        if (this.cfr_renamed_4.size() == 0) {
            throw new IllegalArgumentException(sprshn.cfr_renamed_9("<(\u001f8\u0018<\u0014+\t/\u0019\u000e\u001c>\u001cj\u4e70\u80b7\u4e47\u7a30"));
        }
        StringBuilder stringBuilder = new StringBuilder();
        int n = 0;
        for (String[] stringArray : this.cfr_renamed_4) {
            int n2;
            if (++n != 1) {
                sprghha.cfr_renamed_12279(stringBuilder, " ");
            }
            String[] stringArray2 = stringArray;
            int n3 = stringArray.length;
            int n4 = n2 = 0;
            while (n4 < n3) {
                String string = stringArray2[n2];
                sprghha.cfr_renamed_12279(stringBuilder, string);
                n4 = ++n2;
            }
        }
        return stringBuilder.toString();
    }

    @sprtea
    public sprtbo cfr_renamed_15736(double arg0, double arg1, double arg2, int arg3, int arg4, sprsfo arg5) {
        return this.cfr_renamed_15737(arg0, arg1, arg2, arg3, arg4, arg5.cfr_renamed_1980(), arg5.spr\u3181());
    }

    @sprtea
    public sprtbo() {
        super(sprabz.cfr_renamed_9("t\u007fWoPk\\|AxQYTiT"));
        sprtbo sprtbo2 = this;
        sprtbo2.cfr_renamed_4 = new sprywja();
    }

    @sprtea
    public sprtbo cfr_renamed_15259(sprsfo arg0) {
        return this.cfr_renamed_15738(arg0.cfr_renamed_1980(), arg0.spr\u3181());
    }

    @sprtea
    public sprtbo cfr_renamed_15739() {
        sprtbo sprtbo2 = this;
        sprtbo2.cfr_renamed_4.cfr_renamed_15740();
        return sprtbo2;
    }

    @sprtea
    public sprtbo cfr_renamed_15741(sprsfo arg0) {
        return this.cfr_renamed_15733(arg0.cfr_renamed_1980(), arg0.spr\u3181());
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprtbo(sprnco sprnco2) {
        super((sprnco)arg0);
        void arg0;
        this.cfr_renamed_4 = sprtbo.cfr_renamed_15500(sprnco2.cfr_renamed_13030());
    }

    @Override
    @sprtea
    public Object cfr_renamed_12099() {
        Iterator iterator;
        sprtbo sprtbo2;
        sprtbo sprtbo3 = sprtbo2 = new sprtbo();
        sprtbo3.cfr_renamed_4 = new sprywja();
        Iterator iterator2 = iterator = this.cfr_renamed_4.iterator();
        while (iterator2.hasNext()) {
            String[] stringArray = (String[])iterator.next();
            spreyja<String[]> spreyja2 = sprtbo2.cfr_renamed_4.cfr_renamed_15729((String[])stringArray.clone());
            iterator2 = iterator;
        }
        return sprtbo2;
    }

    @sprtea
    public sprtbo cfr_renamed_15742(double arg0, double arg1, double arg2, int arg3, int arg4, double arg5, double arg6) {
        return this.cfr_renamed_15737(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @sprtea
    public sprtbo cfr_renamed_2637() {
        String[] stringArray = new String[1];
        stringArray[0] = sprshn.cfr_renamed_9("\t");
        this.cfr_renamed_4.cfr_renamed_15729(stringArray);
        return this;
    }

    @sprtea
    public sprtbo cfr_renamed_15258(sprsfo arg0) {
        return this.cfr_renamed_15734(arg0.cfr_renamed_1980(), arg0.spr\u3181());
    }

    @sprtea
    public sprtbo cfr_renamed_15743(sprsfo arg0, sprsfo arg1) {
        return this.cfr_renamed_15732(arg0.cfr_renamed_1980(), arg0.spr\u3181(), arg1.cfr_renamed_1980(), arg1.spr\u3181());
    }

    @sprtea
    public sprtbo cfr_renamed_15257(sprsfo arg0, sprsfo arg1, sprsfo arg2) {
        return this.cfr_renamed_15728(arg0.cfr_renamed_1980(), arg0.spr\u3181(), arg1.cfr_renamed_1980(), arg1.spr\u3181(), arg2.cfr_renamed_1980(), arg2.spr\u3181());
    }

    @sprtea
    public sprtbo cfr_renamed_15738(double arg0, double arg1) {
        String[] stringArray = new String[5];
        stringArray[0] = sprabz.cfr_renamed_9("y");
        stringArray[1] = " ";
        stringArray[2] = sprmgo.cfr_renamed_15502(arg0);
        stringArray[3] = " ";
        stringArray[4] = sprmgo.cfr_renamed_15502(arg1);
        this.cfr_renamed_4.cfr_renamed_15729(stringArray);
        return this;
    }

    @sprtea
    public sprtbo cfr_renamed_15737(double arg0, double arg1, double arg2, int arg3, int arg4, double arg5, double arg6) {
        if (arg3 != 0 && arg3 != 1) {
            throw new NumberFormatException(sprshn.cfr_renamed_9("&\u001c8\u001a/]\u53a0\u63d8\u539d]z]\u625c]{"));
        }
        if (arg4 != 0 && arg4 != 1) {
            throw new NumberFormatException(sprabz.cfr_renamed_9("FjPxE=\u53df\u63b8\u53e2=\u0005=\u6223=\u0004"));
        }
        String[] stringArray = new String[15];
        stringArray[0] = sprshn.cfr_renamed_9("\u000b");
        stringArray[1] = " ";
        stringArray[2] = sprmgo.cfr_renamed_15502(arg0);
        stringArray[3] = " ";
        stringArray[4] = sprmgo.cfr_renamed_15502(arg1);
        stringArray[5] = " ";
        stringArray[6] = sprmgo.cfr_renamed_15502(arg2);
        stringArray[7] = " ";
        stringArray[8] = sprmgo.cfr_renamed_15502(arg3);
        stringArray[9] = " ";
        stringArray[10] = sprmgo.cfr_renamed_15502(arg4);
        stringArray[11] = " ";
        stringArray[12] = sprmgo.cfr_renamed_15502(arg5);
        stringArray[13] = " ";
        stringArray[14] = sprmgo.cfr_renamed_15502(arg6);
        this.cfr_renamed_4.cfr_renamed_15729(stringArray);
        return this;
    }

    @sprtea
    public sprtbo cfr_renamed_15744(double arg0, double arg1) {
        return this.cfr_renamed_15733(arg0, arg1);
    }
}

