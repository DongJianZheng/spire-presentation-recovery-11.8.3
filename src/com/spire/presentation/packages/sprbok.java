/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbmk;
import com.spire.presentation.packages.sprenk;
import com.spire.presentation.packages.sprlmk;
import com.spire.presentation.packages.sprqik;
import com.spire.presentation.packages.sprqok;
import com.spire.presentation.packages.sprux;
import com.spire.presentation.packages.sprvok;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class sprbok
extends sprlmk {
    public static sprenk cfr_renamed_9695(int arg0, long arg1, sprvok arg2, int arg3, sprqik arg4, sprux arg5) throws IOException {
        int n;
        sprbok.cfr_renamed_9662(arg0, arg1, arg4, arg5);
        sprqik sprqik2 = arg4;
        int n2 = sprqik2.cfr_renamed_9656();
        long l = sprqik2.cfr_renamed_9655();
        long l2 = sprqik2.cfr_renamed_9655();
        int n3 = sprqik2.cfr_renamed_9656();
        int n4 = sprqik2.cfr_renamed_9656();
        ArrayList<sprqok> arrayList = new ArrayList<sprqok>();
        int n5 = n = n3 - 1;
        while (n5 >= 0) {
            arrayList.add(sprqok.cfr_renamed_9663(arg4, n4, arg0));
            n5 = --n;
        }
        sprqik sprqik3 = arg4;
        n = sprqik3.cfr_renamed_9656();
        byte[] byArray = sprqik3.cfr_renamed_9664(n);
        int n6 = sprqik3.cfr_renamed_9656();
        sprqik3.cfr_renamed_9656();
        ArrayList<sprbmk> arrayList2 = new ArrayList<sprbmk>();
        int n7 = n6 - 1;
        int n8 = n7;
        while (n8 >= 0) {
            arrayList2.add(sprbmk.cfr_renamed_6501(arg4, arg0));
            n8 = --n7;
        }
        sprqik sprqik4 = arg4;
        n7 = sprqik4.cfr_renamed_9656();
        sprqik4.cfr_renamed_9656();
        ArrayList<Long> arrayList3 = new ArrayList<Long>();
        int n9 = n7 - 1;
        int n10 = n9;
        while (n10 >= 0) {
            arrayList3.add(arg4.cfr_renamed_9655());
            n10 = --n9;
        }
        sprqik sprqik5 = arg4;
        n9 = sprqik5.cfr_renamed_9657();
        int n11 = sprqik5.cfr_renamed_9657();
        sprqik5.cfr_renamed_9656();
        sprqik sprqik6 = arg4;
        long l3 = sprqik6.cfr_renamed_9655();
        long l4 = sprqik6.cfr_renamed_9655();
        long l5 = sprqik6.cfr_renamed_9655();
        byte[] byArray2 = sprqik6.cfr_renamed_9664((int)sprqik6.cfr_renamed_9655());
        byte[] byArray3 = sprqik6.cfr_renamed_9658((int)((long)arg0 + l), (int)((long)arg0 + l + l2));
        byte[] byArray4 = sprqik6.cfr_renamed_9664((int)(arg1 - (long)(arg4.cfr_renamed_9666() - arg0) - 20L));
        byte[] byArray5 = sprqik6.cfr_renamed_9658((int)((long)arg0 + arg1 - 20L), (int)((long)arg0 + arg1));
        sprqik5.cfr_renamed_9667(byArray5.length);
        return new sprbok(arg0, arg1, arg2, arg3, n2, n3, arrayList, byArray, n6, arrayList2, n7, arrayList3, n9, n11, l3, l4, l5, byArray3, byArray2, byArray5);
    }

    public byte[] cfr_renamed_9696() {
        return this.cfr_renamed_9287();
    }

    private /* synthetic */ sprbok(int arg0, long arg1, sprvok arg2, int arg3, int arg4, int arg5, List<sprqok> arg6, byte[] arg7, int arg8, List<sprbmk> arg9, int arg10, List<Long> arg11, int arg12, int arg13, long arg14, long arg15, long arg16, byte[] arg17, byte[] arg18, byte[] arg19) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
    }
}

