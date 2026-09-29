/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprquk;
import com.spire.presentation.packages.sprryk;
import com.spire.presentation.packages.sprvgp;
import com.spire.presentation.packages.sprwsk;
import com.spire.presentation.packages.sprxhj;

public class sprywk
implements sprbj {
    private sprquk cfr_renamed_2;
    private sprquk cfr_renamed_3;
    private sprryk cfr_renamed_4;

    public sprywk(sprquk arg0, sprquk arg1) {
        this(arg0, arg1, null);
    }

    public sprquk cfr_renamed_2094() {
        return this.cfr_renamed_3;
    }

    public sprryk cfr_renamed_2096() {
        return this.cfr_renamed_4;
    }

    public sprquk cfr_renamed_2095() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprywk(sprquk sprquk2, sprquk sprquk3, sprryk sprryk2) {
        sprywk sprywk2;
        sprryk arg2;
        void arg0;
        void arg1;
        if (sprquk2 == null) {
            throw new NullPointerException(sprvgp.cfr_renamed_9("\u0019\u001a\u000b\u001a\u0003\r:\u001c\u0003\u0018\u000b\u001a\u000f%\u000f\u0017J\r\u000b\u0000\u0004\u0001\u001eN\b\u000bJ\u0000\u001f\u0002\u0006"));
        }
        if (arg1 == null) {
            throw new NullPointerException(sprxhj.cfr_renamed_9("*\u0002'\u0017\"\u0017=\u0013#\"=\u001b9\u0013;\u0017\u0004\u00176R,\u0013!\u001c \u0006o\u0010*R!\u0007#\u001e"));
        }
        sprwsk sprwsk2 = arg0.cfr_renamed_284();
        if (!sprwsk2.equals(arg1.cfr_renamed_284())) {
            throw new IllegalArgumentException(sprvgp.cfr_renamed_9("\u001d\u001e\u000f\u001e\u0007\tN\u000b\u0000\u000eN\u000f\u001e\u0002\u000b\u0007\u000b\u0018\u000f\u0006N\u001a\u001c\u0003\u0018\u000b\u001a\u000fN\u0001\u000b\u0013\u001dJ\u0006\u000b\u0018\u000fN\u000e\u0007\f\b\u000f\u001c\u000f\u0000\u001eN\u000e\u0001\u0007\u000f\u0003\u0000J\u001e\u000b\u001c\u000b\u0003\u000f\u001a\u000f\u001c\u0019"));
        }
        if (arg2 == null) {
            arg2 = new sprryk(sprwsk2.cfr_renamed_1145().modPow(arg1.cfr_renamed_1980(), sprwsk2.cfr_renamed_1155()), sprwsk2);
            sprywk2 = this;
        } else {
            if (!sprwsk2.equals(arg2.cfr_renamed_284())) {
                throw new IllegalArgumentException(sprxhj.cfr_renamed_9("*\u0002'\u0017\"\u0017=\u0013#R?\u0007-\u001e&\u0011o\u0019*\u000bo\u001a.\u0001o\u0016&\u0014)\u0017=\u0017!\u0006o\u0016 \u001f.\u001b!R?\u0013=\u0013\"\u0017;\u0017=\u0001"));
            }
            sprywk2 = this;
        }
        sprywk2.cfr_renamed_2 = arg0;
        sprywk sprywk3 = this;
        sprywk3.cfr_renamed_3 = arg1;
        sprywk3.cfr_renamed_4 = arg2;
    }
}

