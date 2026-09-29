/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbhk;
import com.spire.presentation.packages.sprcoa;
import com.spire.presentation.packages.sprenk;
import com.spire.presentation.packages.sprlmk;
import com.spire.presentation.packages.sprqik;
import com.spire.presentation.packages.sprrk;
import com.spire.presentation.packages.sprux;
import com.spire.presentation.packages.sprvok;
import com.spire.presentation.packages.sprxbc;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sprlik {
    private final sprbhk cfr_renamed_3;
    private final List<sprlmk> cfr_renamed_4;

    public List<sprlmk> cfr_renamed_9672() {
        return this.cfr_renamed_4;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (2 << 2 ^ 3);
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 1;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ 5 << 1;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public sprlik(InputStream arg0, sprrk arg1, sprux arg2) throws IOException {
        this(sprqik.cfr_renamed_9654(arg0), arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprlik(sprqik sprqik2, sprrk sprrk2, sprux sprux2) throws IOException {
        void arg0;
        sprenk sprenk2;
        void arg2;
        void arg1;
        sprenk sprenk3 = sprenk.cfr_renamed_9673(sprqik2, (sprrk)arg1, (sprux)arg2);
        if (sprenk3 == null) {
            throw new IOException(sprcoa.cfr_renamed_9("2\u0012\\\u001b\u0015\u000f\u000f\t\\\u001f\u0010\u0012\u001eQ\\\u0014\u000f]\b\u0015\u0019]\u000f\u0012\t\u000f\u001f\u0018\\\u0007\u0019\u000f\u0013]\u0010\u0018\u0012\u001a\b\u0015C"));
        }
        if (!(sprenk3 instanceof sprbhk)) {
            throw new IOException(sprxbc.cfr_renamed_9("+'\u001f=\u0019n\u000f\"\u0002,M'\u001en\u0003!\u0019n&+\u0014\f\u00026Mi+'\u001f=\u0019n/\"\u0002,J`"));
        }
        sprbhk sprbhk2 = (sprbhk)sprenk3;
        ArrayList<sprlmk> arrayList = new ArrayList<sprlmk>();
        sprenk sprenk4 = sprenk2 = sprenk.cfr_renamed_9673(arg0, (sprrk)arg1, (sprux)arg2);
        while (sprenk4 != null) {
            if (sprenk2.cfr_renamed_324() == sprvok.cfr_renamed_0) {
                throw new IOException(sprcoa.cfr_renamed_9(")\u0013\u0019\u0005\f\u0018\u001f\t\u0019\u0019\\\u000e\u0019\u001e\u0013\u0013\u0018][;\u0015\u000f\u000f\t>\u0011\u0013\u001f[Q\\\t\u0014\u0018\u000e\u0018\\\u000e\u0014\u0012\t\u0011\u0018]\u0013\u0013\u0010\u0004\\\u001f\u0019]\u0013\u0013\u0019]:\u0014\u000e\u000e\b?\u0010\u0012\u001e]\u001d\t\\\t\u0014\u0018\\\u000e\b\u001c\u000e\t\\\u0012\u001a]\b\u0015\u0019]\u001a\u0014\u0010\u0018R"));
            }
            arrayList.add((sprlmk)sprenk2);
            sprenk2 = sprenk.cfr_renamed_9673(arg0, (sprrk)arg1, (sprux)arg2);
            sprenk4 = sprenk2;
        }
        this.cfr_renamed_3 = sprbhk2;
        this.cfr_renamed_4 = Collections.unmodifiableList(arrayList);
    }

    public sprbhk cfr_renamed_9674() {
        return this.cfr_renamed_3;
    }

    public sprlik(byte[] arg0, sprrk arg1, sprux arg2) throws IOException {
        this(sprqik.cfr_renamed_9654(arg0), arg1, arg2);
    }
}

