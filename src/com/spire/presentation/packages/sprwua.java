/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprama;
import com.spire.presentation.packages.sprd;
import com.spire.presentation.packages.sprhpa;
import com.spire.presentation.packages.sprmva;
import com.spire.presentation.packages.sprrica;
import com.spire.presentation.packages.sprzofa;
import com.spire.presentation.packages.sprzra;
import java.security.SecureRandom;

public class sprwua
extends sprama
implements sprd {
    @Override
    public int cfr_renamed_84() {
        return this.cfr_renamed_1.length;
    }

    public sprwua(int[] arg0) {
        sprwua sprwua2 = this;
        super(arg0);
        sprwua2.cfr_renamed_785();
    }

    @Override
    public sprama cfr_renamed_728(sprama arg0, int arg1) {
        if (arg1 == 2048) {
            sprama sprama2 = (sprama)arg0.clone();
            sprama2.cfr_renamed_762(2048);
            return new sprmva(sprama2).cfr_renamed_739(this).cfr_renamed_131();
        }
        return super.cfr_renamed_728(arg0, arg1);
    }

    @Override
    public int[] cfr_renamed_724() {
        int n;
        int n2 = this.cfr_renamed_1.length;
        int[] nArray = new int[n2];
        int n3 = 0;
        int n4 = n = 0;
        while (n4 < n2) {
            if (this.cfr_renamed_1[n] == 1) {
                nArray[n3++] = n;
            }
            n4 = ++n;
        }
        return sprzra.cfr_renamed_541(nArray, n3);
    }

    public sprwua(sprama arg0) {
        this(arg0.cfr_renamed_1);
    }

    public static sprwua cfr_renamed_708(int arg0, int arg1, int arg2, SecureRandom arg3) {
        int[] nArray = sprhpa.cfr_renamed_706(arg0, arg1, arg2, arg3);
        return new sprwua(nArray);
    }

    public sprwua(int arg0) {
        sprwua sprwua2 = this;
        super(arg0);
        sprwua2.cfr_renamed_785();
    }

    public static sprwua cfr_renamed_786(int arg0, SecureRandom arg1) {
        int n;
        sprwua sprwua2 = new sprwua(arg0);
        int n2 = n = 0;
        while (n2 < arg0) {
            sprwua2.cfr_renamed_1[n++] = arg1.nextInt(3) - 1;
            n2 = n;
        }
        return sprwua2;
    }

    @Override
    public int[] cfr_renamed_185() {
        int n;
        int n2 = this.cfr_renamed_1.length;
        int[] nArray = new int[n2];
        int n3 = 0;
        int n4 = n = 0;
        while (n4 < n2) {
            if (this.cfr_renamed_1[n] == -1) {
                nArray[n3++] = n;
            }
            n4 = ++n;
        }
        return sprzra.cfr_renamed_541(nArray, n3);
    }

    private /* synthetic */ void cfr_renamed_785() {
        int n;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_1.length) {
            int n3 = this.cfr_renamed_1[n];
            if (n3 < -1 || n3 > 1) {
                throw new IllegalStateException(new StringBuilder().insert(0, sprrica.cfr_renamed_9("k1N8E<N}T<N(Gg\u0002")).append(n3).append(sprzofa.cfr_renamed_9("=R|\u0007b\u00061\u0010tR~\u001ctR~\u00141\t<C=R!^1Cl")).toString());
            }
            n2 = ++n;
        }
    }
}

